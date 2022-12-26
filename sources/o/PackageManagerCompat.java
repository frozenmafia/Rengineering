package o;

import com.app.dream11.core.service.graphql.api.PlayerInfoQuery;
import com.app.dream11.teamselection.playerinfo.vm.PlayerPointsInMatchVM;
import java.util.Date;
/* loaded from: classes3.dex */
public final /* synthetic */ class PackageManagerCompat implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ PackageManagerCompat valueOf = new PackageManagerCompat();

    /* loaded from: classes3.dex */
    public final /* synthetic */ class UnusedAppRestrictionsStatus implements FrameworkSQLiteOpenHelperFactory {
        public static final /* synthetic */ UnusedAppRestrictionsStatus ag$a = new UnusedAppRestrictionsStatus();

        private /* synthetic */ UnusedAppRestrictionsStatus() {
        }

        @Override // o.FrameworkSQLiteOpenHelperFactory
        public final Object apply(Object obj) {
            String m1081displayDate$lambda3;
            m1081displayDate$lambda3 = PlayerPointsInMatchVM.m1081displayDate$lambda3((Api30Impl) obj);
            return m1081displayDate$lambda3;
        }
    }

    private /* synthetic */ PackageManagerCompat() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        PlayerInfoQuery.Player areunusedapprestrictionsavailable;
        areunusedapprestrictionsavailable = areUnusedAppRestrictionsAvailable.toString((PlayerInfoQuery.Data) obj);
        return areunusedapprestrictionsavailable;
    }

    /* loaded from: classes3.dex */
    public final class Api30Impl {
        private final String ag$a;
        private final boolean ah$a;
        private final String valueOf;
        private final Date values;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Api30Impl) {
                Api30Impl api30Impl = (Api30Impl) obj;
                return runAnimators.values((Object) this.valueOf, (Object) api30Impl.valueOf) && runAnimators.values((Object) this.ag$a, (Object) api30Impl.ag$a) && this.ah$a == api30Impl.ah$a && runAnimators.values(this.values, api30Impl.values);
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.valueOf.hashCode();
            int hashCode2 = this.ag$a.hashCode();
            boolean z = this.ah$a;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return (((((hashCode * 31) + hashCode2) * 31) + i) * 31) + this.values.hashCode();
        }

        public String toString() {
            String str = this.valueOf;
            String str2 = this.ag$a;
            boolean z = this.ah$a;
            Date date = this.values;
            return "PlayerPointsInMatch(opponentTeamName=" + str + ", pointsValue=" + str2 + ", isInDreamTeam=" + z + ", matchDate=" + date + ")";
        }

        public Api30Impl(String str, String str2, boolean z, Date date) {
            runAnimators.ag$a(str, "opponentTeamName");
            runAnimators.ag$a(str2, "pointsValue");
            runAnimators.ag$a(date, "matchDate");
            this.valueOf = str;
            this.ag$a = str2;
            this.ah$a = z;
            this.values = date;
        }

        public final Date ag$a() {
            return this.values;
        }

        public final boolean ah$a() {
            return this.ah$a;
        }

        public final String valueOf() {
            return this.valueOf;
        }

        public final String values() {
            return this.ag$a;
        }
    }
}
