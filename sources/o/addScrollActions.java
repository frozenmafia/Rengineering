package o;
/* loaded from: classes5.dex */
public final class addScrollActions {
    private final boolean HaptikSDK$a;
    private final boolean HaptikSDK$b;
    private final boolean HaptikSDK$c;
    private final boolean HaptikSDK$e;
    private final boolean HaptikWebView;
    private final String ag$a;
    private final boolean ah$a;
    private final String ah$b;
    private final boolean invoke;
    private final boolean toString;
    private final boolean valueOf;
    private final boolean values;

    public addScrollActions() {
        this(false, false, false, false, false, false, null, false, false, null, false, false, 4095, null);
    }

    public addScrollActions(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, boolean z7, boolean z8, String str2, boolean z9, boolean z10) {
        runAnimators.ag$a(str, "prettyPrintIndent");
        runAnimators.ag$a(str2, "classDiscriminator");
        this.ah$a = z;
        this.HaptikSDK$c = z2;
        this.HaptikSDK$a = z3;
        this.toString = z4;
        this.invoke = z5;
        this.HaptikSDK$b = z6;
        this.ah$b = str;
        this.valueOf = z7;
        this.HaptikSDK$e = z8;
        this.ag$a = str2;
        this.values = z9;
        this.HaptikWebView = z10;
    }

    public /* synthetic */ addScrollActions(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, boolean z7, boolean z8, String str2, boolean z9, boolean z10, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? true : z6, (i & 64) != 0 ? "    " : str, (i & 128) != 0 ? false : z7, (i & 256) != 0 ? false : z8, (i & 512) != 0 ? "type" : str2, (i & 1024) == 0 ? z9 : false, (i & 2048) == 0 ? z10 : true);
    }

    public final boolean HaptikSDK$a() {
        return this.ah$a;
    }

    public final boolean invoke() {
        return this.HaptikSDK$c;
    }

    public final boolean getSignupData() {
        return this.HaptikSDK$a;
    }

    public final boolean values() {
        return this.toString;
    }

    public final boolean HaptikSDK$c() {
        return this.invoke;
    }

    public final boolean HaptikSDK$b() {
        return this.HaptikSDK$b;
    }

    public final String ah$b() {
        return this.ah$b;
    }

    public final boolean ah$a() {
        return this.valueOf;
    }

    public final boolean getInitSettings() {
        return this.HaptikSDK$e;
    }

    public final String ag$a() {
        return this.ag$a;
    }

    public final boolean valueOf() {
        return this.values;
    }

    public final boolean HaptikWebView() {
        return this.HaptikWebView;
    }

    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.ah$a + ", ignoreUnknownKeys=" + this.HaptikSDK$c + ", isLenient=" + this.HaptikSDK$a + ", allowStructuredMapKeys=" + this.toString + ", prettyPrint=" + this.invoke + ", explicitNulls=" + this.HaptikSDK$b + ", prettyPrintIndent='" + this.ah$b + "', coerceInputValues=" + this.valueOf + ", useArrayPolymorphism=" + this.HaptikSDK$e + ", classDiscriminator='" + this.ag$a + "', allowSpecialFloatingPointValues=" + this.values + ')';
    }
}
