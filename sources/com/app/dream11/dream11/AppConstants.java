package com.app.dream11.dream11;

import java.util.regex.Pattern;
/* loaded from: classes3.dex */
public class AppConstants {
    public static final Pattern HaptikSDK$a = Pattern.compile("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+");
    public static String HaptikSDK$b = "LEC001";
    public static String HaptikSDK$c = "team_share";
    public static String HaptikSDK$d = "MG1003";
    public static String HaptikSDK$e = "A0111";
    public static String HaptikWebView = "A1003";
    public static String ag$a = "MG178";
    public static String ah$a = "SS105";
    public static String ah$b = "edit";
    public static String getInitSettings = "snapshotId";
    public static int getSignupData = 403;
    public static String invoke = "A0112";
    public static String toString = "SS104";
    public static int valueOf = 114;
    public static String values = "create";

    /* loaded from: classes6.dex */
    public enum CALLFROM {
        MYACCOUNT,
        LEAGUE,
        PRIVATE_LEAGUE,
        BALANCE_DIALOG,
        IS_VALIDBALANCE,
        CASHBACK_FEED,
        TEAM_CREATE,
        LEAGUE_AFTER_ROUND_LOCK,
        MY_PROFILE,
        TXN_STMT
    }

    /* loaded from: classes3.dex */
    public enum EVENT_TRIGGER {
        team_create,
        free_league,
        paid_league
    }

    /* loaded from: classes.dex */
    public enum EventKeys {
        ID,
        CHANNEL_NAME,
        START_TIME,
        CT_PUSH_PROFILE
    }

    /* loaded from: classes3.dex */
    public enum LEAGUE_START_VALUE {
        LEAGUE_JOIN_SUCCESS,
        MY_JOINED_LEAGUES,
        JOINED_LEAGUE,
        SHOW_FREE_APP_POPUP,
        LEAGUE_DETAILS,
        LEAGUE_PAGE
    }
}
