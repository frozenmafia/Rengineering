package o;
/* loaded from: classes4.dex */
public final class getColorStateListFromResource {
    private final boolean valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getColorStateListFromResource) && this.valueOf == ((getColorStateListFromResource) obj).valueOf;
    }

    public int hashCode() {
        boolean z = this.valueOf;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "_Is_Admin_Boolean_(value=" + this.valueOf + ')';
    }

    public getColorStateListFromResource(boolean z) {
        this.valueOf = z;
    }

    public final boolean ah$a() {
        return this.valueOf;
    }
}
