package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.excludeType;
import o.notify;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class TuplingKt$tupled$21 extends Lambda implements Styleable.ChangeBounds<notify<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8, ? extends T9, ? extends T10, ? extends T11, ? extends T12, ? extends T13, ? extends T14, ? extends T15, ? extends T16, ? extends T17, ? extends T18, ? extends T19, ? extends T20, ? extends T21, ? extends T22>, R> {
    final /* synthetic */ excludeType $this_tupled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TuplingKt$tupled$21(excludeType excludetype) {
        super(1);
        this.$this_tupled = excludetype;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [R, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final R invoke(notify<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8, ? extends T9, ? extends T10, ? extends T11, ? extends T12, ? extends T13, ? extends T14, ? extends T15, ? extends T16, ? extends T17, ? extends T18, ? extends T19, ? extends T20, ? extends T21, ? extends T22> notifyVar) {
        runAnimators.valueOf(notifyVar, "<name for destructuring parameter 0>");
        return this.$this_tupled.invoke(notifyVar.valueOf(), notifyVar.getSignupData(), notifyVar.isLogoutPending(), notifyVar.aj$a(), notifyVar.onXdkEvent(), notifyVar.a(), notifyVar.ak$b(), notifyVar.extraCallback(), notifyVar.extraCallbackWithResult(), notifyVar.values(), notifyVar.ah$a(), notifyVar.ag$a(), notifyVar.invoke(), notifyVar.HaptikSDK$b(), notifyVar.HaptikSDK$a(), notifyVar.HaptikSDK$c(), notifyVar.ah$b(), notifyVar.HaptikSDK$e(), notifyVar.HaptikSDK$d(), notifyVar.HaptikWebView(), notifyVar.getInitSettings(), notifyVar.ak());
    }
}
