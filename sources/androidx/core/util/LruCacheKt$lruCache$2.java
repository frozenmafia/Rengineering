package androidx.core.util;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class LruCacheKt$lruCache$2 extends Lambda implements Styleable.ChangeBounds<K, V> {
    public static final LruCacheKt$lruCache$2 INSTANCE = new LruCacheKt$lruCache$2();

    public LruCacheKt$lruCache$2() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final V invoke(K k) {
        runAnimators.ag$a(k, "it");
        return null;
    }
}
