package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes7.dex */
final class bss implements bpo {
    private final /* synthetic */ int c;

    /* renamed from: b  reason: collision with root package name */
    static final bpo f973b = new bss(1);
    static final bpo a = new bss(0);

    private bss(int i) {
        this.c = i;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpo
    public final boolean a(int i) {
        return this.c != 0 ? bsr.b(i) != 0 : bst.b(i) != 0;
    }
}
