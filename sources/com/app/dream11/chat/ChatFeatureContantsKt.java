package com.app.dream11.chat;

import com.app.dream11.chat.models.ChatType;
import com.app.dream11Pro.R;
import com.sendbird.android.GroupChannel;
import com.sendbird.android.User;
import java.util.Map;
import kotlin.Pair;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ChatFeatureContantsKt {
    private static final Map<String, Integer> ChatReactionMap = runAnimators.ag$a(new Pair[]{new Pair("trophy", Integer.valueOf((int) R.drawable.ic_chat_reaction_trophy)), new Pair("clap", Integer.valueOf((int) R.drawable.ic_chat_reaction_clap)), new Pair("thumbsUp", Integer.valueOf((int) R.drawable.ic_chat_reaction_thumbsup)), new Pair("money", Integer.valueOf((int) R.drawable.ic_chat_reaction_money)), new Pair("fireball", Integer.valueOf((int) R.drawable.ic_chat_reaction_lit)), new Pair("duck", Integer.valueOf((int) R.drawable.ic_chat_reaction_sad_luck))}, "pairs");

    public static final String getUserMetaData(User user) {
        runAnimators.ag$a(user, "<this>");
        return user.getMetaData("user_data");
    }

    public static final boolean isPushNotificationsToBeShown(GroupChannel groupChannel) {
        runAnimators.ag$a(groupChannel, "<this>");
        return groupChannel.getMyPushTriggerOption() != GroupChannel.PushTriggerOption.OFF;
    }

    public static final boolean isOneOnOneChat(GroupChannel groupChannel) {
        runAnimators.ag$a(groupChannel, "<this>");
        return runAnimators.values((Object) groupChannel.getCustomType(), (Object) ChatType.DM.name());
    }

    public static final boolean isGroupChat(GroupChannel groupChannel) {
        runAnimators.ag$a(groupChannel, "<this>");
        return runAnimators.values((Object) groupChannel.getCustomType(), (Object) ChatType.GROUP_CHAT.name());
    }

    public static final boolean isOnOnOneGhostChannel(GroupChannel groupChannel) {
        runAnimators.ag$a(groupChannel, "<this>");
        return runAnimators.values((Object) groupChannel.getCustomType(), (Object) ChatType.X.name());
    }

    public static final Map<String, Integer> getChatReactionMap() {
        return ChatReactionMap;
    }
}
