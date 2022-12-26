package o;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
/* loaded from: classes.dex */
public class getParents {
    public static final <T> List<T> ag$a(T t) {
        List<T> singletonList = Collections.singletonList(t);
        runAnimators.ah$a(singletonList, "singletonList(element)");
        return singletonList;
    }

    public static final <E> List<E> values() {
        return new ListBuilder();
    }

    public static final <E> List<E> ah$a(int i) {
        return new ListBuilder(i);
    }

    public static final <E> List<E> values(List<E> list) {
        runAnimators.ag$a(list, "builder");
        return ((ListBuilder) list).build();
    }

    public static final <T> Object[] valueOf(T[] tArr, boolean z) {
        runAnimators.ag$a(tArr, "<this>");
        if (z && runAnimators.values(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        runAnimators.ah$a(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }
}
