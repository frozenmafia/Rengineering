package o;

import java.util.Map;
import o.Transition;
/* loaded from: classes5.dex */
interface setGhostView<K, V> extends Map<K, V>, Transition.ArrayListManager {
    V toString(K k);
}
