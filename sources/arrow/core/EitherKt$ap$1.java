package arrow.core;

import kotlin.TypeCastException;
import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.Styleable;
import o.runAnimators;
import o.setDefaultImpl;
/* loaded from: classes6.dex */
public final class EitherKt$ap$1 extends Lambda implements Styleable.ChangeBounds<B, setDefaultImpl<? extends A, ? extends C>> {
    final /* synthetic */ ICustomTabsCallback.Default $ff;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EitherKt$ap$1(ICustomTabsCallback.Default r1) {
        super(1);
        this.$ff = r1;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((EitherKt$ap$1) obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: arrow.core.EitherKt$ap$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<Styleable.ChangeBounds<? super B, ? extends C>, C> {
        final /* synthetic */ Object $a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Object obj) {
            super(1);
            this.$a = obj;
        }

        @Override // o.Styleable.ChangeBounds
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke((Styleable.ChangeBounds<? super B, ? extends Object>) obj);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [C, java.lang.Object] */
        public final C invoke(Styleable.ChangeBounds<? super B, ? extends C> changeBounds) {
            runAnimators.valueOf(changeBounds, "f");
            return changeBounds.invoke(this.$a);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final setDefaultImpl<A, C> invoke(B b2) {
        ICustomTabsCallback.Default r0 = this.$ff;
        if (r0 != null) {
            return ((setDefaultImpl) r0).values(new AnonymousClass1(b2));
        }
        throw new TypeCastException("null cannot be cast to non-null type arrow.core.Either<A, B>");
    }
}
