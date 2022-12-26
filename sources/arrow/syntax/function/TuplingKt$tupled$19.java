package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.ITrustedWebActivityService;
import o.Styleable;
import o.addUnmatched;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class TuplingKt$tupled$19 extends Lambda implements Styleable.ChangeBounds<ITrustedWebActivityService.Stub.Proxy<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8, ? extends T9, ? extends T10, ? extends T11, ? extends T12, ? extends T13, ? extends T14, ? extends T15, ? extends T16, ? extends T17, ? extends T18, ? extends T19, ? extends T20>, R> {
    final /* synthetic */ addUnmatched $this_tupled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TuplingKt$tupled$19(addUnmatched addunmatched) {
        super(1);
        this.$this_tupled = addunmatched;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [R, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final R invoke(ITrustedWebActivityService.Stub.Proxy<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8, ? extends T9, ? extends T10, ? extends T11, ? extends T12, ? extends T13, ? extends T14, ? extends T15, ? extends T16, ? extends T17, ? extends T18, ? extends T19, ? extends T20> proxy) {
        runAnimators.valueOf(proxy, "<name for destructuring parameter 0>");
        return this.$this_tupled.invoke(proxy.valueOf(), proxy.HaptikWebView(), proxy.getSignupData(), proxy.onXdkEvent(), proxy.isLogoutPending(), proxy.a(), proxy.ak(), proxy.aj$a(), proxy.ICustomTabsCallback(), proxy.values(), proxy.ah$a(), proxy.ag$a(), proxy.ah$b(), proxy.HaptikSDK$a(), proxy.HaptikSDK$b(), proxy.invoke(), proxy.HaptikSDK$c(), proxy.HaptikSDK$d(), proxy.getInitSettings(), proxy.HaptikSDK$e());
    }
}
