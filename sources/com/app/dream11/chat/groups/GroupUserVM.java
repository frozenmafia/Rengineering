package com.app.dream11.chat.groups;

import androidx.databinding.BaseObservable;
import androidx.databinding.ObservableBoolean;
import com.app.dream11.chat.interfaces.IGroupUser;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes.dex */
public final class GroupUserVM extends BaseObservable {
    private final IGroupUser groupUser;
    private final GroupUserHandler handler;
    private final ObservableBoolean shouldShowAdminText;

    /* loaded from: classes.dex */
    public interface GroupUserHandler {
        void onGroupUserClicked(GroupUserVM groupUserVM);
    }

    public GroupUserVM(IGroupUser iGroupUser, GroupUserHandler groupUserHandler) {
        runAnimators.ag$a(iGroupUser, "groupUser");
        this.groupUser = iGroupUser;
        this.handler = groupUserHandler;
        this.shouldShowAdminText = new ObservableBoolean(iGroupUser.isAdmin());
    }

    public /* synthetic */ GroupUserVM(IGroupUser iGroupUser, GroupUserHandler groupUserHandler, int i, getTargetTypes gettargettypes) {
        this(iGroupUser, (i & 2) != 0 ? null : groupUserHandler);
    }

    public final IGroupUser getGroupUser() {
        return this.groupUser;
    }

    public final GroupUserHandler getHandler() {
        return this.handler;
    }

    public final ObservableBoolean getShouldShowAdminText() {
        return this.shouldShowAdminText;
    }
}
