package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.IMediaControllerCallback;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class Monad$ap$1 extends Lambda implements Styleable.ChangeBounds<A, ICustomTabsCallback.Default<? extends F, ? extends B>> {
    final /* synthetic */ ICustomTabsCallback.Default $ff;
    final /* synthetic */ IMediaControllerCallback.Stub.Proxy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Monad$ap$1(IMediaControllerCallback.Stub.Proxy proxy, ICustomTabsCallback.Default r2) {
        super(1);
        this.this$0 = proxy;
        this.$ff = r2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: arrow.typeclasses.Monad$ap$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<Styleable.ChangeBounds<? super A, ? extends B>, B> {
        final /* synthetic */ Object $a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Object obj) {
            super(1);
            this.$a = obj;
        }

        @Override // o.Styleable.ChangeBounds
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke((Styleable.ChangeBounds<? super A, ? extends Object>) obj);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [B, java.lang.Object] */
        public final B invoke(Styleable.ChangeBounds<? super A, ? extends B> changeBounds) {
            runAnimators.valueOf(changeBounds, "f");
            return changeBounds.invoke(this.$a);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((Monad$ap$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final ICustomTabsCallback.Default<F, B> invoke(A a) {
        return this.this$0.map(this.$ff, new AnonymousClass1(a));
    }
}
