package com.app.dream11.chat.dynamiccard.teamshare;

import android.graphics.Color;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.app.dream11.contest.teamcompare.CompareTeamFlowState;
import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import com.app.dream11.model.FlowState;
import com.sendbird.android.constant.StringSet;
import java.util.List;
import o.getWantsAllOnMoveCalls;
import o.isFirst;
import o.isFullSpan;
import o.runAnimators;
/* loaded from: classes.dex */
public final class TeamShareCardModel {
    private static int ah$a = 1;
    private static int valueOf = 0;
    private static long values = -648663293387810274L;
    @isFullSpan(valueOf = "caption")
    private final String caption;
    @isFullSpan(valueOf = "creationFlow")
    private final String creationFlow;
    @isFullSpan(valueOf = "snapshotId")
    private final String id;
    @isFullSpan(valueOf = "match")
    private final TeamShareMatchModel match;
    @isFullSpan(valueOf = "playerRoles")
    private final List<TeamShareRoleModel> role;
    @isFullSpan(valueOf = "uniCode")
    private final String uniCode;

    public static /* synthetic */ TeamShareCardModel copy$default(TeamShareCardModel teamShareCardModel, String str, String str2, String str3, String str4, TeamShareMatchModel teamShareMatchModel, List list, int i, Object obj) {
        if (!((i & 1) == 0)) {
            str = teamShareCardModel.id;
        }
        if (((i & 2) != 0 ? '(' : (char) 20) == '(') {
            str2 = teamShareCardModel.caption;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = teamShareCardModel.creationFlow;
        }
        String str6 = str3;
        if (((i & 8) != 0 ? '\n' : '#') == '\n') {
            int i2 = ah$a + 3;
            valueOf = i2 % 128;
            int i3 = i2 % 2;
            str4 = teamShareCardModel.uniCode;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            teamShareMatchModel = teamShareCardModel.match;
        }
        TeamShareMatchModel teamShareMatchModel2 = teamShareMatchModel;
        List<TeamShareRoleModel> list2 = list;
        if ((i & 32) != 0) {
            try {
                int i4 = ah$a + 47;
                try {
                    valueOf = i4 % 128;
                    int i5 = i4 % 2;
                    List<TeamShareRoleModel> list3 = teamShareCardModel.role;
                    int i6 = valueOf + 125;
                    ah$a = i6 % 128;
                    int i7 = i6 % 2;
                    list2 = list3;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        return teamShareCardModel.copy(str, str5, str6, str7, teamShareMatchModel2, list2);
    }

    public final String component1() {
        int i = ah$a + 63;
        valueOf = i % 128;
        if (i % 2 == 0) {
            return this.id;
        }
        try {
            int i2 = 99 / 0;
            return this.id;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String component2() {
        String str;
        try {
            int i = ah$a + 113;
            valueOf = i % 128;
            if (i % 2 != 0) {
                str = this.caption;
                Object[] objArr = null;
                int length = objArr.length;
            } else {
                str = this.caption;
            }
            try {
                int i2 = valueOf + 55;
                ah$a = i2 % 128;
                int i3 = i2 % 2;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final String component3() {
        String str;
        int i = ah$a + 23;
        valueOf = i % 128;
        if (i % 2 != 0) {
            str = this.creationFlow;
            int i2 = 56 / 0;
        } else {
            try {
                str = this.creationFlow;
            } catch (Exception e) {
                throw e;
            }
        }
        int i3 = valueOf + 83;
        ah$a = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public final String component4() {
        String str;
        int i = ah$a + 51;
        valueOf = i % 128;
        Object[] objArr = null;
        if ((i % 2 != 0 ? '2' : (char) 26) != '2') {
            str = this.uniCode;
        } else {
            str = this.uniCode;
            int length = objArr.length;
        }
        int i2 = valueOf + 97;
        ah$a = i2 % 128;
        if (!(i2 % 2 == 0)) {
            return str;
        }
        int length2 = objArr.length;
        return str;
    }

    public final TeamShareMatchModel component5() {
        int i = ah$a + 11;
        valueOf = i % 128;
        int i2 = i % 2;
        TeamShareMatchModel teamShareMatchModel = this.match;
        try {
            int i3 = valueOf + 91;
            ah$a = i3 % 128;
            int i4 = i3 % 2;
            return teamShareMatchModel;
        } catch (Exception e) {
            throw e;
        }
    }

    public final List<TeamShareRoleModel> component6() {
        List<TeamShareRoleModel> list;
        try {
            int i = valueOf + 77;
            ah$a = i % 128;
            if ((i % 2 == 0 ? (char) 0 : '`') != '`') {
                list = this.role;
                Object obj = null;
                super.hashCode();
            } else {
                list = this.role;
            }
            int i2 = ah$a + 83;
            valueOf = i2 % 128;
            int i3 = i2 % 2;
            return list;
        } catch (Exception e) {
            throw e;
        }
    }

    public final TeamShareCardModel copy(String str, String str2, String str3, String str4, TeamShareMatchModel teamShareMatchModel, List<TeamShareRoleModel> list) {
        runAnimators.ag$a(str, ah$a(new char[]{210, 187, 46528, 28602, 14421, 18963}, ViewConfiguration.getMaximumFlingVelocity() >> 16).intern());
        runAnimators.ag$a(str2, "caption");
        runAnimators.ag$a(teamShareMatchModel, "match");
        runAnimators.ag$a(list, StringSet.role);
        TeamShareCardModel teamShareCardModel = new TeamShareCardModel(str, str2, str3, str4, teamShareMatchModel, list);
        int i = ah$a + 39;
        valueOf = i % 128;
        if ((i % 2 != 0 ? ']' : '@') != ']') {
            return teamShareCardModel;
        }
        Object obj = null;
        super.hashCode();
        return teamShareCardModel;
    }

    public boolean equals(Object obj) {
        try {
            if (this == obj) {
                int i = ah$a + 9;
                valueOf = i % 128;
                int i2 = i % 2;
                int i3 = valueOf + 69;
                ah$a = i3 % 128;
                int i4 = i3 % 2;
                return true;
            } else if (obj instanceof TeamShareCardModel) {
                TeamShareCardModel teamShareCardModel = (TeamShareCardModel) obj;
                if ((!runAnimators.values((Object) this.id, (Object) teamShareCardModel.id) ? 'c' : 'U') == 'c') {
                    int i5 = ah$a + 19;
                    valueOf = i5 % 128;
                    int i6 = i5 % 2;
                    return false;
                } else if (runAnimators.values((Object) this.caption, (Object) teamShareCardModel.caption)) {
                    if (!runAnimators.values((Object) this.creationFlow, (Object) teamShareCardModel.creationFlow)) {
                        try {
                            int i7 = valueOf + 37;
                            ah$a = i7 % 128;
                            return !(i7 % 2 != 0);
                        } catch (Exception e) {
                            throw e;
                        }
                    }
                    if (!runAnimators.values((Object) this.uniCode, (Object) teamShareCardModel.uniCode)) {
                        return false;
                    }
                    if (runAnimators.values(this.match, teamShareCardModel.match)) {
                        return runAnimators.values(this.role, teamShareCardModel.role);
                    }
                    int i8 = valueOf + 9;
                    ah$a = i8 % 128;
                    int i9 = i8 % 2;
                    return false;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.caption.hashCode();
        String str = this.creationFlow;
        int i = 1;
        int i2 = 0;
        if ((str == null ? '<' : 'R') != '<') {
            i = str.hashCode();
        } else {
            int i3 = valueOf + 15;
            ah$a = i3 % 128;
            if (i3 % 2 != 0) {
                i = 0;
            }
        }
        String str2 = this.uniCode;
        if (str2 != null) {
            try {
                i2 = str2.hashCode();
            } catch (Exception e) {
                throw e;
            }
        }
        int hashCode3 = (((((((((hashCode * 31) + hashCode2) * 31) + i) * 31) + i2) * 31) + this.match.hashCode()) * 31) + this.role.hashCode();
        int i4 = valueOf + 123;
        ah$a = i4 % 128;
        int i5 = i4 % 2;
        return hashCode3;
    }

    public String toString() {
        String str = "TeamShareCardModel(id=" + this.id + ", caption=" + this.caption + ", creationFlow=" + this.creationFlow + ", uniCode=" + this.uniCode + ", match=" + this.match + ", role=" + this.role + ")";
        int i = ah$a + 125;
        valueOf = i % 128;
        if ((i % 2 != 0 ? 'J' : 'D') != 'J') {
            return str;
        }
        int i2 = 57 / 0;
        return str;
    }

    public TeamShareCardModel(String str, String str2, String str3, String str4, TeamShareMatchModel teamShareMatchModel, List<TeamShareRoleModel> list) {
        runAnimators.ag$a(str, ah$a(new char[]{210, 187, 46528, 28602, 14421, 18963}, ((byte) KeyEvent.getModifierMetaStateMask()) + 1).intern());
        runAnimators.ag$a(str2, "caption");
        runAnimators.ag$a(teamShareMatchModel, "match");
        runAnimators.ag$a(list, StringSet.role);
        this.id = str;
        this.caption = str2;
        this.creationFlow = str3;
        this.uniCode = str4;
        this.match = teamShareMatchModel;
        this.role = list;
    }

    public final String getId() {
        try {
            int i = ah$a + 27;
            valueOf = i % 128;
            int i2 = i % 2;
            try {
                String str = this.id;
                int i3 = valueOf + 65;
                ah$a = i3 % 128;
                if (!(i3 % 2 == 0)) {
                    return str;
                }
                int i4 = 87 / 0;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final String getCaption() {
        int i = ah$a + 121;
        valueOf = i % 128;
        if (!(i % 2 == 0)) {
            int i2 = 24 / 0;
            return this.caption;
        }
        return this.caption;
    }

    public final String getCreationFlow() {
        try {
            int i = valueOf + 21;
            ah$a = i % 128;
            int i2 = i % 2;
            String str = this.creationFlow;
            int i3 = valueOf + 1;
            ah$a = i3 % 128;
            if ((i3 % 2 == 0 ? 'O' : 'c') != 'O') {
                return str;
            }
            Object[] objArr = null;
            int length = objArr.length;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String getUniCode() {
        int i = ah$a + 119;
        valueOf = i % 128;
        if ((i % 2 != 0 ? '&' : 'H') != 'H') {
            String str = this.uniCode;
            Object[] objArr = null;
            int length = objArr.length;
            return str;
        }
        return this.uniCode;
    }

    public final TeamShareMatchModel getMatch() {
        int i = valueOf + 111;
        ah$a = i % 128;
        int i2 = i % 2;
        TeamShareMatchModel teamShareMatchModel = this.match;
        int i3 = valueOf + 47;
        ah$a = i3 % 128;
        int i4 = i3 % 2;
        return teamShareMatchModel;
    }

    public final List<TeamShareRoleModel> getRole() {
        int i = ah$a + 77;
        valueOf = i % 128;
        int i2 = i % 2;
        try {
            List<TeamShareRoleModel> list = this.role;
            int i3 = valueOf + 61;
            ah$a = i3 % 128;
            if (!(i3 % 2 != 0)) {
                Object obj = null;
                super.hashCode();
                return list;
            }
            return list;
        } catch (Exception e) {
            throw e;
        }
    }

    /* loaded from: classes.dex */
    public static final class TeamShareMatchModel {
        @isFullSpan(valueOf = CompareTeamFlowState.MATCH_ID)
        private final int id;
        @isFullSpan(valueOf = HeadToHeadMatchPickerFlowState.MATCH_STATUS)
        private String matchStatus;
        @isFullSpan(valueOf = "slug")
        private final String site;
        @isFullSpan(valueOf = "backgroundImage")
        private final String siteImgSrc;
        private String siteTag;
        @isFullSpan(valueOf = "squads")
        private final List<TeamShareSquadModel> squad;
        @isFullSpan(valueOf = "matchStartTime")
        private final String startTime;
        @isFullSpan(valueOf = "tour")
        private final TeamShareTourModel tour;

        public static /* synthetic */ TeamShareMatchModel copy$default(TeamShareMatchModel teamShareMatchModel, int i, String str, String str2, String str3, String str4, TeamShareTourModel teamShareTourModel, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = teamShareMatchModel.id;
            }
            if ((i2 & 2) != 0) {
                str = teamShareMatchModel.site;
            }
            String str5 = str;
            if ((i2 & 4) != 0) {
                str2 = teamShareMatchModel.matchStatus;
            }
            String str6 = str2;
            if ((i2 & 8) != 0) {
                str3 = teamShareMatchModel.startTime;
            }
            String str7 = str3;
            if ((i2 & 16) != 0) {
                str4 = teamShareMatchModel.siteImgSrc;
            }
            String str8 = str4;
            if ((i2 & 32) != 0) {
                teamShareTourModel = teamShareMatchModel.tour;
            }
            TeamShareTourModel teamShareTourModel2 = teamShareTourModel;
            List<TeamShareSquadModel> list2 = list;
            if ((i2 & 64) != 0) {
                list2 = teamShareMatchModel.squad;
            }
            return teamShareMatchModel.copy(i, str5, str6, str7, str8, teamShareTourModel2, list2);
        }

        public final int component1() {
            return this.id;
        }

        public final String component2() {
            return this.site;
        }

        public final String component3() {
            return this.matchStatus;
        }

        public final String component4() {
            return this.startTime;
        }

        public final String component5() {
            return this.siteImgSrc;
        }

        public final TeamShareTourModel component6() {
            return this.tour;
        }

        public final List<TeamShareSquadModel> component7() {
            return this.squad;
        }

        public final TeamShareMatchModel copy(int i, String str, String str2, String str3, String str4, TeamShareTourModel teamShareTourModel, List<TeamShareSquadModel> list) {
            runAnimators.ag$a(str, FlowState.SITE);
            runAnimators.ag$a(str3, HeadToHeadMatchPickerFlowState.START_TIME);
            runAnimators.ag$a(str4, "siteImgSrc");
            runAnimators.ag$a(teamShareTourModel, "tour");
            runAnimators.ag$a(list, "squad");
            return new TeamShareMatchModel(i, str, str2, str3, str4, teamShareTourModel, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof TeamShareMatchModel) {
                TeamShareMatchModel teamShareMatchModel = (TeamShareMatchModel) obj;
                return this.id == teamShareMatchModel.id && runAnimators.values((Object) this.site, (Object) teamShareMatchModel.site) && runAnimators.values((Object) this.matchStatus, (Object) teamShareMatchModel.matchStatus) && runAnimators.values((Object) this.startTime, (Object) teamShareMatchModel.startTime) && runAnimators.values((Object) this.siteImgSrc, (Object) teamShareMatchModel.siteImgSrc) && runAnimators.values(this.tour, teamShareMatchModel.tour) && runAnimators.values(this.squad, teamShareMatchModel.squad);
            }
            return false;
        }

        public int hashCode() {
            int i = this.id;
            int hashCode = this.site.hashCode();
            String str = this.matchStatus;
            return (((((((((((i * 31) + hashCode) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.startTime.hashCode()) * 31) + this.siteImgSrc.hashCode()) * 31) + this.tour.hashCode()) * 31) + this.squad.hashCode();
        }

        public String toString() {
            int i = this.id;
            String str = this.site;
            String str2 = this.matchStatus;
            String str3 = this.startTime;
            String str4 = this.siteImgSrc;
            TeamShareTourModel teamShareTourModel = this.tour;
            List<TeamShareSquadModel> list = this.squad;
            return "TeamShareMatchModel(id=" + i + ", site=" + str + ", matchStatus=" + str2 + ", startTime=" + str3 + ", siteImgSrc=" + str4 + ", tour=" + teamShareTourModel + ", squad=" + list + ")";
        }

        public TeamShareMatchModel(int i, String str, String str2, String str3, String str4, TeamShareTourModel teamShareTourModel, List<TeamShareSquadModel> list) {
            runAnimators.ag$a(str, FlowState.SITE);
            runAnimators.ag$a(str3, HeadToHeadMatchPickerFlowState.START_TIME);
            runAnimators.ag$a(str4, "siteImgSrc");
            runAnimators.ag$a(teamShareTourModel, "tour");
            runAnimators.ag$a(list, "squad");
            this.id = i;
            this.site = str;
            this.matchStatus = str2;
            this.startTime = str3;
            this.siteImgSrc = str4;
            this.tour = teamShareTourModel;
            this.squad = list;
        }

        public final int getId() {
            return this.id;
        }

        public final String getSite() {
            return this.site;
        }

        public final String getMatchStatus() {
            return this.matchStatus;
        }

        public final void setMatchStatus(String str) {
            this.matchStatus = str;
        }

        public final String getStartTime() {
            return this.startTime;
        }

        public final String getSiteImgSrc() {
            return this.siteImgSrc;
        }

        public final TeamShareTourModel getTour() {
            return this.tour;
        }

        public final List<TeamShareSquadModel> getSquad() {
            return this.squad;
        }

        public final String getSiteTag() {
            return this.siteTag;
        }

        public final void setSiteTag(String str) {
            this.siteTag = str;
        }

        /* loaded from: classes.dex */
        public static final class TeamShareTourModel {
            private static int ag$a = 0;
            private static char[] ah$a = {2, 13822, 1, 13811};
            private static char toString = 2;
            private static int values = 1;
            @isFullSpan(valueOf = "tourId")
            private final String id;
            @isFullSpan(valueOf = "tourName")
            private final String name;

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
                if (((r5 & 1) != 0 ? 24 : org.apache.http.message.TokenParser.ESCAPE) != 24) goto L7;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
                r3 = r2.id;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
                if (((r5 & 1) != 0 ? 19 : ',') != ',') goto L28;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static /* synthetic */ com.app.dream11.chat.dynamiccard.teamshare.TeamShareCardModel.TeamShareMatchModel.TeamShareTourModel copy$default(com.app.dream11.chat.dynamiccard.teamshare.TeamShareCardModel.TeamShareMatchModel.TeamShareTourModel r2, java.lang.String r3, java.lang.String r4, int r5, java.lang.Object r6) {
                /*
                    int r6 = com.app.dream11.chat.dynamiccard.teamshare.TeamShareCardModel.TeamShareMatchModel.TeamShareTourModel.values
                    int r6 = r6 + 33
                    int r0 = r6 % 128
                    com.app.dream11.chat.dynamiccard.teamshare.TeamShareCardModel.TeamShareMatchModel.TeamShareTourModel.ag$a = r0
                    int r6 = r6 % 2
                    r0 = 44
                    if (r6 == 0) goto L1a
                    r6 = r5 & 1
                    if (r6 == 0) goto L15
                    r6 = 19
                    goto L17
                L15:
                    r6 = 44
                L17:
                    if (r6 == r0) goto L2a
                    goto L28
                L1a:
                    r6 = r5 & 1
                    r1 = 24
                    if (r6 == 0) goto L23
                    r6 = 24
                    goto L25
                L23:
                    r6 = 92
                L25:
                    if (r6 == r1) goto L28
                    goto L2a
                L28:
                    java.lang.String r3 = r2.id
                L2a:
                    r5 = r5 & 2
                    if (r5 == 0) goto L4a
                    int r4 = com.app.dream11.chat.dynamiccard.teamshare.TeamShareCardModel.TeamShareMatchModel.TeamShareTourModel.values
                    int r4 = r4 + 45
                    int r5 = r4 % 128
                    com.app.dream11.chat.dynamiccard.teamshare.TeamShareCardModel.TeamShareMatchModel.TeamShareTourModel.ag$a = r5
                    int r4 = r4 % 2
                    r5 = 79
                    if (r4 == 0) goto L3d
                    goto L3f
                L3d:
                    r0 = 79
                L3f:
                    java.lang.String r4 = r2.name
                    if (r0 == r5) goto L4a
                    r5 = 0
                    super.hashCode()     // Catch: java.lang.Throwable -> L48
                    goto L4a
                L48:
                    r2 = move-exception
                    throw r2
                L4a:
                    com.app.dream11.chat.dynamiccard.teamshare.TeamShareCardModel$TeamShareMatchModel$TeamShareTourModel r2 = r2.copy(r3, r4)     // Catch: java.lang.Exception -> L59
                    int r3 = com.app.dream11.chat.dynamiccard.teamshare.TeamShareCardModel.TeamShareMatchModel.TeamShareTourModel.values
                    int r3 = r3 + 109
                    int r4 = r3 % 128
                    com.app.dream11.chat.dynamiccard.teamshare.TeamShareCardModel.TeamShareMatchModel.TeamShareTourModel.ag$a = r4
                    int r3 = r3 % 2
                    return r2
                L59:
                    r2 = move-exception
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.chat.dynamiccard.teamshare.TeamShareCardModel.TeamShareMatchModel.TeamShareTourModel.copy$default(com.app.dream11.chat.dynamiccard.teamshare.TeamShareCardModel$TeamShareMatchModel$TeamShareTourModel, java.lang.String, java.lang.String, int, java.lang.Object):com.app.dream11.chat.dynamiccard.teamshare.TeamShareCardModel$TeamShareMatchModel$TeamShareTourModel");
            }

            public final String component1() {
                int i = ag$a + 43;
                values = i % 128;
                int i2 = i % 2;
                try {
                    String str = this.id;
                    int i3 = values + 57;
                    ag$a = i3 % 128;
                    if ((i3 % 2 != 0 ? ':' : '1') != '1') {
                        int i4 = 61 / 0;
                        return str;
                    }
                    return str;
                } catch (Exception e) {
                    throw e;
                }
            }

            public final String component2() {
                int i = ag$a + 115;
                values = i % 128;
                if ((i % 2 == 0 ? '+' : (char) 6) != '+') {
                    return this.name;
                }
                String str = this.name;
                Object obj = null;
                super.hashCode();
                return str;
            }

            public final TeamShareTourModel copy(String str, String str2) {
                runAnimators.ag$a(str, ag$a((byte) (32 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), new char[]{1, 3}, Color.blue(0) + 2).intern());
                runAnimators.ag$a(str2, "name");
                TeamShareTourModel teamShareTourModel = new TeamShareTourModel(str, str2);
                int i = values + 7;
                ag$a = i % 128;
                int i2 = i % 2;
                return teamShareTourModel;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TeamShareTourModel)) {
                    int i = values + 111;
                    ag$a = i % 128;
                    return i % 2 != 0;
                }
                TeamShareTourModel teamShareTourModel = (TeamShareTourModel) obj;
                if ((!runAnimators.values((Object) this.id, (Object) teamShareTourModel.id) ? '3' : (char) 21) != '3') {
                    if ((!runAnimators.values((Object) this.name, (Object) teamShareTourModel.name) ? 'E' : '+') != 'E') {
                        return true;
                    }
                    int i2 = values + 81;
                    ag$a = i2 % 128;
                    int i3 = i2 % 2;
                }
                return false;
            }

            public int hashCode() {
                int i = ag$a + 23;
                values = i % 128;
                int hashCode = (i % 2 == 0 ? (char) 28 : 'b') != 'b' ? (this.id.hashCode() << 34) % this.name.hashCode() : (this.id.hashCode() * 31) + this.name.hashCode();
                int i2 = values + 59;
                ag$a = i2 % 128;
                int i3 = i2 % 2;
                return hashCode;
            }

            public String toString() {
                String str = "TeamShareTourModel(id=" + this.id + ", name=" + this.name + ")";
                int i = values + 35;
                ag$a = i % 128;
                int i2 = i % 2;
                return str;
            }

            public TeamShareTourModel(String str, String str2) {
                runAnimators.ag$a(str, ag$a((byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 30), new char[]{1, 3}, 2 - ExpandableListView.getPackedPositionType(0L)).intern());
                runAnimators.ag$a(str2, "name");
                this.id = str;
                this.name = str2;
            }

            public final String getId() {
                int i = ag$a + 81;
                values = i % 128;
                int i2 = i % 2;
                String str = this.id;
                int i3 = values + 99;
                ag$a = i3 % 128;
                int i4 = i3 % 2;
                return str;
            }

            public final String getName() {
                int i = ag$a + 91;
                values = i % 128;
                int i2 = i % 2;
                String str = this.name;
                try {
                    int i3 = values + 121;
                    ag$a = i3 % 128;
                    int i4 = i3 % 2;
                    return str;
                } catch (Exception e) {
                    throw e;
                }
            }

            private static String ag$a(byte b2, char[] cArr, int i) {
                int i2;
                String str;
                synchronized (isFirst.HaptikSDK$b) {
                    char[] cArr2 = ah$a;
                    char c = toString;
                    char[] cArr3 = new char[i];
                    if (i % 2 != 0) {
                        i2 = i - 1;
                        cArr3[i2] = (char) (cArr[i2] - b2);
                    } else {
                        i2 = i;
                    }
                    if (i2 > 1) {
                        isFirst.valueOf = 0;
                        while (isFirst.valueOf < i2) {
                            isFirst.toString = cArr[isFirst.valueOf];
                            isFirst.ah$a = cArr[isFirst.valueOf + 1];
                            if (isFirst.toString == isFirst.ah$a) {
                                cArr3[isFirst.valueOf] = (char) (isFirst.toString - b2);
                                cArr3[isFirst.valueOf + 1] = (char) (isFirst.ah$a - b2);
                            } else {
                                isFirst.ag$a = isFirst.toString / c;
                                isFirst.invoke = isFirst.toString % c;
                                isFirst.values = isFirst.ah$a / c;
                                isFirst.ah$b = isFirst.ah$a % c;
                                if (isFirst.invoke == isFirst.ah$b) {
                                    isFirst.ag$a = ((isFirst.ag$a + c) - 1) % c;
                                    isFirst.values = ((isFirst.values + c) - 1) % c;
                                    int i3 = (isFirst.ag$a * c) + isFirst.invoke;
                                    int i4 = (isFirst.values * c) + isFirst.ah$b;
                                    cArr3[isFirst.valueOf] = cArr2[i3];
                                    cArr3[isFirst.valueOf + 1] = cArr2[i4];
                                } else if (isFirst.ag$a == isFirst.values) {
                                    isFirst.invoke = ((isFirst.invoke + c) - 1) % c;
                                    isFirst.ah$b = ((isFirst.ah$b + c) - 1) % c;
                                    int i5 = (isFirst.ag$a * c) + isFirst.invoke;
                                    int i6 = (isFirst.values * c) + isFirst.ah$b;
                                    cArr3[isFirst.valueOf] = cArr2[i5];
                                    cArr3[isFirst.valueOf + 1] = cArr2[i6];
                                } else {
                                    int i7 = (isFirst.ag$a * c) + isFirst.ah$b;
                                    int i8 = (isFirst.values * c) + isFirst.invoke;
                                    cArr3[isFirst.valueOf] = cArr2[i7];
                                    cArr3[isFirst.valueOf + 1] = cArr2[i8];
                                }
                            }
                            isFirst.valueOf += 2;
                        }
                    }
                    for (int i9 = 0; i9 < i; i9++) {
                        cArr3[i9] = (char) (cArr3[i9] ^ 13722);
                    }
                    str = new String(cArr3);
                }
                return str;
            }
        }

        /* loaded from: classes.dex */
        public static final class TeamShareSquadModel {
            @isFullSpan(valueOf = "flag")
            private final String flagSrc;
            @isFullSpan(valueOf = "squadFullName")
            private final String fullName;
            @isFullSpan(valueOf = "id")
            private final int id;
            @isFullSpan(valueOf = "selectedPlayers")
            private final int selectedPlayersCount;
            @isFullSpan(valueOf = "squadShortName")
            private final String shortName;

            public static /* synthetic */ TeamShareSquadModel copy$default(TeamShareSquadModel teamShareSquadModel, int i, String str, String str2, String str3, int i2, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    i = teamShareSquadModel.id;
                }
                if ((i3 & 2) != 0) {
                    str = teamShareSquadModel.shortName;
                }
                String str4 = str;
                if ((i3 & 4) != 0) {
                    str2 = teamShareSquadModel.fullName;
                }
                String str5 = str2;
                if ((i3 & 8) != 0) {
                    str3 = teamShareSquadModel.flagSrc;
                }
                String str6 = str3;
                if ((i3 & 16) != 0) {
                    i2 = teamShareSquadModel.selectedPlayersCount;
                }
                return teamShareSquadModel.copy(i, str4, str5, str6, i2);
            }

            public final int component1() {
                return this.id;
            }

            public final String component2() {
                return this.shortName;
            }

            public final String component3() {
                return this.fullName;
            }

            public final String component4() {
                return this.flagSrc;
            }

            public final int component5() {
                return this.selectedPlayersCount;
            }

            public final TeamShareSquadModel copy(int i, String str, String str2, String str3, int i2) {
                runAnimators.ag$a(str, "shortName");
                runAnimators.ag$a(str2, "fullName");
                runAnimators.ag$a(str3, "flagSrc");
                return new TeamShareSquadModel(i, str, str2, str3, i2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof TeamShareSquadModel) {
                    TeamShareSquadModel teamShareSquadModel = (TeamShareSquadModel) obj;
                    return this.id == teamShareSquadModel.id && runAnimators.values((Object) this.shortName, (Object) teamShareSquadModel.shortName) && runAnimators.values((Object) this.fullName, (Object) teamShareSquadModel.fullName) && runAnimators.values((Object) this.flagSrc, (Object) teamShareSquadModel.flagSrc) && this.selectedPlayersCount == teamShareSquadModel.selectedPlayersCount;
                }
                return false;
            }

            public int hashCode() {
                return (((((((this.id * 31) + this.shortName.hashCode()) * 31) + this.fullName.hashCode()) * 31) + this.flagSrc.hashCode()) * 31) + this.selectedPlayersCount;
            }

            public String toString() {
                int i = this.id;
                String str = this.shortName;
                String str2 = this.fullName;
                String str3 = this.flagSrc;
                int i2 = this.selectedPlayersCount;
                return "TeamShareSquadModel(id=" + i + ", shortName=" + str + ", fullName=" + str2 + ", flagSrc=" + str3 + ", selectedPlayersCount=" + i2 + ")";
            }

            public TeamShareSquadModel(int i, String str, String str2, String str3, int i2) {
                runAnimators.ag$a(str, "shortName");
                runAnimators.ag$a(str2, "fullName");
                runAnimators.ag$a(str3, "flagSrc");
                this.id = i;
                this.shortName = str;
                this.fullName = str2;
                this.flagSrc = str3;
                this.selectedPlayersCount = i2;
            }

            public final int getId() {
                return this.id;
            }

            public final String getShortName() {
                return this.shortName;
            }

            public final String getFullName() {
                return this.fullName;
            }

            public final String getFlagSrc() {
                return this.flagSrc;
            }

            public final int getSelectedPlayersCount() {
                return this.selectedPlayersCount;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class TeamShareRoleModel {
        @isFullSpan(valueOf = "displayImage")
        private final String imgSrc;
        @isFullSpan(valueOf = "initialName")
        private final String initialName;
        @isFullSpan(valueOf = "name")
        private final String name;
        @isFullSpan(valueOf = "playerId")
        private final int playerId;
        @isFullSpan(valueOf = "roleId")
        private final int roleId;
        @isFullSpan(valueOf = StringSet.role)
        private final String shortenedRoleName;
        @isFullSpan(valueOf = "squadId")
        private final int squadId;

        public static /* synthetic */ TeamShareRoleModel copy$default(TeamShareRoleModel teamShareRoleModel, int i, int i2, String str, String str2, String str3, String str4, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = teamShareRoleModel.roleId;
            }
            if ((i4 & 2) != 0) {
                i2 = teamShareRoleModel.playerId;
            }
            int i5 = i2;
            if ((i4 & 4) != 0) {
                str = teamShareRoleModel.shortenedRoleName;
            }
            String str5 = str;
            if ((i4 & 8) != 0) {
                str2 = teamShareRoleModel.name;
            }
            String str6 = str2;
            if ((i4 & 16) != 0) {
                str3 = teamShareRoleModel.initialName;
            }
            String str7 = str3;
            if ((i4 & 32) != 0) {
                str4 = teamShareRoleModel.imgSrc;
            }
            String str8 = str4;
            if ((i4 & 64) != 0) {
                i3 = teamShareRoleModel.squadId;
            }
            return teamShareRoleModel.copy(i, i5, str5, str6, str7, str8, i3);
        }

        public final int component1() {
            return this.roleId;
        }

        public final int component2() {
            return this.playerId;
        }

        public final String component3() {
            return this.shortenedRoleName;
        }

        public final String component4() {
            return this.name;
        }

        public final String component5() {
            return this.initialName;
        }

        public final String component6() {
            return this.imgSrc;
        }

        public final int component7() {
            return this.squadId;
        }

        public final TeamShareRoleModel copy(int i, int i2, String str, String str2, String str3, String str4, int i3) {
            runAnimators.ag$a(str, "shortenedRoleName");
            runAnimators.ag$a(str2, "name");
            runAnimators.ag$a(str3, "initialName");
            runAnimators.ag$a(str4, "imgSrc");
            return new TeamShareRoleModel(i, i2, str, str2, str3, str4, i3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof TeamShareRoleModel) {
                TeamShareRoleModel teamShareRoleModel = (TeamShareRoleModel) obj;
                return this.roleId == teamShareRoleModel.roleId && this.playerId == teamShareRoleModel.playerId && runAnimators.values((Object) this.shortenedRoleName, (Object) teamShareRoleModel.shortenedRoleName) && runAnimators.values((Object) this.name, (Object) teamShareRoleModel.name) && runAnimators.values((Object) this.initialName, (Object) teamShareRoleModel.initialName) && runAnimators.values((Object) this.imgSrc, (Object) teamShareRoleModel.imgSrc) && this.squadId == teamShareRoleModel.squadId;
            }
            return false;
        }

        public int hashCode() {
            return (((((((((((this.roleId * 31) + this.playerId) * 31) + this.shortenedRoleName.hashCode()) * 31) + this.name.hashCode()) * 31) + this.initialName.hashCode()) * 31) + this.imgSrc.hashCode()) * 31) + this.squadId;
        }

        public String toString() {
            int i = this.roleId;
            int i2 = this.playerId;
            String str = this.shortenedRoleName;
            String str2 = this.name;
            String str3 = this.initialName;
            String str4 = this.imgSrc;
            int i3 = this.squadId;
            return "TeamShareRoleModel(roleId=" + i + ", playerId=" + i2 + ", shortenedRoleName=" + str + ", name=" + str2 + ", initialName=" + str3 + ", imgSrc=" + str4 + ", squadId=" + i3 + ")";
        }

        public TeamShareRoleModel(int i, int i2, String str, String str2, String str3, String str4, int i3) {
            runAnimators.ag$a(str, "shortenedRoleName");
            runAnimators.ag$a(str2, "name");
            runAnimators.ag$a(str3, "initialName");
            runAnimators.ag$a(str4, "imgSrc");
            this.roleId = i;
            this.playerId = i2;
            this.shortenedRoleName = str;
            this.name = str2;
            this.initialName = str3;
            this.imgSrc = str4;
            this.squadId = i3;
        }

        public final int getRoleId() {
            return this.roleId;
        }

        public final int getPlayerId() {
            return this.playerId;
        }

        public final String getShortenedRoleName() {
            return this.shortenedRoleName;
        }

        public final String getName() {
            return this.name;
        }

        public final String getInitialName() {
            return this.initialName;
        }

        public final String getImgSrc() {
            return this.imgSrc;
        }

        public final int getSquadId() {
            return this.squadId;
        }
    }

    private static String ah$a(char[] cArr, int i) {
        String str;
        synchronized (getWantsAllOnMoveCalls.ag$a) {
            char[] getwantsallonmovecalls = getWantsAllOnMoveCalls.toString(values, cArr, i);
            getWantsAllOnMoveCalls.values = 4;
            while (getWantsAllOnMoveCalls.values < getwantsallonmovecalls.length) {
                getWantsAllOnMoveCalls.toString = getWantsAllOnMoveCalls.values - 4;
                getwantsallonmovecalls[getWantsAllOnMoveCalls.values] = (char) ((getwantsallonmovecalls[getWantsAllOnMoveCalls.values] ^ getwantsallonmovecalls[getWantsAllOnMoveCalls.values % 4]) ^ (getWantsAllOnMoveCalls.toString * values));
                getWantsAllOnMoveCalls.values++;
            }
            str = new String(getwantsallonmovecalls, 4, getwantsallonmovecalls.length - 4);
        }
        return str;
    }
}
