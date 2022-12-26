package com.app.dream11.myprofile.firstpersonprofile;

import android.view.KeyEvent;
import android.widget.ExpandableListView;
import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import o.getDouble;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class MyProfileFlowState extends FlowState {
    public static final valueOf Companion;
    private static final String SOURCE;
    private static final String USER_ID;
    private static int ag$a = 0;
    private static int[] ah$a = null;
    private static int toString = 1;

    static void ah$a() {
        ah$a = new int[]{-1135498729, 164426779, -1916930866, -389830294, 985063582, 944673288, -295272351, -1927338719, -1594240598, 1072111350, -1755276567, -1344743298, 1231788639, -826786176, 956118939, -69874918, -871790118, 1407061867};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyProfileFlowState(int i, String str) {
        super(FlowStates.FIRST_PERSON_PROFILE, null, 2, null);
        runAnimators.ag$a(str, ag$a(new int[]{-540366914, 1381693353, 1012158042, -909884996}, (KeyEvent.getMaxKeyCode() >> 16) + 6).intern());
        putExtra(USER_ID, Integer.valueOf(i));
        putExtra(SOURCE, str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ MyProfileFlowState(int r1, java.lang.String r2, int r3, o.getTargetTypes r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            r4 = 1
            if (r3 == 0) goto L7
            r3 = 1
            goto L9
        L7:
            r3 = 73
        L9:
            if (r3 == r4) goto Lc
            goto L31
        Lc:
            int r2 = com.app.dream11.myprofile.firstpersonprofile.MyProfileFlowState.ag$a
            int r2 = r2 + r4
            int r3 = r2 % 128
            com.app.dream11.myprofile.firstpersonprofile.MyProfileFlowState.toString = r3
            int r2 = r2 % 2
            r3 = 76
            if (r2 != 0) goto L1c
            r2 = 76
            goto L1e
        L1c:
            r2 = 47
        L1e:
            if (r2 == r3) goto L21
            goto L25
        L21:
            r2 = 0
            super.hashCode()     // Catch: java.lang.Throwable -> L35
        L25:
            int r2 = com.app.dream11.myprofile.firstpersonprofile.MyProfileFlowState.toString
            int r2 = r2 + 3
            int r3 = r2 % 128
            com.app.dream11.myprofile.firstpersonprofile.MyProfileFlowState.ag$a = r3
            int r2 = r2 % 2
            java.lang.String r2 = ""
        L31:
            r0.<init>(r1, r2)
            return
        L35:
            r1 = move-exception
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.myprofile.firstpersonprofile.MyProfileFlowState.<init>(int, java.lang.String, int, o.getTargetTypes):void");
    }

    public final int getUserId() {
        int i;
        int i2 = toString + 77;
        ag$a = i2 % 128;
        if ((i2 % 2 != 0 ? '7' : '/') != '/') {
            try {
                i = getInt(USER_ID, -1);
                Object obj = null;
                super.hashCode();
            } catch (Exception e) {
                throw e;
            }
        } else {
            i = getInt(USER_ID, -1);
        }
        int i3 = toString + 89;
        ag$a = i3 % 128;
        if ((i3 % 2 != 0 ? (char) 28 : 'V') != 'V') {
            int i4 = 0 / 0;
            return i;
        }
        return i;
    }

    public final String getSource() {
        int i = toString + 125;
        ag$a = i % 128;
        int i2 = i % 2;
        String string = getString(SOURCE, "");
        int i3 = ag$a + 73;
        toString = i3 % 128;
        int i4 = i3 % 2;
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
        ah$a();
        Object obj = null;
        Companion = new valueOf(null);
        USER_ID = "userId";
        SOURCE = ag$a(new int[]{-540366914, 1381693353, 1012158042, -909884996}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 6).intern();
        int i = ag$a + 91;
        toString = i % 128;
        if ((i % 2 == 0 ? '/' : 'L') != '/') {
            return;
        }
        super.hashCode();
    }

    private static String ag$a(int[] iArr, int i) {
        String str;
        synchronized (getDouble.ag$a) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) ah$a.clone();
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
