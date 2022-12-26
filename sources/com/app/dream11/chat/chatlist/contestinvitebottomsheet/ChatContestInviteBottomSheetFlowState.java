package com.app.dream11.chat.chatlist.contestinvitebottomsheet;

import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ChatContestInviteBottomSheetFlowState extends FlowState {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatContestInviteBottomSheetFlowState(String str) {
        super(FlowStates.CHAT_CONTEST_INVITE_BOTTOM_SHEET, null, 2, null);
        runAnimators.ag$a(str, "channelUrl");
        putExtra("groupId", str);
    }

    public final String getChannelUrl() {
        return getString("groupId", "");
    }
}
