package o;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$ah$a;
/* loaded from: classes5.dex */
public final class replaceAllInsert extends GeneratedMessageLite<replaceAllInsert, valueOf> implements replaceAllInternal {
    public static final int CPU_CLOCK_RATE_KHZ_FIELD_NUMBER = 2;
    public static final int CPU_PROCESSOR_COUNT_FIELD_NUMBER = 6;
    private static final replaceAllInsert DEFAULT_INSTANCE;
    public static final int DEVICE_RAM_SIZE_KB_FIELD_NUMBER = 3;
    public static final int MAX_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 4;
    public static final int MAX_ENCOURAGED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 5;
    private static volatile globalToLocal<replaceAllInsert> PARSER = null;
    public static final int PROCESS_NAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private int cpuClockRateKhz_;
    private int cpuProcessorCount_;
    private int deviceRamSizeKb_;
    private int maxAppJavaHeapMemoryKb_;
    private int maxEncouragedAppJavaHeapMemoryKb_;
    private String processName_ = "";

    private replaceAllInsert() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ah$a(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.processName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void values(int i) {
        this.bitField0_ |= 8;
        this.deviceRamSizeKb_ = i;
    }

    public boolean ag$a() {
        return (this.bitField0_ & 16) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void valueOf(int i) {
        this.bitField0_ |= 16;
        this.maxAppJavaHeapMemoryKb_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ag$a(int i) {
        this.bitField0_ |= 32;
        this.maxEncouragedAppJavaHeapMemoryKb_ = i;
    }

    /* loaded from: classes5.dex */
    public static final class valueOf extends GeneratedMessageLite.values<replaceAllInsert, valueOf> implements replaceAllInternal {
        /* synthetic */ valueOf(AnonymousClass1 anonymousClass1) {
            this();
        }

        private valueOf() {
            super(replaceAllInsert.DEFAULT_INSTANCE);
        }

        public valueOf valueOf(String str) {
            HaptikSDK$e();
            ((replaceAllInsert) this.ag$a).ah$a(str);
            return this;
        }

        public valueOf ag$a(int i) {
            HaptikSDK$e();
            ((replaceAllInsert) this.ag$a).values(i);
            return this;
        }

        public valueOf ah$a(int i) {
            HaptikSDK$e();
            ((replaceAllInsert) this.ag$a).valueOf(i);
            return this;
        }

        public valueOf valueOf(int i) {
            HaptikSDK$e();
            ((replaceAllInsert) this.ag$a).ag$a(i);
            return this;
        }
    }

    /* renamed from: o.replaceAllInsert$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] valueOf;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            valueOf = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                valueOf[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                valueOf[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                valueOf[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                valueOf[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                valueOf[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                valueOf[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object toString(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (AnonymousClass1.valueOf[methodToInvoke.ordinal()]) {
            case 1:
                return new replaceAllInsert();
            case 2:
                return new valueOf(null);
            case 3:
                return ah$a(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006င\u0002", new Object[]{"bitField0_", "processName_", "cpuClockRateKhz_", "deviceRamSizeKb_", "maxAppJavaHeapMemoryKb_", "maxEncouragedAppJavaHeapMemoryKb_", "cpuProcessorCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                globalToLocal<replaceAllInsert> globaltolocal = PARSER;
                if (globaltolocal == null) {
                    synchronized (replaceAllInsert.class) {
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
        replaceAllInsert replaceallinsert = new replaceAllInsert();
        DEFAULT_INSTANCE = replaceallinsert;
        GeneratedMessageLite.values(replaceAllInsert.class, replaceallinsert);
    }

    public static replaceAllInsert values() {
        return DEFAULT_INSTANCE;
    }
}
