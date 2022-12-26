package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import o.StaggeredGridLayoutManager;
import o.invalidateSpanInfo;
/* loaded from: classes5.dex */
final class TypeAdapterRuntimeTypeWrapper<T> extends StaggeredGridLayoutManager.LayoutParams<T> {
    private final StaggeredGridLayoutManager.LayoutParams<T> ag$a;
    private final Gson ah$a;
    private final Type toString;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TypeAdapterRuntimeTypeWrapper(Gson gson, StaggeredGridLayoutManager.LayoutParams<T> layoutParams, Type type) {
        this.ah$a = gson;
        this.ag$a = layoutParams;
        this.toString = type;
    }

    @Override // o.StaggeredGridLayoutManager.LayoutParams
    public T read(StaggeredGridLayoutManager.SavedState.AnonymousClass1 anonymousClass1) throws IOException {
        return this.ag$a.read(anonymousClass1);
    }

    @Override // o.StaggeredGridLayoutManager.LayoutParams
    public void write(StaggeredGridLayoutManager.Span span, T t) throws IOException {
        StaggeredGridLayoutManager.LayoutParams<T> layoutParams = this.ag$a;
        Type values = values(this.toString, t);
        if (values != this.toString) {
            layoutParams = this.ah$a.valueOf(invalidateSpanInfo.get(values));
            if (layoutParams instanceof ReflectiveTypeAdapterFactory.Adapter) {
                StaggeredGridLayoutManager.LayoutParams<T> layoutParams2 = this.ag$a;
                if (!(layoutParams2 instanceof ReflectiveTypeAdapterFactory.Adapter)) {
                    layoutParams = layoutParams2;
                }
            }
        }
        layoutParams.write(span, t);
    }

    private Type values(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }
}
