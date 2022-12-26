package o;

import com.facebook.react.bridge.ReadableMap;
import o.commit;
/* loaded from: classes6.dex */
public class clearNonConfigState extends commit.Cdefault {
    private long HaptikSDK$a;
    private double HaptikSDK$b;
    private int HaptikSDK$c;
    private double ah$b;
    private final double getSignupData;
    private double invoke;
    private int toString;

    public clearNonConfigState(ReadableMap readableMap) {
        this.getSignupData = readableMap.getDouble("velocity");
        toString(readableMap);
    }

    @Override // o.commit.Cdefault
    public void toString(ReadableMap readableMap) {
        this.invoke = readableMap.getDouble("deceleration");
        int i = readableMap.hasKey("iterations") ? readableMap.getInt("iterations") : 1;
        this.HaptikSDK$c = i;
        this.toString = 1;
        this.ah$a = i == 0;
        this.HaptikSDK$a = -1L;
        this.ah$b = 0.0d;
        this.HaptikSDK$b = 0.0d;
    }

    @Override // o.commit.Cdefault
    public void toString(long j) {
        long j2 = j / 1000000;
        if (this.HaptikSDK$a == -1) {
            this.HaptikSDK$a = j2 - 16;
            if (this.ah$b == this.HaptikSDK$b) {
                this.ah$b = this.values.ah$b;
            } else {
                this.values.ah$b = this.ah$b;
            }
            this.HaptikSDK$b = this.values.ah$b;
        }
        double d = this.ah$b;
        double d2 = this.getSignupData;
        double d3 = 1.0d - this.invoke;
        double exp = d + ((d2 / d3) * (1.0d - Math.exp((-d3) * (j2 - this.HaptikSDK$a))));
        if (Math.abs(this.HaptikSDK$b - exp) < 0.1d) {
            int i = this.HaptikSDK$c;
            if (i == -1 || this.toString < i) {
                this.HaptikSDK$a = -1L;
                this.toString++;
            } else {
                this.ah$a = true;
                return;
            }
        }
        this.HaptikSDK$b = exp;
        this.values.ah$b = exp;
    }
}
