# EscutasApi

All URIs are relative to *https://app.intima.ai/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProcessEscuta**](EscutasApi.md#createProcessEscuta) | **POST** /actions/process-docs/{pje_auth_id} | Realiza uma nova escuta processual

<a name="createProcessEscuta"></a>
# **createProcessEscuta**
> createProcessEscuta(processo, pjeAuthId)

Realiza uma nova escuta processual

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EscutasApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

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

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processo** | **String**|  |
 **pjeAuthId** | **Integer**| é o id referente ao tribunal cadastrado em \&quot;Tribunais ativos\&quot; no Intima.ai |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

