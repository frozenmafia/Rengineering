package o;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$ah$a;
/* loaded from: classes7.dex */
public final class getDatabaseName extends GeneratedMessageLite<getDatabaseName, getDatabaseName$ah$a> implements getWritableDatabase {
    private static final getDatabaseName DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile globalToLocal<getDatabaseName> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    private getDatabaseName() {
    }

    /* renamed from: o.getDatabaseName$3 */
    /* loaded from: classes7.dex */
    static /* synthetic */ class AnonymousClass3 {
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
        switch (AnonymousClass3.values[methodToInvoke.ordinal()]) {
            case 1:
                return new getDatabaseName();
            case 2:
                return new getDatabaseName$ah$a(null);
            case 3:
                return ah$a(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                globalToLocal<getDatabaseName> globaltolocal = PARSER;
                if (globaltolocal == null) {
                    synchronized (getDatabaseName.class) {
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
        getDatabaseName getdatabasename = new getDatabaseName();
        DEFAULT_INSTANCE = getdatabasename;
        GeneratedMessageLite.values(getDatabaseName.class, getdatabasename);
    }
}
