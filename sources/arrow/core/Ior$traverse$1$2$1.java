package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.postMessage$ag$a;
/* loaded from: classes6.dex */
public final class Ior$traverse$1$2$1 extends Lambda implements Styleable.ChangeBounds<C, postMessage$ag$a<? extends C>> {
    public static final Ior$traverse$1$2$1 INSTANCE = new Ior$traverse$1$2$1();

    Ior$traverse$1$2$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((Ior$traverse$1$2$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final postMessage$ag$a<C> invoke(C c) {
        return new postMessage$ag$a<>(c);
    }
}
