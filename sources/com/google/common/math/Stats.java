package com.google.common.math;

import com.google.common.primitives.Doubles;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import o.hasUpdates;
import o.internalSetStateRestorationPolicy;
import o.markViewHoldersUpdated;
import o.recycleUpdateOp;
import o.setStateRestorationPolicy;
/* loaded from: classes7.dex */
public final class Stats implements Serializable {
    static final int BYTES = 40;
    private static final long serialVersionUID = 0;
    private final long count;
    private final double max;
    private final double mean;
    private final double min;
    private final double sumOfSquaresOfDeltas;

    public Stats(long j, double d, double d2, double d3, double d4) {
        this.count = j;
        this.mean = d;
        this.sumOfSquaresOfDeltas = d2;
        this.min = d3;
        this.max = d4;
    }

    public static Stats of(Iterable<? extends Number> iterable) {
        setStateRestorationPolicy setstaterestorationpolicy = new setStateRestorationPolicy();
        setstaterestorationpolicy.ag$a(iterable);
        return setstaterestorationpolicy.valueOf();
    }

    public static Stats of(Iterator<? extends Number> it) {
        setStateRestorationPolicy setstaterestorationpolicy = new setStateRestorationPolicy();
        setstaterestorationpolicy.valueOf(it);
        return setstaterestorationpolicy.valueOf();
    }

    public static Stats of(double... dArr) {
        setStateRestorationPolicy setstaterestorationpolicy = new setStateRestorationPolicy();
        setstaterestorationpolicy.values(dArr);
        return setstaterestorationpolicy.valueOf();
    }

    public static Stats of(int... iArr) {
        setStateRestorationPolicy setstaterestorationpolicy = new setStateRestorationPolicy();
        setstaterestorationpolicy.valueOf(iArr);
        return setstaterestorationpolicy.valueOf();
    }

    public static Stats of(long... jArr) {
        setStateRestorationPolicy setstaterestorationpolicy = new setStateRestorationPolicy();
        setstaterestorationpolicy.values(jArr);
        return setstaterestorationpolicy.valueOf();
    }

    public long count() {
        return this.count;
    }

    public double mean() {
        markViewHoldersUpdated.ag$a(this.count != 0);
        return this.mean;
    }

    public double sum() {
        return this.mean * this.count;
    }

    public double populationVariance() {
        markViewHoldersUpdated.ag$a(this.count > 0);
        if (Double.isNaN(this.sumOfSquaresOfDeltas)) {
            return Double.NaN;
        }
        if (this.count == 1) {
            return 0.0d;
        }
        return internalSetStateRestorationPolicy.values(this.sumOfSquaresOfDeltas) / count();
    }

    public double populationStandardDeviation() {
        return Math.sqrt(populationVariance());
    }

    public double sampleVariance() {
        markViewHoldersUpdated.ag$a(this.count > 1);
        if (Double.isNaN(this.sumOfSquaresOfDeltas)) {
            return Double.NaN;
        }
        return internalSetStateRestorationPolicy.values(this.sumOfSquaresOfDeltas) / (this.count - 1);
    }

    public double sampleStandardDeviation() {
        return Math.sqrt(sampleVariance());
    }

    public double min() {
        markViewHoldersUpdated.ag$a(this.count != 0);
        return this.min;
    }

    public double max() {
        markViewHoldersUpdated.ag$a(this.count != 0);
        return this.max;
    }

