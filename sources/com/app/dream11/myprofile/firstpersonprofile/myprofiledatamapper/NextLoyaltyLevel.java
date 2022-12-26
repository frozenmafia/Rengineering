package com.app.dream11.myprofile.firstpersonprofile.myprofiledatamapper;

import java.io.Serializable;
import java.util.List;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class NextLoyaltyLevel implements Serializable {
    private final Double completedPercentage;
    private final int level;
    private final List<Rule> rules;
    private final RulesRelation rulesRelation;

    public NextLoyaltyLevel(int i, Double d, RulesRelation rulesRelation, List<Rule> list) {
        runAnimators.ag$a(rulesRelation, "rulesRelation");
        runAnimators.ag$a(list, "rules");
        this.level = i;
        this.completedPercentage = d;
        this.rulesRelation = rulesRelation;
        this.rules = list;
    }

    public final Double getCompletedPercentage() {
        return this.completedPercentage;
    }

    public final int getLevel() {
        return this.level;
    }

    public final List<Rule> getRules() {
        return this.rules;
    }

    public final RulesRelation getRulesRelation() {
        return this.rulesRelation;
    }
}
