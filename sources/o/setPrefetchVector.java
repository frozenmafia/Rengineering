package o;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ah$a;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
/* loaded from: classes7.dex */
public final class setPrefetchVector extends GeneratedMessageLite<setPrefetchVector, toString> implements GridLayoutManager {
    private static final setPrefetchVector DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    private static volatile convertToRelativeDirection<setPrefetchVector> PARSER;
    private int keySize_;

    private setPrefetchVector() {
    }

    public int ah$a() {
        return this.keySize_;
    }

    public void valueOf(int i) {
        this.keySize_ = i;
    }

    public static setPrefetchVector ah$a(ByteString byteString, ItemTouchHelper itemTouchHelper) throws InvalidProtocolBufferException {
        return (setPrefetchVector) GeneratedMessageLite.ah$a(DEFAULT_INSTANCE, byteString, itemTouchHelper);
    }

    public static toString ag$a() {
        return DEFAULT_INSTANCE.ak();
    }

    /* loaded from: classes7.dex */
    public static final class toString extends GeneratedMessageLite.values<setPrefetchVector, toString> implements GridLayoutManager {
        /* synthetic */ toString(AnonymousClass4 anonymousClass4) {
            this();
        }

        private toString() {
            super(setPrefetchVector.DEFAULT_INSTANCE);
        }

        public toString ag$a(int i) {
            invoke();
            ((setPrefetchVector) this.ag$a).valueOf(i);
            return this;
        }
    }

    /* renamed from: o.setPrefetchVector$4 */
    /* loaded from: classes7.dex */
    static /* synthetic */ class AnonymousClass4 {
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
        switch (AnonymousClass4.valueOf[methodToInvoke.ordinal()]) {
            case 1:
                return new setPrefetchVector();
            case 2:
                return new toString(null);
            case 3:
                return toString(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"keySize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                convertToRelativeDirection<setPrefetchVector> converttorelativedirection = PARSER;
                if (converttorelativedirection == null) {
                    synchronized (setPrefetchVector.class) {
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
        setPrefetchVector setprefetchvector = new setPrefetchVector();
        DEFAULT_INSTANCE = setprefetchvector;
        GeneratedMessageLite.valueOf(setPrefetchVector.class, setprefetchvector);
    }
}
