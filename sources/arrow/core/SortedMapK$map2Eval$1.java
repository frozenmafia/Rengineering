package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.ITrustedWebActivityCallback;
import o.Styleable;
import o.Transition;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class SortedMapK$map2Eval$1 extends Lambda implements Styleable.ChangeBounds<ITrustedWebActivityCallback.Default<A, C>, ITrustedWebActivityCallback.Default<A, Z>> {
    final /* synthetic */ Transition $f;
    final /* synthetic */ ITrustedWebActivityCallback.Default this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SortedMapK$map2Eval$1(ITrustedWebActivityCallback.Default r1, Transition transition) {
        super(1);
        this.this$0 = r1;
        this.$f = transition;
    }

    @Override // o.Styleable.ChangeBounds
    public final ITrustedWebActivityCallback.Default<A, Z> invoke(ITrustedWebActivityCallback.Default<A, C> r3) {
        runAnimators.valueOf(r3, "c");
        return this.this$0.ag$a(r3, this.$f);
    }
}
