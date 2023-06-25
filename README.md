# Projeto Spring CRUD - News

Este é um projeto de exemplo do Spring MVC que implementa operações CRUD (Create, Read, Update, Delete) para a entidade News. O objetivo deste projeto é demonstrar como criar um aplicativo web usando o Spring Framework para realizar operações básicas em um banco de dados.

## Requisitos

Certifique-se de ter as seguintes tecnologias instaladas em sua máquina:

* Java Development Kit (JDK) 11 ou superior
* Maven
* Banco de dados PostgreSQL (ou outro banco de dados de sua preferência)

## Configuração do Banco de Dados

Antes de executar o projeto, você precisa configurar o banco de dados. Siga as etapas abaixo:

1. Crie um banco de dados vazio no PostgreSQL 

2. Abra o arquivo application.properties localizado no diretório src/main/resources.

3. Modifique as configurações do banco de dados conforme necessário. Por exemplo:

```
spring.datasource.url=jdbc:postgresql://localhost:5432/nome_do_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
```

Certifique-se de substituir localhost, nome_do_banco, seu_usuario e sua_senha pelos valores corretos de acordo com a configuração do seu banco de dados.

*Obs.: tem um arquivo docker-compose.yaml no projeto que você pode utilizar para criação do seu banco de dados.* 

## Executando o Projeto

Para executar o projeto, siga as etapas abaixo:

1. Abra o terminal ou prompt de comando e navegue até o diretório raiz do projeto.

2. Execute o seguinte comando para compilar o projeto:

```
mvn clean install
```
3. Após a conclusão da compilação, execute o seguinte comando para iniciar o aplicativo:

```
mvn spring-boot:run
```

4. O aplicativo será iniciado e estará acessível em http://localhost:8080/api/v1/news. Você pode usar uma ferramenta como o Postman ou o navegador para testar as operações CRUD disponíveis para a entidade News.

## Endpoints Disponíveis 

O aplicativo fornece os seguintes endpoints para realizar operações CRUD na entidade `News`:

* GET api/v1/news: Recupera todas as notícias.
* GET api/v1/news/{id}: Recupera uma notícia específica com base no ID.
* POST api/v1/news: Cria uma nova notícia.
* PUT api/v1/news/{id}: Atualiza uma notícia existente com base no ID.
* DELETE api/v1/news/{id}: Exclui uma notícia existente com base no ID.
Certifique-se de substituir {id} pelos valores apropriados ao realizar operações de leitura, atualização e exclusão.








