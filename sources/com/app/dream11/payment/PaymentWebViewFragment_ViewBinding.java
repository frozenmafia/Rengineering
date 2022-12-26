package com.app.dream11.payment;

import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import butterknife.Unbinder;
import com.app.dream11Pro.R;
import o.MediaControllerCompat;
/* loaded from: classes6.dex */
public class PaymentWebViewFragment_ViewBinding implements Unbinder {
    private PaymentWebViewFragment toString;

    public PaymentWebViewFragment_ViewBinding(PaymentWebViewFragment paymentWebViewFragment, View view) {
        this.toString = paymentWebViewFragment;
        paymentWebViewFragment.web = (WebView) MediaControllerCompat.Callback.ag$a(view, R.id.res_0x7f0a1084, "field 'web'", WebView.class);
        paymentWebViewFragment.Pbar = (ProgressBar) MediaControllerCompat.Callback.ag$a(view, R.id.pBar, "field 'Pbar'", ProgressBar.class);
    }
}
