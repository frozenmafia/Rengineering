package io.reactivex.rxjava3.internal.util;

import java.util.List;
import o.addBoolean;
/* loaded from: classes7.dex */
public enum ListAddBiConsumer implements addBoolean<List, Object, List> {
    INSTANCE;

    public static <T> addBoolean<List<T>, T, List<T>> instance() {
        return INSTANCE;
    }

    @Override // o.addBoolean
    public List apply(List list, Object obj) {
        list.add(obj);
        return list;
    }
}
