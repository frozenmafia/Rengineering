package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.excludeTarget;
/* loaded from: classes5.dex */
public final class ArraysKt___ArraysKt$withIndex$1 extends Lambda implements Styleable.ArcMotion<Iterator<? extends T>> {
    final /* synthetic */ T[] $this_withIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArraysKt___ArraysKt$withIndex$1(T[] tArr) {
        super(0);
        this.$this_withIndex = tArr;
    }

    @Override // o.Styleable.ArcMotion
    public final Iterator<T> invoke() {
        return excludeTarget.valueOf(this.$this_withIndex);
    }
}
