# Projeto SpringBoot 3
Este é um projeto básico em SpringBoot 3 que utiliza as seguintes dependências:

[Maven:](https://maven.apache.org/) - Ferramenta de gerenciamento de dependências e build. <br>
[MySQL:](https://www.mysql.com/) - Banco de dados relacional. <br>
[Spring Web:](https://spring.io/projects/spring-ws) - Framework para desenvolvimento web. <br>
[Spring Data JPA:](https://spring.io/projects/spring-data-jpa) - Implementação do JPA (Java Persistence API) para persistência de dados.

## Requisitos
Certifique-se de ter os seguintes requisitos instalados em sua máquina de desenvolvimento:

Java Development Kit (JDK) 8 ou superior
Maven

## Configuração
Siga as etapas abaixo para configurar e executar o projeto em sua máquina:

1- Clone este repositório para o seu ambiente local:
```
git clone https://github.com/seu-usuario/seu-projeto.git
```
2- Navegue até o diretório do projeto:
```
cd seu-projeto
```
3- Abra o arquivo application.properties no diretório src/main/resources e configure as propriedades de conexão com o banco de dados MySQL:
properties
```
spring.datasource.url=jdbc:mysql://localhost:3306/nome_do_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
```
4- Execute o comando Maven para compilar e empacotar o projeto:
```
mvn clean package
```
5- Após a conclusão do empacotamento, execute o comando abaixo para iniciar o aplicativo SpringBoot:
```
java -jar target/nome_do_projeto.jar
```
O aplicativo será iniciado e estará disponível no seguinte endereço: [http://localhost:8080](http://localhost:8080)

## Utilização
Você pode usar ferramentas como o Postman para testar as APIs disponíveis neste projeto.

## Contribuição
Se você quiser contribuir com este projeto, fique à vontade para abrir um issue ou enviar um pull request.
