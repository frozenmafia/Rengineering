package o;
/* renamed from: o.lifecycleEventObserver  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0382lifecycleEventObserver extends androidx.databinding.BaseObservable {
    @androidx.databinding.Bindable
    private String ah$a = "";
    @androidx.databinding.Bindable
    private int values;

    public final void toString(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.ah$a = str;
    }

    public final String valueOf() {
        return this.ah$a;
    }

    public final void values(int i) {
        this.values = i;
    }
}
