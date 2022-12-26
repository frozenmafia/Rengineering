package com.app.dream11.chat.chatflowstates;

import android.os.Process;
import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import o.getTargetTypes;
import o.getWantsAllOnMoveCalls;
import o.runAnimators;
import org.apache.http.message.TokenParser;
/* loaded from: classes6.dex */
public final class TourPickerFlowState extends FlowState {
    private static final String GROUP_ID = "groupId";
    private static final String SOURCE = "source";
    private static int ah$a = 0;
    private static int toString = 1;
    private String groupId;
    private String source;
    private static long ag$a = -1601080654078334350L;
    public static final Companion Companion = new Companion(null);

    static {
        int i = ah$a + 77;
        toString = i % 128;
        int i2 = i % 2;
    }

    public TourPickerFlowState() {
        super(FlowStates.TOUR_PICKER, null, 2, null);
        this.groupId = "";
        this.source = "";
        putExtra(values(new char[]{29140, 29095, 21711, 15466, 32466, 26875, 15176, 17516, 55423, 32912}, (Process.getThreadPriority(0) + 20) >> 6).intern(), "");
        putExtra(GROUP_ID, this.groupId);
    }

    public final String getGroupId() {
        String str;
        int i = toString + 85;
        ah$a = i % 128;
        if (!(i % 2 != 0)) {
            str = this.groupId;
        } else {
            str = this.groupId;
            Object obj = null;
            super.hashCode();
        }
        int i2 = toString + 63;
        ah$a = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        int i3 = 40 / 0;
        return str;
    }

    public final void setGroupId(String str) {
        try {
            int i = ah$a + 15;
            toString = i % 128;
            if (i % 2 != 0) {
                runAnimators.ag$a(str, "<set-?>");
                this.groupId = str;
            } else {
                runAnimators.ag$a(str, "<set-?>");
                this.groupId = str;
                int i2 = 45 / 0;
            }
            int i3 = ah$a + 111;
            toString = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String getSource() {
        String str;
        int i = ah$a + 5;
        toString = i % 128;
        if ((i % 2 == 0 ? '3' : 'I') != '3') {
            str = this.source;
        } else {
            str = this.source;
            Object[] objArr = null;
            int length = objArr.length;
        }
        int i2 = toString + 113;
        ah$a = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final void setSource(String str) {
        int i = toString + 59;
        ah$a = i % 128;
        if ((i % 2 != 0 ? (char) 3 : TokenParser.CR) != 3) {
            runAnimators.ag$a(str, "<set-?>");
            this.source = str;
        } else {
            runAnimators.ag$a(str, "<set-?>");
            this.source = str;
            Object obj = null;
            super.hashCode();
        }
        int i2 = ah$a + 117;
        toString = i2 % 128;
        if ((i2 % 2 == 0 ? 'K' : TokenParser.ESCAPE) != '\\') {
            int i3 = 8 / 0;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        private Companion() {
        }
    }

    private static String values(char[] cArr, int i) {
        String str;
        synchronized (getWantsAllOnMoveCalls.ag$a) {
            char[] getwantsallonmovecalls = getWantsAllOnMoveCalls.toString(ag$a, cArr, i);
            getWantsAllOnMoveCalls.values = 4;
            while (getWantsAllOnMoveCalls.values < getwantsallonmovecalls.length) {
                getWantsAllOnMoveCalls.toString = getWantsAllOnMoveCalls.values - 4;
                getwantsallonmovecalls[getWantsAllOnMoveCalls.values] = (char) ((getwantsallonmovecalls[getWantsAllOnMoveCalls.values] ^ getwantsallonmovecalls[getWantsAllOnMoveCalls.values % 4]) ^ (getWantsAllOnMoveCalls.toString * ag$a));
                getWantsAllOnMoveCalls.values++;
            }
            str = new String(getwantsallonmovecalls, 4, getwantsallonmovecalls.length - 4);
        }
        return str;
    }
}
