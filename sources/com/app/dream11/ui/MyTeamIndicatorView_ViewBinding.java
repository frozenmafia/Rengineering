package com.app.dream11.ui;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.app.dream11Pro.R;
import o.MediaControllerCompat;
/* loaded from: classes6.dex */
public class MyTeamIndicatorView_ViewBinding implements Unbinder {
    private MyTeamIndicatorView toString;

    public MyTeamIndicatorView_ViewBinding(MyTeamIndicatorView myTeamIndicatorView, View view) {
        this.toString = myTeamIndicatorView;
        myTeamIndicatorView.textNumLeagues = (TextView) MediaControllerCompat.Callback.ag$a(view, R.id.text_leagues_joined_num_leagues, "field 'textNumLeagues'", TextView.class);
        myTeamIndicatorView.title = (CustomTextView) MediaControllerCompat.Callback.ag$a(view, R.id.res_0x7f0a0cf7, "field 'title'", CustomTextView.class);
    }
}
