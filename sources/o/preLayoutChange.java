package o;

import com.app.dream11.teamselection.playerinfo.vm.PlayerPointsInMatchVM;
import java.util.List;
/* loaded from: classes3.dex */
public final class preLayoutChange {
    private final IntentCompat ag$a;
    private final double toString;
    private final List<UnusedAppRestrictionsBackportCallback> valueOf;
    private final List<PlayerPointsInMatchVM> values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof preLayoutChange) {
            preLayoutChange prelayoutchange = (preLayoutChange) obj;
            return runAnimators.values(this.ag$a, prelayoutchange.ag$a) && runAnimators.values(Double.valueOf(this.toString), Double.valueOf(prelayoutchange.toString)) && runAnimators.values(this.valueOf, prelayoutchange.valueOf) && runAnimators.values(this.values, prelayoutchange.values);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.ag$a.hashCode() * 31) + Double.doubleToLongBits(this.toString)) * 31) + this.valueOf.hashCode()) * 31) + this.values.hashCode();
    }

    public String toString() {
        IntentCompat intentCompat = this.ag$a;
        double d = this.toString;
        List<UnusedAppRestrictionsBackportCallback> list = this.valueOf;
        List<PlayerPointsInMatchVM> list2 = this.values;
        return "RolewiseComponentMappedData(metaModel=" + intentCompat + ", totalPoints=" + d + ", rolewiseTagsList=" + list + ", recentPoints=" + list2 + ")";
    }

    public preLayoutChange(IntentCompat intentCompat, double d, List<UnusedAppRestrictionsBackportCallback> list, List<PlayerPointsInMatchVM> list2) {
        runAnimators.ag$a(intentCompat, "metaModel");
        runAnimators.ag$a(list, "rolewiseTagsList");
        runAnimators.ag$a(list2, "recentPoints");
        this.ag$a = intentCompat;
        this.toString = d;
        this.valueOf = list;
        this.values = list2;
    }

    public final List<PlayerPointsInMatchVM> ag$a() {
        return this.values;
    }

    public final List<UnusedAppRestrictionsBackportCallback> ah$a() {
        return this.valueOf;
    }

    public final IntentCompat valueOf() {
        return this.ag$a;
    }

    public final double values() {
        return this.toString;
    }
}
