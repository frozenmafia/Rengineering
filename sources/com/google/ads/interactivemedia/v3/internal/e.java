package com.google.ads.interactivemedia.v3.internal;

import android.media.AudioAttributes;
/* loaded from: classes4.dex */
public final class e {
    public final AudioAttributes a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ e(f fVar) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        if (cp.a >= 29) {
            c.a(usage, 1);
        }
        if (cp.a >= 32) {
            d.a(usage, 0);
        }
        this.a = usage.build();
    }
}
