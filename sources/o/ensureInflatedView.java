package o;

import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.uimanager.StateWrapper;
/* loaded from: classes6.dex */
public class ensureInflatedView implements resume {
    private final int HaptikSDK$c;
    private final EventEmitterWrapper ag$a;
    private final Object ah$a;
    private final StateWrapper invoke;
    private final String toString;
    private final boolean valueOf;
    private final int values;

    @Override // o.resume
    public int values() {
        return this.HaptikSDK$c;
    }

    @Override // o.resume
    public void ag$a(addViewToContainer addviewtocontainer) {
        activityCreated ah$a = addviewtocontainer.ah$a(this.HaptikSDK$c);
        if (ah$a == null) {
            String str = FabricUIManager.valueOf;
            FragmentActivity.values(str, "Skipping View PreAllocation; no SurfaceMountingManager found for [" + this.HaptikSDK$c + "]");
            return;
        }
        ah$a.ag$a(this.toString, this.values, this.ah$a, this.invoke, this.ag$a, this.valueOf);
    }

    public String toString() {
        return "PreAllocateViewMountItem [" + this.values + "] - component: " + this.toString + " surfaceId: " + this.HaptikSDK$c + " isLayoutable: " + this.valueOf;
    }
}
