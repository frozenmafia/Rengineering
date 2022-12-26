package io.opencensus.metrics.export;
/* loaded from: classes7.dex */
public abstract class MetricDescriptor {

    /* loaded from: classes7.dex */
    public enum Type {
        GAUGE_INT64,
        GAUGE_DOUBLE,
        GAUGE_DISTRIBUTION,
        CUMULATIVE_INT64,
        CUMULATIVE_DOUBLE,
        CUMULATIVE_DISTRIBUTION,
        SUMMARY
    }

    MetricDescriptor() {
    }
}
