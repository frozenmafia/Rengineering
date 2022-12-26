package com.app.dream11.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import butterknife.Unbinder;
import com.app.dream11Pro.R;
import o.MediaControllerCompat;
/* loaded from: classes6.dex */
public class PaymentCardView_ViewBinding implements Unbinder {
    private PaymentCardView valueOf;

    public PaymentCardView_ViewBinding(PaymentCardView paymentCardView, View view) {
        this.valueOf = paymentCardView;
        paymentCardView.cardTypeImg = (ImageView) MediaControllerCompat.Callback.ag$a(view, R.id.imageView23, "field 'cardTypeImg'", ImageView.class);
        paymentCardView.cardType = (CustomTextView) MediaControllerCompat.Callback.ag$a(view, R.id.cardType, "field 'cardType'", CustomTextView.class);
        paymentCardView.cardNumber = (CustomTextView) MediaControllerCompat.Callback.ag$a(view, R.id.res_0x7f0a0225, "field 'cardNumber'", CustomTextView.class);
        paymentCardView.expTxt = (CustomTextView) MediaControllerCompat.Callback.ag$a(view, R.id.expTxt, "field 'expTxt'", CustomTextView.class);
        paymentCardView.expValue = (CustomTextView) MediaControllerCompat.Callback.ag$a(view, R.id.expValue, "field 'expValue'", CustomTextView.class);
        paymentCardView.cvvTxt = (CustomTextView) MediaControllerCompat.Callback.ag$a(view, R.id.cvvTxt, "field 'cvvTxt'", CustomTextView.class);
        paymentCardView.cvvValue = (CustomTextView) MediaControllerCompat.Callback.ag$a(view, R.id.cvvValue, "field 'cvvValue'", CustomTextView.class);
        paymentCardView.otherInfo = (RelativeLayout) MediaControllerCompat.Callback.ag$a(view, R.id.otherInfo, "field 'otherInfo'", RelativeLayout.class);
        paymentCardView.nameRel = (RelativeLayout) MediaControllerCompat.Callback.ag$a(view, R.id.nameRel, "field 'nameRel'", RelativeLayout.class);
        paymentCardView.mainRel = (RelativeLayout) MediaControllerCompat.Callback.ag$a(view, R.id.mainRel, "field 'mainRel'", RelativeLayout.class);
        paymentCardView.wrapRel = (RelativeLayout) MediaControllerCompat.Callback.ag$a(view, R.id.layout_wrap, "field 'wrapRel'", RelativeLayout.class);
    }
}
