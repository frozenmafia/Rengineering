package com.app.dream11.myprofile.firstpersonprofile.myprofiledatamapper;

import java.io.Serializable;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class LoyaltyLevelData implements Serializable {
    private final AvailableRewards availableRewards;
    private final int currentLevel;
    private final NextLoyaltyLevel nextLoyaltyLevel;
    private final NextRewards nextRewards;

    public LoyaltyLevelData(int i, NextLoyaltyLevel nextLoyaltyLevel, NextRewards nextRewards, AvailableRewards availableRewards) {
        runAnimators.ag$a(nextLoyaltyLevel, "nextLoyaltyLevel");
        runAnimators.ag$a(nextRewards, "nextRewards");
        runAnimators.ag$a(availableRewards, "availableRewards");
        this.currentLevel = i;
        this.nextLoyaltyLevel = nextLoyaltyLevel;
        this.nextRewards = nextRewards;
        this.availableRewards = availableRewards;
    }

    public final int getCurrentLevel() {
        return this.currentLevel;
    }

    public final NextLoyaltyLevel getNextLoyaltyLevel() {
        return this.nextLoyaltyLevel;
    }

    public final NextRewards getNextRewards() {
        return this.nextRewards;
    }

    public final AvailableRewards getAvailableRewards() {
        return this.availableRewards;
    }
}
