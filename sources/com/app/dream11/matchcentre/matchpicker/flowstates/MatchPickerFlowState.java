package com.app.dream11.matchcentre.matchpicker.flowstates;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import o.move;
import o.runAnimators;
/* loaded from: classes3.dex */
public class MatchPickerFlowState extends FlowState {
    private static int ah$a = 1;
    private static long toString = -4902473475713744892L;
    private static int valueOf;
    private static char[] values = {35067, 18658, 2291, 51439, 35066, 's', 49259, 32893, 16510, 's', 49265};
    private final String channelUrl;
    private final String contestName;
    private final Integer contestSize;
    private final Double entryFee;
    private final String roundMessage;
    private final boolean shouldSendContestCardToGroup;
    private final String source;
    private final String title;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ MatchPickerFlowState(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.Integer r16, java.lang.String r17, java.lang.Double r18, java.lang.String r19, boolean r20, int r21, o.getTargetTypes r22) {
        /*
            r12 = this;
            r0 = r21
            r1 = r0 & 2
            java.lang.String r2 = ""
            if (r1 == 0) goto L14
            int r1 = com.app.dream11.matchcentre.matchpicker.flowstates.MatchPickerFlowState.valueOf
            int r1 = r1 + 95
            int r3 = r1 % 128
            com.app.dream11.matchcentre.matchpicker.flowstates.MatchPickerFlowState.ah$a = r3
            int r1 = r1 % 2
            r5 = r2
            goto L15
        L14:
            r5 = r14
        L15:
            r1 = r0 & 4
            if (r1 == 0) goto L27
            int r1 = com.app.dream11.matchcentre.matchpicker.flowstates.MatchPickerFlowState.valueOf     // Catch: java.lang.Exception -> L25
            int r1 = r1 + 121
            int r3 = r1 % 128
            com.app.dream11.matchcentre.matchpicker.flowstates.MatchPickerFlowState.ah$a = r3     // Catch: java.lang.Exception -> L25
            int r1 = r1 % 2
            r6 = r2
            goto L28
        L25:
            r0 = move-exception
            goto L7c
        L27:
            r6 = r15
        L28:
            r1 = r0 & 8
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            r1 = 1
            goto L31
        L30:
            r1 = 0
        L31:
            if (r1 == r3) goto L36
            r7 = r16
            goto L4c
        L36:
            int r1 = com.app.dream11.matchcentre.matchpicker.flowstates.MatchPickerFlowState.ah$a
            int r1 = r1 + 123
            int r4 = r1 % 128
            com.app.dream11.matchcentre.matchpicker.flowstates.MatchPickerFlowState.valueOf = r4
            int r1 = r1 % 2
            r1 = 0
            int r4 = com.app.dream11.matchcentre.matchpicker.flowstates.MatchPickerFlowState.valueOf
            int r4 = r4 + 119
            int r7 = r4 % 128
            com.app.dream11.matchcentre.matchpicker.flowstates.MatchPickerFlowState.ah$a = r7
            int r4 = r4 % 2
            r7 = r1
        L4c:
            r0 = r0 & 128(0x80, float:1.794E-43)
            r1 = 31
            if (r0 == 0) goto L55
            r0 = 31
            goto L57
        L55:
            r0 = 28
        L57:
            if (r0 == r1) goto L5c
            r11 = r20
            goto L70
        L5c:
            int r0 = com.app.dream11.matchcentre.matchpicker.flowstates.MatchPickerFlowState.valueOf     // Catch: java.lang.Exception -> L25
            int r0 = r0 + 5
            int r1 = r0 % 128
            com.app.dream11.matchcentre.matchpicker.flowstates.MatchPickerFlowState.ah$a = r1     // Catch: java.lang.Exception -> L25
            int r0 = r0 % 2
            if (r0 != 0) goto L6a
            r0 = 1
            goto L6b
        L6a:
            r0 = 0
        L6b:
            if (r0 == r3) goto L6e
            goto L6f
        L6e:
            r2 = 1
        L6f:
            r11 = r2
        L70:
            r3 = r12
            r4 = r13
            r8 = r17
            r9 = r18
            r10 = r19
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L7c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.matchcentre.matchpicker.flowstates.MatchPickerFlowState.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Double, java.lang.String, boolean, int, o.getTargetTypes):void");
    }

    public final String getChannelUrl() {
        int i = valueOf + 87;
        ah$a = i % 128;
        if (i % 2 == 0) {
            String str = this.channelUrl;
            Object obj = null;
            super.hashCode();
            return str;
        }
        return this.channelUrl;
    }

    public final String getSource() {
        String str;
        int i = ah$a + 41;
        valueOf = i % 128;
        if ((i % 2 != 0 ? '%' : (char) 17) != '%') {
            str = this.source;
        } else {
            try {
                str = this.source;
                Object[] objArr = null;
                int length = objArr.length;
            } catch (Exception e) {
                throw e;
            }
        }
        int i2 = valueOf + 71;
        ah$a = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final Integer getContestSize() {
        int i = valueOf + 47;
        ah$a = i % 128;
        int i2 = i % 2;
        Integer num = this.contestSize;
        int i3 = ah$a + 9;
        valueOf = i3 % 128;
        if ((i3 % 2 != 0 ? '&' : 'Z') != '&') {
            return num;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return num;
    }

    public final String getTitle() {
        int i = ah$a + 125;
        valueOf = i % 128;
        int i2 = i % 2;
        try {
            String str = this.title;
            int i3 = ah$a + 25;
            valueOf = i3 % 128;
            if (i3 % 2 == 0) {
                return str;
            }
            Object obj = null;
            super.hashCode();
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String getContestName() {
        try {
            int i = ah$a + 97;
            try {
                valueOf = i % 128;
                int i2 = i % 2;
                String str = this.contestName;
                int i3 = valueOf + 13;
                ah$a = i3 % 128;
                int i4 = i3 % 2;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final Double getEntryFee() {
        int i = ah$a + 33;
        valueOf = i % 128;
        if ((i % 2 != 0 ? '(' : '4') != '4') {
            int i2 = 21 / 0;
            return this.entryFee;
        }
        try {
            return this.entryFee;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String getRoundMessage() {
        String str;
        int i = valueOf + 15;
        ah$a = i % 128;
        if ((i % 2 == 0 ? 'M' : 'O') != 'M') {
            try {
                str = this.roundMessage;
            } catch (Exception e) {
                throw e;
            }
        } else {
            str = this.roundMessage;
            int i2 = 36 / 0;
        }
        int i3 = valueOf + 107;
        ah$a = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public final boolean getShouldSendContestCardToGroup() {
        int i = valueOf + 123;
        ah$a = i % 128;
        if (i % 2 != 0) {
            try {
                return this.shouldSendContestCardToGroup;
            } catch (Exception e) {
                throw e;
            }
        }
        boolean z = this.shouldSendContestCardToGroup;
        Object obj = null;
        super.hashCode();
        return z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchPickerFlowState(String str, String str2, String str3, Integer num, String str4, Double d, String str5, boolean z) {
        super(FlowStates.MATCH_PICKER_FLOW_STATE, null, 2, null);
        runAnimators.ag$a(str2, "channelUrl");
        runAnimators.ag$a(str3, valueOf(5 - (ViewConfiguration.getPressedStateDuration() >> 16), Color.blue(0), (char) (Color.blue(0) + 34959)).intern());
        this.source = str;
        this.channelUrl = str2;
        this.title = str3;
        this.contestSize = num;
        this.contestName = str4;
        this.entryFee = d;
        this.roundMessage = str5;
        this.shouldSendContestCardToGroup = z;
        if (str != null) {
            putExtra(valueOf(6 - ((Process.getThreadPriority(0) + 20) >> 6), 4 - TextUtils.lastIndexOf("", '0'), (char) ((-1) - TextUtils.lastIndexOf("", '0'))).intern(), getSource());
            int i = ah$a + 53;
            valueOf = i % 128;
            int i2 = i % 2;
        }
        putExtra("channelUrl", str2);
        putExtra(valueOf(4 - ImageFormat.getBitsPerPixel(0), View.resolveSizeAndState(0, 0, 0), (char) (34958 - Process.getGidForName(""))).intern(), str3);
        if (str4 != null) {
            putExtra("contestName", getContestName());
            int i3 = valueOf + 39;
            ah$a = i3 % 128;
            int i4 = i3 % 2;
        }
        if (d == null) {
            int i5 = ah$a + 7;
            valueOf = i5 % 128;
            int i6 = i5 % 2;
        } else {
            d.doubleValue();
            putExtra("entryFee", getEntryFee());
        }
        putExtra("roundMessage", str5);
        putExtra("createContestType", "CHAT");
        if (num != null) {
            num.intValue();
            putExtra("contestSize", getContestSize());
        }
        putExtra("shouldSendContestCardToGroup", Boolean.valueOf(z));
    }

    private static String valueOf(int i, int i2, char c) {
        String str;
        synchronized (move.valueOf) {
            char[] cArr = new char[i];
            move.values = 0;
            while (move.values < i) {
                cArr[move.values] = (char) ((values[move.values + i2] ^ (move.values * toString)) ^ c);
                move.values++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
