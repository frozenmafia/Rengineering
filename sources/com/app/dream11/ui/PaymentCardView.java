package com.app.dream11.ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.app.dream11.model.SaveCardDetails;
import com.app.dream11Pro.R;
import com.dreampay.commons.constants.Constants;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import o.createPopup;
/* loaded from: classes6.dex */
public class PaymentCardView extends RelativeLayout {
    private Context ag$a;
    @BindView
    CustomTextView cardNumber;
    @BindView
    CustomTextView cardType;
    @BindView
    ImageView cardTypeImg;
    @BindView
    CustomTextView cvvTxt;
    @BindView
    CustomTextView cvvValue;
    @BindView
    CustomTextView expTxt;
    @BindView
    CustomTextView expValue;
    @BindView
    RelativeLayout mainRel;
    @BindView
    RelativeLayout nameRel;
    @BindView
    RelativeLayout otherInfo;
    private boolean toString;
    @BindView
    RelativeLayout wrapRel;

    /* loaded from: classes6.dex */
    public enum CARDTYPE {
        MASTERCARD,
        VISA,
        RUPAY,
        MAESTRO,
        OTHER
    }

    public PaymentCardView(Context context) {
        super(context);
        this.ag$a = context;
        toString(context);
    }

    public PaymentCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ag$a = context;
        toString(context);
    }

    public PaymentCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ag$a = context;
        toString(context);
    }

    private void toString(Context context) {
        this.ag$a = context;
        LayoutInflater.from(context).inflate(R.layout.res_0x7f0d017f, this);
        ButterKnife.ag$a(this, this);
    }

    public void setCardDetails(SaveCardDetails saveCardDetails) {
        valueOf(saveCardDetails);
        values(saveCardDetails);
        toString(saveCardDetails);
        ah$a(saveCardDetails);
    }

    private void toString(int i) {
        this.mainRel.setBackgroundResource(i);
    }

    private void ah$a(SaveCardDetails saveCardDetails) {
        String str;
        String card_issuer = saveCardDetails.getCard_issuer();
        CustomTextView customTextView = this.cardType;
        if (TextUtils.isEmpty(card_issuer)) {
            str = saveCardDetails.getCard_type() + " Card";
        } else {
            str = card_issuer + Constants.WHITE_SPACE + saveCardDetails.getCard_type() + " Card";
        }
        customTextView.setText(str);
    }

    private void toString(SaveCardDetails saveCardDetails) {
        this.cardNumber.setText(saveCardDetails.getCard_number());
    }

    private void values(SaveCardDetails saveCardDetails) {
        String str;
        CustomTextView customTextView = this.expValue;
        StringBuilder sb = new StringBuilder();
        if (saveCardDetails.getCard_exp_month().length() >= 2) {
            str = saveCardDetails.getCard_exp_month();
        } else {
            str = SessionDescription.SUPPORTED_SDP_VERSION + saveCardDetails.getCard_exp_month();
        }
        sb.append(str);
        sb.append("/");
        sb.append(saveCardDetails.getCard_exp_year());
        customTextView.setText(sb.toString());
    }

    private void toString(SaveCardDetails saveCardDetails, boolean z) {
        String card_brand = saveCardDetails.getCard_brand();
        if (CARDTYPE.MASTERCARD.toString().equalsIgnoreCase(card_brand)) {
            toString(z ? R.drawable.mastercard_bg : R.drawable.mastercard_top_bg);
        } else if (CARDTYPE.VISA.toString().equalsIgnoreCase(card_brand)) {
            toString(z ? R.drawable.visa_bg : R.drawable.visa_top_bg);
        } else if (CARDTYPE.RUPAY.toString().equalsIgnoreCase(card_brand)) {
            toString(z ? R.drawable.rupay_bg : R.drawable.rupay_top_bg);
        } else if (CARDTYPE.MAESTRO.toString().equalsIgnoreCase(card_brand)) {
            toString(z ? R.drawable.mastro_bg : R.drawable.mastro_top_bg);
        } else {
            toString(z ? R.drawable.other_bg : R.drawable.other_top_bg);
        }
        createPopup.toString(getContext(), saveCardDetails.getCardLogo(), this.cardTypeImg, R.color.res_0x7f0605ac, R.drawable.generic_icon);
    }

    private void valueOf(SaveCardDetails saveCardDetails) {
        ag$a(saveCardDetails);
        toString(saveCardDetails, this.toString);
    }

    public void setCurveBg(SaveCardDetails saveCardDetails) {
        toString(saveCardDetails, true);
    }

    private void ag$a(SaveCardDetails saveCardDetails) {
        createPopup.toString(getContext(), saveCardDetails.getCardLogo(), this.cardTypeImg, R.color.res_0x7f0605ac, R.drawable.generic_icon);
    }

    public void setCardDetails(SaveCardDetails saveCardDetails, boolean z) {
        ag$a(saveCardDetails);
        toString(saveCardDetails, z);
        values(saveCardDetails);
        toString(saveCardDetails);
        ah$a(saveCardDetails);
    }

    public void setExpandType(boolean z) {
        this.toString = z;
        values(z);
        int dimension = (int) this.ag$a.getResources().getDimension(R.dimen.res_0x7f070359);
        if (z) {
            return;
        }
        this.mainRel.setTranslationY(dimension);
    }

    public void setPadding(int i, int i2) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = i;
        layoutParams.leftMargin = i;
        this.nameRel.setLayoutParams(layoutParams);
        this.otherInfo.setPadding(i2, i, 0, i);
        this.cardNumber.setPadding(0, 10, 0, i2);
        this.otherInfo.invalidate();
    }

    public void setTopPosPadding() {
        this.mainRel.setTranslationY((int) this.ag$a.getResources().getDimension(R.dimen.margin_10dp));
    }

    private void values(boolean z) {
        this.otherInfo.setVisibility(z ? 0 : 8);
    }

    public void setCvvValue(String str) {
        this.cvvValue.setText(str);
    }
}
