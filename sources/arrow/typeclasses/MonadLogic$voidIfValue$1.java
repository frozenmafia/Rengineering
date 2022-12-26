package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.Styleable;
import o.getPlaybackState;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class MonadLogic$voidIfValue$1 extends Lambda implements Styleable.ChangeBounds<A, ICustomTabsCallback.Default<? extends F, ? extends setAnimationMatrix>> {
    final /* synthetic */ getPlaybackState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MonadLogic$voidIfValue$1(getPlaybackState getplaybackstate) {
        super(1);
        this.this$0 = getplaybackstate;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((MonadLogic$voidIfValue$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final ICustomTabsCallback.Default<F, setAnimationMatrix> invoke(A a) {
        return this.this$0.valueOf();
    }
}
