# AcoesApi

All URIs are relative to *https://app.intima.ai/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getActionStatus**](AcoesApi.md#getActionStatus) | **GET** /actions/status/{pje_action_id} | Checa o resultado de uma ação

<a name="getActionStatus"></a>
# **getActionStatus**
> getActionStatus(pjeActionId)

Checa o resultado de uma ação

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AcoesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AcoesApi apiInstance = new AcoesApi();
Integer pjeActionId = 56; // Integer | é fornecido após se realizar a requisição de qualquer ação para o Intima.ai
try {
    apiInstance.getActionStatus(pjeActionId);
} catch (ApiException e) {
    System.err.println("Exception when calling AcoesApi#getActionStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pjeActionId** | **Integer**| é fornecido após se realizar a requisição de qualquer ação para o Intima.ai |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

