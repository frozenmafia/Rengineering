package com.google.common.primitives;

import java.util.Arrays;
import java.util.Collection;
/* loaded from: classes7.dex */
public final class ImmutableDoubleArray$ah$a {
    private int ag$a = 0;
    private double[] values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ImmutableDoubleArray$ah$a(int i) {
        this.values = new double[i];
    }

    public ImmutableDoubleArray$ah$a ag$a(double d) {
        values(1);
        double[] dArr = this.values;
        int i = this.ag$a;
        dArr[i] = d;
        this.ag$a = i + 1;
        return this;
    }

    public ImmutableDoubleArray$ah$a values(Iterable<Double> iterable) {
        if (iterable instanceof Collection) {
            return values((Collection) iterable);
        }
        for (Double d : iterable) {
            ag$a(d.doubleValue());
        }
        return this;
    }

    public ImmutableDoubleArray$ah$a values(Collection<Double> collection) {
        values(collection.size());
        for (Double d : collection) {
            double[] dArr = this.values;
            int i = this.ag$a;
            this.ag$a = i + 1;
            dArr[i] = d.doubleValue();
        }
        return this;
    }

    private void values(int i) {
        int i2 = this.ag$a + i;
        double[] dArr = this.values;
        if (i2 > dArr.length) {
            this.values = Arrays.copyOf(dArr, ag$a(dArr.length, i2));
        }
    }

    private static int ag$a(int i, int i2) {
        if (i2 >= 0) {
            int i3 = i + (i >> 1) + 1;
            if (i3 < i2) {
                i3 = Integer.highestOneBit(i2 - 1) << 1;
            }
            if (i3 < 0) {
                return Integer.MAX_VALUE;
            }
            return i3;
        }
        throw new AssertionError("cannot store more than MAX_VALUE elements");
    }

    public ImmutableDoubleArray ag$a() {
        ImmutableDoubleArray immutableDoubleArray;
        if (this.ag$a == 0) {
            immutableDoubleArray = ImmutableDoubleArray.EMPTY;
            return immutableDoubleArray;
        }
        return new ImmutableDoubleArray(this.values, 0, this.ag$a);
    }
}
