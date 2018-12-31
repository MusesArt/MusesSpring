package muses.art.model.base;

public class StatusModel<E> {

    private String code;
    private String message;
    private E data;

    public static final String OK = "OK";
    public static final String ERROR = "ERROR";

    public StatusModel() {}

    public StatusModel(E data) {
        this.data = data;
        this.code = OK;
        this.message = "";
    }

    public StatusModel(String message) {
        this.data = null;
        this.message = message;
        this.code = ERROR;
    }

    public StatusModel(String message, String code) {
        this.data = null;
        this.message = message;
        this.code = code;
    }

    public StatusModel(String code, String message, E data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
}
