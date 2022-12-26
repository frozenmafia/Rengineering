package o;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ah$a;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
/* loaded from: classes7.dex */
public final class cachePreLayoutSpanMapping extends GeneratedMessageLite<cachePreLayoutSpanMapping, valueOf> implements calculateItemBorders {
    private static final cachePreLayoutSpanMapping DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile convertToRelativeDirection<cachePreLayoutSpanMapping> PARSER;
    private ByteString encryptedKeyset_ = ByteString.EMPTY;
    private getSpanCount keysetInfo_;

    private cachePreLayoutSpanMapping() {
    }

    public ByteString ah$a() {
        return this.encryptedKeyset_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ag$a(ByteString byteString) {
        byteString.getClass();
        this.encryptedKeyset_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ah$a(getSpanCount getspancount) {
        getspancount.getClass();
        this.keysetInfo_ = getspancount;
    }

    public static cachePreLayoutSpanMapping values(byte[] bArr, ItemTouchHelper itemTouchHelper) throws InvalidProtocolBufferException {
        return (cachePreLayoutSpanMapping) GeneratedMessageLite.valueOf(DEFAULT_INSTANCE, bArr, itemTouchHelper);
    }

    public static valueOf values() {
        return DEFAULT_INSTANCE.ak();
    }

    /* loaded from: classes7.dex */
    public static final class valueOf extends GeneratedMessageLite.values<cachePreLayoutSpanMapping, valueOf> implements calculateItemBorders {
        /* synthetic */ valueOf(AnonymousClass2 anonymousClass2) {
            this();
        }

        private valueOf() {
            super(cachePreLayoutSpanMapping.DEFAULT_INSTANCE);
        }

        public valueOf ag$a(ByteString byteString) {
            invoke();
            ((cachePreLayoutSpanMapping) this.ag$a).ag$a(byteString);
            return this;
        }

        public valueOf toString(getSpanCount getspancount) {
            invoke();
            ((cachePreLayoutSpanMapping) this.ag$a).ah$a(getspancount);
            return this;
        }
    }

    /* renamed from: o.cachePreLayoutSpanMapping$2  reason: invalid class name */
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
                return new cachePreLayoutSpanMapping();
            case 2:
                return new valueOf(null);
            case 3:
                return toString(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                convertToRelativeDirection<cachePreLayoutSpanMapping> converttorelativedirection = PARSER;
                if (converttorelativedirection == null) {
                    synchronized (cachePreLayoutSpanMapping.class) {
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
        cachePreLayoutSpanMapping cacheprelayoutspanmapping = new cachePreLayoutSpanMapping();
        DEFAULT_INSTANCE = cacheprelayoutspanmapping;
        GeneratedMessageLite.valueOf(cachePreLayoutSpanMapping.class, cacheprelayoutspanmapping);
    }
}
