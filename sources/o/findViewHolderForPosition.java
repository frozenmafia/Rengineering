package o;

import java.util.Objects;
import o.getChildItemId;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class findViewHolderForPosition extends getChildItemId {
    private final getChildItemId$ah$a ag$a;
    private final getChildItemId.toString toString;
    private final getChildItemId.values valueOf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public findViewHolderForPosition(getChildItemId$ah$a getchilditemid_ah_a, getChildItemId.values valuesVar, getChildItemId.toString tostring) {
        Objects.requireNonNull(getchilditemid_ah_a, "Null appData");
        this.ag$a = getchilditemid_ah_a;
        Objects.requireNonNull(valuesVar, "Null osData");
        this.valueOf = valuesVar;
        Objects.requireNonNull(tostring, "Null deviceData");
        this.toString = tostring;
    }

    @Override // o.getChildItemId
    public getChildItemId$ah$a values() {
        return this.ag$a;
    }

    @Override // o.getChildItemId
    public getChildItemId.values valueOf() {
        return this.valueOf;
    }

    @Override // o.getChildItemId
    public getChildItemId.toString ah$a() {
        return this.toString;
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.ag$a + ", osData=" + this.valueOf + ", deviceData=" + this.toString + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof getChildItemId) {
            getChildItemId getchilditemid = (getChildItemId) obj;
            return this.ag$a.equals(getchilditemid.values()) && this.valueOf.equals(getchilditemid.valueOf()) && this.toString.equals(getchilditemid.ah$a());
        }
        return false;
    }

    public int hashCode() {
        return ((((this.ag$a.hashCode() ^ 1000003) * 1000003) ^ this.valueOf.hashCode()) * 1000003) ^ this.toString.hashCode();
    }
}
