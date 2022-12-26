package com.app.dream11.myprofile.firstpersonprofile.myprofiledatamapper;

import java.io.Serializable;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class NextRewardsEdge implements Serializable {
    private final double amount;
    private final String artwork;
    private final String description;
    private final int level;
    private final String miniArtwork;
    private final Preview preview;
    private final String summary;
    private final String type;

    public NextRewardsEdge(String str, int i, String str2, String str3, String str4, String str5, Preview preview, double d) {
        runAnimators.ag$a(str, "type");
        runAnimators.ag$a(str2, "description");
        runAnimators.ag$a(str3, "summary");
        runAnimators.ag$a(str4, "artwork");
        runAnimators.ag$a(str5, "miniArtwork");
        this.type = str;
        this.level = i;
        this.description = str2;
        this.summary = str3;
        this.artwork = str4;
        this.miniArtwork = str5;
        this.preview = preview;
        this.amount = d;
    }

    public final String getType() {
        return this.type;
    }

    public final int getLevel() {
        return this.level;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getArtwork() {
        return this.artwork;
    }

    public final String getMiniArtwork() {
        return this.miniArtwork;
    }

    public final Preview getPreview() {
        return this.preview;
    }

    public final double getAmount() {
        return this.amount;
    }
}
