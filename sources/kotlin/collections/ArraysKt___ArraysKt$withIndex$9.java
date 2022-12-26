package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.clearValues;
/* loaded from: classes7.dex */
public final class ArraysKt___ArraysKt$withIndex$9 extends Lambda implements Styleable.ArcMotion<Iterator<? extends Character>> {
    final /* synthetic */ char[] $this_withIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ArraysKt___ArraysKt$withIndex$9(char[] cArr) {
        super(0);
        this.$this_withIndex = cArr;
    }

    @Override // o.Styleable.ArcMotion
    public final Iterator<? extends Character> invoke() {
        return clearValues.valueOf(this.$this_withIndex);
    }
}
