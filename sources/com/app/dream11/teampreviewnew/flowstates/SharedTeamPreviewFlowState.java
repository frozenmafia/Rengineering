package com.app.dream11.teampreviewnew.flowstates;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import o.moveToLast;
import o.runAnimators;
import org.apache.http.message.TokenParser;
/* loaded from: classes3.dex */
public final class SharedTeamPreviewFlowState extends FlowState {
    private static int HaptikSDK$a = 0;
    private static int HaptikSDK$c = 1;
    private static int ag$a = -957325602;
    private static int ah$a = 1121214324;
    private static short[] toString = null;
    private static int valueOf = 34;
    private static byte[] values = {-28, 2, -15, -3, 6, -4};
    private final String channelUrl;
    private final int matchId;
    private final String senderId;
    private final String sharedTime;
    private final String site;
    private final String snapshotId;
    private final String source;
    private final int tourId;

    public static /* synthetic */ SharedTeamPreviewFlowState copy$default(SharedTeamPreviewFlowState sharedTeamPreviewFlowState, String str, int i, int i2, String str2, String str3, String str4, String str5, String str6, int i3, Object obj) {
        String str7;
        int i4;
        String str8;
        String str9;
        String str10;
        try {
            int i5 = HaptikSDK$c + 87;
            HaptikSDK$a = i5 % 128;
            if (i5 % 2 == 0 ? (i3 & 1) == 0 : (i3 | 0) == 0) {
                str7 = str;
            } else {
                int i6 = HaptikSDK$a + 115;
                HaptikSDK$c = i6 % 128;
                int i7 = i6 % 2;
                str7 = sharedTeamPreviewFlowState.site;
            }
            if ((i3 & 2) != 0) {
                int i8 = HaptikSDK$a + 107;
                HaptikSDK$c = i8 % 128;
                int i9 = i8 % 2;
                i4 = sharedTeamPreviewFlowState.tourId;
            } else {
                i4 = i;
            }
            int i10 = (i3 & 4) != 0 ? sharedTeamPreviewFlowState.matchId : i2;
            if (((i3 & 8) != 0 ? '\n' : TokenParser.CR) != '\r') {
                str8 = sharedTeamPreviewFlowState.source;
                int i11 = HaptikSDK$c + 41;
                HaptikSDK$a = i11 % 128;
                int i12 = i11 % 2;
            } else {
                str8 = str2;
            }
            String str11 = (i3 & 16) != 0 ? sharedTeamPreviewFlowState.snapshotId : str3;
            String str12 = (i3 & 32) != 0 ? sharedTeamPreviewFlowState.sharedTime : str4;
            Object[] objArr = null;
            if ((i3 & 64) != 0) {
                int i13 = HaptikSDK$a + 93;
                HaptikSDK$c = i13 % 128;
                if ((i13 % 2 == 0 ? (char) 11 : '<') != '<') {
                    try {
                        str9 = sharedTeamPreviewFlowState.senderId;
                        int length = objArr.length;
                    } catch (Exception e) {
                        throw e;
                    }
                } else {
                    str9 = sharedTeamPreviewFlowState.senderId;
                }
            } else {
                str9 = str5;
            }
            if (((i3 & 128) != 0 ? (char) 19 : 'Z') != 19) {
                str10 = str6;
            } else {
                int i14 = HaptikSDK$c + 103;
                HaptikSDK$a = i14 % 128;
                if (!(i14 % 2 != 0)) {
                    str10 = sharedTeamPreviewFlowState.channelUrl;
                } else {
                    str10 = sharedTeamPreviewFlowState.channelUrl;
                    int length2 = objArr.length;
                }
            }
            return sharedTeamPreviewFlowState.copy(str7, i4, i10, str8, str11, str12, str9, str10);
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final String component1() {
        String str;
        int i = HaptikSDK$c + 113;
        HaptikSDK$a = i % 128;
        if ((i % 2 != 0 ? 'X' : (char) 16) != 16) {
            str = this.site;
            int i2 = 65 / 0;
        } else {
            str = this.site;
        }
        int i3 = HaptikSDK$a + 31;
        HaptikSDK$c = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public final int component2() {
        int i = HaptikSDK$c + 103;
        HaptikSDK$a = i % 128;
        if ((i % 2 != 0 ? (char) 1 : ';') != 1) {
            return this.tourId;
        }
        int i2 = this.tourId;
        Object[] objArr = null;
        int length = objArr.length;
        return i2;
    }

    public final int component3() {
        int i = HaptikSDK$a + 109;
        HaptikSDK$c = i % 128;
        if ((i % 2 == 0 ? TokenParser.ESCAPE : 'C') != '\\') {
            return this.matchId;
        }
        int i2 = this.matchId;
        Object obj = null;
        super.hashCode();
        return i2;
    }

    public final String component4() {
        int i = HaptikSDK$a + 3;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        String str = this.source;
        int i3 = HaptikSDK$c + 67;
        HaptikSDK$a = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public final String component5() {
        try {
            int i = HaptikSDK$c + 67;
            HaptikSDK$a = i % 128;
            int i2 = i % 2;
            String str = this.snapshotId;
            try {
                int i3 = HaptikSDK$a + 103;
                HaptikSDK$c = i3 % 128;
                int i4 = i3 % 2;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final String component6() {
        int i = HaptikSDK$c + 1;
        HaptikSDK$a = i % 128;
        int i2 = i % 2;
        String str = this.sharedTime;
        int i3 = HaptikSDK$a + 29;
        HaptikSDK$c = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public final String component7() {
        String str;
        int i = HaptikSDK$c + 1;
        HaptikSDK$a = i % 128;
        boolean z = i % 2 == 0;
        Object[] objArr = null;
        if (z) {
            str = this.senderId;
        } else {
            str = this.senderId;
            int length = objArr.length;
        }
        try {
            int i2 = HaptikSDK$a + 51;
            HaptikSDK$c = i2 % 128;
            if ((i2 % 2 == 0 ? (char) 25 : '+') != '+') {
                int length2 = objArr.length;
                return str;
            }
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String component8() {
        int i = HaptikSDK$a + 23;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        String str = this.channelUrl;
        int i3 = HaptikSDK$c + 15;
        HaptikSDK$a = i3 % 128;
        if ((i3 % 2 != 0 ? (char) 6 : (char) 20) != 6) {
            return str;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return str;
    }

    public final SharedTeamPreviewFlowState copy(String str, int i, int i2, String str2, String str3, String str4, String str5, String str6) {
        runAnimators.ag$a(str, FlowState.SITE);
        runAnimators.ag$a(str2, values((byte) Color.argb(0, 0, 0, 0), (-35) - Color.argb(0, 0, 0, 0), TextUtils.getOffsetBefore("", 0) - 1121214209, (short) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 957325602).intern());
        runAnimators.ag$a(str3, "snapshotId");
        runAnimators.ag$a(str4, "sharedTime");
        SharedTeamPreviewFlowState sharedTeamPreviewFlowState = new SharedTeamPreviewFlowState(str, i, i2, str2, str3, str4, str5, str6);
        int i3 = HaptikSDK$c + 13;
        HaptikSDK$a = i3 % 128;
        if (!(i3 % 2 != 0)) {
            return sharedTeamPreviewFlowState;
        }
        int i4 = 16 / 0;
        return sharedTeamPreviewFlowState;
    }

    public boolean equals(Object obj) {
        int i = HaptikSDK$c + 33;
        HaptikSDK$a = i % 128;
        int i2 = i % 2;
        if ((this == obj ? 'b' : (char) 6) != 6) {
            int i3 = HaptikSDK$c + 11;
            HaptikSDK$a = i3 % 128;
            int i4 = i3 % 2;
            return true;
        } else if (!(obj instanceof SharedTeamPreviewFlowState)) {
            int i5 = HaptikSDK$c + 79;
            HaptikSDK$a = i5 % 128;
            int i6 = i5 % 2;
            int i7 = HaptikSDK$c + 117;
            HaptikSDK$a = i7 % 128;
            int i8 = i7 % 2;
            return false;
        } else {
            SharedTeamPreviewFlowState sharedTeamPreviewFlowState = (SharedTeamPreviewFlowState) obj;
            try {
                if ((!runAnimators.values((Object) this.site, (Object) sharedTeamPreviewFlowState.site) ? ']' : '1') == ']') {
                    int i9 = HaptikSDK$a + 11;
                    HaptikSDK$c = i9 % 128;
                    int i10 = i9 % 2;
                    return false;
                } else if (this.tourId != sharedTeamPreviewFlowState.tourId) {
                    return false;
                } else {
                    if (this.matchId != sharedTeamPreviewFlowState.matchId) {
                        int i11 = HaptikSDK$a + 43;
                        HaptikSDK$c = i11 % 128;
                        return (i11 % 2 == 0 ? '_' : 'L') == '_';
                    }
                    try {
                        if ((!runAnimators.values((Object) this.source, (Object) sharedTeamPreviewFlowState.source) ? 'A' : 'S') == 'A' || !runAnimators.values((Object) this.snapshotId, (Object) sharedTeamPreviewFlowState.snapshotId)) {
                            return false;
                        }
                        if (!runAnimators.values((Object) this.sharedTime, (Object) sharedTeamPreviewFlowState.sharedTime)) {
                            int i12 = HaptikSDK$c + 89;
                            HaptikSDK$a = i12 % 128;
                            return i12 % 2 != 0;
                        } else if (runAnimators.values((Object) this.senderId, (Object) sharedTeamPreviewFlowState.senderId)) {
                            return !(!runAnimators.values((Object) this.channelUrl, (Object) sharedTeamPreviewFlowState.channelUrl));
                        } else {
                            int i13 = HaptikSDK$a + 3;
                            HaptikSDK$c = i13 % 128;
                            return i13 % 2 == 0;
                        }
                    } catch (Exception e) {
                        throw e;
                    }
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    public int hashCode() {
        int i;
        int i2 = HaptikSDK$c + 9;
        HaptikSDK$a = i2 % 128;
        int i3 = i2 % 2;
        int hashCode = this.site.hashCode();
        int i4 = this.tourId;
        int i5 = this.matchId;
        int hashCode2 = this.source.hashCode();
        int hashCode3 = this.snapshotId.hashCode();
        int hashCode4 = this.sharedTime.hashCode();
        String str = this.senderId;
        int i6 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            int i7 = HaptikSDK$c + 49;
            HaptikSDK$a = i7 % 128;
            int i8 = i7 % 2;
            i = 0;
        }
        try {
            String str2 = this.channelUrl;
            if (str2 != null) {
                i6 = str2.hashCode();
                int i9 = HaptikSDK$c + 37;
                HaptikSDK$a = i9 % 128;
                int i10 = i9 % 2;
            }
            int i11 = (((((((((((((hashCode * 31) + i4) * 31) + i5) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i) * 31) + i6;
            try {
                int i12 = HaptikSDK$c + 57;
                HaptikSDK$a = i12 % 128;
                int i13 = i12 % 2;
                return i11;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.app.dream11.model.FlowState
    public String toString() {
        String str = "SharedTeamPreviewFlowState(site=" + this.site + ", tourId=" + this.tourId + ", matchId=" + this.matchId + ", source=" + this.source + ", snapshotId=" + this.snapshotId + ", sharedTime=" + this.sharedTime + ", senderId=" + this.senderId + ", channelUrl=" + this.channelUrl + ")";
        int i = HaptikSDK$c + 119;
        HaptikSDK$a = i % 128;
        int i2 = i % 2;
        return str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ SharedTeamPreviewFlowState(java.lang.String r14, int r15, int r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, o.getTargetTypes r23) {
        /*
            r13 = this;
            r0 = r22
            r1 = r0 & 64
            r2 = 6
            if (r1 == 0) goto La
            r1 = 56
            goto Lb
        La:
            r1 = 6
        Lb:
            r3 = 0
            if (r1 == r2) goto L1a
            int r1 = com.app.dream11.teampreviewnew.flowstates.SharedTeamPreviewFlowState.HaptikSDK$a
            int r1 = r1 + 11
            int r2 = r1 % 128
            com.app.dream11.teampreviewnew.flowstates.SharedTeamPreviewFlowState.HaptikSDK$c = r2
            int r1 = r1 % 2
            r11 = r3
            goto L1c
        L1a:
            r11 = r20
        L1c:
            r0 = r0 & 128(0x80, float:1.794E-43)
            r1 = 1
            if (r0 == 0) goto L23
            r0 = 0
            goto L24
        L23:
            r0 = 1
        L24:
            if (r0 == r1) goto L32
            int r0 = com.app.dream11.teampreviewnew.flowstates.SharedTeamPreviewFlowState.HaptikSDK$a
            int r0 = r0 + 123
            int r1 = r0 % 128
            com.app.dream11.teampreviewnew.flowstates.SharedTeamPreviewFlowState.HaptikSDK$c = r1
            int r0 = r0 % 2
            r12 = r3
            goto L34
        L32:
            r12 = r21
        L34:
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.teampreviewnew.flowstates.SharedTeamPreviewFlowState.<init>(java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, o.getTargetTypes):void");
    }

    public final String getSite() {
        try {
            int i = HaptikSDK$a + 5;
            try {
                HaptikSDK$c = i % 128;
                int i2 = i % 2;
                String str = this.site;
                int i3 = HaptikSDK$a + 69;
                HaptikSDK$c = i3 % 128;
                int i4 = i3 % 2;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final int getTourId() {
        int i = HaptikSDK$c + 117;
        HaptikSDK$a = i % 128;
        if ((i % 2 != 0 ? (char) 17 : '\n') != '\n') {
            int i2 = 52 / 0;
            return this.tourId;
        }
        try {
            return this.tourId;
        } catch (Exception e) {
            throw e;
        }
    }

    public final int getMatchId() {
        int i = HaptikSDK$c + 83;
        HaptikSDK$a = i % 128;
        int i2 = i % 2;
        int i3 = this.matchId;
        int i4 = HaptikSDK$c + 17;
        HaptikSDK$a = i4 % 128;
        if ((i4 % 2 != 0 ? (char) 7 : (char) 31) != 7) {
            return i3;
        }
        int i5 = 19 / 0;
        return i3;
    }

    public final String getSource() {
        String str;
        try {
            int i = HaptikSDK$a + 59;
            try {
                HaptikSDK$c = i % 128;
                if ((i % 2 == 0 ? (char) 31 : 'E') != 31) {
                    str = this.source;
                } else {
                    str = this.source;
                    Object[] objArr = null;
                    int length = objArr.length;
                }
                int i2 = HaptikSDK$c + 89;
                HaptikSDK$a = i2 % 128;
                int i3 = i2 % 2;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final String getSnapshotId() {
        int i = HaptikSDK$c + 39;
        HaptikSDK$a = i % 128;
        int i2 = i % 2;
        String str = this.snapshotId;
        try {
            int i3 = HaptikSDK$c + 41;
            try {
                HaptikSDK$a = i3 % 128;
                int i4 = i3 % 2;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final String getSharedTime() {
        try {
            int i = HaptikSDK$a + 31;
            HaptikSDK$c = i % 128;
            int i2 = i % 2;
            String str = this.sharedTime;
            int i3 = HaptikSDK$c + 89;
            HaptikSDK$a = i3 % 128;
            if ((i3 % 2 != 0 ? (char) 6 : '&') != '&') {
                Object obj = null;
                super.hashCode();
                return str;
            }
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String getSenderId() {
        int i = HaptikSDK$c + 61;
        HaptikSDK$a = i % 128;
        if ((i % 2 != 0 ? (char) 4 : 'E') != 4) {
            return this.senderId;
        }
        int i2 = 86 / 0;
        return this.senderId;
    }

    public final String getChannelUrl() {
        String str;
        int i = HaptikSDK$a + 103;
        HaptikSDK$c = i % 128;
        if ((i % 2 == 0 ? 'O' : (char) 11) != 11) {
            str = this.channelUrl;
            int i2 = 35 / 0;
        } else {
            try {
                str = this.channelUrl;
            } catch (Exception e) {
                throw e;
            }
        }
        int i3 = HaptikSDK$c + 3;
        HaptikSDK$a = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTeamPreviewFlowState(String str, int i, int i2, String str2, String str3, String str4, String str5, String str6) {
        super(FlowStates.TEAM_PREVIEW_SHARED_TEAM, null, 2, null);
        runAnimators.ag$a(str, FlowState.SITE);
        runAnimators.ag$a(str2, values((byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (-35) - (Process.myPid() >> 22), (-1121214208) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (short) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 957325603).intern());
        runAnimators.ag$a(str3, "snapshotId");
        runAnimators.ag$a(str4, "sharedTime");
        this.site = str;
        this.tourId = i;
        this.matchId = i2;
        this.source = str2;
        this.snapshotId = str3;
        this.sharedTime = str4;
        this.senderId = str5;
        this.channelUrl = str6;
    }

    private static String values(byte b2, int i, int i2, short s, int i3) {
        String obj;
        synchronized (moveToLast.ah$a) {
            StringBuilder sb = new StringBuilder();
            int i4 = i + valueOf;
            boolean z = i4 == -1;
            if (z) {
                if (values != null) {
                    i4 = (byte) (values[ag$a + i3] + valueOf);
                } else {
                    i4 = (short) (toString[ag$a + i3] + valueOf);
                }
            }
            if (i4 > 0) {
                moveToLast.values = ((i3 + i4) - 2) + ag$a + (z ? 1 : 0);
                moveToLast.ag$a = (char) (i2 + ah$a);
                sb.append(moveToLast.ag$a);
                moveToLast.toString = moveToLast.ag$a;
                moveToLast.valueOf = 1;
                while (moveToLast.valueOf < i4) {
                    if (values != null) {
                        byte[] bArr = values;
                        int i5 = moveToLast.values;
                        moveToLast.values = i5 - 1;
                        moveToLast.ag$a = (char) (moveToLast.toString + (((byte) (bArr[i5] + s)) ^ b2));
                    } else {
                        short[] sArr = toString;
                        int i6 = moveToLast.values;
                        moveToLast.values = i6 - 1;
                        moveToLast.ag$a = (char) (moveToLast.toString + (((short) (sArr[i6] + s)) ^ b2));
                    }
                    sb.append(moveToLast.ag$a);
                    moveToLast.toString = moveToLast.ag$a;
                    moveToLast.valueOf++;
                }
            }
            obj = sb.toString();
        }
        return obj;
    }
}
