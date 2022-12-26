package com.app.dream11.chat.models;

import o.isFullSpan;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ChatContestCardSquad {
    @isFullSpan(valueOf = "flag")
    private final String flag;
    @isFullSpan(valueOf = "id")
    private final int id;
    @isFullSpan(valueOf = "shortTeamName")
    private final String shortTeamName;

    public static /* synthetic */ ChatContestCardSquad copy$default(ChatContestCardSquad chatContestCardSquad, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = chatContestCardSquad.id;
        }
        if ((i2 & 2) != 0) {
            str = chatContestCardSquad.shortTeamName;
        }
        if ((i2 & 4) != 0) {
            str2 = chatContestCardSquad.flag;
        }
        return chatContestCardSquad.copy(i, str, str2);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.shortTeamName;
    }

    public final String component3() {
        return this.flag;
    }

    public final ChatContestCardSquad copy(int i, String str, String str2) {
        return new ChatContestCardSquad(i, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatContestCardSquad) {
            ChatContestCardSquad chatContestCardSquad = (ChatContestCardSquad) obj;
            return this.id == chatContestCardSquad.id && runAnimators.values((Object) this.shortTeamName, (Object) chatContestCardSquad.shortTeamName) && runAnimators.values((Object) this.flag, (Object) chatContestCardSquad.flag);
        }
        return false;
    }

    public int hashCode() {
        int i = this.id;
        String str = this.shortTeamName;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.flag;
        return (((i * 31) + hashCode) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        int i = this.id;
        String str = this.shortTeamName;
        String str2 = this.flag;
        return "ChatContestCardSquad(id=" + i + ", shortTeamName=" + str + ", flag=" + str2 + ")";
    }

    public ChatContestCardSquad(int i, String str, String str2) {
        this.id = i;
        this.shortTeamName = str;
        this.flag = str2;
    }

    public final int getId() {
        return this.id;
    }

    public final String getShortTeamName() {
        return this.shortTeamName;
    }

    public final String getFlag() {
        return this.flag;
    }
}
