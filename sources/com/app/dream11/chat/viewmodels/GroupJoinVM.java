package com.app.dream11.chat.viewmodels;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import com.app.dream11.chat.interfaces.IChatChannel;
import com.app.dream11.chat.interfaces.IChatUser;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes.dex */
public final class GroupJoinVM extends BaseObservable {
    private IChatChannel chatChannel;
    private String errorMessage;
    private final GroupJoinHandler groupJoinHandler;
    private ObservableField<Boolean> isLoading;
    private final ObservableArrayList<IChatUser> memberList;

    /* loaded from: classes.dex */
    public interface GroupJoinHandler {
        void onJoinRequested();
    }

    public GroupJoinVM() {
        this(null, 1, null);
    }

    public GroupJoinVM(GroupJoinHandler groupJoinHandler) {
        this.groupJoinHandler = groupJoinHandler;
        this.memberList = new ObservableArrayList<>();
        this.errorMessage = "";
        this.isLoading = new ObservableField<>(false);
    }

    public /* synthetic */ GroupJoinVM(GroupJoinHandler groupJoinHandler, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? null : groupJoinHandler);
    }

    public final GroupJoinHandler getGroupJoinHandler() {
        return this.groupJoinHandler;
    }

    public final IChatChannel getChatChannel() {
        return this.chatChannel;
    }

    public final void setChatChannel(IChatChannel iChatChannel) {
        this.chatChannel = iChatChannel;
        notifyChange();
    }

    public final ObservableArrayList<IChatUser> getMemberList() {
        return this.memberList;
    }

    @Bindable
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final void setErrorMessage(String str) {
        runAnimators.ag$a(str, "value");
        this.errorMessage = str;
        notifyPropertyChanged(100);
    }

    @Bindable
    public final String getGroupName() {
        String channelName;
        IChatChannel iChatChannel = this.chatChannel;
        return (iChatChannel == null || (channelName = iChatChannel.getChannelName()) == null) ? "" : channelName;
    }

    @Bindable
    public final String getCoverImage() {
        String channelProfileUrl;
        IChatChannel iChatChannel = this.chatChannel;
        return (iChatChannel == null || (channelProfileUrl = iChatChannel.getChannelProfileUrl()) == null) ? "" : channelProfileUrl;
    }

    @Bindable
    public final int getGroupMemberCount() {
        IChatChannel iChatChannel = this.chatChannel;
        if (iChatChannel == null) {
            return 0;
        }
        return iChatChannel.getMemberCount();
    }

    public final ObservableField<Boolean> isLoading() {
        return this.isLoading;
    }

    public final void setLoading(ObservableField<Boolean> observableField) {
        runAnimators.ag$a(observableField, "<set-?>");
        this.isLoading = observableField;
    }
}
