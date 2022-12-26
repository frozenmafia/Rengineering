package com.app.dream11.contest.ui;

import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import butterknife.Unbinder;
import com.app.dream11.core.ui.D11ErrorFrameLayout;
import com.app.dream11.ui.DreamRecyclerView;
import com.app.dream11Pro.R;
import o.MediaControllerCompat;
/* loaded from: classes6.dex */
public class ContestSectionDetailsFragment_ViewBinding implements Unbinder {
    private ContestSectionDetailsFragment values;

    public ContestSectionDetailsFragment_ViewBinding(ContestSectionDetailsFragment contestSectionDetailsFragment, View view) {
        this.values = contestSectionDetailsFragment;
        contestSectionDetailsFragment.pull_refresh = (SwipeRefreshLayout) MediaControllerCompat.Callback.ag$a(view, R.id.pull_refresh, "field 'pull_refresh'", SwipeRefreshLayout.class);
        contestSectionDetailsFragment.errorHandleLayout = (D11ErrorFrameLayout) MediaControllerCompat.Callback.ag$a(view, R.id.errorHandleLayout, "field 'errorHandleLayout'", D11ErrorFrameLayout.class);
        contestSectionDetailsFragment.rvSectionContestList = (DreamRecyclerView) MediaControllerCompat.Callback.ag$a(view, R.id.rvSectionContestList, "field 'rvSectionContestList'", DreamRecyclerView.class);
    }
}
