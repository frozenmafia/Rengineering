package com.app.dream11.payment.amountSelection;

import java.io.Serializable;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class PaymentTxnData implements Serializable {
    private final Integer depositOfferId;

    public PaymentTxnData() {
        this(null, 1, null);
    }

    public static /* synthetic */ PaymentTxnData copy$default(PaymentTxnData paymentTxnData, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = paymentTxnData.depositOfferId;
        }
        return paymentTxnData.copy(num);
    }

    public final Integer component1() {
        return this.depositOfferId;
    }

    public final PaymentTxnData copy(Integer num) {
        return new PaymentTxnData(num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaymentTxnData) && runAnimators.values(this.depositOfferId, ((PaymentTxnData) obj).depositOfferId);
    }

    public int hashCode() {
        Integer num = this.depositOfferId;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        Integer num = this.depositOfferId;
        return "PaymentTxnData(depositOfferId=" + num + ")";
    }

    public PaymentTxnData(Integer num) {
        this.depositOfferId = num;
    }

    public /* synthetic */ PaymentTxnData(Integer num, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? null : num);
    }

    public final Integer getDepositOfferId() {
        return this.depositOfferId;
    }
}
