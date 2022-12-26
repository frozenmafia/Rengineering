package com.app.dream11.model;

import java.io.Serializable;
import o.isFullSpan;
/* loaded from: classes3.dex */
public class WLSConfig implements Serializable {
    private static final long serialVersionUID = 1;
    @isFullSpan(valueOf = "showDreamTeam")
    private boolean isDreamTeamEnabled = true;
    private String newTeamCardBackground;
    private String newTeamPreviewBackground;
    private String teamPreviewBackground;
    private String teamPreviewOutline;

    public boolean isDreamTeamEnabled() {
        return this.isDreamTeamEnabled;
    }

    public String getTeamPreviewBackground() {
        return this.teamPreviewBackground;
    }

    public String getNewTeamPreviewBackground() {
        return this.newTeamPreviewBackground;
    }

    public String getOutlineTeamPreview() {
        return this.teamPreviewOutline;
    }

    public String getNewTeamCardBackground() {
        return this.newTeamCardBackground;
    }
}
