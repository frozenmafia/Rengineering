package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.Transition;
/* loaded from: classes6.dex */
public final class PredefKt$curry$1 extends Lambda implements Styleable.ChangeBounds<A, Styleable.ChangeBounds<? super B, ? extends Z>> {
    final /* synthetic */ Transition $this_curry;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PredefKt$curry$1(Transition transition) {
        super(1);
        this.$this_curry = transition;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((PredefKt$curry$1) obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: arrow.core.PredefKt$curry$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<B, Z> {
        final /* synthetic */ Object $p1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Object obj) {
            super(1);
            this.$p1 = obj;
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, Z] */
        @Override // o.Styleable.ChangeBounds
        public final Z invoke(B b2) {
            return PredefKt$curry$1.this.$this_curry.invoke(this.$p1, b2);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final Styleable.ChangeBounds<B, Z> invoke(A a) {
        return new AnonymousClass1(a);
    }
}
