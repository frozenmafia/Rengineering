package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.ITrustedWebActivityCallback;
import o.Styleable;
/* loaded from: classes6.dex */
public final class Reducible$reduceRightToOption$1 extends Lambda implements Styleable.ChangeBounds<B, ITrustedWebActivityCallback<? extends B>> {
    public static final Reducible$reduceRightToOption$1 INSTANCE = new Reducible$reduceRightToOption$1();

    Reducible$reduceRightToOption$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((Reducible$reduceRightToOption$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final ITrustedWebActivityCallback<B> invoke(B b2) {
        return new ITrustedWebActivityCallback<>(b2);
    }
}
