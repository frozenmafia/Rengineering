package arrow.core.extensions;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.newSessionWithExtras;
import o.postMessage;
/* loaded from: classes6.dex */
public final class IorBicrosswalk$bicrosswalk$1$1 extends Lambda implements Styleable.ChangeBounds<C, postMessage> {
    public static final IorBicrosswalk$bicrosswalk$1$1 INSTANCE = new IorBicrosswalk$bicrosswalk$1$1();

    IorBicrosswalk$bicrosswalk$1$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ postMessage invoke(Object obj) {
        return invoke2((IorBicrosswalk$bicrosswalk$1$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final postMessage invoke2(C c) {
        return newSessionWithExtras.ag$a(c);
    }
}
