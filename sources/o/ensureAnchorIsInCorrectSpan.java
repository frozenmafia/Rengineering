package o;

import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ah$a;
/* loaded from: classes7.dex */
public final class ensureAnchorIsInCorrectSpan extends GeneratedMessageLite<ensureAnchorIsInCorrectSpan, valueOf> implements measureChildWithDecorationsAndMargin {
    private static final ensureAnchorIsInCorrectSpan DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile convertToRelativeDirection<ensureAnchorIsInCorrectSpan> PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    private ensureAnchorIsInCorrectSpan() {
    }

    public HashType ag$a() {
        HashType forNumber = HashType.forNumber(this.hash_);
        return forNumber == null ? HashType.UNRECOGNIZED : forNumber;
    }

    public int valueOf() {
        return this.tagSize_;
    }

    /* loaded from: classes7.dex */
    public static final class valueOf extends GeneratedMessageLite.values<ensureAnchorIsInCorrectSpan, valueOf> implements measureChildWithDecorationsAndMargin {
        /* synthetic */ valueOf(AnonymousClass2 anonymousClass2) {
            this();
        }

        private valueOf() {
            super(ensureAnchorIsInCorrectSpan.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: o.ensureAnchorIsInCorrectSpan$2  reason: invalid class name */
    /* loaded from: classes7.dex */
    static /* synthetic */ class AnonymousClass2 {
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
        switch (AnonymousClass2.ag$a[methodToInvoke.ordinal()]) {
            case 1:
                return new ensureAnchorIsInCorrectSpan();
            case 2:
                return new valueOf(null);
            case 3:
                return toString(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                convertToRelativeDirection<ensureAnchorIsInCorrectSpan> converttorelativedirection = PARSER;
                if (converttorelativedirection == null) {
                    synchronized (ensureAnchorIsInCorrectSpan.class) {
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
        ensureAnchorIsInCorrectSpan ensureanchorisincorrectspan = new ensureAnchorIsInCorrectSpan();
        DEFAULT_INSTANCE = ensureanchorisincorrectspan;
        GeneratedMessageLite.valueOf(ensureAnchorIsInCorrectSpan.class, ensureanchorisincorrectspan);
    }

    public static ensureAnchorIsInCorrectSpan values() {
        return DEFAULT_INSTANCE;
    }
}
