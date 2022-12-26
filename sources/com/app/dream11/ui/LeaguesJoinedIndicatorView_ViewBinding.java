package com.app.dream11.ui;

import android.view.View;
import butterknife.Unbinder;
import com.app.dream11Pro.R;
import o.MediaControllerCompat;
/* loaded from: classes6.dex */
public class LeaguesJoinedIndicatorView_ViewBinding implements Unbinder {
    private LeaguesJoinedIndicatorView ah$a;

    public LeaguesJoinedIndicatorView_ViewBinding(LeaguesJoinedIndicatorView leaguesJoinedIndicatorView, View view) {
        this.ah$a = leaguesJoinedIndicatorView;
        leaguesJoinedIndicatorView.textNumLeagues = (CustomTextView) MediaControllerCompat.Callback.ag$a(view, R.id.text_leagues_joined_num_leagues, "field 'textNumLeagues'", CustomTextView.class);
    }
}
