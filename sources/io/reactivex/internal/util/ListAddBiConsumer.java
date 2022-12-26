package io.reactivex.internal.util;

import java.util.List;
import o.FrameworkSQLiteOpenHelper;
/* loaded from: classes7.dex */
public enum ListAddBiConsumer implements FrameworkSQLiteOpenHelper<List, Object, List> {
    INSTANCE;

    public static <T> FrameworkSQLiteOpenHelper<List<T>, T, List<T>> instance() {
        return INSTANCE;
    }

    @Override // o.FrameworkSQLiteOpenHelper
    public List apply(List list, Object obj) throws Exception {
        list.add(obj);
        return list;
    }
}
