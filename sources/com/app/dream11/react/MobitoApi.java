package com.app.dream11.react;

import o.SidecarCompat$registerConfigurationChangeListener$configChangeObserver$1;
import o.WindowCallbackWrapper;
import o.WindowInfoTrackerImpl;
import o.WindowInfoTrackerImpl$windowLayoutInfo$1$$ExternalSyntheticLambda0;
import o.getDisplayFeatures;
import o.prepareLayoutStateForDelta;
/* loaded from: classes3.dex */
public interface MobitoApi {
    @WindowInfoTrackerImpl.Companion(ag$a = "mock/getDRSExperimentMocks")
    SidecarCompat$registerConfigurationChangeListener$configChangeObserver$1<WindowCallbackWrapper> getDRSExperimentMocks(@getDisplayFeatures(ah$a = "deviceId") String str);

    @WindowInfoTrackerImpl$windowLayoutInfo$1$$ExternalSyntheticLambda0(ah$a = {"OSName:Android"})
    @WindowInfoTrackerImpl.Companion(ag$a = "mock/getFeatureFlagMocks")
    SidecarCompat$registerConfigurationChangeListener$configChangeObserver$1<prepareLayoutStateForDelta> getMobitoFeatureFlag(@getDisplayFeatures(ah$a = "deviceId") String str);
}
