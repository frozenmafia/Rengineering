package o;
/* loaded from: classes3.dex */
public final class getMeasuredHeightAndState extends getImportantForAccessibility {
    private Number ag$a;
    private Boolean toString;
    private Number valueOf;
    private Boolean values;

    public final Number ah$b() {
        return this.valueOf;
    }

    public final Number HaptikWebView() {
        return this.ag$a;
    }

    public final Boolean HaptikSDK$e() {
        return this.toString;
    }

    public final Boolean getSignupData() {
        return this.values;
    }

    public getMeasuredHeightAndState(String str, String str2, String str3, String str4, String str5, String str6, String str7, Number number, Number number2, Number number3, Boolean bool, Boolean bool2) {
        super(str, str2, str3, str4, str5, str6, str7, number);
        this.valueOf = number2;
        this.ag$a = number3;
        this.toString = bool;
        this.values = bool2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public getMeasuredHeightAndState(setContentChangeTypes setcontentchangetypes, String str, String str2, String str3, String str4, String str5, Number number, Number number2, Boolean bool, Boolean bool2) {
        this(str, str2, str3, str4, str5, setcontentchangetypes.HaptikSDK$b(), setcontentchangetypes.valueOf(), setcontentchangetypes.getDefaultImpl(), number, number2, bool, bool2);
        runAnimators.valueOf(setcontentchangetypes, easypay.manager.Constants.EASY_PAY_CONFIG_PREF_KEY);
    }

    @Override // o.getImportantForAccessibility
    public void values(setBackgroundTintMode setbackgroundtintmode) {
        runAnimators.valueOf(setbackgroundtintmode, "writer");
        super.values(setbackgroundtintmode);
        setbackgroundtintmode.ag$a("duration").values(this.valueOf);
        setbackgroundtintmode.ag$a("durationInForeground").values(this.ag$a);
        setbackgroundtintmode.ag$a("inForeground").valueOf(this.toString);
        setbackgroundtintmode.ag$a("isLaunching").valueOf(this.values);
    }
}
