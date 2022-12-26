package o;
/* loaded from: classes3.dex */
public final class indexOfNull {
    private final double ag$a;
    private final double ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof indexOfNull) {
            indexOfNull indexofnull = (indexOfNull) obj;
            return runAnimators.values(Double.valueOf(this.ag$a), Double.valueOf(indexofnull.ag$a)) && runAnimators.values(Double.valueOf(this.ah$a), Double.valueOf(indexofnull.ah$a));
        }
        return false;
    }

    public int hashCode() {
        return (Double.doubleToLongBits(this.ag$a) * 31) + Double.doubleToLongBits(this.ah$a);
    }

    public String toString() {
        double d = this.ag$a;
        double d2 = this.ah$a;
        return "GeoLocation(latitude=" + d + ", longitude=" + d2 + ")";
    }

    public indexOfNull(double d, double d2) {
        this.ag$a = d;
        this.ah$a = d2;
    }

    public final double ag$a() {
        return this.ah$a;
    }

    public final double ah$a() {
        return this.ag$a;
    }
}
