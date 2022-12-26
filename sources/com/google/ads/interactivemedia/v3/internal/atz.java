package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* loaded from: classes4.dex */
abstract class atz implements awd {
    private transient Set a;

    /* renamed from: b  reason: collision with root package name */
    private transient Collection f719b;
    private transient Map c;

    abstract Collection e();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof awd) {
            return w().equals(((awd) obj).w());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Iterator f() {
        throw null;
    }

    public final int hashCode() {
        return w().hashCode();
    }

    abstract Map j();

    abstract Set l();

    public final String toString() {
        return w().toString();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awd
    public void u(Object obj, Object obj2) {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awd
    public final Collection v() {
        Collection collection = this.f719b;
        if (collection == null) {
            Collection e = e();
            this.f719b = e;
            return e;
        }
        return collection;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awd
    public final Map w() {
        Map map = this.c;
        if (map == null) {
            Map j = j();
            this.c = j;
            return j;
        }
        return map;
    }

    public final Set x() {
        Set set = this.a;
        if (set == null) {
            Set l = l();
            this.a = l;
            return l;
        }
        return set;
    }
}
