package com.app.dream11.leaguelisting;

import android.view.View;
import butterknife.Unbinder;
import com.app.dream11.core.performance.D11RelativeLayoutTracker;
import com.app.dream11.ui.CustomEditTextView;
import com.app.dream11Pro.R;
import com.dream11.design.button.D11Button;
import o.MediaControllerCompat;
import o.dispatchMediaButtonEvent;
/* loaded from: classes6.dex */
public class InviteCodeFragment_ViewBinding implements Unbinder {
    private View ah$a;
    private InviteCodeFragment toString;

    public InviteCodeFragment_ViewBinding(final InviteCodeFragment inviteCodeFragment, View view) {
        this.toString = inviteCodeFragment;
        inviteCodeFragment.invite_code_txt = (CustomEditTextView) MediaControllerCompat.Callback.ag$a(view, R.id.invite_code_txt, "field 'invite_code_txt'", CustomEditTextView.class);
        View valueOf = MediaControllerCompat.Callback.valueOf(view, R.id.action_league_info_join, "field 'action_league_info_join' and method 'onJoin'");
        inviteCodeFragment.action_league_info_join = (D11Button) MediaControllerCompat.Callback.toString(valueOf, R.id.action_league_info_join, "field 'action_league_info_join'", D11Button.class);
        this.ah$a = valueOf;
        valueOf.setOnClickListener(new dispatchMediaButtonEvent() { // from class: com.app.dream11.leaguelisting.InviteCodeFragment_ViewBinding.1
            @Override // o.dispatchMediaButtonEvent
            public void ag$a(View view2) {
                inviteCodeFragment.onJoin();
            }
        });
        inviteCodeFragment.rlParentContainer = (D11RelativeLayoutTracker) MediaControllerCompat.Callback.ag$a(view, R.id.mainView, "field 'rlParentContainer'", D11RelativeLayoutTracker.class);
    }
}
