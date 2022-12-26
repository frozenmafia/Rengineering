package com.dreampay.vsc.core;

import o.SidecarCompat$registerConfigurationChangeListener$configChangeObserver$1;
import o.WindowInfoTrackerImpl;
import o.WindowMetricsCalculator;
import o.WindowMetricsCalculatorCompat;
import o.getDisplayFeatures;
import o.isRw2Format;
import o.isThumbnail;
import o.parseDateTime;
import o.readImageFileDirectory;
/* loaded from: classes6.dex */
public interface VisaService {
    @WindowMetricsCalculator.Companion(valueOf = "vcolite/v1/authcode")
    SidecarCompat$registerConfigurationChangeListener$configChangeObserver$1<isThumbnail> initEnrollment(@WindowInfoTrackerImpl isRw2Format isrw2format);

    @WindowMetricsCalculator.CC(ag$a = "vcolite/v1/devices/{deviceId}")
    SidecarCompat$registerConfigurationChangeListener$configChangeObserver$1<parseDateTime> validate(@getDisplayFeatures(ah$a = "X-CORRELATION-ID") String str, @WindowMetricsCalculatorCompat(valueOf = "deviceId") String str2, @WindowInfoTrackerImpl readImageFileDirectory readimagefiledirectory);
}
