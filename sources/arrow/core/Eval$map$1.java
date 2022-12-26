package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.asBinder;
/* loaded from: classes6.dex */
public final class Eval$map$1 extends Lambda implements Styleable.ChangeBounds<A, asBinder.invoke<? extends B>> {
    final /* synthetic */ Styleable.ChangeBounds $f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Eval$map$1(Styleable.ChangeBounds changeBounds) {
        super(1);
        this.$f = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((Eval$map$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final asBinder.invoke<B> invoke(A a) {
        return new asBinder.invoke<>(this.$f.invoke(a));
    }
}
