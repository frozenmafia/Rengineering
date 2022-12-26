package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.Transition;
import o.cancel;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class TuplingKt$tupled$1 extends Lambda implements Styleable.ChangeBounds<cancel<? extends T1, ? extends T2>, R> {
    final /* synthetic */ Transition $this_tupled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TuplingKt$tupled$1(Transition transition) {
        super(1);
        this.$this_tupled = transition;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [R, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final R invoke(cancel<? extends T1, ? extends T2> cancelVar) {
        runAnimators.valueOf(cancelVar, "<name for destructuring parameter 0>");
        return this.$this_tupled.invoke(cancelVar.valueOf(), cancelVar.values());
    }
}
