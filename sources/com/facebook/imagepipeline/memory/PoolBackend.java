package com.facebook.imagepipeline.memory;
/* loaded from: classes4.dex */
interface PoolBackend<T> {
    T get(int i);

    int getSize(T t);

    T pop();

    void put(T t);
}
