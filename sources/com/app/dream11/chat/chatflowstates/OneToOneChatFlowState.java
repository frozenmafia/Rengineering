package com.app.dream11.chat.chatflowstates;

import com.app.dream11.utils.FlowStates;
import java.io.Serializable;
import java.util.Map;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes.dex */
public final class OneToOneChatFlowState extends BaseChatFlowState {
    private final String argIsFromProfile;
    private final String argShowMenuBar;
    private final String chat_url;
    private final String contestchatType;
    private final String contestid;
    private final String entryPointKey;
    private final String isMinimizeButton;
    private final String screenOpenedFromKey;

    public OneToOneChatFlowState() {
        super("", FlowStates.ONE_TO_ONE_CHAT_FLOW_STATE, "");
        this.argIsFromProfile = "is_from_profile";
        this.contestid = "contest_id";
        this.isMinimizeButton = "is_minimize_button_visible";
        this.contestchatType = "contest_chat_type";
        this.argShowMenuBar = "show_menu_bar";
        this.chat_url = "groupId";
        this.screenOpenedFromKey = "screen";
        this.entryPointKey = "entryPoint";
    }

    public /* synthetic */ OneToOneChatFlowState(String str, boolean z, String str2, String str3, boolean z2, boolean z3, String str4, String str5, int i, getTargetTypes gettargettypes) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : str3, (i & 16) == 0 ? z2 : false, (i & 32) != 0 ? true : z3, (i & 64) != 0 ? "none" : str4, (i & 128) == 0 ? str5 : "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneToOneChatFlowState(String str, boolean z, String str2, String str3, boolean z2, boolean z3, String str4, String str5) {
        super(str, FlowStates.ONE_TO_ONE_CHAT_FLOW_STATE, str2);
        runAnimators.ag$a(str, "channelUrl");
        runAnimators.ag$a(str2, "screenOpenedFrom");
        runAnimators.ag$a(str4, "contestChatType");
        runAnimators.ag$a(str5, "entryPoint");
        this.argIsFromProfile = "is_from_profile";
        this.contestid = "contest_id";
        this.isMinimizeButton = "is_minimize_button_visible";
        this.contestchatType = "contest_chat_type";
        this.argShowMenuBar = "show_menu_bar";
        this.chat_url = "groupId";
        this.screenOpenedFromKey = "screen";
        this.entryPointKey = "entryPoint";
        putExtra("is_from_profile", Boolean.valueOf(z));
        putExtra("contest_id", str3);
        putExtra("is_minimize_button_visible", Boolean.valueOf(z2));
        putExtra("contest_chat_type", str4);
        putExtra("show_menu_bar", Boolean.valueOf(z3));
        putExtra("entryPoint", str5);
    }

    public final boolean isFromProfile() {
        if (containsKey(this.argIsFromProfile)) {
            Serializable extra = getExtra(this.argIsFromProfile);
            Boolean bool = extra instanceof Boolean ? (Boolean) extra : null;
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return false;
    }

    public final String getContestId() {
        Serializable extra = getExtra(this.contestid);
        if (extra instanceof String) {
            return (String) extra;
        }
        return null;
    }

    public final String getContestChatType() {
        return getString(this.contestchatType, "");
    }

    public final boolean showMinimizeButton() {
        Serializable extra = getExtra(this.isMinimizeButton);
        if (extra == null) {
            extra = (Serializable) false;
        }
        return ((Boolean) extra).booleanValue();
    }

    public final boolean getShouldShowMenuBar() {
        return getBoolean(this.argShowMenuBar);
    }

    public final boolean getShouldResolveMinimizePromise() {
        return runAnimators.values((Object) getString(this.entryPointKey, ""), (Object) "CHAT_THUMBNAIL");
    }

    @Override // com.app.dream11.model.FlowState
    public void putAllExtras(Map<String, Serializable> map) {
        runAnimators.ag$a(map, "args");
        OneToOneChatFlowState oneToOneChatFlowState = this;
        String str = oneToOneChatFlowState.argIsFromProfile;
        oneToOneChatFlowState.putExtra(str, map.get(str));
        String str2 = oneToOneChatFlowState.contestid;
        String str3 = map.get(str2);
        if (str3 == null) {
        }
        oneToOneChatFlowState.putExtra(str2, str3);
        String str4 = oneToOneChatFlowState.isMinimizeButton;
        Serializable serializable = map.get(str4);
        if (serializable == null) {
            serializable = (Serializable) false;
        }
        oneToOneChatFlowState.putExtra(str4, serializable);
        String str5 = oneToOneChatFlowState.contestchatType;
        String str6 = map.get(str5);
        if (str6 == null) {
        }
        oneToOneChatFlowState.putExtra(str5, str6);
        String str7 = oneToOneChatFlowState.argShowMenuBar;
        Serializable serializable2 = map.get(str7);
        if (serializable2 == null) {
            serializable2 = (Serializable) true;
        }
        oneToOneChatFlowState.putExtra(str7, serializable2);
        String str8 = oneToOneChatFlowState.chat_url;
        oneToOneChatFlowState.putExtra(str8, map.get(str8));
        String str9 = oneToOneChatFlowState.screenOpenedFromKey;
        String str10 = map.get(str9);
        if (str10 == null) {
        }
        oneToOneChatFlowState.putExtra(str9, str10);
        String str11 = oneToOneChatFlowState.entryPointKey;
        String str12 = map.get(str11);
        if (str12 == null) {
        }
        oneToOneChatFlowState.putExtra(str11, str12);
    }
}
