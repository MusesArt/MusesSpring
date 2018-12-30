package muses.art.model.base;

import muses.art.service.base.StatusSetter;

public class StatusModel<E> implements StatusSetter<E> {

    private int errorCode;
    private String errorMsg;
    private E data;

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

    @Override
    public void onError(int code, String msg) {
        setErrorCode(code);
        setErrorMsg(msg);
    }

    @Override
    public void onSuccess(int code, String msg) {
        setErrorCode(code);
        setErrorMsg(msg);
    }

    @Override
    public void onSuccess(int code, String msg, E data) {
        setErrorCode(code);
        setErrorMsg(msg);
        setData(data);
    }
}
