package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import okhttp3.HttpUrl;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class bjj implements GenericArrayType, Serializable {
    private static final long serialVersionUID = 0;
    private final Type a;

    public bjj(Type type) {
        this.a = bjm.d(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && bjm.h(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return String.valueOf(bjm.b(this.a)).concat(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
    }
}
