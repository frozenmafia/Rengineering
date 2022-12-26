package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.INotificationSideChannel;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class TuplingKt$tupled$17 extends Lambda implements Styleable.ChangeBounds<INotificationSideChannel<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8, ? extends T9, ? extends T10, ? extends T11, ? extends T12, ? extends T13, ? extends T14, ? extends T15, ? extends T16, ? extends T17, ? extends T18>, R> {
    final /* synthetic */ Styleable.VisibilityTransition $this_tupled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TuplingKt$tupled$17(Styleable.VisibilityTransition visibilityTransition) {
        super(1);
        this.$this_tupled = visibilityTransition;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [R, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final R invoke(INotificationSideChannel<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8, ? extends T9, ? extends T10, ? extends T11, ? extends T12, ? extends T13, ? extends T14, ? extends T15, ? extends T16, ? extends T17, ? extends T18> iNotificationSideChannel) {
        runAnimators.valueOf(iNotificationSideChannel, "<name for destructuring parameter 0>");
        return this.$this_tupled.invoke(iNotificationSideChannel.ah$a(), iNotificationSideChannel.getInitSettings(), iNotificationSideChannel.HaptikSDK$d(), iNotificationSideChannel.getSignupData(), iNotificationSideChannel.HaptikWebView(), iNotificationSideChannel.a(), iNotificationSideChannel.isLogoutPending(), iNotificationSideChannel.onXdkEvent(), iNotificationSideChannel.ak(), iNotificationSideChannel.ag$a(), iNotificationSideChannel.valueOf(), iNotificationSideChannel.values(), iNotificationSideChannel.invoke(), iNotificationSideChannel.HaptikSDK$a(), iNotificationSideChannel.HaptikSDK$b(), iNotificationSideChannel.HaptikSDK$c(), iNotificationSideChannel.ah$b(), iNotificationSideChannel.HaptikSDK$e());
    }
}
