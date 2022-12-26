package o;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class setSystemGestureInsets implements setDisplayCutout, ComponentCallbacks2 {
    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
    }

    @Override // o.setDisplayCutout
    public void values(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        onTrimMemory(20);
    }
}
