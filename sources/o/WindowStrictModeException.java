package o;

import androidx.databinding.ObservableList;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class WindowStrictModeException {
    static final ReferenceQueue<Object> ag$a = new ReferenceQueue<>();
    static WindowStrictModeException$ah$a ah$a;

    WindowStrictModeException() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, A extends ActivityFilter<T>> WeakReference<A> ag$a(A a, androidx.databinding.ObservableList<T> observableList, ObservableList.OnListChangedCallback onListChangedCallback) {
        WindowStrictModeException$ah$a windowStrictModeException$ah$a = ah$a;
        if (windowStrictModeException$ah$a == null || !windowStrictModeException$ah$a.isAlive()) {
            WindowStrictModeException$ah$a windowStrictModeException$ah$a2 = new WindowStrictModeException$ah$a();
            ah$a = windowStrictModeException$ah$a2;
            windowStrictModeException$ah$a2.start();
        }
        return new WindowStrictModeException$ag$a(a, observableList, onListChangedCallback);
    }
}
