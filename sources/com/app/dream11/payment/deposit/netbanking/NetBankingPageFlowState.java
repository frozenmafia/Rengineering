package com.app.dream11.payment.deposit.netbanking;

import com.app.dream11.model.FlowState;
import com.app.dream11.payment.EventMeta;
import com.app.dream11.payment.amountSelection.PaymentTxnData;
import com.app.dream11.utils.FlowStates;
import o.growSize;
/* loaded from: classes3.dex */
public final class NetBankingPageFlowState extends FlowState {
    private final double amount;
    private final EventMeta meta;
    private final PaymentTxnData txnData;

    public final double getAmount() {
        return this.amount;
    }

    public final PaymentTxnData getTxnData() {
        return this.txnData;
    }

    public final EventMeta getMeta() {
        return this.meta;
    }

    public NetBankingPageFlowState(double d, PaymentTxnData paymentTxnData, EventMeta eventMeta) {
        super(FlowStates.NETBANKINGPAGE, null, 2, null);
        this.amount = d;
        this.txnData = paymentTxnData;
        this.meta = eventMeta;
        putExtra(growSize.ag$a, Double.valueOf(d));
        putExtra("event_meta", eventMeta);
        if (paymentTxnData == null) {
            return;
        }
        putExtra(growSize.ah$a, paymentTxnData);
    }
}
