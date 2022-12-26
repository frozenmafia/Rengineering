package com.app.dream11.myprofile.miniprofile;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import java.io.Serializable;
import o.getShort;
import o.getTargetTypes;
import o.isLast;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class MiniProfileBottomSheetFlowState extends FlowState {
    private static final String CHANNEL_URL = "channel_url";
    public static final valueOf Companion;
    private static final String GROUP_NAME = "groupName";
    private static final String IS_USER_GROUP_ADMIN = "isUserGroupAdmin";
    private static final String SHOW_REMOVE_FROM_GROUP = "show_remove_from_group";
    private static final String SOURCE = "source";
    private static final String USER_ID = "userId";
    private static int ag$a = 1;
    private static int ah$a;
    private static long toString;
    private static char valueOf;
    private static int values;

    static {
        values();
        Object[] objArr = null;
        Companion = new valueOf(null);
        int i = values + 69;
        ag$a = i % 128;
        if ((i % 2 == 0 ? '%' : (char) 11) != '%') {
            return;
        }
        int length = objArr.length;
    }

    static void values() {
        ah$a = 0;
        toString = 0L;
        valueOf = (char) 43088;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ MiniProfileBottomSheetFlowState(int r10, java.lang.String r11, boolean r12, java.lang.String r13, java.lang.Boolean r14, java.lang.String r15, int r16, o.getTargetTypes r17) {
        /*
            r9 = this;
            r0 = r16 & 4
            r1 = 0
            if (r0 == 0) goto L7
            r5 = 0
            goto L8
        L7:
            r5 = r12
        L8:
            r0 = r16 & 8
            r2 = 40
            if (r0 == 0) goto L11
            r0 = 85
            goto L13
        L11:
            r0 = 40
        L13:
            java.lang.String r3 = ""
            if (r0 == r2) goto L23
            int r0 = com.app.dream11.myprofile.miniprofile.MiniProfileBottomSheetFlowState.values
            int r0 = r0 + 69
            int r2 = r0 % 128
            com.app.dream11.myprofile.miniprofile.MiniProfileBottomSheetFlowState.ag$a = r2
            int r0 = r0 % 2
            r6 = r3
            goto L24
        L23:
            r6 = r13
        L24:
            r0 = r16 & 16
            r2 = 0
            if (r0 == 0) goto L40
            int r0 = com.app.dream11.myprofile.miniprofile.MiniProfileBottomSheetFlowState.ag$a     // Catch: java.lang.Exception -> L3e
            int r0 = r0 + 45
            int r4 = r0 % 128
            com.app.dream11.myprofile.miniprofile.MiniProfileBottomSheetFlowState.values = r4     // Catch: java.lang.Exception -> L3e
            int r0 = r0 % 2
            if (r0 == 0) goto L3c
            r0 = 19
            int r0 = r0 / r1
            goto L3c
        L39:
            r0 = move-exception
            r1 = r0
            throw r1
        L3c:
            r7 = r2
            goto L41
        L3e:
            r0 = move-exception
            throw r0
        L40:
            r7 = r14
        L41:
            r0 = r16 & 32
            r1 = 10
            if (r0 == 0) goto L4a
            r0 = 50
            goto L4c
        L4a:
            r0 = 10
        L4c:
            if (r0 == r1) goto L5a
            int r0 = com.app.dream11.myprofile.miniprofile.MiniProfileBottomSheetFlowState.ag$a
            int r0 = r0 + 93
            int r1 = r0 % 128
            com.app.dream11.myprofile.miniprofile.MiniProfileBottomSheetFlowState.values = r1
            int r0 = r0 % 2
            r8 = r3
            goto L5b
        L5a:
            r8 = r15
        L5b:
            r2 = r9
            r3 = r10
            r4 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.myprofile.miniprofile.MiniProfileBottomSheetFlowState.<init>(int, java.lang.String, boolean, java.lang.String, java.lang.Boolean, java.lang.String, int, o.getTargetTypes):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniProfileBottomSheetFlowState(int i, String str, boolean z, String str2, Boolean bool, String str3) {
        super(FlowStates.MINI_PROFILE_BOTTOM_SHEET, null, 2, null);
        runAnimators.ag$a(str, values((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{24037, 38843, 9898, 53186}, new char[]{0, 0, 0, 0}, (char) (49703 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), new char[]{13199, 14541, 32249, 39362, 42069, 23478}).intern());
        runAnimators.ag$a(str2, "channelUrl");
        runAnimators.ag$a(str3, GROUP_NAME);
        putExtra("userId", Integer.valueOf(i));
        putExtra(values(Process.myTid() >> 22, new char[]{24037, 38843, 9898, 53186}, new char[]{0, 0, 0, 0}, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 49702), new char[]{13199, 14541, 32249, 39362, 42069, 23478}).intern(), str);
        putExtra(SHOW_REMOVE_FROM_GROUP, Boolean.valueOf(z));
        putExtra(IS_USER_GROUP_ADMIN, bool);
        putExtra("channel_url", str2);
        putExtra(GROUP_NAME, str3);
    }

    public final int getUserId() {
        int i = values + 17;
        ag$a = i % 128;
        if ((i % 2 == 0 ? (char) 21 : 'A') != 'A') {
            int i2 = getInt("userId", -1);
            Object[] objArr = null;
            int length = objArr.length;
            return i2;
        }
        return getInt("userId", -1);
    }

    public final String getSource() {
        int i = values + 105;
        ag$a = i % 128;
        String string = getString(((i % 2 == 0 ? '.' : 'Q') != '.' ? values((-1) - ImageFormat.getBitsPerPixel(0), new char[]{24037, 38843, 9898, 53186}, new char[]{0, 0, 0, 0}, (char) (49702 - Color.argb(0, 0, 0, 0)), new char[]{13199, 14541, 32249, 39362, 42069, 23478}) : values((-1) << ImageFormat.getBitsPerPixel(0), new char[]{24037, 38843, 9898, 53186}, new char[]{0, 0, 0, 0}, (char) (49702 >> Color.argb(1, 1, 1, 0)), new char[]{13199, 14541, 32249, 39362, 42069, 23478})).intern(), "");
        int i2 = ag$a + 29;
        values = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public final boolean shouldShowRemoveFromGroup() {
        int i = ag$a + 37;
        values = i % 128;
        int i2 = i % 2;
        boolean z = getBoolean(SHOW_REMOVE_FROM_GROUP, false);
        int i3 = ag$a + 99;
        values = i3 % 128;
        if ((i3 % 2 != 0 ? '@' : 'c') != '@') {
            return z;
        }
        Object obj = null;
        super.hashCode();
        return z;
    }

    public final Boolean isUserGroupAdmin() {
        Boolean bool;
        Serializable extra = getExtra(IS_USER_GROUP_ADMIN);
        Object obj = null;
        if (!(extra instanceof Boolean)) {
            bool = null;
        } else {
            try {
                int i = ag$a + 67;
                values = i % 128;
                if (i % 2 != 0) {
                    bool = (Boolean) extra;
                    int i2 = 66 / 0;
                } else {
                    bool = (Boolean) extra;
                }
            } catch (Exception e) {
                throw e;
            }
        }
        try {
            int i3 = ag$a + 105;
            values = i3 % 128;
            if ((i3 % 2 != 0 ? (char) 15 : 'H') != 'H') {
                super.hashCode();
                return bool;
            }
            return bool;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final String getChannelUrl() {
        int i = ag$a + 115;
        values = i % 128;
        if (i % 2 != 0) {
            String string = getString("channel_url", "");
            Object obj = null;
            super.hashCode();
            return string;
        }
        return getString("channel_url", "");
    }

    public final String getGroupName() {
        int i = values + 73;
        ag$a = i % 128;
        if ((i % 2 == 0 ? 'S' : (char) 14) != 'S') {
            return getString(GROUP_NAME, "");
        }
        String string = getString(GROUP_NAME, "");
        Object[] objArr = null;
        int length = objArr.length;
        return string;
    }

    /* loaded from: classes3.dex */
    public static final class valueOf {
        private static int HaptikSDK$b = 1;
        private static int ag$a = 196;
        private static int ah$a = 0;
        private static boolean toString = true;
        private static char[] valueOf = {311, 307, 313, 310, 295, 297};
        private static boolean values = true;

        public /* synthetic */ valueOf(getTargetTypes gettargettypes) {
            this();
        }

        private valueOf() {
        }

        public final FlowState toString(FlowState flowState) {
            int i = ah$a + 117;
            HaptikSDK$b = i % 128;
            int i2 = i % 2;
            runAnimators.ag$a(flowState, "state");
            int i3 = flowState.getInt("userId", -1);
            Object[] objArr = null;
            String string = flowState.getString(values(null, null, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 126, new byte[]{-122, -123, -124, -125, -126, -127}).intern(), "");
            Serializable extra = flowState.getExtra(MiniProfileBottomSheetFlowState.IS_USER_GROUP_ADMIN);
            MiniProfileBottomSheetFlowState miniProfileBottomSheetFlowState = new MiniProfileBottomSheetFlowState(i3, string, false, null, !(extra instanceof Boolean) ? null : (Boolean) extra, null, 44, null);
            int i4 = HaptikSDK$b + 23;
            ah$a = i4 % 128;
            if ((i4 % 2 != 0 ? 'E' : (char) 26) != 'E') {
                return miniProfileBottomSheetFlowState;
            }
            int length = objArr.length;
            return miniProfileBottomSheetFlowState;
        }

        private static String values(char[] cArr, int[] iArr, int i, byte[] bArr) {
            synchronized (isLast.valueOf) {
                char[] cArr2 = valueOf;
                int i2 = ag$a;
                if (toString) {
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

    private static String values(int i, char[] cArr, char[] cArr2, char c, char[] cArr3) {
        String str;
        synchronized (getShort.toString) {
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr2.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            getShort.valueOf = 0;
            while (getShort.valueOf < length) {
                int i2 = (getShort.valueOf + 2) % 4;
                int i3 = (getShort.valueOf + 3) % 4;
                getShort.values = (char) (((cArr4[getShort.valueOf % 4] * 32718) + cArr5[i2]) % 65535);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / 65535);
                cArr4[i3] = getShort.values;
                cArr6[getShort.valueOf] = (char) ((((cArr4[i3] ^ cArr3[getShort.valueOf]) ^ toString) ^ ah$a) ^ valueOf);
                getShort.valueOf++;
            }
            str = new String(cArr6);
        }
        return str;
    }
}
