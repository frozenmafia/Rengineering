package com.app.dream11.model;
/* loaded from: classes6.dex */
public class ShareContestInviteUpdates {
    private String channelName;
    private UpdateState updateState;

    /* loaded from: classes6.dex */
    public enum UpdateState {
        Dialog_Launched,
        Dialog_Dismissed,
        Channel_Selected,
        LinkShare_Response
    }

    public ShareContestInviteUpdates(UpdateState updateState) {
        this.updateState = updateState;
    }

    public UpdateState getUpdateState() {
        return this.updateState;
    }

    public String getChannelName() {
        return this.channelName;
    }

    public void setChannelName(String str) {
        this.channelName = str;
    }
}
