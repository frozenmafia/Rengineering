package o;

import android.content.Context;
import android.os.Looper;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class ActivityRule$$ExternalSyntheticBackport0 {
    ActivityRule$$ExternalSyntheticBackport0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void values(androidx.databinding.ViewDataBinding viewDataBinding, int i, int i2) {
        String resourceName = viewDataBinding.getRoot().getContext().getResources().getResourceName(i2);
        String convertBrIdToString = androidx.databinding.DataBindingUtil.convertBrIdToString(i);
        throw new IllegalStateException("Could not bind variable '" + convertBrIdToString + "' in layout '" + resourceName + "'");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static androidx.lifecycle.LifecycleOwner values(View view) {
        androidx.databinding.ViewDataBinding findBinding = androidx.databinding.DataBindingUtil.findBinding(view);
        androidx.lifecycle.LifecycleOwner lifecycleOwner = findBinding != null ? findBinding.getLifecycleOwner() : null;
        Context context = view.getContext();
        return (lifecycleOwner == null && (context instanceof androidx.lifecycle.LifecycleOwner)) ? (androidx.lifecycle.LifecycleOwner) context : lifecycleOwner;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void ah$a() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new IllegalStateException("You must only modify the ObservableList on the main thread.");
        }
    }
}
