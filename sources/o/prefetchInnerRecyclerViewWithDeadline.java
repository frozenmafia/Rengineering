package o;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ah$a;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
/* loaded from: classes7.dex */
public final class prefetchInnerRecyclerViewWithDeadline extends GeneratedMessageLite<prefetchInnerRecyclerViewWithDeadline, toString> implements collectPrefetchPositionsFromView {
    private static final prefetchInnerRecyclerViewWithDeadline DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile convertToRelativeDirection<prefetchInnerRecyclerViewWithDeadline> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.EMPTY;
    private int version_;

    private prefetchInnerRecyclerViewWithDeadline() {
    }

    public int values() {
        return this.version_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ah$a(int i) {
        this.version_ = i;
    }

    public ByteString ag$a() {
        return this.keyValue_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void valueOf(ByteString byteString) {
        byteString.getClass();
        this.keyValue_ = byteString;
    }

    public static prefetchInnerRecyclerViewWithDeadline ag$a(ByteString byteString, ItemTouchHelper itemTouchHelper) throws InvalidProtocolBufferException {
        return (prefetchInnerRecyclerViewWithDeadline) GeneratedMessageLite.ah$a(DEFAULT_INSTANCE, byteString, itemTouchHelper);
    }

    public static toString valueOf() {
        return DEFAULT_INSTANCE.ak();
    }

    /* loaded from: classes7.dex */
    public static final class toString extends GeneratedMessageLite.values<prefetchInnerRecyclerViewWithDeadline, toString> implements collectPrefetchPositionsFromView {
        /* synthetic */ toString(AnonymousClass5 anonymousClass5) {
            this();
        }

        private toString() {
            super(prefetchInnerRecyclerViewWithDeadline.DEFAULT_INSTANCE);
        }

        public toString ag$a(int i) {
            invoke();
            ((prefetchInnerRecyclerViewWithDeadline) this.ag$a).ah$a(i);
            return this;
        }

        public toString ah$a(ByteString byteString) {
            invoke();
            ((prefetchInnerRecyclerViewWithDeadline) this.ag$a).valueOf(byteString);
            return this;
        }
    }

    /* renamed from: o.prefetchInnerRecyclerViewWithDeadline$5  reason: invalid class name */
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
                return new prefetchInnerRecyclerViewWithDeadline();
            case 2:
                return new toString(null);
            case 3:
                return toString(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                convertToRelativeDirection<prefetchInnerRecyclerViewWithDeadline> converttorelativedirection = PARSER;
                if (converttorelativedirection == null) {
                    synchronized (prefetchInnerRecyclerViewWithDeadline.class) {
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
        prefetchInnerRecyclerViewWithDeadline prefetchinnerrecyclerviewwithdeadline = new prefetchInnerRecyclerViewWithDeadline();
        DEFAULT_INSTANCE = prefetchinnerrecyclerviewwithdeadline;
        GeneratedMessageLite.valueOf(prefetchInnerRecyclerViewWithDeadline.class, prefetchinnerrecyclerviewwithdeadline);
    }
}
