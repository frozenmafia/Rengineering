package com.app.dream11.leaguelisting;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import com.app.dream11.core.performance.D11RelativeLayoutTracker;
import com.app.dream11Pro.R;
import o.MediaControllerCompat;
import o.dispatchMediaButtonEvent;
/* loaded from: classes6.dex */
public class JoinLeagueDialog_ViewBinding implements Unbinder {
    private View ah$a;
    private View valueOf;
    private JoinLeagueDialog values;

    public JoinLeagueDialog_ViewBinding(final JoinLeagueDialog joinLeagueDialog, View view) {
        this.values = joinLeagueDialog;
        joinLeagueDialog.mainView = (D11RelativeLayoutTracker) MediaControllerCompat.Callback.ag$a(view, R.id.mainView, "field 'mainView'", D11RelativeLayoutTracker.class);
        joinLeagueDialog.cashbonusTv = (TextView) MediaControllerCompat.Callback.ag$a(view, R.id.deduct_cash_bonus, "field 'cashbonusTv'", TextView.class);
        View valueOf = MediaControllerCompat.Callback.valueOf(view, R.id.cash_bonus_blocked, "field 'blockedCashbonusTv' and method 'onBlockedClicked'");
        joinLeagueDialog.blockedCashbonusTv = (TextView) MediaControllerCompat.Callback.toString(valueOf, R.id.cash_bonus_blocked, "field 'blockedCashbonusTv'", TextView.class);
        this.ah$a = valueOf;
        valueOf.setOnClickListener(new dispatchMediaButtonEvent() { // from class: com.app.dream11.leaguelisting.JoinLeagueDialog_ViewBinding.2
            @Override // o.dispatchMediaButtonEvent
            public void ag$a(View view2) {
                joinLeagueDialog.onBlockedClicked(view2);
            }
        });
        joinLeagueDialog.cbBlockedLt = MediaControllerCompat.Callback.valueOf(view, R.id.lt_cb_blocked, "field 'cbBlockedLt'");
        joinLeagueDialog.payableAmt = (TextView) MediaControllerCompat.Callback.ag$a(view, R.id.payable_amt, "field 'payableAmt'", TextView.class);
        joinLeagueDialog.couponsLayout = (ViewGroup) MediaControllerCompat.Callback.ag$a(view, R.id.coupons_layout, "field 'couponsLayout'", ViewGroup.class);
        View valueOf2 = MediaControllerCompat.Callback.valueOf(view, R.id.caption_cb_deduct, "method 'onInfoClick'");
        this.valueOf = valueOf2;
        valueOf2.setOnClickListener(new dispatchMediaButtonEvent() { // from class: com.app.dream11.leaguelisting.JoinLeagueDialog_ViewBinding.4
            @Override // o.dispatchMediaButtonEvent
            public void ag$a(View view2) {
                joinLeagueDialog.onInfoClick(view2);
            }
        });
    }
}
