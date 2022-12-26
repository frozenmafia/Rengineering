package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.INotificationSideChannel;
import o.Styleable;
import o.excludeObject;
/* loaded from: classes6.dex */
public final class TuplingKt$untupled$2 extends Lambda implements excludeObject<T1, T2, T3, R> {
    final /* synthetic */ Styleable.ChangeBounds $this_untupled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TuplingKt$untupled$2(Styleable.ChangeBounds changeBounds) {
        super(3);
        this.$this_untupled = changeBounds;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [R, java.lang.Object] */
    @Override // o.excludeObject
    public final R invoke(T1 t1, T2 t2, T3 t3) {
        return this.$this_untupled.invoke(new INotificationSideChannel.Default(t1, t2, t3));
    }
}
