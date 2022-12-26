package o;

import com.app.dream11.model.FlowState;
import com.app.dream11.payment.amountSelection.PaymentTxnData;
import com.app.dream11.payment.amountSelection.offers.MatchDetails;
/* loaded from: classes3.dex */
public final class toByteArrayList {
    public static final toByteArrayList$ah$a values = new toByteArrayList$ah$a(null);

    public static final FlowState toString(String str, int i, String str2, int i2, int i3, String str3, String str4, int i4, int i5, String str5, String str6) {
        return values.values(str, i, str2, i2, i3, str3, str4, i4, i5, str5, str6);
    }

    public static final FlowState valueOf(double d, PaymentTxnData paymentTxnData, MatchDetails matchDetails, double d2, String str) {
        return values.valueOf(d, paymentTxnData, matchDetails, d2, str);
    }

    public static final FlowState values(String str, PaymentTxnData paymentTxnData) {
        return values.ag$a(str, paymentTxnData);
    }
}
