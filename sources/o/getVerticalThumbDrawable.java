package o;

import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ah$a;
/* loaded from: classes7.dex */
public final class getVerticalThumbDrawable extends GeneratedMessageLite<getVerticalThumbDrawable, toString> implements getVerticalTrackDrawable {
    public static final int CIPHERTEXT_SEGMENT_SIZE_FIELD_NUMBER = 1;
    private static final getVerticalThumbDrawable DEFAULT_INSTANCE;
    public static final int DERIVED_KEY_SIZE_FIELD_NUMBER = 2;
    public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 3;
    public static final int HMAC_PARAMS_FIELD_NUMBER = 4;
    private static volatile convertToRelativeDirection<getVerticalThumbDrawable> PARSER;
    private int ciphertextSegmentSize_;
    private int derivedKeySize_;
    private int hkdfHashType_;
    private ensureAnchorIsInCorrectSpan hmacParams_;

    private getVerticalThumbDrawable() {
    }

    public int valueOf() {
        return this.ciphertextSegmentSize_;
    }

    public int ag$a() {
        return this.derivedKeySize_;
    }

    public HashType invoke() {
        HashType forNumber = HashType.forNumber(this.hkdfHashType_);
        return forNumber == null ? HashType.UNRECOGNIZED : forNumber;
    }

    public ensureAnchorIsInCorrectSpan HaptikSDK$c() {
        ensureAnchorIsInCorrectSpan ensureanchorisincorrectspan = this.hmacParams_;
        return ensureanchorisincorrectspan == null ? ensureAnchorIsInCorrectSpan.values() : ensureanchorisincorrectspan;
    }

    /* loaded from: classes7.dex */
    public static final class toString extends GeneratedMessageLite.values<getVerticalThumbDrawable, toString> implements getVerticalTrackDrawable {
        /* synthetic */ toString(AnonymousClass1 anonymousClass1) {
            this();
        }

        private toString() {
            super(getVerticalThumbDrawable.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: o.getVerticalThumbDrawable$1  reason: invalid class name */
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
                return new getVerticalThumbDrawable();
            case 2:
                return new toString(null);
            case 3:
                return toString(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\f\u0004\t", new Object[]{"ciphertextSegmentSize_", "derivedKeySize_", "hkdfHashType_", "hmacParams_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                convertToRelativeDirection<getVerticalThumbDrawable> converttorelativedirection = PARSER;
                if (converttorelativedirection == null) {
                    synchronized (getVerticalThumbDrawable.class) {
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
        getVerticalThumbDrawable getverticalthumbdrawable = new getVerticalThumbDrawable();
        DEFAULT_INSTANCE = getverticalthumbdrawable;
        GeneratedMessageLite.valueOf(getVerticalThumbDrawable.class, getverticalthumbdrawable);
    }

    public static getVerticalThumbDrawable values() {
        return DEFAULT_INSTANCE;
    }
}
