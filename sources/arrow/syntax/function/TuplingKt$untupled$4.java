package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.RemoteActionCompatParcelizer;
import o.Styleable;
import o.excludeId;
/* loaded from: classes6.dex */
public final class TuplingKt$untupled$4 extends Lambda implements excludeId<T1, T2, T3, T4, T5, R> {
    final /* synthetic */ Styleable.ChangeBounds $this_untupled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TuplingKt$untupled$4(Styleable.ChangeBounds changeBounds) {
        super(5);
        this.$this_untupled = changeBounds;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [R, java.lang.Object] */
    @Override // o.excludeId
    public final R invoke(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return this.$this_untupled.invoke(new RemoteActionCompatParcelizer(t1, t2, t3, t4, t5));
    }
}
