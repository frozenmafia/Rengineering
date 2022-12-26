package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.IconCompatParcelizer;
import o.Styleable;
import o.isValueChanged;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class TuplingKt$tupled$7 extends Lambda implements Styleable.ChangeBounds<IconCompatParcelizer<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>, R> {
    final /* synthetic */ isValueChanged $this_tupled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TuplingKt$tupled$7(isValueChanged isvaluechanged) {
        super(1);
        this.$this_tupled = isvaluechanged;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [R, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final R invoke(IconCompatParcelizer<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8> iconCompatParcelizer) {
        runAnimators.valueOf(iconCompatParcelizer, "<name for destructuring parameter 0>");
        return this.$this_tupled.invoke(iconCompatParcelizer.ah$a(), iconCompatParcelizer.ag$a(), iconCompatParcelizer.values(), iconCompatParcelizer.valueOf(), iconCompatParcelizer.invoke(), iconCompatParcelizer.ah$b(), iconCompatParcelizer.HaptikSDK$b(), iconCompatParcelizer.HaptikSDK$c());
    }
}
