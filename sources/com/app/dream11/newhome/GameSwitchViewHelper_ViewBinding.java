package com.app.dream11.newhome;

import android.view.View;
import butterknife.Unbinder;
import com.app.dream11.ui.gradienttablayout.Dream11GradientTabLayout;
import com.app.dream11Pro.R;
import o.MediaControllerCompat;
/* loaded from: classes6.dex */
public final class GameSwitchViewHelper_ViewBinding implements Unbinder {
    private GameSwitchViewHelper values;

    public GameSwitchViewHelper_ViewBinding(GameSwitchViewHelper gameSwitchViewHelper, View view) {
        this.values = gameSwitchViewHelper;
        gameSwitchViewHelper.gradientTabLayout = (Dream11GradientTabLayout) MediaControllerCompat.Callback.ag$a(view, R.id.dream11GradientTabLabLayout, "field 'gradientTabLayout'", Dream11GradientTabLayout.class);
    }
}
