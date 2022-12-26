package androidx.activity.contextaware;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes5.dex */
public final class ContextAwareKt$withContextAvailable$$inlined$suspendCancellableCoroutine$lambda$2 extends Lambda implements Styleable.ChangeBounds<Throwable, setAnimationMatrix> {
    final /* synthetic */ ContextAwareKt$withContextAvailable$$inlined$suspendCancellableCoroutine$lambda$1 $listener;
    final /* synthetic */ Styleable.ChangeBounds $onContextAvailable$inlined;
    final /* synthetic */ ContextAware $this_withContextAvailable$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextAwareKt$withContextAvailable$$inlined$suspendCancellableCoroutine$lambda$2(ContextAwareKt$withContextAvailable$$inlined$suspendCancellableCoroutine$lambda$1 contextAwareKt$withContextAvailable$$inlined$suspendCancellableCoroutine$lambda$1, ContextAware contextAware, Styleable.ChangeBounds changeBounds) {
        super(1);
        this.$listener = contextAwareKt$withContextAvailable$$inlined$suspendCancellableCoroutine$lambda$1;
        this.$this_withContextAvailable$inlined = contextAware;
        this.$onContextAvailable$inlined = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(Throwable th) {
        invoke2(th);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        this.$this_withContextAvailable$inlined.removeOnContextAvailableListener(this.$listener);
    }
}
