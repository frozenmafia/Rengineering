package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes7.dex */
public final class ArraysKt___ArraysKt$withIndex$8 extends Lambda implements Styleable.ArcMotion<Iterator<? extends Boolean>> {
    final /* synthetic */ boolean[] $this_withIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ArraysKt___ArraysKt$withIndex$8(boolean[] zArr) {
        super(0);
        this.$this_withIndex = zArr;
    }

    @Override // o.Styleable.ArcMotion
    public final Iterator<? extends Boolean> invoke() {
        return runAnimators.ag$a(this.$this_withIndex, "array");
    }
}
