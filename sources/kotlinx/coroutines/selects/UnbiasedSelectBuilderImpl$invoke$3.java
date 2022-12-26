package kotlinx.coroutines.selects;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.Transition;
import o.ViewPager;
import o.setAnimationMatrix;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class UnbiasedSelectBuilderImpl$invoke$3 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ Transition<Q, setPatternPath<? super R>, Object> $block;
    final /* synthetic */ P $param;
    final /* synthetic */ ViewPager.OnAdapterChangeListener<P, Q> $this_invoke;
    final /* synthetic */ ViewPager.SavedState<R> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UnbiasedSelectBuilderImpl$invoke$3(ViewPager.OnAdapterChangeListener<? super P, ? extends Q> onAdapterChangeListener, ViewPager.SavedState<? super R> savedState, P p, Transition<? super Q, ? super setPatternPath<? super R>, ? extends Object> transition) {
        super(0);
        this.$this_invoke = onAdapterChangeListener;
        this.this$0 = savedState;
        this.$param = p;
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
        this.$this_invoke.valueOf(this.this$0.ag$a(), this.$param, this.$block);
    }
}
