package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.disconnect;
/* loaded from: classes6.dex */
public final class ValidatedKt$handleError$1 extends Lambda implements Styleable.ChangeBounds<E, disconnect.valueOf<? extends A>> {
    final /* synthetic */ Styleable.ChangeBounds $f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ValidatedKt$handleError$1(Styleable.ChangeBounds changeBounds) {
        super(1);
        this.$f = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((ValidatedKt$handleError$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final disconnect.valueOf<A> invoke(E e) {
        return new disconnect.valueOf<>(this.$f.invoke(e));
    }
}
