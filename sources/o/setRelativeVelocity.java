package o;

import com.conviva.api.ConvivaException;
import com.conviva.sdk.ConvivaLegacyPlayerMonitor;
/* loaded from: classes4.dex */
public class setRelativeVelocity extends ConvivaLegacyPlayerMonitor {
    public setRelativeVelocity(interpolateValue interpolatevalue, CompoundButtonCompat compoundButtonCompat) {
        super(interpolatevalue, compoundButtonCompat);
    }

    @Override // com.conviva.sdk.ConvivaLegacyPlayerMonitor, com.conviva.sdk.ConvivaPlayerMonitor
    public void createSession() {
        if (this.mClient == null) {
            return;
        }
        if (this.internalSessionId == -2 && this.playerStateManagerAPI == null) {
            ConvivaLegacyPlayerMonitor convivaLegacyPlayerMonitor = (ConvivaLegacyPlayerMonitor) getContentPlayerMonitor();
            int i = convivaLegacyPlayerMonitor != null ? convivaLegacyPlayerMonitor.internalSessionId : -2;
            try {
                this.playerStateManagerAPI = this.mClient.getPlayerStateManager();
                onPlayerInfoChanged();
                this.playerStateManagerAPI.setClientMeasureInterface(this);
                this.internalSessionId = this.mClient.createAdSession(i, this.contentMetadata, this.playerStateManagerAPI, com.conviva.sdk.BuildConfig.VERSION);
            } catch (ConvivaException unused) {
            }
        }
    }

    @Override // com.conviva.sdk.ConvivaLegacyPlayerMonitor, com.conviva.sdk.ConvivaPlayerMonitor
    public void cleanupPlayerMonitor() {
        super.cleanupPlayerMonitor();
        onAdPlayerMonitorCleanUp();
    }
}
