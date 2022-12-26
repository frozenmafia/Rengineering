package o;

import java.util.Collection;
import java.util.Iterator;
/* loaded from: classes5.dex */
public final class recycleData {
    public static <T> T[] valueOf(T[] tArr, int i) {
        return (T[]) getItemRangeInto.toString(tArr, i);
    }

    public static <T> T[] valueOf(Collection<?> collection, T[] tArr) {
        int size = collection.size();
        if (tArr.length < size) {
            tArr = (T[]) valueOf(tArr, size);
        }
        ah$a(collection, tArr);
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }

    public static <T> T[] valueOf(Object[] objArr, int i, int i2, T[] tArr) {
        markViewHoldersUpdated.ag$a(i, i + i2, objArr.length);
        if (tArr.length < i2) {
            tArr = (T[]) valueOf(tArr, i2);
        } else if (tArr.length > i2) {
            tArr[i2] = null;
        }
        System.arraycopy(objArr, i, tArr, 0, i2);
        return tArr;
    }

    public static Object[] toString(Collection<?> collection) {
        return ah$a(collection, new Object[collection.size()]);
    }

    private static Object[] ah$a(Iterable<?> iterable, Object[] objArr) {
        Iterator<?> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }

    public static Object[] ah$a(Object... objArr) {
        toString(objArr, objArr.length);
        return objArr;
    }

    public static Object[] toString(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            ah$a(objArr[i2], i2);
        }
        return objArr;
    }

    public static Object ah$a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append("at index ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
