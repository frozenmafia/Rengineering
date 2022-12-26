package o;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ah$a;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
/* loaded from: classes7.dex */
public final class prefetchPositionWithDeadline extends GeneratedMessageLite<prefetchPositionWithDeadline, values> implements prefetch {
    private static final prefetchPositionWithDeadline DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    private static volatile convertToRelativeDirection<prefetchPositionWithDeadline> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private int version_;

    private prefetchPositionWithDeadline() {
    }

    public int valueOf() {
        return this.keySize_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ah$a(int i) {
        this.keySize_ = i;
    }

    public static prefetchPositionWithDeadline valueOf(ByteString byteString, ItemTouchHelper itemTouchHelper) throws InvalidProtocolBufferException {
        return (prefetchPositionWithDeadline) GeneratedMessageLite.ah$a(DEFAULT_INSTANCE, byteString, itemTouchHelper);
    }

    public static values values() {
        return DEFAULT_INSTANCE.ak();
    }

    /* loaded from: classes7.dex */
    public static final class values extends GeneratedMessageLite.values<prefetchPositionWithDeadline, values> implements prefetch {
        /* synthetic */ values(AnonymousClass1 anonymousClass1) {
            this();
        }

        private values() {
            super(prefetchPositionWithDeadline.DEFAULT_INSTANCE);
        }

        public values valueOf(int i) {
            invoke();
            ((prefetchPositionWithDeadline) this.ag$a).ah$a(i);
            return this;
        }
    }

    /* renamed from: o.prefetchPositionWithDeadline$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    static /* synthetic */ class AnonymousClass1 {
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
        switch (AnonymousClass1.valueOf[methodToInvoke.ordinal()]) {
            case 1:
                return new prefetchPositionWithDeadline();
            case 2:
                return new values(null);
            case 3:
                return toString(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"keySize_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                convertToRelativeDirection<prefetchPositionWithDeadline> converttorelativedirection = PARSER;
                if (converttorelativedirection == null) {
                    synchronized (prefetchPositionWithDeadline.class) {
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
        prefetchPositionWithDeadline prefetchpositionwithdeadline = new prefetchPositionWithDeadline();
        DEFAULT_INSTANCE = prefetchpositionwithdeadline;
        GeneratedMessageLite.valueOf(prefetchPositionWithDeadline.class, prefetchpositionwithdeadline);
    }
}
