package o;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ah$a;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import o.GapWorker;
/* loaded from: classes7.dex */
public final class addPosition extends GeneratedMessageLite<addPosition, values> implements GapWorker.LayoutPrefetchRegistryImpl {
    private static final addPosition DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile convertToRelativeDirection<addPosition> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.EMPTY;
    private int version_;

    private addPosition() {
    }

    public int values() {
        return this.version_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void valueOf(int i) {
        this.version_ = i;
    }

    public ByteString ag$a() {
        return this.keyValue_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toString(ByteString byteString) {
        byteString.getClass();
        this.keyValue_ = byteString;
    }

    public static addPosition ag$a(ByteString byteString, ItemTouchHelper itemTouchHelper) throws InvalidProtocolBufferException {
        return (addPosition) GeneratedMessageLite.ah$a(DEFAULT_INSTANCE, byteString, itemTouchHelper);
    }

    /* loaded from: classes7.dex */
    public static final class values extends GeneratedMessageLite.values<addPosition, values> implements GapWorker.LayoutPrefetchRegistryImpl {
        /* synthetic */ values(AnonymousClass4 anonymousClass4) {
            this();
        }

        private values() {
            super(addPosition.DEFAULT_INSTANCE);
        }

        public values ag$a(int i) {
            invoke();
            ((addPosition) this.ag$a).valueOf(i);
            return this;
        }

        public values ah$a(ByteString byteString) {
            invoke();
            ((addPosition) this.ag$a).toString(byteString);
            return this;
        }
    }

    /* renamed from: o.addPosition$4  reason: invalid class name */
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
                return new addPosition();
            case 2:
                return new values(null);
            case 3:
                return toString(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                convertToRelativeDirection<addPosition> converttorelativedirection = PARSER;
                if (converttorelativedirection == null) {
                    synchronized (addPosition.class) {
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
        addPosition addposition = new addPosition();
        DEFAULT_INSTANCE = addposition;
        GeneratedMessageLite.valueOf(addPosition.class, addposition);
    }
}
