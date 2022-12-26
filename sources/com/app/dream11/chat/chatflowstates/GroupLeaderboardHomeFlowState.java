package com.app.dream11.chat.chatflowstates;

import android.graphics.Color;
import android.media.AudioTrack;
import android.util.TypedValue;
import android.view.View;
import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import o.getDouble;
import o.runAnimators;
/* loaded from: classes.dex */
public final class GroupLeaderboardHomeFlowState extends FlowState {
    private static int ag$a = 1;
    private static int ah$a;
    private static int[] values = {1392541197, 1787482199, 984827573, 1838417744, 1319916465, -44660145, 1652323519, 1343963363, 797579188, 977845481, -237475859, 1809510792, -416922972, 2005277169, -388698822, -808441999, 983463157, -319835716};
    private final String GROUP_ID;
    private final String SOURCE;

    public GroupLeaderboardHomeFlowState() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ GroupLeaderboardHomeFlowState(java.lang.String r4, java.lang.String r5, int r6, o.getTargetTypes r7) {
        /*
            r3 = this;
            r7 = r6 & 1
            r0 = 0
            r1 = 1
            if (r7 == 0) goto L8
            r7 = 1
            goto L9
        L8:
            r7 = 0
        L9:
            java.lang.String r2 = ""
            if (r7 == r1) goto Le
            goto L19
        Le:
            int r4 = com.app.dream11.chat.chatflowstates.GroupLeaderboardHomeFlowState.ag$a
            int r4 = r4 + 81
            int r7 = r4 % 128
            com.app.dream11.chat.chatflowstates.GroupLeaderboardHomeFlowState.ah$a = r7
            int r4 = r4 % 2
            r4 = r2
        L19:
            r6 = r6 & 2
            if (r6 == 0) goto L1f
            r6 = 1
            goto L20
        L1f:
            r6 = 0
        L20:
            if (r6 == r1) goto L23
            goto L3a
        L23:
            int r5 = com.app.dream11.chat.chatflowstates.GroupLeaderboardHomeFlowState.ag$a
            int r5 = r5 + 87
            int r6 = r5 % 128
            com.app.dream11.chat.chatflowstates.GroupLeaderboardHomeFlowState.ah$a = r6
            int r5 = r5 % 2
            if (r5 == 0) goto L30
            goto L31
        L30:
            r1 = 0
        L31:
            if (r1 == 0) goto L39
            r5 = 62
            int r5 = r5 / r0
            goto L39
        L37:
            r4 = move-exception
            throw r4
        L39:
            r5 = r2
        L3a:
            r3.<init>(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.chat.chatflowstates.GroupLeaderboardHomeFlowState.<init>(java.lang.String, java.lang.String, int, o.getTargetTypes):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupLeaderboardHomeFlowState(String str, String str2) {
        super(FlowStates.GROUP_LEADERBOARD_HOME, null, 2, null);
        runAnimators.ag$a(str, "groupId");
        runAnimators.ag$a(str2, toString(new int[]{435560363, 337786848, -6459585, -849213592}, 7 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern());
        this.GROUP_ID = "groupId";
        this.SOURCE = toString(new int[]{435560363, 337786848, -6459585, -849213592}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 6).intern();
        putExtra("groupId", str);
        putExtra(toString(new int[]{435560363, 337786848, -6459585, -849213592}, Color.red(0) + 6).intern(), str2);
    }

    public final String getGroupId() {
        int i = ah$a + 73;
        ag$a = i % 128;
        int i2 = i % 2;
        String string = getString("groupId", "");
        int i3 = ah$a + 23;
        ag$a = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    public final String getSource() {
        int i = ah$a + 103;
        ag$a = i % 128;
        return getString((i % 2 != 0 ? toString(new int[]{435560363, 337786848, -6459585, -849213592}, 6 - View.resolveSizeAndState(0, 0, 0)) : toString(new int[]{435560363, 337786848, -6459585, -849213592}, View.resolveSizeAndState(1, 1, 1) + 39)).intern(), "");
    }

    private static String toString(int[] iArr, int i) {
        String str;
        synchronized (getDouble.ag$a) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) values.clone();
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
