package o;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ah$a;
/* loaded from: classes7.dex */
public final class drawVerticalScrollbar extends GeneratedMessageLite<drawVerticalScrollbar, drawVerticalScrollbar$ah$a> implements getVerticalRange {
    private static final drawVerticalScrollbar DEFAULT_INSTANCE;
    private static volatile convertToRelativeDirection<drawVerticalScrollbar> PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 1;
    private int tagSize_;

    private drawVerticalScrollbar() {
    }

    public int values() {
        return this.tagSize_;
    }

    /* renamed from: o.drawVerticalScrollbar$5 */
    /* loaded from: classes7.dex */
    static /* synthetic */ class AnonymousClass5 {
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
        switch (AnonymousClass5.valueOf[methodToInvoke.ordinal()]) {
            case 1:
                return new drawVerticalScrollbar();
            case 2:
                return new drawVerticalScrollbar$ah$a(null);
            case 3:
                return toString(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"tagSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                convertToRelativeDirection<drawVerticalScrollbar> converttorelativedirection = PARSER;
                if (converttorelativedirection == null) {
                    synchronized (drawVerticalScrollbar.class) {
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
        drawVerticalScrollbar drawverticalscrollbar = new drawVerticalScrollbar();
        DEFAULT_INSTANCE = drawverticalscrollbar;
        GeneratedMessageLite.valueOf(drawVerticalScrollbar.class, drawverticalscrollbar);
    }

    public static drawVerticalScrollbar valueOf() {
        return DEFAULT_INSTANCE;
    }
}
