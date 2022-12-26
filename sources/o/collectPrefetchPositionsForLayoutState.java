package o;

import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ah$a;
/* loaded from: classes7.dex */
public final class collectPrefetchPositionsForLayoutState extends GeneratedMessageLite<collectPrefetchPositionsForLayoutState, toString> implements guessMeasurement {
    private static final collectPrefetchPositionsForLayoutState DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile convertToRelativeDirection<collectPrefetchPositionsForLayoutState> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private ByteString value_ = ByteString.EMPTY;

    private collectPrefetchPositionsForLayoutState() {
    }

    public String HaptikSDK$c() {
        return this.typeUrl_;
    }

    public void ag$a(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    public ByteString ah$b() {
        return this.value_;
    }

    public void ah$a(ByteString byteString) {
        byteString.getClass();
        this.value_ = byteString;
    }

    public OutputPrefixType values() {
        OutputPrefixType forNumber = OutputPrefixType.forNumber(this.outputPrefixType_);
        return forNumber == null ? OutputPrefixType.UNRECOGNIZED : forNumber;
    }

    public void ag$a(OutputPrefixType outputPrefixType) {
        this.outputPrefixType_ = outputPrefixType.getNumber();
    }

    public static toString valueOf() {
        return DEFAULT_INSTANCE.ak();
    }

    /* loaded from: classes7.dex */
    public static final class toString extends GeneratedMessageLite.values<collectPrefetchPositionsForLayoutState, toString> implements guessMeasurement {
        /* synthetic */ toString(AnonymousClass1 anonymousClass1) {
            this();
        }

        private toString() {
            super(collectPrefetchPositionsForLayoutState.DEFAULT_INSTANCE);
        }

        public toString valueOf(String str) {
            invoke();
            ((collectPrefetchPositionsForLayoutState) this.ag$a).ag$a(str);
            return this;
        }

        public toString valueOf(ByteString byteString) {
            invoke();
            ((collectPrefetchPositionsForLayoutState) this.ag$a).ah$a(byteString);
            return this;
        }

        public toString toString(OutputPrefixType outputPrefixType) {
            invoke();
            ((collectPrefetchPositionsForLayoutState) this.ag$a).ag$a(outputPrefixType);
            return this;
        }
    }

    /* renamed from: o.collectPrefetchPositionsForLayoutState$1 */
    /* loaded from: classes7.dex */
    static /* synthetic */ class AnonymousClass1 {
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

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object ag$a(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (AnonymousClass1.ah$a[methodToInvoke.ordinal()]) {
            case 1:
                return new collectPrefetchPositionsForLayoutState();
            case 2:
                return new toString(null);
            case 3:
                return toString(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                convertToRelativeDirection<collectPrefetchPositionsForLayoutState> converttorelativedirection = PARSER;
                if (converttorelativedirection == null) {
                    synchronized (collectPrefetchPositionsForLayoutState.class) {
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
        collectPrefetchPositionsForLayoutState collectprefetchpositionsforlayoutstate = new collectPrefetchPositionsForLayoutState();
        DEFAULT_INSTANCE = collectprefetchpositionsforlayoutstate;
        GeneratedMessageLite.valueOf(collectPrefetchPositionsForLayoutState.class, collectprefetchpositionsforlayoutstate);
    }

    public static collectPrefetchPositionsForLayoutState ag$a() {
        return DEFAULT_INSTANCE;
    }
}
