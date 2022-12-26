package com.app.dream11.privacy.blockuser;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import o.getTargetTypes;
import o.isAfterLast;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class BlockedUsersFlowState extends FlowState {
    public static final valueOf Companion;
    private static final String SOURCE;
    private static int ah$a = 0;
    private static int valueOf = 0;
    private static int values = 1;

    public BlockedUsersFlowState() {
        this(null, 1, null);
    }

    static void values() {
        ah$a = 147;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockedUsersFlowState(String str) {
        super(FlowStates.BLOCKED_USERS, null, 2, null);
        runAnimators.ag$a(str, valueOf(1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) + 256, false, 6 - Color.alpha(0), new char[]{65528, 6, 2, '\b', 5, 65526}).intern());
        putExtra(SOURCE, str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ BlockedUsersFlowState(java.lang.String r1, int r2, o.getTargetTypes r3) {
        /*
            r0 = this;
            r2 = r2 & 1
            r3 = 14
            if (r2 == 0) goto L9
            r2 = 14
            goto Lb
        L9:
            r2 = 86
        Lb:
            if (r2 == r3) goto Le
            goto L24
        Le:
            int r1 = com.app.dream11.privacy.blockuser.BlockedUsersFlowState.values
            int r1 = r1 + 79
            int r2 = r1 % 128
            com.app.dream11.privacy.blockuser.BlockedUsersFlowState.valueOf = r2
            int r1 = r1 % 2
            int r1 = com.app.dream11.privacy.blockuser.BlockedUsersFlowState.values
            int r1 = r1 + 87
            int r2 = r1 % 128
            com.app.dream11.privacy.blockuser.BlockedUsersFlowState.valueOf = r2
            int r1 = r1 % 2
            java.lang.String r1 = ""
        L24:
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.privacy.blockuser.BlockedUsersFlowState.<init>(java.lang.String, int, o.getTargetTypes):void");
    }

    public final String getSource() {
        String string;
        int i = valueOf + 7;
        values = i % 128;
        if (i % 2 == 0) {
            string = getString(SOURCE, "");
            Object obj = null;
            super.hashCode();
        } else {
            string = getString(SOURCE, "");
        }
        int i2 = valueOf + 109;
        values = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    /* loaded from: classes3.dex */
    public static final class valueOf {
        public /* synthetic */ valueOf(getTargetTypes gettargettypes) {
            this();
        }

        private valueOf() {
        }
    }

    static {
        values();
        Companion = new valueOf(null);
        SOURCE = valueOf(1 - (ViewConfiguration.getLongPressTimeout() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 257, false, View.getDefaultSize(0, 0) + 6, new char[]{65528, 6, 2, '\b', 5, 65526}).intern();
        int i = valueOf + 9;
        values = i % 128;
        int i2 = i % 2;
    }

    private static String valueOf(int i, int i2, boolean z, int i3, char[] cArr) {
        String str;
        synchronized (isAfterLast.valueOf) {
            char[] cArr2 = new char[i3];
            isAfterLast.values = 0;
            while (isAfterLast.values < i3) {
                isAfterLast.ag$a = cArr[isAfterLast.values];
                cArr2[isAfterLast.values] = (char) (isAfterLast.ag$a + i2);
                int i4 = isAfterLast.values;
                cArr2[i4] = (char) (cArr2[i4] - ah$a);
                isAfterLast.values++;
            }
            if (i > 0) {
                isAfterLast.toString = i;
                char[] cArr3 = new char[i3];
                System.arraycopy(cArr2, 0, cArr3, 0, i3);
                System.arraycopy(cArr3, 0, cArr2, i3 - isAfterLast.toString, isAfterLast.toString);
                System.arraycopy(cArr3, isAfterLast.toString, cArr2, 0, i3 - isAfterLast.toString);
            }
            if (z) {
                char[] cArr4 = new char[i3];
                isAfterLast.values = 0;
                while (isAfterLast.values < i3) {
                    cArr4[isAfterLast.values] = cArr2[(i3 - isAfterLast.values) - 1];
                    isAfterLast.values++;
                }
                cArr2 = cArr4;
            }
            str = new String(cArr2);
        }
        return str;
    }
}
