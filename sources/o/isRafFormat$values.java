package o;

import com.dreampay.vsc.api.ValidationCallback;
import o.SidecarCompat;
import o.SidecarWindowBackend;
/* loaded from: classes6.dex */
public final class isRafFormat$values implements SidecarCompat.FirstAttachAdapter<parseDateTime> {
    final /* synthetic */ ValidationCallback ag$a;

    public isRafFormat$values(ValidationCallback validationCallback) {
        this.ag$a = validationCallback;
    }

    @Override // o.SidecarCompat.FirstAttachAdapter
    public void ah$a(SidecarCompat$registerConfigurationChangeListener$configChangeObserver$1<parseDateTime> sidecarCompat$registerConfigurationChangeListener$configChangeObserver$1, Throwable th) {
        runAnimators.valueOf(sidecarCompat$registerConfigurationChangeListener$configChangeObserver$1, androidx.core.app.NotificationCompat.CATEGORY_CALL);
        runAnimators.valueOf(th, "throwable");
        this.ag$a.values(th);
    }

    @Override // o.SidecarCompat.FirstAttachAdapter
    public void ag$a(SidecarCompat$registerConfigurationChangeListener$configChangeObserver$1<parseDateTime> sidecarCompat$registerConfigurationChangeListener$configChangeObserver$1, SidecarWindowBackend.WindowLayoutChangeCallbackWrapper<parseDateTime> windowLayoutChangeCallbackWrapper) {
        runAnimators.valueOf(sidecarCompat$registerConfigurationChangeListener$configChangeObserver$1, androidx.core.app.NotificationCompat.CATEGORY_CALL);
        runAnimators.valueOf(windowLayoutChangeCallbackWrapper, "response");
        if (windowLayoutChangeCallbackWrapper.HaptikSDK$b()) {
            this.ag$a.ag$a();
        } else {
            this.ag$a.values(new IllegalStateException("Validation call was not successful"));
        }
    }
}
