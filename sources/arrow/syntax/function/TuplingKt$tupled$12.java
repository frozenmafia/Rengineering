package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.ITrustedWebActivityService;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class TuplingKt$tupled$12 extends Lambda implements Styleable.ChangeBounds<ITrustedWebActivityService.Default<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8, ? extends T9, ? extends T10, ? extends T11, ? extends T12, ? extends T13>, R> {
    final /* synthetic */ Styleable.Transition $this_tupled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TuplingKt$tupled$12(Styleable.Transition transition) {
        super(1);
        this.$this_tupled = transition;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [R, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final R invoke(ITrustedWebActivityService.Default<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8, ? extends T9, ? extends T10, ? extends T11, ? extends T12, ? extends T13> r16) {
        runAnimators.valueOf(r16, "<name for destructuring parameter 0>");
        return this.$this_tupled.invoke(r16.ag$a(), r16.ah$b(), r16.invoke(), r16.HaptikSDK$a(), r16.HaptikSDK$b(), r16.getSignupData(), r16.HaptikSDK$d(), r16.HaptikWebView(), r16.getInitSettings(), r16.ah$a(), r16.values(), r16.valueOf(), r16.HaptikSDK$c());
    }
}
