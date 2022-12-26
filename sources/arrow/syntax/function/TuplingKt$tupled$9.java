package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.ITrustedWebActivityCallback;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class TuplingKt$tupled$9 extends Lambda implements Styleable.ChangeBounds<ITrustedWebActivityCallback.Stub.Proxy<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8, ? extends T9, ? extends T10>, R> {
    final /* synthetic */ Styleable.PatternPathMotion $this_tupled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TuplingKt$tupled$9(Styleable.PatternPathMotion patternPathMotion) {
        super(1);
        this.$this_tupled = patternPathMotion;
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [R, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final R invoke(ITrustedWebActivityCallback.Stub.Proxy<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8, ? extends T9, ? extends T10> proxy) {
        runAnimators.valueOf(proxy, "<name for destructuring parameter 0>");
        return this.$this_tupled.invoke(proxy.ag$a(), proxy.values(), proxy.ah$a(), proxy.HaptikSDK$c(), proxy.ah$b(), proxy.HaptikSDK$b(), proxy.HaptikSDK$a(), proxy.invoke(), proxy.getInitSettings(), proxy.valueOf());
    }
}
