package o;

import o.ViewCompat;
/* loaded from: classes3.dex */
public final class getWindowSystemUiVisibility extends getMeasuredWidthAndState {
    public static final getWindowSystemUiVisibility$ah$a values = new getWindowSystemUiVisibility$ah$a(null);
    private String ag$a;
    private String ah$a;

    public final void ah$a(String str) {
        this.ag$a = str;
        this.ah$a = "__BUGSNAG_MANUAL_CONTEXT__";
        valueOf();
    }

    public final void toString(String str) {
        if (this.ah$a != "__BUGSNAG_MANUAL_CONTEXT__") {
            this.ah$a = str;
            valueOf();
        }
    }

    public final String ag$a() {
        String str = this.ah$a;
        if (!(str != "__BUGSNAG_MANUAL_CONTEXT__")) {
            str = null;
        }
        return str != null ? str : this.ag$a;
    }

    public final void valueOf() {
        getWindowSystemUiVisibility getwindowsystemuivisibility = this;
        if (getwindowsystemuivisibility.getObservers$bugsnag_android_core_release().isEmpty()) {
            return;
        }
        ViewCompat.AccessibilityPaneVisibilityManager.HaptikWebView haptikWebView = new ViewCompat.AccessibilityPaneVisibilityManager.HaptikWebView(ag$a());
        for (ViewCompat.Api20Impl api20Impl : getwindowsystemuivisibility.getObservers$bugsnag_android_core_release()) {
            api20Impl.onStateChange(haptikWebView);
        }
    }
}
