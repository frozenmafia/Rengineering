package kotlin.collections.unsigned;

import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import o.ChangeTransform;
import o.Styleable;
/* loaded from: classes7.dex */
public final class UArraysKt___UArraysKt$withIndex$1 extends Lambda implements Styleable.ArcMotion<Iterator<? extends ChangeTransform.GhostListener>> {
    final /* synthetic */ int[] $this_withIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UArraysKt___UArraysKt$withIndex$1(int[] iArr) {
        super(0);
        this.$this_withIndex = iArr;
    }

    @Override // o.Styleable.ArcMotion
    public final Iterator<? extends ChangeTransform.GhostListener> invoke() {
        return ChangeTransform.PathAnimatorMatrix.ah$a(this.$this_withIndex);
    }
}
