package com.app.dream11.myprofile.leaderboard;

import android.view.View;
import butterknife.Unbinder;
import com.app.dream11.ui.CircularImageView;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11.ui.DreamRecyclerView;
import com.app.dream11Pro.R;
import o.MediaControllerCompat;
import o.dispatchMediaButtonEvent;
/* loaded from: classes6.dex */
public class LeaderboardTeamStatsFragment_ViewBinding implements Unbinder {
    private View ah$a;
    private LeaderboardTeamStatsFragment valueOf;

    public LeaderboardTeamStatsFragment_ViewBinding(final LeaderboardTeamStatsFragment leaderboardTeamStatsFragment, View view) {
        this.valueOf = leaderboardTeamStatsFragment;
        View valueOf = MediaControllerCompat.Callback.valueOf(view, R.id.avatarImg, "field 'avatarImg' and method 'OnProfileClick'");
        leaderboardTeamStatsFragment.avatarImg = (CircularImageView) MediaControllerCompat.Callback.toString(valueOf, R.id.avatarImg, "field 'avatarImg'", CircularImageView.class);
        this.ah$a = valueOf;
        valueOf.setOnClickListener(new dispatchMediaButtonEvent() { // from class: com.app.dream11.myprofile.leaderboard.LeaderboardTeamStatsFragment_ViewBinding.2
            @Override // o.dispatchMediaButtonEvent
            public void ag$a(View view2) {
                leaderboardTeamStatsFragment.OnProfileClick();
            }
        });
        leaderboardTeamStatsFragment.teamName = (CustomTextView) MediaControllerCompat.Callback.ag$a(view, R.id.teamName, "field 'teamName'", CustomTextView.class);
        leaderboardTeamStatsFragment.tourName = (CustomTextView) MediaControllerCompat.Callback.ag$a(view, R.id.tourName, "field 'tourName'", CustomTextView.class);
        leaderboardTeamStatsFragment.points = (CustomTextView) MediaControllerCompat.Callback.ag$a(view, R.id.points, "field 'points'", CustomTextView.class);
        leaderboardTeamStatsFragment.rank = (CustomTextView) MediaControllerCompat.Callback.ag$a(view, R.id.rank, "field 'rank'", CustomTextView.class);
        leaderboardTeamStatsFragment.recyclerView = (DreamRecyclerView) MediaControllerCompat.Callback.ag$a(view, R.id.res_0x7f0a0a70, "field 'recyclerView'", DreamRecyclerView.class);
        leaderboardTeamStatsFragment.matches = (CustomTextView) MediaControllerCompat.Callback.ag$a(view, R.id.matches, "field 'matches'", CustomTextView.class);
        leaderboardTeamStatsFragment.empty = (CustomTextView) MediaControllerCompat.Callback.ag$a(view, R.id.empty, "field 'empty'", CustomTextView.class);
    }
}
