package com.app.dream11.chat.models;

import o.isFullSpan;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ChatContestCard {
    @isFullSpan(valueOf = "match")
    private final ChatContestCardMatch match;

    public static /* synthetic */ ChatContestCard copy$default(ChatContestCard chatContestCard, ChatContestCardMatch chatContestCardMatch, int i, Object obj) {
        if ((i & 1) != 0) {
            chatContestCardMatch = chatContestCard.match;
        }
        return chatContestCard.copy(chatContestCardMatch);
    }

    public final ChatContestCardMatch component1() {
        return this.match;
    }

    public final ChatContestCard copy(ChatContestCardMatch chatContestCardMatch) {
        runAnimators.ag$a(chatContestCardMatch, "match");
        return new ChatContestCard(chatContestCardMatch);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChatContestCard) && runAnimators.values(this.match, ((ChatContestCard) obj).match);
    }

    public int hashCode() {
        return this.match.hashCode();
    }

    public String toString() {
        ChatContestCardMatch chatContestCardMatch = this.match;
        return "ChatContestCard(match=" + chatContestCardMatch + ")";
    }

    public ChatContestCard(ChatContestCardMatch chatContestCardMatch) {
        runAnimators.ag$a(chatContestCardMatch, "match");
        this.match = chatContestCardMatch;
    }

    public final ChatContestCardMatch getMatch() {
        return this.match;
    }
}
