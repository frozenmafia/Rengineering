package com.app.dream11.chat.models;

import android.view.ViewConfiguration;
import com.app.dream11.contest.teamcompare.CompareTeamFlowState;
import com.apxor.androidsdk.core.Constants;
import o.isFullSpan;
import o.moveToFirst;
import o.runAnimators;
import org.apache.http.message.TokenParser;
/* loaded from: classes.dex */
public final class ChatContestCardMetaInfo {
    private static int HaptikSDK$c = 1;
    private static int ag$a = 0;
    private static char ah$a = 31843;
    private static char toString = 34370;
    private static char valueOf = 6124;
    private static char values = 2696;
    @isFullSpan(valueOf = Constants.CATEGORY)
    private final String category;
    @isFullSpan(valueOf = "contestName")
    private final String contestName;
    @isFullSpan(valueOf = "contestSize")
    private final int contestSize;
    @isFullSpan(valueOf = "entryFee")
    private final double entryFee;
    @isFullSpan(valueOf = "entryFeeDisplayText")
    private final String entryFeeDisplayText;
    @isFullSpan(valueOf = CompareTeamFlowState.CONTEST_ID)
    private final String id;
    @isFullSpan(valueOf = "inviteCode")
    private final String inviteCode;
    @isFullSpan(valueOf = "isConfirmed")
    private final boolean isConfirmed;
    @isFullSpan(valueOf = "isFlexible")
    private final boolean isFlexible;
    @isFullSpan(valueOf = "isMultiEntry")
    private final boolean isMultiEntry;
    @isFullSpan(valueOf = "prizeAmount")
    private final double prizeAmount;
    @isFullSpan(valueOf = "prizePoolDisplayText")
    private final String prizePoolDisplayText;
    @isFullSpan(valueOf = "type")
    private final String type;

    public static /* synthetic */ ChatContestCardMetaInfo copy$default(ChatContestCardMetaInfo chatContestCardMetaInfo, String str, String str2, String str3, double d, String str4, int i, String str5, String str6, String str7, boolean z, boolean z2, double d2, boolean z3, int i2, Object obj) {
        double d3;
        int i3;
        String str8;
        double d4;
        boolean z4;
        String str9 = (i2 & 1) != 0 ? chatContestCardMetaInfo.id : str;
        String str10 = (i2 & 2) != 0 ? chatContestCardMetaInfo.inviteCode : str2;
        String str11 = (i2 & 4) != 0 ? chatContestCardMetaInfo.contestName : str3;
        if ((i2 & 8) != 0) {
            int i4 = ag$a + 59;
            HaptikSDK$c = i4 % 128;
            boolean z5 = i4 % 2 != 0;
            d3 = chatContestCardMetaInfo.entryFee;
            if (!z5) {
                int i5 = 47 / 0;
            }
        } else {
            d3 = d;
        }
        String str12 = (i2 & 16) != 0 ? chatContestCardMetaInfo.prizePoolDisplayText : str4;
        if ((i2 & 32) != 0) {
            try {
                i3 = chatContestCardMetaInfo.contestSize;
            } catch (Exception e) {
                throw e;
            }
        } else {
            i3 = i;
        }
        String str13 = (i2 & 64) != 0 ? chatContestCardMetaInfo.entryFeeDisplayText : str5;
        if (!((i2 & 128) == 0)) {
            int i6 = ag$a + 9;
            HaptikSDK$c = i6 % 128;
            if (i6 % 2 == 0) {
                str8 = chatContestCardMetaInfo.type;
                int i7 = 73 / 0;
            } else {
                str8 = chatContestCardMetaInfo.type;
            }
        } else {
            str8 = str6;
        }
        String str14 = (i2 & 256) != 0 ? chatContestCardMetaInfo.category : str7;
        boolean z6 = (i2 & 512) != 0 ? chatContestCardMetaInfo.isMultiEntry : z;
        boolean z7 = (i2 & 1024) != 0 ? chatContestCardMetaInfo.isConfirmed : z2;
        if (((i2 & 2048) != 0 ? (char) 3 : '&') != 3) {
            d4 = d2;
        } else {
            double d5 = chatContestCardMetaInfo.prizeAmount;
            int i8 = ag$a + 37;
            HaptikSDK$c = i8 % 128;
            int i9 = i8 % 2;
            d4 = d5;
        }
        if (((i2 & 4096) != 0 ? 'E' : '\f') != 'E') {
            z4 = z3;
        } else {
            int i10 = HaptikSDK$c + 45;
            ag$a = i10 % 128;
            int i11 = i10 % 2;
            z4 = chatContestCardMetaInfo.isFlexible;
        }
        return chatContestCardMetaInfo.copy(str9, str10, str11, d3, str12, i3, str13, str8, str14, z6, z7, d4, z4);
    }

