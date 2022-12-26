package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getSmallIconId;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class TuplingKt$tupled$14 extends Lambda implements Styleable.ChangeBounds<getSmallIconId<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8, ? extends T9, ? extends T10, ? extends T11, ? extends T12, ? extends T13, ? extends T14, ? extends T15>, R> {
    final /* synthetic */ Styleable.TransitionSet $this_tupled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TuplingKt$tupled$14(Styleable.TransitionSet transitionSet) {
        super(1);
        this.$this_tupled = transitionSet;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [R, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final R invoke(getSmallIconId<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8, ? extends T9, ? extends T10, ? extends T11, ? extends T12, ? extends T13, ? extends T14, ? extends T15> getsmalliconid) {
        runAnimators.valueOf(getsmalliconid, "<name for destructuring parameter 0>");
        return this.$this_tupled.invoke(getsmalliconid.values(), getsmalliconid.HaptikSDK$b(), getsmalliconid.ah$b(), getsmalliconid.HaptikSDK$d(), getsmalliconid.HaptikWebView(), getsmalliconid.getSignupData(), getsmalliconid.getInitSettings(), getsmalliconid.HaptikSDK$e(), getsmalliconid.a(), getsmalliconid.ag$a(), getsmalliconid.valueOf(), getsmalliconid.ah$a(), getsmalliconid.invoke(), getsmalliconid.HaptikSDK$a(), getsmalliconid.HaptikSDK$c());
    }
}
