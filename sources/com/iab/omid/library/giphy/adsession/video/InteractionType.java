package com.iab.omid.library.giphy.adsession.video;
/* loaded from: classes7.dex */
public enum InteractionType {
    CLICK("click"),
    INVITATION_ACCEPTED("invitationAccept");
    
    String interactionType;

    InteractionType(String str) {
        this.interactionType = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.interactionType;
    }
}
