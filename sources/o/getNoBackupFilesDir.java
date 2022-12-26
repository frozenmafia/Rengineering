package o;

import com.app.dream11.teamselection.newcreateteam.SortType;
/* loaded from: classes3.dex */
public final class getNoBackupFilesDir extends androidx.databinding.BaseObservable {
    @androidx.databinding.Bindable
    private boolean ah$a;
    private boolean valueOf;
    private String ag$a = "";
    private SortType values = SortType.NONE;
    private androidx.databinding.ObservableField<Boolean> toString = new androidx.databinding.ObservableField<>(false);

    public int hashCode() {
        boolean z = this.valueOf;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        boolean z = this.valueOf;
        return "NewSortingVM(fake=" + z + ")";
    }

    public getNoBackupFilesDir(boolean z) {
        this.valueOf = z;
    }

    @androidx.databinding.Bindable
    public final String values() {
        return this.ag$a;
    }

    public final void ah$a(String str) {
        runAnimators.ag$a(str, "value");
        this.ag$a = str;
        notifyPropertyChanged(androidx.databinding.library.baseAdapters.BR.sortLabel);
    }

    public final SortType ag$a() {
        return this.values;
    }

    public final void valueOf(SortType sortType) {
        runAnimators.ag$a(sortType, "value");
        this.values = sortType;
        notifyPropertyChanged(androidx.databinding.library.baseAdapters.BR.sortActive);
        notifyPropertyChanged(9);
    }

    public final void ah$a(boolean z) {
        this.ah$a = z;
        if (!z) {
            HaptikSDK$b();
        } else {
            ah$b();
        }
    }

    public final androidx.databinding.ObservableField<Boolean> ah$a() {
        return this.toString;
    }

    private final void HaptikSDK$b() {
        valueOf(SortType.NONE);
        notifyPropertyChanged(androidx.databinding.library.baseAdapters.BR.sortActive);
    }

    private final void ah$b() {
        SortType sortType;
        if (this.values == SortType.DOWN) {
            sortType = SortType.UP;
        } else {
            sortType = SortType.DOWN;
        }
        valueOf(sortType);
    }

    public boolean equals(Object obj) {
        return (obj instanceof getNoBackupFilesDir) && runAnimators.values((Object) ((getNoBackupFilesDir) obj).values(), (Object) values());
    }

    @androidx.databinding.Bindable
    public final boolean HaptikSDK$a() {
        return this.values != SortType.NONE;
    }

    @androidx.databinding.Bindable
    public final boolean valueOf() {
        return this.values == SortType.UP;
    }
}
