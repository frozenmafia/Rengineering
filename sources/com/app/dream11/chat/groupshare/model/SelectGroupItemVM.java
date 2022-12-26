package com.app.dream11.chat.groupshare.model;

import androidx.databinding.BaseObservable;
import com.app.dream11.chat.interfaces.IChatChannel;
import com.app.dream11.chat.interfaces.IOneToOneChatChannel;
import com.app.dream11Pro.R;
import o.enableHomeButtonByDefault;
import o.runAnimators;
/* loaded from: classes.dex */
public final class SelectGroupItemVM extends BaseObservable {
    private final IChatChannel chatChannel;
    private final OnItemSelectedListener listener;
    private final enableHomeButtonByDefault resourceProvider;

    /* loaded from: classes.dex */
    public interface OnItemSelectedListener {
        void onItemSelected(SelectGroupItemVM selectGroupItemVM);
    }

    public final IChatChannel getChatChannel() {
        return this.chatChannel;
    }

    public final OnItemSelectedListener getListener() {
        return this.listener;
    }

    public final enableHomeButtonByDefault getResourceProvider() {
        return this.resourceProvider;
    }

    public SelectGroupItemVM(IChatChannel iChatChannel, enableHomeButtonByDefault enablehomebuttonbydefault, OnItemSelectedListener onItemSelectedListener) {
        runAnimators.ag$a(iChatChannel, "chatChannel");
        runAnimators.ag$a(enablehomebuttonbydefault, "resourceProvider");
        runAnimators.ag$a(onItemSelectedListener, "listener");
        this.chatChannel = iChatChannel;
        this.resourceProvider = enablehomebuttonbydefault;
        this.listener = onItemSelectedListener;
    }

    public final String getTeamName() {
        return this.chatChannel.getChannelName();
    }

    public final boolean isEnable() {
        IChatChannel iChatChannel = this.chatChannel;
        if (iChatChannel instanceof IOneToOneChatChannel) {
            return isDmEnable((IOneToOneChatChannel) iChatChannel);
        }
        return isGroupEnable();
    }

    public final boolean isGroupEnable() {
        return this.chatChannel.hasUserJoinedThisGroup() && (!this.chatChannel.isGroupFrozen() || this.chatChannel.isUserOperator()) && !this.chatChannel.isUserMuted();
    }

    public final boolean isDmEnable(IOneToOneChatChannel iOneToOneChatChannel) {
        runAnimators.ag$a(iOneToOneChatChannel, "chatChannel");
        return iOneToOneChatChannel.isDM() && iOneToOneChatChannel.amInJoinedState() && iOneToOneChatChannel.isOpponentInJoinedState();
    }

    public final String getParticipantCount() {
        boolean z = !isEnable();
        if (z && this.chatChannel.isUserMuted()) {
            return this.resourceProvider.valueOf(R.string.res_0x7f1209f8, new Object[0]);
        }
        if (z && isOpponentNotFollowingYou()) {
            return this.resourceProvider.valueOf(R.string.res_0x7f1209fd, new Object[0]);
        }
        if (z && this.chatChannel.isGroupFrozen() && !this.chatChannel.isUserOperator()) {
            return this.resourceProvider.valueOf(R.string.res_0x7f1209f7, new Object[0]);
        }
        IChatChannel iChatChannel = this.chatChannel;
        if (iChatChannel instanceof IOneToOneChatChannel) {
            return null;
        }
        int participantCount = iChatChannel.getParticipantCount();
        return this.resourceProvider.ah$a(R.plurals.res_0x7f100021, participantCount, Integer.valueOf(participantCount));
    }

    public final boolean showParticipantCount() {
        return getParticipantCount() != null;
    }

    private final boolean isOpponentNotFollowingYou() {
        IChatChannel iChatChannel = this.chatChannel;
        return (iChatChannel instanceof IOneToOneChatChannel) && (((IOneToOneChatChannel) iChatChannel).isGhostChannel() || ((IOneToOneChatChannel) this.chatChannel).isDM()) && ((IOneToOneChatChannel) this.chatChannel).amInJoinedState() && ((IOneToOneChatChannel) this.chatChannel).isOpponentInInvitedState();
    }

    public final String getImageUrl() {
        return this.chatChannel.getChannelProfileUrl();
    }

    public final int getTextColor() {
        if (isEnable()) {
            return this.resourceProvider.ag$a(R.color.d11_color_text__neutralDarkest);
        }
        return this.resourceProvider.ag$a(R.color.d11_color_text__neutralMedium);
    }

    public final float getProfilePicAlpha() {
        return isEnable() ? 1.0f : 0.5f;
    }
}
