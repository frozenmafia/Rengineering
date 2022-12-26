package com.google.ads.interactivemedia.v3.internal;

import android.util.SparseBooleanArray;
/* loaded from: classes4.dex */
public final class q {
    private final SparseBooleanArray a;

    public final int a(int i) {
        af.y(i, b());
        return this.a.keyAt(i);
    }

    public final int b() {
        return this.a.size();
    }

    public final boolean c(int i) {
        return this.a.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (cp.a < 24) {
                if (b() == qVar.b()) {
                    for (int i = 0; i < b(); i++) {
                        if (a(i) != qVar.a(i)) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return this.a.equals(qVar.a);
        }
        return false;
    }

    public final int hashCode() {
        if (cp.a < 24) {
            int b2 = b();
            for (int i = 0; i < b(); i++) {
                b2 = (b2 * 31) + a(i);
            }
            return b2;
        }
        return this.a.hashCode();
    }
}
