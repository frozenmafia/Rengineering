package o;
/* loaded from: classes.dex */
public final class positionCartAttributes {
    private final int HaptikSDK$b;
    private final int ag$a;
    private boolean ah$a;
    private final boolean toString;
    private String invoke = "";
    private String valueOf = "-1";
    private String values = "";

    public positionCartAttributes(int i, int i2, boolean z, boolean z2) {
        this.ag$a = i;
        this.HaptikSDK$b = i2;
        this.toString = z;
        this.ah$a = z2;
    }

    public final boolean ag$a() {
        return this.toString;
    }

    public final int ah$a() {
        return this.ag$a;
    }

    public final void ah$a(boolean z) {
        this.ah$a = z;
    }

    public final int valueOf() {
        return this.HaptikSDK$b;
    }

    public final boolean values() {
        return this.ah$a;
    }

    public final void ah$a(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.invoke = str;
    }

    public final void toString(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.valueOf = str;
    }

    public final void valueOf(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.values = str;
    }
}
