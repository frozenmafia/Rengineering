package o;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
/* loaded from: classes3.dex */
public final class getScrollIndicators implements ComponentCallbacks2 {
    private final Transition<Boolean, Integer, setAnimationMatrix> ag$a;
    private final isLayoutDirectionResolved ah$a;
    private final Transition<String, String, setAnimationMatrix> values;

    /* JADX WARN: Multi-variable type inference failed */
    public getScrollIndicators(isLayoutDirectionResolved islayoutdirectionresolved, Transition<? super String, ? super String, setAnimationMatrix> transition, Transition<? super Boolean, ? super Integer, setAnimationMatrix> transition2) {
        runAnimators.valueOf(islayoutdirectionresolved, "deviceDataCollector");
        runAnimators.valueOf(transition, "cb");
        runAnimators.valueOf(transition2, "memoryCallback");
        this.ah$a = islayoutdirectionresolved;
        this.values = transition;
        this.ag$a = transition2;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        runAnimators.valueOf(configuration, "newConfig");
        String HaptikSDK$c = this.ah$a.HaptikSDK$c();
        if (this.ah$a.ag$a(configuration.orientation)) {
            this.values.invoke(HaptikSDK$c, this.ah$a.HaptikSDK$c());
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        this.ag$a.invoke(Boolean.valueOf(i >= 80), Integer.valueOf(i));
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.ag$a.invoke(true, null);
    }
}
