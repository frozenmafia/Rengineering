package io.opencensus.trace.export;

import java.util.concurrent.TimeUnit;
/* loaded from: classes7.dex */
public abstract class SampledSpanStore {
    protected SampledSpanStore() {
    }

    /* loaded from: classes7.dex */
    public enum LatencyBucketBoundaries {
        ZERO_MICROSx10(0, TimeUnit.MICROSECONDS.toNanos(10)),
        MICROSx10_MICROSx100(TimeUnit.MICROSECONDS.toNanos(10), TimeUnit.MICROSECONDS.toNanos(100)),
        MICROSx100_MILLIx1(TimeUnit.MICROSECONDS.toNanos(100), TimeUnit.MILLISECONDS.toNanos(1)),
        MILLIx1_MILLIx10(TimeUnit.MILLISECONDS.toNanos(1), TimeUnit.MILLISECONDS.toNanos(10)),
        MILLIx10_MILLIx100(TimeUnit.MILLISECONDS.toNanos(10), TimeUnit.MILLISECONDS.toNanos(100)),
        MILLIx100_SECONDx1(TimeUnit.MILLISECONDS.toNanos(100), TimeUnit.SECONDS.toNanos(1)),
        SECONDx1_SECONDx10(TimeUnit.SECONDS.toNanos(1), TimeUnit.SECONDS.toNanos(10)),
        SECONDx10_SECONDx100(TimeUnit.SECONDS.toNanos(10), TimeUnit.SECONDS.toNanos(100)),
        SECONDx100_MAX(TimeUnit.SECONDS.toNanos(100), Long.MAX_VALUE);
        
        private final long latencyLowerNs;
        private final long latencyUpperNs;

        LatencyBucketBoundaries(long j, long j2) {
            this.latencyLowerNs = j;
            this.latencyUpperNs = j2;
        }

        public long getLatencyLowerNs() {
            return this.latencyLowerNs;
        }

        public long getLatencyUpperNs() {
            return this.latencyUpperNs;
        }
    }
}
