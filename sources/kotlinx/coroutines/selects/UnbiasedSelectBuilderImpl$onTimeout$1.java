package kotlinx.coroutines.selects;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.ViewPager;
import o.setAnimationMatrix;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class UnbiasedSelectBuilderImpl$onTimeout$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ Styleable.ChangeBounds<setPatternPath<? super R>, Object> $block;
    final /* synthetic */ long $timeMillis;
    final /* synthetic */ ViewPager.SavedState<R> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UnbiasedSelectBuilderImpl$onTimeout$1(ViewPager.SavedState<? super R> savedState, long j, Styleable.ChangeBounds<? super setPatternPath<? super R>, ? extends Object> changeBounds) {
        super(0);
        this.this$0 = savedState;
        this.$timeMillis = j;
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
        this.this$0.ag$a().valueOf(this.$timeMillis, this.$block);
    }
}
