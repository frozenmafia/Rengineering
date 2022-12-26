package androidx.lifecycle;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes6.dex */
public final class WithLifecycleStateKt$withStateAtLeastUnchecked$2 extends Lambda implements Styleable.ArcMotion<R> {
    final /* synthetic */ Styleable.ArcMotion $block;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WithLifecycleStateKt$withStateAtLeastUnchecked$2(Styleable.ArcMotion arcMotion) {
        super(0);
        this.$block = arcMotion;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [R, java.lang.Object] */
    @Override // o.Styleable.ArcMotion
    public final R invoke() {
        return this.$block.invoke();
    }
}
