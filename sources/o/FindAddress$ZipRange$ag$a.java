package o;

import com.google.android.exoplayer2.C;
/* loaded from: classes3.dex */
final class FindAddress$ZipRange$ag$a {
    private long HaptikSDK$a;
    private boolean ag$a;
    private final dirTypeForward ah$a;
    private int ah$b;
    private int invoke;
    private long toString;
    private boolean valueOf;
    private boolean values;

    public FindAddress$ZipRange$ag$a(dirTypeForward dirtypeforward) {
        this.ah$a = dirtypeforward;
    }

    public void valueOf() {
        this.values = false;
        this.ag$a = false;
        this.valueOf = false;
        this.ah$b = -1;
    }

    public void ah$a(int i, long j) {
        this.ah$b = i;
        this.valueOf = false;
        this.values = i == 182 || i == 179;
        this.ag$a = i == 182;
        this.invoke = 0;
        this.HaptikSDK$a = j;
    }

    public void ag$a(byte[] bArr, int i, int i2) {
        if (this.ag$a) {
            int i3 = this.invoke;
            int i4 = (i + 1) - i3;
            if (i4 < i2) {
                this.valueOf = ((bArr[i4] & 192) >> 6) == 0;
                this.ag$a = false;
                return;
            }
            this.invoke = i3 + (i2 - i);
        }
    }

    public void values(long j, int i, boolean z) {
        if (this.ah$b == 182 && z && this.values) {
            long j2 = this.HaptikSDK$a;
            if (j2 != C.TIME_UNSET) {
                this.ah$a.valueOf(j2, this.valueOf ? 1 : 0, (int) (j - this.toString), i, null);
            }
        }
        if (this.ah$b != 179) {
            this.toString = j;
        }
    }
}
