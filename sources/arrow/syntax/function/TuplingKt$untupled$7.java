package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.IconCompatParcelizer;
import o.Styleable;
import o.isValueChanged;
/* loaded from: classes6.dex */
public final class TuplingKt$untupled$7 extends Lambda implements isValueChanged<T1, T2, T3, T4, T5, T6, T7, T8, R> {
    final /* synthetic */ Styleable.ChangeBounds $this_untupled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TuplingKt$untupled$7(Styleable.ChangeBounds changeBounds) {
        super(8);
        this.$this_untupled = changeBounds;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [R, java.lang.Object] */
    @Override // o.isValueChanged
    public final R invoke(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return this.$this_untupled.invoke(new IconCompatParcelizer(t1, t2, t3, t4, t5, t6, t7, t8));
    }
}
