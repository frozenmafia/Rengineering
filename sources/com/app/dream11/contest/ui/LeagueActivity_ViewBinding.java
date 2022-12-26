package com.app.dream11.contest.ui;

import android.view.View;
import android.widget.FrameLayout;
import butterknife.Unbinder;
import com.app.dream11.account.MyAccountComponent;
import com.app.dream11Pro.R;
import o.MediaControllerCompat;
/* loaded from: classes6.dex */
public class LeagueActivity_ViewBinding implements Unbinder {
    private LeagueActivity valueOf;

    public LeagueActivity_ViewBinding(LeagueActivity leagueActivity, View view) {
        this.valueOf = leagueActivity;
        leagueActivity.childView = MediaControllerCompat.Callback.valueOf(view, R.id.base_rel, "field 'childView'");
        leagueActivity.myAccountView = (MyAccountComponent) MediaControllerCompat.Callback.ag$a(view, R.id.comp_my_account, "field 'myAccountView'", MyAccountComponent.class);
        leagueActivity.frameMyAccount = (FrameLayout) MediaControllerCompat.Callback.ag$a(view, R.id.frame_my_account, "field 'frameMyAccount'", FrameLayout.class);
    }
}
