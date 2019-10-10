# ProtocolosApi

Todas as URIs são relativas a *https://app.intima.ai/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProcessProtocolo**](ProtocolosApi.md#createProcessProtocolo) | **POST** /actions/process-protocol/{pje_auth_id} | Realiza um novo protocolo

<a name="createProcessProtocolo"></a>
# **createProcessProtocolo**
> createProcessProtocolo(numeroProcesso, tipoDocumentoMensagemGeral, documentos, pjeAuthId, mensagem_geral, descricao)

Realiza um novo protocolo

### Exemplo
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth (api_token)
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");

ProtocolosApi apiInstance = new ProtocolosApi();
String numeroProcesso = "numeroProcesso_example"; // String | 
Integer tipoDocumentoMensagemGeral = 56; // Integer | 
List<Documento> documentos = Arrays.asList(new Documento()); // List<Documento> | 
Integer pjeAuthId = 56; // Integer | é o id referente ao tribunal cadastrado em \"Tribunais ativos\" no Intima.ai
try {
    apiInstance.createProcessProtocolo(numeroProcesso, tipoDocumentoMensagemGeral, documentos, pjeAuthId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolosApi#createProcessProtocolo");
    e.printStackTrace();
}
```

### Parametros

Nome | Tipo | Descrição | Notas
------------- | ------------- | ------------- | -------------
 **numeroProcesso** | **String**| é o numero do processo no qual se deseja realizar a protocolo processual | [obrigatório]
 **tipoDocumentoMensagemGeral** | **Integer**| é o id referente ao tipo de documento da mensagem geral | [obrigatório]
 **documentos** | [**List&lt;Documento&gt;**](Documento.md)| são os anexos relacionados ao protocolo | [obrigatório]
 **pjeAuthId** | **Integer**| é o id referente ao tribunal cadastrado em \&quot;Tribunais ativos\&quot; no Intima.ai | [obrigatório]

### Tipo de retorno

ApiResponse\<Response>

### Autorização

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

