# IntimacoesApi

Todas as URIs são relativas a *https://app.intima.ai/api*

Metodo | Requisição HTTP | Descrição
------------- | ------------- | -------------
[**getAllIntimacoes**](IntimacoesApi.md#getAllIntimacoes) | **GET** /intimacoes | Visualiza todas as intimações capturadas

<a name="getAllIntimacoes"></a>
# **getAllIntimacoes**
> getAllIntimacoes()

Visualiza todas as intimações capturadas

### Exemplo
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IntimacoesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth (api_token)
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");

IntimacoesApi apiInstance = new IntimacoesApi();
try {
    apiInstance.getAllIntimacoes();
} catch (ApiException e) {
    System.err.println("Exception when calling IntimacoesApi#getAllIntimacoes");
    e.printStackTrace();
}
```

### Parametros
Este endpoint não pussui parametros.

### Tipo de retorno

ApiResponse\<Response>

### Autorização

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP headers

 - **Content-Type**: application/json
 - **Accept**: application/json

