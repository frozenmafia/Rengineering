package com.app.dream11.newmycontests.playerstats;

import android.graphics.Color;
import android.view.ViewConfiguration;
import com.app.dream11.core.service.graphql.api.type.MatchStatus;
import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import o.getShort;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class MatchStatsFlowState extends FlowState {
    public /* synthetic */ MatchStatsFlowState(String str, getTargetTypes gettargettypes) {
        this(str);
    }

    /* loaded from: classes3.dex */
    public static final class toString {
        private static int HaptikSDK$a = 0;
        private static long HaptikSDK$b = -6203476459406969418L;
        private static char HaptikSDK$c = 0;
        private static int ah$b = 0;
        private static int getSignupData = 1;
        private final String ag$a;
        private final String ah$a;
        private final Integer invoke;
        private final Integer toString;
        private final String valueOf;
        private final MatchStatus values;

        public toString(Integer num, Integer num2, String str, MatchStatus matchStatus, String str2, String str3) {
            runAnimators.ag$a(matchStatus, HeadToHeadMatchPickerFlowState.MATCH_STATUS);
            this.toString = num;
            this.invoke = num2;
            this.ah$a = str;
            this.values = matchStatus;
            this.valueOf = str2;
            this.ag$a = str3;
        }

        public final String HaptikSDK$a() {
            String str;
            try {
                int i = HaptikSDK$a + 117;
                getSignupData = i % 128;
                if ((i % 2 == 0 ? (char) 25 : 'Z') != 25) {
                    try {
                        str = this.ag$a;
                    } catch (Exception e) {
                        throw e;
                    }
                } else {
                    str = this.ag$a;
                    Object obj = null;
                    super.hashCode();
                }
                int i2 = HaptikSDK$a + 47;
                getSignupData = i2 % 128;
                int i3 = i2 % 2;
                return str;
            } catch (Exception e2) {
                throw e2;
            }
        }

        public final Integer HaptikSDK$b() {
            int i = HaptikSDK$a + 57;
            getSignupData = i % 128;
            int i2 = i % 2;
            Integer num = this.invoke;
            int i3 = getSignupData + 81;
            HaptikSDK$a = i3 % 128;
            int i4 = i3 % 2;
            return num;
        }

        public final Integer ag$a() {
            try {
                int i = HaptikSDK$a + 33;
                getSignupData = i % 128;
                int i2 = i % 2;
                Integer num = this.toString;
                int i3 = HaptikSDK$a + 25;
                getSignupData = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 31 / 0;
                    return num;
                }
                return num;
            } catch (Exception e) {
                throw e;
            }
        }

        public final String ah$a() {
            int i = getSignupData + 47;
            HaptikSDK$a = i % 128;
            int i2 = i % 2;
            String str = this.ah$a;
            int i3 = HaptikSDK$a + 1;
            getSignupData = i3 % 128;
            int i4 = i3 % 2;
            return str;
        }

        public final MatchStatus valueOf() {
            try {
                int i = getSignupData + 13;
                HaptikSDK$a = i % 128;
                int i2 = i % 2;
                MatchStatus matchStatus = this.values;
                int i3 = HaptikSDK$a + 119;
                getSignupData = i3 % 128;
                int i4 = i3 % 2;
                return matchStatus;
            } catch (Exception e) {
                throw e;
            }
        }

        public final MatchStatsFlowState values() {
            int intValue;
            int intValue2;
            Object obj = null;
            MatchStatsFlowState matchStatsFlowState = new MatchStatsFlowState(this.valueOf, null);
            Integer HaptikSDK$b2 = HaptikSDK$b();
            if (HaptikSDK$b2 == null) {
                int i = getSignupData + 1;
                HaptikSDK$a = i % 128;
                int i2 = i % 2;
                intValue = 0;
            } else {
                intValue = HaptikSDK$b2.intValue();
            }
            matchStatsFlowState.putExtra("tourID", Integer.valueOf(intValue));
            Integer ag$a = ag$a();
            if (ag$a == null) {
                intValue2 = 0;
            } else {
                intValue2 = ag$a.intValue();
                int i3 = HaptikSDK$a + 73;
                getSignupData = i3 % 128;
                int i4 = i3 % 2;
            }
            matchStatsFlowState.putExtra("roundID", Integer.valueOf(intValue2));
            String ah$a = ah$a();
            if ((ah$a == null ? (char) 20 : '2') != '2') {
                int i5 = getSignupData + 23;
                HaptikSDK$a = i5 % 128;
                if (i5 % 2 != 0) {
                    super.hashCode();
                }
                ah$a = "-1";
            }
            matchStatsFlowState.putExtra("leagueId", ah$a);
            matchStatsFlowState.putExtra("match_status", valueOf());
            matchStatsFlowState.putExtra(ag$a(Color.blue(0), new char[]{30713, 33802, 2702, 3854}, new char[]{46518, 4236, 54023, 43496}, (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 3594), new char[]{2998, 51874, 34729, 23373, 27446, 10840}).intern(), HaptikSDK$a());
            return matchStatsFlowState;
        }

        private static String ag$a(int i, char[] cArr, char[] cArr2, char c, char[] cArr3) {
            String str;
            synchronized (getShort.toString) {
                char[] cArr4 = (char[]) cArr.clone();
                char[] cArr5 = (char[]) cArr2.clone();
                cArr4[0] = (char) (c ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i));
                int length = cArr3.length;
                char[] cArr6 = new char[length];
                getShort.valueOf = 0;
                while (getShort.valueOf < length) {
                    int i2 = (getShort.valueOf + 2) % 4;
                    int i3 = (getShort.valueOf + 3) % 4;
                    getShort.values = (char) (((cArr4[getShort.valueOf % 4] * 32718) + cArr5[i2]) % 65535);
                    cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / 65535);
                    cArr4[i3] = getShort.values;
                    cArr6[getShort.valueOf] = (char) ((((cArr4[i3] ^ cArr3[getShort.valueOf]) ^ HaptikSDK$b) ^ ah$b) ^ HaptikSDK$c);
                    getShort.valueOf++;
                }
                str = new String(cArr6);
            }
            return str;
        }
    }

    private MatchStatsFlowState(String str) {
        super(FlowStates.PLAYER_STATS, null, str);
    }
}
