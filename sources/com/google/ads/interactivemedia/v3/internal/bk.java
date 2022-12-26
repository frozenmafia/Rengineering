package com.google.ads.interactivemedia.v3.internal;

import java.util.List;
/* loaded from: classes4.dex */
public final class bk {
    public static final bk a = new bk(avb.o());

    /* renamed from: b  reason: collision with root package name */
    private final avb f859b;

    public bk(List list) {
        this.f859b = avb.m(list);
    }

    public final avb a() {
        return this.f859b;
    }

    public final boolean b(int i) {
        for (int i2 = 0; i2 < this.f859b.size(); i2++) {
            bj bjVar = (bj) this.f859b.get(i2);
            if (bjVar.c() && bjVar.a() == i) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f859b.equals(((bk) obj).f859b);
    }

    public final int hashCode() {
        return this.f859b.hashCode();
    }
}
