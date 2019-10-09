package io.swagger.client.model;

import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("id")
    int id;
    @SerializedName("pje")
    String pje;
    @SerializedName("nome")
    String nome;
    @SerializedName("numero_processo")
    String numero_processo;
    @SerializedName("user_id")
    int user_id;
    @SerializedName("pje_action_id")
    int pje_action_id;
    @SerializedName("pje_protocolo_id")
    int pje_protocolo_id;
    @SerializedName("tipo_documento")
    int tipo_documento;
    @SerializedName("tipo_documento_text_value")
    String tipo_documento_text_value;
    @SerializedName("descricao_documento")
    String descricao_documento;
    @SerializedName("local_path")
    String local_path;
    @SerializedName("document_size")
    int document_size;
    @SerializedName("mime_type")
    String mime_type;
    @SerializedName("created_at")
    String created_at;
    @SerializedName("updated_at")
    String updated_at;
    @SerializedName("deleted_at")
    String deleted_at;
    @SerializedName("extra")
    String extra;
    @SerializedName("uuidLink")
    String uuidLink;

    
    @SerializedName("tipo")
    String tipo;
    @SerializedName("assunto")
    String assunto;
    @SerializedName("pje_doc_id")
    String pje_doc_id;
    @SerializedName("pje_processo_id")
    String pje_processo_id;
    @SerializedName("consultado_em")
    String consultado_em;
    @SerializedName("documento_content")
    String documento_content;
    @SerializedName("revised_at")
    String revised_at;
    @SerializedName("vara")
    String vara;
    @SerializedName("data_chegada")
    String data_chegada;
    @SerializedName("partes")
    String partes;
    @SerializedName("data_ciencia")
    String data_ciencia;
    @SerializedName("prazo_final")
    String prazo_final;
    @SerializedName("formatted_document_content")
    String formatted_document_content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPje() {
        return pje;
    }

    public void setPje(String pje) {
        this.pje = pje;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero_processo() {
        return numero_processo;
    }

    public void setNumero_processo(String numero_processo) {
        this.numero_processo = numero_processo;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getPje_action_id() {
        return pje_action_id;
    }

    public void setPje_action_id(int pje_action_id) {
        this.pje_action_id = pje_action_id;
    }

    public int getPje_protocolo_id() {
        return pje_protocolo_id;
    }

    public void setPje_protocolo_id(int pje_protocolo_id) {
        this.pje_protocolo_id = pje_protocolo_id;
    }

    public int getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(int tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getTipo_documento_text_value() {
        return tipo_documento_text_value;
    }

    public void setTipo_documento_text_value(String tipo_documento_text_value) {
        this.tipo_documento_text_value = tipo_documento_text_value;
    }

    public String getDescricao_documento() {
        return descricao_documento;
    }

    public void setDescricao_documento(String descricao_documento) {
        this.descricao_documento = descricao_documento;
    }

    public String getLocal_path() {
        return local_path;
    }

    public void setLocal_path(String local_path) {
        this.local_path = local_path;
    }

    public int getDocument_size() {
        return document_size;
    }

    public void setDocument_size(int document_size) {
        this.document_size = document_size;
    }

    public String getMime_type() {
        return mime_type;
    }

    public void setMime_type(String mime_type) {
        this.mime_type = mime_type;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getDeleted_at() {
        return deleted_at;
    }

    public void setDeleted_at(String deleted_at) {
        this.deleted_at = deleted_at;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getUuidLink() {
        return uuidLink;
    }

    public void setUuidLink(String uuidLink) {
        this.uuidLink = uuidLink;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getPje_doc_id() {
        return pje_doc_id;
    }

    public void setPje_doc_id(String pje_doc_id) {
        this.pje_doc_id = pje_doc_id;
    }

    public String getPje_processo_id() {
        return pje_processo_id;
    }

    public void setPje_processo_id(String pje_processo_id) {
        this.pje_processo_id = pje_processo_id;
    }

    public String getConsultado_em() {
        return consultado_em;
    }

    public void setConsultado_em(String consultado_em) {
        this.consultado_em = consultado_em;
    }

    public String getDocumento_content() {
        return documento_content;
    }

    public void setDocumento_content(String documento_content) {
        this.documento_content = documento_content;
    }

    public String getRevised_at() {
        return revised_at;
    }

    public void setRevised_at(String revised_at) {
        this.revised_at = revised_at;
    }

    public String getVara() {
        return vara;
    }

    public void setVara(String vara) {
        this.vara = vara;
    }

    public String getData_chegada() {
        return data_chegada;
    }

    public void setData_chegada(String data_chegada) {
        this.data_chegada = data_chegada;
    }

    public String getPartes() {
        return partes;
    }

    public void setPartes(String partes) {
        this.partes = partes;
    }

    public String getData_ciencia() {
        return data_ciencia;
    }

    public void setData_ciencia(String data_ciencia) {
        this.data_ciencia = data_ciencia;
    }

    public String getPrazo_final() {
        return prazo_final;
    }

    public void setPrazo_final(String prazo_final) {
        this.prazo_final = prazo_final;
    }

    public String getFormatted_document_content() {
        return formatted_document_content;
    }

    public void setFormatted_document_content(String formatted_document_content) {
        this.formatted_document_content = formatted_document_content;
    }
}