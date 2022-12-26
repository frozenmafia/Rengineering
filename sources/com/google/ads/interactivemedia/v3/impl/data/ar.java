package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.avb;
import com.google.ads.interactivemedia.v3.internal.avf;
/* loaded from: classes7.dex */
final class ar extends TestingConfiguration {
    private final boolean disableExperiments;
    private final boolean disableOnScreenDetection;
    private final boolean disableSkipFadeTransition;
    private final boolean enableMonitorAppLifecycle;
    private final avf<String, Object> extraParams;
    private final avb<Integer> forceExperimentIds;
    private final boolean forceTvMode;
    private final boolean ignoreStrictModeFalsePositives;
    private final boolean useTestStreamManager;
    private final boolean useVideoElementMock;
    private final float videoElementMockDuration;

    private ar(boolean z, boolean z2, boolean z3, avb<Integer> avbVar, boolean z4, float f, boolean z5, boolean z6, boolean z7, boolean z8, avf<String, Object> avfVar) {
        this.disableExperiments = z;
        this.disableOnScreenDetection = z2;
        this.disableSkipFadeTransition = z3;
        this.forceExperimentIds = avbVar;
        this.useVideoElementMock = z4;
        this.videoElementMockDuration = f;
        this.useTestStreamManager = z5;
        this.enableMonitorAppLifecycle = z6;
        this.forceTvMode = z7;
        this.ignoreStrictModeFalsePositives = z8;
        this.extraParams = avfVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ar(boolean z, boolean z2, boolean z3, avb avbVar, boolean z4, float f, boolean z5, boolean z6, boolean z7, boolean z8, avf avfVar, aq aqVar) {
        this(z, z2, z3, avbVar, z4, f, z5, z6, z7, z8, avfVar);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean disableExperiments() {
        return this.disableExperiments;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean disableOnScreenDetection() {
        return this.disableOnScreenDetection;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean disableSkipFadeTransition() {
        return this.disableSkipFadeTransition;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean enableMonitorAppLifecycle() {
        return this.enableMonitorAppLifecycle;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TestingConfiguration) {
            TestingConfiguration testingConfiguration = (TestingConfiguration) obj;
            if (this.disableExperiments == testingConfiguration.disableExperiments() && this.disableOnScreenDetection == testingConfiguration.disableOnScreenDetection() && this.disableSkipFadeTransition == testingConfiguration.disableSkipFadeTransition()) {
                avb<Integer> avbVar = this.forceExperimentIds;
                if (avbVar == null) {
                    if (testingConfiguration.forceExperimentIds() != null) {
                        return false;
                    }
                } else if (!avbVar.equals(testingConfiguration.forceExperimentIds())) {
                    return false;
                }
                if (this.useVideoElementMock == testingConfiguration.useVideoElementMock() && Float.floatToIntBits(this.videoElementMockDuration) == Float.floatToIntBits(testingConfiguration.videoElementMockDuration()) && this.useTestStreamManager == testingConfiguration.useTestStreamManager() && this.enableMonitorAppLifecycle == testingConfiguration.enableMonitorAppLifecycle() && this.forceTvMode == testingConfiguration.forceTvMode() && this.ignoreStrictModeFalsePositives == testingConfiguration.ignoreStrictModeFalsePositives()) {
                    avf<String, Object> avfVar = this.extraParams;
                    if (avfVar == null) {
                        if (testingConfiguration.extraParams() != null) {
                            return false;
                        }
                    } else if (!avfVar.equals(testingConfiguration.extraParams())) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public avf<String, Object> extraParams() {
        return this.extraParams;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public avb<Integer> forceExperimentIds() {
        return this.forceExperimentIds;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean forceTvMode() {
        return this.forceTvMode;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean ignoreStrictModeFalsePositives() {
        return this.ignoreStrictModeFalsePositives;
    }

    public String toString() {
        boolean z = this.disableExperiments;
        boolean z2 = this.disableOnScreenDetection;
        boolean z3 = this.disableSkipFadeTransition;
        String valueOf = String.valueOf(this.forceExperimentIds);
        boolean z4 = this.useVideoElementMock;
        float f = this.videoElementMockDuration;
        boolean z5 = this.useTestStreamManager;
        boolean z6 = this.enableMonitorAppLifecycle;
        boolean z7 = this.forceTvMode;
        boolean z8 = this.ignoreStrictModeFalsePositives;
        String valueOf2 = String.valueOf(this.extraParams);
        return "TestingConfiguration{disableExperiments=" + z + ", disableOnScreenDetection=" + z2 + ", disableSkipFadeTransition=" + z3 + ", forceExperimentIds=" + valueOf + ", useVideoElementMock=" + z4 + ", videoElementMockDuration=" + f + ", useTestStreamManager=" + z5 + ", enableMonitorAppLifecycle=" + z6 + ", forceTvMode=" + z7 + ", ignoreStrictModeFalsePositives=" + z8 + ", extraParams=" + valueOf2 + "}";
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean useTestStreamManager() {
        return this.useTestStreamManager;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean useVideoElementMock() {
        return this.useVideoElementMock;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public float videoElementMockDuration() {
        return this.videoElementMockDuration;
    }

    public int hashCode() {
        int i = true != this.disableExperiments ? 1237 : 1231;
        int i2 = true != this.disableOnScreenDetection ? 1237 : 1231;
        int i3 = true != this.disableSkipFadeTransition ? 1237 : 1231;
        avb<Integer> avbVar = this.forceExperimentIds;
        int hashCode = avbVar == null ? 0 : avbVar.hashCode();
        int i4 = true != this.useVideoElementMock ? 1237 : 1231;
        int floatToIntBits = Float.floatToIntBits(this.videoElementMockDuration);
        int i5 = true != this.useTestStreamManager ? 1237 : 1231;
        int i6 = true != this.enableMonitorAppLifecycle ? 1237 : 1231;
        int i7 = true != this.forceTvMode ? 1237 : 1231;
        int i8 = true != this.ignoreStrictModeFalsePositives ? 1237 : 1231;
        avf<String, Object> avfVar = this.extraParams;
        return ((((((((((((((((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ hashCode) * 1000003) ^ i4) * 1000003) ^ floatToIntBits) * 1000003) ^ i5) * 1000003) ^ i6) * 1000003) ^ i7) * 1000003) ^ i8) * 1000003) ^ (avfVar != null ? avfVar.hashCode() : 0);
    }
}
