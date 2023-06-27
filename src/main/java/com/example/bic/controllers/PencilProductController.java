package com.example.bic.controllers;

import com.example.bic.dtos.PencilProductRecordDto;
import com.example.bic.models.PencilProductModel;
import com.example.bic.repositories.PencilProductRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

@RestController
public class PencilProductController {

    @Autowired
    PencilProductRepository pencilProductRepository;

    @PostMapping("/save")
    public ResponseEntity<PencilProductModel> save(@RequestBody @Valid PencilProductRecordDto pencilProductRecordDto) {
        var pencilProductModel = new PencilProductModel();
        BeanUtils.copyProperties(pencilProductRecordDto, pencilProductModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(pencilProductRepository.save(pencilProductModel));
    }

    @GetMapping("/getall")
    public ResponseEntity<List<PencilProductModel>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(pencilProductRepository.findAll());
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Object> getById(@PathVariable(value = "id") UUID id) {
        Optional<PencilProductModel> product = pencilProductRepository.findById(id);
        if (product.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado");
        }

        return ResponseEntity.status(HttpStatus.OK).body(product.get());
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Object> udpate(@PathVariable(value = "id") UUID id,
                                         @RequestBody @Valid PencilProductRecordDto pencilProductRecordDto) {
        Optional<PencilProductModel> product = pencilProductRepository.findById(id);
        if (product.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado");
        }

        var pencilProductModel = product.get();
        BeanUtils.copyProperties(pencilProductRecordDto, pencilProductModel);
        return ResponseEntity.status(HttpStatus.OK).body(pencilProductRepository.save(pencilProductModel));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Object> delete(@PathVariable(value = "id") UUID id) {
        Optional<PencilProductModel> product = pencilProductRepository.findById(id);
        if (product.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado");
        }

        pencilProductRepository.delete(product.get());
        return ResponseEntity.status(HttpStatus.OK).body("Produto deletado com sucesso.");
    }
}
