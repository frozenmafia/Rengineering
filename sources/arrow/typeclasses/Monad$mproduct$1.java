package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.IMediaControllerCallback;
import o.Styleable;
import o.cancel;
/* loaded from: classes6.dex */
public final class Monad$mproduct$1 extends Lambda implements Styleable.ChangeBounds<A, ICustomTabsCallback.Default<? extends F, ? extends cancel<? extends A, ? extends B>>> {
    final /* synthetic */ Styleable.ChangeBounds $f;
    final /* synthetic */ IMediaControllerCallback.Stub.Proxy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Monad$mproduct$1(IMediaControllerCallback.Stub.Proxy proxy, Styleable.ChangeBounds changeBounds) {
        super(1);
        this.this$0 = proxy;
        this.$f = changeBounds;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: arrow.typeclasses.Monad$mproduct$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<B, cancel<? extends A, ? extends B>> {
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
        public final cancel<A, B> invoke(B b2) {
            return new cancel<>(this.$a, b2);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((Monad$mproduct$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final ICustomTabsCallback.Default<F, cancel<A, B>> invoke(A a) {
        return this.this$0.map((ICustomTabsCallback.Default) this.$f.invoke(a), new AnonymousClass1(a));
    }
}
