package o;

import java.util.Objects;
/* loaded from: classes5.dex */
final class updateItemAt extends localToGlobal {
    private final String ah$a;
    private final String values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public updateItemAt(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.values = str;
        Objects.requireNonNull(str2, "Null version");
        this.ah$a = str2;
    }

    @Override // o.localToGlobal
    public String values() {
        return this.values;
    }

    @Override // o.localToGlobal
    public String ah$a() {
        return this.ah$a;
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.values + ", version=" + this.ah$a + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof localToGlobal) {
            localToGlobal localtoglobal = (localToGlobal) obj;
            return this.values.equals(localtoglobal.values()) && this.ah$a.equals(localtoglobal.ah$a());
        }
        return false;
    }

    public int hashCode() {
        return ((this.values.hashCode() ^ 1000003) * 1000003) ^ this.ah$a.hashCode();
    }
}
