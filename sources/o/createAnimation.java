package o;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import o.Transition;
/* loaded from: classes7.dex */
public abstract class createAnimation<K, V> extends AbstractMap<K, V> implements Map<K, V>, Transition.EpicenterCallback {
    public abstract Set valueOf();

    public Collection<Object> HaptikSDK$b() {
        return super.values();
    }

    public int ag$a() {
        return super.size();
    }

    public Set<Object> ah$a() {
        return super.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return valueOf();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        return (Set<K>) ah$a();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return ag$a();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        return (Collection<V>) HaptikSDK$b();
    }
}
