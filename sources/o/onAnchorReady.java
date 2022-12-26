package o;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ah$a;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
/* loaded from: classes7.dex */
public final class onAnchorReady extends GeneratedMessageLite<onAnchorReady, toString> implements layoutChunk {
    private static final onAnchorReady DEFAULT_INSTANCE;
    public static final int KEY_URI_FIELD_NUMBER = 1;
    private static volatile convertToRelativeDirection<onAnchorReady> PARSER;
    private String keyUri_ = "";

    private onAnchorReady() {
    }

    public String valueOf() {
        return this.keyUri_;
    }

    public static onAnchorReady ag$a(ByteString byteString, ItemTouchHelper itemTouchHelper) throws InvalidProtocolBufferException {
        return (onAnchorReady) GeneratedMessageLite.ah$a(DEFAULT_INSTANCE, byteString, itemTouchHelper);
    }

    /* loaded from: classes7.dex */
    public static final class toString extends GeneratedMessageLite.values<onAnchorReady, toString> implements layoutChunk {
        /* synthetic */ toString(AnonymousClass1 anonymousClass1) {
            this();
        }

        private toString() {
            super(onAnchorReady.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: o.onAnchorReady$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    static /* synthetic */ class AnonymousClass1 {
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
        switch (AnonymousClass1.toString[methodToInvoke.ordinal()]) {
            case 1:
                return new onAnchorReady();
            case 2:
                return new toString(null);
            case 3:
                return toString(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"keyUri_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                convertToRelativeDirection<onAnchorReady> converttorelativedirection = PARSER;
                if (converttorelativedirection == null) {
                    synchronized (onAnchorReady.class) {
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
        onAnchorReady onanchorready = new onAnchorReady();
        DEFAULT_INSTANCE = onanchorready;
        GeneratedMessageLite.valueOf(onAnchorReady.class, onanchorready);
    }
}