    public final String component1() {
        int i = HaptikSDK$c + 55;
        ag$a = i % 128;
        int i2 = i % 2;
        String str = this.id;
        int i3 = HaptikSDK$c + 39;
        ag$a = i3 % 128;
        if ((i3 % 2 != 0 ? '(' : '\n') != '\n') {
            Object[] objArr = null;
            int length = objArr.length;
            return str;
        }
        return str;
    }

    public final boolean component10() {
        boolean z;
        try {
            int i = HaptikSDK$c + 73;
            try {
                ag$a = i % 128;
                if (i % 2 == 0) {
                    z = this.isMultiEntry;
                } else {
                    z = this.isMultiEntry;
                    Object obj = null;
                    super.hashCode();
                }
                int i2 = HaptikSDK$c + 17;
                ag$a = i2 % 128;
                int i3 = i2 % 2;
                return z;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final boolean component11() {
        try {
            int i = ag$a + 83;
            HaptikSDK$c = i % 128;
            int i2 = i % 2;
            boolean z = this.isConfirmed;
            int i3 = HaptikSDK$c + 39;
            try {
                ag$a = i3 % 128;
                int i4 = i3 % 2;
                return z;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final double component12() {
        double d;
        int i = ag$a + 7;
        HaptikSDK$c = i % 128;
        Object[] objArr = null;
        if ((i % 2 == 0 ? 'D' : (char) 24) != 24) {
            d = this.prizeAmount;
            int length = objArr.length;
        } else {
            d = this.prizeAmount;
        }
        try {
            int i2 = HaptikSDK$c + 47;
            ag$a = i2 % 128;
            if ((i2 % 2 != 0 ? 'b' : 'B') != 'B') {
                int length2 = objArr.length;
                return d;
            }
            return d;
        } catch (Exception e) {
            throw e;
        }
    }

    public final boolean component13() {
        int i = HaptikSDK$c + 109;
        ag$a = i % 128;
        int i2 = i % 2;
        boolean z = this.isFlexible;
        int i3 = ag$a + 25;
        HaptikSDK$c = i3 % 128;
        if ((i3 % 2 == 0 ? (char) 28 : (char) 14) != 28) {
            return z;
        }
        int i4 = 87 / 0;
        return z;
    }

    public final String component2() {
        String str;
        try {
            int i = ag$a + 51;
            HaptikSDK$c = i % 128;
            Object obj = null;
            if ((i % 2 == 0 ? (char) 1 : (char) 23) != 23) {
                str = this.inviteCode;
                super.hashCode();
            } else {
                str = this.inviteCode;
            }
            int i2 = ag$a + 111;
            HaptikSDK$c = i2 % 128;
            if ((i2 % 2 == 0 ? (char) 0 : 'L') != 0) {
                return str;
            }
            super.hashCode();
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String component3() {
        try {
            int i = HaptikSDK$c + 9;
            try {
                ag$a = i % 128;
                int i2 = i % 2;
                String str = this.contestName;
                int i3 = HaptikSDK$c + 87;
                ag$a = i3 % 128;
                int i4 = i3 % 2;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final double component4() {
        int i = ag$a + 73;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        double d = this.entryFee;
        int i3 = HaptikSDK$c + 69;
        ag$a = i3 % 128;
        if ((i3 % 2 != 0 ? 'S' : 'T') != 'T') {
            Object[] objArr = null;
            int length = objArr.length;
            return d;
        }
        return d;
    }

    public final String component5() {
        try {
            int i = ag$a + 19;
            try {
                HaptikSDK$c = i % 128;
                int i2 = i % 2;
                String str = this.prizePoolDisplayText;
                int i3 = HaptikSDK$c + 15;
                ag$a = i3 % 128;
                if ((i3 % 2 != 0 ? '8' : 'K') != '8') {
                    return str;
                }
                Object[] objArr = null;
                int length = objArr.length;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final int component6() {
        int i = ag$a + 59;
        HaptikSDK$c = i % 128;
        if ((i % 2 == 0 ? 'T' : (char) 7) != 'T') {
            return this.contestSize;
        }
        int i2 = this.contestSize;
        Object obj = null;
        super.hashCode();
        return i2;
    }

    public final String component7() {
        int i = ag$a + 65;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        try {
            String str = this.entryFeeDisplayText;
            int i3 = ag$a + 113;
            HaptikSDK$c = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String component8() {
        int i = ag$a + 49;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        String str = this.type;
        int i3 = ag$a + 93;
        HaptikSDK$c = i3 % 128;
        if ((i3 % 2 == 0 ? '2' : '+') != '+') {
            Object[] objArr = null;
            int length = objArr.length;
            return str;
        }
        return str;
    }

    public final String component9() {
        int i = HaptikSDK$c + 49;
        ag$a = i % 128;
        if (i % 2 == 0) {
            try {
                return this.category;
            } catch (Exception e) {
                throw e;
            }
        }
        String str = this.category;
        Object[] objArr = null;
        int length = objArr.length;
        return str;
    }

    public final ChatContestCardMetaInfo copy(String str, String str2, String str3, double d, String str4, int i, String str5, String str6, String str7, boolean z, boolean z2, double d2, boolean z3) {
        runAnimators.ag$a(str, values(new char[]{64420, 22710}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2).intern());
        ChatContestCardMetaInfo chatContestCardMetaInfo = new ChatContestCardMetaInfo(str, str2, str3, d, str4, i, str5, str6, str7, z, z2, d2, z3);
        int i2 = ag$a + 61;
        HaptikSDK$c = i2 % 128;
        int i3 = i2 % 2;
        return chatContestCardMetaInfo;
    }

    public boolean equals(Object obj) {
        if (!(this != obj)) {
            return true;
        }
        if (!(obj instanceof ChatContestCardMetaInfo)) {
            int i = ag$a + 7;
            HaptikSDK$c = i % 128;
            int i2 = i % 2;
            return false;
        }
        ChatContestCardMetaInfo chatContestCardMetaInfo = (ChatContestCardMetaInfo) obj;
        if (!(!runAnimators.values((Object) this.id, (Object) chatContestCardMetaInfo.id))) {
            if (!runAnimators.values((Object) this.inviteCode, (Object) chatContestCardMetaInfo.inviteCode)) {
                int i3 = HaptikSDK$c + 23;
                ag$a = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (!runAnimators.values((Object) this.contestName, (Object) chatContestCardMetaInfo.contestName)) {
                int i5 = HaptikSDK$c + 99;
                ag$a = i5 % 128;
                int i6 = i5 % 2;
                return false;
            } else if (!runAnimators.values(Double.valueOf(this.entryFee), Double.valueOf(chatContestCardMetaInfo.entryFee))) {
                return false;
            } else {
                if (!runAnimators.values((Object) this.prizePoolDisplayText, (Object) chatContestCardMetaInfo.prizePoolDisplayText)) {
                    int i7 = ag$a + 99;
                    HaptikSDK$c = i7 % 128;
                    int i8 = i7 % 2;
                    return false;
                } else if (this.contestSize != chatContestCardMetaInfo.contestSize) {
                    int i9 = ag$a + 15;
                    HaptikSDK$c = i9 % 128;
                    if (i9 % 2 == 0) {
                        int i10 = 31 / 0;
                        return false;
                    }
                    return false;
                } else if (!runAnimators.values((Object) this.entryFeeDisplayText, (Object) chatContestCardMetaInfo.entryFeeDisplayText)) {
                    int i11 = HaptikSDK$c + 109;
                    ag$a = i11 % 128;
                    int i12 = i11 % 2;
                    return false;
                } else {
                    if ((!runAnimators.values((Object) this.type, (Object) chatContestCardMetaInfo.type) ? (char) 0 : '_') != 0) {
                        try {
                            if (!runAnimators.values((Object) this.category, (Object) chatContestCardMetaInfo.category)) {
                                int i13 = HaptikSDK$c + 103;
                                ag$a = i13 % 128;
                                int i14 = i13 % 2;
                                return false;
                            } else if (this.isMultiEntry == chatContestCardMetaInfo.isMultiEntry && this.isConfirmed == chatContestCardMetaInfo.isConfirmed) {
                                if ((!runAnimators.values(Double.valueOf(this.prizeAmount), Double.valueOf(chatContestCardMetaInfo.prizeAmount)) ? 'Y' : 'H') != 'H') {
                                    return false;
                                }
                                if (this.isFlexible != chatContestCardMetaInfo.isFlexible) {
                                    int i15 = ag$a + 125;
                                    HaptikSDK$c = i15 % 128;
                                    int i16 = i15 % 2;
                                    return false;
                                }
                                return true;
                            } else {
                                return false;
                            }
                        } catch (Exception e) {
                            throw e;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r3 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
        r3 = com.app.dream11.chat.models.ChatContestCardMetaInfo.ag$a + 89;
        com.app.dream11.chat.models.ChatContestCardMetaInfo.HaptikSDK$c = r3 % 128;
        r3 = r3 % 2;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        r3 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r3 == null) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.chat.models.ChatContestCardMetaInfo.hashCode():int");
    }

    public String toString() {
        String str = "ChatContestCardMetaInfo(id=" + this.id + ", inviteCode=" + this.inviteCode + ", contestName=" + this.contestName + ", entryFee=" + this.entryFee + ", prizePoolDisplayText=" + this.prizePoolDisplayText + ", contestSize=" + this.contestSize + ", entryFeeDisplayText=" + this.entryFeeDisplayText + ", type=" + this.type + ", category=" + this.category + ", isMultiEntry=" + this.isMultiEntry + ", isConfirmed=" + this.isConfirmed + ", prizeAmount=" + this.prizeAmount + ", isFlexible=" + this.isFlexible + ")";
        int i = ag$a + 67;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        return str;
    }

    public ChatContestCardMetaInfo(String str, String str2, String str3, double d, String str4, int i, String str5, String str6, String str7, boolean z, boolean z2, double d2, boolean z3) {
        runAnimators.ag$a(str, values(new char[]{64420, 22710}, 2 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern());
        this.id = str;
        this.inviteCode = str2;
        this.contestName = str3;
        this.entryFee = d;
        this.prizePoolDisplayText = str4;
        this.contestSize = i;
        this.entryFeeDisplayText = str5;
        this.type = str6;
        this.category = str7;
        this.isMultiEntry = z;
        this.isConfirmed = z2;
        this.prizeAmount = d2;
        this.isFlexible = z3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ChatContestCardMetaInfo(java.lang.String r19, java.lang.String r20, java.lang.String r21, double r22, java.lang.String r24, int r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, boolean r29, boolean r30, double r31, boolean r33, int r34, o.getTargetTypes r35) {
        /*
            r18 = this;
            r0 = r34
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L27
            int r0 = com.app.dream11.chat.models.ChatContestCardMetaInfo.ag$a
            int r0 = r0 + 109
            int r1 = r0 % 128
            com.app.dream11.chat.models.ChatContestCardMetaInfo.HaptikSDK$c = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L16
            r0 = 0
            goto L17
        L16:
            r0 = 1
        L17:
            if (r0 == r2) goto L1a
            r1 = 1
        L1a:
            int r0 = com.app.dream11.chat.models.ChatContestCardMetaInfo.ag$a
            int r0 = r0 + 65
            int r2 = r0 % 128
            com.app.dream11.chat.models.ChatContestCardMetaInfo.HaptikSDK$c = r2
            int r0 = r0 % 2
            r17 = r1
            goto L29
        L27:
            r17 = r33
        L29:
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = r28
            r13 = r29
            r14 = r30
            r15 = r31
            r2.<init>(r3, r4, r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.chat.models.ChatContestCardMetaInfo.<init>(java.lang.String, java.lang.String, java.lang.String, double, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, double, boolean, int, o.getTargetTypes):void");
    }

    public final String getId() {
        String str;
        int i = HaptikSDK$c + 21;
        ag$a = i % 128;
        Object[] objArr = null;
        if ((i % 2 != 0 ? (char) 19 : ',') != 19) {
            str = this.id;
        } else {
            str = this.id;
            super.hashCode();
        }
        int i2 = HaptikSDK$c + 23;
        ag$a = i2 % 128;
        if ((i2 % 2 != 0 ? 'I' : '?') != 'I') {
            return str;
        }
        int length = objArr.length;
        return str;
    }

    public final String getContestName() {
        int i = ag$a + 107;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        try {
            String str = this.contestName;
            int i3 = ag$a + 75;
            HaptikSDK$c = i3 % 128;
            if ((i3 % 2 == 0 ? TokenParser.SP : 'Z') != ' ') {
                return str;
            }
            Object[] objArr = null;
            int length = objArr.length;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String getInviteCode() {
        int i = ag$a + 35;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        String str = this.inviteCode;
        int i3 = HaptikSDK$c + 17;
        ag$a = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public final double getEntryFee() {
        try {
            int i = HaptikSDK$c + 115;
            ag$a = i % 128;
            int i2 = i % 2;
            double d = this.entryFee;
            int i3 = HaptikSDK$c + 105;
            try {
                ag$a = i3 % 128;
                if ((i3 % 2 != 0 ? '9' : (char) 14) != 14) {
                    Object obj = null;
                    super.hashCode();
                    return d;
                }
                return d;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final String getPrizePoolDisplayText() {
        String str;
        int i = ag$a + 113;
        HaptikSDK$c = i % 128;
        if ((i % 2 == 0 ? '\b' : '1') != '\b') {
            str = this.prizePoolDisplayText;
        } else {
            try {
                str = this.prizePoolDisplayText;
                int i2 = 1 / 0;
            } catch (Exception e) {
                throw e;
            }
        }
        int i3 = ag$a + 31;
        HaptikSDK$c = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public final int getContestSize() {
        int i;
        int i2 = ag$a + 95;
        HaptikSDK$c = i2 % 128;
        if ((i2 % 2 == 0 ? 'X' : '1') != '1') {
            i = this.contestSize;
            Object[] objArr = null;
            int length = objArr.length;
        } else {
            i = this.contestSize;
        }
        int i3 = HaptikSDK$c + 25;
        ag$a = i3 % 128;
        int i4 = i3 % 2;
        return i;
    }

    public final String getEntryFeeDisplayText() {
        int i = ag$a + 107;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        try {
            String str = this.entryFeeDisplayText;
            int i3 = ag$a + 49;
            HaptikSDK$c = i3 % 128;
            if (i3 % 2 != 0) {
                return str;
            }
            Object obj = null;
            super.hashCode();
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String getType() {
        String str;
        int i = HaptikSDK$c + 117;
        ag$a = i % 128;
        try {
            if ((i % 2 != 0 ? (char) 11 : (char) 7) != 7) {
                str = this.type;
                Object obj = null;
                super.hashCode();
            } else {
                str = this.type;
            }
            int i2 = ag$a + 73;
            HaptikSDK$c = i2 % 128;
            int i3 = i2 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String getCategory() {
        int i = HaptikSDK$c + 101;
        ag$a = i % 128;
        int i2 = i % 2;
        String str = this.category;
        int i3 = ag$a + 125;
        HaptikSDK$c = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public final boolean isMultiEntry() {
        boolean z;
        int i = HaptikSDK$c + 1;
        ag$a = i % 128;
        if (i % 2 != 0) {
            z = this.isMultiEntry;
            Object[] objArr = null;
            int length = objArr.length;
        } else {
            try {
                z = this.isMultiEntry;
            } catch (Exception e) {
                throw e;
            }
        }
        int i2 = ag$a + 125;
        HaptikSDK$c = i2 % 128;
        if (i2 % 2 != 0) {
            return z;
        }
        int i3 = 2 / 0;
        return z;
    }

    public final boolean isConfirmed() {
        int i = HaptikSDK$c + 63;
        ag$a = i % 128;
        if ((i % 2 != 0 ? '@' : '(') != '@') {
            return this.isConfirmed;
        }
        boolean z = this.isConfirmed;
        Object obj = null;
        super.hashCode();
        return z;
    }

    public final double getPrizeAmount() {
        try {
            int i = ag$a + 49;
            HaptikSDK$c = i % 128;
            int i2 = i % 2;
            double d = this.prizeAmount;
            int i3 = ag$a + 91;
            HaptikSDK$c = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 18 / 0;
                return d;
            }
            return d;
        } catch (Exception e) {
            throw e;
        }
    }

    public final boolean isFlexible() {
        int i = ag$a + 81;
        HaptikSDK$c = i % 128;
        if ((i % 2 == 0 ? 'c' : ',') != 'c') {
            try {
                return this.isFlexible;
            } catch (Exception e) {
                throw e;
            }
        }
        try {
            boolean z = this.isFlexible;
            Object obj = null;
            super.hashCode();
            return z;
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String values(char[] cArr, int i) {
        String str;
        synchronized (moveToFirst.ah$a) {
            char[] cArr2 = new char[cArr.length];
            moveToFirst.values = 0;
            char[] cArr3 = new char[2];
            while (moveToFirst.values < cArr.length) {
                cArr3[0] = cArr[moveToFirst.values];
                cArr3[1] = cArr[moveToFirst.values + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    cArr3[1] = (char) (cArr3[1] - (((cArr3[0] + i2) ^ ((cArr3[0] << 4) + values)) ^ ((cArr3[0] >>> 5) + ah$a)));
                    cArr3[0] = (char) (cArr3[0] - (((cArr3[1] + i2) ^ ((cArr3[1] << 4) + valueOf)) ^ ((cArr3[1] >>> 5) + toString)));
                    i2 -= 40503;
                }
                cArr2[moveToFirst.values] = cArr3[0];
                cArr2[moveToFirst.values + 1] = cArr3[1];
                moveToFirst.values += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
