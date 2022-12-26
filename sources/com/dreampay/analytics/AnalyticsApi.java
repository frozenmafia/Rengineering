package com.dreampay.analytics;

import o.AnimationHandler;
import o.SidecarCompat$registerConfigurationChangeListener$configChangeObserver$1;
import o.WindowInfoTrackerImpl;
import o.WindowMetricsCalculator;
/* loaded from: classes4.dex */
public interface AnalyticsApi {
    @WindowMetricsCalculator.Companion(valueOf = "/contentListener")
    SidecarCompat$registerConfigurationChangeListener$configChangeObserver$1<Void> trackEvent(@WindowInfoTrackerImpl AnimationHandler.AnimationCallbackDispatcher animationCallbackDispatcher);
}
