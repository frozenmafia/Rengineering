package com.dreampay.commons;
/* loaded from: classes4.dex */
public interface ResponseListener<T> {
    void onEvent(Response<? extends T> response);
}
