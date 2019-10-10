# AcoesApi

Todas as URIs são relativas a *https://app.intima.ai/api*

Metodo | Requisição HTTP | Descrição
------------- | ------------- | -------------
[**getActionStatus**](AcoesApi.md#getActionStatus) | **GET** /actions/status/{pje_action_id} | Checa o resultado de uma ação

<a name="getActionStatus"></a>
# **getActionStatus**
> getActionStatus(pjeActionId)

Checa o resultado de uma ação

### Exemplo
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AcoesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth (api_token)
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");

AcoesApi apiInstance = new AcoesApi();
Integer pjeActionId = 56; // Integer | é fornecido após se realizar a requisição de qualquer ação para o Intima.ai
try {
    apiInstance.getActionStatus(pjeActionId);
} catch (ApiException e) {
    System.err.println("Exception when calling AcoesApi#getActionStatus");
    e.printStackTrace();
}
```

### Parametros

Nome | Tipo | Descrição | Notas
------------- | ------------- | ------------- | -------------
 **pjeActionId** | **Integer**| é fornecido após se realizar a requisição de qualquer ação para o Intima.ai | [obrigatório]

### Tipo de retorno

ApiResponse\<Response>

### Autorização

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP headers

 - **Content-Type**: application/json
 - **Accept**: application/json

