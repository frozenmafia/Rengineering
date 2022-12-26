package com.app.dream11.payment.deposit.listingpage;

import com.app.dream11.model.FlowState;
import com.app.dream11.payment.amountSelection.PaymentTxnData;
import com.app.dream11.utils.FlowStates;
import o.growSize;
/* loaded from: classes3.dex */
public final class DepositListingPageFlowState extends FlowState {
    private final double amount;
    private final PaymentTxnData txnData;

    public final double getAmount() {
        return this.amount;
    }

    public final PaymentTxnData getTxnData() {
        return this.txnData;
    }

    public DepositListingPageFlowState(double d, PaymentTxnData paymentTxnData) {
        super(FlowStates.PAYMENTOPTIONS, null, 2, null);
        this.amount = d;
        this.txnData = paymentTxnData;
        putExtra(growSize.ag$a, Double.valueOf(d));
        if (paymentTxnData == null) {
            return;
        }
        putExtra(growSize.ah$a, paymentTxnData);
    }
}
