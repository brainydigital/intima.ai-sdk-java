package io.swagger.client.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Extra {

    @SerializedName("numero_processo") 
    String numero_processo;
    @SerializedName("mensagem_geral") 
    String mensagem_geral;
    @SerializedName("tipo_documento_mensagem_geral")
    int tipo_documento_mensagem_geral;
    @SerializedName("tipo_documento_mensagem_geral_text_value") 
    String tipo_documento_mensagem_geral_text_value;
    @SerializedName("descricao") 
    String descricao;
    @SerializedName("protocolo_id") 
    int protocolo_id;
    @SerializedName("documentos") 
    List<DocumentoProtocolo> documentos;

    public String getNumero_processo() {
        return numero_processo;
    }

    public void setNumero_processo(String numero_processo) {
        this.numero_processo = numero_processo;
    }

    public String getMensagem_geral() {
        return mensagem_geral;
    }

    public void setMensagem_geral(String mensagem_geral) {
        this.mensagem_geral = mensagem_geral;
    }

    public int getTipo_documento_mensagem_geral() {
        return tipo_documento_mensagem_geral;
    }

    public void setTipo_documento_mensagem_geral(int tipo_documento_mensagem_geral) {
        this.tipo_documento_mensagem_geral = tipo_documento_mensagem_geral;
    }

    public String getTipo_documento_mensagem_geral_text_value() {
        return tipo_documento_mensagem_geral_text_value;
    }

    public void setTipo_documento_mensagem_geral_text_value(String tipo_documento_mensagem_geral_text_value) {
        this.tipo_documento_mensagem_geral_text_value = tipo_documento_mensagem_geral_text_value;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getProtocolo_id() {
        return protocolo_id;
    }

    public void setProtocolo_id(int protocolo_id) {
        this.protocolo_id = protocolo_id;
    }

    public List<DocumentoProtocolo> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(List<DocumentoProtocolo> documentos) {
        this.documentos = documentos;
    }
}