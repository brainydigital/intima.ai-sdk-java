package io.swagger.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.client.model.Response.Data;

public class Action {

    @SerializedName("id")
    int id;
    @SerializedName("type")
    int type;
    @SerializedName("status")
    int status;
    @SerializedName("user_id")
    int user_id;
    @SerializedName("pje_auth_id")
    int pje_auth_id;
    @SerializedName("pje_processo_escuta_id")
    String pje_processo_escuta_id;
    @SerializedName("data")
    Data data;
    @SerializedName("extra")
    Extra extra;
    @SerializedName("robot_internal_process_id")
    String robot_internal_process_id;
    @SerializedName("ended_at")
    String ended_at;
    @SerializedName("created_at")
    String created_at;
    @SerializedName("updated_at")
    String updated_at;
    @SerializedName("deleted_at")
    String deleted_at;
    @SerializedName("status_text")
    String status_text;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getPje_auth_id() {
        return pje_auth_id;
    }

    public void setPje_auth_id(int pje_auth_id) {
        this.pje_auth_id = pje_auth_id;
    }

    public String getPje_processo_escuta_id() {
        return pje_processo_escuta_id;
    }

    public void setPje_processo_escuta_id(String pje_processo_escuta_id) {
        this.pje_processo_escuta_id = pje_processo_escuta_id;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Extra getExtra() {
        return extra;
    }

    public void setExtra(Extra extra) {
        this.extra = extra;
    }

    public String getRobot_internal_process_id() {
        return robot_internal_process_id;
    }

    public void setRobot_internal_process_id(String robot_internal_process_id) {
        this.robot_internal_process_id = robot_internal_process_id;
    }

    public String getEnded_at() {
        return ended_at;
    }

    public void setEnded_at(String ended_at) {
        this.ended_at = ended_at;
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

    public String getStatus_text() {
        return status_text;
    }

    public void setStatus_text(String status_text) {
        this.status_text = status_text;
    }
}