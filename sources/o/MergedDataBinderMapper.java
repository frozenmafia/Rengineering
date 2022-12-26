package o;
/* loaded from: classes4.dex */
public final class MergedDataBinderMapper {
    private final boolean ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MergedDataBinderMapper) && this.ah$a == ((MergedDataBinderMapper) obj).ah$a;
    }

    public int hashCode() {
        boolean z = this.ah$a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "_Contestjoinstatus_Boolean(value=" + this.ah$a + ')';
    }

    public MergedDataBinderMapper(boolean z) {
        this.ah$a = z;
    }

    public final boolean values() {
        return this.ah$a;
    }
}
