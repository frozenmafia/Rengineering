package androidx.core.util;

import android.util.LruCache;
import com.sendbird.android.constant.StringSet;
import o.Styleable;
import o.Transition;
import o.captureHierarchy;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class LruCacheKt$lruCache$4 extends LruCache<K, V> {
    final /* synthetic */ Styleable.ChangeBounds<K, V> $create;
    final /* synthetic */ int $maxSize;
    final /* synthetic */ captureHierarchy<Boolean, K, V, V, setAnimationMatrix> $onEntryRemoved;
    final /* synthetic */ Transition<K, V, Integer> $sizeOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LruCacheKt$lruCache$4(Transition<? super K, ? super V, Integer> transition, Styleable.ChangeBounds<? super K, ? extends V> changeBounds, captureHierarchy<? super Boolean, ? super K, ? super V, ? super V, setAnimationMatrix> capturehierarchy, int i) {
        super(i);
        this.$sizeOf = transition;
        this.$create = changeBounds;
        this.$onEntryRemoved = capturehierarchy;
        this.$maxSize = i;
    }

    @Override // android.util.LruCache
    protected int sizeOf(K k, V v) {
        runAnimators.ag$a(k, StringSet.key);
        runAnimators.ag$a(v, "value");
        return this.$sizeOf.invoke(k, v).intValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [V, java.lang.Object] */
    @Override // android.util.LruCache
    protected V create(K k) {
        runAnimators.ag$a(k, StringSet.key);
        return this.$create.invoke(k);
    }

    @Override // android.util.LruCache
    protected void entryRemoved(boolean z, K k, V v, V v2) {
        runAnimators.ag$a(k, StringSet.key);
        runAnimators.ag$a(v, "oldValue");
        this.$onEntryRemoved.invoke(Boolean.valueOf(z), k, v, v2);
    }
}
