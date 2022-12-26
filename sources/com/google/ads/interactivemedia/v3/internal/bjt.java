package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes4.dex */
public final class bjt implements Cloneable, bjg {
    public static final bjt a = new bjt();

    /* renamed from: b  reason: collision with root package name */
    private final double f858b = -1.0d;
    private final int c = 136;
    private final boolean d = true;
    private List e = Collections.emptyList();
    private final List f = Collections.emptyList();

    private final boolean f(Class cls) {
        return h(cls);
    }

    private final boolean g(Class cls, boolean z) {
        for (com.google.ads.interactivemedia.v3.impl.data.av avVar : z ? this.e : this.f) {
        }
        return false;
    }

    private final boolean h(Class cls) {
        return (Enum.class.isAssignableFrom(cls) || i(cls) || (!cls.isAnonymousClass() && !cls.isLocalClass())) ? false : true;
    }

    private static final boolean i(Class cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjg
    public final bjf a(bin binVar, bna bnaVar) {
        boolean z;
        boolean z2;
        Class c = bnaVar.c();
        boolean f = f(c);
        if (f) {
            z = true;
        } else {
            g(c, true);
            z = false;
        }
        if (f) {
            z2 = true;
        } else {
            g(c, false);
            z2 = false;
        }
        if (z || z2) {
            return new bjs(this, z2, z, binVar, bnaVar);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final bjt clone() {
        try {
            return (bjt) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean c(Class cls, boolean z) {
        if (f(cls)) {
            return true;
        }
        g(cls, z);
        return false;
    }

    public final boolean d(Field field, boolean z) {
        if ((field.getModifiers() & 136) != 0 || field.isSynthetic() || h(field.getType())) {
            return true;
        }
        List<com.google.ads.interactivemedia.v3.impl.data.av> list = z ? this.e : this.f;
        if (list.isEmpty()) {
            return false;
        }
        vf vfVar = new vf(field);
        for (com.google.ads.interactivemedia.v3.impl.data.av avVar : list) {
            if (com.google.ads.interactivemedia.v3.impl.data.av.a(vfVar)) {
                return true;
            }
        }
        return false;
    }

    public final bjt e(com.google.ads.interactivemedia.v3.impl.data.av avVar) {
        bjt clone = clone();
        ArrayList arrayList = new ArrayList(this.e);
        clone.e = arrayList;
        arrayList.add(avVar);
        return clone;
    }
}
