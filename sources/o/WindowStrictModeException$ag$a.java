package o;

import androidx.databinding.ObservableList;
import java.lang.ref.WeakReference;
import o.ActivityFilter;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class WindowStrictModeException$ag$a<T, A extends ActivityFilter<T>> extends WeakReference<A> {
    private final ObservableList.OnListChangedCallback ag$a;
    private final androidx.databinding.ObservableList<T> valueOf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public WindowStrictModeException$ag$a(A a, androidx.databinding.ObservableList<T> observableList, ObservableList.OnListChangedCallback onListChangedCallback) {
        super(a, WindowStrictModeException.ag$a);
        this.valueOf = observableList;
        this.ag$a = onListChangedCallback;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void valueOf() {
        this.valueOf.removeOnListChangedCallback(this.ag$a);
    }
}
