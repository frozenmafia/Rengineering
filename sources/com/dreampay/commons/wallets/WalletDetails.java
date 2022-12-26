package com.dreampay.commons.wallets;

import android.os.SystemClock;
import android.view.ViewConfiguration;
import o.moveToFirst;
import o.runAnimators;
import org.apache.http.message.TokenParser;
/* loaded from: classes4.dex */
public final class WalletDetails implements PayInstrumentItemDetails {
    private static int HaptikSDK$c = 1;
    private static char ag$a = 1915;
    private static int ah$a = 0;
    private static char toString = 44581;
    private static char valueOf = 58162;
    private static char values = 23710;
    private final Double balance;
    private final String displayMessage;
    private final boolean isLinked;
    private final boolean transactionPossible;
    private final Wallet wallet;

    public static /* synthetic */ WalletDetails copy$default(WalletDetails walletDetails, Wallet wallet, boolean z, Double d, String str, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            int i2 = HaptikSDK$c + 79;
            ah$a = i2 % 128;
            if (!(i2 % 2 == 0)) {
                wallet = walletDetails.wallet;
                int i3 = 21 / 0;
            } else {
                wallet = walletDetails.wallet;
            }
        }
        if (!((i & 2) == 0)) {
            int i4 = HaptikSDK$c + 71;
            ah$a = i4 % 128;
            int i5 = i4 % 2;
            z = walletDetails.isLinked;
        }
        boolean z3 = z;
        if (((i & 4) != 0 ? TokenParser.SP : '=') != '=') {
            d = walletDetails.balance;
        }
        Double d2 = d;
        if (!((i & 8) == 0)) {
            str = walletDetails.displayMessage;
        }
        String str2 = str;
        if (((i & 16) != 0 ? '4' : '>') == '4') {
            z2 = walletDetails.transactionPossible;
        }
        return walletDetails.copy(wallet, z3, d2, str2, z2);
    }

    public final Wallet component1() {
        int i = ah$a + 91;
        HaptikSDK$c = i % 128;
        if ((i % 2 == 0 ? (char) 5 : 'a') != 'a') {
            int i2 = 12 / 0;
            return this.wallet;
        }
        try {
            return this.wallet;
        } catch (Exception e) {
            throw e;
        }
    }

    public final boolean component2() {
        int i = ah$a + 21;
        HaptikSDK$c = i % 128;
        if (!(i % 2 != 0)) {
            try {
                int i2 = 11 / 0;
                return this.isLinked;
            } catch (Exception e) {
                throw e;
            }
        }
        return this.isLinked;
    }

    public final Double component3() {
        int i = HaptikSDK$c + 63;
        ah$a = i % 128;
        if (i % 2 == 0) {
            return this.balance;
        }
        Double d = this.balance;
        Object[] objArr = null;
        int length = objArr.length;
        return d;
    }

    public final String component4() {
        String str;
        int i = ah$a + 113;
        HaptikSDK$c = i % 128;
        if ((i % 2 == 0 ? '\"' : 'c') != '\"') {
            try {
                str = this.displayMessage;
            } catch (Exception e) {
                throw e;
            }
        } else {
            str = this.displayMessage;
            int i2 = 32 / 0;
        }
        int i3 = ah$a + 35;
        HaptikSDK$c = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public final boolean component5() {
        int i = HaptikSDK$c + 21;
        ah$a = i % 128;
        if ((i % 2 != 0 ? '5' : '_') != '_') {
            int i2 = 15 / 0;
            return this.transactionPossible;
        }
        return this.transactionPossible;
    }

    public final WalletDetails copy(Wallet wallet, boolean z, Double d, String str, boolean z2) {
        runAnimators.ag$a(wallet, toString(new char[]{4397, 6189, 35900, 63437, 11388, 44190}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 5).intern());
        WalletDetails walletDetails = new WalletDetails(wallet, z, d, str, z2);
        int i = HaptikSDK$c + 91;
        ah$a = i % 128;
        int i2 = i % 2;
        return walletDetails;
    }

    public boolean equals(Object obj) {
        if ((this == obj ? 'D' : '\b') != 'D') {
            if (!(obj instanceof WalletDetails)) {
                int i = ah$a + 35;
                HaptikSDK$c = i % 128;
                int i2 = i % 2;
                int i3 = HaptikSDK$c + 83;
                ah$a = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            try {
                WalletDetails walletDetails = (WalletDetails) obj;
                if (!(this.wallet == walletDetails.wallet)) {
                    return false;
                }
                try {
                    if (this.isLinked != walletDetails.isLinked) {
                        int i5 = ah$a + 37;
                        HaptikSDK$c = i5 % 128;
                        int i6 = i5 % 2;
                        return false;
                    } else if (runAnimators.values(this.balance, walletDetails.balance)) {
                        if (!runAnimators.values((Object) this.displayMessage, (Object) walletDetails.displayMessage)) {
                            return false;
                        }
                        return !(this.transactionPossible != walletDetails.transactionPossible);
                    } else {
                        int i7 = HaptikSDK$c + 65;
                        ah$a = i7 % 128;
                        return i7 % 2 != 0;
                    }
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        return true;
    }

    @Override // com.dreampay.commons.wallets.PayInstrumentItemDetails
    public String getIconUrl() {
        try {
            int i = ah$a + 95;
            HaptikSDK$c = i % 128;
            Object[] objArr = null;
            if ((i % 2 == 0 ? 'W' : 'c') != 'c') {
                int length = objArr.length;
            }
            int i2 = ah$a + 93;
            HaptikSDK$c = i2 % 128;
            int i3 = i2 % 2;
            return null;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.dreampay.commons.wallets.PayInstrumentItemDetails
    public String getSubtitle() {
        try {
            int i = ah$a + 59;
            HaptikSDK$c = i % 128;
            int i2 = i % 2;
            int i3 = ah$a + 39;
            try {
                HaptikSDK$c = i3 % 128;
                int i4 = i3 % 2;
                return null;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i;
        int i2 = ah$a + 53;
        HaptikSDK$c = i2 % 128;
        int i3 = i2 % 2;
        try {
            int hashCode = this.wallet.hashCode();
            boolean z = this.isLinked;
            char c = z != 0 ? TokenParser.ESCAPE : TokenParser.CR;
            int i4 = z;
            if (c == '\\') {
                int i5 = ah$a + 91;
                HaptikSDK$c = i5 % 128;
                int i6 = i5 % 2;
                i4 = 1;
            }
            Double d = this.balance;
            if (d == null) {
                try {
                    int i7 = ah$a + 1;
                    HaptikSDK$c = i7 % 128;
                    int i8 = i7 % 2;
                    i = 0;
                } catch (Exception e) {
                    throw e;
                }
            } else {
                i = d.hashCode();
            }
            String str = this.displayMessage;
            int hashCode2 = str != null ? str.hashCode() : 0;
            boolean z2 = this.transactionPossible;
            return (((((((hashCode * 31) + i4) * 31) + i) * 31) + hashCode2) * 31) + (z2 ? 1 : z2 ? 1 : 0);
        } catch (Exception e2) {
            throw e2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("WalletDetails(wallet=");
            sb.append(this.wallet);
            sb.append(", isLinked=");
            sb.append(this.isLinked);
            sb.append(", balance=");
            sb.append(this.balance);
            sb.append(", displayMessage=");
            sb.append((Object) this.displayMessage);
            sb.append(", transactionPossible=");
            sb.append(this.transactionPossible);
            sb.append(')');
            String sb2 = sb.toString();
            try {
                int i = HaptikSDK$c + 97;
                ah$a = i % 128;
                if (!(i % 2 == 0)) {
                    Object obj = null;
                    super.hashCode();
                    return sb2;
                }
                return sb2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public WalletDetails(Wallet wallet, boolean z, Double d, String str, boolean z2) {
        runAnimators.ag$a(wallet, toString(new char[]{4397, 6189, 35900, 63437, 11388, 44190}, 7 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern());
        this.wallet = wallet;
        this.isLinked = z;
        this.balance = d;
        this.displayMessage = str;
        this.transactionPossible = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ WalletDetails(com.dreampay.commons.wallets.Wallet r9, boolean r10, java.lang.Double r11, java.lang.String r12, boolean r13, int r14, o.getTargetTypes r15) {
        /*
            r8 = this;
            r15 = r14 & 8
            r0 = 14
            r1 = 0
            if (r15 == 0) goto La
            r15 = 14
            goto Lb
        La:
            r15 = 0
        Lb:
            if (r15 == r0) goto Lf
        Ld:
            r6 = r12
            goto L1b
        Lf:
            r12 = 0
            int r15 = com.dreampay.commons.wallets.WalletDetails.HaptikSDK$c
            int r15 = r15 + 25
            int r0 = r15 % 128
            com.dreampay.commons.wallets.WalletDetails.ah$a = r0
            int r15 = r15 % 2
            goto Ld
        L1b:
            r12 = r14 & 16
            r14 = 1
            if (r12 == 0) goto L21
            r1 = 1
        L21:
            if (r1 == 0) goto L2f
            int r12 = com.dreampay.commons.wallets.WalletDetails.ah$a
            int r12 = r12 + 83
            int r13 = r12 % 128
            com.dreampay.commons.wallets.WalletDetails.HaptikSDK$c = r13
            int r12 = r12 % 2
            r7 = 1
            goto L30
        L2f:
            r7 = r13
        L30:
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dreampay.commons.wallets.WalletDetails.<init>(com.dreampay.commons.wallets.Wallet, boolean, java.lang.Double, java.lang.String, boolean, int, o.getTargetTypes):void");
    }

    public final Wallet getWallet() {
        int i = HaptikSDK$c + 61;
        ah$a = i % 128;
        if (!(i % 2 != 0)) {
            return this.wallet;
        }
        int i2 = 91 / 0;
        return this.wallet;
    }

    public final boolean isLinked() {
        int i = HaptikSDK$c + 73;
        ah$a = i % 128;
        if (!(i % 2 == 0)) {
            try {
                boolean z = this.isLinked;
                Object obj = null;
                super.hashCode();
                return z;
            } catch (Exception e) {
                throw e;
            }
        }
        return this.isLinked;
    }

    public final Double getBalance() {
        int i = ah$a + 89;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        try {
            Double d = this.balance;
            int i3 = HaptikSDK$c + 125;
            ah$a = i3 % 128;
            int i4 = i3 % 2;
            return d;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String getDisplayMessage() {
        int i = HaptikSDK$c + 67;
        ah$a = i % 128;
        int i2 = i % 2;
        try {
            String str = this.displayMessage;
            int i3 = HaptikSDK$c + 19;
            ah$a = i3 % 128;
            if ((i3 % 2 != 0 ? '>' : (char) 21) != 21) {
                Object obj = null;
                super.hashCode();
                return str;
            }
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final boolean getTransactionPossible() {
        int i = ah$a + 89;
        HaptikSDK$c = i % 128;
        if ((i % 2 == 0 ? 'C' : 'a') != 'a') {
            int i2 = 98 / 0;
            return this.transactionPossible;
        }
        return this.transactionPossible;
    }

    @Override // com.dreampay.commons.wallets.PayInstrumentItemDetails
    public String getTitle() {
        int i = HaptikSDK$c + 125;
        ah$a = i % 128;
        int i2 = i % 2;
        String name = this.wallet.name();
        int i3 = HaptikSDK$c + 33;
        ah$a = i3 % 128;
        if ((i3 % 2 != 0 ? '_' : 'a') != '_') {
            return name;
        }
        Object obj = null;
        super.hashCode();
        return name;
    }

    @Override // com.dreampay.commons.wallets.PayInstrumentItemDetails
    public String getOtherInfo() {
        int i = ah$a + 87;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        try {
            try {
                String valueOf2 = String.valueOf(this.balance);
                int i3 = ah$a + 77;
                HaptikSDK$c = i3 % 128;
                if (!(i3 % 2 != 0)) {
                    Object obj = null;
                    super.hashCode();
                    return valueOf2;
                }
                return valueOf2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String toString(char[] cArr, int i) {
        String str;
        synchronized (moveToFirst.ah$a) {
            char[] cArr2 = new char[cArr.length];
            moveToFirst.values = 0;
            char[] cArr3 = new char[2];
            while (moveToFirst.values < cArr.length) {
                cArr3[0] = cArr[moveToFirst.values];
                cArr3[1] = cArr[moveToFirst.values + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    cArr3[1] = (char) (cArr3[1] - (((cArr3[0] + i2) ^ ((cArr3[0] << 4) + valueOf)) ^ ((cArr3[0] >>> 5) + ag$a)));
                    cArr3[0] = (char) (cArr3[0] - (((cArr3[1] + i2) ^ ((cArr3[1] << 4) + values)) ^ ((cArr3[1] >>> 5) + toString)));
                    i2 -= 40503;
                }
                cArr2[moveToFirst.values] = cArr3[0];
                cArr2[moveToFirst.values + 1] = cArr3[1];
                moveToFirst.values += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
