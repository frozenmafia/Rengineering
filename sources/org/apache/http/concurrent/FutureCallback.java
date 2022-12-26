package org.apache.http.concurrent;
/* loaded from: classes8.dex */
public interface FutureCallback<T> {
    void cancelled();

    void completed(T t);

    void failed(Exception exc);
}
