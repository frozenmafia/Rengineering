package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.Transition;
import o.cancel;
/* loaded from: classes6.dex */
public final class TuplingKt$untupled$1 extends Lambda implements Transition<T1, T2, R> {
    final /* synthetic */ Styleable.ChangeBounds $this_untupled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TuplingKt$untupled$1(Styleable.ChangeBounds changeBounds) {
        super(2);
        this.$this_untupled = changeBounds;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [R, java.lang.Object] */
    @Override // o.Transition
    public final R invoke(T1 t1, T2 t2) {
        return this.$this_untupled.invoke(new cancel(t1, t2));
    }
}
