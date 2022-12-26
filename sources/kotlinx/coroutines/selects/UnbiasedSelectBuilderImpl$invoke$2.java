package kotlinx.coroutines.selects;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.Transition;
import o.ViewPager;
import o.setAnimationMatrix;
import o.setPatternPath;
import o.transformPage;
/* loaded from: classes7.dex */
public final class UnbiasedSelectBuilderImpl$invoke$2 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ Transition<Q, setPatternPath<? super R>, Object> $block;
    final /* synthetic */ transformPage<Q> $this_invoke;
    final /* synthetic */ ViewPager.SavedState<R> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UnbiasedSelectBuilderImpl$invoke$2(transformPage<? extends Q> transformpage, ViewPager.SavedState<? super R> savedState, Transition<? super Q, ? super setPatternPath<? super R>, ? extends Object> transition) {
        super(0);
        this.$this_invoke = transformpage;
        this.this$0 = savedState;
        this.$block = transition;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$this_invoke.toString(this.this$0.ag$a(), this.$block);
    }
}
