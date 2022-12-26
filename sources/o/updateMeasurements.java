package o;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ah$a;
@Deprecated
/* loaded from: classes7.dex */
public final class updateMeasurements extends GeneratedMessageLite<updateMeasurements, valueOf> implements getSpanSizeLookup {
    public static final int CATALOGUE_NAME_FIELD_NUMBER = 5;
    private static final updateMeasurements DEFAULT_INSTANCE;
    public static final int KEY_MANAGER_VERSION_FIELD_NUMBER = 3;
    public static final int NEW_KEY_ALLOWED_FIELD_NUMBER = 4;
    private static volatile convertToRelativeDirection<updateMeasurements> PARSER = null;
    public static final int PRIMITIVE_NAME_FIELD_NUMBER = 1;
    public static final int TYPE_URL_FIELD_NUMBER = 2;
    private int keyManagerVersion_;
    private boolean newKeyAllowed_;
    private String primitiveName_ = "";
    private String typeUrl_ = "";
    private String catalogueName_ = "";

    private updateMeasurements() {
    }

    /* loaded from: classes7.dex */
    public static final class valueOf extends GeneratedMessageLite.values<updateMeasurements, valueOf> implements getSpanSizeLookup {
        /* synthetic */ valueOf(AnonymousClass4 anonymousClass4) {
            this();
        }

        private valueOf() {
            super(updateMeasurements.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: o.updateMeasurements$4  reason: invalid class name */
    /* loaded from: classes7.dex */
    static /* synthetic */ class AnonymousClass4 {
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

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object ag$a(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (AnonymousClass4.ag$a[methodToInvoke.ordinal()]) {
            case 1:
                return new updateMeasurements();
            case 2:
                return new valueOf(null);
            case 3:
                return toString(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"primitiveName_", "typeUrl_", "keyManagerVersion_", "newKeyAllowed_", "catalogueName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                convertToRelativeDirection<updateMeasurements> converttorelativedirection = PARSER;
                if (converttorelativedirection == null) {
                    synchronized (updateMeasurements.class) {
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
        updateMeasurements updatemeasurements = new updateMeasurements();
        DEFAULT_INSTANCE = updatemeasurements;
        GeneratedMessageLite.valueOf(updateMeasurements.class, updatemeasurements);
    }
}
