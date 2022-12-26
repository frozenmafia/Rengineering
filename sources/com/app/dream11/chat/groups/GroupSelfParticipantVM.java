package com.app.dream11.chat.groups;

import androidx.databinding.BaseObservable;
import androidx.databinding.ObservableBoolean;
import com.app.dream11.chat.interfaces.IChatUser;
import o.getTargetTypes;
/* loaded from: classes6.dex */
public final class GroupSelfParticipantVM extends BaseObservable {
    private IChatUser chatUser;
    private final GroupSelfParticipantHandler handler;
    private final ObservableBoolean isUserAdmin;

    /* loaded from: classes6.dex */
    public interface GroupSelfParticipantHandler {
        void onSelfParticipantClicked(GroupSelfParticipantVM groupSelfParticipantVM);
    }

    public GroupSelfParticipantVM() {
        this(null, 1, null);
    }

    public GroupSelfParticipantVM(GroupSelfParticipantHandler groupSelfParticipantHandler) {
        this.handler = groupSelfParticipantHandler;
        this.isUserAdmin = new ObservableBoolean(false);
    }

    public /* synthetic */ GroupSelfParticipantVM(GroupSelfParticipantHandler groupSelfParticipantHandler, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? null : groupSelfParticipantHandler);
    }

    public final GroupSelfParticipantHandler getHandler() {
        return this.handler;
    }

    public final IChatUser getChatUser() {
        return this.chatUser;
    }

    public final void setChatUser(IChatUser iChatUser) {
        this.chatUser = iChatUser;
        notifyChange();
    }

    public final ObservableBoolean isUserAdmin() {
        return this.isUserAdmin;
    }
}
