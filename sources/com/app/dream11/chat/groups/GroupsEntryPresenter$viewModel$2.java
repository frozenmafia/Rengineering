package com.app.dream11.chat.groups;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GroupsEntryPresenter$viewModel$2 extends Lambda implements Styleable.ArcMotion<GroupsEntryVM> {
    final /* synthetic */ GroupsEntryPresenter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupsEntryPresenter$viewModel$2(GroupsEntryPresenter groupsEntryPresenter) {
        super(0);
        this.this$0 = groupsEntryPresenter;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final GroupsEntryVM invoke() {
        return new GroupsEntryVM(this.this$0.getOnClick(), this.this$0.getOnChatThumbnailClicked(), this.this$0.getResourceProvider());
    }
}
