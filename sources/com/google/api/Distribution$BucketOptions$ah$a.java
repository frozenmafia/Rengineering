package com.google.api;

import com.google.api.Distribution;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$ah$a;
import o.SwitchPreferenceCompat;
import o.globalToLocal;
/* loaded from: classes7.dex */
public final class Distribution$BucketOptions$ah$a extends GeneratedMessageLite<Distribution$BucketOptions$ah$a, values> implements SwitchPreferenceCompat {
    private static final Distribution$BucketOptions$ah$a DEFAULT_INSTANCE;
    public static final int GROWTH_FACTOR_FIELD_NUMBER = 2;
    public static final int NUM_FINITE_BUCKETS_FIELD_NUMBER = 1;
    private static volatile globalToLocal<Distribution$BucketOptions$ah$a> PARSER = null;
    public static final int SCALE_FIELD_NUMBER = 3;
    private double growthFactor_;
    private int numFiniteBuckets_;
    private double scale_;

    private Distribution$BucketOptions$ah$a() {
    }

    /* loaded from: classes7.dex */
    public static final class values extends GeneratedMessageLite.values<Distribution$BucketOptions$ah$a, values> implements SwitchPreferenceCompat {
        /* synthetic */ values(Distribution.AnonymousClass2 anonymousClass2) {
            this();
        }

        private values() {
            super(Distribution$BucketOptions$ah$a.DEFAULT_INSTANCE);
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object toString(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (Distribution.AnonymousClass2.ah$a[methodToInvoke.ordinal()]) {
            case 1:
                return new Distribution$BucketOptions$ah$a();
            case 2:
                return new values(null);
            case 3:
                return ah$a(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0000\u0003\u0000", new Object[]{"numFiniteBuckets_", "growthFactor_", "scale_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                globalToLocal<Distribution$BucketOptions$ah$a> globaltolocal = PARSER;
                if (globaltolocal == null) {
                    synchronized (Distribution$BucketOptions$ah$a.class) {
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
        Distribution$BucketOptions$ah$a distribution$BucketOptions$ah$a = new Distribution$BucketOptions$ah$a();
        DEFAULT_INSTANCE = distribution$BucketOptions$ah$a;
        GeneratedMessageLite.values(Distribution$BucketOptions$ah$a.class, distribution$BucketOptions$ah$a);
    }
}