    public boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            Stats stats = (Stats) obj;
            return this.count == stats.count && Double.doubleToLongBits(this.mean) == Double.doubleToLongBits(stats.mean) && Double.doubleToLongBits(this.sumOfSquaresOfDeltas) == Double.doubleToLongBits(stats.sumOfSquaresOfDeltas) && Double.doubleToLongBits(this.min) == Double.doubleToLongBits(stats.min) && Double.doubleToLongBits(this.max) == Double.doubleToLongBits(stats.max);
        }
        return false;
    }

    public int hashCode() {
        return recycleUpdateOp.valueOf(Long.valueOf(this.count), Double.valueOf(this.mean), Double.valueOf(this.sumOfSquaresOfDeltas), Double.valueOf(this.min), Double.valueOf(this.max));
    }

    public String toString() {
        if (count() > 0) {
            return hasUpdates.valueOf(this).ag$a("count", this.count).valueOf("mean", this.mean).valueOf("populationStandardDeviation", populationStandardDeviation()).valueOf("min", this.min).valueOf("max", this.max).toString();
        }
        return hasUpdates.valueOf(this).ag$a("count", this.count).toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double sumOfSquaresOfDeltas() {
        return this.sumOfSquaresOfDeltas;
    }

    public static double meanOf(Iterable<? extends Number> iterable) {
        return meanOf(iterable.iterator());
    }

    public static double meanOf(Iterator<? extends Number> it) {
        markViewHoldersUpdated.values(it.hasNext());
        double doubleValue = it.next().doubleValue();
        long j = 1;
        while (it.hasNext()) {
            double doubleValue2 = it.next().doubleValue();
            j++;
            doubleValue = (Doubles.ah$a(doubleValue2) && Doubles.ah$a(doubleValue)) ? doubleValue + ((doubleValue2 - doubleValue) / j) : setStateRestorationPolicy.toString(doubleValue, doubleValue2);
        }
        return doubleValue;
    }

    public static double meanOf(double... dArr) {
        markViewHoldersUpdated.values(dArr.length > 0);
        double d = dArr[0];
        for (int i = 1; i < dArr.length; i++) {
            double d2 = dArr[i];
            d = (Doubles.ah$a(d2) && Doubles.ah$a(d)) ? d + ((d2 - d) / (i + 1)) : setStateRestorationPolicy.toString(d, d2);
        }
        return d;
    }

    public static double meanOf(int... iArr) {
        markViewHoldersUpdated.values(iArr.length > 0);
        double d = iArr[0];
        for (int i = 1; i < iArr.length; i++) {
            double d2 = iArr[i];
            d = (Doubles.ah$a(d2) && Doubles.ah$a(d)) ? d + ((d2 - d) / (i + 1)) : setStateRestorationPolicy.toString(d, d2);
        }
        return d;
    }

    public static double meanOf(long... jArr) {
        markViewHoldersUpdated.values(jArr.length > 0);
        double d = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            double d2 = jArr[i];
            d = (Doubles.ah$a(d2) && Doubles.ah$a(d)) ? d + ((d2 - d) / (i + 1)) : setStateRestorationPolicy.toString(d, d2);
        }
        return d;
    }

    public byte[] toByteArray() {
        ByteBuffer order = ByteBuffer.allocate(40).order(ByteOrder.LITTLE_ENDIAN);
        writeTo(order);
        return order.array();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeTo(ByteBuffer byteBuffer) {
        markViewHoldersUpdated.toString(byteBuffer);
        markViewHoldersUpdated.ag$a(byteBuffer.remaining() >= 40, "Expected at least Stats.BYTES = %s remaining , got %s", 40, byteBuffer.remaining());
        byteBuffer.putLong(this.count).putDouble(this.mean).putDouble(this.sumOfSquaresOfDeltas).putDouble(this.min).putDouble(this.max);
    }

    public static Stats fromByteArray(byte[] bArr) {
        markViewHoldersUpdated.toString(bArr);
        markViewHoldersUpdated.ag$a(bArr.length == 40, "Expected Stats.BYTES = %s remaining , got %s", 40, bArr.length);
        return readFrom(ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Stats readFrom(ByteBuffer byteBuffer) {
        markViewHoldersUpdated.toString(byteBuffer);
        markViewHoldersUpdated.ag$a(byteBuffer.remaining() >= 40, "Expected at least Stats.BYTES = %s remaining , got %s", 40, byteBuffer.remaining());
        return new Stats(byteBuffer.getLong(), byteBuffer.getDouble(), byteBuffer.getDouble(), byteBuffer.getDouble(), byteBuffer.getDouble());
    }
}
