package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getActiveNotifications;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class TuplingKt$tupled$11 extends Lambda implements Styleable.ChangeBounds<getActiveNotifications<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8, ? extends T9, ? extends T10, ? extends T11, ? extends T12>, R> {
    final /* synthetic */ Styleable.Slide $this_tupled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TuplingKt$tupled$11(Styleable.Slide slide) {
        super(1);
        this.$this_tupled = slide;
    }

    /* JADX WARN: Type inference failed for: r15v1, types: [R, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final R invoke(getActiveNotifications<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8, ? extends T9, ? extends T10, ? extends T11, ? extends T12> getactivenotifications) {
        runAnimators.valueOf(getactivenotifications, "<name for destructuring parameter 0>");
        return this.$this_tupled.invoke(getactivenotifications.ag$a(), getactivenotifications.invoke(), getactivenotifications.HaptikSDK$c(), getactivenotifications.HaptikSDK$a(), getactivenotifications.HaptikSDK$b(), getactivenotifications.ah$b(), getactivenotifications.getSignupData(), getactivenotifications.getInitSettings(), getactivenotifications.HaptikSDK$d(), getactivenotifications.values(), getactivenotifications.ah$a(), getactivenotifications.valueOf());
    }
}
