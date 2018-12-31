package muses.art.model.base;

public class StatusModel<E> {

    private int errorCode;
    private String errorMsg;
    private E data;

    public static final int OK = 0;
    public static final int ERROR = -1;

    public StatusModel() {}

    public StatusModel(E data) {
        this.data = data;
        this.errorCode = OK;
        this.errorMsg = "";
    }

    public StatusModel(String errorMsg) {
        this.data = null;
        this.errorMsg = errorMsg;
        this.errorCode = ERROR;
    }

    public StatusModel(int errorCode, String errorMsg, E data) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
}
