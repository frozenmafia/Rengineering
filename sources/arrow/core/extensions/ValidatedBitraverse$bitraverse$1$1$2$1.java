package arrow.core.extensions;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.disconnect;
/* loaded from: classes6.dex */
public final class ValidatedBitraverse$bitraverse$1$1$2$1 extends Lambda implements Styleable.ChangeBounds<D, disconnect.valueOf<? extends D>> {
    public static final ValidatedBitraverse$bitraverse$1$1$2$1 INSTANCE = new ValidatedBitraverse$bitraverse$1$1$2$1();

    ValidatedBitraverse$bitraverse$1$1$2$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((ValidatedBitraverse$bitraverse$1$1$2$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final disconnect.valueOf<D> invoke(D d) {
        return new disconnect.valueOf<>(d);
    }
}
