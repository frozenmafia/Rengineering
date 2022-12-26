package o;

import java.util.Objects;
import o.getChildItemId;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class findViewHolderForLayoutPosition extends getChildItemId.values {
    private final String ag$a;
    private final boolean ah$a;
    private final String valueOf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public findViewHolderForLayoutPosition(String str, String str2, boolean z) {
        Objects.requireNonNull(str, "Null osRelease");
        this.valueOf = str;
        Objects.requireNonNull(str2, "Null osCodeName");
        this.ag$a = str2;
        this.ah$a = z;
    }

    @Override // o.getChildItemId.values
    public String ah$a() {
        return this.valueOf;
    }

    @Override // o.getChildItemId.values
    public String values() {
        return this.ag$a;
    }

    @Override // o.getChildItemId.values
    public boolean ag$a() {
        return this.ah$a;
    }

    public String toString() {
        return "OsData{osRelease=" + this.valueOf + ", osCodeName=" + this.ag$a + ", isRooted=" + this.ah$a + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof getChildItemId.values) {
            getChildItemId.values valuesVar = (getChildItemId.values) obj;
            return this.valueOf.equals(valuesVar.ah$a()) && this.ag$a.equals(valuesVar.values()) && this.ah$a == valuesVar.ag$a();
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.valueOf.hashCode();
        return ((((hashCode ^ 1000003) * 1000003) ^ this.ag$a.hashCode()) * 1000003) ^ (this.ah$a ? 1231 : 1237);
    }
}
