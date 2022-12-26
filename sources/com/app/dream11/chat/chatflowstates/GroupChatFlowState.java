package com.app.dream11.chat.chatflowstates;

import com.app.dream11.utils.FlowStates;
import java.io.Serializable;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes.dex */
public final class GroupChatFlowState extends BaseChatFlowState {
    private final String argShouldShowMenubar;
    private final String argShowGroupLeaderboardEntry;
    private final String contestchatType;
    private final String contestid;
    private final String entryPointKey;
    private final String isMinimizeButton;
    private final String isOpenGroupLeaderBoard;

    public GroupChatFlowState() {
        super("", FlowStates.GROUP_CHAT_FLOW_STATE, "");
        this.isOpenGroupLeaderBoard = "is_group_leaderboard";
        this.isMinimizeButton = "is_minimize_button_visible";
        this.contestid = "contest_id";
        this.contestchatType = "contest_chat_type";
        this.argShouldShowMenubar = "show_menu_bar";
        this.argShowGroupLeaderboardEntry = "show_group_leaderboard";
        this.entryPointKey = "entryPoint";
    }

    public /* synthetic */ GroupChatFlowState(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, String str4, String str5, int i, getTargetTypes gettargettypes) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? false : z, (i & 16) == 0 ? z2 : false, (i & 32) != 0 ? true : z3, (i & 64) == 0 ? z4 : true, (i & 128) != 0 ? "none" : str4, (i & 256) == 0 ? str5 : "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupChatFlowState(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, String str4, String str5) {
        super(str, FlowStates.GROUP_CHAT_FLOW_STATE, str2);
        runAnimators.ag$a(str, "channelUrl");
        runAnimators.ag$a(str2, "screenOpenedFrom");
        runAnimators.ag$a(str4, "contestChatType");
        runAnimators.ag$a(str5, "entryPoint");
        this.isOpenGroupLeaderBoard = "is_group_leaderboard";
        this.isMinimizeButton = "is_minimize_button_visible";
        this.contestid = "contest_id";
        this.contestchatType = "contest_chat_type";
        this.argShouldShowMenubar = "show_menu_bar";
        this.argShowGroupLeaderboardEntry = "show_group_leaderboard";
        this.entryPointKey = "entryPoint";
        putExtra("is_group_leaderboard", Boolean.valueOf(z));
        putExtra("is_minimize_button_visible", Boolean.valueOf(z2));
        putExtra("contest_id", str3);
        putExtra("contest_chat_type", str4);
        putExtra("show_menu_bar", Boolean.valueOf(z3));
        putExtra("show_group_leaderboard", Boolean.valueOf(z4));
        putExtra("entryPoint", str5);
    }

    public final boolean isOpenGroupLeaderBoard() {
        Serializable extra = getExtra(this.isOpenGroupLeaderBoard);
        if (extra == null) {
            extra = (Serializable) false;
        }
        return ((Boolean) extra).booleanValue();
    }

    public final boolean showMinimizeButton() {
        Serializable extra = getExtra(this.isMinimizeButton);
        if (extra == null) {
            extra = (Serializable) false;
        }
        return ((Boolean) extra).booleanValue();
    }

    public final String getContestChatType() {
        return getString(this.contestchatType, "");
    }

    public final String getContestId() {
        Serializable extra = getExtra(this.contestid);
        if (extra instanceof String) {
            return (String) extra;
        }
        return null;
    }

    public final boolean getShouldShowMenubar() {
        return getBoolean(this.argShouldShowMenubar, true);
    }

    public final boolean getShouldShowGroupEntryPoint() {
        return getBoolean(this.argShowGroupLeaderboardEntry, true);
    }

    public final boolean getShouldResolveMinimizePromise() {
        return runAnimators.values((Object) getString(this.entryPointKey, ""), (Object) "CHAT_THUMBNAIL");
    }
}
