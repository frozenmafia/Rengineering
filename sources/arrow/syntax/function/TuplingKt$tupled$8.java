package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.matchInstances;
import o.read;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class TuplingKt$tupled$8 extends Lambda implements Styleable.ChangeBounds<read<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8, ? extends T9>, R> {
    final /* synthetic */ matchInstances $this_tupled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TuplingKt$tupled$8(matchInstances matchinstances) {
        super(1);
        this.$this_tupled = matchinstances;
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [R, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final R invoke(read<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8, ? extends T9> readVar) {
        runAnimators.valueOf(readVar, "<name for destructuring parameter 0>");
        return this.$this_tupled.invoke(readVar.values(), readVar.ah$a(), readVar.ag$a(), readVar.valueOf(), readVar.invoke(), readVar.HaptikSDK$b(), readVar.HaptikSDK$c(), readVar.HaptikSDK$a(), readVar.ah$b());
    }
}
