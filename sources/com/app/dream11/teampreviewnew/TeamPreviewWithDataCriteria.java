package com.app.dream11.teampreviewnew;

import java.io.Serializable;
import o.getTargetTypes;
/* loaded from: classes3.dex */
public final class TeamPreviewWithDataCriteria implements Serializable {
    private final int maxCredits;
    private final int maxPlayerPerSquad;
    private final int maxPlayers;

    public TeamPreviewWithDataCriteria() {
        this(0, 0, 0, 7, null);
    }

    public static /* synthetic */ TeamPreviewWithDataCriteria copy$default(TeamPreviewWithDataCriteria teamPreviewWithDataCriteria, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = teamPreviewWithDataCriteria.maxCredits;
        }
        if ((i4 & 2) != 0) {
            i2 = teamPreviewWithDataCriteria.maxPlayers;
        }
        if ((i4 & 4) != 0) {
            i3 = teamPreviewWithDataCriteria.maxPlayerPerSquad;
        }
        return teamPreviewWithDataCriteria.copy(i, i2, i3);
    }

    public final int component1() {
        return this.maxCredits;
    }

    public final int component2() {
        return this.maxPlayers;
    }

    public final int component3() {
        return this.maxPlayerPerSquad;
    }

    public final TeamPreviewWithDataCriteria copy(int i, int i2, int i3) {
        return new TeamPreviewWithDataCriteria(i, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TeamPreviewWithDataCriteria) {
            TeamPreviewWithDataCriteria teamPreviewWithDataCriteria = (TeamPreviewWithDataCriteria) obj;
            return this.maxCredits == teamPreviewWithDataCriteria.maxCredits && this.maxPlayers == teamPreviewWithDataCriteria.maxPlayers && this.maxPlayerPerSquad == teamPreviewWithDataCriteria.maxPlayerPerSquad;
        }
        return false;
    }

    public int hashCode() {
        return (((this.maxCredits * 31) + this.maxPlayers) * 31) + this.maxPlayerPerSquad;
    }

    public String toString() {
        int i = this.maxCredits;
        int i2 = this.maxPlayers;
        int i3 = this.maxPlayerPerSquad;
        return "TeamPreviewWithDataCriteria(maxCredits=" + i + ", maxPlayers=" + i2 + ", maxPlayerPerSquad=" + i3 + ")";
    }

    public TeamPreviewWithDataCriteria(int i, int i2, int i3) {
        this.maxCredits = i;
        this.maxPlayers = i2;
        this.maxPlayerPerSquad = i3;
    }

    public /* synthetic */ TeamPreviewWithDataCriteria(int i, int i2, int i3, int i4, getTargetTypes gettargettypes) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }

    public final int getMaxCredits() {
        return this.maxCredits;
    }

    public final int getMaxPlayers() {
        return this.maxPlayers;
    }

    public final int getMaxPlayerPerSquad() {
        return this.maxPlayerPerSquad;
    }
}
