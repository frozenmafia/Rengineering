package arrow.core.extensions;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.asInterface;
import o.setDefaultImpl;
/* loaded from: classes6.dex */
public final class EitherBicrosswalk$bicrosswalk$1$1 extends Lambda implements Styleable.ChangeBounds<C, setDefaultImpl> {
    public static final EitherBicrosswalk$bicrosswalk$1$1 INSTANCE = new EitherBicrosswalk$bicrosswalk$1$1();

    EitherBicrosswalk$bicrosswalk$1$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setDefaultImpl invoke(Object obj) {
        return invoke2((EitherBicrosswalk$bicrosswalk$1$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final setDefaultImpl invoke2(C c) {
        return asInterface.values(c);
    }
}
