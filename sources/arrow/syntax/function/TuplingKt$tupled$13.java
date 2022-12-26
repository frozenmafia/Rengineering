package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.notifyNotificationWithChannel;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class TuplingKt$tupled$13 extends Lambda implements Styleable.ChangeBounds<notifyNotificationWithChannel<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8, ? extends T9, ? extends T10, ? extends T11, ? extends T12, ? extends T13, ? extends T14>, R> {
    final /* synthetic */ Styleable.TransitionTarget $this_tupled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TuplingKt$tupled$13(Styleable.TransitionTarget transitionTarget) {
        super(1);
        this.$this_tupled = transitionTarget;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [R, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final R invoke(notifyNotificationWithChannel<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8, ? extends T9, ? extends T10, ? extends T11, ? extends T12, ? extends T13, ? extends T14> notifynotificationwithchannel) {
        runAnimators.valueOf(notifynotificationwithchannel, "<name for destructuring parameter 0>");
        return this.$this_tupled.invoke(notifynotificationwithchannel.ag$a(), notifynotificationwithchannel.invoke(), notifynotificationwithchannel.HaptikSDK$c(), notifynotificationwithchannel.ah$b(), notifynotificationwithchannel.getInitSettings(), notifynotificationwithchannel.HaptikSDK$e(), notifynotificationwithchannel.getSignupData(), notifynotificationwithchannel.HaptikWebView(), notifynotificationwithchannel.HaptikSDK$d(), notifynotificationwithchannel.valueOf(), notifynotificationwithchannel.values(), notifynotificationwithchannel.ah$a(), notifynotificationwithchannel.HaptikSDK$a(), notifynotificationwithchannel.HaptikSDK$b());
    }
}
