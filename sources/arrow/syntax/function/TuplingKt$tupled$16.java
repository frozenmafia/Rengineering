package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.addViewValues;
import o.cancelAll;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class TuplingKt$tupled$16 extends Lambda implements Styleable.ChangeBounds<cancelAll<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8, ? extends T9, ? extends T10, ? extends T11, ? extends T12, ? extends T13, ? extends T14, ? extends T15, ? extends T16, ? extends T17>, R> {
    final /* synthetic */ addViewValues $this_tupled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TuplingKt$tupled$16(addViewValues addviewvalues) {
        super(1);
        this.$this_tupled = addviewvalues;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [R, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final R invoke(cancelAll<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8, ? extends T9, ? extends T10, ? extends T11, ? extends T12, ? extends T13, ? extends T14, ? extends T15, ? extends T16, ? extends T17> cancelall) {
        runAnimators.valueOf(cancelall, "<name for destructuring parameter 0>");
        return this.$this_tupled.invoke(cancelall.valueOf(), cancelall.getSignupData(), cancelall.HaptikSDK$d(), cancelall.HaptikSDK$e(), cancelall.getInitSettings(), cancelall.HaptikWebView(), cancelall.a(), cancelall.ak(), cancelall.aj$a(), cancelall.ah$a(), cancelall.values(), cancelall.ag$a(), cancelall.HaptikSDK$c(), cancelall.HaptikSDK$a(), cancelall.HaptikSDK$b(), cancelall.ah$b(), cancelall.invoke());
    }
}
