package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.isValidMatch;
import o.runAnimators;
import o.write;
/* loaded from: classes6.dex */
public final class TuplingKt$tupled$5 extends Lambda implements Styleable.ChangeBounds<write<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6>, R> {
    final /* synthetic */ isValidMatch $this_tupled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TuplingKt$tupled$5(isValidMatch isvalidmatch) {
        super(1);
        this.$this_tupled = isvalidmatch;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [R, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final R invoke(write<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> writeVar) {
        runAnimators.valueOf(writeVar, "<name for destructuring parameter 0>");
        return this.$this_tupled.invoke(writeVar.valueOf(), writeVar.values(), writeVar.ah$a(), writeVar.ag$a(), writeVar.HaptikSDK$c(), writeVar.invoke());
    }
}
