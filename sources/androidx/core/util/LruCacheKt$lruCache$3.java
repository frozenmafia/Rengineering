package androidx.core.util;

import kotlin.jvm.internal.Lambda;
import o.captureHierarchy;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class LruCacheKt$lruCache$3 extends Lambda implements captureHierarchy<Boolean, K, V, V, setAnimationMatrix> {
    public static final LruCacheKt$lruCache$3 INSTANCE = new LruCacheKt$lruCache$3();

    public LruCacheKt$lruCache$3() {
        super(4);
    }

    public final void invoke(boolean z, K k, V v, V v2) {
        runAnimators.ag$a(k, "$noName_1");
        runAnimators.ag$a(v, "$noName_2");
    }

    @Override // o.captureHierarchy
    public /* synthetic */ setAnimationMatrix invoke(Boolean bool, Object obj, Object obj2, Object obj3) {
        invoke(bool.booleanValue(), (boolean) obj, obj2, obj3);
        return setAnimationMatrix.ag$a;
    }
}
