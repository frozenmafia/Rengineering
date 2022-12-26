package com.app.dream11.spotlight;

import com.apxor.androidsdk.core.Constants;
import com.google.android.gms.common.Scopes;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public abstract class OverlayScreen {
    private static final /* synthetic */ OverlayScreen[] $VALUES;
    public static final OverlayScreen HOMEFEED;
    public static final OverlayScreen LEAGUEDETAILS;
    public static final OverlayScreen NEW_TEAM_CREATE;
    public static final OverlayScreen SHARE_TEAM_PREVIEW;
    public static final OverlayScreen TEAM_PREVIEW;
    public static String category;
    public static String clear_team;
    public static String credits;
    public static String entryfee;
    public static String groupchat;
    public static String leaguedetails;
    public static String points;
    public static String profile;
    public static String share_teampreview;
    public static String team1;
    public static String team2;
    public static String teampreview;
    public static String timer;
    public static String winners;
    public static String winnings;

    public abstract int getId();

    @Override // java.lang.Enum
    public abstract String toString();

    private OverlayScreen(String str, int i) {
    }

    public static OverlayScreen valueOf(String str) {
        return (OverlayScreen) Enum.valueOf(OverlayScreen.class, str);
    }

    public static OverlayScreen[] values() {
        return (OverlayScreen[]) $VALUES.clone();
    }

    /* renamed from: com.app.dream11.spotlight.OverlayScreen$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    enum AnonymousClass1 extends OverlayScreen {
        @Override // com.app.dream11.spotlight.OverlayScreen
        public int getId() {
            return 118;
        }

        @Override // com.app.dream11.spotlight.OverlayScreen, java.lang.Enum
        public String toString() {
            return "contest_details";
        }

        private AnonymousClass1(String str, int i) {
            super(str, i);
        }
    }

    static {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1("LEAGUEDETAILS", 0);
        LEAGUEDETAILS = anonymousClass1;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2("HOMEFEED", 1);
        HOMEFEED = anonymousClass2;
        AnonymousClass3 anonymousClass3 = new AnonymousClass3("SHARE_TEAM_PREVIEW", 2);
        SHARE_TEAM_PREVIEW = anonymousClass3;
        AnonymousClass4 anonymousClass4 = new AnonymousClass4("TEAM_PREVIEW", 3);
        TEAM_PREVIEW = anonymousClass4;
        AnonymousClass5 anonymousClass5 = new AnonymousClass5("NEW_TEAM_CREATE", 4);
        NEW_TEAM_CREATE = anonymousClass5;
        $VALUES = new OverlayScreen[]{anonymousClass1, anonymousClass2, anonymousClass3, anonymousClass4, anonymousClass5};
        team1 = "team1";
        team2 = "team2";
        timer = "timer";
        category = Constants.CATEGORY;
        credits = "credits";
        points = "points";
        winnings = "winnings";
        winners = "winners";
        entryfee = "entryfee";
        teampreview = "teampreview";
        leaguedetails = "leaguedetails";
        groupchat = "groupchat";
        profile = Scopes.PROFILE;
        share_teampreview = "share_teampreview";
        clear_team = "clear_team";
    }

    /* renamed from: com.app.dream11.spotlight.OverlayScreen$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    enum AnonymousClass2 extends OverlayScreen {
        @Override // com.app.dream11.spotlight.OverlayScreen
        public int getId() {
            return 119;
        }

        @Override // com.app.dream11.spotlight.OverlayScreen, java.lang.Enum
        public String toString() {
            return "home_feed";
        }

        private AnonymousClass2(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: com.app.dream11.spotlight.OverlayScreen$3  reason: invalid class name */
    /* loaded from: classes3.dex */
    enum AnonymousClass3 extends OverlayScreen {
        @Override // com.app.dream11.spotlight.OverlayScreen
        public int getId() {
            return 212;
        }

        @Override // com.app.dream11.spotlight.OverlayScreen, java.lang.Enum
        public String toString() {
            return "team_preview_share";
        }

        private AnonymousClass3(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: com.app.dream11.spotlight.OverlayScreen$4  reason: invalid class name */
    /* loaded from: classes3.dex */
    enum AnonymousClass4 extends OverlayScreen {
        @Override // com.app.dream11.spotlight.OverlayScreen
        public int getId() {
            return 213;
        }

        @Override // com.app.dream11.spotlight.OverlayScreen, java.lang.Enum
        public String toString() {
            return "team_preview";
        }

        private AnonymousClass4(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: com.app.dream11.spotlight.OverlayScreen$5  reason: invalid class name */
    /* loaded from: classes3.dex */
    enum AnonymousClass5 extends OverlayScreen {
        @Override // com.app.dream11.spotlight.OverlayScreen
        public int getId() {
            return 214;
        }

        @Override // com.app.dream11.spotlight.OverlayScreen, java.lang.Enum
        public String toString() {
            return "newcreateteam";
        }

        private AnonymousClass5(String str, int i) {
            super(str, i);
        }
    }
}
