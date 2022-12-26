package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class ak {
    private CharSequence a;

    /* renamed from: b  reason: collision with root package name */
    private CharSequence f598b;
    private CharSequence c;
    private CharSequence d;
    private CharSequence e;
    private byte[] f;
    private Integer g;
    private Integer h;
    private Integer i;
    private Integer j;
    private Integer k;
    private Integer l;
    private Integer m;
    private Integer n;

    /* renamed from: o  reason: collision with root package name */
    private Integer f599o;
    private CharSequence p;
    private CharSequence q;
    private CharSequence r;
    private CharSequence s;
    private CharSequence t;

    public ak() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ak(al alVar) {
        this.a = alVar.f613b;
        this.f598b = alVar.c;
        this.c = alVar.d;
        this.d = alVar.e;
        this.e = alVar.f;
        this.f = alVar.g;
        this.g = alVar.h;
        this.h = alVar.i;
        this.i = alVar.j;
        this.j = alVar.l;
        this.k = alVar.m;
        this.l = alVar.n;
        this.m = alVar.f614o;
        this.n = alVar.p;
        this.f599o = alVar.q;
        this.p = alVar.r;
        this.q = alVar.s;
        this.r = alVar.t;
        this.s = alVar.u;
        this.t = alVar.v;
    }

    public final void A(byte[] bArr, Integer num) {
        this.f = (byte[]) bArr.clone();
        this.g = num;
    }

    public final void B(CharSequence charSequence) {
        this.q = charSequence;
    }

    public final void C(CharSequence charSequence) {
        this.r = charSequence;
    }

    public final void D(CharSequence charSequence) {
        this.s = charSequence;
    }

    public final void E(Integer num) {
        this.l = num;
    }

    public final void F(Integer num) {
        this.k = num;
    }

    public final void G(Integer num) {
        this.j = num;
    }

    public final void H(Integer num) {
        this.f599o = num;
    }

    public final void I(Integer num) {
        this.n = num;
    }

    public final void J(Integer num) {
        this.m = num;
    }

    public final void K(CharSequence charSequence) {
        this.t = charSequence;
    }

    public final void L(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final void M(Integer num) {
        this.i = num;
    }

    public final void N(Integer num) {
        this.h = num;
    }

    public final void O(CharSequence charSequence) {
        this.p = charSequence;
    }

    public final al a() {
        return new al(this);
    }

    public final void v(byte[] bArr, int i) {
        if (this.f == null || cp.V(Integer.valueOf(i), 3) || !cp.V(this.g, 3)) {
            this.f = (byte[]) bArr.clone();
            this.g = Integer.valueOf(i);
        }
    }

    public final void w(al alVar) {
        CharSequence charSequence = alVar.f613b;
        if (charSequence != null) {
            this.a = charSequence;
        }
        CharSequence charSequence2 = alVar.c;
        if (charSequence2 != null) {
            this.f598b = charSequence2;
        }
        CharSequence charSequence3 = alVar.d;
        if (charSequence3 != null) {
            this.c = charSequence3;
        }
        CharSequence charSequence4 = alVar.e;
        if (charSequence4 != null) {
            this.d = charSequence4;
        }
        CharSequence charSequence5 = alVar.f;
        if (charSequence5 != null) {
            this.e = charSequence5;
        }
        byte[] bArr = alVar.g;
        if (bArr != null) {
            A(bArr, alVar.h);
        }
        Integer num = alVar.i;
        if (num != null) {
            this.h = num;
        }
        Integer num2 = alVar.j;
        if (num2 != null) {
            this.i = num2;
        }
        Integer num3 = alVar.k;
        if (num3 != null) {
            this.j = num3;
        }
        Integer num4 = alVar.l;
        if (num4 != null) {
            this.j = num4;
        }
        Integer num5 = alVar.m;
        if (num5 != null) {
            this.k = num5;
        }
        Integer num6 = alVar.n;
        if (num6 != null) {
            this.l = num6;
        }
        Integer num7 = alVar.f614o;
        if (num7 != null) {
            this.m = num7;
        }
        Integer num8 = alVar.p;
        if (num8 != null) {
            this.n = num8;
        }
        Integer num9 = alVar.q;
        if (num9 != null) {
            this.f599o = num9;
        }
        CharSequence charSequence6 = alVar.r;
        if (charSequence6 != null) {
            this.p = charSequence6;
        }
        CharSequence charSequence7 = alVar.s;
        if (charSequence7 != null) {
            this.q = charSequence7;
        }
        CharSequence charSequence8 = alVar.t;
        if (charSequence8 != null) {
            this.r = charSequence8;
        }
        CharSequence charSequence9 = alVar.u;
        if (charSequence9 != null) {
            this.s = charSequence9;
        }
        CharSequence charSequence10 = alVar.v;
        if (charSequence10 != null) {
            this.t = charSequence10;
        }
    }

    public final void x(CharSequence charSequence) {
        this.d = charSequence;
    }

    public final void y(CharSequence charSequence) {
        this.c = charSequence;
    }

    public final void z(CharSequence charSequence) {
        this.f598b = charSequence;
    }
}
