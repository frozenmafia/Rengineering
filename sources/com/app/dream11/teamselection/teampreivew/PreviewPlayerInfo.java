package com.app.dream11.teamselection.teampreivew;

import com.app.dream11.model.LineupStatus;
import com.app.dream11.model.PlayerRole;
import com.app.dream11Pro.R;
import java.io.Serializable;
import o.loadFont;
/* loaded from: classes3.dex */
public class PreviewPlayerInfo implements Serializable {
    private static final long serialVersionUID = 121;
    private String SquadPlayerImage;
    private double fantasyPoints;
    private boolean gettyImageAvailable;
    private PlayerRole highlight;
    private boolean isDreamTeamPlayer;
    private boolean isHomeTeam;
    private LineupStatus lineupStatus;
    private double playerCredits;
    private int playerId;
    private boolean shouldShowSubtitle = true;
    private String subTitle;
    private String title;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getSubTitle() {
        return this.subTitle;
    }

    public void setSubTitle(String str) {
        this.subTitle = str;
    }

    public PlayerRole getHighlight() {
        return this.highlight;
    }

    public void setHighlight(PlayerRole playerRole) {
        this.highlight = playerRole;
    }

    public boolean isDreamTeamPlayer() {
        return this.isDreamTeamPlayer;
    }

    public void setDreamTeamPlayer(boolean z) {
        this.isDreamTeamPlayer = z;
    }

    public boolean isHomeTeam() {
        return this.isHomeTeam;
    }

    public void setHomeTeam(boolean z) {
        this.isHomeTeam = z;
    }

    public void setSquadPlayerImage(String str) {
        this.SquadPlayerImage = str;
    }

    public String getSquadPlayerImage() {
        return this.SquadPlayerImage;
    }

    public boolean isGettyImageAvailable() {
        return this.gettyImageAvailable;
    }

    public void setGettyImageAvailable(boolean z) {
        this.gettyImageAvailable = z;
    }

    public void setPlayerId(int i) {
        this.playerId = i;
    }

    public int getPlayerId() {
        return this.playerId;
    }

    public double getFantasyPoints() {
        return this.fantasyPoints;
    }

    public void setFantasyPoints(double d) {
        this.fantasyPoints = d;
    }

    public void setShouldShowSubtitle(boolean z) {
        this.shouldShowSubtitle = z;
    }

    public boolean isShouldShowSubtitle() {
        return this.shouldShowSubtitle;
    }

    public double getPlayerCredits() {
        return this.playerCredits;
    }

    public void setPlayerCredits(double d) {
        this.playerCredits = d;
    }

    public boolean shouldShowLineupStatus() {
        return loadFont.ag$a(this.lineupStatus) || loadFont.valueOf(this.lineupStatus);
    }

    public int getLineupStatusDrawable() {
        LineupStatus lineupStatus = this.lineupStatus;
        return (lineupStatus == null || lineupStatus.getStatus() == null) ? R.drawable.preview_lineup_playing : LineupStatus.Status.NOT_PLAYING.equals(this.lineupStatus.getStatus()) ? R.drawable.preview_lineup_not_playing : LineupStatus.Status.X_FACTOR_SUBSTITUTE.equals(this.lineupStatus.getStatus()) ? R.drawable.preview_substitute_playing : R.drawable.preview_lineup_playing;
    }

    public LineupStatus getLineupStatus() {
        return this.lineupStatus;
    }

    public void setLineupStatus(LineupStatus lineupStatus) {
        this.lineupStatus = lineupStatus;
    }
}
