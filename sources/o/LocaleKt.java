package o;

import java.io.IOException;
import java.util.Arrays;
import o.skipEntityForward;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class LocaleKt {
    private int HaptikSDK$a;
    private int[] HaptikSDK$b;
    private int HaptikSDK$c;
    private final int HaptikSDK$d;
    private int ag$a;
    private final int ah$a;
    private int ah$b;
    private long[] getInitSettings;
    private final long invoke;
    protected final dirTypeForward toString;
    private int valueOf;
    private final int values;

    public LocaleKt(int i, int i2, long j, int i3, dirTypeForward dirtypeforward) {
        boolean z = true;
        if (i2 != 1 && i2 != 2) {
            z = false;
        }
        FingerprintManagerCompat.toString(z);
        this.invoke = j;
        this.HaptikSDK$d = i3;
        this.toString = dirtypeforward;
        this.ah$a = toString(i, i2 == 2 ? 1667497984 : 1651965952);
        this.values = i2 == 2 ? toString(i, 1650720768) : -1;
        this.getInitSettings = new long[512];
        this.HaptikSDK$b = new int[512];
    }

    public void ah$a(long j) {
        if (this.HaptikSDK$c == this.HaptikSDK$b.length) {
            long[] jArr = this.getInitSettings;
            this.getInitSettings = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.HaptikSDK$b;
            this.HaptikSDK$b = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.getInitSettings;
        int i = this.HaptikSDK$c;
        jArr2[i] = j;
        this.HaptikSDK$b[i] = this.HaptikSDK$a;
        this.HaptikSDK$c = i + 1;
    }

    public void ag$a() {
        this.valueOf++;
    }

    public long ah$a() {
        return values(this.valueOf);
    }

    public long valueOf() {
        return values(1);
    }

    public void HaptikSDK$c() {
        this.HaptikSDK$a++;
    }

    public void values() {
        this.getInitSettings = Arrays.copyOf(this.getInitSettings, this.HaptikSDK$c);
        this.HaptikSDK$b = Arrays.copyOf(this.HaptikSDK$b, this.HaptikSDK$c);
    }

    public boolean toString(int i) {
        return this.ah$a == i || this.values == i;
    }

    public boolean HaptikSDK$a() {
        return Arrays.binarySearch(this.HaptikSDK$b, this.valueOf) >= 0;
    }

    public void valueOf(int i) {
        this.ah$b = i;
        this.ag$a = i;
    }

    public boolean toString(getExitDir getexitdir) throws IOException {
        int i = this.ag$a;
        int valueOf = i - this.toString.valueOf(getexitdir, i, false);
        this.ag$a = valueOf;
        boolean z = valueOf == 0;
        if (z) {
            if (this.ah$b > 0) {
                this.toString.valueOf(ah$a(), HaptikSDK$a() ? 1 : 0, this.ah$b, 0, null);
            }
            ag$a();
        }
        return z;
    }

    public void valueOf(long j) {
        if (this.HaptikSDK$c == 0) {
            this.valueOf = 0;
            return;
        }
        this.valueOf = this.HaptikSDK$b[getElevationDegrees.valueOf(this.getInitSettings, j, true, true)];
    }

    public skipEntityForward.toString values(long j) {
        int valueOf = (int) (j / valueOf());
        int getelevationdegrees = getElevationDegrees.toString(this.HaptikSDK$b, valueOf, true, true);
        if (this.HaptikSDK$b[getelevationdegrees] == valueOf) {
            return new skipEntityForward.toString(ah$a(getelevationdegrees));
        }
        skipTagBackward ah$a = ah$a(getelevationdegrees);
        int i = getelevationdegrees + 1;
        if (i < this.getInitSettings.length) {
            return new skipEntityForward.toString(ah$a, ah$a(i));
        }
        return new skipEntityForward.toString(ah$a);
    }

    private long values(int i) {
        return (this.invoke * i) / this.HaptikSDK$d;
    }

    private skipTagBackward ah$a(int i) {
        return new skipTagBackward(this.HaptikSDK$b[i] * valueOf(), this.getInitSettings[i]);
    }

    private static int toString(int i, int i2) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i2;
    }
}
