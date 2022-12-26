package o;

import com.dreampay.commons.wallets.Wallet;
/* loaded from: classes4.dex */
public final class readDouble {

    /* loaded from: classes4.dex */
    public final /* synthetic */ class values {
        public static final /* synthetic */ int[] ag$a;

        static {
            int[] iArr = new int[Wallet.values().length];
            iArr[Wallet.AMAZONPAY.ordinal()] = 1;
            iArr[Wallet.PAYTM.ordinal()] = 2;
            iArr[Wallet.MOBIKWIK.ordinal()] = 3;
            iArr[Wallet.PHONEPE.ordinal()] = 4;
            ag$a = iArr;
        }
    }

    public static final com.dreampay.graphql.type.Wallet valueOf(Wallet wallet) {
        runAnimators.ag$a(wallet, "<this>");
        int i = values.ag$a[wallet.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return com.dreampay.graphql.type.Wallet.PHONEPE_WALLET;
                    }
                    return com.dreampay.graphql.type.Wallet.UNKNOWN__;
                }
                return com.dreampay.graphql.type.Wallet.MOBIKWIK;
            }
            return com.dreampay.graphql.type.Wallet.PAYTM;
        }
        return com.dreampay.graphql.type.Wallet.AMAZONPAY;
    }
}
