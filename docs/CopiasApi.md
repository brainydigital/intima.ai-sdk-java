# CopiasApi

Todas as URIs são relativas a *https://app.intima.ai/api*

Metodo | Requisição HTTP | Descrição
------------- | ------------- | -------------
[**createProcessCopy**](CopiasApi.md#createProcessCopy) | **POST** /actions/processos/copy/{pje_auth_id} | Realiza uma nova cópia processual

<a name="createProcessCopy"></a>
# **createProcessCopy**
> createProcessCopy(processo, pjeAuthId)

Realiza uma nova cópia processual

### Exemplo
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CopiasApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth (api_token)
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");

CopiasApi apiInstance = new CopiasApi();
String processo = "processo_example"; // String | 
Integer pjeAuthId = 56; // Integer | é o id referente ao tribunal cadastrado em \"Tribunais ativos\" no Intima.ai
try {
    apiInstance.createProcessCopy(processo, pjeAuthId);
} catch (ApiException e) {
    System.err.println("Exception when calling CopiasApi#createProcessCopy");
    e.printStackTrace();
}
```

### Parametros

Nome | Tipo | Descrição | Notas
------------- | ------------- | ------------- | -------------
 **processo** | **String**| é o numero do processo no qual se deseja realizar a cópia processual | [obrigatório]
 **pjeAuthId** | **Integer**| é o id referente ao tribunal cadastrado em \&quot;Tribunais ativos\&quot; no Intima.ai | [obrigatório]

### Tipo de retorno

ApiResponse\<Response>

### Autorização

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

