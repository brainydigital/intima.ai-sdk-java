# EscutasApi

Todas as URIs são relativas a *https://app.intima.ai/api*

Metodo | Requisição HTTP | Descrição
------------- | ------------- | -------------
[**createProcessEscuta**](EscutasApi.md#createProcessEscuta) | **POST** /actions/process-docs/{pje_auth_id} | Realiza uma nova escuta processual

<a name="createProcessEscuta"></a>
# **createProcessEscuta**
> createProcessEscuta(processo, pjeAuthId)

Realiza uma nova escuta processual

### Exemplo
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EscutasApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth (api_token)
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");

EscutasApi apiInstance = new EscutasApi();
String processo = "processo_example"; // String | 
Integer pjeAuthId = 56; // Integer | é o id referente ao tribunal cadastrado em \"Tribunais ativos\" no Intima.ai
try {
    apiInstance.createProcessEscuta(processo, pjeAuthId);
} catch (ApiException e) {
    System.err.println("Exception when calling EscutasApi#createProcessEscuta");
    e.printStackTrace();
}
```

### Parametros

Nome | Tipo | Descrição | Notas
------------- | ------------- | ------------- | -------------
 **processo** | **String**| é o numero do processo no qual se deseja realizar a escuta processual | [obrigatório]
 **pjeAuthId** | **Integer**| é o id referente ao tribunal cadastrado em \&quot;Tribunais ativos\&quot; no Intima.ai | [obrigatório]

### Tipo de retorno

ApiResponse\<Response>

### Autorização

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

