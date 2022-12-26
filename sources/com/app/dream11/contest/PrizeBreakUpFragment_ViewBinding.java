package com.app.dream11.contest;

import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import butterknife.Unbinder;
import com.app.dream11.core.ui.D11ErrorFrameLayout;
import com.app.dream11.ui.DreamRecyclerView;
import com.app.dream11Pro.R;
import o.MediaControllerCompat;
/* loaded from: classes6.dex */
public class PrizeBreakUpFragment_ViewBinding implements Unbinder {
    private PrizeBreakUpFragment toString;

    public PrizeBreakUpFragment_ViewBinding(PrizeBreakUpFragment prizeBreakUpFragment, View view) {
        this.toString = prizeBreakUpFragment;
        prizeBreakUpFragment.errorHandleLayout = (D11ErrorFrameLayout) MediaControllerCompat.Callback.ag$a(view, R.id.errorHandleLayout, "field 'errorHandleLayout'", D11ErrorFrameLayout.class);
        prizeBreakUpFragment.prizeBreakUpDreamRecyclerView = (DreamRecyclerView) MediaControllerCompat.Callback.ag$a(view, R.id.recycler_views, "field 'prizeBreakUpDreamRecyclerView'", DreamRecyclerView.class);
        prizeBreakUpFragment.pullToRefreshView = (SwipeRefreshLayout) MediaControllerCompat.Callback.ag$a(view, R.id.pull_refresh, "field 'pullToRefreshView'", SwipeRefreshLayout.class);
    }
}
