package o;
/* loaded from: classes3.dex */
final class LinkifyCompat$valueOf$ag$a {
    private int HaptikSDK$a;
    private boolean HaptikSDK$b;
    private boolean HaptikSDK$c;
    private int HaptikSDK$d;
    private int HaptikSDK$e;
    private int HaptikWebView;
    private boolean ag$a;
    private int ah$a;
    private boolean ah$b;
    private SparseIntArrayKt$keyIterator$1$ah$a ak;
    private boolean getInitSettings;
    private int getSignupData;
    private int invoke;
    private boolean toString;
    private int valueOf;
    private int values;

    private LinkifyCompat$valueOf$ag$a() {
    }

    public void ah$a() {
        this.HaptikSDK$c = false;
        this.getInitSettings = false;
    }

    public void ag$a(int i) {
        this.getSignupData = i;
        this.HaptikSDK$c = true;
    }

    public void ah$a(SparseIntArrayKt$keyIterator$1$ah$a sparseIntArrayKt$keyIterator$1$ah$a, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
        this.ak = sparseIntArrayKt$keyIterator$1$ah$a;
        this.HaptikSDK$d = i;
        this.getSignupData = i2;
        this.invoke = i3;
        this.HaptikWebView = i4;
        this.ah$b = z;
        this.toString = z2;
        this.ag$a = z3;
        this.HaptikSDK$b = z4;
        this.HaptikSDK$a = i5;
        this.HaptikSDK$e = i6;
        this.ah$a = i7;
        this.valueOf = i8;
        this.values = i9;
        this.getInitSettings = true;
        this.HaptikSDK$c = true;
    }

    public boolean values() {
        int i;
        return this.HaptikSDK$c && ((i = this.getSignupData) == 7 || i == 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ag$a(LinkifyCompat$valueOf$ag$a linkifyCompat$valueOf$ag$a) {
        int i;
        int i2;
        boolean z;
        if (this.getInitSettings) {
            if (linkifyCompat$valueOf$ag$a.getInitSettings) {
                SparseIntArrayKt$keyIterator$1$ah$a sparseIntArrayKt$keyIterator$1$ah$a = (SparseIntArrayKt$keyIterator$1$ah$a) FingerprintManagerCompat.ag$a(this.ak);
                SparseIntArrayKt$keyIterator$1$ah$a sparseIntArrayKt$keyIterator$1$ah$a2 = (SparseIntArrayKt$keyIterator$1$ah$a) FingerprintManagerCompat.ag$a(linkifyCompat$valueOf$ag$a.ak);
                return (this.invoke == linkifyCompat$valueOf$ag$a.invoke && this.HaptikWebView == linkifyCompat$valueOf$ag$a.HaptikWebView && this.ah$b == linkifyCompat$valueOf$ag$a.ah$b && (!this.toString || !linkifyCompat$valueOf$ag$a.toString || this.ag$a == linkifyCompat$valueOf$ag$a.ag$a) && (((i = this.HaptikSDK$d) == (i2 = linkifyCompat$valueOf$ag$a.HaptikSDK$d) || (i != 0 && i2 != 0)) && ((sparseIntArrayKt$keyIterator$1$ah$a.HaptikSDK$b != 0 || sparseIntArrayKt$keyIterator$1$ah$a2.HaptikSDK$b != 0 || (this.HaptikSDK$e == linkifyCompat$valueOf$ag$a.HaptikSDK$e && this.ah$a == linkifyCompat$valueOf$ag$a.ah$a)) && ((sparseIntArrayKt$keyIterator$1$ah$a.HaptikSDK$b != 1 || sparseIntArrayKt$keyIterator$1$ah$a2.HaptikSDK$b != 1 || (this.valueOf == linkifyCompat$valueOf$ag$a.valueOf && this.values == linkifyCompat$valueOf$ag$a.values)) && (z = this.HaptikSDK$b) == linkifyCompat$valueOf$ag$a.HaptikSDK$b && (!z || this.HaptikSDK$a == linkifyCompat$valueOf$ag$a.HaptikSDK$a))))) ? false : true;
            }
            return true;
        }
        return false;
    }
}
