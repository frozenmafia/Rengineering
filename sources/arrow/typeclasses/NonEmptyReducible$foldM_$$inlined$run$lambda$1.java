package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.IMediaControllerCallback;
import o.Styleable;
import o.Transition;
import o.getSessionInfo;
/* loaded from: classes6.dex */
public final class NonEmptyReducible$foldM_$$inlined$run$lambda$1 extends Lambda implements Styleable.ChangeBounds<B, ICustomTabsCallback.Default<? extends G, ? extends B>> {
    final /* synthetic */ IMediaControllerCallback.Stub.Proxy $M$inlined;
    final /* synthetic */ Transition $f$inlined;
    final /* synthetic */ ICustomTabsCallback.Default $ga;
    final /* synthetic */ ICustomTabsCallback.Default $this_foldM_$inlined;
    final /* synthetic */ Object $z$inlined;
    final /* synthetic */ getSessionInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NonEmptyReducible$foldM_$$inlined$run$lambda$1(ICustomTabsCallback.Default r1, getSessionInfo getsessioninfo, ICustomTabsCallback.Default r3, Transition transition, Object obj, IMediaControllerCallback.Stub.Proxy proxy) {
        super(1);
        this.$ga = r1;
        this.this$0 = getsessioninfo;
        this.$this_foldM_$inlined = r3;
        this.$f$inlined = transition;
        this.$z$inlined = obj;
        this.$M$inlined = proxy;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((NonEmptyReducible$foldM_$$inlined$run$lambda$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final ICustomTabsCallback.Default<G, B> invoke(B b2) {
        return this.this$0.valueOf().ag$a(this.$ga, this.$M$inlined, b2, this.$f$inlined);
    }
}
