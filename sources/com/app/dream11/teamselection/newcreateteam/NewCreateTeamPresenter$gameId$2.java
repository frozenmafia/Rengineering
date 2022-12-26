package com.app.dream11.teamselection.newcreateteam;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.startChooser;
/* loaded from: classes3.dex */
public final class NewCreateTeamPresenter$gameId$2 extends Lambda implements Styleable.ArcMotion<String> {
    final /* synthetic */ startChooser this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewCreateTeamPresenter$gameId$2(startChooser startchooser) {
        super(0);
        this.this$0 = startchooser;
    }

    @Override // o.Styleable.ArcMotion
    public final String invoke() {
        String wlsSlug = startChooser.valueOf(this.this$0).getWlsSlug();
        return wlsSlug == null ? this.this$0.HaptikSDK$c().getActiveGameConfig().getGameId() : wlsSlug;
    }
}
