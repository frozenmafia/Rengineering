package o;

import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import o.commitNow;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class setIsStateSaved extends commitNow.Cdefault {
    private final int HaptikSDK$a;
    private final int HaptikSDK$b;
    private final JavaOnlyMap ag$a;
    private final getSnapshot ah$b;
    private final int invoke;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setIsStateSaved(ReadableMap readableMap, getSnapshot getsnapshot) {
        this.ah$b = getsnapshot;
        this.HaptikSDK$b = readableMap.getInt("animationId");
        this.invoke = readableMap.getInt("toValue");
        this.HaptikSDK$a = readableMap.getInt("value");
        this.ag$a = JavaOnlyMap.deepClone(readableMap.getMap("animationConfig"));
    }

    @Override // o.commitNow.Cdefault
    public void ah$a() {
        this.ag$a.putDouble("toValue", ((FragmentPagerAdapter) this.ah$b.toString(this.invoke)).HaptikSDK$c());
        this.ah$b.toString(this.HaptikSDK$b, this.HaptikSDK$a, this.ag$a, null);
    }

    @Override // o.commitNow.Cdefault
    public String values() {
        return "TrackingAnimatedNode[" + this.valueOf + "]: animationID: " + this.HaptikSDK$b + " toValueNode: " + this.invoke + " valueNode: " + this.HaptikSDK$a + " animationConfig: " + this.ag$a;
    }
}
