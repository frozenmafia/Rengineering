package o;

import java.util.Set;
/* loaded from: classes7.dex */
public class OnConflictStrategy {
    public static <T extends startMultiInstanceInvalidation> boolean valueOf(Set<startMultiInstanceInvalidation> set, Class<T> cls) {
        if (set == null || set.isEmpty()) {
            return false;
        }
        for (startMultiInstanceInvalidation startmultiinstanceinvalidation : set) {
            if (startmultiinstanceinvalidation.getClass().isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }
}
