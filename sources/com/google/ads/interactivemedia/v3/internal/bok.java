package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes7.dex */
final class bok implements bpo {
    private final /* synthetic */ int d;
    static final bpo c = new bok(2);

    /* renamed from: b  reason: collision with root package name */
    static final bpo f914b = new bok(1);
    static final bpo a = new bok(0);

    private bok(int i) {
        this.d = i;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpo
    public final boolean a(int i) {
        int i2 = this.d;
        return i2 != 0 ? i2 != 1 ? bop.b(i) != 0 : boj.b(i) != 0 : bol.b(i) != 0;
    }
}
