package com.google.api;

import com.google.api.Distribution;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$ah$a;
import o.TwoStatePreference;
import o.globalToLocal;
/* loaded from: classes7.dex */
public final class Distribution$ah$a extends GeneratedMessageLite<Distribution$ah$a, toString> implements TwoStatePreference {
    private static final Distribution$ah$a DEFAULT_INSTANCE;
    public static final int MAX_FIELD_NUMBER = 2;
    public static final int MIN_FIELD_NUMBER = 1;
    private static volatile globalToLocal<Distribution$ah$a> PARSER;
    private double max_;
    private double min_;

    private Distribution$ah$a() {
    }

    /* loaded from: classes7.dex */
    public static final class toString extends GeneratedMessageLite.values<Distribution$ah$a, toString> implements TwoStatePreference {
        /* synthetic */ toString(Distribution.AnonymousClass2 anonymousClass2) {
            this();
        }

        private toString() {
            super(Distribution$ah$a.DEFAULT_INSTANCE);
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object toString(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (Distribution.AnonymousClass2.ah$a[methodToInvoke.ordinal()]) {
            case 1:
                return new Distribution$ah$a();
            case 2:
                return new toString(null);
            case 3:
                return ah$a(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"min_", "max_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                globalToLocal<Distribution$ah$a> globaltolocal = PARSER;
                if (globaltolocal == null) {
                    synchronized (Distribution$ah$a.class) {
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
        Distribution$ah$a distribution$ah$a = new Distribution$ah$a();
        DEFAULT_INSTANCE = distribution$ah$a;
        GeneratedMessageLite.values(Distribution$ah$a.class, distribution$ah$a);
    }
}
