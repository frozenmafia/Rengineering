package o;
/* loaded from: classes3.dex */
public final class directMapping {
    private final int ag$a;
    private final double toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof directMapping) {
            directMapping directmapping = (directMapping) obj;
            return this.ag$a == directmapping.ag$a && runAnimators.values(Double.valueOf(this.toString), Double.valueOf(directmapping.toString));
        }
        return false;
    }

    public int hashCode() {
        return (this.ag$a * 31) + Double.doubleToLongBits(this.toString);
    }

    public String toString() {
        int i = this.ag$a;
        double d = this.toString;
        return "BestUserTeam(id=" + i + ", totalPoints=" + d + ")";
    }

    public directMapping(int i, double d) {
        this.ag$a = i;
        this.toString = d;
    }

    public final int values() {
        return this.ag$a;
    }

    public final double ah$a() {
        return this.toString;
    }
}
