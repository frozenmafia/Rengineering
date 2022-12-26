package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.asInterface;
import o.setDefaultImpl;
/* loaded from: classes6.dex */
public final class EitherKt$leftIfNull$1 extends Lambda implements Styleable.ChangeBounds<B, setDefaultImpl<? extends A, ? extends B>> {
    final /* synthetic */ Styleable.ArcMotion $default;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EitherKt$leftIfNull$1(Styleable.ArcMotion arcMotion) {
        super(1);
        this.$default = arcMotion;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((EitherKt$leftIfNull$1) obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: arrow.core.EitherKt$leftIfNull$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ArcMotion<A> {
        AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [A, java.lang.Object] */
        @Override // o.Styleable.ArcMotion
        public final A invoke() {
            return EitherKt$leftIfNull$1.this.$default.invoke();
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final setDefaultImpl<A, B> invoke(B b2) {
        return asInterface.ag$a(b2, new AnonymousClass1());
    }
}
