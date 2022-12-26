package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Date;
/* loaded from: classes4.dex */
final class bkr implements bjg {
    private final /* synthetic */ int a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bkr(int i) {
        this.a = i;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjg
    public final bjf a(bin binVar, bna bnaVar) {
        Type componentType;
        int i = this.a;
        if (i == 0) {
            if (bnaVar.c() == Date.class) {
                return new bks();
            }
            return null;
        } else if (i != 1) {
            Class c = bnaVar.c();
            if (!Enum.class.isAssignableFrom(c) || c == Enum.class) {
                return null;
            }
            if (!c.isEnum()) {
                c = c.getSuperclass();
            }
            return new bmq(c);
        } else {
            Type d = bnaVar.d();
            boolean z = d instanceof GenericArrayType;
            if (z || ((d instanceof Class) && ((Class) d).isArray())) {
                if (z) {
                    componentType = ((GenericArrayType) d).getGenericComponentType();
                } else {
                    componentType = ((Class) d).getComponentType();
                }
                return new bkp(binVar, binVar.a(bna.b(componentType)), bjm.a(componentType));
            }
            return null;
        }
    }
}
