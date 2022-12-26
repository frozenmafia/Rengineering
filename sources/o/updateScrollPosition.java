package o;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ah$a;
/* loaded from: classes7.dex */
public final class updateScrollPosition extends GeneratedMessageLite<updateScrollPosition, values> implements flushTasksWithDeadline {
    private static final updateScrollPosition DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile convertToRelativeDirection<updateScrollPosition> PARSER;
    private int ivSize_;

    private updateScrollPosition() {
    }

    public int ah$a() {
        return this.ivSize_;
    }

    /* loaded from: classes7.dex */
    public static final class values extends GeneratedMessageLite.values<updateScrollPosition, values> implements flushTasksWithDeadline {
        /* synthetic */ values(AnonymousClass5 anonymousClass5) {
            this();
        }

        private values() {
            super(updateScrollPosition.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: o.updateScrollPosition$5  reason: invalid class name */
    /* loaded from: classes7.dex */
    static /* synthetic */ class AnonymousClass5 {
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
        switch (AnonymousClass5.toString[methodToInvoke.ordinal()]) {
            case 1:
                return new updateScrollPosition();
            case 2:
                return new values(null);
            case 3:
                return toString(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                convertToRelativeDirection<updateScrollPosition> converttorelativedirection = PARSER;
                if (converttorelativedirection == null) {
                    synchronized (updateScrollPosition.class) {
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
        updateScrollPosition updatescrollposition = new updateScrollPosition();
        DEFAULT_INSTANCE = updatescrollposition;
        GeneratedMessageLite.valueOf(updateScrollPosition.class, updatescrollposition);
    }

    public static updateScrollPosition values() {
        return DEFAULT_INSTANCE;
    }
}
