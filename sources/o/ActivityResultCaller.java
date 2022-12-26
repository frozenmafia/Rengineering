package o;

import java.math.BigDecimal;
import java.util.List;
import o.ExtensionInterfaceCompat;
/* loaded from: classes.dex */
public final class ActivityResultCaller {
    public static final ActivityResultCaller ag$a = new ActivityResultCaller();

    private ActivityResultCaller() {
    }

    public static final int ag$a(Object obj, Object obj2) {
        ActivityResultCaller activityResultCaller = ag$a;
        return activityResultCaller.ag$a(obj) - activityResultCaller.ag$a(obj2);
    }

    private final int ag$a(Object obj) {
        if (obj == null) {
            return 4;
        }
        if (obj instanceof String) {
            return ExtensionInterfaceCompat.ExtensionCallbackInterface.toString((String) obj).length;
        }
        if (obj instanceof Boolean) {
            return 16;
        }
        if (obj instanceof BigDecimal) {
            return 32;
        }
        if (!(obj instanceof List)) {
            if (obj instanceof ContextAwareHelper) {
                return 16 + ExtensionInterfaceCompat.ExtensionCallbackInterface.toString(((ContextAwareHelper) obj).values()).length;
            }
            throw new IllegalStateException(("Unknown field type in Record. " + setPropagation.values(obj.getClass()).values()).toString());
        }
        int i = 0;
        for (Object obj2 : (Iterable) obj) {
            i += ag$a.ag$a(obj2);
        }
        return 16 + i;
    }
}
