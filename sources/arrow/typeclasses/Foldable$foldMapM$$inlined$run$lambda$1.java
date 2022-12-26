package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.IMediaControllerCallback;
import o.Styleable;
import o.Transition;
import o.getRatingType;
import o.onSessionDestroyed;
/* loaded from: classes6.dex */
public final class Foldable$foldMapM$$inlined$run$lambda$1 extends Lambda implements Transition<B, A, ICustomTabsCallback.Default<? extends G, ? extends B>> {
    final /* synthetic */ Styleable.ChangeBounds $f$inlined;
    final /* synthetic */ IMediaControllerCallback.Stub.Proxy $ma$inlined;
    final /* synthetic */ getRatingType $mo$inlined;
    final /* synthetic */ ICustomTabsCallback.Default $this_foldMapM$inlined;
    final /* synthetic */ IMediaControllerCallback.Stub.Proxy $this_run;
    final /* synthetic */ onSessionDestroyed this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Foldable$foldMapM$$inlined$run$lambda$1(IMediaControllerCallback.Stub.Proxy proxy, onSessionDestroyed onsessiondestroyed, ICustomTabsCallback.Default r3, IMediaControllerCallback.Stub.Proxy proxy2, getRatingType getratingtype, Styleable.ChangeBounds changeBounds) {
        super(2);
        this.$this_run = proxy;
        this.this$0 = onsessiondestroyed;
        this.$this_foldMapM$inlined = r3;
        this.$ma$inlined = proxy2;
        this.$mo$inlined = getratingtype;
        this.$f$inlined = changeBounds;
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((Foldable$foldMapM$$inlined$run$lambda$1) obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: arrow.typeclasses.Foldable$foldMapM$$inlined$run$lambda$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<B, B> {
        final /* synthetic */ Object $b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Object obj) {
            super(1);
            this.$b = obj;
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [B, java.lang.Object] */
        @Override // o.Styleable.ChangeBounds
        public final B invoke(B b2) {
            return Foldable$foldMapM$$inlined$run$lambda$1.this.$mo$inlined.ah$a(this.$b, b2);
        }
    }

    @Override // o.Transition
    public final ICustomTabsCallback.Default<G, B> invoke(B b2, A a) {
        return this.$this_run.map((ICustomTabsCallback.Default) this.$f$inlined.invoke(a), new AnonymousClass1(b2));
    }
}
