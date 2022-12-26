package o;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ah$a;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
/* loaded from: classes7.dex */
public final class lastPrefetchIncludedPosition extends GeneratedMessageLite<lastPrefetchIncludedPosition, valueOf> implements assignSpans {
    private static final lastPrefetchIncludedPosition DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile convertToRelativeDirection<lastPrefetchIncludedPosition> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.EMPTY;
    private int version_;

    private lastPrefetchIncludedPosition() {
    }

    public int values() {
        return this.version_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ah$a(int i) {
        this.version_ = i;
    }

    public ByteString ah$a() {
        return this.keyValue_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ag$a(ByteString byteString) {
        byteString.getClass();
        this.keyValue_ = byteString;
    }

    public static lastPrefetchIncludedPosition valueOf(ByteString byteString, ItemTouchHelper itemTouchHelper) throws InvalidProtocolBufferException {
        return (lastPrefetchIncludedPosition) GeneratedMessageLite.ah$a(DEFAULT_INSTANCE, byteString, itemTouchHelper);
    }

    public static valueOf valueOf() {
        return DEFAULT_INSTANCE.ak();
    }

    /* loaded from: classes7.dex */
    public static final class valueOf extends GeneratedMessageLite.values<lastPrefetchIncludedPosition, valueOf> implements assignSpans {
        /* synthetic */ valueOf(AnonymousClass2 anonymousClass2) {
            this();
        }

        private valueOf() {
            super(lastPrefetchIncludedPosition.DEFAULT_INSTANCE);
        }

        public valueOf ah$a(int i) {
            invoke();
            ((lastPrefetchIncludedPosition) this.ag$a).ah$a(i);
            return this;
        }

        public valueOf ag$a(ByteString byteString) {
            invoke();
            ((lastPrefetchIncludedPosition) this.ag$a).ag$a(byteString);
            return this;
        }
    }

    /* renamed from: o.lastPrefetchIncludedPosition$2  reason: invalid class name */
    /* loaded from: classes7.dex */
    static /* synthetic */ class AnonymousClass2 {
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

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object ag$a(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (AnonymousClass2.values[methodToInvoke.ordinal()]) {
            case 1:
                return new lastPrefetchIncludedPosition();
            case 2:
                return new valueOf(null);
            case 3:
                return toString(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                convertToRelativeDirection<lastPrefetchIncludedPosition> converttorelativedirection = PARSER;
                if (converttorelativedirection == null) {
                    synchronized (lastPrefetchIncludedPosition.class) {
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
        lastPrefetchIncludedPosition lastprefetchincludedposition = new lastPrefetchIncludedPosition();
        DEFAULT_INSTANCE = lastprefetchincludedposition;
        GeneratedMessageLite.valueOf(lastPrefetchIncludedPosition.class, lastprefetchincludedposition);
    }
}
