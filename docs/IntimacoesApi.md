# IntimacoesApi

All URIs are relative to *https://app.intima.ai/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllIntimacoes**](IntimacoesApi.md#getAllIntimacoes) | **GET** /intimacoes | Visualiza todas as intimações capturadas

<a name="getAllIntimacoes"></a>
# **getAllIntimacoes**
> getAllIntimacoes()

Visualiza todas as intimações capturadas

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IntimacoesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

IntimacoesApi apiInstance = new IntimacoesApi();
try {
    apiInstance.getAllIntimacoes();
} catch (ApiException e) {
    System.err.println("Exception when calling IntimacoesApi#getAllIntimacoes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

