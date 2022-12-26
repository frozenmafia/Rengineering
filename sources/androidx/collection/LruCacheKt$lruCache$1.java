package androidx.collection;

import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.runAnimators;
/* loaded from: classes5.dex */
public final class LruCacheKt$lruCache$1 extends Lambda implements Transition<K, V, Integer> {
    public static final LruCacheKt$lruCache$1 INSTANCE = new LruCacheKt$lruCache$1();

    public LruCacheKt$lruCache$1() {
        super(2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Transition
    public final Integer invoke(K k, V v) {
        runAnimators.valueOf(k, "<anonymous parameter 0>");
        runAnimators.valueOf(v, "<anonymous parameter 1>");
        return 1;
    }

    @Override // o.Transition
    public /* synthetic */ Integer invoke(Object obj, Object obj2) {
        return Integer.valueOf(invoke((LruCacheKt$lruCache$1) obj, obj2));
    }
}
