package o;
/* loaded from: classes5.dex */
public class isAccessibilityEnabled {
    public final isAccessibilityEnabled$ag$a HaptikSDK$b;
    public final int HaptikSDK$c;
    public final int ag$a;
    public final double ah$a;
    public final double ah$b;
    public final int toString;
    public final long valueOf;
    public final values values;

    /* loaded from: classes7.dex */
    public static class values {
        public final boolean ah$a;
        public final boolean valueOf;

        public values(boolean z, boolean z2) {
            this.valueOf = z;
            this.ah$a = z2;
        }
    }

    public isAccessibilityEnabled(long j, isAccessibilityEnabled$ag$a isaccessibilityenabled_ag_a, values valuesVar, int i, int i2, double d, double d2, int i3) {
        this.valueOf = j;
        this.HaptikSDK$b = isaccessibilityenabled_ag_a;
        this.values = valuesVar;
        this.HaptikSDK$c = i;
        this.toString = i2;
        this.ah$b = d;
        this.ah$a = d2;
        this.ag$a = i3;
    }

    public boolean ah$a(long j) {
        return this.valueOf < j;
    }
}
