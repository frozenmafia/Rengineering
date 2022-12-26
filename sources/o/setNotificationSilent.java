package o;
/* loaded from: classes.dex */
public class setNotificationSilent {
    private final Object ag$a;
    private final String ah$a;
    private setLocalOnly toString;
    private final int valueOf;
    private final int values;

    public setNotificationSilent(int i, String str, int i2, Object obj, setLocalOnly setlocalonly) {
        runAnimators.ag$a(str, "itemTitle");
        this.valueOf = i;
        this.ah$a = str;
        this.values = i2;
        this.ag$a = obj;
        this.toString = setlocalonly;
    }

    public final int values() {
        return this.valueOf;
    }

    public final String ah$a() {
        return this.ah$a;
    }

    public final int valueOf() {
        return this.values;
    }

    public final Object ah$b() {
        return this.ag$a;
    }

    public final setLocalOnly ag$a() {
        return this.toString;
    }
}
