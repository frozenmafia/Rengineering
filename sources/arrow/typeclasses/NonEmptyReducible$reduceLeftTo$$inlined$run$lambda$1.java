package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.Styleable;
import o.Transition;
import o.getSessionInfo;
/* loaded from: classes6.dex */
public final class NonEmptyReducible$reduceLeftTo$$inlined$run$lambda$1 extends Lambda implements Transition<B, A, B> {
    final /* synthetic */ Styleable.ChangeBounds $f$inlined;
    final /* synthetic */ Transition $g$inlined;
    final /* synthetic */ ICustomTabsCallback.Default $this_reduceLeftTo$inlined;
    final /* synthetic */ getSessionInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NonEmptyReducible$reduceLeftTo$$inlined$run$lambda$1(getSessionInfo getsessioninfo, ICustomTabsCallback.Default r2, Styleable.ChangeBounds changeBounds, Transition transition) {
        super(2);
        this.this$0 = getsessioninfo;
        this.$this_reduceLeftTo$inlined = r2;
        this.$f$inlined = changeBounds;
        this.$g$inlined = transition;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [B, java.lang.Object] */
    @Override // o.Transition
    public final B invoke(B b2, A a) {
        return this.$g$inlined.invoke(b2, a);
    }
}
