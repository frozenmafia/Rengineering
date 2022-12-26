package o;

import com.facebook.react.bridge.ReadableMap;
import o.commitNow;
/* loaded from: classes4.dex */
public class FragmentPagerAdapter extends commitNow.Cdefault {
    private FragmentManagerNonConfig HaptikSDK$c;
    Object ag$a;
    public double ah$b;
    double invoke;

    public FragmentPagerAdapter() {
        this.ag$a = null;
        this.ah$b = Double.NaN;
        this.invoke = 0.0d;
    }

    public FragmentPagerAdapter(ReadableMap readableMap) {
        this.ag$a = null;
        this.ah$b = Double.NaN;
        this.invoke = 0.0d;
        this.ah$b = readableMap.getDouble("value");
        this.invoke = readableMap.getDouble("offset");
    }

    public double HaptikSDK$c() {
        if (Double.isNaN(this.invoke + this.ah$b)) {
            ah$a();
        }
        return this.invoke + this.ah$b;
    }

    public Object HaptikSDK$b() {
        return this.ag$a;
    }

    public void HaptikSDK$a() {
        this.ah$b += this.invoke;
        this.invoke = 0.0d;
    }

    public void valueOf() {
        this.invoke += this.ah$b;
        this.ah$b = 0.0d;
    }

    public void invoke() {
        FragmentManagerNonConfig fragmentManagerNonConfig = this.HaptikSDK$c;
        if (fragmentManagerNonConfig == null) {
            return;
        }
        fragmentManagerNonConfig.toString(HaptikSDK$c());
    }

    public void valueOf(FragmentManagerNonConfig fragmentManagerNonConfig) {
        this.HaptikSDK$c = fragmentManagerNonConfig;
    }

    @Override // o.commitNow.Cdefault
    public String values() {
        return "ValueAnimatedNode[" + this.valueOf + "]: value: " + this.ah$b + " offset: " + this.invoke;
    }
}
