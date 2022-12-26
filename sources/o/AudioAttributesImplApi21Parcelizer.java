package o;

import java.util.Collections;
import java.util.Map;
/* loaded from: classes6.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static final <A, B> cancel<A, B> ag$a(A a, B b2) {
        return new cancel<>(a, b2);
    }

    public static final <K, V> Map<K, V> values(cancel<? extends K, ? extends V> cancelVar) {
        runAnimators.valueOf(cancelVar, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(cancelVar.ag$a(), cancelVar.ah$a());
        runAnimators.toString(singletonMap, "Collections.singletonMap(pair.a, pair.b)");
        return singletonMap;
    }
}
