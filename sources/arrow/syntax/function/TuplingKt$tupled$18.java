package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.ITrustedWebActivityService;
import o.Styleable;
import o.alreadyContains;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class TuplingKt$tupled$18 extends Lambda implements Styleable.ChangeBounds<ITrustedWebActivityService.Stub<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8, ? extends T9, ? extends T10, ? extends T11, ? extends T12, ? extends T13, ? extends T14, ? extends T15, ? extends T16, ? extends T17, ? extends T18, ? extends T19>, R> {
    final /* synthetic */ alreadyContains $this_tupled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TuplingKt$tupled$18(alreadyContains alreadycontains) {
        super(1);
        this.$this_tupled = alreadycontains;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [R, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final R invoke(ITrustedWebActivityService.Stub<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8, ? extends T9, ? extends T10, ? extends T11, ? extends T12, ? extends T13, ? extends T14, ? extends T15, ? extends T16, ? extends T17, ? extends T18, ? extends T19> stub) {
        runAnimators.valueOf(stub, "<name for destructuring parameter 0>");
        return this.$this_tupled.invoke(stub.values(), stub.HaptikSDK$e(), stub.getInitSettings(), stub.getSignupData(), stub.aj$a(), stub.a(), stub.onXdkEvent(), stub.ak(), stub.isLogoutPending(), stub.valueOf(), stub.ah$a(), stub.ag$a(), stub.HaptikSDK$c(), stub.HaptikSDK$b(), stub.invoke(), stub.ah$b(), stub.HaptikSDK$a(), stub.HaptikSDK$d(), stub.HaptikWebView());
    }
}
