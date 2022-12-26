package com.facebook.internal;

import com.facebook.internal.FeatureManager;
import o.getTargetTypes;
/* loaded from: classes4.dex */
public final class FeatureManager$Feature$ag$a {
    public /* synthetic */ FeatureManager$Feature$ag$a(getTargetTypes gettargettypes) {
        this();
    }

    private FeatureManager$Feature$ag$a() {
    }

    public final FeatureManager.Feature toString(int i) {
        int i2;
        FeatureManager.Feature[] valuesCustom = FeatureManager.Feature.valuesCustom();
        int length = valuesCustom.length;
        int i3 = 0;
        while (i3 < length) {
            FeatureManager.Feature feature = valuesCustom[i3];
            i3++;
            i2 = feature.code;
            if (i2 == i) {
                return feature;
            }
        }
        return FeatureManager.Feature.Unknown;
    }
}
