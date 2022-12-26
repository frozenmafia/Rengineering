package o;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$ah$a;
/* loaded from: classes7.dex */
public final class lambda$setForeignKeyConstraintsEnabled$12 extends GeneratedMessageLite<lambda$setForeignKeyConstraintsEnabled$12, toString> implements lambda$setLocale$10 {
    private static final lambda$setForeignKeyConstraintsEnabled$12 DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile globalToLocal<lambda$setForeignKeyConstraintsEnabled$12> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    private String id_ = "";
    private String version_ = "";

    private lambda$setForeignKeyConstraintsEnabled$12() {
    }

    /* loaded from: classes7.dex */
    public static final class toString extends GeneratedMessageLite.values<lambda$setForeignKeyConstraintsEnabled$12, toString> implements lambda$setLocale$10 {
        /* synthetic */ toString(AnonymousClass5 anonymousClass5) {
            this();
        }

        private toString() {
            super(lambda$setForeignKeyConstraintsEnabled$12.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: o.lambda$setForeignKeyConstraintsEnabled$12$5  reason: invalid class name */
    /* loaded from: classes7.dex */
    static /* synthetic */ class AnonymousClass5 {
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
        switch (AnonymousClass5.values[methodToInvoke.ordinal()]) {
            case 1:
                return new lambda$setForeignKeyConstraintsEnabled$12();
            case 2:
                return new toString(null);
            case 3:
                return ah$a(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"id_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                globalToLocal<lambda$setForeignKeyConstraintsEnabled$12> globaltolocal = PARSER;
                if (globaltolocal == null) {
                    synchronized (lambda$setForeignKeyConstraintsEnabled$12.class) {
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
        lambda$setForeignKeyConstraintsEnabled$12 lambda_setforeignkeyconstraintsenabled_12 = new lambda$setForeignKeyConstraintsEnabled$12();
        DEFAULT_INSTANCE = lambda_setforeignkeyconstraintsenabled_12;
        GeneratedMessageLite.values(lambda$setForeignKeyConstraintsEnabled$12.class, lambda_setforeignkeyconstraintsenabled_12);
    }
}
