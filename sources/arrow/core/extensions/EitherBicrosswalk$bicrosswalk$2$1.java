package arrow.core.extensions;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.asInterface;
import o.setDefaultImpl;
/* loaded from: classes6.dex */
public final class EitherBicrosswalk$bicrosswalk$2$1 extends Lambda implements Styleable.ChangeBounds<D, setDefaultImpl> {
    public static final EitherBicrosswalk$bicrosswalk$2$1 INSTANCE = new EitherBicrosswalk$bicrosswalk$2$1();

    EitherBicrosswalk$bicrosswalk$2$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setDefaultImpl invoke(Object obj) {
        return invoke2((EitherBicrosswalk$bicrosswalk$2$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final setDefaultImpl invoke2(D d) {
        return asInterface.ag$a(d);
    }
}
