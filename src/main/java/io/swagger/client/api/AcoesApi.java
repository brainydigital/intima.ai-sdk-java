/*
 * Intima.ai - API
 * Bem vindo a documentação da API do [Intima.ai](https://app.intima.ai). Está documentação cobre todas as ações disponíveis dentro do Intima.ai e as disponibilizam como `ENDPOINTS` que podem ser integrados e utilizados por outros serviços ou aplicações, bastando somente possuir o `Token de acesso da API`.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;
import io.swagger.client.model.Response;
import io.swagger.client.model.ResponseDefault;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;



import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AcoesApi extends Api {
    private ApiClient apiClient;

    public AcoesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AcoesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getActionStatus
     * @param pjeActionId é fornecido após se realizar a requisição de qualquer ação para o Intima.ai (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getActionStatusCall(Integer pjeActionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/actions/status/{pje_action_id}"
            .replaceAll("\\{" + "pje_action_id" + "\\}", apiClient.escapeString(pjeActionId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getActionStatusValidateBeforeCall(Integer pjeActionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'pjeActionId' is set
        if (pjeActionId == null) {
            throw new ApiException("Missing the required parameter 'pjeActionId' when calling getActionStatus(Async)");
        }
        
        com.squareup.okhttp.Call call = getActionStatusCall(pjeActionId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Checa o resultado de uma ação
     * 
     * @param pjeActionId é fornecido após se realizar a requisição de qualquer ação para o Intima.ai (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Response> getActionStatus(Integer pjeActionId) throws ApiException {
        return getActionStatusWithHttpInfo(pjeActionId);
    }

    /**
     * Checa o resultado de uma ação
     * 
     * @param pjeActionId é fornecido após se realizar a requisição de qualquer ação para o Intima.ai (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Response> getActionStatusWithHttpInfo(Integer pjeActionId) throws ApiException {
        com.squareup.okhttp.Call call = getActionStatusValidateBeforeCall(pjeActionId, null, null);
        return apiClient.execute(call, ResponseDefault.class);
    }

    /**
     * Checa o resultado de uma ação (asynchronously)
     * 
     * @param pjeActionId é fornecido após se realizar a requisição de qualquer ação para o Intima.ai (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getActionStatusAsync(Integer pjeActionId, final ApiCallback<Response> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getActionStatusValidateBeforeCall(pjeActionId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, Response.class, callback);
        return call;
    }
}
