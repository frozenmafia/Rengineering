package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import com.app.dream11.contest.teamcompare.CompareTeamFlowState;
import com.app.dream11.core.service.graphql.api.type.ContestCategory;
import com.app.dream11.core.service.graphql.api.type.MatchStatus;
import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
/* loaded from: classes.dex */
public final class getFloatValue {
    private static int HaptikSDK$d = 0;
    private static int HaptikSDK$e = 1;
    private static char[] HaptikWebView = {18098, 41740, 36336, 63061, 53290, 14990};
    private static long getSignupData = 418616267440711074L;
    private final String HaptikSDK$a;
    private final String HaptikSDK$b;
    private final MatchStatus HaptikSDK$c;
    private final String ag$a;
    private final Boolean ah$a;
    private final int ah$b;
    private final String invoke;
    private final String toString;
    private final ContestCategory valueOf;
    private final int values;

    public getFloatValue(String str, MatchStatus matchStatus, int i, int i2, String str2, String str3, String str4, Boolean bool, String str5, ContestCategory contestCategory) {
        runAnimators.ag$a(str, HeadToHeadMatchPickerFlowState.MATCH_NAME);
        runAnimators.ag$a(matchStatus, HeadToHeadMatchPickerFlowState.MATCH_STATUS);
        runAnimators.ag$a(str2, CompareTeamFlowState.CONTEST_ID);
        runAnimators.ag$a(str3, values(6 - TextUtils.getTrimmedLength(""), Color.alpha(0), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 18112)).intern());
        runAnimators.ag$a(str5, "streamingStatus");
        runAnimators.ag$a(contestCategory, "contestCategory");
        this.HaptikSDK$b = str;
        this.HaptikSDK$c = matchStatus;
        this.values = i;
        this.ah$b = i2;
        this.toString = str2;
        this.HaptikSDK$a = str3;
        this.ag$a = str4;
        this.ah$a = bool;
        this.invoke = str5;
        this.valueOf = contestCategory;
    }

    public final String ah$b() {
        int i = HaptikSDK$d + 33;
        HaptikSDK$e = i % 128;
        int i2 = i % 2;
        try {
            String str = this.HaptikSDK$b;
            int i3 = HaptikSDK$d + 119;
            HaptikSDK$e = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final MatchStatus invoke() {
        int i = HaptikSDK$d + 23;
        HaptikSDK$e = i % 128;
        int i2 = i % 2;
        try {
            MatchStatus matchStatus = this.HaptikSDK$c;
            int i3 = HaptikSDK$d + 3;
            HaptikSDK$e = i3 % 128;
            int i4 = i3 % 2;
            return matchStatus;
        } catch (Exception e) {
            throw e;
        }
    }

    public final int ag$a() {
        try {
            int i = HaptikSDK$e + 67;
            try {
                HaptikSDK$d = i % 128;
                if ((i % 2 != 0 ? '!' : '\n') != '!') {
                    return this.values;
                }
                int i2 = 84 / 0;
                return this.values;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final int HaptikSDK$b() {
        int i = HaptikSDK$e + 115;
        HaptikSDK$d = i % 128;
        if ((i % 2 != 0 ? (char) 1 : (char) 30) != 30) {
            int i2 = this.ah$b;
            Object obj = null;
            super.hashCode();
            return i2;
        }
        try {
            return this.ah$b;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String ah$a() {
        String str;
        int i = HaptikSDK$d + 75;
        HaptikSDK$e = i % 128;
        if ((i % 2 != 0 ? (char) 23 : 'K') != 23) {
            str = this.toString;
            Object[] objArr = null;
            int length = objArr.length;
        } else {
            try {
                str = this.toString;
            } catch (Exception e) {
                throw e;
            }
        }
        int i2 = HaptikSDK$d + 51;
        HaptikSDK$e = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final String HaptikSDK$c() {
        int i = HaptikSDK$d + 107;
        HaptikSDK$e = i % 128;
        int i2 = i % 2;
        try {
            String str = this.HaptikSDK$a;
            int i3 = HaptikSDK$e + 15;
            HaptikSDK$d = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String values() {
        int i = HaptikSDK$e + 75;
        HaptikSDK$d = i % 128;
        int i2 = i % 2;
        String str = this.ag$a;
        int i3 = HaptikSDK$d + 43;
        HaptikSDK$e = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public final Boolean getSignupData() {
        Boolean bool;
        int i = HaptikSDK$d + 13;
        HaptikSDK$e = i % 128;
        if ((i % 2 == 0 ? (char) 29 : ']') != ']') {
            bool = this.ah$a;
            Object[] objArr = null;
            int length = objArr.length;
        } else {
            bool = this.ah$a;
        }
        int i2 = HaptikSDK$d + 55;
        HaptikSDK$e = i2 % 128;
        if ((i2 % 2 == 0 ? 'a' : (char) 24) != 'a') {
            return bool;
        }
        int i3 = 3 / 0;
        return bool;
    }

    public final String HaptikSDK$a() {
        String str;
        int i = HaptikSDK$d + 75;
        HaptikSDK$e = i % 128;
        if (i % 2 != 0) {
            str = this.invoke;
        } else {
            str = this.invoke;
            Object[] objArr = null;
            int length = objArr.length;
        }
        int i2 = HaptikSDK$e + 11;
        HaptikSDK$d = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final ContestCategory valueOf() {
        int i = HaptikSDK$d + 55;
        HaptikSDK$e = i % 128;
        int i2 = i % 2;
        ContestCategory contestCategory = this.valueOf;
        try {
            int i3 = HaptikSDK$e + 53;
            HaptikSDK$d = i3 % 128;
            int i4 = i3 % 2;
            return contestCategory;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String HaptikSDK$d() {
        int i = HaptikSDK$e + 101;
        HaptikSDK$d = i % 128;
        int i2 = i % 2;
        String str = this.HaptikSDK$a;
        if (runAnimators.values((Object) str, (Object) "Contest Leaderboard")) {
            return "Contest Leaderboard";
        }
        if (runAnimators.values((Object) str, (Object) "Joined Contest")) {
            int i3 = HaptikSDK$d + 87;
            HaptikSDK$e = i3 % 128;
            if ((i3 % 2 == 0 ? (char) 15 : 'G') == 15) {
                Object obj = null;
                super.hashCode();
            }
            return "Contest Home";
        }
        return this.HaptikSDK$a;
    }

    private static String values(int i, int i2, char c) {
        String str;
        synchronized (move.valueOf) {
            char[] cArr = new char[i];
            move.values = 0;
            while (move.values < i) {
                cArr[move.values] = (char) ((HaptikWebView[move.values + i2] ^ (move.values * getSignupData)) ^ c);
                move.values++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
