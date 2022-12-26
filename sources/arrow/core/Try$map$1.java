package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.ITrustedWebActivityService;
import o.Styleable;
/* loaded from: classes6.dex */
public final class Try$map$1 extends Lambda implements Styleable.ChangeBounds<A, ITrustedWebActivityService.toString<? extends B>> {
    final /* synthetic */ Styleable.ChangeBounds $f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Try$map$1(Styleable.ChangeBounds changeBounds) {
        super(1);
        this.$f = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((Try$map$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final ITrustedWebActivityService.toString<B> invoke(A a) {
        return new ITrustedWebActivityService.toString<>(this.$f.invoke(a));
    }
}
