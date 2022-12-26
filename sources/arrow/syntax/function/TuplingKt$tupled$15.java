package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getSmallIconBitmap;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class TuplingKt$tupled$15 extends Lambda implements Styleable.ChangeBounds<getSmallIconBitmap<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8, ? extends T9, ? extends T10, ? extends T11, ? extends T12, ? extends T13, ? extends T14, ? extends T15, ? extends T16>, R> {
    final /* synthetic */ Styleable.TransitionManager $this_tupled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TuplingKt$tupled$15(Styleable.TransitionManager transitionManager) {
        super(1);
        this.$this_tupled = transitionManager;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [R, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final R invoke(getSmallIconBitmap<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8, ? extends T9, ? extends T10, ? extends T11, ? extends T12, ? extends T13, ? extends T14, ? extends T15, ? extends T16> getsmalliconbitmap) {
        runAnimators.valueOf(getsmalliconbitmap, "<name for destructuring parameter 0>");
        return this.$this_tupled.invoke(getsmalliconbitmap.ah$a(), getsmalliconbitmap.ah$b(), getsmalliconbitmap.getSignupData(), getsmalliconbitmap.HaptikSDK$d(), getsmalliconbitmap.HaptikSDK$e(), getsmalliconbitmap.HaptikWebView(), getsmalliconbitmap.getInitSettings(), getsmalliconbitmap.a(), getsmalliconbitmap.isLogoutPending(), getsmalliconbitmap.values(), getsmalliconbitmap.ag$a(), getsmalliconbitmap.valueOf(), getsmalliconbitmap.invoke(), getsmalliconbitmap.HaptikSDK$c(), getsmalliconbitmap.HaptikSDK$b(), getsmalliconbitmap.HaptikSDK$a());
    }
}
