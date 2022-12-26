package com.app.dream11.chat.groups;

import com.app.dream11.chat.groups.GroupsBottomSheetVM;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes.dex */
public final class GroupsBottomSheetCreateGroupOrDMVm {
    private final Styleable.ArcMotion<setAnimationMatrix> createGroupClick;
    private final GroupsBottomSheetVM.Handler handler;
    private final Styleable.ArcMotion<setAnimationMatrix> startDirectChatClick;

    public GroupsBottomSheetCreateGroupOrDMVm(GroupsBottomSheetVM.Handler handler) {
        runAnimators.ag$a(handler, "handler");
        this.handler = handler;
        this.createGroupClick = new GroupsBottomSheetCreateGroupOrDMVm$createGroupClick$1(this);
        this.startDirectChatClick = new GroupsBottomSheetCreateGroupOrDMVm$startDirectChatClick$1(this);
    }

    public final GroupsBottomSheetVM.Handler getHandler() {
        return this.handler;
    }

    public final Styleable.ArcMotion<setAnimationMatrix> getCreateGroupClick() {
        return this.createGroupClick;
    }

    public final Styleable.ArcMotion<setAnimationMatrix> getStartDirectChatClick() {
        return this.startDirectChatClick;
    }
}
