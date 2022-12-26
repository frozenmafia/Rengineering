package com.app.dream11.chat.reaction;

import com.sendbird.android.constant.StringSet;
import java.io.Serializable;
import java.util.List;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ChatReactionModel implements Serializable {
    private final String key;
    private final List<String> userIds;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatReactionModel copy$default(ChatReactionModel chatReactionModel, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatReactionModel.key;
        }
        if ((i & 2) != 0) {
            list = chatReactionModel.userIds;
        }
        return chatReactionModel.copy(str, list);
    }

    public final String component1() {
        return this.key;
    }

    public final List<String> component2() {
        return this.userIds;
    }

    public final ChatReactionModel copy(String str, List<String> list) {
        runAnimators.ag$a(str, StringSet.key);
        runAnimators.ag$a(list, "userIds");
        return new ChatReactionModel(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatReactionModel) {
            ChatReactionModel chatReactionModel = (ChatReactionModel) obj;
            return runAnimators.values((Object) this.key, (Object) chatReactionModel.key) && runAnimators.values(this.userIds, chatReactionModel.userIds);
        }
        return false;
    }

    public int hashCode() {
        return (this.key.hashCode() * 31) + this.userIds.hashCode();
    }

    public String toString() {
        String str = this.key;
        List<String> list = this.userIds;
        return "ChatReactionModel(key=" + str + ", userIds=" + list + ")";
    }

    public ChatReactionModel(String str, List<String> list) {
        runAnimators.ag$a(str, StringSet.key);
        runAnimators.ag$a(list, "userIds");
        this.key = str;
        this.userIds = list;
    }

    public final String getKey() {
        return this.key;
    }

    public final List<String> getUserIds() {
        return this.userIds;
    }
}
