package com.app.dream11.social.usersearch.flowstates;

import com.app.dream11.model.FlowState;
import o.getTargetTypes;
import o.isClosed;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class UserSearchFlowState$ah$a {
    private static int ag$a = 0;
    private static int ah$a = 1;
    private static char[] toString = {'7', 'q', 'l', 'd', 'j', 's'};

    public /* synthetic */ UserSearchFlowState$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    private UserSearchFlowState$ah$a() {
    }

    public final UserSearchFlowState toString(FlowState flowState) {
        UserSearchFlowState userSearchFlowState;
        runAnimators.ag$a(flowState, "f");
        if (!(flowState instanceof UserSearchFlowState)) {
            userSearchFlowState = new UserSearchFlowState(flowState.getString(values(true, new int[]{0, 6, 0, 2}, new byte[]{1, 0, 0, 0, 1, 1}).intern()), flowState.getInt(UserSearchFlowState.FLOW_TYPE, 2));
        } else {
            int i = ah$a + 83;
            ag$a = i % 128;
            boolean z = i % 2 != 0;
            userSearchFlowState = (UserSearchFlowState) flowState;
            if (z) {
                int i2 = 81 / 0;
            }
        }
        int i3 = ag$a + 81;
        ah$a = i3 % 128;
        int i4 = i3 % 2;
        return userSearchFlowState;
    }

    private static String values(boolean z, int[] iArr, byte[] bArr) {
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
