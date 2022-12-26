package o;
/* loaded from: classes5.dex */
public final class getPageSize {
    public static final getPageSize HaptikSDK$c;
    public static final getPageSize ah$a;
    public static final getPageSize ah$b;
    public static final getPageSize invoke;
    public static final getPageSize toString;
    public static final getPageSize valueOf;
    private final int[] HaptikSDK$a;
    private final int HaptikSDK$b;
    private final int[] HaptikSDK$d;
    private final getPath HaptikSDK$e;
    private final int HaptikWebView;
    private final int getInitSettings;
    private final getPath getSignupData;
    public static final getPageSize ag$a = new getPageSize(4201, 4096, 1);
    public static final getPageSize values = new getPageSize(1033, 1024, 1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int ah$a(int i, int i2) {
        return i ^ i2;
    }

    static {
        getPageSize getpagesize = new getPageSize(67, 64, 1);
        valueOf = getpagesize;
        toString = new getPageSize(19, 16, 1);
        HaptikSDK$c = new getPageSize(285, 256, 0);
        getPageSize getpagesize2 = new getPageSize(301, 256, 1);
        ah$b = getpagesize2;
        ah$a = getpagesize2;
        invoke = getpagesize;
    }

    public getPageSize(int i, int i2, int i3) {
        this.getInitSettings = i;
        this.HaptikWebView = i2;
        this.HaptikSDK$b = i3;
        this.HaptikSDK$a = new int[i2];
        this.HaptikSDK$d = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.HaptikSDK$a[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.HaptikSDK$d[this.HaptikSDK$a[i6]] = i6;
        }
        this.HaptikSDK$e = new getPath(this, new int[]{0});
        this.getSignupData = new getPath(this, new int[]{1});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public getPath ag$a() {
        return this.HaptikSDK$e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public getPath toString(int i, int i2) {
        if (i >= 0) {
            if (i2 == 0) {
                return this.HaptikSDK$e;
            }
            int[] iArr = new int[i + 1];
            iArr[0] = i2;
            return new getPath(this, iArr);
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int toString(int i) {
        return this.HaptikSDK$a[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int ag$a(int i) {
        if (i == 0) {
            throw new IllegalArgumentException();
        }
        return this.HaptikSDK$d[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int valueOf(int i) {
        if (i == 0) {
            throw new ArithmeticException();
        }
        return this.HaptikSDK$a[(this.HaptikWebView - this.HaptikSDK$d[i]) - 1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int valueOf(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.HaptikSDK$a;
        int[] iArr2 = this.HaptikSDK$d;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.HaptikWebView - 1)];
    }

    public int valueOf() {
        return this.HaptikSDK$b;
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.getInitSettings) + ',' + this.HaptikWebView + ')';
    }
}
