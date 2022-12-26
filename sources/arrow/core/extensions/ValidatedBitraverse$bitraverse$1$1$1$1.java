package arrow.core.extensions;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.disconnect$ag$a;
/* loaded from: classes6.dex */
public final class ValidatedBitraverse$bitraverse$1$1$1$1 extends Lambda implements Styleable.ChangeBounds<C, disconnect$ag$a<? extends C>> {
    public static final ValidatedBitraverse$bitraverse$1$1$1$1 INSTANCE = new ValidatedBitraverse$bitraverse$1$1$1$1();

    ValidatedBitraverse$bitraverse$1$1$1$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((ValidatedBitraverse$bitraverse$1$1$1$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final disconnect$ag$a<C> invoke(C c) {
        return new disconnect$ag$a<>(c);
    }
}
