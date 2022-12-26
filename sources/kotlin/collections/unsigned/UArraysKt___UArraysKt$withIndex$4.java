package kotlin.collections.unsigned;

import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import o.ChangeTransform;
import o.CircularPropagation;
import o.Styleable;
/* loaded from: classes7.dex */
public final class UArraysKt___UArraysKt$withIndex$4 extends Lambda implements Styleable.ArcMotion<Iterator<? extends CircularPropagation>> {
    final /* synthetic */ short[] $this_withIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UArraysKt___UArraysKt$withIndex$4(short[] sArr) {
        super(0);
        this.$this_withIndex = sArr;
    }

    @Override // o.Styleable.ArcMotion
    public final Iterator<? extends CircularPropagation> invoke() {
        return ChangeTransform.Transforms.values(this.$this_withIndex);
    }
}
