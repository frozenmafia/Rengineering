package com.app.dream11.leaguelisting;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import o.conditional;
/* loaded from: classes6.dex */
public class InfoDialogFragment extends conditional {
    @BindView
    Button actionGotIt;

    @Override // o.conditional
    public void values(Bundle bundle) {
        ButterKnife.ag$a(this, values());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @OnClick
    public void onGotIt(View view) {
        Log.d("dream11/app", "" + this);
        if (isShowing()) {
            dismiss();
        }
    }
}
