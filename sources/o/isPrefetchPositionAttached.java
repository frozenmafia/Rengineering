package o;

import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ah$a;
/* loaded from: classes7.dex */
public final class isPrefetchPositionAttached extends GeneratedMessageLite<isPrefetchPositionAttached, valueOf> implements postFromTraversal {
    public static final int CIPHERTEXT_SEGMENT_SIZE_FIELD_NUMBER = 1;
    private static final isPrefetchPositionAttached DEFAULT_INSTANCE;
    public static final int DERIVED_KEY_SIZE_FIELD_NUMBER = 2;
    public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 3;
    private static volatile convertToRelativeDirection<isPrefetchPositionAttached> PARSER;
    private int ciphertextSegmentSize_;
    private int derivedKeySize_;
    private int hkdfHashType_;

    private isPrefetchPositionAttached() {
    }

    public int ag$a() {
        return this.ciphertextSegmentSize_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void valueOf(int i) {
        this.ciphertextSegmentSize_ = i;
    }

    public int invoke() {
        return this.derivedKeySize_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toString(int i) {
        this.derivedKeySize_ = i;
    }

    public HashType HaptikSDK$c() {
        HashType forNumber = HashType.forNumber(this.hkdfHashType_);
        return forNumber == null ? HashType.UNRECOGNIZED : forNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void valueOf(HashType hashType) {
        this.hkdfHashType_ = hashType.getNumber();
    }

    public static valueOf valueOf() {
        return DEFAULT_INSTANCE.ak();
    }

    /* loaded from: classes7.dex */
    public static final class valueOf extends GeneratedMessageLite.values<isPrefetchPositionAttached, valueOf> implements postFromTraversal {
        /* synthetic */ valueOf(AnonymousClass3 anonymousClass3) {
            this();
        }

        private valueOf() {
            super(isPrefetchPositionAttached.DEFAULT_INSTANCE);
        }

        public valueOf ah$a(int i) {
            invoke();
            ((isPrefetchPositionAttached) this.ag$a).valueOf(i);
            return this;
        }

        public valueOf toString(int i) {
            invoke();
            ((isPrefetchPositionAttached) this.ag$a).toString(i);
            return this;
        }

        public valueOf values(HashType hashType) {
            invoke();
            ((isPrefetchPositionAttached) this.ag$a).valueOf(hashType);
            return this;
        }
    }

    /* renamed from: o.isPrefetchPositionAttached$3  reason: invalid class name */
    /* loaded from: classes7.dex */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] toString;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            toString = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                toString[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                toString[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                toString[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                toString[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                toString[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                toString[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object ag$a(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (AnonymousClass3.toString[methodToInvoke.ordinal()]) {
            case 1:
                return new isPrefetchPositionAttached();
            case 2:
                return new valueOf(null);
            case 3:
                return toString(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\f", new Object[]{"ciphertextSegmentSize_", "derivedKeySize_", "hkdfHashType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                convertToRelativeDirection<isPrefetchPositionAttached> converttorelativedirection = PARSER;
                if (converttorelativedirection == null) {
                    synchronized (isPrefetchPositionAttached.class) {
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
        isPrefetchPositionAttached isprefetchpositionattached = new isPrefetchPositionAttached();
        DEFAULT_INSTANCE = isprefetchpositionattached;
        GeneratedMessageLite.valueOf(isPrefetchPositionAttached.class, isprefetchpositionattached);
    }
}
