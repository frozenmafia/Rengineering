package com.google.ads.interactivemedia.v3.internal;

import java.util.HashMap;
import java.util.HashSet;
/* loaded from: classes4.dex */
public class bi {
    public static final bi a = new bi(new bh());
    public final avk A;

    /* renamed from: b  reason: collision with root package name */
    public final int f843b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final boolean l;
    public final avb m;
    public final int n;

    /* renamed from: o  reason: collision with root package name */
    public final avb f844o;
    public final int p;
    public final int q;
    public final int r;
    public final avb s;
    public final avb t;
    public final int u;
    public final int v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final avf z;

    /* JADX INFO: Access modifiers changed from: protected */
    public bi(bh bhVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        avb avbVar;
        avb avbVar2;
        int i7;
        int i8;
        avb avbVar3;
        avb avbVar4;
        int i9;
        HashMap hashMap;
        HashSet hashSet;
        i = bhVar.a;
        this.f843b = i;
        i2 = bhVar.f829b;
        this.c = i2;
        i3 = bhVar.c;
        this.d = i3;
        i4 = bhVar.d;
        this.e = i4;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        i5 = bhVar.e;
        this.j = i5;
        i6 = bhVar.f;
        this.k = i6;
        z = bhVar.g;
        this.l = z;
        avbVar = bhVar.h;
        this.m = avbVar;
        this.n = 0;
        avbVar2 = bhVar.i;
        this.f844o = avbVar2;
        this.p = 0;
        i7 = bhVar.j;
        this.q = i7;
        i8 = bhVar.k;
        this.r = i8;
        avbVar3 = bhVar.l;
        this.s = avbVar3;
        avbVar4 = bhVar.m;
        this.t = avbVar4;
        i9 = bhVar.n;
        this.u = i9;
        this.v = 0;
        this.w = false;
        this.x = false;
        this.y = false;
        hashMap = bhVar.f830o;
        this.z = avf.c(hashMap);
        hashSet = bhVar.p;
        this.A = avk.l(hashSet);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bi biVar = (bi) obj;
        return this.f843b == biVar.f843b && this.c == biVar.c && this.d == biVar.d && this.e == biVar.e && this.l == biVar.l && this.j == biVar.j && this.k == biVar.k && this.m.equals(biVar.m) && this.f844o.equals(biVar.f844o) && this.q == biVar.q && this.r == biVar.r && this.s.equals(biVar.s) && this.t.equals(biVar.t) && this.u == biVar.u && this.z.equals(biVar.z) && this.A.equals(biVar.A);
    }

    public int hashCode() {
        int i = this.f843b;
        int i2 = this.c;
        int i3 = this.d;
        int i4 = this.e;
        boolean z = this.l;
        int i5 = this.j;
        int i6 = this.k;
        int hashCode = this.m.hashCode();
        int hashCode2 = this.f844o.hashCode();
        int i7 = this.q;
        int i8 = this.r;
        int hashCode3 = this.s.hashCode();
        int hashCode4 = this.t.hashCode();
        int i9 = this.u;
        return ((((((((((((((((((((((((((((((i + 31) * 31) + i2) * 31) + i3) * 31) + i4) * 28629151) + (z ? 1 : 0)) * 31) + i5) * 31) + i6) * 31) + hashCode) * 961) + hashCode2) * 961) + i7) * 31) + i8) * 31) + hashCode3) * 31) + hashCode4) * 31) + i9) * 28629151) + this.z.hashCode()) * 31) + this.A.hashCode();
    }
}
