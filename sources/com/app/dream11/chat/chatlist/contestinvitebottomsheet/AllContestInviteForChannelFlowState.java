package com.app.dream11.chat.chatlist.contestinvitebottomsheet;

import android.graphics.Color;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import com.sendbird.android.constant.StringSet;
import o.isAfterLast;
import o.runAnimators;
/* loaded from: classes.dex */
public final class AllContestInviteForChannelFlowState extends FlowState {
    private static int ag$a = 0;
    private static int ah$a = 27;
    private static int toString = 1;
    private final String argChannelUrl;
    private final String argFlow;
    private final String argIsGroupChannel;
    private final String argMatchId;
    private final String argUserId;
    private final String argUserTeamName;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ AllContestInviteForChannelFlowState(java.lang.String r7, int r8, boolean r9, java.lang.Integer r10, java.lang.String r11, int r12, o.getTargetTypes r13) {
        /*
            r6 = this;
            r12 = r12 & 16
            r13 = 0
            r0 = 1
            if (r12 == 0) goto L8
            r12 = 1
            goto L9
        L8:
            r12 = 0
        L9:
            if (r12 == 0) goto L25
            int r11 = com.app.dream11.chat.chatlist.contestinvitebottomsheet.AllContestInviteForChannelFlowState.toString     // Catch: java.lang.Exception -> L23
            int r11 = r11 + 53
            int r12 = r11 % 128
            com.app.dream11.chat.chatlist.contestinvitebottomsheet.AllContestInviteForChannelFlowState.ag$a = r12     // Catch: java.lang.Exception -> L23
            int r11 = r11 % 2
            if (r11 == 0) goto L18
            goto L19
        L18:
            r13 = 1
        L19:
            if (r13 == r0) goto L20
            r11 = 0
            int r11 = r11.length     // Catch: java.lang.Throwable -> L1e
            goto L20
        L1e:
            r7 = move-exception
            throw r7
        L20:
            java.lang.String r11 = ""
            goto L25
        L23:
            r7 = move-exception
            throw r7
        L25:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.chat.chatlist.contestinvitebottomsheet.AllContestInviteForChannelFlowState.<init>(java.lang.String, int, boolean, java.lang.Integer, java.lang.String, int, o.getTargetTypes):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllContestInviteForChannelFlowState(String str, int i, boolean z, Integer num, String str2) {
        super(FlowStates.CHAT_ALL_CONTEST_INVITE_FOR_CHANNEL, null, 2, null);
        runAnimators.ag$a(str, "channelUrl");
        runAnimators.ag$a(str2, "inviterTeamName");
        this.argMatchId = "roundID";
        this.argUserId = "userId";
        this.argChannelUrl = StringSet.channel_url;
        this.argUserTeamName = "teamName";
        this.argIsGroupChannel = "isGroupChannel";
        this.argFlow = ah$a(KeyEvent.getDeadChar(0, 0) + 1, 137 - View.combineMeasuredStates(0, 0), false, 4 - Color.green(0), new char[]{'\t', 65528, 65534, 1}).intern();
        putExtra("roundID", Integer.valueOf(i));
        putExtra("userId", num);
        putExtra(StringSet.channel_url, str);
        putExtra("isGroupChannel", Boolean.valueOf(z));
        putExtra("teamName", str2);
        putExtra(ah$a(1 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Color.green(0) + 137, false, (-16777212) - Color.rgb(0, 0, 0), new char[]{'\t', 65528, 65534, 1}).intern(), "contest_invite_view_all_bottomsheet");
    }

    public AllContestInviteForChannelFlowState() {
        this("", -1, false, -1, "");
    }

    public final int getMatchId() {
        int i = toString + 77;
        ag$a = i % 128;
        int i2 = i % 2;
        int i3 = getInt(this.argMatchId, -1);
        try {
            int i4 = ag$a + 57;
            toString = i4 % 128;
            int i5 = i4 % 2;
            return i3;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String getChannelUrl() {
        String string;
        int i = ag$a + 65;
        toString = i % 128;
        if ((i % 2 == 0 ? 'a' : (char) 29) != 29) {
            string = getString(this.argChannelUrl);
            int i2 = 41 / 0;
        } else {
            string = getString(this.argChannelUrl);
        }
        try {
            int i3 = toString + 37;
            ag$a = i3 % 128;
            if ((i3 % 2 != 0 ? '/' : 'E') != 'E') {
                Object obj = null;
                super.hashCode();
                return string;
            }
            return string;
        } catch (Exception e) {
            throw e;
        }
    }

    public final boolean isGroupChannel() {
        int i = toString + 27;
        ag$a = i % 128;
        int i2 = i % 2;
        boolean z = getBoolean(this.argIsGroupChannel);
        int i3 = toString + 3;
        ag$a = i3 % 128;
        if ((i3 % 2 != 0 ? (char) 26 : '[') != 26) {
            return z;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return z;
    }

    public final int getUserId() {
        try {
            int i = ag$a + 111;
            toString = i % 128;
            int i2 = i % 2;
            int i3 = getInt(this.argUserId, -1);
            int i4 = toString + 15;
            ag$a = i4 % 128;
            int i5 = i4 % 2;
            return i3;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String getInviterTeamName() {
        String string;
        try {
            int i = ag$a + 35;
            try {
                toString = i % 128;
                if ((i % 2 == 0 ? (char) 16 : (char) 29) != 29) {
                    string = getString(this.argUserTeamName);
                    Object obj = null;
                    super.hashCode();
                } else {
                    string = getString(this.argUserTeamName);
                }
                int i2 = ag$a + 37;
                toString = i2 % 128;
                int i3 = i2 % 2;
                return string;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String ah$a(int i, int i2, boolean z, int i3, char[] cArr) {
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
