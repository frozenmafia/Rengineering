package com.app.dream11.leaguelisting;

import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import com.app.dream11Pro.R;
import o.MediaControllerCompat;
import o.dispatchMediaButtonEvent;
/* loaded from: classes6.dex */
public class InfoDialogFragment_ViewBinding implements Unbinder {
    private InfoDialogFragment ah$a;
    private View values;

    public InfoDialogFragment_ViewBinding(final InfoDialogFragment infoDialogFragment, View view) {
        this.ah$a = infoDialogFragment;
        View valueOf = MediaControllerCompat.Callback.valueOf(view, R.id.action_info_league_cap_got_it, "field 'actionGotIt' and method 'onGotIt'");
        infoDialogFragment.actionGotIt = (Button) MediaControllerCompat.Callback.toString(valueOf, R.id.action_info_league_cap_got_it, "field 'actionGotIt'", Button.class);
        this.values = valueOf;
        valueOf.setOnClickListener(new dispatchMediaButtonEvent() { // from class: com.app.dream11.leaguelisting.InfoDialogFragment_ViewBinding.4
            @Override // o.dispatchMediaButtonEvent
            public void ag$a(View view2) {
                infoDialogFragment.onGotIt(view2);
            }
        });
    }
}
