package com.app.dream11.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import o.isFullSpan;
/* loaded from: classes.dex */
public class GameConfig implements Serializable {
    private static final long serialVersionUID = 1;
    private WLSConfig WLSConfig;
    private String WLSSlug;
    private String WLSUrl;
    private String displayName;
    private SportConfig gameConfig;
    private String gameId;
    private String gameName;
    private String iconImage;
    private String id;
    private int maxTeamsAllowed;
    private String status;
    private String wlsId;
    private boolean isLiveScoreCardEnabled = true;
    @isFullSpan(valueOf = "pcCache")
    private boolean isEventIdBasedLeaderboardEnabled = false;

    public String getIconImage() {
        return this.iconImage;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String str) {
        this.id = str;
    }

    public boolean isLiveScoreCardEnabled() {
        return this.isLiveScoreCardEnabled;
    }

    public String getGameName() {
        return this.gameName;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public String getWlsId() {
        return this.wlsId;
    }

    public String getGameId() {
        return this.gameId;
    }

    public void setGameId(String str) {
        this.gameId = str;
    }

    public SportConfig getGameConfig() {
        return this.gameConfig;
    }

    public void setGameConfig(SportConfig sportConfig) {
        this.gameConfig = sportConfig;
    }

    public SportPlayerType getPlayerTypeById(String str) {
        return this.gameConfig.getConfigJson().getPlayerTypeById(str);
    }

    public SportPlayerType getPlayerTypeByName(String str) {
        return this.gameConfig.getConfigJson().getPlayerTypeByType(str);
    }

    public List<SportPlayerType> getPlayerTypesInOrder() {
        return Arrays.asList(this.gameConfig.getConfigJson().getPlayerTypesInOrder());
    }

    @Deprecated
    public int getMaxTeamsAllowed() {
        return this.maxTeamsAllowed;
    }

    public boolean isMaxTeamLimitExceed(int i) {
        return i >= getMaxTeamsAllowed();
    }

    public boolean isEventIdBasedLeaderboardEnabled() {
        return this.isEventIdBasedLeaderboardEnabled;
    }

    public String getWLSSlug() {
        return this.WLSSlug;
    }

    public String getWLSUrl() {
        return this.WLSUrl;
    }

    public WLSConfig getWlsConfig() {
        return this.WLSConfig;
    }

    public boolean isDreamTeamEnabled() {
        if (getWlsConfig() != null) {
            return getWlsConfig().isDreamTeamEnabled();
        }
        return false;
    }

    public String toString() {
        return "GameConfig{id='" + this.id + "', gameName='" + this.gameName + "', displayName='" + this.displayName + "', status='" + this.status + "', wlsId='" + this.wlsId + "', gameId='" + this.gameId + "', maxTeamsAllowed=" + this.maxTeamsAllowed + ", WLSSlug='" + this.WLSSlug + "', WLSUrl='" + this.WLSUrl + "', isLiveScoreCardEnabled=" + this.isLiveScoreCardEnabled + ", isEventIdBasedLeaderboardEnabled=" + this.isEventIdBasedLeaderboardEnabled + '}';
    }
}
