package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes7.dex */
public class bph extends bpg implements bqr {
    /* JADX INFO: Access modifiers changed from: protected */
    public bph(bpi bpiVar) {
        super(bpiVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpg, com.google.ads.interactivemedia.v3.internal.bqp
    /* renamed from: a */
    public final bpi aY() {
        if (this.f931b) {
            return (bpi) this.a;
        }
        ((bpi) this.a).a.i();
        return (bpi) super.aY();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.ads.interactivemedia.v3.internal.bpg
    public final void ba() {
        super.ba();
        bpi bpiVar = (bpi) this.a;
        bpiVar.a = bpiVar.a.clone();
    }
}
