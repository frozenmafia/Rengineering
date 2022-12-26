package o;

import com.app.dream11.teamselection.newcreateteam.SortingOrder;
import com.app.dream11.teamselection.newcreateteam.SortingType;
/* loaded from: classes3.dex */
public final class getSystemServiceName extends androidx.databinding.BaseObservable {
    private Object ag$a;
    private final String ah$a;
    @androidx.databinding.Bindable
    private SortingType toString;
    @androidx.databinding.Bindable
    private SortingOrder valueOf;
    @androidx.databinding.Bindable
    private String values;

    public getSystemServiceName(String str, SortingType sortingType, SortingOrder sortingOrder, Object obj, String str2) {
        runAnimators.ag$a(str, "sortLabel");
        runAnimators.ag$a(sortingType, "sortType");
        runAnimators.ag$a(sortingOrder, "sortOrder");
        runAnimators.ag$a(str2, "evSortLabel");
        this.toString = sortingType;
        this.ag$a = obj;
        this.ah$a = str2;
        this.values = str;
        this.valueOf = sortingOrder;
    }

    public /* synthetic */ getSystemServiceName(String str, SortingType sortingType, SortingOrder sortingOrder, Object obj, String str2, int i, getTargetTypes gettargettypes) {
        this(str, sortingType, sortingOrder, obj, (i & 16) != 0 ? str : str2);
    }

    public final SortingType ag$a() {
        return this.toString;
    }

    public final Object ah$b() {
        return this.ag$a;
    }

    public final String valueOf() {
        return this.ah$a;
    }

    public final String ah$a() {
        return this.values;
    }

    public final void toString(String str) {
        runAnimators.ag$a(str, "value");
        this.values = str;
        notifyPropertyChanged(androidx.databinding.library.baseAdapters.BR.sortLabel);
    }

    public final SortingOrder values() {
        return this.valueOf;
    }

    public final void ah$a(SortingOrder sortingOrder) {
        runAnimators.ag$a(sortingOrder, "value");
        this.valueOf = sortingOrder;
        notifyPropertyChanged(androidx.databinding.library.baseAdapters.BR.sortOrder);
    }
}
