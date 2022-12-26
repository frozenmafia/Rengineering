package com.app.dream11.utils;

import com.app.dream11Pro.R;
import o.TrustedWebActivityCallbackRemote;
import o.isBeforeFirst;
/* loaded from: classes.dex */
public enum Strings {
    Contact_Us(R.string.res_0x7f120007),
    Max_Otp_Message(R.string.res_0x7f12001c),
    Contact_Us_String(R.string.res_0x7f120008),
    Mobile_Change_Message(R.string.res_0x7f12001d),
    PartnerType(R.string.res_0x7f1201fb),
    TimeLeftString(R.string.res_0x7f120cda),
    Seconds(R.string.res_0x7f120923),
    WALLET_BALANCE_SUCCESS_MSG(R.string.res_0x7f120e12),
    PAYMENT_DECLINED(R.string.res_0x7f120947),
    DUPLICATE_RECHARGE(R.string.res_0x7f1203c5),
    FAILED(R.string.res_0x7f120492),
    TRANSACTION_LIMIT_REACHED(R.string.res_0x7f120d1b),
    RECHARGE_CANCELLED(R.string.res_0x7f120a71),
    MAX_RECHARGE_LIMIT_REACHED(R.string.res_0x7f120a74),
    PAYMENT_DECLINED_MSG(R.string.res_0x7f120948),
    FAILED_MSG(R.string.res_0x7f120a73),
    TRANSACTION_LIMIT_REACHED_MSG(R.string.res_0x7f120d1c),
    RECHARGE_CANCELLED_MSG(R.string.res_0x7f120a72),
    MAX_RECHARGE_LIMIT_REACHED_MSG(R.string.res_0x7f120958),
    BACK_PRESSED(R.string.res_0x7f120118),
    PAYMENT_FAILED_MSG(R.string.res_0x7f12094a),
    DefaultError(R.string.res_0x7f120433),
    MatchInProgress(R.string.res_0x7f1207b3),
    MatchCompleted(R.string.res_0x7f1207b2),
    MatchInReview(R.string.res_0x7f1207b4),
    MatchAbandoned(R.string.res_0x7f1207a9),
    MYCONTEST_FIXTURE_EMPTY(R.string.res_0x7f120877),
    MYCONTEST_LIVE_EMPTY(R.string.res_0x7f120878),
    MYCONTEST_RESULT_EMPTY(R.string.res_0x7f120879),
    REFERRAL_SUCCESS_MESSAGE(R.string.res_0x7f120a91),
    NO_JOINED_CONTESTS(R.string.res_0x7f1208be),
    RSLOGO(R.string.res_0x7f120b15),
    HOME_UPCOMING(R.string.res_0x7f1208ab),
    UPCOMING(R.string.res_0x7f120d51),
    FOLLOWERS_EMPTY(R.string.res_0x7f120515),
    FOLLOWING_EMPTY(R.string.res_0x7f12051a);
    
    private static int ah$a = 0;
    private static long toString = 4604797219932108847L;
    private static int valueOf = 1;
    private int stringId;

    public static Strings valueOf(String str) {
        int i = valueOf + 73;
        ah$a = i % 128;
        boolean z = i % 2 != 0;
        Strings strings = (Strings) Enum.valueOf(Strings.class, str);
        if (z) {
            Object obj = null;
            super.hashCode();
        }
        int i2 = ah$a + 53;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        return strings;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static Strings[] valuesCustom() {
        int i = ah$a + 71;
        valueOf = i % 128;
        int i2 = i % 2;
        try {
            Strings[] stringsArr = (Strings[]) values().clone();
            int i3 = valueOf + 57;
            ah$a = i3 % 128;
            int i4 = i3 % 2;
            return stringsArr;
        } catch (Exception e) {
            throw e;
        }
    }

    static {
        int i = valueOf + 1;
        ah$a = i % 128;
        if ((i % 2 != 0 ? 'E' : '\'') != 'E') {
            return;
        }
        Object[] objArr = null;
        int length = objArr.length;
    }

    Strings(int i) {
        this.stringId = i;
    }

    public String get(TrustedWebActivityCallbackRemote trustedWebActivityCallbackRemote) {
        int i = valueOf + 33;
        ah$a = i % 128;
        int i2 = i % 2;
        String stringById = trustedWebActivityCallbackRemote.getStringById(this.stringId);
        int i3 = ah$a + 95;
        valueOf = i3 % 128;
        int i4 = i3 % 2;
        return stringById;
    }

    public String get(TrustedWebActivityCallbackRemote trustedWebActivityCallbackRemote, Object... objArr) {
        int i = ah$a + 99;
        valueOf = i % 128;
        int i2 = i % 2;
        String stringById = trustedWebActivityCallbackRemote.getStringById(this.stringId, objArr);
        int i3 = ah$a + 91;
        valueOf = i3 % 128;
        int i4 = i3 % 2;
        return stringById;
    }

    private static String valueOf(char[] cArr, int i) {
        String str;
        synchronized (isBeforeFirst.toString) {
            isBeforeFirst.ah$a = i;
            char[] cArr2 = new char[cArr.length];
            isBeforeFirst.valueOf = 0;
            while (isBeforeFirst.valueOf < cArr.length) {
                cArr2[isBeforeFirst.valueOf] = (char) ((cArr[isBeforeFirst.valueOf] ^ (isBeforeFirst.valueOf * isBeforeFirst.ah$a)) ^ toString);
                isBeforeFirst.valueOf++;
            }
            str = new String(cArr2);
        }
        return str;
    }
}
