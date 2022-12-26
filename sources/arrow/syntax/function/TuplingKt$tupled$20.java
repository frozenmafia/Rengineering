package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.INotificationSideChannel;
import o.Styleable;
import o.excludeView;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class TuplingKt$tupled$20 extends Lambda implements Styleable.ChangeBounds<INotificationSideChannel.Stub.Proxy<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8, ? extends T9, ? extends T10, ? extends T11, ? extends T12, ? extends T13, ? extends T14, ? extends T15, ? extends T16, ? extends T17, ? extends T18, ? extends T19, ? extends T20, ? extends T21>, R> {
    final /* synthetic */ excludeView $this_tupled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TuplingKt$tupled$20(excludeView excludeview) {
        super(1);
        this.$this_tupled = excludeview;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [R, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final R invoke(INotificationSideChannel.Stub.Proxy<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8, ? extends T9, ? extends T10, ? extends T11, ? extends T12, ? extends T13, ? extends T14, ? extends T15, ? extends T16, ? extends T17, ? extends T18, ? extends T19, ? extends T20, ? extends T21> proxy) {
        runAnimators.valueOf(proxy, "<name for destructuring parameter 0>");
        return this.$this_tupled.invoke(proxy.ah$a(), proxy.getSignupData(), proxy.isLogoutPending(), proxy.onXdkEvent(), proxy.a(), proxy.ak(), proxy.aj$a(), proxy.extraCallback(), proxy.ak$a(), proxy.values(), proxy.valueOf(), proxy.ag$a(), proxy.HaptikSDK$c(), proxy.HaptikSDK$b(), proxy.ah$b(), proxy.invoke(), proxy.HaptikSDK$a(), proxy.HaptikWebView(), proxy.getInitSettings(), proxy.HaptikSDK$e(), proxy.HaptikSDK$d());
    }
}
