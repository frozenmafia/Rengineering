package com.app.dream11.social.profilerecommendation.allrecommendedfriends;

import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import o.getTargetTypes;
import o.isClosed;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class AllRecommendedFriendFlowState extends FlowState {
    public static final values Companion;
    private static final String SOURCE;
    private static int ag$a = 0;
    private static char[] toString = null;
    private static int values = 1;

    public AllRecommendedFriendFlowState() {
        this(null, 1, null);
    }

    static void ag$a() {
        toString = new char[]{'V', 172, 178, 187, 186, 185};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllRecommendedFriendFlowState(String str) {
        super(FlowStates.ALL_RECOMMENDED_FRIEND, null, 2, null);
        runAnimators.ag$a(str, toString(true, new int[]{0, 6, 72, 0}, new byte[]{1, 0, 1, 1, 0, 0}).intern());
        putExtra(SOURCE, str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ AllRecommendedFriendFlowState(java.lang.String r1, int r2, o.getTargetTypes r3) {
        /*
            r0 = this;
            r3 = 1
            r2 = r2 & r3
            if (r2 == 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            if (r2 == r3) goto La
            goto L32
        La:
            int r1 = com.app.dream11.social.profilerecommendation.allrecommendedfriends.AllRecommendedFriendFlowState.ag$a
            int r1 = r1 + 123
            int r2 = r1 % 128
            com.app.dream11.social.profilerecommendation.allrecommendedfriends.AllRecommendedFriendFlowState.values = r2
            int r1 = r1 % 2
            r2 = 86
            if (r1 != 0) goto L1b
            r1 = 93
            goto L1d
        L1b:
            r1 = 86
        L1d:
            if (r1 == r2) goto L26
            r1 = 0
            super.hashCode()     // Catch: java.lang.Throwable -> L24
            goto L26
        L24:
            r1 = move-exception
            throw r1
        L26:
            int r1 = com.app.dream11.social.profilerecommendation.allrecommendedfriends.AllRecommendedFriendFlowState.values
            int r1 = r1 + 111
            int r2 = r1 % 128
            com.app.dream11.social.profilerecommendation.allrecommendedfriends.AllRecommendedFriendFlowState.ag$a = r2
            int r1 = r1 % 2
            java.lang.String r1 = ""
        L32:
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.social.profilerecommendation.allrecommendedfriends.AllRecommendedFriendFlowState.<init>(java.lang.String, int, o.getTargetTypes):void");
    }

    public final String getSource() {
        int i = ag$a + 5;
        values = i % 128;
        if ((i % 2 == 0 ? '0' : (char) 19) != 19) {
            int i2 = 95 / 0;
            return getString(SOURCE, "");
        }
        return getString(SOURCE, "");
    }

    /* loaded from: classes3.dex */
    public static final class values {
        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }

        private values() {
        }
    }

    static {
        ag$a();
        Companion = new values(null);
        SOURCE = toString(true, new int[]{0, 6, 72, 0}, new byte[]{1, 0, 1, 1, 0, 0}).intern();
        int i = values + 89;
        ag$a = i % 128;
        int i2 = i % 2;
    }

    private static String toString(boolean z, int[] iArr, byte[] bArr) {
        String str;
        synchronized (isClosed.ah$a) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(toString, i, cArr, 0, i2);
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
