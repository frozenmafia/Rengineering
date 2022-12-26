package com.dreampay.wallets;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.move;
/* loaded from: classes4.dex */
final class WalletActivity$walletBalance$2 extends Lambda implements Styleable.ArcMotion<Double> {
    private static int ag$a = 0;
    private static long ah$a = 946976963126427019L;
    private static int valueOf = 1;
    private static char[] values = {47563, 17494, 17094, 16753, 20469, 19071, 18593, 22291, 21893, 20531, 24243, 23851, 23387, 22998};
    final /* synthetic */ WalletActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletActivity$walletBalance$2(WalletActivity walletActivity) {
        super(0);
        this.this$0 = walletActivity;
    }

    @Override // o.Styleable.ArcMotion
    public /* synthetic */ Double invoke() {
        int i = ag$a + 99;
        valueOf = i % 128;
        if ((i % 2 == 0 ? 'O' : '\'') != 'O') {
            return invoke();
        }
        Double invoke = invoke();
        Object obj = null;
        super.hashCode();
        return invoke;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
        if ((r0 == null ? 'a' : '#') != '#') goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
        if (r0 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
        r2 = java.lang.Double.valueOf(r0.getDouble(values(14 - android.text.TextUtils.indexOf("", "", 0, 0), android.graphics.Color.alpha(0), (char) (47548 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).intern()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
        r0 = com.dreampay.wallets.WalletActivity$walletBalance$2.valueOf + 35;
        com.dreampay.wallets.WalletActivity$walletBalance$2.ag$a = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
        return r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // o.Styleable.ArcMotion
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Double invoke() {
        /*
            r7 = this;
            int r0 = com.dreampay.wallets.WalletActivity$walletBalance$2.valueOf
            int r0 = r0 + 119
            int r1 = r0 % 128
            com.dreampay.wallets.WalletActivity$walletBalance$2.ag$a = r1
            int r0 = r0 % 2
            r1 = 70
            if (r0 == 0) goto L11
            r0 = 70
            goto L13
        L11:
            r0 = 20
        L13:
            r2 = 0
            r3 = 35
            if (r0 == r1) goto L2c
            com.dreampay.wallets.WalletActivity r0 = r7.this$0
            android.content.Intent r0 = r0.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            if (r0 != 0) goto L27
            r1 = 97
            goto L29
        L27:
            r1 = 35
        L29:
            if (r1 == r3) goto L3a
            goto L63
        L2c:
            com.dreampay.wallets.WalletActivity r0 = r7.this$0
            android.content.Intent r0 = r0.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            int r1 = r2.length     // Catch: java.lang.Throwable -> L6d
            if (r0 != 0) goto L3a
            goto L63
        L3a:
            java.lang.String r1 = ""
            r2 = 0
            int r1 = android.text.TextUtils.indexOf(r1, r1, r2, r2)
            int r1 = 14 - r1
            int r2 = android.graphics.Color.alpha(r2)
            r4 = 47548(0xb9bc, float:6.6629E-41)
            float r5 = android.media.AudioTrack.getMinVolume()
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            int r4 = r4 - r5
            char r4 = (char) r4
            java.lang.String r1 = values(r1, r2, r4)
            java.lang.String r1 = r1.intern()
            double r0 = r0.getDouble(r1)
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
        L63:
            int r0 = com.dreampay.wallets.WalletActivity$walletBalance$2.valueOf
            int r0 = r0 + r3
            int r1 = r0 % 128
            com.dreampay.wallets.WalletActivity$walletBalance$2.ag$a = r1
            int r0 = r0 % 2
            return r2
        L6d:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dreampay.wallets.WalletActivity$walletBalance$2.invoke():java.lang.Double");
    }

    private static String values(int i, int i2, char c) {
        String str;
        synchronized (move.valueOf) {
            char[] cArr = new char[i];
            move.values = 0;
            while (move.values < i) {
                cArr[move.values] = (char) ((values[move.values + i2] ^ (move.values * ah$a)) ^ c);
                move.values++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
