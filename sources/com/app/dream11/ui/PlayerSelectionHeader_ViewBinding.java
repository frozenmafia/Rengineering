package com.app.dream11.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import butterknife.Unbinder;
import com.app.dream11Pro.R;
import o.MediaControllerCompat;
import o.dispatchMediaButtonEvent;
/* loaded from: classes6.dex */
public class PlayerSelectionHeader_ViewBinding implements Unbinder {
    private View HaptikSDK$a;
    private View ah$a;
    private View toString;
    private View valueOf;
    private PlayerSelectionHeader values;

    public PlayerSelectionHeader_ViewBinding(final PlayerSelectionHeader playerSelectionHeader, View view) {
        this.values = playerSelectionHeader;
        View valueOf = MediaControllerCompat.Callback.valueOf(view, R.id.points, "field 'points' and method 'points'");
        playerSelectionHeader.points = (RelativeLayout) MediaControllerCompat.Callback.toString(valueOf, R.id.points, "field 'points'", RelativeLayout.class);
        this.valueOf = valueOf;
        valueOf.setOnClickListener(new dispatchMediaButtonEvent() { // from class: com.app.dream11.ui.PlayerSelectionHeader_ViewBinding.1
            @Override // o.dispatchMediaButtonEvent
            public void ag$a(View view2) {
                playerSelectionHeader.points(view2);
            }
        });
        View valueOf2 = MediaControllerCompat.Callback.valueOf(view, R.id.cr, "field 'cr' and method 'credits'");
        playerSelectionHeader.cr = (RelativeLayout) MediaControllerCompat.Callback.toString(valueOf2, R.id.cr, "field 'cr'", RelativeLayout.class);
        this.toString = valueOf2;
        valueOf2.setOnClickListener(new dispatchMediaButtonEvent() { // from class: com.app.dream11.ui.PlayerSelectionHeader_ViewBinding.5
            @Override // o.dispatchMediaButtonEvent
            public void ag$a(View view2) {
                playerSelectionHeader.credits(view2);
            }
        });
        View valueOf3 = MediaControllerCompat.Callback.valueOf(view, R.id.players, "field 'players' and method 'players'");
        playerSelectionHeader.players = (RelativeLayout) MediaControllerCompat.Callback.toString(valueOf3, R.id.players, "field 'players'", RelativeLayout.class);
        this.ah$a = valueOf3;
        valueOf3.setOnClickListener(new dispatchMediaButtonEvent() { // from class: com.app.dream11.ui.PlayerSelectionHeader_ViewBinding.3
            @Override // o.dispatchMediaButtonEvent
            public void ag$a(View view2) {
                playerSelectionHeader.players(view2);
            }
        });
        View valueOf4 = MediaControllerCompat.Callback.valueOf(view, R.id.team, "field 'team' and method 'team'");
        playerSelectionHeader.team = (RelativeLayout) MediaControllerCompat.Callback.toString(valueOf4, R.id.team, "field 'team'", RelativeLayout.class);
        this.HaptikSDK$a = valueOf4;
        valueOf4.setOnClickListener(new dispatchMediaButtonEvent() { // from class: com.app.dream11.ui.PlayerSelectionHeader_ViewBinding.2
            @Override // o.dispatchMediaButtonEvent
            public void ag$a(View view2) {
                playerSelectionHeader.team(view2);
            }
        });
        playerSelectionHeader.crArrow = (ImageView) MediaControllerCompat.Callback.ag$a(view, R.id.crArrow, "field 'crArrow'", ImageView.class);
        playerSelectionHeader.pointArrow = (ImageView) MediaControllerCompat.Callback.ag$a(view, R.id.pointArrow, "field 'pointArrow'", ImageView.class);
        playerSelectionHeader.playerArrow = (ImageView) MediaControllerCompat.Callback.ag$a(view, R.id.playerArrow, "field 'playerArrow'", ImageView.class);
        playerSelectionHeader.teamArrow = (ImageView) MediaControllerCompat.Callback.ag$a(view, R.id.teamArrow, "field 'teamArrow'", ImageView.class);
        playerSelectionHeader.info_txt = (CustomTextView) MediaControllerCompat.Callback.ag$a(view, R.id.customTextView4, "field 'info_txt'", CustomTextView.class);
        playerSelectionHeader.player_txt = (CustomTextView) MediaControllerCompat.Callback.ag$a(view, R.id.view4, "field 'player_txt'", CustomTextView.class);
        playerSelectionHeader.points_txt = (CustomTextView) MediaControllerCompat.Callback.ag$a(view, R.id.view2, "field 'points_txt'", CustomTextView.class);
        playerSelectionHeader.credits_txt = (CustomTextView) MediaControllerCompat.Callback.ag$a(view, R.id.view3, "field 'credits_txt'", CustomTextView.class);
    }
}
