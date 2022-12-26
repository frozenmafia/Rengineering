package com.app.dream11.chat.chatflowstates;

import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import java.io.Serializable;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes.dex */
public class BaseChatFlowState extends FlowState {
    private final String channelUrl;
    private final String chat_url;
    private final String screenOpenedFromKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseChatFlowState(String str, FlowStates flowStates, String str2) {
        super(flowStates, null, 2, null);
        runAnimators.ag$a(str, "channelUrl");
        runAnimators.ag$a(flowStates, "flowState");
        runAnimators.ag$a(str2, "screenOpenedFrom");
        this.channelUrl = str;
        this.chat_url = "groupId";
        this.screenOpenedFromKey = "screen";
        putExtra("groupId", str);
        putExtra("screen", str2);
    }

    public /* synthetic */ BaseChatFlowState(String str, FlowStates flowStates, String str2, int i, getTargetTypes gettargettypes) {
        this(str, flowStates, (i & 4) != 0 ? "" : str2);
    }

    public final String getChatUrl() {
        String string = getString(this.chat_url);
        return string == null ? "" : string;
    }

    public final String getScreenOpenedFrom() {
        Serializable extra = getExtra(this.screenOpenedFromKey);
        if (extra == null) {
        }
        return (String) extra;
    }

    public final void reset() {
        putExtra(this.chat_url, "");
    }
}
