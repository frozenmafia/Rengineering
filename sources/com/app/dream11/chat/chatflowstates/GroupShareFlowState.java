package com.app.dream11.chat.chatflowstates;

import android.os.SystemClock;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.app.dream11.utils.FlowStates;
import o.isBeforeFirst;
import o.runAnimators;
/* loaded from: classes.dex */
public final class GroupShareFlowState extends BaseChatFlowState {
    private static int ag$a = 0;
    private static long valueOf = 5476009459209318538L;
    private static int values = 1;
    private final String sourceKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupShareFlowState(String str, String str2) {
        super(str, FlowStates.GROUP_SHARE, null, 4, null);
        runAnimators.ag$a(str, "groupUrl");
        runAnimators.ag$a(str2, ah$a(new char[]{45305, 56838, 27961, 64593, 2917, 39552}, ExpandableListView.getPackedPositionGroup(0L) + 28387).intern());
        this.sourceKey = ah$a(new char[]{45305, 56838, 27961, 64593, 2917, 39552}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 28386).intern();
        putExtra(ah$a(new char[]{45305, 56838, 27961, 64593, 2917, 39552}, (ViewConfiguration.getEdgeSlop() >> 16) + 28387).intern(), str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
        if ((r0 == null ? org.apache.http.message.TokenParser.CR : 'H') != '\r') goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002a, code lost:
        if (r0 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
        r1 = com.app.dream11.chat.chatflowstates.GroupShareFlowState.ag$a + 101;
        com.app.dream11.chat.chatflowstates.GroupShareFlowState.values = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getSource() {
        /*
            r3 = this;
            int r0 = com.app.dream11.chat.chatflowstates.GroupShareFlowState.ag$a     // Catch: java.lang.Exception -> L3b
            int r0 = r0 + 63
            int r1 = r0 % 128
            com.app.dream11.chat.chatflowstates.GroupShareFlowState.values = r1     // Catch: java.lang.Exception -> L39
            int r0 = r0 % 2
            if (r0 != 0) goto L24
            java.lang.String r0 = r3.sourceKey
            java.lang.String r0 = r3.getString(r0)
            r1 = 99
            int r1 = r1 / 0
            r1 = 13
            if (r0 != 0) goto L1d
            r2 = 13
            goto L1f
        L1d:
            r2 = 72
        L1f:
            if (r2 == r1) goto L2c
            goto L38
        L22:
            r0 = move-exception
            throw r0
        L24:
            java.lang.String r0 = r3.sourceKey
            java.lang.String r0 = r3.getString(r0)
            if (r0 != 0) goto L38
        L2c:
            java.lang.String r0 = ""
            int r1 = com.app.dream11.chat.chatflowstates.GroupShareFlowState.ag$a
            int r1 = r1 + 101
            int r2 = r1 % 128
            com.app.dream11.chat.chatflowstates.GroupShareFlowState.values = r2
            int r1 = r1 % 2
        L38:
            return r0
        L39:
            r0 = move-exception
            throw r0
        L3b:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.chat.chatflowstates.GroupShareFlowState.getSource():java.lang.String");
    }

    private static String ah$a(char[] cArr, int i) {
        String str;
        synchronized (isBeforeFirst.toString) {
            isBeforeFirst.ah$a = i;
            char[] cArr2 = new char[cArr.length];
            isBeforeFirst.valueOf = 0;
            while (isBeforeFirst.valueOf < cArr.length) {
                cArr2[isBeforeFirst.valueOf] = (char) ((cArr[isBeforeFirst.valueOf] ^ (isBeforeFirst.valueOf * isBeforeFirst.ah$a)) ^ valueOf);
                isBeforeFirst.valueOf++;
            }
            str = new String(cArr2);
        }
        return str;
    }
}
