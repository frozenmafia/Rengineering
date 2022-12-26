package o;

import android.os.Handler;
import android.os.Looper;
/* loaded from: classes5.dex */
public class repositionShadowingViews implements getStateRestorationPolicy {
    private final Handler values = new Handler(Looper.getMainLooper());

    @Override // o.getStateRestorationPolicy
    public void valueOf() {
    }

    @Override // o.getStateRestorationPolicy
    public void toString(Runnable runnable) {
        this.values.post(runnable);
    }
}
