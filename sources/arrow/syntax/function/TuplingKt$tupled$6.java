package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.AudioAttributesCompatParcelizer;
import o.Styleable;
import o.matchIds;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class TuplingKt$tupled$6 extends Lambda implements Styleable.ChangeBounds<AudioAttributesCompatParcelizer<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>, R> {
    final /* synthetic */ matchIds $this_tupled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TuplingKt$tupled$6(matchIds matchids) {
        super(1);
        this.$this_tupled = matchids;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [R, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final R invoke(AudioAttributesCompatParcelizer<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> audioAttributesCompatParcelizer) {
        runAnimators.valueOf(audioAttributesCompatParcelizer, "<name for destructuring parameter 0>");
        return this.$this_tupled.invoke(audioAttributesCompatParcelizer.ah$a(), audioAttributesCompatParcelizer.valueOf(), audioAttributesCompatParcelizer.ag$a(), audioAttributesCompatParcelizer.values(), audioAttributesCompatParcelizer.ah$b(), audioAttributesCompatParcelizer.HaptikSDK$c(), audioAttributesCompatParcelizer.invoke());
    }
}
