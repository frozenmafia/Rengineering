package o;

import java.lang.reflect.Array;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class FloatArrayEvaluator {
    public static final <T> T[] ag$a(T[] tArr, int i) {
        runAnimators.ag$a(tArr, "reference");
        Object newInstance = Array.newInstance(tArr.getClass().getComponentType(), i);
        runAnimators.values(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (T[]) ((Object[]) newInstance);
    }

    public static final void ah$a(int i, int i2) {
        if (i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
    }
}
