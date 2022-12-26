package androidx.activity;

import androidx.lifecycle.LifecycleOwner;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes5.dex */
public final class OnBackPressedDispatcherKt {
    public static /* synthetic */ OnBackPressedCallback addCallback$default(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, boolean z, Styleable.ChangeBounds changeBounds, int i, Object obj) {
        if ((i & 1) != 0) {
            lifecycleOwner = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return addCallback(onBackPressedDispatcher, lifecycleOwner, z, changeBounds);
    }

    public static final OnBackPressedCallback addCallback(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, final boolean z, final Styleable.ChangeBounds<? super OnBackPressedCallback, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(onBackPressedDispatcher, "$this$addCallback");
        runAnimators.ag$a(changeBounds, "onBackPressed");
        OnBackPressedCallback onBackPressedCallback = new OnBackPressedCallback(z) { // from class: androidx.activity.OnBackPressedDispatcherKt$addCallback$callback$1
            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                Styleable.ChangeBounds.this.invoke(this);
            }
        };
        if (lifecycleOwner != null) {
            onBackPressedDispatcher.addCallback(lifecycleOwner, onBackPressedCallback);
        } else {
            onBackPressedDispatcher.addCallback(onBackPressedCallback);
        }
        return onBackPressedCallback;
    }
}
