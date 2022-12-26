package o;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ah$a;
@Deprecated
/* loaded from: classes7.dex */
public final class onLayoutCompleted extends GeneratedMessageLite<onLayoutCompleted, values> implements setMeasuredDimension {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    private static final onLayoutCompleted DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile convertToRelativeDirection<onLayoutCompleted> PARSER;
    private String configName_ = "";
    private checkSelectForSwipe$ah$b<updateMeasurements> entry_ = getSignupData();

    private onLayoutCompleted() {
    }

    /* loaded from: classes7.dex */
    public static final class values extends GeneratedMessageLite.values<onLayoutCompleted, values> implements setMeasuredDimension {
        /* synthetic */ values(AnonymousClass2 anonymousClass2) {
            this();
        }

        private values() {
            super(onLayoutCompleted.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: o.onLayoutCompleted$2  reason: invalid class name */
    /* loaded from: classes7.dex */
    static /* synthetic */ class AnonymousClass2 {
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

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object ag$a(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (AnonymousClass2.valueOf[methodToInvoke.ordinal()]) {
            case 1:
                return new onLayoutCompleted();
            case 2:
                return new values(null);
            case 3:
                return toString(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", updateMeasurements.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                convertToRelativeDirection<onLayoutCompleted> converttorelativedirection = PARSER;
                if (converttorelativedirection == null) {
                    synchronized (onLayoutCompleted.class) {
                        converttorelativedirection = PARSER;
                        if (converttorelativedirection == null) {
                            converttorelativedirection = new GeneratedMessageLite$ah$a<>(DEFAULT_INSTANCE);
                            PARSER = converttorelativedirection;
                        }
                    }
                }
                return converttorelativedirection;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        onLayoutCompleted onlayoutcompleted = new onLayoutCompleted();
        DEFAULT_INSTANCE = onlayoutcompleted;
        GeneratedMessageLite.valueOf(onLayoutCompleted.class, onlayoutcompleted);
    }

    public static onLayoutCompleted valueOf() {
        return DEFAULT_INSTANCE;
    }
}
