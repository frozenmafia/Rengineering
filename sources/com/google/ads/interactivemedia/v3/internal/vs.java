package com.google.ads.interactivemedia.v3.internal;

import android.media.Spatializer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class vs implements Spatializer.OnSpatializerStateChangedListener {
    final /* synthetic */ vy a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public vs(vy vyVar) {
        this.a = vyVar;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.a.q();
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.a.q();
    }
}
