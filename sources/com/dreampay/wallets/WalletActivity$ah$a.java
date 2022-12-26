package com.dreampay.wallets;

import com.dreampay.commons.wallets.Wallet;
import com.dreampay.wallets.models.WalletFlow;
/* loaded from: classes4.dex */
public final /* synthetic */ class WalletActivity$ah$a {
    public static final /* synthetic */ int[] ah$a;
    public static final /* synthetic */ int[] toString;

    static {
        int[] iArr = new int[Wallet.values().length];
        iArr[Wallet.AMAZONPAY.ordinal()] = 1;
        iArr[Wallet.PAYTM.ordinal()] = 2;
        iArr[Wallet.MOBIKWIK.ordinal()] = 3;
        iArr[Wallet.PHONEPE.ordinal()] = 4;
        toString = iArr;
        int[] iArr2 = new int[WalletFlow.values().length];
        iArr2[WalletFlow.LINK_ACCOUNT.ordinal()] = 1;
        iArr2[WalletFlow.CHARGE.ordinal()] = 2;
        ah$a = iArr2;
    }
}
