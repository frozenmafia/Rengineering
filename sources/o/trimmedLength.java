package o;

import java.io.IOException;
import o.dirTypeForward;
/* loaded from: classes3.dex */
public final class trimmedLength {
    private final byte[] HaptikSDK$a = new byte[10];
    private int ag$a;
    private int ah$a;
    private boolean invoke;
    private int toString;
    private int valueOf;
    private long values;

    public void valueOf() {
        this.invoke = false;
        this.ah$a = 0;
    }

    public void toString(getExitDir getexitdir) throws IOException {
        if (this.invoke) {
            return;
        }
        getexitdir.ag$a(this.HaptikSDK$a, 0, 10);
        getexitdir.valueOf();
        if (setPlatformView.ah$a(this.HaptikSDK$a) == 0) {
            return;
        }
        this.invoke = true;
    }

    public void toString(dirTypeForward dirtypeforward, long j, int i, int i2, int i3, dirTypeForward.toString tostring) {
        FingerprintManagerCompat.values(this.ag$a <= i2 + i3, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.invoke) {
            int i4 = this.ah$a;
            int i5 = i4 + 1;
            this.ah$a = i5;
            if (i4 == 0) {
                this.values = j;
                this.toString = i;
                this.valueOf = 0;
            }
            this.valueOf += i2;
            this.ag$a = i3;
            if (i5 >= 16) {
                toString(dirtypeforward, tostring);
            }
        }
    }

    public void toString(dirTypeForward dirtypeforward, dirTypeForward.toString tostring) {
        if (this.ah$a > 0) {
            dirtypeforward.valueOf(this.values, this.toString, this.valueOf, this.ag$a, tostring);
            this.ah$a = 0;
        }
    }
}
