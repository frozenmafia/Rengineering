package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.cancel;
/* loaded from: classes6.dex */
public final class Apply$product$1 extends Lambda implements Styleable.ChangeBounds<B, Styleable.ChangeBounds<? super A, ? extends cancel<? extends A, ? extends B>>> {
    public static final Apply$product$1 INSTANCE = new Apply$product$1();

    Apply$product$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: arrow.typeclasses.Apply$product$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<A, cancel<? extends A, ? extends B>> {
        final /* synthetic */ Object $b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Object obj) {
            super(1);
            this.$b = obj;
        }

        @Override // o.Styleable.ChangeBounds
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke((AnonymousClass1) obj);
        }

        @Override // o.Styleable.ChangeBounds
        public final cancel<A, B> invoke(A a) {
            return new cancel<>(a, this.$b);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((Apply$product$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final Styleable.ChangeBounds<A, cancel<A, B>> invoke(B b2) {
        return new AnonymousClass1(b2);
    }
}
