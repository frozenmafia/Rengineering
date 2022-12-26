package o;

import java.util.Iterator;
/* loaded from: classes5.dex */
public final class excludeTarget {
    public static final <T> Iterator<T> valueOf(T[] tArr) {
        runAnimators.ag$a(tArr, "array");
        return new createAnimators(tArr);
    }
}
