package androidx.lifecycle;

import o.runAnimators;
/* loaded from: classes6.dex */
public final class LifecycleOwnerKt {
    public static final LifecycleCoroutineScope getLifecycleScope(LifecycleOwner lifecycleOwner) {
        runAnimators.ag$a(lifecycleOwner, "$this$lifecycleScope");
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        runAnimators.ah$a(lifecycle, "lifecycle");
        return LifecycleKt.getCoroutineScope(lifecycle);
    }
}
