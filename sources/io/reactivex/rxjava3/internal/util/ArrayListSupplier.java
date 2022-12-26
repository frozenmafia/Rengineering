package io.reactivex.rxjava3.internal.util;

import java.util.ArrayList;
import java.util.List;
import o.addOffset;
import o.createByteVector;
/* loaded from: classes7.dex */
public enum ArrayListSupplier implements createByteVector<List<Object>>, addOffset<Object, List<Object>> {
    INSTANCE;

    public static <T> createByteVector<List<T>> asSupplier() {
        return INSTANCE;
    }

    public static <T, O> addOffset<O, List<T>> asFunction() {
        return INSTANCE;
    }

    @Override // o.createByteVector
    public List<Object> get() {
        return new ArrayList();
    }

    @Override // o.addOffset
    public List<Object> apply(Object obj) {
        return new ArrayList();
    }
}
