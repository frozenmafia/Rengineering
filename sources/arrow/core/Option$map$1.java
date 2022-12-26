package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.ITrustedWebActivityCallback;
import o.Styleable;
/* loaded from: classes6.dex */
public final class Option$map$1 extends Lambda implements Styleable.ChangeBounds<A, ITrustedWebActivityCallback<? extends B>> {
    final /* synthetic */ Styleable.ChangeBounds $f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Option$map$1(Styleable.ChangeBounds changeBounds) {
        super(1);
        this.$f = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((Option$map$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final ITrustedWebActivityCallback<B> invoke(A a) {
        return new ITrustedWebActivityCallback<>(this.$f.invoke(a));
    }
}
