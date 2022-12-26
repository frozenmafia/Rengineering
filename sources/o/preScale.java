package o;

import java.util.Arrays;
import java.util.List;
/* loaded from: classes5.dex */
public final class preScale {
    public static final <E> E[] toString(int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException("capacity must be non-negative.".toString());
        }
        return (E[]) new Object[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> String values(T[] tArr, int i, int i2) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(tArr[i + i3]);
        }
        sb.append("]");
        String sb2 = sb.toString();
        runAnimators.ah$a(sb2, "sb.toString()");
        return sb2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> int ag$a(T[] tArr, int i, int i2) {
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            T t = tArr[i + i4];
            i3 = (i3 * 31) + (t != null ? t.hashCode() : 0);
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean ag$a(T[] tArr, int i, int i2, List<?> list) {
        if (i2 != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!runAnimators.values(tArr[i + i3], list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public static final <T> T[] valueOf(T[] tArr, int i) {
        runAnimators.ag$a(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i);
        runAnimators.ah$a(tArr2, "copyOf(this, newSize)");
        runAnimators.values((Object) tArr2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.builders.ListBuilderKt.copyOfUninitializedElements>");
        return tArr2;
    }

    public static final <E> void values(E[] eArr, int i) {
        runAnimators.ag$a(eArr, "<this>");
        eArr[i] = null;
    }

    public static final <E> void ah$a(E[] eArr, int i, int i2) {
        runAnimators.ag$a(eArr, "<this>");
        while (i < i2) {
            values(eArr, i);
            i++;
        }
    }
}
