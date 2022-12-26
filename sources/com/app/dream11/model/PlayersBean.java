package com.app.dream11.model;

import java.io.Serializable;
import o.createFilesDir;
import o.loadFont;
/* loaded from: classes3.dex */
public class PlayersBean implements Serializable {
    private static final long serialVersionUID = 121;
    private float FantasyPoints;
    private int PlayerId;
    private float PlayerPrice;
    private String SquadFlagName;
    private int SquadId;
    private String SquadName;
    private String SquadPlayerImage;
    private String SquadPlayerName;
    private String SquadPlayerType;
    private int SquadPlayerTypeId;
    private String SquadPlayerTypeName;
    private String SquadShortName;
    private float TotalPoints;
    private double UserPlayerPoints;
    private LineupStatus lineupStatus;
    private int pos;
    private String squadPlayerNameInitial;
    private boolean showStar = false;
    private boolean isChecked = false;
    private int IsCaptain = 0;
    private int IsViceCaptain = 0;

    public PlayersBean() {
    }

    public PlayersBean(createFilesDir createfilesdir) {
        int i = 0;
        setSquadPlayerName(createfilesdir.isLogoutPending());
        setSquadPlayerNameInitial(createfilesdir.onXdkEvent());
        setSquadPlayerTypeName(createfilesdir.ICustomTabsCallback());
        setPlayerId(createfilesdir.getInitSettings());
        setSquadPlayerTypeId(createfilesdir.extraCallbackWithResult());
        setSquadPlayerImage(createfilesdir.getSignupData());
        setPlayerPrice((float) createfilesdir.aj$a());
        setTotalPoints((float) createfilesdir.onNavigationEvent());
        setSquadShortName(createfilesdir.receiveFile());
        setCaptain((createfilesdir.getInterfaceDescriptor() == null || createfilesdir.getInterfaceDescriptor().valueOf() != 2.0d) ? 0 : 1);
        if (createfilesdir.getInterfaceDescriptor() != null && createfilesdir.getInterfaceDescriptor().valueOf() == 1.5d) {
            i = 1;
        }
        setIsviceCaptain(i);
        if (createfilesdir.invoke() != null) {
            setLineupStatus(loadFont.valueOf(createfilesdir.invoke()));
        }
    }

    public String getSquadShortName() {
        return this.SquadShortName;
    }

    public void setSquadShortName(String str) {
        this.SquadShortName = str;
    }

    public Integer getSquadPlayerTypeId() {
        return Integer.valueOf(this.SquadPlayerTypeId);
    }

    public void setSquadPlayerTypeId(int i) {
        this.SquadPlayerTypeId = i;
    }

    public String getSquadPlayerImage() {
        return this.SquadPlayerImage;
    }

    public void setSquadPlayerImage(String str) {
        this.SquadPlayerImage = str;
    }

    public Integer getSquadId() {
        return Integer.valueOf(this.SquadId);
    }

    public void setSquadId(int i) {
        this.SquadId = i;
    }

    public float getTotalPoints() {
        return this.TotalPoints;
    }

    public void setTotalPoints(float f) {
        this.TotalPoints = f;
    }

    public float getPlayerPrice() {
        return this.PlayerPrice;
    }

    public void setPlayerPrice(float f) {
        this.PlayerPrice = f;
    }

    public String getSquadName() {
        return this.SquadName;
    }

    public void setSquadName(String str) {
        this.SquadName = str;
    }

    public String getSquadFlagName() {
        return this.SquadFlagName;
    }

    public void setSquadFlagName(String str) {
        this.SquadFlagName = str;
    }

    public String getSquadPlayerTypeName() {
        return this.SquadPlayerTypeName;
    }

    public void setSquadPlayerTypeName(String str) {
        this.SquadPlayerTypeName = str;
    }

    public int getPlayerId() {
        return this.PlayerId;
    }

    public void setPlayerId(int i) {
        this.PlayerId = i;
    }

    public String getSquadPlayerName() {
        return this.SquadPlayerName;
    }

    public String getSquadPlayerNameInitial() {
        return this.squadPlayerNameInitial;
    }

    public void setSquadPlayerName(String str) {
        this.SquadPlayerName = str;
    }

    public void setSquadPlayerNameInitial(String str) {
        this.squadPlayerNameInitial = str;
    }

    public boolean isChecked() {
        return this.isChecked;
    }

    public void setChecked(boolean z) {
        this.isChecked = z;
    }

    public double getUserPlayerPoints() {
        return this.UserPlayerPoints;
    }

    public float getFantasyPoints() {
        return this.FantasyPoints;
    }

    public void setFantasyPoints(float f) {
        this.FantasyPoints = f;
    }

    public void setUserPlayerPoints(double d) {
        this.UserPlayerPoints = d;
    }

    public int getPos() {
        return this.pos;
    }

    public void setPos(int i) {
        this.pos = i;
    }

    public int isCaptain() {
        return this.IsCaptain;
    }

    public void setCaptain(int i) {
        this.IsCaptain = i;
    }

    public int isviceCaptain() {
        return this.IsViceCaptain;
    }

    public void setIsviceCaptain(int i) {
        this.IsViceCaptain = i;
    }

    public String getSquadPlayerType() {
        return this.SquadPlayerType;
    }

    public void setSquadPlayerType(String str) {
        this.SquadPlayerType = str;
    }

    public boolean isShowStar() {
        return this.showStar;
    }

    public void setShowStar(boolean z) {
        this.showStar = z;
    }

    public LineupStatus getLineupStatus() {
        return this.lineupStatus;
    }

    public void setLineupStatus(LineupStatus lineupStatus) {
        this.lineupStatus = lineupStatus;
    }
}
