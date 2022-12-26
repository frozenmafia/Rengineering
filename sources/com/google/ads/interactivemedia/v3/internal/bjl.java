package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class bjl implements WildcardType, Serializable {
    private static final long serialVersionUID = 0;
    private final Type a;

    /* renamed from: b  reason: collision with root package name */
    private final Type f852b;

    public bjl(Type[] typeArr, Type[] typeArr2) {
        int length = typeArr2.length;
        bic.f(length <= 1);
        bic.f(typeArr.length == 1);
        if (length == 1) {
            bic.g(typeArr2[0]);
            bjm.g(typeArr2[0]);
            bic.f(typeArr[0] == Object.class);
            this.f852b = bjm.d(typeArr2[0]);
            this.a = Object.class;
            return;
        }
        bic.g(typeArr[0]);
        bjm.g(typeArr[0]);
        this.f852b = null;
        this.a = bjm.d(typeArr[0]);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && bjm.h(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f852b;
        return type != null ? new Type[]{type} : bjm.a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.a};
    }

    public final int hashCode() {
        Type type = this.f852b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f852b;
        if (type != null) {
            return "? super ".concat(String.valueOf(bjm.b(type)));
        }
        Type type2 = this.a;
        return type2 == Object.class ? "?" : "? extends ".concat(String.valueOf(bjm.b(type2)));
    }
}
