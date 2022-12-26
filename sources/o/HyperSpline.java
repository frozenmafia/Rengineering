package o;

import com.app.dream11.model.WinnerBreakUpResponse;
/* loaded from: classes3.dex */
public final class HyperSpline {
    private final int ag$a;
    private final WinnerBreakUpResponse toString;
    private final double valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HyperSpline) {
            HyperSpline hyperSpline = (HyperSpline) obj;
            return this.ag$a == hyperSpline.ag$a && runAnimators.values(Double.valueOf(this.valueOf), Double.valueOf(hyperSpline.valueOf)) && runAnimators.values(this.toString, hyperSpline.toString);
        }
        return false;
    }

    public int hashCode() {
        return (((this.ag$a * 31) + Double.doubleToLongBits(this.valueOf)) * 31) + this.toString.hashCode();
    }

    public String toString() {
        int i = this.ag$a;
        double d = this.valueOf;
        WinnerBreakUpResponse winnerBreakUpResponse = this.toString;
        return "WinningBreakupData(leagueId=" + i + ", prizeAmt=" + d + ", response=" + winnerBreakUpResponse + ")";
    }

    public final int ah$a() {
        return this.ag$a;
    }

    public final WinnerBreakUpResponse valueOf() {
        return this.toString;
    }

    public final double values() {
        return this.valueOf;
    }
}
