package o;

import java.util.HashMap;
/* loaded from: classes.dex */
public final class getCurveFit {
    private final int ah$a;
    private final HashMap<String, Object> toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof getCurveFit) {
            getCurveFit getcurvefit = (getCurveFit) obj;
            return this.ah$a == getcurvefit.ah$a && runAnimators.values(this.toString, getcurvefit.toString);
        }
        return false;
    }

    public int hashCode() {
        return (this.ah$a * 31) + this.toString.hashCode();
    }

    public String toString() {
        int i = this.ah$a;
        HashMap<String, Object> hashMap = this.toString;
        return "FcSdkData(fcMatchId=" + i + ", analyticsParams=" + hashMap + ")";
    }

    public getCurveFit(int i, HashMap<String, Object> hashMap) {
        runAnimators.ag$a(hashMap, "analyticsParams");
        this.ah$a = i;
        this.toString = hashMap;
    }

    public final int ag$a() {
        return this.ah$a;
    }

    public final HashMap<String, Object> values() {
        return this.toString;
    }
}
