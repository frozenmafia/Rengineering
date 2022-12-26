package o;

import com.app.dream11.core.service.graphql.api.ShmeCreateTeamQuery;
import com.app.dream11.core.service.graphql.api.fragment.PlayerRole;
import com.sendbird.android.constant.StringSet;
/* loaded from: classes3.dex */
public final class getExternalCacheDirs extends androidx.databinding.BaseObservable {
    private int HaptikSDK$b;
    @androidx.databinding.Bindable
    private String ag$a;
    public String ah$a;
    @androidx.databinding.Bindable
    private double invoke;
    public String toString;
    private boolean valueOf;
    public String values;

    public String toString() {
        boolean z = this.valueOf;
        return "NewPlayerRoleVM(fake=" + z + ")";
    }

    public getExternalCacheDirs(boolean z) {
        this.valueOf = z;
        this.ag$a = "";
        this.invoke = Double.MIN_VALUE;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public getExternalCacheDirs(ShmeCreateTeamQuery.Role role) {
        this(false);
        ShmeCreateTeamQuery.Artwork artwork;
        runAnimators.ag$a(role, StringSet.role);
        ah$a(role.getId(), role.getName(), role.getPointMultiplier(), role.getColor(), role.getShortName(), (role.getArtwork().size() <= 0 || (artwork = role.getArtwork().get(0)) == null) ? null : artwork.getSrc());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public getExternalCacheDirs(ShmeCreateTeamQuery.Role1 role1) {
        this(false);
        PlayerRole.Artwork artwork;
        runAnimators.ag$a(role1, "role1");
        PlayerRole playerRole = role1.getFragments().getPlayerRole();
        ah$a(playerRole.getId(), playerRole.getName(), playerRole.getPointMultiplier(), playerRole.getColor(), playerRole.getShortName(), (!(playerRole.getArtwork().isEmpty() ^ true) || (artwork = playerRole.getArtwork().get(0)) == null) ? null : artwork.getSrc());
    }

    public final void ah$a(int i, String str, double d, String str2, String str3, String str4) {
        runAnimators.ag$a(str, "roleName");
        runAnimators.ag$a(str2, "color");
        runAnimators.ag$a(str3, "shortName");
        this.HaptikSDK$b = i;
        ag$a(str);
        this.invoke = d;
        ah$a(str2);
        toString(str3);
        if (str4 == null) {
            str4 = "";
        }
        this.ag$a = str4;
    }

    public final int ah$a() {
        return this.HaptikSDK$b;
    }

    public final void ag$a(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.ah$a = str;
    }

    public final String values() {
        String str = this.ah$a;
        if (str != null) {
            return str;
        }
        runAnimators.valueOf("roleName");
        return null;
    }

    public final void ah$a(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.toString = str;
    }

    public final double valueOf() {
        return this.invoke;
    }

    public final String ah$b() {
        String str = this.values;
        if (str != null) {
            return str;
        }
        runAnimators.valueOf("shortName");
        return null;
    }

    public final void toString(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.values = str;
    }

    @androidx.databinding.Bindable
    public final String ag$a() {
        double d = this.invoke;
        int i = (int) d;
        if (Double.compare(i, d) == 0) {
            return com.dreampay.commons.constants.Constants.WHITE_SPACE + i + "x";
        }
        double d2 = this.invoke;
        return com.dreampay.commons.constants.Constants.WHITE_SPACE + d2 + "x";
    }

    public boolean equals(Object obj) {
        return (obj instanceof getExternalCacheDirs) && ((getExternalCacheDirs) obj).HaptikSDK$b == this.HaptikSDK$b;
    }

    public int hashCode() {
        return this.HaptikSDK$b;
    }
}
