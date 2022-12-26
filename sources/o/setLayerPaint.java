package o;

import o.ViewCompat;
/* loaded from: classes3.dex */
public final class setLayerPaint extends getMeasuredWidthAndState {
    private boolean ah$a;
    private Integer valueOf;

    public final boolean ah$a() {
        return this.ah$a;
    }

    public final void values(boolean z) {
        this.ah$a = z;
    }

    public final String valueOf() {
        return valueOf(this.valueOf);
    }

    public final boolean ah$a(Integer num) {
        if (runAnimators.values(this.valueOf, num)) {
            return false;
        }
        this.valueOf = num;
        return true;
    }

    public final void values() {
        setLayerPaint setlayerpaint = this;
        if (setlayerpaint.getObservers$bugsnag_android_core_release().isEmpty()) {
            return;
        }
        ViewCompat.AccessibilityPaneVisibilityManager.isLogoutPending islogoutpending = new ViewCompat.AccessibilityPaneVisibilityManager.isLogoutPending(this.ah$a, this.valueOf, valueOf());
        for (ViewCompat.Api20Impl api20Impl : setlayerpaint.getObservers$bugsnag_android_core_release()) {
            api20Impl.onStateChange(islogoutpending);
        }
    }

    private final String valueOf(Integer num) {
        if (num == null) {
            return "None";
        }
        if (num.intValue() == 80) {
            return "Complete";
        }
        if (num.intValue() == 60) {
            return "Moderate";
        }
        if (num.intValue() == 40) {
            return "Background";
        }
        if (num.intValue() == 20) {
            return "UI hidden";
        }
        if (num.intValue() == 15) {
            return "Running critical";
        }
        if (num.intValue() == 10) {
            return "Running low";
        }
        if (num.intValue() == 5) {
            return "Running moderate";
        }
        return "Unknown (" + num + ')';
    }
}
