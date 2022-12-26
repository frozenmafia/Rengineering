package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.Styleable;
import o.cancel;
import o.getPlaybackState;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class MonadLogic$unweave$2 extends Lambda implements Styleable.ChangeBounds<cancel<? extends ICustomTabsCallback.Default<? extends F, ? extends A>, ? extends A>, ICustomTabsCallback.Default<? extends F, ? extends B>> {
    final /* synthetic */ Styleable.ChangeBounds $ffa;
    final /* synthetic */ getPlaybackState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MonadLogic$unweave$2(getPlaybackState getplaybackstate, Styleable.ChangeBounds changeBounds) {
        super(1);
        this.this$0 = getplaybackstate;
        this.$ffa = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public final ICustomTabsCallback.Default<F, B> invoke(cancel<? extends ICustomTabsCallback.Default<? extends F, ? extends A>, ? extends A> cancelVar) {
        runAnimators.valueOf(cancelVar, "<name for destructuring parameter 0>");
        return this.this$0.values((ICustomTabsCallback.Default) this.$ffa.invoke(cancelVar.values()), this.this$0.ah$a((ICustomTabsCallback.Default) cancelVar.valueOf(), this.$ffa));
    }
}
