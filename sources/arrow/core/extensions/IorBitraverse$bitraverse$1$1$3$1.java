package arrow.core.extensions;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.cancel;
import o.postMessage;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class IorBitraverse$bitraverse$1$1$3$1 extends Lambda implements Styleable.ChangeBounds<cancel<? extends C, ? extends D>, postMessage.valueOf<? extends C, ? extends D>> {
    public static final IorBitraverse$bitraverse$1$1$3$1 INSTANCE = new IorBitraverse$bitraverse$1$1$3$1();

    IorBitraverse$bitraverse$1$1$3$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final postMessage.valueOf<C, D> invoke(cancel<? extends C, ? extends D> cancelVar) {
        runAnimators.valueOf(cancelVar, "it");
        return new postMessage.valueOf<>(cancelVar.ag$a(), cancelVar.ah$a());
    }
}
