package o;
/* loaded from: classes3.dex */
public class getChildren extends androidx.databinding.BaseObservable {
    private String ah$a;
    private boolean values = false;
    private boolean toString = false;

    @androidx.databinding.Bindable
    public String ag$a() {
        return this.ah$a;
    }

    public void toString(String str) {
        this.ah$a = str;
        notifyPropertyChanged(androidx.databinding.library.baseAdapters.BR.vpaId);
        ah$a(str.length() > 0);
    }

    @androidx.databinding.Bindable
    public boolean values() {
        return this.values;
    }

    public void ah$a(boolean z) {
        this.values = z;
        notifyPropertyChanged(293);
    }
}
