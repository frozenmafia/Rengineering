package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class Functor$void$1 extends Lambda implements Styleable.ChangeBounds<A, setAnimationMatrix> {
    public static final Functor$void$1 INSTANCE = new Functor$void$1();

    Functor$void$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(A a) {
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(Object obj) {
        invoke2((Functor$void$1) obj);
        return setAnimationMatrix.ag$a;
    }
}
