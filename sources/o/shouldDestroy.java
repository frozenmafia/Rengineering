package o;

import com.facebook.react.bridge.ReadableMap;
import o.commit;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class shouldDestroy extends commit.Cdefault {
    private double HaptikSDK$a;
    private double HaptikSDK$b;
    private double HaptikSDK$c;
    private double HaptikSDK$d;
    private double HaptikSDK$e;
    private boolean HaptikWebView;
    private double a;
    private int ah$b;
    private boolean aj$a;
    private double ak;
    private long getInitSettings;
    private double getSignupData;
    private final shouldDestroy$ah$a invoke;
    private double isLogoutPending;
    private double onXdkEvent;
    private int toString;

    /* JADX INFO: Access modifiers changed from: package-private */
    public shouldDestroy(ReadableMap readableMap) {
        shouldDestroy$ah$a shoulddestroy_ah_a = new shouldDestroy$ah$a();
        this.invoke = shoulddestroy_ah_a;
        shoulddestroy_ah_a.ah$a = readableMap.getDouble("initialVelocity");
        toString(readableMap);
    }

    @Override // o.commit.Cdefault
    public void toString(ReadableMap readableMap) {
        this.isLogoutPending = readableMap.getDouble("stiffness");
        this.getSignupData = readableMap.getDouble("damping");
        this.onXdkEvent = readableMap.getDouble("mass");
        this.HaptikSDK$a = this.invoke.ah$a;
        this.HaptikSDK$c = readableMap.getDouble("toValue");
        this.HaptikSDK$d = readableMap.getDouble("restSpeedThreshold");
        this.HaptikSDK$b = readableMap.getDouble("restDisplacementThreshold");
        this.HaptikWebView = readableMap.getBoolean("overshootClamping");
        int i = readableMap.hasKey("iterations") ? readableMap.getInt("iterations") : 1;
        this.ah$b = i;
        this.ah$a = i == 0;
        this.toString = 0;
        this.a = 0.0d;
        this.aj$a = false;
    }

    @Override // o.commit.Cdefault
    public void toString(long j) {
        long j2 = j / 1000000;
        if (!this.aj$a) {
            if (this.toString == 0) {
                this.HaptikSDK$e = this.values.ah$b;
                this.toString = 1;
            }
            shouldDestroy$ah$a shoulddestroy_ah_a = this.invoke;
            double d = this.values.ah$b;
            shoulddestroy_ah_a.values = d;
            this.ak = d;
            this.getInitSettings = j2;
            this.a = 0.0d;
            this.aj$a = true;
        }
        values((j2 - this.getInitSettings) / 1000.0d);
        this.getInitSettings = j2;
        this.values.ah$b = this.invoke.values;
        if (ah$a()) {
            int i = this.ah$b;
            if (i == -1 || this.toString < i) {
                this.aj$a = false;
                this.values.ah$b = this.HaptikSDK$e;
                this.toString++;
                return;
            }
            this.ah$a = true;
        }
    }

    private double values(shouldDestroy$ah$a shoulddestroy_ah_a) {
        return Math.abs(this.HaptikSDK$c - shoulddestroy_ah_a.values);
    }

    private boolean ah$a() {
        return Math.abs(this.invoke.ah$a) <= this.HaptikSDK$d && (values(this.invoke) <= this.HaptikSDK$b || this.isLogoutPending == 0.0d);
    }

    private boolean ag$a() {
        return this.isLogoutPending > 0.0d && ((this.ak < this.HaptikSDK$c && this.invoke.values > this.HaptikSDK$c) || (this.ak > this.HaptikSDK$c && this.invoke.values < this.HaptikSDK$c));
    }

    private void values(double d) {
        double d2;
        double d3;
        if (ah$a()) {
            return;
        }
        this.a += d <= 0.064d ? d : 0.064d;
        double d4 = this.getSignupData;
        double d5 = this.onXdkEvent;
        double d6 = this.isLogoutPending;
        double d7 = -this.HaptikSDK$a;
        double sqrt = d4 / (Math.sqrt(d6 * d5) * 2.0d);
        double sqrt2 = Math.sqrt(d6 / d5);
        double sqrt3 = Math.sqrt(1.0d - (sqrt * sqrt)) * sqrt2;
        double d8 = this.HaptikSDK$c - this.ak;
        double d9 = this.a;
        if (sqrt < 1.0d) {
            double exp = Math.exp((-sqrt) * sqrt2 * d9);
            double d10 = sqrt * sqrt2;
            double d11 = d7 + (d10 * d8);
            double d12 = d9 * sqrt3;
            d3 = this.HaptikSDK$c - ((((d11 / sqrt3) * Math.sin(d12)) + (Math.cos(d12) * d8)) * exp);
            d2 = ((d10 * exp) * (((Math.sin(d12) * d11) / sqrt3) + (Math.cos(d12) * d8))) - (((Math.cos(d12) * d11) - ((sqrt3 * d8) * Math.sin(d12))) * exp);
        } else {
            double exp2 = Math.exp((-sqrt2) * d9);
            d2 = exp2 * ((((d9 * sqrt2) - 1.0d) * d7) + (d9 * d8 * sqrt2 * sqrt2));
            d3 = this.HaptikSDK$c - (((((sqrt2 * d8) + d7) * d9) + d8) * exp2);
        }
        this.invoke.values = d3;
        this.invoke.ah$a = d2;
        if (ah$a() || (this.HaptikWebView && ag$a())) {
            if (this.isLogoutPending > 0.0d) {
                double d13 = this.HaptikSDK$c;
                this.ak = d13;
                this.invoke.values = d13;
            } else {
                double d14 = this.invoke.values;
                this.HaptikSDK$c = d14;
                this.ak = d14;
            }
            this.invoke.ah$a = 0.0d;
        }
    }
}
