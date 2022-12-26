package o;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$ah$a;
/* loaded from: classes7.dex */
public final class addOrReplace extends GeneratedMessageLite<addOrReplace, addOrReplace$ah$a> implements removeAtPos {
    private static final addOrReplace DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile globalToLocal<addOrReplace> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    private addOrReplace() {
    }

    /* renamed from: o.addOrReplace$5 */
    /* loaded from: classes7.dex */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] ah$a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            ah$a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ah$a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ah$a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ah$a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ah$a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ah$a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ah$a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object toString(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (AnonymousClass5.ah$a[methodToInvoke.ordinal()]) {
            case 1:
                return new addOrReplace();
            case 2:
                return new addOrReplace$ah$a(null);
            case 3:
                return ah$a(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                globalToLocal<addOrReplace> globaltolocal = PARSER;
                if (globaltolocal == null) {
                    synchronized (addOrReplace.class) {
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
        addOrReplace addorreplace = new addOrReplace();
        DEFAULT_INSTANCE = addorreplace;
        GeneratedMessageLite.values(addOrReplace.class, addorreplace);
    }
}
