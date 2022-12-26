package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.IMediaControllerCallback;
import o.Styleable;
import o.asBinder;
/* loaded from: classes6.dex */
public final class Monad$productLEval$1 extends Lambda implements Styleable.ChangeBounds<A, ICustomTabsCallback.Default<? extends F, ? extends A>> {
    final /* synthetic */ asBinder $fb;
    final /* synthetic */ IMediaControllerCallback.Stub.Proxy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Monad$productLEval$1(IMediaControllerCallback.Stub.Proxy proxy, asBinder asbinder) {
        super(1);
        this.this$0 = proxy;
        this.$fb = asbinder;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((Monad$productLEval$1) obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: arrow.typeclasses.Monad$productLEval$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<B, A> {
        final /* synthetic */ Object $a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Object obj) {
            super(1);
            this.$a = obj;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [A, java.lang.Object] */
        @Override // o.Styleable.ChangeBounds
        public final A invoke(B b2) {
            return this.$a;
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final ICustomTabsCallback.Default<F, A> invoke(A a) {
        return this.this$0.map((ICustomTabsCallback.Default) this.$fb.ah$a(), new AnonymousClass1(a));
    }
}
