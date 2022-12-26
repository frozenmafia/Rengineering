package o;

import com.google.firebase.database.collection.LLRBNode;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes5.dex */
public abstract class setEdgeEffectFactory<K, V> implements Iterable<Map.Entry<K, V>> {
    public abstract Iterator<Map.Entry<K, V>> HaptikSDK$a();

    public abstract int HaptikSDK$c();

    public abstract K ag$a();

    public abstract V ag$a(K k);

    public abstract K ah$a();

    public abstract boolean ah$a(K k);

    @Override // java.lang.Iterable
    public abstract Iterator<Map.Entry<K, V>> iterator();

    public abstract K valueOf(K k);

    public abstract Comparator<K> valueOf();

    public abstract setEdgeEffectFactory<K, V> values(K k);

    public abstract setEdgeEffectFactory<K, V> values(K k, V v);

    public abstract void values(LLRBNode.values<K, V> valuesVar);

    public abstract boolean values();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof setEdgeEffectFactory) {
            setEdgeEffectFactory setedgeeffectfactory = (setEdgeEffectFactory) obj;
            if (valueOf().equals(setedgeeffectfactory.valueOf()) && HaptikSDK$c() == setedgeeffectfactory.HaptikSDK$c()) {
                Iterator<Map.Entry<K, V>> it = iterator();
                Iterator<Map.Entry<K, V>> it2 = setedgeeffectfactory.iterator();
                while (it.hasNext()) {
                    if (!it.next().equals(it2.next())) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = valueOf().hashCode();
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            hashCode = (hashCode * 31) + it.next().hashCode();
        }
        return hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{");
        Iterator<Map.Entry<K, V>> it = iterator();
        boolean z = true;
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append("(");
            sb.append(next.getKey());
            sb.append("=>");
            sb.append(next.getValue());
            sb.append(")");
        }
        sb.append("};");
        return sb.toString();
    }

    /* loaded from: classes5.dex */
    public static class valueOf {
        private static final InterfaceC0354valueOf toString;

        /* renamed from: o.setEdgeEffectFactory$valueOf$valueOf */
        /* loaded from: classes5.dex */
        public interface InterfaceC0354valueOf<C, D> {
            D valueOf(C c);
        }

        public static /* synthetic */ Object valueOf(Object obj) {
            return obj;
        }

        public static <K, V> setEdgeEffectFactory<K, V> ah$a(Comparator<K> comparator) {
            return new setHasFixedSize(comparator);
        }

        static {
            InterfaceC0354valueOf interfaceC0354valueOf;
            interfaceC0354valueOf = setClipToPadding.values;
            toString = interfaceC0354valueOf;
        }

        public static <A> InterfaceC0354valueOf<A, A> valueOf() {
            return toString;
        }

        public static <A, B> setEdgeEffectFactory<A, B> toString(Map<A, B> map, Comparator<A> comparator) {
            if (map.size() < 25) {
                return setHasFixedSize.valueOf(map, comparator);
            }
            return setRecyclerListener.toString(map, comparator);
        }

        public static <A, B, C> setEdgeEffectFactory<A, C> valueOf(List<A> list, Map<B, C> map, InterfaceC0354valueOf<A, B> interfaceC0354valueOf, Comparator<A> comparator) {
            if (list.size() < 25) {
                return setHasFixedSize.toString(list, map, interfaceC0354valueOf, comparator);
            }
            return setRecyclerListener.valueOf(list, map, interfaceC0354valueOf, comparator);
        }
    }
}
