package com.app.dream11.playerpoints;

import com.app.dream11Pro.R;
import kotlin.jvm.internal.Lambda;
import o.MenuPresenter;
import o.Styleable;
/* loaded from: classes3.dex */
final class TeamPlayerStatPostRoundLockActivity$mFragmentHelper$2 extends Lambda implements Styleable.ArcMotion<MenuPresenter> {
    final /* synthetic */ TeamPlayerStatPostRoundLockActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeamPlayerStatPostRoundLockActivity$mFragmentHelper$2(TeamPlayerStatPostRoundLockActivity teamPlayerStatPostRoundLockActivity) {
        super(0);
        this.this$0 = teamPlayerStatPostRoundLockActivity;
    }

    @Override // o.Styleable.ArcMotion
    public final MenuPresenter invoke() {
        return new MenuPresenter(this.this$0.getSupportFragmentManager(), R.id.player_stats_container);
    }
}
