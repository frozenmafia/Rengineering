package com.app.dream11.contest;

import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import com.app.dream11.core.ui.D11ErrorFrameLayout;
import com.app.dream11.ui.ComponentBlueTooltip;
import com.app.dream11.ui.DreamRecyclerView;
import com.app.dream11Pro.R;
import o.MediaControllerCompat;
/* loaded from: classes6.dex */
public class LeaderBoardRankingFragment_ViewBinding implements Unbinder {
    private LeaderBoardRankingFragment valueOf;

    public LeaderBoardRankingFragment_ViewBinding(LeaderBoardRankingFragment leaderBoardRankingFragment, View view) {
        this.valueOf = leaderBoardRankingFragment;
        leaderBoardRankingFragment.leaderBoardRv = (DreamRecyclerView) MediaControllerCompat.Callback.ag$a(view, R.id.leaderBoardRv, "field 'leaderBoardRv'", DreamRecyclerView.class);
        leaderBoardRankingFragment.errorHandleLayout = (D11ErrorFrameLayout) MediaControllerCompat.Callback.ag$a(view, R.id.errorHandleLayout, "field 'errorHandleLayout'", D11ErrorFrameLayout.class);
        leaderBoardRankingFragment.blueTooltipComponent = (ComponentBlueTooltip) MediaControllerCompat.Callback.ag$a(view, R.id.blueTooltipView, "field 'blueTooltipComponent'", ComponentBlueTooltip.class);
        leaderBoardRankingFragment.erExpectedIcon = MediaControllerCompat.Callback.valueOf(view, R.id.erExpectedIcon, "field 'erExpectedIcon'");
        leaderBoardRankingFragment.erAvailableIcon = MediaControllerCompat.Callback.valueOf(view, R.id.erAvailableIcon, "field 'erAvailableIcon'");
        leaderBoardRankingFragment.mImgCompareTeams = (ImageView) MediaControllerCompat.Callback.ag$a(view, R.id.imgCompareTeams, "field 'mImgCompareTeams'", ImageView.class);
    }
}
