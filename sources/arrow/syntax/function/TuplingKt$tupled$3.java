package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.INotificationSideChannel;
import o.Styleable;
import o.captureHierarchy;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class TuplingKt$tupled$3 extends Lambda implements Styleable.ChangeBounds<INotificationSideChannel.Stub<? extends T1, ? extends T2, ? extends T3, ? extends T4>, R> {
    final /* synthetic */ captureHierarchy $this_tupled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TuplingKt$tupled$3(captureHierarchy capturehierarchy) {
        super(1);
        this.$this_tupled = capturehierarchy;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [R, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final R invoke(INotificationSideChannel.Stub<? extends T1, ? extends T2, ? extends T3, ? extends T4> stub) {
        runAnimators.valueOf(stub, "<name for destructuring parameter 0>");
        return this.$this_tupled.invoke(stub.values(), stub.ag$a(), stub.ah$a(), stub.valueOf());
    }
}
