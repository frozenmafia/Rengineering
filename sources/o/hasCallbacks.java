package o;

import com.appsamurai.storyly.exoplayer2.core.drm.DrmSession;
import java.util.Map;
import java.util.UUID;
/* loaded from: classes3.dex */
public final class hasCallbacks implements DrmSession {
    private final DrmSession.DrmSessionException toString;

    @Override // com.appsamurai.storyly.exoplayer2.core.drm.DrmSession
    public Map<String, String> HaptikSDK$c() {
        return null;
    }

    @Override // com.appsamurai.storyly.exoplayer2.core.drm.DrmSession
    public getSplashScreenView ag$a() {
        return null;
    }

    @Override // com.appsamurai.storyly.exoplayer2.core.drm.DrmSession
    public boolean ag$a(String str) {
        return false;
    }

    @Override // com.appsamurai.storyly.exoplayer2.core.drm.DrmSession
    public boolean invoke() {
        return false;
    }

    @Override // com.appsamurai.storyly.exoplayer2.core.drm.DrmSession
    public void valueOf(BundleKt$ah$a bundleKt$ah$a) {
    }

    @Override // com.appsamurai.storyly.exoplayer2.core.drm.DrmSession
    public int values() {
        return 1;
    }

    @Override // com.appsamurai.storyly.exoplayer2.core.drm.DrmSession
    public void values(BundleKt$ah$a bundleKt$ah$a) {
    }

    public hasCallbacks(DrmSession.DrmSessionException drmSessionException) {
        this.toString = (DrmSession.DrmSessionException) FingerprintManagerCompat.toString(drmSessionException);
    }

    @Override // com.appsamurai.storyly.exoplayer2.core.drm.DrmSession
    public DrmSession.DrmSessionException valueOf() {
        return this.toString;
    }

    @Override // com.appsamurai.storyly.exoplayer2.core.drm.DrmSession
    public final UUID ah$a() {
        return DrawableKt.ag$a;
    }
}
