package com.dreampay.ui.wallets;

import com.dreampay.commons.wallets.Wallet;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.isClosed;
import org.apache.http.message.TokenParser;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class WalletCredentialInputFragment$walletName$2 extends Lambda implements Styleable.ArcMotion<String> {
    private static char[] ag$a = {'v', 245, 266, 275, 269, TokenParser.SP, 'W', 'g', 'm', 't', 'n', '_', 'X', 'm'};
    private static int ah$a = 1;
    private static int toString;
    final /* synthetic */ WalletCredentialInputFragment this$0;

    /* loaded from: classes4.dex */
    public final /* synthetic */ class toString {
        public static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[Wallet.values().length];
            iArr[Wallet.AMAZONPAY.ordinal()] = 1;
            iArr[Wallet.PAYTM.ordinal()] = 2;
            iArr[Wallet.MOBIKWIK.ordinal()] = 3;
            iArr[Wallet.PHONEPE.ordinal()] = 4;
            values = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletCredentialInputFragment$walletName$2(WalletCredentialInputFragment walletCredentialInputFragment) {
        super(0);
        try {
            this.this$0 = walletCredentialInputFragment;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ String invoke() {
        int i = toString + 101;
        ah$a = i % 128;
        int i2 = i % 2;
        String invoke2 = invoke2();
        int i3 = toString + 69;
        ah$a = i3 % 128;
        if (!(i3 % 2 == 0)) {
            return invoke2;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return invoke2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (r0 != 2) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
        if ((r0 != 3 ? '=' : org.apache.http.message.TokenParser.CR) != '=') goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
        return "MobiKwik";
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
        if (r0 != 4) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
        r0 = com.dreampay.ui.wallets.WalletCredentialInputFragment$walletName$2.toString + 23;
        com.dreampay.ui.wallets.WalletCredentialInputFragment$walletName$2.ah$a = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
        return com.phonepe.intent.sdk.api.PhonePe.TAG;
     */
    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String invoke2() {
        /*
            r5 = this;
            com.dreampay.ui.wallets.WalletCredentialInputFragment r0 = r5.this$0
            com.dreampay.commons.wallets.Wallet r0 = com.dreampay.ui.wallets.WalletCredentialInputFragment.ag$a(r0)
            int[] r1 = com.dreampay.ui.wallets.WalletCredentialInputFragment$walletName$2.toString.values
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 4
            r3 = 0
            if (r0 == r1) goto L5e
            r4 = 2
            if (r0 == r4) goto L17
            r1 = 0
        L17:
            if (r1 == 0) goto L2d
            int[] r0 = new int[r2]
            r0 = {x0074: FILL_ARRAY_DATA  , data: [0, 5, 157, 0} // fill-array
            r1 = 5
            byte[] r1 = new byte[r1]
            r1 = {x0080: FILL_ARRAY_DATA  , data: [1, 1, 0, 1, 1} // fill-array
            java.lang.String r0 = valueOf(r3, r0, r1)
            java.lang.String r0 = r0.intern()
            goto L72
        L2d:
            int r1 = com.dreampay.ui.wallets.WalletCredentialInputFragment$walletName$2.toString
            int r1 = r1 + 81
            int r3 = r1 % 128
            com.dreampay.ui.wallets.WalletCredentialInputFragment$walletName$2.ah$a = r3
            int r1 = r1 % r4
            if (r1 != 0) goto L3b
            if (r0 == r4) goto L47
            goto L4a
        L3b:
            r1 = 3
            r3 = 61
            if (r0 == r1) goto L43
            r1 = 61
            goto L45
        L43:
            r1 = 13
        L45:
            if (r1 == r3) goto L4a
        L47:
            java.lang.String r0 = "MobiKwik"
            goto L72
        L4a:
            if (r0 != r2) goto L58
            int r0 = com.dreampay.ui.wallets.WalletCredentialInputFragment$walletName$2.toString
            int r0 = r0 + 23
            int r1 = r0 % 128
            com.dreampay.ui.wallets.WalletCredentialInputFragment$walletName$2.ah$a = r1
            int r0 = r0 % r4
            java.lang.String r0 = "PhonePe"
            goto L72
        L58:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L5e:
            int[] r0 = new int[r2]
            r0 = {x0088: FILL_ARRAY_DATA  , data: [5, 9, 0, 9} // fill-array
            r1 = 9
            byte[] r1 = new byte[r1]
            r1 = {x0094: FILL_ARRAY_DATA  , data: [1, 0, 0, 1, 1, 1, 0, 1, 0} // fill-array
            java.lang.String r0 = valueOf(r3, r0, r1)
            java.lang.String r0 = r0.intern()
        L72:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dreampay.ui.wallets.WalletCredentialInputFragment$walletName$2.invoke2():java.lang.String");
    }

    private static String valueOf(boolean z, int[] iArr, byte[] bArr) {
        String str;
        synchronized (isClosed.ah$a) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(ag$a, i, cArr, 0, i2);
            if (bArr != null) {
                char[] cArr2 = new char[i2];
                isClosed.ag$a = 0;
                char c = 0;
                while (isClosed.ag$a < i2) {
                    if (bArr[isClosed.ag$a] == 1) {
                        cArr2[isClosed.ag$a] = (char) (((cArr[isClosed.ag$a] << 1) + 1) - c);
                    } else {
                        cArr2[isClosed.ag$a] = (char) ((cArr[isClosed.ag$a] << 1) - c);
                    }
                    c = cArr2[isClosed.ag$a];
                    isClosed.ag$a++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i5, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                isClosed.ag$a = 0;
                while (isClosed.ag$a < i2) {
                    cArr4[isClosed.ag$a] = cArr[(i2 - isClosed.ag$a) - 1];
                    isClosed.ag$a++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                isClosed.ag$a = 0;
                while (isClosed.ag$a < i2) {
                    cArr[isClosed.ag$a] = (char) (cArr[isClosed.ag$a] - iArr[2]);
                    isClosed.ag$a++;
                }
            }
            str = new String(cArr);
        }
        return str;
    }
}
