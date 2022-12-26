package o;

import o.ViewCompat;
/* loaded from: classes3.dex */
public final class getScaleY extends getMeasuredWidthAndState {
    public final void ag$a(String str) {
        getScaleY getscaley = this;
        if (getscaley.getObservers$bugsnag_android_core_release().isEmpty()) {
            return;
        }
        ViewCompat.AccessibilityPaneVisibilityManager.onXdkEvent onxdkevent = new ViewCompat.AccessibilityPaneVisibilityManager.onXdkEvent(str);
        for (ViewCompat.Api20Impl api20Impl : getscaley.getObservers$bugsnag_android_core_release()) {
            api20Impl.onStateChange(onxdkevent);
        }
    }

    public final void toString(setContentChangeTypes setcontentchangetypes, String str, int i) {
        runAnimators.valueOf(setcontentchangetypes, "conf");
        runAnimators.valueOf(str, "lastRunInfoPath");
        getScaleY getscaley = this;
        if (getscaley.getObservers$bugsnag_android_core_release().isEmpty()) {
            return;
        }
        ViewCompat$AccessibilityPaneVisibilityManager$HaptikSDK$a viewCompat$AccessibilityPaneVisibilityManager$HaptikSDK$a = new ViewCompat$AccessibilityPaneVisibilityManager$HaptikSDK$a(setcontentchangetypes.ag$a(), setcontentchangetypes.getInitSettings().ah$a(), setcontentchangetypes.values(), setcontentchangetypes.HaptikSDK$b(), setcontentchangetypes.onRelationshipValidationResult(), str, i, setcontentchangetypes.onMessageChannelReady());
        for (ViewCompat.Api20Impl api20Impl : getscaley.getObservers$bugsnag_android_core_release()) {
            api20Impl.onStateChange(viewCompat$AccessibilityPaneVisibilityManager$HaptikSDK$a);
        }
    }

    public final void valueOf() {
        getScaleY getscaley = this;
        if (getscaley.getObservers$bugsnag_android_core_release().isEmpty()) {
            return;
        }
        ViewCompat.AccessibilityPaneVisibilityManager.invoke invokeVar = ViewCompat.AccessibilityPaneVisibilityManager.invoke.values;
        for (ViewCompat.Api20Impl api20Impl : getscaley.getObservers$bugsnag_android_core_release()) {
            api20Impl.onStateChange(invokeVar);
        }
    }
}
