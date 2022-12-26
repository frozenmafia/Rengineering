package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class bjk implements ParameterizedType, Serializable {
    private static final long serialVersionUID = 0;
    private final Type a;

    /* renamed from: b  reason: collision with root package name */
    private final Type f851b;
    private final Type[] c;

    public bjk(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            boolean z = true;
            boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
            if (type == null && !z2) {
                z = false;
            }
            bic.f(z);
        }
        this.a = type == null ? null : bjm.d(type);
        this.f851b = bjm.d(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.c = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            bic.g(this.c[i]);
            bjm.g(this.c[i]);
            Type[] typeArr3 = this.c;
            typeArr3[i] = bjm.d(typeArr3[i]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && bjm.h(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f851b;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.c);
        int hashCode2 = this.f851b.hashCode();
        Type type = this.a;
        return (hashCode ^ hashCode2) ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        int length = this.c.length;
        if (length == 0) {
            return bjm.b(this.f851b);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(bjm.b(this.f851b));
        sb.append("<");
        sb.append(bjm.b(this.c[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(bjm.b(this.c[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
