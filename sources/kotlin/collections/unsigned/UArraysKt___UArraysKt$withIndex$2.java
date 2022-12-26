package kotlin.collections.unsigned;

import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import o.ChangeTransform;
import o.Styleable;
import o.setCurrentMatrix;
/* loaded from: classes7.dex */
public final class UArraysKt___UArraysKt$withIndex$2 extends Lambda implements Styleable.ArcMotion<Iterator<? extends ChangeTransform.AnonymousClass3>> {
    final /* synthetic */ long[] $this_withIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UArraysKt___UArraysKt$withIndex$2(long[] jArr) {
        super(0);
        this.$this_withIndex = jArr;
    }

    @Override // o.Styleable.ArcMotion
    public final Iterator<? extends ChangeTransform.AnonymousClass3> invoke() {
        return setCurrentMatrix.valueOf(this.$this_withIndex);
    }
}
