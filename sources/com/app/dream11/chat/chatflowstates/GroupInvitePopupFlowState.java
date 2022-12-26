package com.app.dream11.chat.chatflowstates;

import com.app.dream11.utils.FlowStates;
import o.runAnimators;
/* loaded from: classes.dex */
public final class GroupInvitePopupFlowState extends BaseChatFlowState {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupInvitePopupFlowState(String str) {
        super(str, FlowStates.GROUP_INVITE_POPUP, null, 4, null);
        runAnimators.ag$a(str, "groupId");
    }
}
