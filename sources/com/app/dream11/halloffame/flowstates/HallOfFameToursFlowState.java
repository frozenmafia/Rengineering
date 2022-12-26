package com.app.dream11.halloffame.flowstates;

import android.view.ViewConfiguration;
import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import java.util.ArrayList;
import o.getDouble;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class HallOfFameToursFlowState extends FlowState {
    public static final valueOf Companion;
    public static final String SELECTED_TOURS = "selected_tours";
    private static int ag$a = 1;
    private static int[] toString;
    private static int valueOf;
    private final ArrayList<Integer> selectedTours;

    static {
        try {
            ag$a();
            Companion = new valueOf(null);
            int i = valueOf + 85;
            ag$a = i % 128;
            int i2 = i % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    static void ag$a() {
        toString = new int[]{-1577241121, 2029651328, 1433019257, -2102009187, -1487470817, 2090430278, 624983617, -1964866494, 321092682, -2016164216, -1571776780, -1371582975, 740435461, -458055195, 1949463727, 675435033, 580804742, -1983447988};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ HallOfFameToursFlowState(java.util.ArrayList r4, java.lang.String r5, java.lang.String r6, int r7, o.getTargetTypes r8) {
        /*
            r3 = this;
            r8 = r7 & 1
            r0 = 0
            r1 = 1
            if (r8 == 0) goto L8
            r8 = 0
            goto L9
        L8:
            r8 = 1
        L9:
            r2 = 0
            if (r8 == r1) goto L17
            int r4 = com.app.dream11.halloffame.flowstates.HallOfFameToursFlowState.ag$a
            int r4 = r4 + 73
            int r8 = r4 % 128
            com.app.dream11.halloffame.flowstates.HallOfFameToursFlowState.valueOf = r8
            int r4 = r4 % 2
            r4 = r2
        L17:
            r7 = r7 & 4
            if (r7 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 1
        L1d:
            if (r0 == r1) goto L38
            int r6 = com.app.dream11.halloffame.flowstates.HallOfFameToursFlowState.valueOf     // Catch: java.lang.Exception -> L36
            int r6 = r6 + 83
            int r7 = r6 % 128
            com.app.dream11.halloffame.flowstates.HallOfFameToursFlowState.ag$a = r7     // Catch: java.lang.Exception -> L34
            int r6 = r6 % 2
            if (r6 != 0) goto L31
            super.hashCode()     // Catch: java.lang.Throwable -> L2f
            goto L31
        L2f:
            r4 = move-exception
            throw r4
        L31:
            java.lang.String r6 = ""
            goto L38
        L34:
            r4 = move-exception
            throw r4
        L36:
            r4 = move-exception
            throw r4
        L38:
            r3.<init>(r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.halloffame.flowstates.HallOfFameToursFlowState.<init>(java.util.ArrayList, java.lang.String, java.lang.String, int, o.getTargetTypes):void");
    }

    public final ArrayList<Integer> getSelectedTours() {
        int i = valueOf + 59;
        ag$a = i % 128;
        int i2 = i % 2;
        ArrayList<Integer> arrayList = this.selectedTours;
        int i3 = ag$a + 65;
        valueOf = i3 % 128;
        if (!(i3 % 2 == 0)) {
            Object obj = null;
            super.hashCode();
            return arrayList;
        }
        return arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HallOfFameToursFlowState(ArrayList<Integer> arrayList, String str, String str2) {
        super(FlowStates.HALL_OF_FAME_TOURS, null, str);
        runAnimators.ag$a(str, "slug");
        runAnimators.ag$a(str2, toString(new int[]{-1963428860, 345447694, -267702050, 971374293}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 5).intern());
        this.selectedTours = arrayList;
        if (arrayList == null) {
            int i = ag$a + 47;
            valueOf = i % 128;
            int i2 = i % 2;
        } else {
            putExtra(SELECTED_TOURS, getSelectedTours());
            int i3 = ag$a + 117;
            valueOf = i3 % 128;
            int i4 = i3 % 2;
        }
        putExtra(toString(new int[]{-1963428860, 345447694, -267702050, 971374293}, (ViewConfiguration.getScrollBarSize() >> 8) + 6).intern(), str2);
    }

    /* loaded from: classes3.dex */
    public static final class valueOf {
        public /* synthetic */ valueOf(getTargetTypes gettargettypes) {
            this();
        }

        private valueOf() {
        }
    }

    private static String toString(int[] iArr, int i) {
        String str;
        synchronized (getDouble.ag$a) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) toString.clone();
            getDouble.toString = 0;
            while (getDouble.toString < iArr.length) {
                cArr[0] = (char) (iArr[getDouble.toString] >> 16);
                cArr[1] = (char) iArr[getDouble.toString];
                cArr[2] = (char) (iArr[getDouble.toString + 1] >> 16);
                cArr[3] = (char) iArr[getDouble.toString + 1];
                getDouble.valueOf = (cArr[0] << 16) + cArr[1];
                getDouble.values = (cArr[2] << 16) + cArr[3];
                getDouble.values(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = getDouble.valueOf ^ iArr2[i2];
                    getDouble.valueOf = i3;
                    getDouble.values = getDouble.toString(i3) ^ getDouble.values;
                    int i4 = getDouble.valueOf;
                    getDouble.valueOf = getDouble.values;
                    getDouble.values = i4;
                }
                int i5 = getDouble.valueOf;
                getDouble.valueOf = getDouble.values;
                getDouble.values = i5;
                getDouble.values = i5 ^ iArr2[16];
                getDouble.valueOf ^= iArr2[17];
                int i6 = getDouble.valueOf;
                int i7 = getDouble.values;
                cArr[0] = (char) (getDouble.valueOf >>> 16);
                cArr[1] = (char) getDouble.valueOf;
                cArr[2] = (char) (getDouble.values >>> 16);
                cArr[3] = (char) getDouble.values;
                getDouble.values(iArr2);
                cArr2[getDouble.toString << 1] = cArr[0];
                cArr2[(getDouble.toString << 1) + 1] = cArr[1];
                cArr2[(getDouble.toString << 1) + 2] = cArr[2];
                cArr2[(getDouble.toString << 1) + 3] = cArr[3];
                getDouble.toString += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
