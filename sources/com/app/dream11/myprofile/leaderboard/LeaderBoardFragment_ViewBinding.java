package com.app.dream11.myprofile.leaderboard;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import androidx.cardview.widget.CardView;
import butterknife.Unbinder;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11.ui.DreamRecyclerView;
import com.app.dream11Pro.R;
import o.MediaControllerCompat;
/* loaded from: classes6.dex */
public class LeaderBoardFragment_ViewBinding implements Unbinder {
    private LeaderBoardFragment values;

    public LeaderBoardFragment_ViewBinding(LeaderBoardFragment leaderBoardFragment, View view) {
        this.values = leaderBoardFragment;
        leaderBoardFragment.progressBar = (ProgressBar) MediaControllerCompat.Callback.ag$a(view, R.id.pBar, "field 'progressBar'", ProgressBar.class);
        leaderBoardFragment.recyclerView = (DreamRecyclerView) MediaControllerCompat.Callback.ag$a(view, R.id.res_0x7f0a0a70, "field 'recyclerView'", DreamRecyclerView.class);
        leaderBoardFragment.spinner = (Spinner) MediaControllerCompat.Callback.ag$a(view, R.id.res_0x7f0a0bf8, "field 'spinner'", Spinner.class);
        leaderBoardFragment.selectionLayout = (RelativeLayout) MediaControllerCompat.Callback.ag$a(view, R.id.selection, "field 'selectionLayout'", RelativeLayout.class);
        leaderBoardFragment.empty = (CustomTextView) MediaControllerCompat.Callback.ag$a(view, R.id.noData, "field 'empty'", CustomTextView.class);
        leaderBoardFragment.headerLayout = (CardView) MediaControllerCompat.Callback.ag$a(view, R.id.res_0x7f0a05a9, "field 'headerLayout'", CardView.class);
    }
}
