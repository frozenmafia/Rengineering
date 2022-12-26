package com.app.dream11.verification;

import android.view.View;
import android.widget.RelativeLayout;
import butterknife.Unbinder;
import com.app.dream11Pro.R;
import com.google.android.material.textfield.TextInputLayout;
import o.MediaControllerCompat;
import o.dispatchMediaButtonEvent;
/* loaded from: classes6.dex */
public class MobileFragment_ViewBinding implements Unbinder {
    private View ah$a;
    private MobileFragment toString;
    private View valueOf;

    public MobileFragment_ViewBinding(final MobileFragment mobileFragment, View view) {
        this.toString = mobileFragment;
        mobileFragment.mobile_input = (TextInputLayout) MediaControllerCompat.Callback.ag$a(view, R.id.n, "field 'mobile_input'", TextInputLayout.class);
        mobileFragment.otp_input = (TextInputLayout) MediaControllerCompat.Callback.ag$a(view, R.id.n1, "field 'otp_input'", TextInputLayout.class);
        mobileFragment.email_input = (TextInputLayout) MediaControllerCompat.Callback.ag$a(view, R.id.n2, "field 'email_input'", TextInputLayout.class);
        View valueOf = MediaControllerCompat.Callback.valueOf(view, R.id.fblogin, "field 'fblogin' and method 'onFbClick'");
        mobileFragment.fblogin = (RelativeLayout) MediaControllerCompat.Callback.toString(valueOf, R.id.fblogin, "field 'fblogin'", RelativeLayout.class);
        this.ah$a = valueOf;
        valueOf.setOnClickListener(new dispatchMediaButtonEvent() { // from class: com.app.dream11.verification.MobileFragment_ViewBinding.1
            @Override // o.dispatchMediaButtonEvent
            public void ag$a(View view2) {
                mobileFragment.onFbClick();
            }
        });
        View valueOf2 = MediaControllerCompat.Callback.valueOf(view, R.id.googlelogin, "field 'googlelogin' and method 'onGoogleClick'");
        mobileFragment.googlelogin = (RelativeLayout) MediaControllerCompat.Callback.toString(valueOf2, R.id.googlelogin, "field 'googlelogin'", RelativeLayout.class);
        this.valueOf = valueOf2;
        valueOf2.setOnClickListener(new dispatchMediaButtonEvent() { // from class: com.app.dream11.verification.MobileFragment_ViewBinding.2
            @Override // o.dispatchMediaButtonEvent
            public void ag$a(View view2) {
                mobileFragment.onGoogleClick();
            }
        });
    }
}
