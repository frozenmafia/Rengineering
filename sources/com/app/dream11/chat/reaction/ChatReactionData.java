package com.app.dream11.chat.reaction;

import java.util.List;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ChatReactionData {
    private final String currentUserId;
    private final List<ChatReactionModel> reactionModelList;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatReactionData copy$default(ChatReactionData chatReactionData, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = chatReactionData.reactionModelList;
        }
        if ((i & 2) != 0) {
            str = chatReactionData.currentUserId;
        }
        return chatReactionData.copy(list, str);
    }

    public final List<ChatReactionModel> component1() {
        return this.reactionModelList;
    }

    public final String component2() {
        return this.currentUserId;
    }

    public final ChatReactionData copy(List<ChatReactionModel> list, String str) {
        runAnimators.ag$a(list, "reactionModelList");
        return new ChatReactionData(list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatReactionData) {
            ChatReactionData chatReactionData = (ChatReactionData) obj;
            return runAnimators.values(this.reactionModelList, chatReactionData.reactionModelList) && runAnimators.values((Object) this.currentUserId, (Object) chatReactionData.currentUserId);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.reactionModelList.hashCode();
        String str = this.currentUserId;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        List<ChatReactionModel> list = this.reactionModelList;
        String str = this.currentUserId;
        return "ChatReactionData(reactionModelList=" + list + ", currentUserId=" + str + ")";
    }

    public ChatReactionData(List<ChatReactionModel> list, String str) {
        runAnimators.ag$a(list, "reactionModelList");
        this.reactionModelList = list;
        this.currentUserId = str;
    }

    public final String getCurrentUserId() {
        return this.currentUserId;
    }

    public final List<ChatReactionModel> getReactionModelList() {
        return this.reactionModelList;
    }
}
