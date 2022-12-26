package o;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$ah$a;
import o.SwitchPreferenceCompat;
/* loaded from: classes5.dex */
public interface SwitchPreference<StateT> {
    void toString(StateT statet);

    /* loaded from: classes7.dex */
    public final class Listener extends GeneratedMessageLite<Listener, values> implements SwitchPreferenceCompat.Listener {
        private static final Listener DEFAULT_INSTANCE;
        public static final int KIND_FIELD_NUMBER = 1;
        private static volatile globalToLocal<Listener> PARSER = null;
        public static final int PATH_FIELD_NUMBER = 2;
        private String kind_ = "";
        private String path_ = "";

        private Listener() {
        }

        /* loaded from: classes7.dex */
        public static final class values extends GeneratedMessageLite.values<Listener, values> implements SwitchPreferenceCompat.Listener {
            /* synthetic */ values(AnonymousClass2 anonymousClass2) {
                this();
            }

            private values() {
                super(Listener.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: o.SwitchPreference$Listener$2  reason: invalid class name */
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

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object toString(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (AnonymousClass2.ag$a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Listener();
                case 2:
                    return new values(null);
                case 3:
                    return ah$a(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"kind_", "path_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    globalToLocal<Listener> globaltolocal = PARSER;
                    if (globaltolocal == null) {
                        synchronized (Listener.class) {
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
            Listener listener = new Listener();
            DEFAULT_INSTANCE = listener;
            GeneratedMessageLite.values(Listener.class, listener);
        }
    }
}
