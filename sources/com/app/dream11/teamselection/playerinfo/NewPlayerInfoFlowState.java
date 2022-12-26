package com.app.dream11.teamselection.playerinfo;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.app.dream11.contest.flowstates.AddEmailBSFlowState;
import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import o.getTargetTypes;
import o.isAfterLast;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class NewPlayerInfoFlowState extends FlowState {
    public /* synthetic */ NewPlayerInfoFlowState(String str, getTargetTypes gettargettypes) {
        this(str);
    }

    private NewPlayerInfoFlowState(String str) {
        super(FlowStates.PLAYER_INFO_NEW, null, str);
    }

    /* loaded from: classes6.dex */
    public static final class valueOf {
        private static int HaptikSDK$d = 21;
        private static int ak = 0;
        private static int isLogoutPending = 1;
        private final boolean HaptikSDK$a;
        private final boolean HaptikSDK$b;
        private final int HaptikSDK$c;
        private final String HaptikSDK$e;
        private final String HaptikWebView;
        private final boolean ag$a;
        private final String ah$a;
        private final String ah$b;
        private final int getInitSettings;
        private final int getSignupData;
        private final int invoke;
        private final boolean toString;
        private final String valueOf;
        private final String values;

        public valueOf(int i, String str, boolean z, int i2, int i3, String str2, int i4, boolean z2, String str3, String str4, boolean z3, boolean z4, String str5, String str6) {
            runAnimators.ag$a(str, "playerSquadName");
            runAnimators.ag$a(str2, "calledFrom");
            runAnimators.ag$a(str3, values((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 130 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), false, Color.blue(0) + 6, new char[]{65528, 6, 2, '\b', 5, 65526}).intern());
            runAnimators.ag$a(str4, FlowState.WLS_SLUG);
            this.HaptikSDK$c = i;
            this.ah$b = str;
            this.HaptikSDK$a = z;
            this.getInitSettings = i2;
            this.invoke = i3;
            this.values = str2;
            this.getSignupData = i4;
            this.ag$a = z2;
            this.HaptikSDK$e = str3;
            this.HaptikWebView = str4;
            this.HaptikSDK$b = z3;
            this.toString = z4;
            this.ah$a = str5;
            this.valueOf = str6;
        }

        public final boolean HaptikSDK$a() {
            try {
                int i = isLogoutPending + 61;
                ak = i % 128;
                int i2 = i % 2;
                boolean z = this.HaptikSDK$a;
                int i3 = isLogoutPending + 19;
                ak = i3 % 128;
                if (i3 % 2 == 0) {
                    return z;
                }
                Object[] objArr = null;
                int length = objArr.length;
                return z;
            } catch (Exception e) {
                throw e;
            }
        }

        public final String HaptikSDK$b() {
            int i = isLogoutPending + 51;
            ak = i % 128;
            int i2 = i % 2;
            String str = this.ah$b;
            int i3 = ak + 53;
            isLogoutPending = i3 % 128;
            int i4 = i3 % 2;
            return str;
        }

        public final int HaptikSDK$c() {
            int i;
            int i2 = ak + 79;
            isLogoutPending = i2 % 128;
            if (!(i2 % 2 == 0)) {
                i = this.HaptikSDK$c;
            } else {
                try {
                    i = this.HaptikSDK$c;
                    int i3 = 96 / 0;
                } catch (Exception e) {
                    throw e;
                }
            }
            int i4 = ak + 69;
            isLogoutPending = i4 % 128;
            int i5 = i4 % 2;
            return i;
        }

        public final int HaptikSDK$d() {
            int i = ak + 111;
            isLogoutPending = i % 128;
            int i2 = i % 2;
            int i3 = this.getSignupData;
            int i4 = ak + 113;
            isLogoutPending = i4 % 128;
            int i5 = i4 % 2;
            return i3;
        }

        public final String ag$a() {
            String str;
            int i = ak + 63;
            isLogoutPending = i % 128;
            if ((i % 2 == 0 ? 'S' : (char) 23) != 'S') {
                str = this.values;
            } else {
                str = this.values;
                Object[] objArr = null;
                int length = objArr.length;
            }
            try {
                int i2 = ak + 115;
                isLogoutPending = i2 % 128;
                int i3 = i2 % 2;
                return str;
            } catch (Exception e) {
                throw e;
            }
        }

        public final int ah$b() {
            int i = ak + 115;
            isLogoutPending = i % 128;
            int i2 = i % 2;
            int i3 = this.invoke;
            try {
                int i4 = ak + 85;
                isLogoutPending = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 29 / 0;
                    return i3;
                }
                return i3;
            } catch (Exception e) {
                throw e;
            }
        }

        public final int getInitSettings() {
            int i = isLogoutPending + 37;
            ak = i % 128;
            int i2 = i % 2;
            int i3 = this.getInitSettings;
            int i4 = isLogoutPending + 73;
            ak = i4 % 128;
            if (i4 % 2 == 0) {
                return i3;
            }
            int i5 = 97 / 0;
            return i3;
        }

        public final boolean HaptikSDK$e() {
            int i = ak + 37;
            isLogoutPending = i % 128;
            int i2 = i % 2;
            boolean z = this.ag$a;
            try {
                int i3 = isLogoutPending + 49;
                ak = i3 % 128;
                if ((i3 % 2 != 0 ? (char) 22 : (char) 2) != 2) {
                    Object obj = null;
                    super.hashCode();
                    return z;
                }
                return z;
            } catch (Exception e) {
                throw e;
            }
        }

        public final boolean HaptikWebView() {
            int i = isLogoutPending + 57;
            ak = i % 128;
            int i2 = i % 2;
            boolean z = this.HaptikSDK$b;
            int i3 = isLogoutPending + 75;
            ak = i3 % 128;
            int i4 = i3 % 2;
            return z;
        }

        public final String invoke() {
            String str;
            int i = ak + 41;
            isLogoutPending = i % 128;
            if ((i % 2 == 0 ? (char) 11 : 'M') != 11) {
                str = this.HaptikSDK$e;
            } else {
                str = this.HaptikSDK$e;
                Object obj = null;
                super.hashCode();
            }
            int i2 = ak + 19;
            isLogoutPending = i2 % 128;
            if (!(i2 % 2 == 0)) {
                return str;
            }
            int i3 = 76 / 0;
            return str;
        }

        public final boolean getSignupData() {
            int i = ak + 37;
            isLogoutPending = i % 128;
            int i2 = i % 2;
            boolean z = this.toString;
            try {
                int i3 = ak + 123;
                isLogoutPending = i3 % 128;
                int i4 = i3 % 2;
                return z;
            } catch (Exception e) {
                throw e;
            }
        }

        public final String values() {
            int i = ak + 117;
            isLogoutPending = i % 128;
            int i2 = i % 2;
            String str = this.ah$a;
            int i3 = isLogoutPending + 61;
            ak = i3 % 128;
            int i4 = i3 % 2;
            return str;
        }

        public final String ah$a() {
            int i = ak + 53;
            isLogoutPending = i % 128;
            if (i % 2 == 0) {
                String str = this.valueOf;
                Object[] objArr = null;
                int length = objArr.length;
                return str;
            }
            return this.valueOf;
        }

        public final NewPlayerInfoFlowState valueOf() {
            Object[] objArr = null;
            NewPlayerInfoFlowState newPlayerInfoFlowState = new NewPlayerInfoFlowState(this.HaptikWebView, null);
            newPlayerInfoFlowState.putExtra("callFrom", ag$a());
            newPlayerInfoFlowState.putExtra(AddEmailBSFlowState.TOUR_ID_KEY, Integer.valueOf(getInitSettings()));
            newPlayerInfoFlowState.putExtra(AddEmailBSFlowState.ROUND_ID_KEY, Integer.valueOf(ah$b()));
            newPlayerInfoFlowState.putExtra("player_id", Integer.valueOf(HaptikSDK$c()));
            newPlayerInfoFlowState.putExtra("player_squad_name", HaptikSDK$b());
            newPlayerInfoFlowState.putExtra("shouldShowPlayerImage", Integer.valueOf(HaptikSDK$a() ? 1 : 0));
            newPlayerInfoFlowState.putExtra("isFromHomeTeam", Boolean.valueOf(HaptikSDK$e()));
            newPlayerInfoFlowState.putExtra("teamId", Integer.valueOf(HaptikSDK$d()));
            newPlayerInfoFlowState.putExtra(values(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), TextUtils.indexOf("", "") + 130, false, (ViewConfiguration.getEdgeSlop() >> 16) + 6, new char[]{65528, 6, 2, '\b', 5, 65526}).intern(), invoke());
            newPlayerInfoFlowState.putExtra("isPlayerSelected", Boolean.valueOf(HaptikWebView()));
            newPlayerInfoFlowState.putExtra("actionName", values());
            newPlayerInfoFlowState.putExtra("playerInfoErrorMesg", ah$a());
            newPlayerInfoFlowState.putExtra("isFromRN", Boolean.valueOf(getSignupData()));
            int i = ak + 57;
            isLogoutPending = i % 128;
            if (!(i % 2 != 0)) {
                int length = objArr.length;
                return newPlayerInfoFlowState;
            }
            return newPlayerInfoFlowState;
        }

        private static String values(int i, int i2, boolean z, int i3, char[] cArr) {
            String str;
            synchronized (isAfterLast.valueOf) {
                char[] cArr2 = new char[i3];
                isAfterLast.values = 0;
                while (isAfterLast.values < i3) {
                    isAfterLast.ag$a = cArr[isAfterLast.values];
                    cArr2[isAfterLast.values] = (char) (isAfterLast.ag$a + i2);
                    int i4 = isAfterLast.values;
                    cArr2[i4] = (char) (cArr2[i4] - HaptikSDK$d);
                    isAfterLast.values++;
                }
                if (i > 0) {
                    isAfterLast.toString = i;
                    char[] cArr3 = new char[i3];
                    System.arraycopy(cArr2, 0, cArr3, 0, i3);
                    System.arraycopy(cArr3, 0, cArr2, i3 - isAfterLast.toString, isAfterLast.toString);
                    System.arraycopy(cArr3, isAfterLast.toString, cArr2, 0, i3 - isAfterLast.toString);
                }
                if (z) {
                    char[] cArr4 = new char[i3];
                    isAfterLast.values = 0;
                    while (isAfterLast.values < i3) {
                        cArr4[isAfterLast.values] = cArr2[(i3 - isAfterLast.values) - 1];
                        isAfterLast.values++;
                    }
                    cArr2 = cArr4;
                }
                str = new String(cArr2);
            }
            return str;
        }
    }
}
