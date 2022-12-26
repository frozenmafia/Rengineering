package o;

import android.content.res.Resources;
/* loaded from: classes4.dex */
public final class getStreamMinVolume {
    public static final int valueOf(int i) {
        Resources system = Resources.getSystem();
        runAnimators.ah$a(system, "Resources.getSystem()");
        return (int) (i * system.getDisplayMetrics().density);
    }
}
