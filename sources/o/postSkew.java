package o;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.SlidingWindowKt$windowedIterator$1;
/* loaded from: classes7.dex */
public final class postSkew {
    public static final void valueOf(int i, int i2) {
        String str;
        if (i > 0 && i2 > 0) {
            return;
        }
        if (i != i2) {
            str = "Both size " + i + " and step " + i2 + " must be greater than zero.";
        } else {
            str = "size " + i + " must be greater than zero.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public static final <T> Iterator<List<T>> values(Iterator<? extends T> it, int i, int i2, boolean z, boolean z2) {
        runAnimators.ag$a(it, "iterator");
        return !it.hasNext() ? fetchAddGhostMethod.values : transformMatrixToGlobal.valueOf(new SlidingWindowKt$windowedIterator$1(i, i2, it, z2, z, null));
    }
}
