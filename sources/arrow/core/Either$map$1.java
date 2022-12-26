package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setDefaultImpl;
/* loaded from: classes6.dex */
public final class Either$map$1 extends Lambda implements Styleable.ChangeBounds<B, setDefaultImpl.values<? extends C>> {
    final /* synthetic */ Styleable.ChangeBounds $f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Either$map$1(Styleable.ChangeBounds changeBounds) {
        super(1);
        this.$f = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((Either$map$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final setDefaultImpl.values<C> invoke(B b2) {
        return new setDefaultImpl.values<>(this.$f.invoke(b2));
    }
}
