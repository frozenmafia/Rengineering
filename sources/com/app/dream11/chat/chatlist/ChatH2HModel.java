package com.app.dream11.chat.chatlist;

import o.runAnimators;
/* loaded from: classes.dex */
public final class ChatH2HModel {
    private final int opponentScore;
    private final int selfScore;
    private final String teamName;

    public static /* synthetic */ ChatH2HModel copy$default(ChatH2HModel chatH2HModel, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = chatH2HModel.opponentScore;
        }
        if ((i3 & 2) != 0) {
            i2 = chatH2HModel.selfScore;
        }
        if ((i3 & 4) != 0) {
            str = chatH2HModel.teamName;
        }
        return chatH2HModel.copy(i, i2, str);
    }

    public final int component1() {
        return this.opponentScore;
    }

    public final int component2() {
        return this.selfScore;
    }

    public final String component3() {
        return this.teamName;
    }

    public final ChatH2HModel copy(int i, int i2, String str) {
        runAnimators.ag$a(str, "teamName");
        return new ChatH2HModel(i, i2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatH2HModel) {
            ChatH2HModel chatH2HModel = (ChatH2HModel) obj;
            return this.opponentScore == chatH2HModel.opponentScore && this.selfScore == chatH2HModel.selfScore && runAnimators.values((Object) this.teamName, (Object) chatH2HModel.teamName);
        }
        return false;
    }

    public int hashCode() {
        return (((this.opponentScore * 31) + this.selfScore) * 31) + this.teamName.hashCode();
    }

    public String toString() {
        int i = this.opponentScore;
        int i2 = this.selfScore;
        String str = this.teamName;
        return "ChatH2HModel(opponentScore=" + i + ", selfScore=" + i2 + ", teamName=" + str + ")";
    }

    public ChatH2HModel(int i, int i2, String str) {
        runAnimators.ag$a(str, "teamName");
        this.opponentScore = i;
        this.selfScore = i2;
        this.teamName = str;
    }

    public final int getOpponentScore() {
        return this.opponentScore;
    }

    public final int getSelfScore() {
        return this.selfScore;
    }

    public final String getTeamName() {
        return this.teamName;
    }
}
