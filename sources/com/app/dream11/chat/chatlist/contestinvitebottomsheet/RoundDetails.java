package com.app.dream11.chat.chatlist.contestinvitebottomsheet;

import com.app.dream11Pro.R;
import java.util.Date;
import o.inflateColorStateList;
import o.isRequestPinShortcutSupported;
import o.runAnimators;
/* loaded from: classes.dex */
public final class RoundDetails {
    private final String END_ALPHA_VALUE;
    private final String START_ALPHA_VALUE;
    private final String endColor;
    private final int mediumFont;
    private final Integer roundId;
    private final String roundName;
    private final String roundNameTrimmedText;
    private final String roundStartTime;
    private final String sportName;
    private final String squadColorPalette;
    private final SquadModel squadFirst;
    private final SquadModel squadSecond;
    private final String startColor;
    private final Date startTime;

    public static /* synthetic */ RoundDetails copy$default(RoundDetails roundDetails, Integer num, String str, String str2, SquadModel squadModel, SquadModel squadModel2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = roundDetails.roundId;
        }
        if ((i & 2) != 0) {
            str = roundDetails.roundName;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = roundDetails.roundStartTime;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            squadModel = roundDetails.squadFirst;
        }
        SquadModel squadModel3 = squadModel;
        if ((i & 16) != 0) {
            squadModel2 = roundDetails.squadSecond;
        }
        SquadModel squadModel4 = squadModel2;
        if ((i & 32) != 0) {
            str3 = roundDetails.sportName;
        }
        String str7 = str3;
        if ((i & 64) != 0) {
            str4 = roundDetails.squadColorPalette;
        }
        return roundDetails.copy(num, str5, str6, squadModel3, squadModel4, str7, str4);
    }

    public final Integer component1() {
        return this.roundId;
    }

    public final String component2() {
        return this.roundName;
    }

    public final String component3() {
        return this.roundStartTime;
    }

    public final SquadModel component4() {
        return this.squadFirst;
    }

    public final SquadModel component5() {
        return this.squadSecond;
    }

    public final String component6() {
        return this.sportName;
    }

    public final String component7() {
        return this.squadColorPalette;
    }

    public final RoundDetails copy(Integer num, String str, String str2, SquadModel squadModel, SquadModel squadModel2, String str3, String str4) {
        runAnimators.ag$a(squadModel, "squadFirst");
        runAnimators.ag$a(squadModel2, "squadSecond");
        return new RoundDetails(num, str, str2, squadModel, squadModel2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RoundDetails) {
            RoundDetails roundDetails = (RoundDetails) obj;
            return runAnimators.values(this.roundId, roundDetails.roundId) && runAnimators.values((Object) this.roundName, (Object) roundDetails.roundName) && runAnimators.values((Object) this.roundStartTime, (Object) roundDetails.roundStartTime) && runAnimators.values(this.squadFirst, roundDetails.squadFirst) && runAnimators.values(this.squadSecond, roundDetails.squadSecond) && runAnimators.values((Object) this.sportName, (Object) roundDetails.sportName) && runAnimators.values((Object) this.squadColorPalette, (Object) roundDetails.squadColorPalette);
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.roundId;
        int hashCode = num == null ? 0 : num.hashCode();
        String str = this.roundName;
        int hashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.roundStartTime;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        int hashCode4 = this.squadFirst.hashCode();
        int hashCode5 = this.squadSecond.hashCode();
        String str3 = this.sportName;
        int hashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.squadColorPalette;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.roundId;
        String str = this.roundName;
        String str2 = this.roundStartTime;
        SquadModel squadModel = this.squadFirst;
        SquadModel squadModel2 = this.squadSecond;
        String str3 = this.sportName;
        String str4 = this.squadColorPalette;
        return "RoundDetails(roundId=" + num + ", roundName=" + str + ", roundStartTime=" + str2 + ", squadFirst=" + squadModel + ", squadSecond=" + squadModel2 + ", sportName=" + str3 + ", squadColorPalette=" + str4 + ")";
    }

    public RoundDetails(Integer num, String str, String str2, SquadModel squadModel, SquadModel squadModel2, String str3, String str4) {
        Long ag$a;
        runAnimators.ag$a(squadModel, "squadFirst");
        runAnimators.ag$a(squadModel2, "squadSecond");
        this.roundId = num;
        this.roundName = str;
        this.roundStartTime = str2;
        this.squadFirst = squadModel;
        this.squadSecond = squadModel2;
        this.sportName = str3;
        this.squadColorPalette = str4;
        boolean z = false;
        this.startColor = str4 != null && str4.length() == 7 ? str4 : "#333333";
        if (str4 != null && str4.length() == 7) {
            z = true;
        }
        this.endColor = z ? str4 : "#C1C1C1";
        this.mediumFont = R.font.d11_font_normal__500;
        Date date = null;
        if (str2 != null && (ag$a = runAnimators.ag$a(str2, "<this>")) != null) {
            date = inflateColorStateList.values(ag$a.longValue());
        }
        this.startTime = date;
        this.roundNameTrimmedText = (str == null || (r2 = isRequestPinShortcutSupported.valueOf(str, 16)) == null) ? "" : "";
        this.START_ALPHA_VALUE = "66";
        this.END_ALPHA_VALUE = "1A";
    }

    public final Integer getRoundId() {
        return this.roundId;
    }

    public final String getRoundName() {
        return this.roundName;
    }

    public final String getRoundStartTime() {
        return this.roundStartTime;
    }

    public final SquadModel getSquadFirst() {
        return this.squadFirst;
    }

    public final SquadModel getSquadSecond() {
        return this.squadSecond;
    }

    public final String getSportName() {
        return this.sportName;
    }

    public final String getSquadColorPalette() {
        return this.squadColorPalette;
    }

    public final String getStartColor() {
        return this.startColor;
    }

    public final String getEndColor() {
        return this.endColor;
    }

    public final int getMediumFont() {
        return this.mediumFont;
    }

    public final Date getStartTime() {
        return this.startTime;
    }

    public final String getRoundNameTrimmedText() {
        return this.roundNameTrimmedText;
    }

    public final String getSTART_ALPHA_VALUE() {
        return this.START_ALPHA_VALUE;
    }

    public final String getEND_ALPHA_VALUE() {
        return this.END_ALPHA_VALUE;
    }
}
