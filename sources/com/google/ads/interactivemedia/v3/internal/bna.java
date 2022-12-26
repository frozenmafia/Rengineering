package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
/* loaded from: classes4.dex */
public final class bna {
    private final Class a;

    /* renamed from: b  reason: collision with root package name */
    private final Type f896b;
    private final int c;

    protected bna() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (!(genericSuperclass instanceof ParameterizedType)) {
            if (genericSuperclass == bna.class) {
                throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.");
            }
        } else {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == bna.class) {
                this.f896b = bjm.d(parameterizedType.getActualTypeArguments()[0]);
                throw null;
            }
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public static bna a(Class cls) {
        return new bna(cls);
    }

    public static bna b(Type type) {
        return new bna(type);
    }

    public final Class c() {
        return this.a;
    }

    public final Type d() {
        return this.f896b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bna) && bjm.h(this.f896b, ((bna) obj).f896b);
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return bjm.b(this.f896b);
    }

    private bna(Type type) {
        bic.g(type);
        Type d = bjm.d(type);
        this.f896b = d;
        this.a = bjm.a(d);
        this.c = d.hashCode();
    }
}
