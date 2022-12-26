package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.ITrustedWebActivityCallback;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class TuplingKt$tupled$10 extends Lambda implements Styleable.ChangeBounds<ITrustedWebActivityCallback.Stub<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8, ? extends T9, ? extends T10, ? extends T11>, R> {
    final /* synthetic */ Styleable.Fade $this_tupled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TuplingKt$tupled$10(Styleable.Fade fade) {
        super(1);
        this.$this_tupled = fade;
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [R, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final R invoke(ITrustedWebActivityCallback.Stub<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8, ? extends T9, ? extends T10, ? extends T11> stub) {
        runAnimators.valueOf(stub, "<name for destructuring parameter 0>");
        return this.$this_tupled.invoke(stub.ah$a(), stub.valueOf(), stub.HaptikSDK$a(), stub.HaptikSDK$c(), stub.ah$b(), stub.HaptikSDK$b(), stub.invoke(), stub.HaptikSDK$e(), stub.HaptikSDK$d(), stub.ag$a(), stub.values());
    }
}
