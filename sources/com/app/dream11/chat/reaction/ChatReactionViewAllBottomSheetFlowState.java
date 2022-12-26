package com.app.dream11.chat.reaction;

import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import com.sendbird.android.constant.StringSet;
import java.io.Serializable;
import java.util.ArrayList;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ChatReactionViewAllBottomSheetFlowState extends FlowState {
    public static final Companion Companion = new Companion(null);
    public static final String IS_DM_CHANNEL = "is_dm_channel";
    public static final String MESSAGE_ID = "message_id";
    public static final String REACTION_DATA = "reaction_data";
    public static final String SENDER_ID = "sender_id";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatReactionViewAllBottomSheetFlowState(long j, String str, String str2, ArrayList<ChatReactionModel> arrayList, boolean z) {
        super(FlowStates.CHAT_REACTION_VIEW_ALL_BOTTOM_SHEET, null, 2, null);
        runAnimators.ag$a(str, "channelUrl");
        runAnimators.ag$a(str2, "senderId");
        runAnimators.ag$a(arrayList, "reactionModelList");
        putExtra("message_id", Long.valueOf(j));
        putExtra("reaction_data", arrayList);
        putExtra(IS_DM_CHANNEL, Boolean.valueOf(z));
        putExtra(StringSet.channel_url, str);
        putExtra("sender_id", str2);
    }

    public final ArrayList<ChatReactionModel> getReactionModelList() {
        Serializable extra = getExtra("reaction_data");
        if (extra instanceof ArrayList) {
            return (ArrayList) extra;
        }
        return null;
    }

    public final long getMessageId() {
        return FlowState.getLong$default(this, "message_id", 0L, 2, null);
    }

    public final boolean isDMChannel() {
        return getBoolean(IS_DM_CHANNEL);
    }

    public final String getSenderId() {
        return getString("sender_id");
    }

    public final String getChannelUrl() {
        return getString(StringSet.channel_url);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        private Companion() {
        }
    }
}
