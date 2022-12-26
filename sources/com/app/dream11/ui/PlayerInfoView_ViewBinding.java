package com.app.dream11.ui;

import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import com.app.dream11Pro.R;
import o.MediaControllerCompat;
/* loaded from: classes6.dex */
public class PlayerInfoView_ViewBinding implements Unbinder {
    private PlayerInfoView valueOf;

    public PlayerInfoView_ViewBinding(PlayerInfoView playerInfoView, View view) {
        this.valueOf = playerInfoView;
        playerInfoView.jersey = (ImageView) MediaControllerCompat.Callback.ag$a(view, R.id.jersey, "field 'jersey'", ImageView.class);
        playerInfoView.sleeve = (ImageView) MediaControllerCompat.Callback.ag$a(view, R.id.Sleeve, "field 'sleeve'", ImageView.class);
        playerInfoView.title = (CustomTextView) MediaControllerCompat.Callback.ag$a(view, R.id.res_0x7f0a0cf7, "field 'title'", CustomTextView.class);
        playerInfoView.info_img = (ImageView) MediaControllerCompat.Callback.ag$a(view, R.id.iv_feed_how_to_play_cap, "field 'info_img'", ImageView.class);
    }
}
