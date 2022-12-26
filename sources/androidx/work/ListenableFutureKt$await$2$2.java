package androidx.work;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.animateAddImpl;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class ListenableFutureKt$await$2$2 extends Lambda implements Styleable.ChangeBounds<Throwable, setAnimationMatrix> {
    final /* synthetic */ animateAddImpl<R> $this_await;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListenableFutureKt$await$2$2(animateAddImpl<R> animateaddimpl) {
        super(1);
        this.$this_await = animateaddimpl;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(Throwable th) {
        invoke2(th);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        this.$this_await.cancel(false);
    }
}
