# ProtocolosApi

All URIs are relative to *https://app.intima.ai/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProcessProtocolo**](ProtocolosApi.md#createProcessProtocolo) | **POST** /actions/process-protocol/{pje_auth_id} | Realiza um novo protocolo

<a name="createProcessProtocolo"></a>
# **createProcessProtocolo**
> createProcessProtocolo(numeroProcesso, tipoDocumentoMensagemGeral, documentos, pjeAuthId)

Realiza um novo protocolo

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

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

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **numeroProcesso** | **String**|  |
 **tipoDocumentoMensagemGeral** | **Integer**|  |
 **documentos** | [**List&lt;Documento&gt;**](Documento.md)|  |
 **pjeAuthId** | **Integer**| é o id referente ao tribunal cadastrado em \&quot;Tribunais ativos\&quot; no Intima.ai |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

