package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.ExoMediaDrm;
import java.util.UUID;
/* loaded from: classes4.dex */
public final /* synthetic */ class FrameworkMediaDrm$$ExternalSyntheticLambda3 implements ExoMediaDrm.Provider {
    public static final /* synthetic */ FrameworkMediaDrm$$ExternalSyntheticLambda3 INSTANCE = new FrameworkMediaDrm$$ExternalSyntheticLambda3();

    private /* synthetic */ FrameworkMediaDrm$$ExternalSyntheticLambda3() {
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm.Provider
    public final ExoMediaDrm acquireExoMediaDrm(UUID uuid) {
        return FrameworkMediaDrm.lambda$static$0(uuid);
    }
}
