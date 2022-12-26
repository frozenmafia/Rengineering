package kotlinx.coroutines.selects;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.ViewPager;
import o.setAnimationMatrix;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class UnbiasedSelectBuilderImpl$invoke$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ Styleable.ChangeBounds<setPatternPath<? super R>, Object> $block;
    final /* synthetic */ ViewPager.MyAccessibilityDelegate $this_invoke;
    final /* synthetic */ ViewPager.SavedState<R> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UnbiasedSelectBuilderImpl$invoke$1(ViewPager.MyAccessibilityDelegate myAccessibilityDelegate, ViewPager.SavedState<? super R> savedState, Styleable.ChangeBounds<? super setPatternPath<? super R>, ? extends Object> changeBounds) {
        super(0);
        this.$this_invoke = myAccessibilityDelegate;
        this.this$0 = savedState;
        this.$block = changeBounds;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$this_invoke.ah$a(this.this$0.ag$a(), this.$block);
    }
}
