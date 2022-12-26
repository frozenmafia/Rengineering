package o;
/* loaded from: classes3.dex */
final class buildDocumentUri$ag$a {
    public final boolean toString;
    public final int values;

    public buildDocumentUri$ag$a(int i, boolean z) {
        this.values = i;
        this.toString = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        buildDocumentUri$ag$a builddocumenturi_ag_a = (buildDocumentUri$ag$a) obj;
        return this.values == builddocumenturi_ag_a.values && this.toString == builddocumenturi_ag_a.toString;
    }

    public int hashCode() {
        return (this.values * 31) + (this.toString ? 1 : 0);
    }
}
