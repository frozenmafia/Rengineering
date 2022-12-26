package o;
/* loaded from: classes3.dex */
public final class setBot {
    private String HaptikSDK$a;
    private String HaptikSDK$b;
    private final getWrapped HaptikSDK$c;
    private boolean ag$a;
    private final toPersistableBundle ah$a;
    private String ah$b;
    private String invoke;
    private String toString;
    private String valueOf;
    private final androidx.databinding.ObservableField<Boolean> values;

    public setBot(toPersistableBundle topersistablebundle, boolean z, String str, String str2, String str3, String str4, String str5, String str6, getWrapped getwrapped) {
        runAnimators.ag$a(topersistablebundle, "handler");
        runAnimators.ag$a(str, "fullStateName");
        runAnimators.ag$a(str2, "shortStatName");
        runAnimators.ag$a(str3, "HeaderText");
        runAnimators.ag$a(str4, "stateLevel");
        runAnimators.ag$a(str5, "stateType");
        runAnimators.ag$a(str6, "shortDisplayName");
        this.ah$a = topersistablebundle;
        this.ag$a = z;
        this.valueOf = str;
        this.HaptikSDK$b = str2;
        this.toString = str3;
        this.ah$b = str4;
        this.HaptikSDK$a = str5;
        this.invoke = str6;
        this.HaptikSDK$c = getwrapped;
        this.values = new androidx.databinding.ObservableField<>(false);
    }

    public /* synthetic */ setBot(toPersistableBundle topersistablebundle, boolean z, String str, String str2, String str3, String str4, String str5, String str6, getWrapped getwrapped, int i, getTargetTypes gettargettypes) {
        this(topersistablebundle, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) == 0 ? str6 : "", (i & 256) != 0 ? null : getwrapped);
    }

    public final toPersistableBundle values() {
        return this.ah$a;
    }

    public final boolean ah$b() {
        return this.ag$a;
    }

    public final void toString(boolean z) {
        this.ag$a = z;
    }

    public final String valueOf() {
        return this.valueOf;
    }

    public final void valueOf(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.valueOf = str;
    }

    public final String HaptikSDK$c() {
        return this.HaptikSDK$b;
    }

    public final void toString(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.HaptikSDK$b = str;
    }

    public final String ag$a() {
        return this.toString;
    }

    public final void values(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.toString = str;
    }

    public final void ah$a(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.ah$b = str;
    }

    public final void HaptikSDK$a(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.HaptikSDK$a = str;
    }

    public final String invoke() {
        return this.HaptikSDK$a;
    }

    public final String HaptikSDK$b() {
        return this.invoke;
    }

    public final void ag$a(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.invoke = str;
    }

    public final getWrapped HaptikSDK$a() {
        return this.HaptikSDK$c;
    }

    public final androidx.databinding.ObservableField<Boolean> ah$a() {
        return this.values;
    }
}
