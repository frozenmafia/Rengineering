package com.app.dream11.contest.ui;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import butterknife.Unbinder;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11Pro.R;
import o.MediaControllerCompat;
/* loaded from: classes6.dex */
public class TeamCompareActivity_ViewBinding implements Unbinder {
    private TeamCompareActivity ah$a;

    public TeamCompareActivity_ViewBinding(TeamCompareActivity teamCompareActivity, View view) {
        this.ah$a = teamCompareActivity;
        teamCompareActivity.toolbar = (Toolbar) MediaControllerCompat.Callback.ag$a(view, R.id.res_0x7f0a0d0f, "field 'toolbar'", Toolbar.class);
        teamCompareActivity.toolbarTitle = (CustomTextView) MediaControllerCompat.Callback.ag$a(view, R.id.res_0x7f0a0d15, "field 'toolbarTitle'", CustomTextView.class);
    }
}
