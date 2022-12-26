package com.app.dream11.verificationnew.common.flowstates;

import android.view.Gravity;
import android.view.View;
import android.widget.ExpandableListView;
import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import o.getTargetTypes;
import o.isLast;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class VerificationPanFlowState extends FlowState {
    public static final valueOf Companion;
    private static int HaptikSDK$a = 1;
    private static final String SOURCE = "source";
    private static boolean ag$a;
    private static int ah$a;
    private static int toString;
    private static char[] valueOf;
    private static boolean values;

    static {
        ah$a();
        Companion = new valueOf(null);
        int i = ah$a + 111;
        HaptikSDK$a = i % 128;
        int i2 = i % 2;
    }

    static void ah$a() {
        values = true;
        ag$a = true;
        toString = 126;
        valueOf = new char[]{241, 237, 243, 240, 225, 227};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationPanFlowState(String str) {
        super(FlowStates.VERIFICATION_PAN, null, 2, null);
        runAnimators.ag$a(str, values(null, null, 126 - ExpandableListView.getPackedPositionChild(0L), new byte[]{-122, -123, -124, -125, -126, -127}).intern());
        putExtra(values(null, null, 127 - View.resolveSize(0, 0), new byte[]{-122, -123, -124, -125, -126, -127}).intern(), str);
    }

    public final String getSource() {
        int i = ah$a + 115;
        HaptikSDK$a = i % 128;
        String string = getString(((i % 2 == 0 ? 'W' : '`') != 'W' ? values(null, null, Gravity.getAbsoluteGravity(0, 0) + 127, new byte[]{-122, -123, -124, -125, -126, -127}) : values(null, null, 83 >>> Gravity.getAbsoluteGravity(1, 0), new byte[]{-122, -123, -124, -125, -126, -127})).intern());
        int i2 = HaptikSDK$a + 119;
        ah$a = i2 % 128;
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

    private static String values(char[] cArr, int[] iArr, int i, byte[] bArr) {
        synchronized (isLast.valueOf) {
            char[] cArr2 = valueOf;
            int i2 = toString;
            if (ag$a) {
                int length = bArr.length;
                isLast.values = length;
                char[] cArr3 = new char[length];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr3[isLast.toString] = (char) (cArr2[bArr[(isLast.values - 1) - isLast.toString] + i] - i2);
                    isLast.toString++;
                }
                return new String(cArr3);
            } else if (values) {
                int length2 = cArr.length;
                isLast.values = length2;
                char[] cArr4 = new char[length2];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr4[isLast.toString] = (char) (cArr2[cArr[(isLast.values - 1) - isLast.toString] - i] - i2);
                    isLast.toString++;
                }
                return new String(cArr4);
            } else {
                int length3 = iArr.length;
                isLast.values = length3;
                char[] cArr5 = new char[length3];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr5[isLast.toString] = (char) (cArr2[iArr[(isLast.values - 1) - isLast.toString] - i] - i2);
                    isLast.toString++;
                }
                return new String(cArr5);
            }
        }
    }
}
