package o;
/* loaded from: classes4.dex */
public final class onPreBind {
    private final boolean toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof onPreBind) && this.toString == ((onPreBind) obj).toString;
    }

    public int hashCode() {
        boolean z = this.toString;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "_Has_Caption_Boolean_(value=" + this.toString + ')';
    }

    public onPreBind(boolean z) {
        this.toString = z;
    }

    public final boolean ag$a() {
        return this.toString;
    }
}
