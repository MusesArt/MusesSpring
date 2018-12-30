package muses.art.service.base;

public interface StatusSetter<E> {
    void onError(int code, String msg);

    void onSuccess(int code, String msg);

    void onSuccess(int code, String msg, E data);
}