package o;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$ah$a;
/* loaded from: classes7.dex */
public final class getFocusableViewAfter extends GeneratedMessageLite<getFocusableViewAfter, toString> implements findOnePartiallyOrCompletelyVisibleChild {
    private static final getFocusableViewAfter DEFAULT_INSTANCE;
    private static volatile globalToLocal<getFocusableViewAfter> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String typeUrl_ = "";
    private ByteString value_ = ByteString.EMPTY;

    private getFocusableViewAfter() {
    }

    /* loaded from: classes7.dex */
    public static final class toString extends GeneratedMessageLite.values<getFocusableViewAfter, toString> implements findOnePartiallyOrCompletelyVisibleChild {
        /* synthetic */ toString(AnonymousClass2 anonymousClass2) {
            this();
        }

        private toString() {
            super(getFocusableViewAfter.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: o.getFocusableViewAfter$2  reason: invalid class name */
    /* loaded from: classes7.dex */
    static /* synthetic */ class AnonymousClass2 {
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

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object toString(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (AnonymousClass2.valueOf[methodToInvoke.ordinal()]) {
            case 1:
                return new getFocusableViewAfter();
            case 2:
                return new toString(null);
            case 3:
                return ah$a(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"typeUrl_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                globalToLocal<getFocusableViewAfter> globaltolocal = PARSER;
                if (globaltolocal == null) {
                    synchronized (getFocusableViewAfter.class) {
                        globaltolocal = PARSER;
                        if (globaltolocal == null) {
                            globaltolocal = new GeneratedMessageLite$ah$a<>(DEFAULT_INSTANCE);
                            PARSER = globaltolocal;
                        }
                    }
                }
                return globaltolocal;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        getFocusableViewAfter getfocusableviewafter = new getFocusableViewAfter();
        DEFAULT_INSTANCE = getfocusableviewafter;
        GeneratedMessageLite.values(getFocusableViewAfter.class, getfocusableviewafter);
    }
}
