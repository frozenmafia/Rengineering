package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import o.setSpanGroupIndexCacheEnabled;
/* loaded from: classes7.dex */
public final class WireFormat {
    public static final int valueOf = valueOf(1, 3);
    public static final int toString = valueOf(1, 4);
    public static final int values = valueOf(2, 0);
    public static final int ah$a = valueOf(3, 2);

    public static int toString(int i) {
        return i >>> 3;
    }

    public static int valueOf(int i) {
        return i & 7;
    }

    public static int valueOf(int i, int i2) {
        return (i << 3) | i2;
    }

    /* loaded from: classes7.dex */
    public enum JavaType {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(false),
        STRING(""),
        BYTE_STRING(ByteString.EMPTY),
        ENUM(null),
        MESSAGE(null);
        
        private final Object defaultDefault;

        JavaType(Object obj) {
            this.defaultDefault = obj;
        }

        Object getDefaultDefault() {
            return this.defaultDefault;
        }
    }

    /* loaded from: classes7.dex */
    public enum FieldType {
        DOUBLE(JavaType.DOUBLE, 1),
        FLOAT(JavaType.FLOAT, 5),
        INT64(JavaType.LONG, 0),
        UINT64(JavaType.LONG, 0),
        INT32(JavaType.INT, 0),
        FIXED64(JavaType.LONG, 1),
        FIXED32(JavaType.INT, 5),
        BOOL(JavaType.BOOLEAN, 0),
        STRING(JavaType.STRING, 2) { // from class: com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.1
            @Override // com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType
            public boolean isPackable() {
                return false;
            }
        },
        GROUP(JavaType.MESSAGE, 3) { // from class: com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.2
            @Override // com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType
            public boolean isPackable() {
                return false;
            }
        },
        MESSAGE(JavaType.MESSAGE, 2) { // from class: com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.3
            @Override // com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType
            public boolean isPackable() {
                return false;
            }
        },
        BYTES(JavaType.BYTE_STRING, 2) { // from class: com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.4
            @Override // com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType
            public boolean isPackable() {
                return false;
            }
        },
        UINT32(JavaType.INT, 0),
        ENUM(JavaType.ENUM, 0),
        SFIXED32(JavaType.INT, 5),
        SFIXED64(JavaType.LONG, 1),
        SINT32(JavaType.INT, 0),
        SINT64(JavaType.LONG, 0);
        
        private final JavaType javaType;
        private final int wireType;

        public boolean isPackable() {
            return true;
        }

        /* synthetic */ FieldType(JavaType javaType, int i, AnonymousClass5 anonymousClass5) {
            this(javaType, i);
        }

        FieldType(JavaType javaType, int i) {
            this.javaType = javaType;
            this.wireType = i;
        }

        public JavaType getJavaType() {
            return this.javaType;
        }

        public int getWireType() {
            return this.wireType;
        }
    }

    /* loaded from: classes7.dex */
    enum Utf8Validation {
        LOOSE { // from class: com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation.1
            @Override // com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation
            Object readString(setSpanGroupIndexCacheEnabled setspangroupindexcacheenabled) throws IOException {
                return setspangroupindexcacheenabled.ak();
            }
        },
        STRICT { // from class: com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation.2
            @Override // com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation
            Object readString(setSpanGroupIndexCacheEnabled setspangroupindexcacheenabled) throws IOException {
                return setspangroupindexcacheenabled.a();
            }
        },
        LAZY { // from class: com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation.3
            @Override // com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation
            Object readString(setSpanGroupIndexCacheEnabled setspangroupindexcacheenabled) throws IOException {
                return setspangroupindexcacheenabled.ah$a();
            }
        };

        abstract Object readString(setSpanGroupIndexCacheEnabled setspangroupindexcacheenabled) throws IOException;

        /* synthetic */ Utf8Validation(AnonymousClass5 anonymousClass5) {
            this();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.WireFormat$5  reason: invalid class name */
    /* loaded from: classes7.dex */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] toString;

        static {
            int[] iArr = new int[FieldType.values().length];
            toString = iArr;
            try {
                iArr[FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                toString[FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                toString[FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                toString[FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                toString[FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                toString[FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                toString[FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                toString[FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                toString[FieldType.BYTES.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                toString[FieldType.UINT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                toString[FieldType.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                toString[FieldType.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                toString[FieldType.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                toString[FieldType.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                toString[FieldType.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                toString[FieldType.GROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                toString[FieldType.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                toString[FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }
}
