package o;

import java.util.Collection;
/* loaded from: classes3.dex */
class getRotationY {
    getRotationY() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> boolean valueOf(Collection<T> collection) {
        if (collection == null) {
            return true;
        }
        for (T t : collection) {
            if (t == null) {
                return true;
            }
        }
        return false;
    }
}
