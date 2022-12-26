package o;
/* loaded from: classes3.dex */
public final class SubscriptionManagerCompat$ag$a {
    public int HaptikSDK$c;
    public int ag$a;
    public int ah$a;
    public int ah$b;
    public int toString;
    public String valueOf;
    public int values;

    public boolean ah$a(int i) {
        boolean valueOf;
        int i2;
        int i3;
        int i4;
        int i5;
        String[] strArr;
        int[] iArr;
        int subscriptionManagerCompat;
        int[] iArr2;
        int[] iArr3;
        int i6;
        int[] iArr4;
        int[] iArr5;
        int i7;
        int[] iArr6;
        valueOf = SubscriptionManagerCompat.valueOf(i);
        if (!valueOf || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.HaptikSDK$c = i2;
        strArr = SubscriptionManagerCompat.HaptikSDK$b;
        this.valueOf = strArr[3 - i3];
        iArr = SubscriptionManagerCompat.HaptikSDK$c;
        int i8 = iArr[i5];
        this.ah$a = i8;
        if (i2 == 2) {
            this.ah$a = i8 / 2;
        } else if (i2 == 0) {
            this.ah$a = i8 / 4;
        }
        int i9 = (i >>> 9) & 1;
        subscriptionManagerCompat = SubscriptionManagerCompat.toString(i2, i3);
        this.ah$b = subscriptionManagerCompat;
        if (i3 == 3) {
            if (i2 == 3) {
                iArr6 = SubscriptionManagerCompat.ag$a;
                i7 = iArr6[i4 - 1];
            } else {
                iArr5 = SubscriptionManagerCompat.ah$a;
                i7 = iArr5[i4 - 1];
            }
            this.values = i7;
            this.ag$a = (((i7 * 12) / this.ah$a) + i9) * 4;
        } else {
            if (i2 != 3) {
                iArr2 = SubscriptionManagerCompat.values;
                int i10 = iArr2[i4 - 1];
                this.values = i10;
                this.ag$a = (((i3 == 1 ? 72 : 144) * i10) / this.ah$a) + i9;
            } else {
                if (i3 == 2) {
                    iArr4 = SubscriptionManagerCompat.valueOf;
                    i6 = iArr4[i4 - 1];
                } else {
                    iArr3 = SubscriptionManagerCompat.toString;
                    i6 = iArr3[i4 - 1];
                }
                this.values = i6;
                this.ag$a = ((i6 * 144) / this.ah$a) + i9;
            }
        }
        this.toString = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
