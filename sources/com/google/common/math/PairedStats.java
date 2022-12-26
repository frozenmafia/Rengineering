package com.google.common.math;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import o.hasUpdates;
import o.internalSetStateRestorationPolicy;
import o.markViewHoldersUpdated;
import o.recycleUpdateOp;
import o.removeAdapter;
/* loaded from: classes7.dex */
public final class PairedStats implements Serializable {
    private static final int BYTES = 88;
    private static final long serialVersionUID = 0;
    private final double sumOfProductsOfDeltas;
    private final Stats xStats;
    private final Stats yStats;

    private static double ensureInUnitRange(double d) {
        if (d >= 1.0d) {
            return 1.0d;
        }
        if (d <= -1.0d) {
            return -1.0d;
        }
        return d;
    }

    private static double ensurePositive(double d) {
        if (d > 0.0d) {
            return d;
        }
        return Double.MIN_VALUE;
    }

    PairedStats(Stats stats, Stats stats2, double d) {
        this.xStats = stats;
        this.yStats = stats2;
        this.sumOfProductsOfDeltas = d;
    }

    public long count() {
        return this.xStats.count();
    }

    public Stats xStats() {
        return this.xStats;
    }

    public Stats yStats() {
        return this.yStats;
    }

    public double populationCovariance() {
        markViewHoldersUpdated.ag$a(count() != 0);
        return this.sumOfProductsOfDeltas / count();
    }

    public double sampleCovariance() {
        markViewHoldersUpdated.ag$a(count() > 1);
        return this.sumOfProductsOfDeltas / (count() - 1);
    }

    public double pearsonsCorrelationCoefficient() {
        markViewHoldersUpdated.ag$a(count() > 1);
        if (Double.isNaN(this.sumOfProductsOfDeltas)) {
            return Double.NaN;
        }
        double sumOfSquaresOfDeltas = xStats().sumOfSquaresOfDeltas();
        double sumOfSquaresOfDeltas2 = yStats().sumOfSquaresOfDeltas();
        markViewHoldersUpdated.ag$a(sumOfSquaresOfDeltas > 0.0d);
        markViewHoldersUpdated.ag$a(sumOfSquaresOfDeltas2 > 0.0d);
        return ensureInUnitRange(this.sumOfProductsOfDeltas / Math.sqrt(ensurePositive(sumOfSquaresOfDeltas * sumOfSquaresOfDeltas2)));
    }

    public removeAdapter leastSquaresFit() {
        markViewHoldersUpdated.ag$a(count() > 1);
        if (Double.isNaN(this.sumOfProductsOfDeltas)) {
            return removeAdapter.valueOf();
        }
        double sumOfSquaresOfDeltas = this.xStats.sumOfSquaresOfDeltas();
        if (sumOfSquaresOfDeltas > 0.0d) {
            if (this.yStats.sumOfSquaresOfDeltas() > 0.0d) {
                this.xStats.mean();
                this.yStats.mean();
                return markViewHoldersUpdated.values(internalSetStateRestorationPolicy.valueOf(r7) && internalSetStateRestorationPolicy.valueOf(r9)).valueOf(this.sumOfProductsOfDeltas / sumOfSquaresOfDeltas);
            }
            return removeAdapter.valueOf(this.yStats.mean());
        }
        markViewHoldersUpdated.ag$a(this.yStats.sumOfSquaresOfDeltas() > 0.0d);
        return removeAdapter.values(this.xStats.mean());
    }

    public boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            PairedStats pairedStats = (PairedStats) obj;
            return this.xStats.equals(pairedStats.xStats) && this.yStats.equals(pairedStats.yStats) && Double.doubleToLongBits(this.sumOfProductsOfDeltas) == Double.doubleToLongBits(pairedStats.sumOfProductsOfDeltas);
        }
        return false;
    }

    public int hashCode() {
        return recycleUpdateOp.valueOf(this.xStats, this.yStats, Double.valueOf(this.sumOfProductsOfDeltas));
    }

    public String toString() {
        if (count() > 0) {
            return hasUpdates.valueOf(this).toString("xStats", this.xStats).toString("yStats", this.yStats).valueOf("populationCovariance", populationCovariance()).toString();
        }
        return hasUpdates.valueOf(this).toString("xStats", this.xStats).toString("yStats", this.yStats).toString();
    }

    double sumOfProductsOfDeltas() {
        return this.sumOfProductsOfDeltas;
    }

    public byte[] toByteArray() {
        ByteBuffer order = ByteBuffer.allocate(88).order(ByteOrder.LITTLE_ENDIAN);
        this.xStats.writeTo(order);
        this.yStats.writeTo(order);
        order.putDouble(this.sumOfProductsOfDeltas);
        return order.array();
    }

    public static PairedStats fromByteArray(byte[] bArr) {
        markViewHoldersUpdated.toString(bArr);
        markViewHoldersUpdated.ag$a(bArr.length == 88, "Expected PairedStats.BYTES = %s, got %s", 88, bArr.length);
        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        return new PairedStats(Stats.readFrom(order), Stats.readFrom(order), order.getDouble());
    }
}
