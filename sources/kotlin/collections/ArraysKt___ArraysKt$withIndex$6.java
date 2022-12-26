package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes7.dex */
public final class ArraysKt___ArraysKt$withIndex$6 extends Lambda implements Styleable.ArcMotion<Iterator<? extends Float>> {
    final /* synthetic */ float[] $this_withIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ArraysKt___ArraysKt$withIndex$6(float[] fArr) {
        super(0);
        this.$this_withIndex = fArr;
    }

    @Override // o.Styleable.ArcMotion
    public final Iterator<? extends Float> invoke() {
        return runAnimators.ag$a(this.$this_withIndex, "array");
    }
}
