package o;

import com.app.dream11.core.service.graphql.api.ContestsPostLockQuery;
import com.app.dream11.core.service.graphql.api.fragment.ContestItem;
import com.app.dream11.core.service.graphql.api.type.MatchStatus;
/* loaded from: classes.dex */
public class setRecycleOnMeasureEnabled {
    private final int HaptikSDK$a;
    private enableHomeButtonByDefault HaptikSDK$b;
    MatchStatus ag$a;
    private ContestItem ah$a;
    private Boolean ah$b;
    private boolean toString;
    ContestsPostLockQuery.MyTeam1 valueOf;
    private final valueOf values;

    /* loaded from: classes.dex */
    public interface valueOf {
        void ah$a(ContestsPostLockQuery.MyTeam1 myTeam1);

        void getNotifyChildrenChangedOptions();
    }

    public setRecycleOnMeasureEnabled(ContestItem contestItem, ContestsPostLockQuery.MyTeam1 myTeam1, MatchStatus matchStatus, int i, valueOf valueof, boolean z, enableHomeButtonByDefault enablehomebuttonbydefault, Boolean bool) {
        this.ah$a = contestItem;
        this.valueOf = myTeam1;
        this.ag$a = matchStatus;
        this.HaptikSDK$a = i;
        this.values = valueof;
        this.toString = z;
        this.HaptikSDK$b = enablehomebuttonbydefault;
        this.ah$b = bool;
    }

    public ContestsPostLockQuery.MyTeam1 valueOf() {
        return this.valueOf;
    }

    /* renamed from: o.setRecycleOnMeasureEnabled$5  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] ah$a;

        static {
            int[] iArr = new int[MatchStatus.values().length];
            ah$a = iArr;
            try {
                iArr[MatchStatus.IN_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ah$a[MatchStatus.WAITING_FOR_REVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public boolean ah$b() {
        if (this.ag$a != null) {
            int i = AnonymousClass5.ah$a[this.ag$a.ordinal()];
            return i == 1 || i == 2;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean HaptikSDK$a() {
        /*
            r9 = this;
            boolean r0 = r9.toString
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            com.app.dream11.core.service.graphql.api.ContestsPostLockQuery$MyTeam1 r0 = r9.valueOf
            r2 = 1
            if (r0 == 0) goto L74
            com.app.dream11.core.service.graphql.api.ContestsPostLockQuery$WinningAmount1 r0 = r0.getWinningAmount()
            r3 = 0
            if (r0 == 0) goto L23
            com.app.dream11.core.service.graphql.api.ContestsPostLockQuery$MyTeam1 r0 = r9.valueOf
            com.app.dream11.core.service.graphql.api.ContestsPostLockQuery$WinningAmount1 r0 = r0.getWinningAmount()
            double r5 = r0.getAmount()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L23
            r0 = 1
            goto L24
        L23:
            r0 = 0
        L24:
            com.app.dream11.core.service.graphql.api.ContestsPostLockQuery$MyTeam1 r5 = r9.valueOf
            java.lang.Double r5 = r5.getPoints()
            if (r5 == 0) goto L3c
            com.app.dream11.core.service.graphql.api.ContestsPostLockQuery$MyTeam1 r5 = r9.valueOf
            java.lang.Double r5 = r5.getPoints()
            double r5 = r5.doubleValue()
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L3c
            r3 = 1
            goto L3d
        L3c:
            r3 = 0
        L3d:
            com.app.dream11.core.service.graphql.api.ContestsPostLockQuery$MyTeam1 r4 = r9.valueOf
            java.lang.Integer r4 = r4.getRank()
            if (r4 == 0) goto L69
            com.app.dream11.core.service.graphql.api.ContestsPostLockQuery$MyTeam1 r4 = r9.valueOf
            java.lang.Integer r4 = r4.getRank()
            int r4 = r4.intValue()
            long r4 = (long) r4
            r6 = 1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L58
            r4 = 1
            goto L59
        L58:
            r4 = 0
        L59:
            com.app.dream11.core.service.graphql.api.ContestsPostLockQuery$MyTeam1 r5 = r9.valueOf
            java.lang.Integer r5 = r5.getRank()
            int r5 = r5.intValue()
            int r6 = r9.HaptikSDK$a
            if (r5 > r6) goto L6a
            r5 = 1
            goto L6b
        L69:
            r4 = 0
        L6a:
            r5 = 0
        L6b:
            if (r3 == 0) goto L74
            if (r0 != 0) goto L73
            if (r4 != 0) goto L73
            if (r5 == 0) goto L74
        L73:
            r1 = 1
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setRecycleOnMeasureEnabled.HaptikSDK$a():boolean");
    }

    public boolean invoke() {
        return this.ah$b.booleanValue() && this.ag$a == MatchStatus.COMPLETED && this.ah$a.getContestSize() == 2 && this.ah$a.getCurrentSize() == 2;
    }

    public String ah$a() {
        if (HaptikSDK$b()) {
            return this.HaptikSDK$b.valueOf(com.app.dream11Pro.R.string.res_0x7f120a69, new Object[0]);
        }
        return this.HaptikSDK$b.valueOf(com.app.dream11Pro.R.string.res_0x7f120a67, new Object[0]);
    }

    private boolean HaptikSDK$b() {
        ContestsPostLockQuery.MyTeam1 myTeam1;
        MatchStatus matchStatus = this.ag$a;
        return (matchStatus == null || matchStatus != MatchStatus.COMPLETED || (myTeam1 = this.valueOf) == null || myTeam1.getRank() == null || ((long) this.valueOf.getRank().intValue()) != 1) ? false : true;
    }

    public String ag$a() {
        if (HaptikSDK$b()) {
            return this.HaptikSDK$b.valueOf(com.app.dream11Pro.R.string.res_0x7f120a6a, new Object[0]);
        }
        return this.HaptikSDK$b.valueOf(com.app.dream11Pro.R.string.res_0x7f120a68, new Object[0]);
    }

    public String HaptikSDK$c() {
        MatchStatus matchStatus;
        if (this.toString || (matchStatus = this.ag$a) == null) {
            return "";
        }
        if (matchStatus == MatchStatus.COMPLETED) {
            ContestsPostLockQuery.MyTeam1 myTeam1 = this.valueOf;
            if (myTeam1 != null) {
                boolean z = myTeam1.getWinningAmount() != null && this.valueOf.getWinningAmount().getAmount() > 0.0d;
                boolean z2 = this.valueOf.getRank() != null && ((long) this.valueOf.getRank().intValue()) == 1;
                if (z) {
                    return this.HaptikSDK$b.valueOf(com.app.dream11Pro.R.string.res_0x7f120e8e, loadFont.toString(this.valueOf.getWinningAmount().getAmount()));
                }
                if (z2) {
                    return this.HaptikSDK$b.valueOf(com.app.dream11Pro.R.string.res_0x7f120e8d, new Object[0]);
                }
            }
            return "";
        }
        return this.HaptikSDK$b.valueOf(com.app.dream11Pro.R.string.res_0x7f120601, new Object[0]);
    }

    public valueOf values() {
        return this.values;
    }
}
