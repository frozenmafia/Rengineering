package com.app.dream11.newmycontests;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import butterknife.Unbinder;
import com.app.dream11.core.performance.D11RelativeLayoutTracker;
import com.app.dream11.core.ui.D11ErrorFrameLayout;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11.ui.DreamRecyclerView;
import com.app.dream11Pro.R;
import o.MediaControllerCompat;
/* loaded from: classes6.dex */
public class MyContestFragment_ViewBinding implements Unbinder {
    private MyContestFragment values;

    public MyContestFragment_ViewBinding(MyContestFragment myContestFragment, View view) {
        this.values = myContestFragment;
        myContestFragment.recyclerView = (DreamRecyclerView) MediaControllerCompat.Callback.ag$a(view, R.id.res_0x7f0a07e7, "field 'recyclerView'", DreamRecyclerView.class);
        myContestFragment.empty_txt = (CustomTextView) MediaControllerCompat.Callback.ag$a(view, R.id.empty_txt, "field 'empty_txt'", CustomTextView.class);
        myContestFragment.noR = (ScrollView) MediaControllerCompat.Callback.ag$a(view, R.id.noR, "field 'noR'", ScrollView.class);
        myContestFragment.joinContest = (CustomTextView) MediaControllerCompat.Callback.ag$a(view, R.id.join, "field 'joinContest'", CustomTextView.class);
        myContestFragment.rlUpcomingMatches = (D11RelativeLayoutTracker) MediaControllerCompat.Callback.ag$a(view, R.id.rl_upcoming_matches, "field 'rlUpcomingMatches'", D11RelativeLayoutTracker.class);
        myContestFragment.errorHandleLayout = (D11ErrorFrameLayout) MediaControllerCompat.Callback.ag$a(view, R.id.errorHandleLayout, "field 'errorHandleLayout'", D11ErrorFrameLayout.class);
        myContestFragment.llMyMatchesShimmer = (LinearLayout) MediaControllerCompat.Callback.ag$a(view, R.id.llMyMatchesShimmer, "field 'llMyMatchesShimmer'", LinearLayout.class);
    }
}
