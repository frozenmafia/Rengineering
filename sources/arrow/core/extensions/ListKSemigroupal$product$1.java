package arrow.core.extensions;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.cancel;
/* loaded from: classes6.dex */
public final class ListKSemigroupal$product$1 extends Lambda implements Styleable.ChangeBounds<A, Styleable.ChangeBounds<? super B, ? extends cancel<? extends A, ? extends B>>> {
    public static final ListKSemigroupal$product$1 INSTANCE = new ListKSemigroupal$product$1();

    ListKSemigroupal$product$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: arrow.core.extensions.ListKSemigroupal$product$1$1  reason: invalid class name */
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
        return invoke((ListKSemigroupal$product$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final Styleable.ChangeBounds<B, cancel<A, B>> invoke(A a) {
        return new AnonymousClass1(a);
    }
}
