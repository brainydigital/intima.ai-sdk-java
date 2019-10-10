# Intima.ai - SDK JAVA

Bem vindo a documentação da API do [Intima.ai](https://app.intima.ai). Está documentação cobre todas as ações disponíveis dentro do Intima.ai e as disponibilizam como `ENDPOINTS` que podem ser integrados e utilizados por outros serviços ou aplicações, bastando somente possuir o `Token de acesso da API`.

- Versão da API: 1.0.0

## Requerimentos

Para realizar o build é necessario:
1. Java 1.7+
2. Maven/Gradle

## Instalação

### Maven

Adicione esta dependência no POM do seu projeto:

```xml
<dependency>
  <groupId>brainydigital</groupId>
  <artifactId>intimai-sdk-java</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

e simplesmente execute:

```shell
mvn clean install
```

### Gradle

Adicione esta dependência no build file do seu projeto:

```groovy
compile "brainydigital:intimai-sdk-java:1.0.0"
```

### Instalação manual

Primeiramente gere o JAR com o seguinte comando:

```shell
mvn clean package
```

Então instale manualmente os seguintes JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Começando

Após seguir a [instalação](#installation):

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AcoesApi;

import java.util.*;

public class AcoesApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: ApiKeyAuth (api_token)
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");

        AcoesApi apiInstance = new AcoesApi();
        Integer pjeActionId = 56; // Integer | é fornecido após se realizar a requisição de qualquer ação para o Intima.ai
        try {
            ApiResponse<Response> result = apiInstance.getActionStatus(pjeActionId);
        } catch (ApiException e) {
            System.err.println("Exception when calling AcoesApi#getActionStatus");
            e.printStackTrace();
        }
    }
}
```

## Documentação para os Endpoints da API

Todas as URIs são relativas a *https://app.intima.ai/api*

Classe | Metodo | Requisição HTTP | Descrição
------------ | ------------- | ------------- | -------------
*AcoesApi* | [**getActionStatus**](docs/AcoesApi.md#getActionStatus) | **GET** /actions/status/{pje_action_id} | Checa o resultado de uma ação
*CopiasApi* | [**createProcessCopy**](docs/CopiasApi.md#createProcessCopy) | **POST** /actions/processos/copy/{pje_auth_id} | Realiza uma nova cópia processual
*EscutasApi* | [**createProcessEscuta**](docs/EscutasApi.md#createProcessEscuta) | **POST** /actions/process-docs/{pje_auth_id} | Realiza uma nova escuta processual
*IntimacoesApi* | [**getAllIntimacoes**](docs/IntimacoesApi.md#getAllIntimacoes) | **GET** /intimacoes | Visualiza todas as intimações capturadas
*ProtocolosApi* | [**createProcessProtocolo**](docs/ProtocolosApi.md#createProcessProtocolo) | **POST** /actions/process-protocol/{pje_auth_id} | Realiza um novo protocolo

## Documentação para os Models

 - [Documento](docs/Documento.md)

## Documentação para Autenticação

### ApiKeyAuth

- **Tipo**: API Key
- **Parametro da API**: api_token
- **Localização**: URL query string


## Recomendações

É recomendado criar uma instância de `ApiClient` por thread em um ambiente multithread, para evitar potênciais problemas.

