package o;

import java.util.Arrays;
/* loaded from: classes5.dex */
public final class recycleUpdateOp extends consumeUpdatesInOnePass {
    public static boolean values(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int valueOf(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
