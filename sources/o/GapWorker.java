package o;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ah$a;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
/* loaded from: classes7.dex */
public interface GapWorker extends startSwipe {

    /* renamed from: o.GapWorker$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public interface AnonymousClass1 extends startSwipe {
    }

    /* loaded from: classes7.dex */
    public interface LayoutPrefetchRegistryImpl extends startSwipe {
    }

    /* loaded from: classes7.dex */
    public final class Task extends GeneratedMessageLite<Task, valueOf> implements clearPreLayoutSpanMappingCache {
        private static final Task DEFAULT_INSTANCE;
        public static final int KEY_VALUE_FIELD_NUMBER = 2;
        private static volatile convertToRelativeDirection<Task> PARSER = null;
        public static final int VERSION_FIELD_NUMBER = 1;
        private ByteString keyValue_ = ByteString.EMPTY;
        private int version_;

        private Task() {
        }

        public int ag$a() {
            return this.version_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void valueOf(int i) {
            this.version_ = i;
        }

        public ByteString valueOf() {
            return this.keyValue_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ah$a(ByteString byteString) {
            byteString.getClass();
            this.keyValue_ = byteString;
        }

        public static Task ag$a(ByteString byteString, ItemTouchHelper itemTouchHelper) throws InvalidProtocolBufferException {
            return (Task) GeneratedMessageLite.ah$a(DEFAULT_INSTANCE, byteString, itemTouchHelper);
        }

        public static valueOf values() {
            return DEFAULT_INSTANCE.ak();
        }

        /* loaded from: classes7.dex */
        public static final class valueOf extends GeneratedMessageLite.values<Task, valueOf> implements clearPreLayoutSpanMappingCache {
            /* synthetic */ valueOf(AnonymousClass3 anonymousClass3) {
                this();
            }

            private valueOf() {
                super(Task.DEFAULT_INSTANCE);
            }

            public valueOf values(int i) {
                invoke();
                ((Task) this.ag$a).valueOf(i);
                return this;
            }

            public valueOf values(ByteString byteString) {
                invoke();
                ((Task) this.ag$a).ah$a(byteString);
                return this;
            }
        }

        /* renamed from: o.GapWorker$Task$3  reason: invalid class name */
        /* loaded from: classes7.dex */
        static /* synthetic */ class AnonymousClass3 {
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
            switch (AnonymousClass3.ag$a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Task();
                case 2:
                    return new valueOf(null);
                case 3:
                    return toString(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    convertToRelativeDirection<Task> converttorelativedirection = PARSER;
                    if (converttorelativedirection == null) {
                        synchronized (Task.class) {
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
            Task task = new Task();
            DEFAULT_INSTANCE = task;
            GeneratedMessageLite.valueOf(Task.class, task);
        }
    }
}
