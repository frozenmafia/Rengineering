package o;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;
import o.commitNow;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class isRetaining extends FragmentPagerAdapter {
    private double HaptikSDK$a = 0.0d;
    private final double HaptikSDK$b;
    private final int HaptikSDK$c;
    private final double HaptikSDK$d;
    private final getSnapshot getInitSettings;

    public isRetaining(ReadableMap readableMap, getSnapshot getsnapshot) {
        this.getInitSettings = getsnapshot;
        this.HaptikSDK$c = readableMap.getInt("input");
        this.HaptikSDK$d = readableMap.getDouble("min");
        this.HaptikSDK$b = readableMap.getDouble("max");
        this.ah$b = 0.0d;
    }

    @Override // o.commitNow.Cdefault
    public void ah$a() {
        double ah$b = ah$b();
        double d = this.HaptikSDK$a;
        this.HaptikSDK$a = ah$b;
        this.ah$b = Math.min(Math.max(this.ah$b + (ah$b - d), this.HaptikSDK$d), this.HaptikSDK$b);
    }

    private double ah$b() {
        commitNow.Cdefault getsnapshot = this.getInitSettings.toString(this.HaptikSDK$c);
        if (getsnapshot == null || !(getsnapshot instanceof FragmentPagerAdapter)) {
            throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.DiffClamp node");
        }
        return ((FragmentPagerAdapter) getsnapshot).HaptikSDK$c();
    }

    @Override // o.FragmentPagerAdapter, o.commitNow.Cdefault
    public String values() {
        return "DiffClampAnimatedNode[" + this.valueOf + "]: InputNodeTag: " + this.HaptikSDK$c + " min: " + this.HaptikSDK$d + " max: " + this.HaptikSDK$b + " lastValue: " + this.HaptikSDK$a + " super: " + super.values();
    }
}
