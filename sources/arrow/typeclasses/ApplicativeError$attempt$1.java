package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.asInterface;
import o.setDefaultImpl;
/* loaded from: classes6.dex */
public final class ApplicativeError$attempt$1 extends Lambda implements Styleable.ChangeBounds<A, setDefaultImpl> {
    public static final ApplicativeError$attempt$1 INSTANCE = new ApplicativeError$attempt$1();

    ApplicativeError$attempt$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setDefaultImpl invoke(Object obj) {
        return invoke2((ApplicativeError$attempt$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final setDefaultImpl invoke2(A a) {
        return asInterface.toString(a);
    }
}
