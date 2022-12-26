package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;
/* loaded from: classes4.dex */
abstract class awc extends AbstractMap {
    private transient Set a;

    /* renamed from: b  reason: collision with root package name */
    private transient Set f743b;
    private transient Collection c;

    abstract Set b();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.a;
        if (set == null) {
            Set b2 = b();
            this.a = b2;
            return b2;
        }
        return set;
    }

    Set g() {
        return new awa(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.f743b;
        if (set == null) {
            Set g = g();
            this.f743b = g;
            return g;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.c;
        if (collection == null) {
            awb awbVar = new awb(this);
            this.c = awbVar;
            return awbVar;
        }
        return collection;
    }
}
