package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.IMediaControllerCallback;
import o.Styleable;
import o.Transition;
import o.onSessionDestroyed;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class Foldable$foldM$$inlined$run$lambda$1 extends Lambda implements Transition<ICustomTabsCallback.Default<? extends G, ? extends B>, A, ICustomTabsCallback.Default<? extends G, ? extends B>> {
    final /* synthetic */ IMediaControllerCallback.Stub.Proxy $M$inlined;
    final /* synthetic */ Transition $f$inlined;
    final /* synthetic */ ICustomTabsCallback.Default $this_foldM$inlined;
    final /* synthetic */ IMediaControllerCallback.Stub.Proxy $this_run;
    final /* synthetic */ Object $z$inlined;
    final /* synthetic */ onSessionDestroyed this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Foldable$foldM$$inlined$run$lambda$1(IMediaControllerCallback.Stub.Proxy proxy, onSessionDestroyed onsessiondestroyed, ICustomTabsCallback.Default r3, IMediaControllerCallback.Stub.Proxy proxy2, Object obj, Transition transition) {
        super(2);
        this.$this_run = proxy;
        this.this$0 = onsessiondestroyed;
        this.$this_foldM$inlined = r3;
        this.$M$inlined = proxy2;
        this.$z$inlined = obj;
        this.$f$inlined = transition;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: arrow.typeclasses.Foldable$foldM$$inlined$run$lambda$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<B, ICustomTabsCallback.Default<? extends G, ? extends B>> {
        final /* synthetic */ Object $a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Object obj) {
            super(1);
            this.$a = obj;
        }

        @Override // o.Styleable.ChangeBounds
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke((AnonymousClass1) obj);
        }

        @Override // o.Styleable.ChangeBounds
        public final ICustomTabsCallback.Default<G, B> invoke(B b2) {
            return (ICustomTabsCallback.Default) Foldable$foldM$$inlined$run$lambda$1.this.$f$inlined.invoke(b2, this.$a);
        }
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((ICustomTabsCallback.Default) obj, (ICustomTabsCallback.Default) obj2);
    }

    public final ICustomTabsCallback.Default<G, B> invoke(ICustomTabsCallback.Default<? extends G, ? extends B> r3, A a) {
        runAnimators.valueOf(r3, "gb");
        return this.$this_run.toString(r3, new AnonymousClass1(a));
    }
}
