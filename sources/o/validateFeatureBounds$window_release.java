package o;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes5.dex */
final class validateFeatureBounds$window_release {
    private static final List<validateFeatureBounds$window_release> valueOf = new ArrayList();
    validateFeatureBounds$window_release ah$a;
    getFOLD toString;
    Object values;

    private validateFeatureBounds$window_release(Object obj, getFOLD getfold) {
        this.values = obj;
        this.toString = getfold;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static validateFeatureBounds$window_release ag$a(getFOLD getfold, Object obj) {
        List<validateFeatureBounds$window_release> list = valueOf;
        synchronized (list) {
            int size = list.size();
            if (size > 0) {
                validateFeatureBounds$window_release remove = list.remove(size - 1);
                remove.values = obj;
                remove.toString = getfold;
                remove.ah$a = null;
                return remove;
            }
            return new validateFeatureBounds$window_release(obj, getfold);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void ah$a(validateFeatureBounds$window_release validatefeaturebounds_window_release) {
        validatefeaturebounds_window_release.values = null;
        validatefeaturebounds_window_release.toString = null;
        validatefeaturebounds_window_release.ah$a = null;
        List<validateFeatureBounds$window_release> list = valueOf;
        synchronized (list) {
            if (list.size() < 10000) {
                list.add(validatefeaturebounds_window_release);
            }
        }
    }
}
