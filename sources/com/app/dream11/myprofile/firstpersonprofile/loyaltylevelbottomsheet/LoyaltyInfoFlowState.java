package com.app.dream11.myprofile.firstpersonprofile.loyaltylevelbottomsheet;

import com.app.dream11.model.FlowState;
import com.app.dream11.myprofile.firstpersonprofile.myprofiledatamapper.LoyaltyLevelData;
import com.app.dream11.utils.FlowStates;
import java.io.Serializable;
import java.util.Objects;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class LoyaltyInfoFlowState extends FlowState {
    public static final values Companion = new values(null);
    private static final String LOYALTY_LEVEL_DATA = "loyalty_level_data";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoyaltyInfoFlowState(LoyaltyLevelData loyaltyLevelData) {
        super(FlowStates.FIRST_PERSON_LOYALTY_LEVEL, null, 2, null);
        runAnimators.ag$a(loyaltyLevelData, "mLoyaltyLevelData");
        putExtra(LOYALTY_LEVEL_DATA, loyaltyLevelData);
    }

    public final LoyaltyLevelData getLoyaltyLevelData() {
        Serializable extra = getExtra(LOYALTY_LEVEL_DATA);
        Objects.requireNonNull(extra, "null cannot be cast to non-null type com.app.dream11.myprofile.firstpersonprofile.myprofiledatamapper.LoyaltyLevelData");
        return (LoyaltyLevelData) extra;
    }

    /* loaded from: classes3.dex */
    public static final class values {
        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }

        private values() {
        }
    }
}
