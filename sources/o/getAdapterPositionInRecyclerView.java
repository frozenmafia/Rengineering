package o;

import java.util.Objects;
import o.OrientationHelper;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class getAdapterPositionInRecyclerView extends getChildItemId$ah$a {
    private final String ag$a;
    private final String ah$a;
    private final String ah$b;
    private final String toString;
    private final OrientationHelper.AnonymousClass2 valueOf;
    private final int values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getAdapterPositionInRecyclerView(String str, String str2, String str3, String str4, int i, OrientationHelper.AnonymousClass2 anonymousClass2) {
        Objects.requireNonNull(str, "Null appIdentifier");
        this.ah$a = str;
        Objects.requireNonNull(str2, "Null versionCode");
        this.ag$a = str2;
        Objects.requireNonNull(str3, "Null versionName");
        this.ah$b = str3;
        Objects.requireNonNull(str4, "Null installUuid");
        this.toString = str4;
        this.values = i;
        Objects.requireNonNull(anonymousClass2, "Null developmentPlatformProvider");
        this.valueOf = anonymousClass2;
    }

    @Override // o.getChildItemId$ah$a
    public String ah$a() {
        return this.ah$a;
    }

    @Override // o.getChildItemId$ah$a
    public String HaptikSDK$c() {
        return this.ag$a;
    }

    @Override // o.getChildItemId$ah$a
    public String ah$b() {
        return this.ah$b;
    }

    @Override // o.getChildItemId$ah$a
    public String values() {
        return this.toString;
    }

    @Override // o.getChildItemId$ah$a
    public int ag$a() {
        return this.values;
    }

    @Override // o.getChildItemId$ah$a
    public OrientationHelper.AnonymousClass2 valueOf() {
        return this.valueOf;
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.ah$a + ", versionCode=" + this.ag$a + ", versionName=" + this.ah$b + ", installUuid=" + this.toString + ", deliveryMechanism=" + this.values + ", developmentPlatformProvider=" + this.valueOf + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof getChildItemId$ah$a) {
            getChildItemId$ah$a getchilditemid_ah_a = (getChildItemId$ah$a) obj;
            return this.ah$a.equals(getchilditemid_ah_a.ah$a()) && this.ag$a.equals(getchilditemid_ah_a.HaptikSDK$c()) && this.ah$b.equals(getchilditemid_ah_a.ah$b()) && this.toString.equals(getchilditemid_ah_a.values()) && this.values == getchilditemid_ah_a.ag$a() && this.valueOf.equals(getchilditemid_ah_a.valueOf());
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.ah$a.hashCode();
        int hashCode2 = this.ag$a.hashCode();
        int hashCode3 = this.ah$b.hashCode();
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ this.toString.hashCode()) * 1000003) ^ this.values) * 1000003) ^ this.valueOf.hashCode();
    }
}
