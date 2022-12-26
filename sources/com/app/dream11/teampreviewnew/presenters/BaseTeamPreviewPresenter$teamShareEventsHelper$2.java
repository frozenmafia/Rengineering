package com.app.dream11.teampreviewnew.presenters;

import com.app.dream11.chat.dynamiccard.teamshare.TeamShareEventsHelper;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setHintScreenTimeout;
/* loaded from: classes3.dex */
public final class BaseTeamPreviewPresenter$teamShareEventsHelper$2 extends Lambda implements Styleable.ArcMotion<TeamShareEventsHelper> {
    final /* synthetic */ setHintScreenTimeout<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTeamPreviewPresenter$teamShareEventsHelper$2(setHintScreenTimeout<T> sethintscreentimeout) {
        super(0);
        this.this$0 = sethintscreentimeout;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final TeamShareEventsHelper invoke() {
        return new TeamShareEventsHelper(this.this$0.a(), null, 2, null);
    }
}
