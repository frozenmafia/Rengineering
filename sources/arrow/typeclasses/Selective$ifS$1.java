package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class Selective$ifS$1 extends Lambda implements Styleable.ChangeBounds<A, Styleable.ChangeBounds<? super setAnimationMatrix, ? extends A>> {
    public static final Selective$ifS$1 INSTANCE = new Selective$ifS$1();

    Selective$ifS$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((Selective$ifS$1) obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: arrow.typeclasses.Selective$ifS$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<setAnimationMatrix, A> {
        final /* synthetic */ Object $it;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Object obj) {
            super(1);
            this.$it = obj;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [A, java.lang.Object] */
        @Override // o.Styleable.ChangeBounds
        public final A invoke(setAnimationMatrix setanimationmatrix) {
            runAnimators.valueOf(setanimationmatrix, "<anonymous parameter 0>");
            return this.$it;
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final Styleable.ChangeBounds<setAnimationMatrix, A> invoke(A a) {
        return new AnonymousClass1(a);
    }
}
