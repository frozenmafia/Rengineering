package com.app.dream11.chat.chatflowstates;

import android.media.AudioTrack;
import android.view.View;
import android.view.ViewConfiguration;
import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import java.io.Serializable;
import java.util.Objects;
import o.getTargetTypes;
import o.getWantsAllOnMoveCalls;
import o.runAnimators;
/* loaded from: classes.dex */
public final class MessageRequestFormFlowstate extends FlowState {
    public static final Companion Companion;
    public static final String EXTRA_CHANNEL_IS_ADMIN = "extra_is_admin";
    public static final String EXTRA_CHANNEL_MEMBER_COUNT = "extra_channel_member_count";
    public static final String EXTRA_CHANNEL_TYPE = "extra_channel_type";
    public static final String EXTRA_CHANNEL_URL = "extra_channel_url";
    private static int ag$a = 0;
    private static long toString = 0;
    private static int values = 1;
    private final String IS_START_DM;
    private final String screenOpenedFromKey;
    private final String sourceKey;
    private final String userId;

    static {
        valueOf();
        Companion = new Companion(null);
        int i = ag$a + 101;
        values = i % 128;
        int i2 = i % 2;
    }

    static void valueOf() {
        toString = -233461257766195003L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageRequestFormFlowstate(int i, String str, String str2, boolean z) {
        super(FlowStates.MESSAGE_REQUEST_FORM_BOTTOMSHEET, null, 2, null);
        runAnimators.ag$a(str, "screenOpenedFrom");
        runAnimators.ag$a(str2, valueOf(new char[]{5525, 5606, 29002, 49632, 33880, 37703, 58791, 33146, 55010, 758}, View.MeasureSpec.getMode(0) + 1).intern());
        this.userId = "userId";
        this.IS_START_DM = "is_start_dm";
        this.screenOpenedFromKey = "screen";
        this.sourceKey = valueOf(new char[]{5525, 5606, 29002, 49632, 33880, 37703, 58791, 33146, 55010, 758}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern();
        putExtra("userId", Integer.valueOf(i));
        putExtra("is_start_dm", Boolean.valueOf(z));
        putExtra(valueOf(new char[]{5525, 5606, 29002, 49632, 33880, 37703, 58791, 33146, 55010, 758}, 1 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), str2);
        putExtra("screen", str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ MessageRequestFormFlowstate(int r3, java.lang.String r4, java.lang.String r5, boolean r6, int r7, o.getTargetTypes r8) {
        /*
            r2 = this;
            r8 = r7 & 4
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L8
            r8 = 1
            goto L9
        L8:
            r8 = 0
        L9:
            if (r8 == r0) goto Lc
            goto L22
        Lc:
            int r5 = com.app.dream11.chat.chatflowstates.MessageRequestFormFlowstate.values
            int r5 = r5 + 79
            int r8 = r5 % 128
            com.app.dream11.chat.chatflowstates.MessageRequestFormFlowstate.ag$a = r8
            int r5 = r5 % 2
            int r5 = com.app.dream11.chat.chatflowstates.MessageRequestFormFlowstate.values
            int r5 = r5 + 17
            int r8 = r5 % 128
            com.app.dream11.chat.chatflowstates.MessageRequestFormFlowstate.ag$a = r8
            int r5 = r5 % 2
            java.lang.String r5 = ""
        L22:
            r7 = r7 & 8
            if (r7 == 0) goto L31
            int r6 = com.app.dream11.chat.chatflowstates.MessageRequestFormFlowstate.ag$a
            int r6 = r6 + 11
            int r7 = r6 % 128
            com.app.dream11.chat.chatflowstates.MessageRequestFormFlowstate.values = r7
            int r6 = r6 % 2
            r6 = 0
        L31:
            r2.<init>(r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.chat.chatflowstates.MessageRequestFormFlowstate.<init>(int, java.lang.String, java.lang.String, boolean, int, o.getTargetTypes):void");
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        private Companion() {
        }
    }

    public final String getScreenOpenedFrom() {
        String string;
        try {
            int i = values + 53;
            ag$a = i % 128;
            if ((i % 2 != 0 ? 'R' : 'Y') != 'Y') {
                string = getString(this.screenOpenedFromKey, "");
                int i2 = 64 / 0;
            } else {
                string = getString(this.screenOpenedFromKey, "");
            }
            int i3 = values + 73;
            ag$a = i3 % 128;
            int i4 = i3 % 2;
            return string;
        } catch (Exception e) {
            throw e;
        }
    }

    public final int getUserId() {
        int i = ag$a + 33;
        values = i % 128;
        int i2 = i % 2;
        Serializable extra = getExtra(this.userId);
        Objects.requireNonNull(extra, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) extra).intValue();
        try {
            int i3 = ag$a + 75;
            try {
                values = i3 % 128;
                if (i3 % 2 != 0) {
                    return intValue;
                }
                int i4 = 80 / 0;
                return intValue;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final boolean isStartDM() {
        int i = values + 15;
        ag$a = i % 128;
        if (i % 2 != 0) {
        }
        return getBoolean(this.IS_START_DM, false);
    }

    public final String getSource() {
        int i = values + 71;
        ag$a = i % 128;
        int i2 = i % 2;
        String string = getString(this.sourceKey, "");
        int i3 = values + 63;
        ag$a = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    private static String valueOf(char[] cArr, int i) {
        String str;
        synchronized (getWantsAllOnMoveCalls.ag$a) {
            char[] getwantsallonmovecalls = getWantsAllOnMoveCalls.toString(toString, cArr, i);
            getWantsAllOnMoveCalls.values = 4;
            while (getWantsAllOnMoveCalls.values < getwantsallonmovecalls.length) {
                getWantsAllOnMoveCalls.toString = getWantsAllOnMoveCalls.values - 4;
                getwantsallonmovecalls[getWantsAllOnMoveCalls.values] = (char) ((getwantsallonmovecalls[getWantsAllOnMoveCalls.values] ^ getwantsallonmovecalls[getWantsAllOnMoveCalls.values % 4]) ^ (getWantsAllOnMoveCalls.toString * toString));
                getWantsAllOnMoveCalls.values++;
            }
            str = new String(getwantsallonmovecalls, 4, getwantsallonmovecalls.length - 4);
        }
        return str;
    }
}
