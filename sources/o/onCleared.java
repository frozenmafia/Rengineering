package o;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;
import o.commitNow;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class onCleared extends FragmentPagerAdapter {
    private final getSnapshot HaptikSDK$a;
    private final double HaptikSDK$b;
    private final int HaptikSDK$c;

    public onCleared(ReadableMap readableMap, getSnapshot getsnapshot) {
        this.HaptikSDK$a = getsnapshot;
        this.HaptikSDK$c = readableMap.getInt("input");
        this.HaptikSDK$b = readableMap.getDouble("modulus");
    }

    @Override // o.commitNow.Cdefault
    public void ah$a() {
        commitNow.Cdefault getsnapshot = this.HaptikSDK$a.toString(this.HaptikSDK$c);
        if (getsnapshot != null && (getsnapshot instanceof FragmentPagerAdapter)) {
            double HaptikSDK$c = ((FragmentPagerAdapter) getsnapshot).HaptikSDK$c();
            double d = this.HaptikSDK$b;
            this.ah$b = ((HaptikSDK$c % d) + d) % d;
            return;
        }
        throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.modulus node");
    }

    @Override // o.FragmentPagerAdapter, o.commitNow.Cdefault
    public String values() {
        return "NativeAnimatedNodesManager[" + this.valueOf + "] inputNode: " + this.HaptikSDK$c + " modulus: " + this.HaptikSDK$b + " super: " + super.values();
    }
}
