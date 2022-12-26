package arrow.syntax.internal;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes6.dex */
public final class Platform$newConcurrentMap$map$2 extends Lambda implements Styleable.ArcMotion<ConcurrentHashMap<K, V>> {
    public static final Platform$newConcurrentMap$map$2 INSTANCE = new Platform$newConcurrentMap$map$2();

    Platform$newConcurrentMap$map$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final ConcurrentHashMap<K, V> invoke() {
        return new ConcurrentHashMap<>();
    }
}
