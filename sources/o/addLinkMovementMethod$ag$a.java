package o;

import com.google.android.exoplayer2.C;
/* loaded from: classes3.dex */
final class addLinkMovementMethod$ag$a {
    private boolean HaptikSDK$a;
    private final dirTypeForward HaptikSDK$b;
    private long HaptikSDK$c;
    private long HaptikSDK$d;
    private long HaptikWebView;
    private boolean ag$a;
    private boolean ah$a;
    private boolean ah$b;
    private boolean getSignupData;
    private long invoke;
    private boolean toString;
    private int valueOf;
    private boolean values;

    private static boolean toString(int i) {
        return i < 32 || i == 40;
    }

    private static boolean values(int i) {
        return (32 <= i && i <= 35) || i == 39;
    }

    public addLinkMovementMethod$ag$a(dirTypeForward dirtypeforward) {
        this.HaptikSDK$b = dirtypeforward;
    }

    public void values() {
        this.ah$a = false;
        this.ag$a = false;
        this.toString = false;
        this.ah$b = false;
        this.HaptikSDK$a = false;
    }

    public void valueOf(long j, int i, int i2, long j2, boolean z) {
        boolean z2 = false;
        this.ag$a = false;
        this.toString = false;
        this.invoke = j2;
        this.valueOf = 0;
        this.HaptikSDK$c = j;
        if (!toString(i2)) {
            if (this.ah$b && !this.HaptikSDK$a) {
                if (z) {
                    ag$a(i);
                }
                this.ah$b = false;
            }
            if (values(i2)) {
                this.toString = !this.HaptikSDK$a;
                this.HaptikSDK$a = true;
            }
        }
        boolean z3 = i2 >= 16 && i2 <= 21;
        this.values = z3;
        this.ah$a = (z3 || i2 <= 9) ? true : true;
    }

    public void ag$a(byte[] bArr, int i, int i2) {
        if (this.ah$a) {
            int i3 = this.valueOf;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                this.ag$a = (bArr[i4] & 128) != 0;
                this.ah$a = false;
                return;
            }
            this.valueOf = i3 + (i2 - i);
        }
    }

    public void toString(long j, int i, boolean z) {
        if (this.HaptikSDK$a && this.ag$a) {
            this.getSignupData = this.values;
            this.HaptikSDK$a = false;
        } else if (this.toString || this.ag$a) {
            if (z && this.ah$b) {
                ag$a(i + ((int) (j - this.HaptikSDK$c)));
            }
            this.HaptikSDK$d = this.HaptikSDK$c;
            this.HaptikWebView = this.invoke;
            this.getSignupData = this.values;
            this.ah$b = true;
        }
    }

    private void ag$a(int i) {
        long j = this.HaptikWebView;
        if (j == C.TIME_UNSET) {
            return;
        }
        boolean z = this.getSignupData;
        this.HaptikSDK$b.valueOf(j, z ? 1 : 0, (int) (this.HaptikSDK$c - this.HaptikSDK$d), i, null);
    }
}
