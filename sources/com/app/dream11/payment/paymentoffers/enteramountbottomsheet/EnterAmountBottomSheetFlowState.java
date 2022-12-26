package com.app.dream11.payment.paymentoffers.enteramountbottomsheet;

import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import java.io.Serializable;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class EnterAmountBottomSheetFlowState extends FlowState {
    public static final EnterAmountBottomSheetFlowState$ah$a Companion = new EnterAmountBottomSheetFlowState$ah$a(null);
    public static final String KEY_AMOUNT = "keyAmount";
    public static final String KEY_TOTAL_BALANCE = "key_total_balance";

    public EnterAmountBottomSheetFlowState(double d, double d2) {
        super(FlowStates.OFFERS_DETAILS_BOTTOMSHEET, null, 2, null);
        putExtra(KEY_AMOUNT, Double.valueOf(d));
        putExtra(KEY_TOTAL_BALANCE, Double.valueOf(d2));
    }

    public final double getAmountData() {
        Serializable extra = getExtra(KEY_AMOUNT);
        Objects.requireNonNull(extra, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) extra).doubleValue();
    }

    public final double getTotalBalanceData() {
        Serializable extra = getExtra(KEY_TOTAL_BALANCE);
        Objects.requireNonNull(extra, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) extra).doubleValue();
    }
}
