package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum FeatureExperiment {
    TEXT_MESSAGE("TEXT_MESSAGE"),
    REMATCH("REMATCH"),
    CHALLENGE("CHALLENGE"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    FeatureExperiment(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        private Companion() {
        }

        public final FeatureExperiment safeValueOf(String str) {
            FeatureExperiment featureExperiment;
            runAnimators.ag$a(str, "rawValue");
            FeatureExperiment[] values = FeatureExperiment.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    featureExperiment = null;
                    break;
                }
                featureExperiment = values[i];
                if (runAnimators.values((Object) featureExperiment.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return featureExperiment == null ? FeatureExperiment.UNKNOWN__ : featureExperiment;
        }
    }
}
