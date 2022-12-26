package o;
/* loaded from: classes3.dex */
public final class getScrimColor {
    private final int ah$a;
    private final String toString;
    private final androidx.databinding.ObservableBoolean valueOf;

    public getScrimColor(androidx.databinding.ObservableBoolean observableBoolean, int i, String str) {
        runAnimators.ag$a(observableBoolean, "shouldShow");
        runAnimators.ag$a(str, "message");
        this.valueOf = observableBoolean;
        this.ah$a = i;
        this.toString = str;
    }

    public final androidx.databinding.ObservableBoolean ah$a() {
        return this.valueOf;
    }

    public final int valueOf() {
        return this.ah$a;
    }

    public final String values() {
        return this.toString;
    }
}
