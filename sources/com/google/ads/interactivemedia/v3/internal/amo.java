package com.google.ads.interactivemedia.v3.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class amo implements aru {
    final /* synthetic */ Object a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f640b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public amo(amp ampVar, int i) {
        this.f640b = i;
        this.a = ampVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public amo(arh arhVar, int i) {
        this.f640b = i;
        this.a = arhVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aru
    public final void a(int i, long j) {
        arh arhVar;
        if (this.f640b != 0) {
            ((arh) this.a).d(i, System.currentTimeMillis() - j);
            return;
        }
        arhVar = ((amp) this.a).d;
        arhVar.d(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aru
    public final void b(int i, long j, String str) {
        arh arhVar;
        if (this.f640b == 0) {
            arhVar = ((amp) this.a).d;
            arhVar.e(i, System.currentTimeMillis() - j, str);
            return;
        }
        ((arh) this.a).e(i, System.currentTimeMillis() - j, str);
    }
}
