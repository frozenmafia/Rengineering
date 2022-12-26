package o;

import com.google.common.collect.CompactHashMap;
import com.google.common.collect.CompactHashSet;
import com.google.common.collect.CompactLinkedHashMap;
import com.google.common.collect.CompactLinkedHashSet;
import com.google.common.collect.MapMaker;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
/* loaded from: classes5.dex */
public final class getItemRangeInto {
    public static <K, V> Map<K, V> values(int i) {
        return CompactHashMap.createWithExpectedSize(i);
    }

    public static <K, V> Map<K, V> valueOf(int i) {
        return CompactLinkedHashMap.createWithExpectedSize(i);
    }

    public static <E> Set<E> ag$a(int i) {
        return CompactHashSet.createWithExpectedSize(i);
    }

    public static <E> Set<E> ah$a(int i) {
        return CompactLinkedHashSet.createWithExpectedSize(i);
    }

    public static <E> Set<E> ag$a() {
        return CompactHashSet.create();
    }

    public static <T> T[] toString(T[] tArr, int i) {
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
    }

    public static <T> T[] toString(Object[] objArr, int i, int i2, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i, i2, tArr.getClass());
    }

    public static MapMaker ag$a(MapMaker mapMaker) {
        return mapMaker.ah$b();
    }
}
