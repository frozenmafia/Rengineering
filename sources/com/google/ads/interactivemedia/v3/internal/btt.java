package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.util.Map;
/* loaded from: classes4.dex */
public abstract class btt implements Map.Entry, Comparable, Serializable {
    private static final long serialVersionUID = 4954918890077093841L;

    public static btt c(Object obj, Object obj2) {
        return new bts(obj, obj2);
    }

    public abstract Object a();

    public abstract Object b();

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        btt bttVar = (btt) obj;
        return new btm().b(a(), bttVar.a()).b(b(), bttVar.b()).a();
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return bsk.P(a(), entry.getKey()) && bsk.P(b(), entry.getValue());
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return a();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return b();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return a().hashCode() ^ b().hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(a());
        String valueOf2 = String.valueOf(b());
        return "(" + valueOf + "," + valueOf2 + ")";
    }
}
