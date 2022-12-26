package o;

import com.app.dream11.model.FlowState;
/* loaded from: classes.dex */
public final class setHandleNativeActionModesEnabled {
    private final boolean HaptikSDK$a;
    private final boolean HaptikSDK$b;
    private final String HaptikSDK$c;
    private final int HaptikWebView;
    private final String ag$a;
    private final boolean ah$a;
    private final int ah$b;
    private final int invoke;
    private final onActionViewExpanded toString;
    private final String valueOf;
    private final boolean values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof setHandleNativeActionModesEnabled) {
            setHandleNativeActionModesEnabled sethandlenativeactionmodesenabled = (setHandleNativeActionModesEnabled) obj;
            return this.ah$b == sethandlenativeactionmodesenabled.ah$b && this.invoke == sethandlenativeactionmodesenabled.invoke && runAnimators.values((Object) this.valueOf, (Object) sethandlenativeactionmodesenabled.valueOf) && runAnimators.values((Object) this.HaptikSDK$c, (Object) sethandlenativeactionmodesenabled.HaptikSDK$c) && this.HaptikWebView == sethandlenativeactionmodesenabled.HaptikWebView && this.values == sethandlenativeactionmodesenabled.values && this.ah$a == sethandlenativeactionmodesenabled.ah$a && this.HaptikSDK$b == sethandlenativeactionmodesenabled.HaptikSDK$b && this.HaptikSDK$a == sethandlenativeactionmodesenabled.HaptikSDK$a && runAnimators.values((Object) this.ag$a, (Object) sethandlenativeactionmodesenabled.ag$a) && runAnimators.values(this.toString, sethandlenativeactionmodesenabled.toString);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i = this.ah$b;
        int i2 = this.invoke;
        String str = this.valueOf;
        int hashCode = str == null ? 0 : str.hashCode();
        int hashCode2 = this.HaptikSDK$c.hashCode();
        int i3 = this.HaptikWebView;
        boolean z = this.values;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        boolean z2 = this.ah$a;
        int i5 = z2;
        if (z2 != 0) {
            i5 = 1;
        }
        boolean z3 = this.HaptikSDK$b;
        int i6 = z3;
        if (z3 != 0) {
            i6 = 1;
        }
        boolean z4 = this.HaptikSDK$a;
        return (((((((((((((((((((i * 31) + i2) * 31) + hashCode) * 31) + hashCode2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + i6) * 31) + (z4 ? 1 : z4 ? 1 : 0)) * 31) + this.ag$a.hashCode()) * 31) + this.toString.hashCode();
    }

    public String toString() {
        int i = this.ah$b;
        int i2 = this.invoke;
        String str = this.valueOf;
        String str2 = this.HaptikSDK$c;
        int i3 = this.HaptikWebView;
        boolean z = this.values;
        boolean z2 = this.ah$a;
        boolean z3 = this.HaptikSDK$b;
        boolean z4 = this.HaptikSDK$a;
        String str3 = this.ag$a;
        onActionViewExpanded onactionviewexpanded = this.toString;
        return "ReactLeagueDetail(tourId=" + i + ", matchId=" + i2 + ", contestId=" + str + ", site=" + str2 + ", userId=" + i3 + ", isDreamTeamEnabled=" + z + ", isLoggedIn=" + z2 + ", shouldFetchJoinedInfo=" + z3 + ", isNetworkInContestEnabled=" + z4 + ", gameId=" + str3 + ", deviceInfo=" + onactionviewexpanded + ")";
    }

    public setHandleNativeActionModesEnabled(int i, int i2, String str, String str2, int i3, boolean z, boolean z2, boolean z3, boolean z4, String str3, onActionViewExpanded onactionviewexpanded) {
        runAnimators.ag$a(str2, FlowState.SITE);
        runAnimators.ag$a(str3, "gameId");
        runAnimators.ag$a(onactionviewexpanded, "deviceInfo");
        this.ah$b = i;
        this.invoke = i2;
        this.valueOf = str;
        this.HaptikSDK$c = str2;
        this.HaptikWebView = i3;
        this.values = z;
        this.ah$a = z2;
        this.HaptikSDK$b = z3;
        this.HaptikSDK$a = z4;
        this.ag$a = str3;
        this.toString = onactionviewexpanded;
    }

    public final int HaptikSDK$b() {
        return this.ah$b;
    }

    public final int ah$a() {
        return this.invoke;
    }

    public final String valueOf() {
        return this.valueOf;
    }

    public final String invoke() {
        return this.HaptikSDK$c;
    }

    public final int HaptikSDK$a() {
        return this.HaptikWebView;
    }

    public final boolean HaptikSDK$c() {
        return this.values;
    }

    public final boolean HaptikWebView() {
        return this.ah$a;
    }

    public final boolean ah$b() {
        return this.HaptikSDK$b;
    }

    public final boolean getSignupData() {
        return this.HaptikSDK$a;
    }

    public final String values() {
        return this.ag$a;
    }

    public final onActionViewExpanded ag$a() {
        return this.toString;
    }
}
