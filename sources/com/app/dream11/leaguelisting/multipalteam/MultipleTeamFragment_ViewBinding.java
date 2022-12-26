package com.app.dream11.leaguelisting.multipalteam;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import butterknife.Unbinder;
import com.app.dream11.ui.CustomButton;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11.ui.DreamRecyclerView;
import com.app.dream11Pro.R;
import o.MediaControllerCompat;
import o.dispatchMediaButtonEvent;
/* loaded from: classes6.dex */
public class MultipleTeamFragment_ViewBinding implements Unbinder {
    private View HaptikSDK$b;
    private View ah$a;
    private View toString;
    private MultipleTeamFragment valueOf;
    private View values;

    public MultipleTeamFragment_ViewBinding(final MultipleTeamFragment multipleTeamFragment, View view) {
        this.valueOf = multipleTeamFragment;
        multipleTeamFragment.progressBar = (ProgressBar) MediaControllerCompat.Callback.ag$a(view, R.id.progressBar7, "field 'progressBar'", ProgressBar.class);
        multipleTeamFragment.recyclerView = (DreamRecyclerView) MediaControllerCompat.Callback.ag$a(view, R.id.rv_myTeams, "field 'recyclerView'", DreamRecyclerView.class);
        multipleTeamFragment.reJoin_footer = (LinearLayout) MediaControllerCompat.Callback.ag$a(view, R.id.reJoin_footer, "field 'reJoin_footer'", LinearLayout.class);
        multipleTeamFragment.footer = (LinearLayout) MediaControllerCompat.Callback.ag$a(view, R.id.footer, "field 'footer'", LinearLayout.class);
        multipleTeamFragment.pageTitle = (CustomTextView) MediaControllerCompat.Callback.ag$a(view, R.id.pageTitle, "field 'pageTitle'", CustomTextView.class);
        View valueOf = MediaControllerCompat.Callback.valueOf(view, R.id.reJoin, "field 'reJoin' and method 'joinLeague'");
        multipleTeamFragment.reJoin = (CustomButton) MediaControllerCompat.Callback.toString(valueOf, R.id.reJoin, "field 'reJoin'", CustomButton.class);
        this.HaptikSDK$b = valueOf;
        valueOf.setOnClickListener(new dispatchMediaButtonEvent() { // from class: com.app.dream11.leaguelisting.multipalteam.MultipleTeamFragment_ViewBinding.4
            @Override // o.dispatchMediaButtonEvent
            public void ag$a(View view2) {
                multipleTeamFragment.joinLeague();
            }
        });
        View valueOf2 = MediaControllerCompat.Callback.valueOf(view, R.id.join, "field 'join' and method 'joinLeague'");
        multipleTeamFragment.join = (CustomButton) MediaControllerCompat.Callback.toString(valueOf2, R.id.join, "field 'join'", CustomButton.class);
        this.values = valueOf2;
        valueOf2.setOnClickListener(new dispatchMediaButtonEvent() { // from class: com.app.dream11.leaguelisting.multipalteam.MultipleTeamFragment_ViewBinding.5
            @Override // o.dispatchMediaButtonEvent
            public void ag$a(View view2) {
                multipleTeamFragment.joinLeague();
            }
        });
        View valueOf3 = MediaControllerCompat.Callback.valueOf(view, R.id.createTeam, "method 'createTeam'");
        this.ah$a = valueOf3;
        valueOf3.setOnClickListener(new dispatchMediaButtonEvent() { // from class: com.app.dream11.leaguelisting.multipalteam.MultipleTeamFragment_ViewBinding.2
            @Override // o.dispatchMediaButtonEvent
            public void ag$a(View view2) {
                multipleTeamFragment.createTeam(view2);
            }
        });
        View valueOf4 = MediaControllerCompat.Callback.valueOf(view, R.id.addTeam, "method 'addTeam'");
        this.toString = valueOf4;
        valueOf4.setOnClickListener(new dispatchMediaButtonEvent() { // from class: com.app.dream11.leaguelisting.multipalteam.MultipleTeamFragment_ViewBinding.1
            @Override // o.dispatchMediaButtonEvent
            public void ag$a(View view2) {
                multipleTeamFragment.addTeam(view2);
            }
        });
    }
}
