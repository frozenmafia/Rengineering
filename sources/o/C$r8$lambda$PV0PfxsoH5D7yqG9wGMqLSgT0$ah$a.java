package o;

import java.util.Arrays;
/* renamed from: o.$r8$lambda$-PV0PfxsoH5D7yqG9wGMqLSg-T0$ah$a  reason: invalid class name */
/* loaded from: classes3.dex */
final class C$r8$lambda$PV0PfxsoH5D7yqG9wGMqLSgT0$ah$a {
    private int HaptikSDK$a;
    private final boolean[] HaptikSDK$b = new boolean[15];
    private long ag$a;
    private long ah$a;
    private long invoke;
    private long toString;
    private long valueOf;
    private long values;

    public void ah$b() {
        this.toString = 0L;
        this.values = 0L;
        this.invoke = 0L;
        this.HaptikSDK$a = 0;
        Arrays.fill(this.HaptikSDK$b, false);
    }

    public boolean ag$a() {
        return this.toString > 15 && this.HaptikSDK$a == 0;
    }

    public boolean valueOf() {
        long j = this.toString;
        if (j == 0) {
            return false;
        }
        return this.HaptikSDK$b[valueOf(j - 1)];
    }

    public long values() {
        return this.invoke;
    }

    public long ah$a() {
        long j = this.values;
        if (j == 0) {
            return 0L;
        }
        return this.invoke / j;
    }

    public void ag$a(long j) {
        long j2 = this.toString;
        if (j2 == 0) {
            this.ag$a = j;
        } else if (j2 == 1) {
            long j3 = j - this.ag$a;
            this.ah$a = j3;
            this.invoke = j3;
            this.values = 1L;
        } else {
            long j4 = j - this.valueOf;
            int valueOf = valueOf(j2);
            if (Math.abs(j4 - this.ah$a) <= 1000000) {
                this.values++;
                this.invoke += j4;
                boolean[] zArr = this.HaptikSDK$b;
                if (zArr[valueOf]) {
                    zArr[valueOf] = false;
                    this.HaptikSDK$a--;
                }
            } else {
                boolean[] zArr2 = this.HaptikSDK$b;
                if (!zArr2[valueOf]) {
                    zArr2[valueOf] = true;
                    this.HaptikSDK$a++;
                }
            }
        }
        this.toString++;
        this.valueOf = j;
    }

    private static int valueOf(long j) {
        return (int) (j % 15);
    }
}
