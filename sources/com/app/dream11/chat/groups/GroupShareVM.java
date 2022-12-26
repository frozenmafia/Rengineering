package com.app.dream11.chat.groups;

import androidx.databinding.BaseObservable;
import com.app.dream11.chat.interfaces.IChatChannel;
import com.app.dream11.ui.databinding.RxObservableField;
import com.app.dream11Pro.R;
import o.loadFont;
import o.setAutoCancel;
/* loaded from: classes.dex */
public final class GroupShareVM extends BaseObservable {
    private IChatChannel group;
    private final GroupShareHandler groupShareHandler;
    private final RxObservableField<Boolean> isWhatsAppInstalled = new RxObservableField<>(false);
    private final setAutoCancel buttonMoreOptions = new setAutoCancel(R.drawable.ic_vector_share, "More Options", new GroupShareVM$buttonMoreOptions$1(this));

    /* loaded from: classes.dex */
    public interface GroupShareHandler {
        void onCopyLinkClicked();

        void onMoreClicked();

        void onWhatsAppClicked();
    }

    public GroupShareVM(GroupShareHandler groupShareHandler) {
        this.groupShareHandler = groupShareHandler;
    }

    public final GroupShareHandler getGroupShareHandler() {
        return this.groupShareHandler;
    }

    public final String getGroupProfilePic() {
        String channelProfileUrl;
        IChatChannel iChatChannel = this.group;
        return (iChatChannel == null || (channelProfileUrl = iChatChannel.getChannelProfileUrl()) == null) ? "" : channelProfileUrl;
    }

    public final String getGroupName() {
        String channelName;
        IChatChannel iChatChannel = this.group;
        return (iChatChannel == null || (channelName = iChatChannel.getChannelName()) == null) ? "" : channelName;
    }

    public final String getGroupDescription() {
        String channelDescription;
        IChatChannel iChatChannel = this.group;
        return (iChatChannel == null || (channelDescription = iChatChannel.getChannelDescription()) == null) ? "" : channelDescription;
    }

    public final String getGroupUrl() {
        String invitationUrl;
        IChatChannel iChatChannel = this.group;
        return (iChatChannel == null || (invitationUrl = iChatChannel.getInvitationUrl()) == null) ? "" : invitationUrl;
    }

    public final boolean shouldShowDescription() {
        IChatChannel iChatChannel = this.group;
        return !loadFont.ah$a((CharSequence) (iChatChannel == null ? null : iChatChannel.getChannelDescription()));
    }

    public final IChatChannel getGroup() {
        return this.group;
    }

    public final void setGroup(IChatChannel iChatChannel) {
        this.group = iChatChannel;
        notifyChange();
    }

    public final RxObservableField<Boolean> isWhatsAppInstalled() {
        return this.isWhatsAppInstalled;
    }

    public final setAutoCancel getButtonMoreOptions() {
        return this.buttonMoreOptions;
    }
}
