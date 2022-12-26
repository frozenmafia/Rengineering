package com.app.dream11.chat.chatlist;

import com.app.dream11.core.service.graphql.api.type.RankChange;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ChatListGLModel {
    private final Integer rank;
    private final RankChange rankChange;
    private final String tourName;

    public static /* synthetic */ ChatListGLModel copy$default(ChatListGLModel chatListGLModel, String str, Integer num, RankChange rankChange, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatListGLModel.tourName;
        }
        if ((i & 2) != 0) {
            num = chatListGLModel.rank;
        }
        if ((i & 4) != 0) {
            rankChange = chatListGLModel.rankChange;
        }
        return chatListGLModel.copy(str, num, rankChange);
    }

    public final String component1() {
        return this.tourName;
    }

    public final Integer component2() {
        return this.rank;
    }

    public final RankChange component3() {
        return this.rankChange;
    }

    public final ChatListGLModel copy(String str, Integer num, RankChange rankChange) {
        runAnimators.ag$a(str, "tourName");
        return new ChatListGLModel(str, num, rankChange);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatListGLModel) {
            ChatListGLModel chatListGLModel = (ChatListGLModel) obj;
            return runAnimators.values((Object) this.tourName, (Object) chatListGLModel.tourName) && runAnimators.values(this.rank, chatListGLModel.rank) && this.rankChange == chatListGLModel.rankChange;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.tourName.hashCode();
        Integer num = this.rank;
        int hashCode2 = num == null ? 0 : num.hashCode();
        RankChange rankChange = this.rankChange;
        return (((hashCode * 31) + hashCode2) * 31) + (rankChange != null ? rankChange.hashCode() : 0);
    }

    public String toString() {
        String str = this.tourName;
        Integer num = this.rank;
        RankChange rankChange = this.rankChange;
        return "ChatListGLModel(tourName=" + str + ", rank=" + num + ", rankChange=" + rankChange + ")";
    }

    public ChatListGLModel(String str, Integer num, RankChange rankChange) {
        runAnimators.ag$a(str, "tourName");
        this.tourName = str;
        this.rank = num;
        this.rankChange = rankChange;
    }

    public final Integer getRank() {
        return this.rank;
    }

    public final RankChange getRankChange() {
        return this.rankChange;
    }

    public final String getTourName() {
        return this.tourName;
    }
}
