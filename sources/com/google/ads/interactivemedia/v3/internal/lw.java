package com.google.ads.interactivemedia.v3.internal;

import androidx.databinding.library.baseAdapters.BR;
/* loaded from: classes4.dex */
public final class lw {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1165b;
    public final String c;
    public final String d;
    public final String e;

    public lw(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.f1165b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lw) {
            lw lwVar = (lw) obj;
            return cp.V(this.a, lwVar.a) && cp.V(this.f1165b, lwVar.f1165b) && cp.V(this.c, lwVar.c) && cp.V(this.d, lwVar.d) && cp.V(this.e, lwVar.e);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f1165b;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.c;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.d;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.e;
        return ((((((((hashCode + BR.userTeamVM) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }
}
