package com.google.api;

import o.ViewInfoStore;
import o.ViewInfoStore$ag$a;
import o.ViewInfoStore$ah$a;
/* loaded from: classes7.dex */
public enum LaunchStage implements ViewInfoStore$ah$a {
    LAUNCH_STAGE_UNSPECIFIED(0),
    EARLY_ACCESS(1),
    ALPHA(2),
    BETA(3),
    GA(4),
    DEPRECATED(5),
    UNRECOGNIZED(-1);
    
    public static final int ALPHA_VALUE = 2;
    public static final int BETA_VALUE = 3;
    public static final int DEPRECATED_VALUE = 5;
    public static final int EARLY_ACCESS_VALUE = 1;
    public static final int GA_VALUE = 4;
    public static final int LAUNCH_STAGE_UNSPECIFIED_VALUE = 0;
    private static final ViewInfoStore.values<LaunchStage> internalValueMap = new ViewInfoStore.values<LaunchStage>() { // from class: com.google.api.LaunchStage.3
        @Override // o.ViewInfoStore.values
        /* renamed from: ah$a */
        public LaunchStage ag$a(int i) {
            return LaunchStage.forNumber(i);
        }
    };
    private final int value;

    @Override // o.ViewInfoStore$ah$a
    public final int getNumber() {
        if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.value;
    }

    @Deprecated
    public static LaunchStage valueOf(int i) {
        return forNumber(i);
    }

    public static LaunchStage forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return DEPRECATED;
                        }
                        return GA;
                    }
                    return BETA;
                }
                return ALPHA;
            }
            return EARLY_ACCESS;
        }
        return LAUNCH_STAGE_UNSPECIFIED;
    }

    public static ViewInfoStore.values<LaunchStage> internalGetValueMap() {
        return internalValueMap;
    }

    public static ViewInfoStore$ag$a internalGetVerifier() {
        return LaunchStage$ah$a.ah$a;
    }

    LaunchStage(int i) {
        this.value = i;
    }
}
