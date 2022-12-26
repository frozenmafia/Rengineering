package androidx.collection;

import com.sendbird.android.constant.StringSet;
import o.Styleable;
import o.Transition;
import o.captureHierarchy;
import o.runAnimators;
/* loaded from: classes5.dex */
public final class LruCacheKt$lruCache$4 extends LruCache<K, V> {
    final /* synthetic */ Styleable.ChangeBounds $create;
    final /* synthetic */ int $maxSize;
    final /* synthetic */ captureHierarchy $onEntryRemoved;
    final /* synthetic */ Transition $sizeOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LruCacheKt$lruCache$4(Transition transition, Styleable.ChangeBounds changeBounds, captureHierarchy capturehierarchy, int i, int i2) {
        super(i2);
        this.$sizeOf = transition;
        this.$create = changeBounds;
        this.$onEntryRemoved = capturehierarchy;
        this.$maxSize = i;
    }

    @Override // androidx.collection.LruCache
    protected int sizeOf(K k, V v) {
        runAnimators.valueOf(k, StringSet.key);
        runAnimators.valueOf(v, "value");
        return ((Number) this.$sizeOf.invoke(k, v)).intValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [V, java.lang.Object] */
    @Override // androidx.collection.LruCache
    protected V create(K k) {
        runAnimators.valueOf(k, StringSet.key);
        return this.$create.invoke(k);
    }

    @Override // androidx.collection.LruCache
    protected void entryRemoved(boolean z, K k, V v, V v2) {
        runAnimators.valueOf(k, StringSet.key);
        runAnimators.valueOf(v, "oldValue");
        this.$onEntryRemoved.invoke(Boolean.valueOf(z), k, v, v2);
    }
}
