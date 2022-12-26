package kotlinx.coroutines.debug.internal;

import java.util.Map;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.readParcelable$ag$a;
/* loaded from: classes7.dex */
public final class ConcurrentWeakMap$entries$1 extends Lambda implements Transition<K, V, Map.Entry<K, V>> {
    public static final ConcurrentWeakMap$entries$1 INSTANCE = new ConcurrentWeakMap$entries$1();

    ConcurrentWeakMap$entries$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((ConcurrentWeakMap$entries$1) obj, obj2);
    }

    @Override // o.Transition
    public final Map.Entry<K, V> invoke(K k, V v) {
        return new readParcelable$ag$a(k, v);
    }
}
