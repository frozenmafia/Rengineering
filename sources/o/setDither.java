package o;
/* loaded from: classes.dex */
public class setDither extends androidx.databinding.BaseObservable {
    public boolean values;

    @androidx.databinding.Bindable
    public boolean valueOf() {
        return this.values;
    }

    public void values(boolean z) {
        this.values = z;
        notifyPropertyChanged(214);
    }
}
