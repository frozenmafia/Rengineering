package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.INotificationSideChannel;
import o.Styleable;
import o.excludeObject;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class TuplingKt$tupled$2 extends Lambda implements Styleable.ChangeBounds<INotificationSideChannel.Default<? extends T1, ? extends T2, ? extends T3>, R> {
    final /* synthetic */ excludeObject $this_tupled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TuplingKt$tupled$2(excludeObject excludeobject) {
        super(1);
        this.$this_tupled = excludeobject;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [R, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final R invoke(INotificationSideChannel.Default<? extends T1, ? extends T2, ? extends T3> r4) {
        runAnimators.valueOf(r4, "<name for destructuring parameter 0>");
        return this.$this_tupled.invoke(r4.values(), r4.valueOf(), r4.ag$a());
    }
}
