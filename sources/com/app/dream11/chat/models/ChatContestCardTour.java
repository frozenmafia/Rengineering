package com.app.dream11.chat.models;

import o.isFullSpan;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ChatContestCardTour {
    @isFullSpan(valueOf = "tourId")
    private final int tourId;
    @isFullSpan(valueOf = "tourName")
    private final String tourName;

    public static /* synthetic */ ChatContestCardTour copy$default(ChatContestCardTour chatContestCardTour, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = chatContestCardTour.tourId;
        }
        if ((i2 & 2) != 0) {
            str = chatContestCardTour.tourName;
        }
        return chatContestCardTour.copy(i, str);
    }

    public final int component1() {
        return this.tourId;
    }

    public final String component2() {
        return this.tourName;
    }

    public final ChatContestCardTour copy(int i, String str) {
        return new ChatContestCardTour(i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatContestCardTour) {
            ChatContestCardTour chatContestCardTour = (ChatContestCardTour) obj;
            return this.tourId == chatContestCardTour.tourId && runAnimators.values((Object) this.tourName, (Object) chatContestCardTour.tourName);
        }
        return false;
    }

    public int hashCode() {
        int i = this.tourId;
        String str = this.tourName;
        return (i * 31) + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        int i = this.tourId;
        String str = this.tourName;
        return "ChatContestCardTour(tourId=" + i + ", tourName=" + str + ")";
    }

    public ChatContestCardTour(int i, String str) {
        this.tourId = i;
        this.tourName = str;
    }

    public final int getTourId() {
        return this.tourId;
    }

    public final String getTourName() {
        return this.tourName;
    }
}
