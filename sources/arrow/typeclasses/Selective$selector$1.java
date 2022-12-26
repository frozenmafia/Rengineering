package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.asInterface;
import o.setAnimationMatrix;
import o.setDefaultImpl;
/* loaded from: classes6.dex */
public final class Selective$selector$1 extends Lambda implements Styleable.ChangeBounds<Boolean, setDefaultImpl<? extends setAnimationMatrix, ? extends setAnimationMatrix>> {
    public static final Selective$selector$1 INSTANCE = new Selective$selector$1();

    Selective$selector$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public /* synthetic */ setDefaultImpl<? extends setAnimationMatrix, ? extends setAnimationMatrix> invoke(Boolean bool) {
        return invoke(bool.booleanValue());
    }

    public final setDefaultImpl<setAnimationMatrix, setAnimationMatrix> invoke(boolean z) {
        return z ? asInterface.values(setAnimationMatrix.ag$a) : asInterface.ag$a(setAnimationMatrix.ag$a);
    }
}
