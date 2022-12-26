package com.appsamurai.storyly.exoplayer2.core.drm;

import o.FingerprintManagerCompat;
import o.postDelayed;
/* loaded from: classes3.dex */
class DefaultDrmSessionManager$ah$a implements postDelayed.values {
    final /* synthetic */ DefaultDrmSessionManager ag$a;

    private DefaultDrmSessionManager$ah$a(DefaultDrmSessionManager defaultDrmSessionManager) {
        this.ag$a = defaultDrmSessionManager;
    }

    @Override // o.postDelayed.values
    public void ah$a(postDelayed postdelayed, byte[] bArr, int i, int i2, byte[] bArr2) {
        ((DefaultDrmSessionManager$ag$a) FingerprintManagerCompat.toString(this.ag$a.values)).obtainMessage(i, bArr).sendToTarget();
    }
}
