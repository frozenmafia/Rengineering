package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.ICustomTabsService;
import o.IPostMessageService;
import o.ITrustedWebActivityCallback;
import o.Styleable;
import o.getRatingStyle;
import o.playFromMediaId;
/* loaded from: classes6.dex */
public final class TraverseFilter$filterA$$inlined$run$lambda$1 extends Lambda implements Styleable.ChangeBounds<A, ICustomTabsCallback.Default<? extends G, ? extends ICustomTabsService.Stub.Proxy<? extends A>>> {
    final /* synthetic */ Styleable.ChangeBounds $f$inlined;
    final /* synthetic */ ICustomTabsCallback.Default $this_filterA$inlined;
    final /* synthetic */ getRatingStyle $this_run;
    final /* synthetic */ playFromMediaId this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TraverseFilter$filterA$$inlined$run$lambda$1(getRatingStyle getratingstyle, playFromMediaId playfrommediaid, ICustomTabsCallback.Default r3, Styleable.ChangeBounds changeBounds) {
        super(1);
        this.$this_run = getratingstyle;
        this.this$0 = playfrommediaid;
        this.$this_filterA$inlined = r3;
        this.$f$inlined = changeBounds;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: arrow.typeclasses.TraverseFilter$filterA$$inlined$run$lambda$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<Boolean, ICustomTabsService.Stub.Proxy<? extends A>> {
        final /* synthetic */ Object $a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Object obj) {
            super(1);
            this.$a = obj;
        }

        @Override // o.Styleable.ChangeBounds
        public /* synthetic */ Object invoke(Boolean bool) {
            return invoke(bool.booleanValue());
        }

        public final ICustomTabsService.Stub.Proxy<A> invoke(boolean z) {
            return z ? new ITrustedWebActivityCallback(this.$a) : IPostMessageService.Default.valueOf;
        }
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((TraverseFilter$filterA$$inlined$run$lambda$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final ICustomTabsCallback.Default<G, ICustomTabsService.Stub.Proxy<A>> invoke(A a) {
        return this.$this_run.map((ICustomTabsCallback.Default) this.$f$inlined.invoke(a), new AnonymousClass1(a));
    }
}
