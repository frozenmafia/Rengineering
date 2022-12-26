package o;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public final class onActivityCreated extends androidx.databinding.BaseObservable {
    private List<getPerformStopActivity2Params$ah$a> ah$a = new ArrayList();
    private androidx.databinding.ObservableBoolean toString = new androidx.databinding.ObservableBoolean();

    public final void ah$a(List<getPerformStopActivity2Params$ah$a> list) {
        runAnimators.ag$a(list, "<set-?>");
        this.ah$a = list;
    }

    public final androidx.databinding.ObservableBoolean values() {
        return this.toString;
    }
}
