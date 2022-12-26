package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes5.dex */
public final class CollectionsKt___CollectionsKt$withIndex$1 extends Lambda implements Styleable.ArcMotion<Iterator<? extends T>> {
    final /* synthetic */ Iterable<T> $this_withIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CollectionsKt___CollectionsKt$withIndex$1(Iterable<? extends T> iterable) {
        super(0);
        this.$this_withIndex = iterable;
    }

    @Override // o.Styleable.ArcMotion
    public final Iterator<T> invoke() {
        return this.$this_withIndex.iterator();
    }
}
