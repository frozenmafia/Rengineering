package com.app.dream11.chat.chatlist.contestinvitebottomsheet;

import o.Styleable;
import o.Visibility;
import o.captureHierarchy;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes.dex */
public final class ChatContestInviteViewAllVM {
    private final Styleable.ArcMotion<setAnimationMatrix> onViewAllCTAClicked;
    private final String viewAllText;
    private final boolean viewAllVisibility;

    public ChatContestInviteViewAllVM(Integer num, Integer num2, String str, String str2, Integer num3, captureHierarchy<? super Integer, ? super Integer, ? super String, ? super Integer, setAnimationMatrix> capturehierarchy) {
        runAnimators.ag$a(str, "inviterTeamName");
        runAnimators.ag$a(str2, "viewAllText");
        runAnimators.ag$a(capturehierarchy, "onViewAllClick");
        this.viewAllText = str2;
        this.viewAllVisibility = !Visibility.Mode.ag$a((CharSequence) str2);
        this.onViewAllCTAClicked = new ChatContestInviteViewAllVM$onViewAllCTAClicked$1(capturehierarchy, num, num2, str, num3);
    }

    public final String getViewAllText() {
        return this.viewAllText;
    }

    public final boolean getViewAllVisibility() {
        return this.viewAllVisibility;
    }

    public final Styleable.ArcMotion<setAnimationMatrix> getOnViewAllCTAClicked() {
        return this.onViewAllCTAClicked;
    }
}
