package o;
/* loaded from: classes4.dex */
public class hasActiveObservers extends androidx.databinding.BaseObservable {
    private int ah$a;
    private String toString = "";
    @androidx.databinding.Bindable
    private boolean values;

    public final String values() {
        return this.toString;
    }

    public final void values(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.toString = str;
    }

    public final void ah$a(boolean z) {
        this.values = z;
    }

    public final boolean valueOf() {
        return this.values;
    }

    public final int ah$a() {
        return this.ah$a;
    }

    public final void valueOf(int i) {
        this.ah$a = i;
    }
}
