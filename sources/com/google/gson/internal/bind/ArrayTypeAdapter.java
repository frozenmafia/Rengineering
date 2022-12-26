package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import o.StaggeredGridLayoutManager;
import o.invalidateSpanInfo;
import o.offsetFullSpansForAddition;
/* loaded from: classes5.dex */
public final class ArrayTypeAdapter<E> extends StaggeredGridLayoutManager.LayoutParams<Object> {
    public static final offsetFullSpansForAddition toString = new offsetFullSpansForAddition() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // o.offsetFullSpansForAddition
        public <T> StaggeredGridLayoutManager.LayoutParams<T> create(Gson gson, invalidateSpanInfo<T> invalidatespaninfo) {
            Type type = invalidatespaninfo.getType();
            if ((type instanceof GenericArrayType) || ((type instanceof Class) && ((Class) type).isArray())) {
                Type ag$a = C$Gson$Types.ag$a(type);
                return new ArrayTypeAdapter(gson, gson.valueOf(invalidateSpanInfo.get(ag$a)), C$Gson$Types.ah$a(ag$a));
            }
            return null;
        }
    };
    private final StaggeredGridLayoutManager.LayoutParams<E> ah$a;
    private final Class<E> values;

    public ArrayTypeAdapter(Gson gson, StaggeredGridLayoutManager.LayoutParams<E> layoutParams, Class<E> cls) {
        this.ah$a = new TypeAdapterRuntimeTypeWrapper(gson, layoutParams, cls);
        this.values = cls;
    }

    @Override // o.StaggeredGridLayoutManager.LayoutParams
    public Object read(StaggeredGridLayoutManager.SavedState.AnonymousClass1 anonymousClass1) throws IOException {
        if (anonymousClass1.aj$a() == JsonToken.NULL) {
            anonymousClass1.HaptikSDK$e();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        anonymousClass1.valueOf();
        while (anonymousClass1.HaptikSDK$a()) {
            arrayList.add(this.ah$a.read(anonymousClass1));
        }
        anonymousClass1.values();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.values, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.StaggeredGridLayoutManager.LayoutParams
    public void write(StaggeredGridLayoutManager.Span span, Object obj) throws IOException {
        if (obj == null) {
            span.HaptikSDK$b();
            return;
        }
        span.valueOf();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.ah$a.write(span, Array.get(obj, i));
        }
        span.ah$a();
    }
}
