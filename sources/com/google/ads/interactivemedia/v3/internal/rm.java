package com.google.ads.interactivemedia.v3.internal;

import android.text.TextUtils;
/* loaded from: classes4.dex */
final class rm {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f1250b;
    public final boolean c;

    public rm(String str, boolean z, boolean z2) {
        this.a = str;
        this.f1250b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != rm.class) {
            return false;
        }
        rm rmVar = (rm) obj;
        return TextUtils.equals(this.a, rmVar.a) && this.f1250b == rmVar.f1250b && this.c == rmVar.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        return ((((hashCode + 31) * 31) + (true != this.f1250b ? 1237 : 1231)) * 31) + (true != this.c ? 1237 : 1231);
    }
}
