package o;

import android.media.AudioAttributes;
import o.setTargetDensity;
/* loaded from: classes3.dex */
public final class setTargetDensity$ag$a {
    public final AudioAttributes valueOf;

    private setTargetDensity$ag$a(setTargetDensity settargetdensity) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(settargetdensity.valueOf).setFlags(settargetdensity.toString).setUsage(settargetdensity.HaptikSDK$a);
        if (getElevationDegrees.HaptikSDK$b >= 29) {
            setTargetDensity.valueOf.toString(usage, settargetdensity.ah$a);
        }
        if (getElevationDegrees.HaptikSDK$b >= 32) {
            setTargetDensity.values.ah$a(usage, settargetdensity.HaptikSDK$c);
        }
        this.valueOf = usage.build();
    }
}
