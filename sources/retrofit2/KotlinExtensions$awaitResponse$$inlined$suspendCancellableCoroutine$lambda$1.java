package retrofit2;

import kotlin.jvm.internal.Lambda;
import o.SidecarCompat$registerConfigurationChangeListener$configChangeObserver$1;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes5.dex */
public final class KotlinExtensions$awaitResponse$$inlined$suspendCancellableCoroutine$lambda$1 extends Lambda implements Styleable.ChangeBounds<Throwable, setAnimationMatrix> {
    final /* synthetic */ SidecarCompat$registerConfigurationChangeListener$configChangeObserver$1 $this_awaitResponse$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KotlinExtensions$awaitResponse$$inlined$suspendCancellableCoroutine$lambda$1(SidecarCompat$registerConfigurationChangeListener$configChangeObserver$1 sidecarCompat$registerConfigurationChangeListener$configChangeObserver$1) {
        super(1);
        this.$this_awaitResponse$inlined = sidecarCompat$registerConfigurationChangeListener$configChangeObserver$1;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(Throwable th) {
        invoke2(th);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        this.$this_awaitResponse$inlined.ag$a();
    }
}
