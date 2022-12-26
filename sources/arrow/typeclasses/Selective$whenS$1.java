package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class Selective$whenS$1 extends Lambda implements Styleable.ChangeBounds<Styleable.ArcMotion<? extends setAnimationMatrix>, Styleable.ChangeBounds<? super setAnimationMatrix, ? extends setAnimationMatrix>> {
    public static final Selective$whenS$1 INSTANCE = new Selective$whenS$1();

    Selective$whenS$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: arrow.typeclasses.Selective$whenS$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<setAnimationMatrix, setAnimationMatrix> {
        final /* synthetic */ Styleable.ArcMotion $f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Styleable.ArcMotion arcMotion) {
            super(1);
            this.$f = arcMotion;
        }

        @Override // o.Styleable.ChangeBounds
        public /* bridge */ /* synthetic */ setAnimationMatrix invoke(setAnimationMatrix setanimationmatrix) {
            invoke2(setanimationmatrix);
            return setAnimationMatrix.ag$a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(setAnimationMatrix setanimationmatrix) {
            runAnimators.valueOf(setanimationmatrix, "<anonymous parameter 0>");
            this.$f.invoke();
        }
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Styleable.ChangeBounds<? super setAnimationMatrix, ? extends setAnimationMatrix> invoke(Styleable.ArcMotion<? extends setAnimationMatrix> arcMotion) {
        return invoke2((Styleable.ArcMotion<setAnimationMatrix>) arcMotion);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Styleable.ChangeBounds<setAnimationMatrix, setAnimationMatrix> invoke2(Styleable.ArcMotion<setAnimationMatrix> arcMotion) {
        runAnimators.valueOf(arcMotion, "f");
        return new AnonymousClass1(arcMotion);
    }
}
