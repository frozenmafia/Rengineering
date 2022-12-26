package com.app.dream11.model;

import android.util.Log;
import java.io.Serializable;
/* loaded from: classes3.dex */
public class SportPlayerType implements Serializable {
    private String displayName;
    private String gamePlayerPosition;
    private String gamePlayerType;
    private String gamePlayerTypeFull;
    private String gamePlayerTypeId;
    private int maxPlayerPerTeam;
    private int maxPlayers;
    private int minPlayers;

    public String getGamePlayerTypeId() {
        return this.gamePlayerTypeId;
    }

    public void setGamePlayerTypeId(String str) {
        this.gamePlayerTypeId = str;
    }

    public String getGamePlayerType() {
        return this.gamePlayerType;
    }

    public void setGamePlayerType(String str) {
        this.gamePlayerType = str;
    }

    public int getMinPlayers() {
        return this.minPlayers;
    }

    public void setMinPlayers(int i) {
        this.minPlayers = i;
    }

    public int getMaxPlayers() {
        return this.maxPlayers;
    }

    public void setMaxPlayers(int i) {
        this.maxPlayers = i;
    }

    public int getMaxPlayerPerTeam() {
        return this.maxPlayerPerTeam;
    }

    public void setMaxPlayerPerTeam(int i) {
        this.maxPlayerPerTeam = i;
    }

    public String getGamePlayerFullType() {
        return this.gamePlayerTypeFull;
    }

    public void setGamePlayerFullType(String str) {
        this.gamePlayerTypeFull = str;
    }

    public String getGamePlayerPosition() {
        return this.gamePlayerPosition;
    }

    public void setGamePlayerPosition(String str) {
        this.gamePlayerPosition = str;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void dump() {
        Log.d("dream11/app", "Player type ID: " + this.gamePlayerTypeId + ", Player type name: " + this.gamePlayerType + ", Minimum per team: " + this.minPlayers + ", maximum per team: " + this.maxPlayers + ", maximum from a source team: " + this.maxPlayerPerTeam);
    }
}
