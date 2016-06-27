xy-inc-zup
============

Essa aplicação para busca de CEPs que fornece dois serviços: 

enderecoPorCep: É informado o CEP e retorna o endereço correspondente.
cepPorEndereco: São fornecidas informações da UF, Cidade e Logradouro, e retorna uma lista com os possíveis CEPs

A busca por CEP é realizada através do ViaCep que fornece serviços gratuitos e de alto desempenho para consultar Códigos de Endereçamento Postal (CEP) do Brasil.

Arquitetura
=============

O sistema foi desenvolvido com Java 8 e o framework Spring Boot. 

As dependências e build da aplicação são gerenciadas pelo Gradle.

Execução
==================

Para executar a aplicação basta executar o jar

```xml

java -jar xy-zup-rest

```   

Configuração
========

O Arquivo application.properties contém as configurações da aplicação para facilitar a alteração.
* Porta
* Url do WS
* Formato de retorno


```xml

server.port: 9000
urlViaCep.buscarEndereco=http://www.viacep.com.br/ws/
urlViaCep.formato=/json

```   

Serviços
=========

Os serviços disponíveis encontram-se nos endereços:

```xml

http://localhost:9000/enderecoPorCep?cep=22631-390

```   
e

```xml

http://localhost:9000/cepPorEndereco?uf=SP&cidade=Araraquara&logradouro=Sao%20Jose

```   
