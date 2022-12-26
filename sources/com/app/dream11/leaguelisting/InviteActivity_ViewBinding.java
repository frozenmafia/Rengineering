package com.app.dream11.leaguelisting;

import android.view.View;
import android.widget.RelativeLayout;
import butterknife.Unbinder;
import com.app.dream11Pro.R;
import o.MediaControllerCompat;
/* loaded from: classes6.dex */
public class InviteActivity_ViewBinding implements Unbinder {
    private InviteActivity values;

    public InviteActivity_ViewBinding(InviteActivity inviteActivity, View view) {
        this.values = inviteActivity;
        inviteActivity.mainRel = (RelativeLayout) MediaControllerCompat.Callback.ag$a(view, R.id.mainRel, "field 'mainRel'", RelativeLayout.class);
    }
}
