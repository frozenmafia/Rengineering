package o;

import com.google.common.math.Stats;
import com.google.common.primitives.Doubles;
import java.util.Iterator;
/* loaded from: classes7.dex */
public final class setStateRestorationPolicy {
    private long toString = 0;
    private double values = 0.0d;
    private double ag$a = 0.0d;
    private double ah$a = Double.NaN;
    private double valueOf = Double.NaN;

    public void values(double d) {
        long j = this.toString;
        if (j == 0) {
            this.toString = 1L;
            this.values = d;
            this.ah$a = d;
            this.valueOf = d;
            if (Doubles.ah$a(d)) {
                return;
            }
            this.ag$a = Double.NaN;
            return;
        }
        this.toString = j + 1;
        if (Doubles.ah$a(d) && Doubles.ah$a(this.values)) {
            double d2 = this.values;
            double d3 = d - d2;
            double d4 = d2 + (d3 / this.toString);
            this.values = d4;
            this.ag$a += d3 * (d - d4);
        } else {
            this.values = toString(this.values, d);
            this.ag$a = Double.NaN;
        }
        this.ah$a = Math.min(this.ah$a, d);
        this.valueOf = Math.max(this.valueOf, d);
    }

    public void ag$a(Iterable<? extends Number> iterable) {
        for (Number number : iterable) {
            values(number.doubleValue());
        }
    }

    public void valueOf(Iterator<? extends Number> it) {
        while (it.hasNext()) {
            values(it.next().doubleValue());
        }
    }

    public void values(double... dArr) {
        for (double d : dArr) {
            values(d);
        }
    }

    public void valueOf(int... iArr) {
        for (int i : iArr) {
            values(i);
        }
    }

    public void values(long... jArr) {
        for (long j : jArr) {
            values(j);
        }
    }

    public Stats valueOf() {
        return new Stats(this.toString, this.values, this.ag$a, this.ah$a, this.valueOf);
    }

    public static double toString(double d, double d2) {
        if (Doubles.ah$a(d)) {
            return d2;
        }
        if (Doubles.ah$a(d2) || d == d2) {
            return d;
        }
        return Double.NaN;
    }
}
