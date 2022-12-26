package o;
/* loaded from: classes4.dex */
public final class bindToAddedViews {
    private final boolean values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bindToAddedViews) && this.values == ((bindToAddedViews) obj).values;
    }

    public int hashCode() {
        boolean z = this.values;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "_Chat_Thumbnail_Boolean_(value=" + this.values + ')';
    }

    public bindToAddedViews(boolean z) {
        this.values = z;
    }

    public final boolean valueOf() {
        return this.values;
    }
}
