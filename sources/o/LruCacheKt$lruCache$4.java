package o;
/* loaded from: classes3.dex */
public final class LruCacheKt$lruCache$4 {
    private final String HaptikSDK$a;
    private final String HaptikSDK$c;
    private final String ag$a;
    private boolean ah$a;
    private final int invoke;
    private final boolean toString;
    private final getAlphabeticModifiers valueOf;
    private final int values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LruCacheKt$lruCache$4) {
            LruCacheKt$lruCache$4 lruCacheKt$lruCache$4 = (LruCacheKt$lruCache$4) obj;
            return runAnimators.values(this.valueOf, lruCacheKt$lruCache$4.valueOf) && runAnimators.values((Object) this.ag$a, (Object) lruCacheKt$lruCache$4.ag$a) && this.toString == lruCacheKt$lruCache$4.toString && this.invoke == lruCacheKt$lruCache$4.invoke && this.values == lruCacheKt$lruCache$4.values;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.valueOf.hashCode();
        int hashCode2 = this.ag$a.hashCode();
        boolean z = this.toString;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + i) * 31) + this.invoke) * 31) + this.values;
    }

    public String toString() {
        getAlphabeticModifiers getalphabeticmodifiers = this.valueOf;
        String str = this.ag$a;
        boolean z = this.toString;
        int i = this.invoke;
        int i2 = this.values;
        return "HOFWinnerCardPerformanceData(performanceCommonParams=" + getalphabeticmodifiers + ", eventName=" + str + ", isPerformanceEventsTriggered=" + z + ", position=" + i + ", maxPos=" + i2 + ")";
    }

    public LruCacheKt$lruCache$4(getAlphabeticModifiers getalphabeticmodifiers, String str, boolean z, int i, int i2) {
        runAnimators.ag$a(getalphabeticmodifiers, "performanceCommonParams");
        runAnimators.ag$a(str, "eventName");
        this.valueOf = getalphabeticmodifiers;
        this.ag$a = str;
        this.toString = z;
        this.invoke = i;
        this.values = i2;
        this.HaptikSDK$a = !z ? expandActionView.toString.HaptikWebView(i + 1) : "";
        this.HaptikSDK$c = z ? "" : expandActionView.toString.getInitSettings(i + 1);
    }

    public final getAlphabeticModifiers values() {
        return this.valueOf;
    }

    public final String ag$a() {
        return this.ag$a;
    }

    public final boolean ah$a() {
        if (!this.toString && !this.ah$a) {
            this.ah$a = true;
            if (this.invoke < this.values) {
                return true;
            }
        }
        return false;
    }

    public final String valueOf() {
        return this.HaptikSDK$a;
    }

    public final String HaptikSDK$b() {
        return this.HaptikSDK$c;
    }
}
