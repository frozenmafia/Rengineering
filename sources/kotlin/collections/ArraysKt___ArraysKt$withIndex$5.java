package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes7.dex */
public final class ArraysKt___ArraysKt$withIndex$5 extends Lambda implements Styleable.ArcMotion<Iterator<? extends Long>> {
    final /* synthetic */ long[] $this_withIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ArraysKt___ArraysKt$withIndex$5(long[] jArr) {
        super(0);
        this.$this_withIndex = jArr;
    }

    @Override // o.Styleable.ArcMotion
    public final Iterator<? extends Long> invoke() {
        return runAnimators.ag$a(this.$this_withIndex, "array");
    }
}
