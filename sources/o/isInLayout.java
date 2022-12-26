package o;

import android.os.Build;
/* loaded from: classes3.dex */
public final class isInLayout {
    public static final values values = new values(null);
    private final String HaptikSDK$a;
    private final String HaptikSDK$b;
    private final String HaptikSDK$c;
    private final String ag$a;
    private final String[] ah$a;
    private final String ah$b;
    private final String invoke;
    private final String toString;
    private final Integer valueOf;

    public isInLayout(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String[] strArr) {
        this.HaptikSDK$c = str;
        this.HaptikSDK$a = str2;
        this.ah$b = str3;
        this.valueOf = num;
        this.HaptikSDK$b = str4;
        this.toString = str5;
        this.invoke = str6;
        this.ag$a = str7;
        this.ah$a = strArr;
    }

    public final String HaptikSDK$a() {
        return this.HaptikSDK$c;
    }

    public final String invoke() {
        return this.HaptikSDK$a;
    }

    public final String HaptikSDK$b() {
        return this.ah$b;
    }

    public final Integer ah$a() {
        return this.valueOf;
    }

    public final String HaptikSDK$c() {
        return this.HaptikSDK$b;
    }

    public final String values() {
        return this.toString;
    }

    public final String ah$b() {
        return this.invoke;
    }

    public final String ag$a() {
        return this.ag$a;
    }

    public final String[] valueOf() {
        return this.ah$a;
    }

    /* loaded from: classes3.dex */
    public static final class values {
        private values() {
        }

        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }

        public final isInLayout ag$a() {
            return new isInLayout(Build.MANUFACTURER, Build.MODEL, Build.VERSION.RELEASE, Integer.valueOf(Build.VERSION.SDK_INT), Build.DISPLAY, Build.FINGERPRINT, Build.TAGS, Build.BRAND, Build.VERSION.SDK_INT >= 21 ? Build.SUPPORTED_ABIS : new String[]{Build.CPU_ABI, Build.CPU_ABI2});
        }
    }
}
