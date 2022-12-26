package o;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ah$a;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
/* loaded from: classes7.dex */
public final class scrollVerticallyBy extends GeneratedMessageLite<scrollVerticallyBy, toString> implements setSpanCount {
    private static final scrollVerticallyBy DEFAULT_INSTANCE;
    private static volatile convertToRelativeDirection<scrollVerticallyBy> PARSER;

    private scrollVerticallyBy() {
    }

    public static scrollVerticallyBy valueOf(ByteString byteString, ItemTouchHelper itemTouchHelper) throws InvalidProtocolBufferException {
        return (scrollVerticallyBy) GeneratedMessageLite.ah$a(DEFAULT_INSTANCE, byteString, itemTouchHelper);
    }

    /* loaded from: classes7.dex */
    public static final class toString extends GeneratedMessageLite.values<scrollVerticallyBy, toString> implements setSpanCount {
        /* synthetic */ toString(AnonymousClass5 anonymousClass5) {
            this();
        }

        private toString() {
            super(scrollVerticallyBy.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: o.scrollVerticallyBy$5  reason: invalid class name */
    /* loaded from: classes7.dex */
    static /* synthetic */ class AnonymousClass5 {
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
        switch (AnonymousClass5.values[methodToInvoke.ordinal()]) {
            case 1:
                return new scrollVerticallyBy();
            case 2:
                return new toString(null);
            case 3:
                return toString(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                convertToRelativeDirection<scrollVerticallyBy> converttorelativedirection = PARSER;
                if (converttorelativedirection == null) {
                    synchronized (scrollVerticallyBy.class) {
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
        scrollVerticallyBy scrollverticallyby = new scrollVerticallyBy();
        DEFAULT_INSTANCE = scrollverticallyby;
        GeneratedMessageLite.valueOf(scrollVerticallyBy.class, scrollverticallyby);
    }
}
