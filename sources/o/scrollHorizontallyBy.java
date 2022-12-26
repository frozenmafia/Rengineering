package o;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ah$a;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
/* loaded from: classes7.dex */
public final class scrollHorizontallyBy extends GeneratedMessageLite<scrollHorizontallyBy, values> implements setStackFromEnd {
    private static final scrollHorizontallyBy DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile convertToRelativeDirection<scrollHorizontallyBy> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.EMPTY;
    private int version_;

    private scrollHorizontallyBy() {
    }

    public int valueOf() {
        return this.version_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ah$a(int i) {
        this.version_ = i;
    }

    public ByteString values() {
        return this.keyValue_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ag$a(ByteString byteString) {
        byteString.getClass();
        this.keyValue_ = byteString;
    }

    public static scrollHorizontallyBy ag$a(ByteString byteString, ItemTouchHelper itemTouchHelper) throws InvalidProtocolBufferException {
        return (scrollHorizontallyBy) GeneratedMessageLite.ah$a(DEFAULT_INSTANCE, byteString, itemTouchHelper);
    }

    /* loaded from: classes7.dex */
    public static final class values extends GeneratedMessageLite.values<scrollHorizontallyBy, values> implements setStackFromEnd {
        /* synthetic */ values(AnonymousClass5 anonymousClass5) {
            this();
        }

        private values() {
            super(scrollHorizontallyBy.DEFAULT_INSTANCE);
        }

        public values toString(int i) {
            invoke();
            ((scrollHorizontallyBy) this.ag$a).ah$a(i);
            return this;
        }

        public values ag$a(ByteString byteString) {
            invoke();
            ((scrollHorizontallyBy) this.ag$a).ag$a(byteString);
            return this;
        }
    }

    /* renamed from: o.scrollHorizontallyBy$5  reason: invalid class name */
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

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object ag$a(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (AnonymousClass5.ah$a[methodToInvoke.ordinal()]) {
            case 1:
                return new scrollHorizontallyBy();
            case 2:
                return new values(null);
            case 3:
                return toString(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                convertToRelativeDirection<scrollHorizontallyBy> converttorelativedirection = PARSER;
                if (converttorelativedirection == null) {
                    synchronized (scrollHorizontallyBy.class) {
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
        scrollHorizontallyBy scrollhorizontallyby = new scrollHorizontallyBy();
        DEFAULT_INSTANCE = scrollhorizontallyby;
        GeneratedMessageLite.valueOf(scrollHorizontallyBy.class, scrollhorizontallyby);
    }
}
