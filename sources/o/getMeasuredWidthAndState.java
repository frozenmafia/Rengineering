package o;

import java.util.concurrent.CopyOnWriteArrayList;
import o.Styleable;
import o.ViewCompat;
/* loaded from: classes3.dex */
public class getMeasuredWidthAndState {
    private final CopyOnWriteArrayList<ViewCompat.Api20Impl> observers = new CopyOnWriteArrayList<>();

    public final CopyOnWriteArrayList<ViewCompat.Api20Impl> getObservers$bugsnag_android_core_release() {
        return this.observers;
    }

    public final void addObserver(ViewCompat.Api20Impl api20Impl) {
        runAnimators.valueOf(api20Impl, "observer");
        this.observers.addIfAbsent(api20Impl);
    }

    public final void removeObserver(ViewCompat.Api20Impl api20Impl) {
        runAnimators.valueOf(api20Impl, "observer");
        this.observers.remove(api20Impl);
    }

    public final void updateState$bugsnag_android_core_release(Styleable.ArcMotion<? extends ViewCompat.AccessibilityPaneVisibilityManager> arcMotion) {
        runAnimators.valueOf(arcMotion, "provider");
        if (getObservers$bugsnag_android_core_release().isEmpty()) {
            return;
        }
        ViewCompat.AccessibilityPaneVisibilityManager invoke = arcMotion.invoke();
        for (ViewCompat.Api20Impl api20Impl : getObservers$bugsnag_android_core_release()) {
            api20Impl.onStateChange(invoke);
        }
    }

    public final void updateState(ViewCompat.AccessibilityPaneVisibilityManager accessibilityPaneVisibilityManager) {
        runAnimators.valueOf(accessibilityPaneVisibilityManager, androidx.core.app.NotificationCompat.CATEGORY_EVENT);
        if (getObservers$bugsnag_android_core_release().isEmpty()) {
            return;
        }
        for (ViewCompat.Api20Impl api20Impl : getObservers$bugsnag_android_core_release()) {
            api20Impl.onStateChange(accessibilityPaneVisibilityManager);
        }
    }
}
