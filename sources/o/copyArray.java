package o;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$ah$a;
/* loaded from: classes5.dex */
public final class copyArray extends GeneratedMessageLite<copyArray, copyArray$ah$a> implements removeItemAtIndex {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final copyArray DEFAULT_INSTANCE;
    private static volatile globalToLocal<copyArray> PARSER = null;
    public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
    public static final int USER_TIME_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private long systemTimeUs_;
    private long userTimeUs_;

    private copyArray() {
    }

    public void valueOf(long j) {
        this.bitField0_ |= 1;
        this.clientTimeUs_ = j;
    }

    public void toString(long j) {
        this.bitField0_ |= 2;
        this.userTimeUs_ = j;
    }

    public void ag$a(long j) {
        this.bitField0_ |= 4;
        this.systemTimeUs_ = j;
    }

    public static copyArray$ah$a valueOf() {
        return DEFAULT_INSTANCE.asInterface();
    }

    /* renamed from: o.copyArray$5 */
    /* loaded from: classes5.dex */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] ag$a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            ag$a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ag$a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ag$a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ag$a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ag$a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ag$a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ag$a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object toString(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (AnonymousClass5.ag$a[methodToInvoke.ordinal()]) {
            case 1:
                return new copyArray();
            case 2:
                return new copyArray$ah$a(null);
            case 3:
                return ah$a(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "clientTimeUs_", "userTimeUs_", "systemTimeUs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                globalToLocal<copyArray> globaltolocal = PARSER;
                if (globaltolocal == null) {
                    synchronized (copyArray.class) {
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
        copyArray copyarray = new copyArray();
        DEFAULT_INSTANCE = copyarray;
        GeneratedMessageLite.values(copyArray.class, copyarray);
    }
}
