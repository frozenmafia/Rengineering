package com.google.api;

import com.google.api.MetricDescriptor;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$ah$a;
import o.addOrReplace;
import o.globalToLocal;
import o.setSummaryOff;
/* loaded from: classes7.dex */
public final class MetricDescriptor$ah$a extends GeneratedMessageLite<MetricDescriptor$ah$a, valueOf> implements setSummaryOff {
    private static final MetricDescriptor$ah$a DEFAULT_INSTANCE;
    public static final int INGEST_DELAY_FIELD_NUMBER = 3;
    public static final int LAUNCH_STAGE_FIELD_NUMBER = 1;
    private static volatile globalToLocal<MetricDescriptor$ah$a> PARSER = null;
    public static final int SAMPLE_PERIOD_FIELD_NUMBER = 2;
    private addOrReplace ingestDelay_;
    private int launchStage_;
    private addOrReplace samplePeriod_;

    private MetricDescriptor$ah$a() {
    }

    /* loaded from: classes7.dex */
    public static final class valueOf extends GeneratedMessageLite.values<MetricDescriptor$ah$a, valueOf> implements setSummaryOff {
        /* synthetic */ valueOf(MetricDescriptor.AnonymousClass1 anonymousClass1) {
            this();
        }

        private valueOf() {
            super(MetricDescriptor$ah$a.DEFAULT_INSTANCE);
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object toString(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (MetricDescriptor.AnonymousClass1.valueOf[methodToInvoke.ordinal()]) {
            case 1:
                return new MetricDescriptor$ah$a();
            case 2:
                return new valueOf(null);
            case 3:
                return ah$a(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\t\u0003\t", new Object[]{"launchStage_", "samplePeriod_", "ingestDelay_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                globalToLocal<MetricDescriptor$ah$a> globaltolocal = PARSER;
                if (globaltolocal == null) {
                    synchronized (MetricDescriptor$ah$a.class) {
                        globaltolocal = PARSER;
                        if (globaltolocal == null) {
                            globaltolocal = new GeneratedMessageLite$ah$a<>(DEFAULT_INSTANCE);
                            PARSER = globaltolocal;
                        }
                    }
                }
                return globaltolocal;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        MetricDescriptor$ah$a metricDescriptor$ah$a = new MetricDescriptor$ah$a();
        DEFAULT_INSTANCE = metricDescriptor$ah$a;
        GeneratedMessageLite.values(MetricDescriptor$ah$a.class, metricDescriptor$ah$a);
    }
}
