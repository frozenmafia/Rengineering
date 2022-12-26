package o;

import java.security.MessageDigest;
/* loaded from: classes3.dex */
public final class updateLayoutParamsTyped implements getDescendants {
    private final getDescendants toString;
    private final getDescendants values;

    public updateLayoutParamsTyped(getDescendants getdescendants, getDescendants getdescendants2) {
        this.toString = getdescendants;
        this.values = getdescendants2;
    }

    @Override // o.getDescendants
    public boolean equals(Object obj) {
        if (obj instanceof updateLayoutParamsTyped) {
            updateLayoutParamsTyped updatelayoutparamstyped = (updateLayoutParamsTyped) obj;
            if (this.toString.equals(updatelayoutparamstyped.toString) && this.values.equals(updatelayoutparamstyped.values)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.getDescendants
    public int hashCode() {
        return (this.toString.hashCode() * 31) + this.values.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.toString + ", signature=" + this.values + '}';
    }

    @Override // o.getDescendants
    public void ag$a(MessageDigest messageDigest) {
        this.toString.ag$a(messageDigest);
        this.values.ag$a(messageDigest);
    }
}
