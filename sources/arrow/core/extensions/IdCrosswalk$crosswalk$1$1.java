package arrow.core.extensions;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.onTransact;
/* loaded from: classes6.dex */
public final class IdCrosswalk$crosswalk$1$1 extends Lambda implements Styleable.ChangeBounds<B, onTransact<? extends B>> {
    public static final IdCrosswalk$crosswalk$1$1 INSTANCE = new IdCrosswalk$crosswalk$1$1();

    IdCrosswalk$crosswalk$1$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((IdCrosswalk$crosswalk$1$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final onTransact<B> invoke(B b2) {
        return onTransact.ah$a.values(b2);
    }
}
