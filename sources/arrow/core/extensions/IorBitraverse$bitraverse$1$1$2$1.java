package arrow.core.extensions;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.postMessage$ag$a;
/* loaded from: classes6.dex */
public final class IorBitraverse$bitraverse$1$1$2$1 extends Lambda implements Styleable.ChangeBounds<D, postMessage$ag$a<? extends D>> {
    public static final IorBitraverse$bitraverse$1$1$2$1 INSTANCE = new IorBitraverse$bitraverse$1$1$2$1();

    IorBitraverse$bitraverse$1$1$2$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((IorBitraverse$bitraverse$1$1$2$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final postMessage$ag$a<D> invoke(D d) {
        return new postMessage$ag$a<>(d);
    }
}
