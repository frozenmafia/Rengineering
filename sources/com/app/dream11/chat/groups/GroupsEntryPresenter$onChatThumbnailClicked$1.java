package com.app.dream11.chat.groups;

import com.app.dream11.chat.ui.ChatInfo;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.indexOfStateSet;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GroupsEntryPresenter$onChatThumbnailClicked$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ GroupsEntryPresenter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupsEntryPresenter$onChatThumbnailClicked$1(GroupsEntryPresenter groupsEntryPresenter) {
        super(0);
        this.this$0 = groupsEntryPresenter;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ChatInfo currentChatInfo = this.this$0.getCurrentChatInfo();
        if (currentChatInfo == null) {
            return;
        }
        GroupsEntryPresenter groupsEntryPresenter = this.this$0;
        groupsEntryPresenter.onEntryChatClicked(currentChatInfo);
        groupsEntryPresenter.resetThumbnailAnimation();
        groupsEntryPresenter.sendChatThumbnailClickedEvent(currentChatInfo);
        groupsEntryPresenter.postViewEvent(new indexOfStateSet(GroupsEntryPresenter.Companion.getMARK_DRAG_COMPLETE(), null));
    }
}
