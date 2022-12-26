package com.app.dream11.model;

import java.io.Serializable;
/* loaded from: classes3.dex */
public class LeagueJoinError implements Serializable {
    private static final long serialVersionUID = 1;
    private String MsgActionTitle;
    private String MsgCode;
    private String MsgShowUp;
    private String MsgText;
    private String MsgTitle;
    private String MsgType;

    public String getMsgCode() {
        return this.MsgCode;
    }

    public void setMsgCode(String str) {
        this.MsgCode = str;
    }

    public String getMsgShowUp() {
        return this.MsgShowUp;
    }

    public void setMsgShowUp(String str) {
        this.MsgShowUp = str;
    }

    public String getMsgText() {
        return this.MsgText;
    }

    public void setMsgText(String str) {
        this.MsgText = str;
    }

    public String getMsgTitle() {
        return this.MsgTitle;
    }

    public void setMsgTitle(String str) {
        this.MsgTitle = str;
    }

    public String getMsgType() {
        return this.MsgType;
    }

    public void setMsgType(String str) {
        this.MsgType = str;
    }

    public String getMsgActionTitle() {
        return this.MsgActionTitle;
    }

    public void setMsgActionTitle(String str) {
        this.MsgActionTitle = str;
    }
}
