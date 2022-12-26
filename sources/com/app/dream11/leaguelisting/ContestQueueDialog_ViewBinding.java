package com.app.dream11.leaguelisting;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import butterknife.Unbinder;
import com.app.dream11.core.performance.D11LinearLayoutTracker;
import com.app.dream11Pro.R;
import o.MediaControllerCompat;
import o.dispatchMediaButtonEvent;
/* loaded from: classes6.dex */
public class ContestQueueDialog_ViewBinding implements Unbinder {
    private ContestQueueDialog toString;
    private View valueOf;

    public ContestQueueDialog_ViewBinding(final ContestQueueDialog contestQueueDialog, View view) {
        this.toString = contestQueueDialog;
        contestQueueDialog.totalWinning = (TextView) MediaControllerCompat.Callback.ag$a(view, R.id.total_winning, "field 'totalWinning'", TextView.class);
        contestQueueDialog.totalWinners = (TextView) MediaControllerCompat.Callback.ag$a(view, R.id.total_winners, "field 'totalWinners'", TextView.class);
        contestQueueDialog.totalTeams = (TextView) MediaControllerCompat.Callback.ag$a(view, R.id.total_teams, "field 'totalTeams'", TextView.class);
        View valueOf = MediaControllerCompat.Callback.valueOf(view, R.id.button_join, "field 'joinButton' and method 'onJoinClick'");
        contestQueueDialog.joinButton = (AppCompatButton) MediaControllerCompat.Callback.toString(valueOf, R.id.button_join, "field 'joinButton'", AppCompatButton.class);
        this.valueOf = valueOf;
        valueOf.setOnClickListener(new dispatchMediaButtonEvent() { // from class: com.app.dream11.leaguelisting.ContestQueueDialog_ViewBinding.2
            @Override // o.dispatchMediaButtonEvent
            public void ag$a(View view2) {
                contestQueueDialog.onJoinClick(view2);
            }
        });
        contestQueueDialog.contestQueueLl = (D11LinearLayoutTracker) MediaControllerCompat.Callback.ag$a(view, R.id.llContestQueue, "field 'contestQueueLl'", D11LinearLayoutTracker.class);
    }
}
