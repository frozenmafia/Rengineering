package o;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class a {
    private final JSONObject valueOf = new JSONObject();
    private String HaptikSDK$a = "";
    private String HaptikSDK$b = "";
    private String ag$a = "";
    private String ah$a = "";
    private String values = "";
    private long toString = 1440;

    public final void ag$a(boolean z) {
        this.valueOf.put("no-header", z);
    }

    public final void ah$a(String str) {
        runAnimators.ag$a(str, "value");
        this.valueOf.put("custom-css", str);
    }

    public final void ah$a(boolean z) {
        this.valueOf.put("ignore-storage", z);
    }

    public final void valueOf(boolean z) {
        this.valueOf.put("locally-download-custom-css", z);
    }

    public final JSONObject values() {
        return this.valueOf;
    }

    public final void values(String str) {
        runAnimators.ag$a(str, "value");
        this.valueOf.put("initialize-language", str);
    }
}
