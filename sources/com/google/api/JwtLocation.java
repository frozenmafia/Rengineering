package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$ah$a;
import o.TwoStatePreference;
import o.globalToLocal;
/* loaded from: classes7.dex */
public final class JwtLocation extends GeneratedMessageLite<JwtLocation, valueOf> implements TwoStatePreference.SavedState.AnonymousClass1 {
    private static final JwtLocation DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile globalToLocal<JwtLocation> PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int VALUE_PREFIX_FIELD_NUMBER = 3;
    private Object in_;
    private int inCase_ = 0;
    private String valuePrefix_ = "";

    private JwtLocation() {
    }

    /* loaded from: classes7.dex */
    public enum InCase {
        HEADER(1),
        QUERY(2),
        IN_NOT_SET(0);
        
        private final int value;

        InCase(int i) {
            this.value = i;
        }

        @Deprecated
        public static InCase valueOf(int i) {
            return forNumber(i);
        }

        public static InCase forNumber(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return QUERY;
                }
                return HEADER;
            }
            return IN_NOT_SET;
        }

        public int getNumber() {
            return this.value;
        }
    }

    /* loaded from: classes7.dex */
    public static final class valueOf extends GeneratedMessageLite.values<JwtLocation, valueOf> implements TwoStatePreference.SavedState.AnonymousClass1 {
        /* synthetic */ valueOf(AnonymousClass2 anonymousClass2) {
            this();
        }

        private valueOf() {
            super(JwtLocation.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.api.JwtLocation$2  reason: invalid class name */
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
                return new JwtLocation();
            case 2:
                return new valueOf(null);
            case 3:
                return ah$a(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000\u0003Ȉ", new Object[]{"in_", "inCase_", "valuePrefix_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                globalToLocal<JwtLocation> globaltolocal = PARSER;
                if (globaltolocal == null) {
                    synchronized (JwtLocation.class) {
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
        JwtLocation jwtLocation = new JwtLocation();
        DEFAULT_INSTANCE = jwtLocation;
        GeneratedMessageLite.values(JwtLocation.class, jwtLocation);
    }
}
