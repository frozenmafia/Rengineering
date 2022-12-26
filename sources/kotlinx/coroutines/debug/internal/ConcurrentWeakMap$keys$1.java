package kotlinx.coroutines.debug.internal;

import kotlin.jvm.internal.Lambda;
import o.Transition;
/* loaded from: classes7.dex */
public final class ConcurrentWeakMap$keys$1 extends Lambda implements Transition<K, V, K> {
    public static final ConcurrentWeakMap$keys$1 INSTANCE = new ConcurrentWeakMap$keys$1();

    ConcurrentWeakMap$keys$1() {
        super(2);
    }

    @Override // o.Transition
    public final K invoke(K k, V v) {
        return k;
    }
}
