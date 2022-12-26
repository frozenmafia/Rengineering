package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.RatingCompat;
import o.Styleable;
import o.cancel;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class Apply$map2Eval$1 extends Lambda implements Styleable.ChangeBounds<ICustomTabsCallback.Default<? extends F, ? extends B>, ICustomTabsCallback.Default<? extends F, ? extends Styleable.ChangeBounds<? super A, ? extends Z>>> {
    final /* synthetic */ Styleable.ChangeBounds $f;
    final /* synthetic */ RatingCompat.Api19Impl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Apply$map2Eval$1(RatingCompat.Api19Impl api19Impl, Styleable.ChangeBounds changeBounds) {
        super(1);
        this.this$0 = api19Impl;
        this.$f = changeBounds;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: arrow.typeclasses.Apply$map2Eval$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<B, Styleable.ChangeBounds<? super A, ? extends Z>> {
        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke((AnonymousClass1) obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: arrow.typeclasses.Apply$map2Eval$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C02261 extends Lambda implements Styleable.ChangeBounds<A, Z> {
            final /* synthetic */ Object $b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02261(Object obj) {
                super(1);
                this.$b = obj;
            }

            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, Z] */
            @Override // o.Styleable.ChangeBounds
            public final Z invoke(A a) {
                return Apply$map2Eval$1.this.$f.invoke(new cancel(a, this.$b));
            }
        }

        @Override // o.Styleable.ChangeBounds
        public final Styleable.ChangeBounds<A, Z> invoke(B b2) {
            return new C02261(b2);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final ICustomTabsCallback.Default<F, Styleable.ChangeBounds<A, Z>> invoke(ICustomTabsCallback.Default<? extends F, ? extends B> r3) {
        runAnimators.valueOf(r3, "it");
        return this.this$0.map(r3, new AnonymousClass1());
    }
}
