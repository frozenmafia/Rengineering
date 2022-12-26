package o;
/* loaded from: classes.dex */
public class sendCaptioningEnabled {
    private final String ag$a;
    public final float ah$a;
    public final float values;

    public sendCaptioningEnabled(String str, float f, float f2) {
        this.ag$a = str;
        this.values = f2;
        this.ah$a = f;
    }

    public boolean ah$a(String str) {
        if (this.ag$a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.ag$a.endsWith("\r")) {
            String str2 = this.ag$a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
