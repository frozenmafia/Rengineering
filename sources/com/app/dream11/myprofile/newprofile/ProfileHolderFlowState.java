package com.app.dream11.myprofile.newprofile;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.app.dream11.model.FlowState;
import com.app.dream11.myprofile.FollowFollowersListFlowState;
import com.app.dream11.utils.FlowStates;
import o.getTargetTypes;
import o.getWantsAllOnMoveCalls;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class ProfileHolderFlowState extends FlowState {
    public static final values Companion;
    private static long ah$a = 0;
    private static int toString = 0;
    private static int valueOf = 1;

    static {
        valueOf();
        Object[] objArr = null;
        Companion = new values(null);
        int i = valueOf + 117;
        toString = i % 128;
        if ((i % 2 != 0 ? 'a' : (char) 3) != 'a') {
            return;
        }
        int length = objArr.length;
    }

    static void valueOf() {
        ah$a = 7247637770096527621L;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ProfileHolderFlowState(java.lang.Integer r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, boolean r13, int r14, o.getTargetTypes r15) {
        /*
            r7 = this;
            r15 = r14 & 2
            r0 = 0
            r1 = 1
            if (r15 == 0) goto L8
            r15 = 0
            goto L9
        L8:
            r15 = 1
        L9:
            java.lang.String r2 = ""
            if (r15 == 0) goto Le
            goto L27
        Le:
            int r9 = com.app.dream11.myprofile.newprofile.ProfileHolderFlowState.valueOf     // Catch: java.lang.Exception -> L72
            int r9 = r9 + 125
            int r15 = r9 % 128
            com.app.dream11.myprofile.newprofile.ProfileHolderFlowState.toString = r15     // Catch: java.lang.Exception -> L72
            int r9 = r9 % 2
            r15 = 6
            if (r9 == 0) goto L1e
            r9 = 72
            goto L1f
        L1e:
            r9 = 6
        L1f:
            if (r9 == r15) goto L26
            r9 = 0
            int r9 = r9.length     // Catch: java.lang.Throwable -> L24
            goto L26
        L24:
            r8 = move-exception
            throw r8
        L26:
            r9 = r2
        L27:
            r15 = r14 & 8
            if (r15 == 0) goto L37
            int r11 = com.app.dream11.myprofile.newprofile.ProfileHolderFlowState.toString
            int r11 = r11 + 13
            int r15 = r11 % 128
            com.app.dream11.myprofile.newprofile.ProfileHolderFlowState.valueOf = r15
            int r11 = r11 % 2
            r4 = r2
            goto L38
        L37:
            r4 = r11
        L38:
            r11 = r14 & 16
            r15 = 99
            if (r11 == 0) goto L41
            r11 = 49
            goto L43
        L41:
            r11 = 99
        L43:
            if (r11 == r15) goto L47
            r5 = r2
            goto L48
        L47:
            r5 = r12
        L48:
            r11 = r14 & 32
            r12 = 52
            if (r11 == 0) goto L51
            r11 = 64
            goto L53
        L51:
            r11 = 52
        L53:
            if (r11 == r12) goto L69
            int r11 = com.app.dream11.myprofile.newprofile.ProfileHolderFlowState.valueOf
            int r11 = r11 + 65
            int r12 = r11 % 128
            com.app.dream11.myprofile.newprofile.ProfileHolderFlowState.toString = r12
            int r11 = r11 % 2
            if (r11 == 0) goto L63
            r11 = 1
            goto L64
        L63:
            r11 = 0
        L64:
            if (r11 == r1) goto L68
            r13 = 0
            goto L69
        L68:
            r13 = 1
        L69:
            r6 = r13
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L72:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.myprofile.newprofile.ProfileHolderFlowState.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int, o.getTargetTypes):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileHolderFlowState(Integer num, String str, String str2, String str3, String str4, boolean z) {
        super(FlowStates.PROFILE_HOLDER, null, 2, null);
        runAnimators.ag$a(str, "guid");
        runAnimators.ag$a(str2, values(new char[]{1481, 1466, 60725, 9311, 60629, 26564, 8638, 'I', 32426, 15545}, -TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern());
        runAnimators.ag$a(str3, "oldTeamName");
        runAnimators.ag$a(str4, "action");
        putExtra("userId", num);
        putExtra(FollowFollowersListFlowState.GUID, str);
        String intern = values(new char[]{1481, 1466, 60725, 9311, 60629, 26564, 8638, 'I', 32426, 15545}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))).intern();
        runAnimators.ah$a(intern, values(new char[]{1481, 1466, 60725, 9311, 60629, 26564, 8638, 'I', 32426, 15545}, Color.green(0) + 1).intern());
        putExtra(intern, str2);
        putExtra("teamName", str3);
        putExtra("action", str4);
        putExtra("isBadgesFlow", Boolean.valueOf(z));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProfileHolderFlowState(Integer num, String str, String str2) {
        this(num, str, str2, "", "", false);
        runAnimators.ag$a(str, "guid");
        runAnimators.ag$a(str2, values(new char[]{1481, 1466, 60725, 9311, 60629, 26564, 8638, 'I', 32426, 15545}, -TextUtils.lastIndexOf("", '0', 0, 0)).intern());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ProfileHolderFlowState(java.lang.Integer r1, java.lang.String r2, java.lang.String r3, int r4, o.getTargetTypes r5) {
        /*
            r0 = this;
            r4 = r4 & 2
            r5 = 5
            if (r4 == 0) goto L8
            r4 = 67
            goto L9
        L8:
            r4 = 5
        L9:
            if (r4 == r5) goto L26
            int r2 = com.app.dream11.myprofile.newprofile.ProfileHolderFlowState.toString
            int r2 = r2 + 121
            int r4 = r2 % 128
            com.app.dream11.myprofile.newprofile.ProfileHolderFlowState.valueOf = r4
            int r2 = r2 % 2
            int r2 = com.app.dream11.myprofile.newprofile.ProfileHolderFlowState.toString     // Catch: java.lang.Exception -> L24
            int r2 = r2 + 9
            int r4 = r2 % 128
            com.app.dream11.myprofile.newprofile.ProfileHolderFlowState.valueOf = r4     // Catch: java.lang.Exception -> L22
            int r2 = r2 % 2
            java.lang.String r2 = ""
            goto L26
        L22:
            r1 = move-exception
            throw r1
        L24:
            r1 = move-exception
            throw r1
        L26:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.myprofile.newprofile.ProfileHolderFlowState.<init>(java.lang.Integer, java.lang.String, java.lang.String, int, o.getTargetTypes):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProfileHolderFlowState(Integer num, String str, String str2, String str3) {
        this(num, str, str2, str3, "", false);
        runAnimators.ag$a(str, "guid");
        runAnimators.ag$a(str2, values(new char[]{1481, 1466, 60725, 9311, 60629, 26564, 8638, 'I', 32426, 15545}, -TextUtils.indexOf((CharSequence) "", '0', 0)).intern());
        runAnimators.ag$a(str3, "oldTeamName");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ProfileHolderFlowState(java.lang.Integer r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6, o.getTargetTypes r7) {
        /*
            r1 = this;
            r7 = 2
            r6 = r6 & r7
            r0 = 1
            if (r6 == 0) goto L7
            r6 = 0
            goto L8
        L7:
            r6 = 1
        L8:
            if (r6 == r0) goto L25
            int r3 = com.app.dream11.myprofile.newprofile.ProfileHolderFlowState.valueOf     // Catch: java.lang.Exception -> L23
            int r3 = r3 + 69
            int r6 = r3 % 128
            com.app.dream11.myprofile.newprofile.ProfileHolderFlowState.toString = r6     // Catch: java.lang.Exception -> L23
            int r3 = r3 % r7
            if (r3 == 0) goto L18
            r3 = 86
            goto L19
        L18:
            r3 = 2
        L19:
            if (r3 == r7) goto L20
            r3 = 0
            int r3 = r3.length     // Catch: java.lang.Throwable -> L1e
            goto L20
        L1e:
            r2 = move-exception
            throw r2
        L20:
            java.lang.String r3 = ""
            goto L25
        L23:
            r2 = move-exception
            throw r2
        L25:
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.myprofile.newprofile.ProfileHolderFlowState.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, int, o.getTargetTypes):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProfileHolderFlowState(Integer num, String str, String str2, String str3, String str4) {
        this(num, str, str2, str3, str4, false);
        runAnimators.ag$a(str, "guid");
        runAnimators.ag$a(str2, values(new char[]{1481, 1466, 60725, 9311, 60629, 26564, 8638, 'I', 32426, 15545}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern());
        runAnimators.ag$a(str3, "oldTeamName");
        runAnimators.ag$a(str4, "action");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ProfileHolderFlowState(java.lang.Integer r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12, o.getTargetTypes r13) {
        /*
            r6 = this;
            r12 = r12 & 2
            r13 = 76
            if (r12 == 0) goto L9
            r12 = 76
            goto Lb
        L9:
            r12 = 60
        Lb:
            if (r12 == r13) goto Lf
        Ld:
            r2 = r8
            goto L26
        Lf:
            int r8 = com.app.dream11.myprofile.newprofile.ProfileHolderFlowState.valueOf     // Catch: java.lang.Exception -> L2f
            int r8 = r8 + 81
            int r12 = r8 % 128
            com.app.dream11.myprofile.newprofile.ProfileHolderFlowState.toString = r12     // Catch: java.lang.Exception -> L2f
            int r8 = r8 % 2
            int r8 = com.app.dream11.myprofile.newprofile.ProfileHolderFlowState.toString
            int r8 = r8 + 115
            int r12 = r8 % 128
            com.app.dream11.myprofile.newprofile.ProfileHolderFlowState.valueOf = r12
            int r8 = r8 % 2
            java.lang.String r8 = ""
            goto Ld
        L26:
            r0 = r6
            r1 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L2f:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.myprofile.newprofile.ProfileHolderFlowState.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, o.getTargetTypes):void");
    }

    /* loaded from: classes3.dex */
    public static final class values {
        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }

        private values() {
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:19:0x002b
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final int getUserId() {
        /*
            r4 = this;
            int r0 = com.app.dream11.myprofile.newprofile.ProfileHolderFlowState.valueOf
            int r0 = r0 + 107
            int r1 = r0 % 128
            com.app.dream11.myprofile.newprofile.ProfileHolderFlowState.toString = r1
            int r0 = r0 % 2
            java.lang.String r0 = "userId"
            r1 = 0
            int r0 = r4.getInt(r0, r1)     // Catch: java.lang.Exception -> L29
            int r2 = com.app.dream11.myprofile.newprofile.ProfileHolderFlowState.toString
            int r2 = r2 + 3
            int r3 = r2 % 128
            com.app.dream11.myprofile.newprofile.ProfileHolderFlowState.valueOf = r3
            int r2 = r2 % 2
            if (r2 != 0) goto L1f
            r2 = 1
            goto L20
        L1f:
            r2 = 0
        L20:
            if (r2 == 0) goto L28
            r2 = 47
            int r2 = r2 / r1
            return r0
        L26:
            r0 = move-exception
            throw r0
        L28:
            return r0
        L29:
            r0 = move-exception
            throw r0
        L2b:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.myprofile.newprofile.ProfileHolderFlowState.getUserId():int");
    }

    public final String getGuid() {
        try {
            int i = valueOf + 31;
            toString = i % 128;
            int i2 = i % 2;
            String string = getString(FollowFollowersListFlowState.GUID, "");
            try {
                int i3 = valueOf + 73;
                toString = i3 % 128;
                int i4 = i3 % 2;
                return string;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final String getSource() {
        int i = toString + 21;
        valueOf = i % 128;
        return getString(((i % 2 == 0 ? 'S' : '\'') != '\'' ? values(new char[]{1481, 1466, 60725, 9311, 60629, 26564, 8638, 'I', 32426, 15545}, Color.argb(1, 1, 0, 0) + 1) : values(new char[]{1481, 1466, 60725, 9311, 60629, 26564, 8638, 'I', 32426, 15545}, Color.argb(0, 0, 0, 0) + 1)).intern(), "");
    }

    public final String getOldTeamName() {
        int i = valueOf + 65;
        toString = i % 128;
        int i2 = i % 2;
        String string = getString("teamName", "");
        int i3 = valueOf + 119;
        toString = i3 % 128;
        if ((i3 % 2 != 0 ? (char) 3 : 'B') != 3) {
            return string;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return string;
    }

    public final String getAction() {
        int i = valueOf + 125;
        toString = i % 128;
        if ((i % 2 != 0 ? 'T' : '4') == '4') {
            try {
                return getString("action", "");
            } catch (Exception e) {
                throw e;
            }
        }
        try {
            String string = getString("action", "");
            Object[] objArr = null;
            int length = objArr.length;
            return string;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final boolean isBadgesFLow() {
        int i = valueOf + 27;
        toString = i % 128;
        int i2 = i % 2;
        try {
            boolean z = getBoolean("isBadgesFlow", false);
            int i3 = valueOf + 93;
            toString = i3 % 128;
            int i4 = i3 % 2;
            return z;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String values(char[] cArr, int i) {
        String str;
        synchronized (getWantsAllOnMoveCalls.ag$a) {
            char[] getwantsallonmovecalls = getWantsAllOnMoveCalls.toString(ah$a, cArr, i);
            getWantsAllOnMoveCalls.values = 4;
            while (getWantsAllOnMoveCalls.values < getwantsallonmovecalls.length) {
                getWantsAllOnMoveCalls.toString = getWantsAllOnMoveCalls.values - 4;
                getwantsallonmovecalls[getWantsAllOnMoveCalls.values] = (char) ((getwantsallonmovecalls[getWantsAllOnMoveCalls.values] ^ getwantsallonmovecalls[getWantsAllOnMoveCalls.values % 4]) ^ (getWantsAllOnMoveCalls.toString * ah$a));
                getWantsAllOnMoveCalls.values++;
            }
            str = new String(getwantsallonmovecalls, 4, getwantsallonmovecalls.length - 4);
        }
        return str;
    }
}
