package o;
/* loaded from: classes5.dex */
public class setKeysetPrefName {
    float ag$a;
    float ah$a;
    float toString;
    float valueOf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setKeysetPrefName(float f, float f2, float f3, float f4) {
        this.ag$a = f;
        this.valueOf = f2;
        this.toString = f3;
        this.ah$a = f4;
    }

    public boolean ah$a(setKeysetPrefName setkeysetprefname) {
        if (this == setkeysetprefname) {
            return true;
        }
        return this.ag$a == setkeysetprefname.ag$a && this.valueOf == setkeysetprefname.valueOf && this.toString == setkeysetprefname.toString && this.ah$a == setkeysetprefname.ah$a;
    }
}
