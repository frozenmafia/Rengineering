package com.app.dream11.myprofile.firstpersonprofile.myprofiledatamapper;

import java.io.Serializable;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class Rule implements Serializable {
    private final String description;
    private final boolean isCompleted;
    private final LevelRuleType levelRuleType;
    private final String miniArtwork;
    private final double remaining;
    private final String type;

    public Rule(String str, String str2, LevelRuleType levelRuleType, double d, boolean z, String str3) {
        runAnimators.ag$a(str2, "type");
        runAnimators.ag$a(levelRuleType, "levelRuleType");
        runAnimators.ag$a(str3, "miniArtwork");
        this.description = str;
        this.type = str2;
        this.levelRuleType = levelRuleType;
        this.remaining = d;
        this.isCompleted = z;
        this.miniArtwork = str3;
    }

    public final String getDescription() {
        return this.description;
    }

    public final LevelRuleType getLevelRuleType() {
        return this.levelRuleType;
    }

    public final String getMiniArtwork() {
        return this.miniArtwork;
    }

    public final double getRemaining() {
        return this.remaining;
    }

    public final String getType() {
        return this.type;
    }

    public final boolean isCompleted() {
        return this.isCompleted;
    }
}
