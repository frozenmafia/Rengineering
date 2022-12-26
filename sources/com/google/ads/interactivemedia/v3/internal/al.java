package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
/* loaded from: classes4.dex */
public final class al {
    public static final al a = new ak().a();

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f613b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final byte[] g;
    public final Integer h;
    public final Integer i;
    public final Integer j;
    @Deprecated
    public final Integer k;
    public final Integer l;
    public final Integer m;
    public final Integer n;

    /* renamed from: o  reason: collision with root package name */
    public final Integer f614o;
    public final Integer p;
    public final Integer q;
    public final CharSequence r;
    public final CharSequence s;
    public final CharSequence t;
    public final CharSequence u;
    public final CharSequence v;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ al(ak akVar) {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        CharSequence charSequence5;
        byte[] bArr;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Integer num8;
        Integer num9;
        Integer num10;
        CharSequence charSequence6;
        CharSequence charSequence7;
        CharSequence charSequence8;
        CharSequence charSequence9;
        CharSequence charSequence10;
        charSequence = akVar.a;
        this.f613b = charSequence;
        charSequence2 = akVar.f598b;
        this.c = charSequence2;
        charSequence3 = akVar.c;
        this.d = charSequence3;
        charSequence4 = akVar.d;
        this.e = charSequence4;
        charSequence5 = akVar.e;
        this.f = charSequence5;
        bArr = akVar.f;
        this.g = bArr;
        num = akVar.g;
        this.h = num;
        num2 = akVar.h;
        this.i = num2;
        num3 = akVar.i;
        this.j = num3;
        num4 = akVar.j;
        this.k = num4;
        num5 = akVar.j;
        this.l = num5;
        num6 = akVar.k;
        this.m = num6;
        num7 = akVar.l;
        this.n = num7;
        num8 = akVar.m;
        this.f614o = num8;
        num9 = akVar.n;
        this.p = num9;
        num10 = akVar.f599o;
        this.q = num10;
        charSequence6 = akVar.p;
        this.r = charSequence6;
        charSequence7 = akVar.q;
        this.s = charSequence7;
        charSequence8 = akVar.r;
        this.t = charSequence8;
        charSequence9 = akVar.s;
        this.u = charSequence9;
        charSequence10 = akVar.t;
        this.v = charSequence10;
    }

    public final ak a() {
        return new ak(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        al alVar = (al) obj;
        return cp.V(this.f613b, alVar.f613b) && cp.V(this.c, alVar.c) && cp.V(this.d, alVar.d) && cp.V(this.e, alVar.e) && cp.V(null, null) && cp.V(null, null) && cp.V(this.f, alVar.f) && cp.V(null, null) && cp.V(null, null) && Arrays.equals(this.g, alVar.g) && cp.V(this.h, alVar.h) && cp.V(null, null) && cp.V(this.i, alVar.i) && cp.V(this.j, alVar.j) && cp.V(null, null) && cp.V(null, null) && cp.V(this.l, alVar.l) && cp.V(this.m, alVar.m) && cp.V(this.n, alVar.n) && cp.V(this.f614o, alVar.f614o) && cp.V(this.p, alVar.p) && cp.V(this.q, alVar.q) && cp.V(this.r, alVar.r) && cp.V(this.s, alVar.s) && cp.V(this.t, alVar.t) && cp.V(null, null) && cp.V(null, null) && cp.V(this.u, alVar.u) && cp.V(null, null) && cp.V(this.v, alVar.v);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f613b, this.c, this.d, this.e, null, null, this.f, null, null, Integer.valueOf(Arrays.hashCode(this.g)), this.h, null, this.i, this.j, null, null, this.l, this.m, this.n, this.f614o, this.p, this.q, this.r, this.s, this.t, null, null, this.u, null, this.v});
    }
}
