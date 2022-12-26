package o;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$ah$a;
/* loaded from: classes5.dex */
public final class merge extends GeneratedMessageLite<merge, toString> implements findIndexOf {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final merge DEFAULT_INSTANCE;
    private static volatile globalToLocal<merge> PARSER = null;
    public static final int USED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private int usedAppJavaHeapMemoryKb_;

    private merge() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toString(long j) {
        this.bitField0_ |= 1;
        this.clientTimeUs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void valueOf(int i) {
        this.bitField0_ |= 2;
        this.usedAppJavaHeapMemoryKb_ = i;
    }

    public static toString valueOf() {
        return DEFAULT_INSTANCE.asInterface();
    }

    /* loaded from: classes5.dex */
    public static final class toString extends GeneratedMessageLite.values<merge, toString> implements findIndexOf {
        /* synthetic */ toString(AnonymousClass1 anonymousClass1) {
            this();
        }

        private toString() {
            super(merge.DEFAULT_INSTANCE);
        }

        public toString toString(long j) {
            HaptikSDK$e();
            ((merge) this.ag$a).toString(j);
            return this;
        }

        public toString ah$a(int i) {
            HaptikSDK$e();
            ((merge) this.ag$a).valueOf(i);
            return this;
        }
    }

    /* renamed from: o.merge$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            values = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                values[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                values[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                values[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                values[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                values[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                values[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object toString(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (AnonymousClass1.values[methodToInvoke.ordinal()]) {
            case 1:
                return new merge();
            case 2:
                return new toString(null);
            case 3:
                return ah$a(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"bitField0_", "clientTimeUs_", "usedAppJavaHeapMemoryKb_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                globalToLocal<merge> globaltolocal = PARSER;
                if (globaltolocal == null) {
                    synchronized (merge.class) {
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
        merge mergeVar = new merge();
        DEFAULT_INSTANCE = mergeVar;
        GeneratedMessageLite.values(merge.class, mergeVar);
    }
}
