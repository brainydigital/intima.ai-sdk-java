package io.swagger.client.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("action")
    private Action action = null;

    @SerializedName("result")
    private List<Result> result = null;

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }
}