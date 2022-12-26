package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes7.dex */
final class btd implements bpo {
    private final /* synthetic */ int c;

    /* renamed from: b  reason: collision with root package name */
    static final bpo f979b = new btd(1);
    static final bpo a = new btd(0);

    private btd(int i) {
        this.c = i;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpo
    public final boolean a(int i) {
        return this.c != 0 ? bsv.b(i) != 0 : bte.c(i) != null;
    }
}
