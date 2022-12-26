package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
final class afd implements bpo {
    private final /* synthetic */ int d;
    static final bpo c = new afd(2);

    /* renamed from: b  reason: collision with root package name */
    static final bpo f524b = new afd(1);
    static final bpo a = new afd(0);

    private afd(int i) {
        this.d = i;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpo
    public final boolean a(int i) {
        int i2 = this.d;
        return i2 != 0 ? i2 != 1 ? afj.b(i) != 0 : afb.c(i) != 0 : afe.c(i) != 0;
    }
}
