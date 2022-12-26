package com.app.dream11.userpreferences;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import butterknife.Unbinder;
import com.app.dream11.ui.DreamRecyclerView;
import com.app.dream11Pro.R;
import o.MediaControllerCompat;
/* loaded from: classes6.dex */
public class UserPrefLanding_ViewBinding implements Unbinder {
    private UserPrefLanding toString;

    public UserPrefLanding_ViewBinding(UserPrefLanding userPrefLanding, View view) {
        this.toString = userPrefLanding;
        userPrefLanding.mRecyclerView = (DreamRecyclerView) MediaControllerCompat.Callback.ag$a(view, R.id.recycler_views, "field 'mRecyclerView'", DreamRecyclerView.class);
        userPrefLanding.pBar = (ProgressBar) MediaControllerCompat.Callback.ag$a(view, R.id.pBar, "field 'pBar'", ProgressBar.class);
        userPrefLanding.maLayout = (RelativeLayout) MediaControllerCompat.Callback.ag$a(view, R.id.mainRel, "field 'maLayout'", RelativeLayout.class);
        userPrefLanding.rootRel = (RelativeLayout) MediaControllerCompat.Callback.ag$a(view, R.id.rootRel, "field 'rootRel'", RelativeLayout.class);
    }
}
