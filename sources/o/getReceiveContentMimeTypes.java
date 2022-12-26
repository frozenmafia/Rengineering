package o;

import com.bugsnag.android.repackaged.dslplatform.json.JsonReader;
import com.bugsnag.android.repackaged.dslplatform.json.ParsingException;
import com.google.logging.type.LogSeverity;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import o.ViewCompat;
/* loaded from: classes3.dex */
public abstract class getReceiveContentMimeTypes {
    private static final BigDecimal extraCommand;
    private static final BigDecimal getInterfaceDescriptor;
    private static final byte[] mayLaunchUrl;
    private static final byte[] postMessage;
    public static final short[] asInterface = new short[0];
    public static final int[] ak = new int[0];
    public static final long[] ICustomTabsCallback = new long[0];
    public static final float[] getInitSettings = new float[0];
    public static final double[] ah$a = new double[0];
    public static final Short onTransact = 0;
    public static final Integer aj$a = 0;
    public static final Long ICustomTabsCallback$Default = 0L;
    public static final Float HaptikSDK$e = Float.valueOf(0.0f);
    public static final Double invoke = Double.valueOf(0.0d);
    private static final int[] newSessionWithExtras = new int[1000];
    private static final int[] receiveFile = {111, 222, androidx.databinding.library.baseAdapters.BR.sortFilterVm, 888, 1776};
    private static final int[] newSession = {50, 100, 200, 400, LogSeverity.EMERGENCY_VALUE};
    private static final int[] requestPostMessageChannel = {10000, 1000, 100, 10, 1};
    private static final double[] requestPostMessageChannelWithExtras = {10.0d, 100.0d, 1000.0d, 10000.0d, 100000.0d, 1000000.0d, 1.0E7d, 1.0E8d, 1.0E9d, 1.0E10d, 1.0E11d, 1.0E12d, 1.0E13d, 1.0E14d, 1.0E15d, 1.0E16d, 1.0E17d, 1.0E18d, 1.0E19d, 1.0E20d, 1.0E21d, 1.0E22d, 9.999999999999999E22d, 1.0E24d, 1.0E25d, 1.0E26d, 1.0E27d, 1.0E28d, 1.0E29d, 1.0E30d, 1.0E31d, 1.0E32d, 1.0E33d, 1.0E34d, 1.0E35d, 1.0E36d, 1.0E37d, 1.0E38d, 1.0E39d, 1.0E40d, 1.0E41d, 1.0E42d, 1.0E43d, 1.0E44d, 1.0E45d, 1.0E46d, 1.0E47d, 1.0E48d, 1.0E49d, 1.0E50d, 1.0E51d, 1.0E52d, 1.0E53d, 1.0E54d, 1.0E55d, 1.0E56d, 1.0E57d, 1.0E58d, 1.0E59d, 1.0E60d, 1.0E61d, 1.0E62d, 1.0E63d, 1.0E64d, 1.0E65d};
    public static final JsonReader.values<Double> toString = new JsonReader.values<Double>() { // from class: o.getReceiveContentMimeTypes.1
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.values
        /* renamed from: ag$a */
        public Double toString(JsonReader jsonReader) throws IOException {
            return Double.valueOf(getReceiveContentMimeTypes.ag$a(jsonReader));
        }
    };
    public static final JsonReader.values<Double> onMessageChannelReady = new JsonReader.values<Double>() { // from class: o.getReceiveContentMimeTypes.12
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.values
        /* renamed from: ah$a */
        public Double toString(JsonReader jsonReader) throws IOException {
            if (jsonReader.aj$a()) {
                return null;
            }
            return Double.valueOf(getReceiveContentMimeTypes.ag$a(jsonReader));
        }
    };
    public static final ViewCompat.Api31Impl.toString<Double> values = new ViewCompat.Api31Impl.toString<Double>() { // from class: o.getReceiveContentMimeTypes.25
    };
    public static final JsonReader.values<double[]> ag$a = new JsonReader.values<double[]>() { // from class: o.getReceiveContentMimeTypes.22
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.values
        /* renamed from: valueOf */
        public double[] toString(JsonReader jsonReader) throws IOException {
            if (jsonReader.aj$a()) {
                return null;
            }
            if (jsonReader.HaptikSDK$a() != 91) {
                throw jsonReader.valueOf("Expecting '[' for double array start");
            }
            jsonReader.ah$a();
            return getReceiveContentMimeTypes.values(jsonReader);
        }
    };
    public static final ViewCompat.Api31Impl.toString<double[]> valueOf = new ViewCompat.Api31Impl.toString<double[]>() { // from class: o.getReceiveContentMimeTypes.21
    };
    public static final JsonReader.values<Float> HaptikWebView = new JsonReader.values<Float>() { // from class: o.getReceiveContentMimeTypes.23
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.values
        /* renamed from: ag$a */
        public Float toString(JsonReader jsonReader) throws IOException {
            return Float.valueOf(getReceiveContentMimeTypes.toString(jsonReader));
        }
    };
    public static final JsonReader.values<Float> onNavigationEvent = new JsonReader.values<Float>() { // from class: o.getReceiveContentMimeTypes.30
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.values
        /* renamed from: values */
        public Float toString(JsonReader jsonReader) throws IOException {
            if (jsonReader.aj$a()) {
                return null;
            }
            return Float.valueOf(getReceiveContentMimeTypes.toString(jsonReader));
        }
    };
    public static final ViewCompat.Api31Impl.toString<Float> getSignupData = new ViewCompat.Api31Impl.toString<Float>() { // from class: o.getReceiveContentMimeTypes.29
    };
    public static final JsonReader.values<float[]> ah$b = new JsonReader.values<float[]>() { // from class: o.getReceiveContentMimeTypes.26
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.values
        /* renamed from: values */
        public float[] toString(JsonReader jsonReader) throws IOException {
            if (jsonReader.aj$a()) {
                return null;
            }
            if (jsonReader.HaptikSDK$a() != 91) {
                throw jsonReader.valueOf("Expecting '[' for float array start");
            }
            jsonReader.ah$a();
            return getReceiveContentMimeTypes.ah$a(jsonReader);
        }
    };
    public static final ViewCompat.Api31Impl.toString<float[]> HaptikSDK$b = new ViewCompat.Api31Impl.toString<float[]>() { // from class: o.getReceiveContentMimeTypes.4
    };
    public static final JsonReader.values<Integer> isLogoutPending = new JsonReader.values<Integer>() { // from class: o.getReceiveContentMimeTypes.3
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.values
        /* renamed from: valueOf */
        public Integer toString(JsonReader jsonReader) throws IOException {
            return Integer.valueOf(getReceiveContentMimeTypes.HaptikSDK$c(jsonReader));
        }
    };
    public static final JsonReader.values<Integer> onRelationshipValidationResult = new JsonReader.values<Integer>() { // from class: o.getReceiveContentMimeTypes.5
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.values
        /* renamed from: ag$a */
        public Integer toString(JsonReader jsonReader) throws IOException {
            if (jsonReader.aj$a()) {
                return null;
            }
            return Integer.valueOf(getReceiveContentMimeTypes.HaptikSDK$c(jsonReader));
        }
    };
    public static final ViewCompat.Api31Impl.toString<Integer> a = new ViewCompat.Api31Impl.toString<Integer>() { // from class: o.getReceiveContentMimeTypes.2
    };
    public static final JsonReader.values<int[]> HaptikSDK$d = new JsonReader.values<int[]>() { // from class: o.getReceiveContentMimeTypes.7
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.values
        /* renamed from: ah$a */
        public int[] toString(JsonReader jsonReader) throws IOException {
            if (jsonReader.aj$a()) {
                return null;
            }
            if (jsonReader.HaptikSDK$a() != 91) {
                throw jsonReader.valueOf("Expecting '[' for int array start");
            }
            jsonReader.ah$a();
            return getReceiveContentMimeTypes.HaptikSDK$b(jsonReader);
        }
    };
    public static final ViewCompat.Api31Impl.toString<int[]> onXdkEvent = new ViewCompat.Api31Impl.toString<int[]>() { // from class: o.getReceiveContentMimeTypes.8
    };
    public static final JsonReader.values<Short> ICustomTabsCallback$Stub$Proxy = new JsonReader.values<Short>() { // from class: o.getReceiveContentMimeTypes.10
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.values
        /* renamed from: values */
        public Short toString(JsonReader jsonReader) throws IOException {
            return Short.valueOf(getReceiveContentMimeTypes.HaptikSDK$e(jsonReader));
        }
    };
    public static final JsonReader.values<Short> asBinder = new JsonReader.values<Short>() { // from class: o.getReceiveContentMimeTypes.6
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.values
        /* renamed from: ah$a */
        public Short toString(JsonReader jsonReader) throws IOException {
            if (jsonReader.aj$a()) {
                return null;
            }
            return Short.valueOf(getReceiveContentMimeTypes.HaptikSDK$e(jsonReader));
        }
    };
    public static final ViewCompat.Api31Impl.toString<Short> ICustomTabsService = new ViewCompat.Api31Impl.toString<Short>() { // from class: o.getReceiveContentMimeTypes.9
    };
    public static final JsonReader.values<short[]> getDefaultImpl = new JsonReader.values<short[]>() { // from class: o.getReceiveContentMimeTypes.14
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.values
        /* renamed from: values */
        public short[] toString(JsonReader jsonReader) throws IOException {
            if (jsonReader.aj$a()) {
                return null;
            }
            if (jsonReader.HaptikSDK$a() != 91) {
                throw jsonReader.valueOf("Expecting '[' for short array start");
            }
            jsonReader.ah$a();
            return getReceiveContentMimeTypes.getSignupData(jsonReader);
        }
    };
    public static final ViewCompat.Api31Impl.toString<short[]> ICustomTabsCallback$Stub = new ViewCompat.Api31Impl.toString<short[]>() { // from class: o.getReceiveContentMimeTypes.15
    };
    public static final JsonReader.values<Long> ak$a = new JsonReader.values<Long>() { // from class: o.getReceiveContentMimeTypes.13
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.values
        /* renamed from: ag$a */
        public Long toString(JsonReader jsonReader) throws IOException {
            return Long.valueOf(getReceiveContentMimeTypes.HaptikSDK$a(jsonReader));
        }
    };
    public static final JsonReader.values<Long> onPostMessage = new JsonReader.values<Long>() { // from class: o.getReceiveContentMimeTypes.11
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.values
        /* renamed from: values */
        public Long toString(JsonReader jsonReader) throws IOException {
            if (jsonReader.aj$a()) {
                return null;
            }
            return Long.valueOf(getReceiveContentMimeTypes.HaptikSDK$a(jsonReader));
        }
    };
    public static final ViewCompat.Api31Impl.toString<Long> extraCallback = new ViewCompat.Api31Impl.toString<Long>() { // from class: o.getReceiveContentMimeTypes.18
    };
    public static final JsonReader.values<long[]> extraCallbackWithResult = new JsonReader.values<long[]>() { // from class: o.getReceiveContentMimeTypes.19
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.values
        /* renamed from: ah$a */
        public long[] toString(JsonReader jsonReader) throws IOException {
            if (jsonReader.aj$a()) {
                return null;
            }
            if (jsonReader.HaptikSDK$a() != 91) {
                throw jsonReader.valueOf("Expecting '[' for long array start");
            }
            jsonReader.ah$a();
            return getReceiveContentMimeTypes.invoke(jsonReader);
        }
    };
    public static final ViewCompat.Api31Impl.toString<long[]> ak$b = new ViewCompat.Api31Impl.toString<long[]>() { // from class: o.getReceiveContentMimeTypes.16
    };
    public static final JsonReader.values<BigDecimal> HaptikSDK$a = new JsonReader.values<BigDecimal>() { // from class: o.getReceiveContentMimeTypes.20
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.values
        /* renamed from: valueOf */
        public BigDecimal toString(JsonReader jsonReader) throws IOException {
            if (jsonReader.aj$a()) {
                return null;
            }
            return getReceiveContentMimeTypes.valueOf(jsonReader);
        }
    };
    public static final ViewCompat.Api31Impl.toString<BigDecimal> HaptikSDK$c = new ViewCompat.Api31Impl.toString<BigDecimal>() { // from class: o.getReceiveContentMimeTypes.17
    };
    static final JsonReader.values<Number> setDefaultImpl = new JsonReader.values<Number>() { // from class: o.getReceiveContentMimeTypes.24
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.values
        /* renamed from: values */
        public Number toString(JsonReader jsonReader) throws IOException {
            if (jsonReader.aj$a()) {
                return null;
            }
            return getReceiveContentMimeTypes.ah$b(jsonReader);
        }
    };

    static {
        int i = 0;
        while (true) {
            int[] iArr = newSessionWithExtras;
            if (i < iArr.length) {
                iArr[i] = (i < 10 ? 33554432 : i < 100 ? 16777216 : 0) + (((i / 100) + 48) << 16) + ((((i / 10) % 10) + 48) << 8) + (i % 10) + 48;
                i++;
            } else {
                mayLaunchUrl = "-2147483648".getBytes();
                postMessage = "-9223372036854775808".getBytes();
                extraCommand = BigDecimal.valueOf(Long.MAX_VALUE);
                getInterfaceDescriptor = BigDecimal.valueOf(Long.MIN_VALUE);
                return;
            }
        }
    }

    static void toString(JsonReader jsonReader, int i, int i2, String str) throws ParsingException {
        int i3 = i2 - i;
        if (i3 > jsonReader.HaptikSDK$c) {
            throw jsonReader.values("Too many digits detected in number", i3, "", "Too many digits detected in number", Integer.valueOf(i2), "");
        }
        throw jsonReader.values("Error parsing number", i3, "", str, null, ". Error parsing number");
    }

    static void ah$a(JsonReader jsonReader, int i, int i2, String str, Object obj) throws ParsingException {
        int i3 = i2 - i;
        if (i3 > jsonReader.HaptikSDK$c) {
            throw jsonReader.values("Too many digits detected in number", i3, "", "Too many digits detected in number", Integer.valueOf(i2), "");
        }
        throw jsonReader.values("Error parsing number", i3, "", str, obj, ". Error parsing number");
    }

    private static BigDecimal ag$a(char[] cArr, int i, JsonReader jsonReader, boolean z) throws ParsingException {
        int i2;
        int i3 = i;
        while (i3 > 0 && Character.isWhitespace(cArr[i3 - 1])) {
            i3--;
        }
        if (i3 > jsonReader.HaptikSDK$c) {
            throw jsonReader.values("Too many digits detected in number", i, "", "Too many digits detected in number", Integer.valueOf(i3), "");
        }
        int i4 = cArr[0] == '-' ? 1 : 0;
        if (cArr[i4] == '0' && i3 > (i2 = i4 + 1) && cArr[i2] >= '0' && cArr[i2] <= '9') {
            throw jsonReader.ag$a("Leading zero is not allowed. Error parsing number", i + (z ? 2 : 0));
        }
        try {
            return new BigDecimal(cArr, 0, i3);
        } catch (NumberFormatException e) {
            throw jsonReader.valueOf("Error parsing number", i + (z ? 2 : 0), e);
        }
    }

    private static getReceiveContentMimeTypes$ag$a ag$a(JsonReader jsonReader, int i) throws IOException {
        int ah$b2 = jsonReader.ah$b() - i;
        char[] ah$a2 = jsonReader.ah$a(i, ah$b2);
        while (jsonReader.ah$b() == jsonReader.valueOf() && !jsonReader.HaptikSDK$b()) {
            jsonReader.onXdkEvent();
            int valueOf2 = jsonReader.valueOf();
            int i2 = ah$b2 + valueOf2;
            if (i2 > jsonReader.HaptikSDK$c) {
                throw jsonReader.ag$a("Too many digits detected in number", i2, "Number of digits larger than %d. Unable to read number", Integer.valueOf(jsonReader.HaptikSDK$c));
            }
            char[] cArr = new char[i2];
            System.arraycopy(ah$a2, 0, cArr, 0, ah$b2);
            System.arraycopy(jsonReader.ah$a(0, valueOf2), 0, cArr, ah$b2, valueOf2);
            ah$b2 = i2;
            ah$a2 = cArr;
        }
        return new getReceiveContentMimeTypes$ag$a(ah$a2, ah$b2);
    }

    public static double ag$a(JsonReader jsonReader) throws IOException {
        if (jsonReader.HaptikSDK$a() == 34) {
            return values(jsonReader.HaptikSDK$d(), (jsonReader.valueOf() - jsonReader.valueOf()) - 1, jsonReader, true);
        }
        int onXdkEvent2 = jsonReader.onXdkEvent();
        int valueOf2 = jsonReader.valueOf();
        byte[] bArr = jsonReader.values;
        if (bArr[onXdkEvent2] == 45) {
            return -values(bArr, jsonReader, onXdkEvent2, valueOf2, 1);
        }
        return values(bArr, jsonReader, onXdkEvent2, valueOf2, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x008a, code lost:
        toString(r28, r29, r30, "Digit not found");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static double values(byte[] r27, com.bugsnag.android.repackaged.dslplatform.json.JsonReader r28, int r29, int r30, int r31) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getReceiveContentMimeTypes.values(byte[], com.bugsnag.android.repackaged.dslplatform.json.JsonReader, int, int, int):double");
    }

    private static double toString(int i, double d, int i2) {
        long doubleToRawLongBits = Double.doubleToRawLongBits(d);
        int i3 = ((int) (doubleToRawLongBits >> 52)) - 1022;
        return Double.longBitsToDouble(doubleToRawLongBits + (((i * requestPostMessageChannel[i2 + 1]) + newSession[i3]) / receiveFile[i3]));
    }

    private static double values(JsonReader jsonReader, long j, int i, double d, byte[] bArr, int i2, int i3, int i4, int i5) throws IOException {
        int valueOf2;
        if (jsonReader.valueOf == JsonReader.DoublePrecision.EXACT) {
            int i6 = (i3 - i2) - i4;
            return values(jsonReader.ah$a(i2 + i4, i6), i6, jsonReader, false);
        }
        int i7 = i5 + 1;
        byte b2 = bArr[i7];
        if (b2 == 45) {
            valueOf2 = toString(bArr, jsonReader, i7, i3);
        } else if (b2 == 43) {
            valueOf2 = valueOf(bArr, jsonReader, i7, i3, 1);
        } else {
            valueOf2 = valueOf(bArr, jsonReader, i7, i3, 0);
        }
        int i8 = valueOf2 - i;
        if (d == 0.0d) {
            if (i8 == 0 || j == 0) {
                return j;
            }
            if (i8 > 0) {
                double[] dArr = requestPostMessageChannelWithExtras;
                if (i8 < dArr.length) {
                    return j * dArr[i8 - 1];
                }
            }
            if (i8 < 0) {
                int i9 = -i8;
                double[] dArr2 = requestPostMessageChannelWithExtras;
                if (i9 < dArr2.length) {
                    return j / dArr2[i9 - 1];
                }
            }
            if (jsonReader.valueOf != JsonReader.DoublePrecision.HIGH) {
                if (i8 > 0 && i8 < 300) {
                    return j * Math.pow(10.0d, i8);
                }
                if (i8 > -300 && i8 < 0) {
                    return j / Math.pow(10.0d, i8);
                }
            }
        } else if (i8 == 0) {
            return j + d;
        } else {
            if (i8 > 0) {
                double[] dArr3 = requestPostMessageChannelWithExtras;
                if (i8 < dArr3.length) {
                    int i10 = i8 - 1;
                    return (dArr3[i10] * d) + (j * dArr3[i10]);
                }
            }
            if (i8 < 0) {
                int i11 = -i8;
                double[] dArr4 = requestPostMessageChannelWithExtras;
                if (i11 < dArr4.length) {
                    int i12 = i11 - 1;
                    return (d / dArr4[i12]) + (j / dArr4[i12]);
                }
            }
            if (jsonReader.valueOf != JsonReader.DoublePrecision.HIGH) {
                if (i8 > 0 && i8 < 300) {
                    return j * Math.pow(10.0d, i8);
                }
                if (i8 > -300 && i8 < 0) {
                    return j / Math.pow(10.0d, i8);
                }
            }
        }
        int i13 = (i3 - i2) - i4;
        return values(jsonReader.ah$a(i2 + i4, i13), i13, jsonReader, false);
    }

    private static double values(char[] cArr, int i, JsonReader jsonReader, boolean z) throws IOException {
        int i2;
        int i3 = i;
        while (i3 > 0 && Character.isWhitespace(cArr[i3 - 1])) {
            i3--;
        }
        if (i3 > jsonReader.HaptikSDK$c) {
            throw jsonReader.values("Too many digits detected in number", i, "", "Too many digits detected in number", Integer.valueOf(i3), "");
        }
        int i4 = cArr[0] == '-' ? 1 : 0;
        if (cArr[i4] == '0' && i3 > (i2 = i4 + 1) && cArr[i2] >= '0' && cArr[i2] <= '9') {
            throw jsonReader.ag$a("Leading zero is not allowed. Error parsing number", i + (z ? 2 : 0));
        }
        try {
            return Double.parseDouble(new String(cArr, 0, i3));
        } catch (NumberFormatException e) {
            throw jsonReader.valueOf("Error parsing number", i + (z ? 2 : 0), e);
        }
    }

    public static float toString(JsonReader jsonReader) throws IOException {
        if (jsonReader.HaptikSDK$a() == 34) {
            return toString(jsonReader.HaptikSDK$d(), (jsonReader.valueOf() - jsonReader.valueOf()) - 1, jsonReader, true);
        }
        int onXdkEvent2 = jsonReader.onXdkEvent();
        int valueOf2 = jsonReader.valueOf();
        if (valueOf2 == jsonReader.ah$b()) {
            getReceiveContentMimeTypes$ag$a ag$a2 = ag$a(jsonReader, onXdkEvent2);
            return toString(ag$a2.valueOf, ag$a2.ag$a, jsonReader, false);
        }
        byte[] bArr = jsonReader.values;
        if (bArr[onXdkEvent2] == 45) {
            return -ag$a(bArr, jsonReader, onXdkEvent2, valueOf2, 1);
        }
        return ag$a(bArr, jsonReader, onXdkEvent2, valueOf2, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
        toString(r21, r22, r23, "Digit not found");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static float ag$a(byte[] r20, com.bugsnag.android.repackaged.dslplatform.json.JsonReader r21, int r22, int r23, int r24) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getReceiveContentMimeTypes.ag$a(byte[], com.bugsnag.android.repackaged.dslplatform.json.JsonReader, int, int, int):float");
    }

    private static float ah$a(JsonReader jsonReader, long j, int i, byte[] bArr, int i2, int i3) throws IOException {
        int valueOf2;
        byte b2 = bArr[i3];
        if (b2 == 45) {
            valueOf2 = toString(bArr, jsonReader, i3, i2);
        } else if (b2 == 43) {
            valueOf2 = valueOf(bArr, jsonReader, i3, i2, 1);
        } else {
            valueOf2 = valueOf(bArr, jsonReader, i3, i2, 0);
        }
        int i4 = valueOf2 - i;
        if (i4 == 0 || j == 0) {
            return (float) j;
        }
        if (i4 > 0) {
            double[] dArr = requestPostMessageChannelWithExtras;
            if (i4 < dArr.length) {
                return (float) (j * dArr[i4 - 1]);
            }
        }
        if (i4 < 0) {
            int i5 = -i4;
            double[] dArr2 = requestPostMessageChannelWithExtras;
            if (i5 < dArr2.length) {
                return (float) (j / dArr2[i5 - 1]);
            }
        }
        return i4 > 0 ? Float.POSITIVE_INFINITY : 0.0f;
    }

    private static float toString(char[] cArr, int i, JsonReader jsonReader, boolean z) throws ParsingException {
        int i2;
        int i3 = i;
        while (i3 > 0 && Character.isWhitespace(cArr[i3 - 1])) {
            i3--;
        }
        if (i3 > jsonReader.HaptikSDK$c) {
            throw jsonReader.values("Too many digits detected in number", i, "", "Too many digits detected in number", Integer.valueOf(i3), "");
        }
        int i4 = cArr[0] == '-' ? 1 : 0;
        if (cArr[i4] == '0' && i3 > (i2 = i4 + 1) && cArr[i2] >= '0' && cArr[i2] <= '9') {
            throw jsonReader.ag$a("Leading zero is not allowed. Error parsing number", i + (z ? 2 : 0));
        }
        try {
            return Float.parseFloat(new String(cArr, 0, i3));
        } catch (NumberFormatException e) {
            throw jsonReader.valueOf("Error parsing number", i + (z ? 2 : 0), e);
        }
    }

    public static short HaptikSDK$e(JsonReader jsonReader) throws IOException {
        int valueOf2;
        if (jsonReader.HaptikSDK$a() == 34) {
            int valueOf3 = jsonReader.valueOf();
            try {
                return ag$a(jsonReader.HaptikSDK$d(), (jsonReader.valueOf() - valueOf3) - 1, jsonReader, true).shortValueExact();
            } catch (ArithmeticException unused) {
                throw jsonReader.ag$a("Short overflow detected", jsonReader.valueOf() - valueOf3);
            }
        }
        int onXdkEvent2 = jsonReader.onXdkEvent();
        int valueOf4 = jsonReader.valueOf();
        byte[] bArr = jsonReader.values;
        if (bArr[onXdkEvent2] == 45) {
            valueOf2 = toString(bArr, jsonReader, onXdkEvent2, valueOf4);
        } else {
            valueOf2 = valueOf(bArr, jsonReader, onXdkEvent2, valueOf4, 0);
        }
        if (valueOf2 < -32768 || valueOf2 > 32767) {
            throw jsonReader.ag$a("Short overflow detected", jsonReader.valueOf());
        }
        return (short) valueOf2;
    }

    public static int HaptikSDK$c(JsonReader jsonReader) throws IOException {
        int i;
        if (jsonReader.HaptikSDK$a() == 34) {
            int valueOf2 = jsonReader.valueOf();
            try {
                return ag$a(jsonReader.HaptikSDK$d(), (jsonReader.valueOf() - valueOf2) - 1, jsonReader, true).intValueExact();
            } catch (ArithmeticException unused) {
                throw jsonReader.ag$a("Integer overflow detected", jsonReader.valueOf() - valueOf2);
            }
        }
        int onXdkEvent2 = jsonReader.onXdkEvent();
        int valueOf3 = jsonReader.valueOf();
        byte[] bArr = jsonReader.values;
        byte b2 = bArr[onXdkEvent2];
        if (b2 == 45) {
            int i2 = onXdkEvent2 + 2;
            if (valueOf3 > i2 && bArr[onXdkEvent2 + 1] == 48 && bArr[i2] >= 48 && bArr[i2] <= 57) {
                toString(jsonReader, onXdkEvent2, valueOf3, "Leading zero is not allowed");
            }
            return toString(bArr, jsonReader, onXdkEvent2, valueOf3);
        }
        if (b2 == 48 && valueOf3 > (i = onXdkEvent2 + 1) && bArr[i] >= 48 && bArr[i] <= 57) {
            toString(jsonReader, onXdkEvent2, valueOf3, "Leading zero is not allowed");
        }
        return valueOf(bArr, jsonReader, onXdkEvent2, valueOf3, 0);
    }

    private static int valueOf(byte[] bArr, JsonReader jsonReader, int i, int i2, int i3) throws IOException {
        int i4 = i3 + i;
        if (i4 == i2) {
            toString(jsonReader, i, i2, "Digit not found");
        }
        int i5 = 0;
        for (int i6 = i4; i6 < i2; i6++) {
            int i7 = bArr[i6] - 48;
            if (i7 < 0 || i7 > 9) {
                if (i6 <= i4 || !jsonReader.valueOf(i6, i2)) {
                    if (i6 == i2 - 1 && bArr[i6] == 46) {
                        toString(jsonReader, i, i2, "Number ends with a dot");
                    }
                    int i8 = i2 - i;
                    BigDecimal ag$a2 = ag$a(jsonReader.ah$a(i, i8), i8, jsonReader, false);
                    if (ag$a2.scale() > 0) {
                        ah$a(jsonReader, i, i2, "Expecting int but found decimal value", ag$a2);
                    }
                    return ag$a2.intValue();
                }
                return i5;
            }
            i5 = (i5 << 3) + (i5 << 1) + i7;
            if (i5 < 0) {
                toString(jsonReader, i, i2, "Integer overflow detected");
            }
        }
        return i5;
    }

    private static int toString(byte[] bArr, JsonReader jsonReader, int i, int i2) throws IOException {
        int i3 = i + 1;
        if (i3 == i2) {
            toString(jsonReader, i, i2, "Digit not found");
        }
        int i4 = 0;
        for (int i5 = i3; i5 < i2; i5++) {
            int i6 = bArr[i5] - 48;
            if (i6 < 0 || i6 > 9) {
                if (i5 <= i3 || !jsonReader.valueOf(i5, i2)) {
                    if (i5 == i2 - 1 && bArr[i5] == 46) {
                        toString(jsonReader, i, i2, "Number ends with a dot");
                    }
                    int i7 = i2 - i;
                    BigDecimal ag$a2 = ag$a(jsonReader.ah$a(i, i7), i7, jsonReader, false);
                    if (ag$a2.scale() > 0) {
                        ah$a(jsonReader, i, i2, "Expecting int but found decimal value", ag$a2);
                    }
                    return ag$a2.intValue();
                }
                return i4;
            }
            i4 = ((i4 << 3) + (i4 << 1)) - i6;
            if (i4 > 0) {
                toString(jsonReader, i, i2, "Integer overflow detected");
            }
        }
        return i4;
    }

    public static int[] HaptikSDK$b(JsonReader jsonReader) throws IOException {
        if (jsonReader.HaptikSDK$a() == 93) {
            return ak;
        }
        int[] iArr = new int[4];
        iArr[0] = HaptikSDK$c(jsonReader);
        int i = 1;
        while (jsonReader.ah$a() == 44) {
            jsonReader.ah$a();
            if (i == iArr.length) {
                iArr = Arrays.copyOf(iArr, iArr.length << 1);
            }
            iArr[i] = HaptikSDK$c(jsonReader);
            i++;
        }
        jsonReader.values();
        return Arrays.copyOf(iArr, i);
    }

    public static short[] getSignupData(JsonReader jsonReader) throws IOException {
        if (jsonReader.HaptikSDK$a() == 93) {
            return asInterface;
        }
        short[] sArr = new short[4];
        sArr[0] = (short) HaptikSDK$c(jsonReader);
        int i = 1;
        while (jsonReader.ah$a() == 44) {
            jsonReader.ah$a();
            if (i == sArr.length) {
                sArr = Arrays.copyOf(sArr, sArr.length << 1);
            }
            sArr[i] = (short) HaptikSDK$c(jsonReader);
            i++;
        }
        jsonReader.values();
        return Arrays.copyOf(sArr, i);
    }

    public static long[] invoke(JsonReader jsonReader) throws IOException {
        if (jsonReader.HaptikSDK$a() == 93) {
            return ICustomTabsCallback;
        }
        long[] jArr = new long[4];
        jArr[0] = HaptikSDK$a(jsonReader);
        int i = 1;
        while (jsonReader.ah$a() == 44) {
            jsonReader.ah$a();
            if (i == jArr.length) {
                jArr = Arrays.copyOf(jArr, jArr.length << 1);
            }
            jArr[i] = HaptikSDK$a(jsonReader);
            i++;
        }
        jsonReader.values();
        return Arrays.copyOf(jArr, i);
    }

    public static float[] ah$a(JsonReader jsonReader) throws IOException {
        if (jsonReader.HaptikSDK$a() == 93) {
            return getInitSettings;
        }
        float[] fArr = new float[4];
        fArr[0] = toString(jsonReader);
        int i = 1;
        while (jsonReader.ah$a() == 44) {
            jsonReader.ah$a();
            if (i == fArr.length) {
                fArr = Arrays.copyOf(fArr, fArr.length << 1);
            }
            fArr[i] = toString(jsonReader);
            i++;
        }
        jsonReader.values();
        return Arrays.copyOf(fArr, i);
    }

    public static double[] values(JsonReader jsonReader) throws IOException {
        if (jsonReader.HaptikSDK$a() == 93) {
            return ah$a;
        }
        double[] dArr = new double[4];
        dArr[0] = ag$a(jsonReader);
        int i = 1;
        while (jsonReader.ah$a() == 44) {
            jsonReader.ah$a();
            if (i == dArr.length) {
                dArr = Arrays.copyOf(dArr, dArr.length << 1);
            }
            dArr[i] = ag$a(jsonReader);
            i++;
        }
        jsonReader.values();
        return Arrays.copyOf(dArr, i);
    }

    public static long HaptikSDK$a(JsonReader jsonReader) throws IOException {
        boolean z;
        if (jsonReader.HaptikSDK$a() == 34) {
            int valueOf2 = jsonReader.valueOf();
            try {
                return ag$a(jsonReader.HaptikSDK$d(), (jsonReader.valueOf() - valueOf2) - 1, jsonReader, true).longValueExact();
            } catch (ArithmeticException unused) {
                throw jsonReader.ag$a("Long overflow detected", jsonReader.valueOf() - valueOf2);
            }
        }
        int onXdkEvent2 = jsonReader.onXdkEvent();
        int valueOf3 = jsonReader.valueOf();
        byte[] bArr = jsonReader.values;
        byte b2 = bArr[onXdkEvent2];
        char c = 3;
        int i = 9;
        byte b3 = 48;
        if (b2 == 45) {
            int i2 = onXdkEvent2 + 1;
            if (i2 == valueOf3) {
                toString(jsonReader, onXdkEvent2, valueOf3, "Digit not found");
            }
            z = bArr[i2] == 48;
            int i3 = i2;
            long j = 0;
            while (i3 < valueOf3) {
                int i4 = bArr[i3] - 48;
                if (i4 < 0 || i4 > i) {
                    if (z && i3 > onXdkEvent2 + 2) {
                        toString(jsonReader, onXdkEvent2, valueOf3, "Leading zero is not allowed");
                    }
                    return (i3 <= i2 || !jsonReader.valueOf(i3, valueOf3)) ? ag$a(jsonReader, onXdkEvent2, valueOf3) : j;
                }
                j = ((j << c) + (j << 1)) - i4;
                if (j > 0) {
                    toString(jsonReader, onXdkEvent2, valueOf3, "Long overflow detected");
                }
                i3++;
                c = 3;
                i = 9;
            }
            if (z && i3 > onXdkEvent2 + 2) {
                toString(jsonReader, onXdkEvent2, valueOf3, "Leading zero is not allowed");
            }
            return j;
        }
        if (onXdkEvent2 == valueOf3) {
            toString(jsonReader, onXdkEvent2, valueOf3, "Digit not found");
        }
        z = bArr[onXdkEvent2] == 48;
        int i5 = onXdkEvent2;
        long j2 = 0;
        while (i5 < valueOf3) {
            int i6 = bArr[i5] - b3;
            if (i6 < 0 || i6 > 9) {
                if (z && i5 > onXdkEvent2 + 1) {
                    toString(jsonReader, onXdkEvent2, valueOf3, "Leading zero is not allowed");
                }
                return (b2 == 43 && i5 > onXdkEvent2 + 1 && jsonReader.valueOf(i5, valueOf3)) ? j2 : (b2 == 43 || i5 <= onXdkEvent2 || !jsonReader.valueOf(i5, valueOf3)) ? ag$a(jsonReader, onXdkEvent2, valueOf3) : j2;
            }
            j2 = (j2 << 3) + (j2 << 1) + i6;
            if (j2 < 0) {
                toString(jsonReader, onXdkEvent2, valueOf3, "Long overflow detected");
            }
            i5++;
            b3 = 48;
        }
        if (z && i5 > onXdkEvent2 + 1) {
            toString(jsonReader, onXdkEvent2, valueOf3, "Leading zero is not allowed");
        }
        return j2;
    }

    private static long ag$a(JsonReader jsonReader, int i, int i2) throws IOException {
        int i3 = i2 - i;
        char[] ah$a2 = jsonReader.ah$a(i, i3);
        if (i3 > 0 && ah$a2[i3 - 1] == '.') {
            toString(jsonReader, i, i2, "Number ends with a dot");
        }
        BigDecimal ag$a2 = ag$a(ah$a2, i3, jsonReader, false);
        if (ag$a2.scale() > 0) {
            ah$a(jsonReader, i, i2, "Expecting long, but found decimal value ", ag$a2);
        }
        return ag$a2.longValue();
    }

    public static BigDecimal valueOf(JsonReader jsonReader) throws IOException {
        if (jsonReader.HaptikSDK$a() == 34) {
            return ag$a(jsonReader.toString, jsonReader.HaptikSDK$c(), jsonReader, true);
        }
        int onXdkEvent2 = jsonReader.onXdkEvent();
        int valueOf2 = jsonReader.valueOf();
        if (valueOf2 == jsonReader.ah$b()) {
            getReceiveContentMimeTypes$ag$a ag$a2 = ag$a(jsonReader, onXdkEvent2);
            return ag$a(ag$a2.valueOf, ag$a2.ag$a, jsonReader, false);
        }
        int i = valueOf2 - onXdkEvent2;
        if (i > 18) {
            return ag$a(jsonReader.ah$a(onXdkEvent2, i), i, jsonReader, false);
        }
        byte[] bArr = jsonReader.values;
        if (bArr[onXdkEvent2] == 45) {
            return values(bArr, jsonReader, onXdkEvent2, valueOf2);
        }
        return ah$a(bArr, jsonReader, onXdkEvent2, valueOf2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
        toString(r20, r21, r22, "Digit not found");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.math.BigDecimal ah$a(byte[] r19, com.bugsnag.android.repackaged.dslplatform.json.JsonReader r20, int r21, int r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getReceiveContentMimeTypes.ah$a(byte[], com.bugsnag.android.repackaged.dslplatform.json.JsonReader, int, int):java.math.BigDecimal");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
        toString(r21, r22, r23, "Digit not found");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.math.BigDecimal values(byte[] r20, com.bugsnag.android.repackaged.dslplatform.json.JsonReader r21, int r22, int r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getReceiveContentMimeTypes.values(byte[], com.bugsnag.android.repackaged.dslplatform.json.JsonReader, int, int):java.math.BigDecimal");
    }

    private static Number valueOf(BigDecimal bigDecimal, JsonReader.UnknownNumberParsing unknownNumberParsing) {
        return unknownNumberParsing == JsonReader.UnknownNumberParsing.LONG_AND_BIGDECIMAL ? bigDecimal : Double.valueOf(bigDecimal.doubleValue());
    }

    private static Number ag$a(char[] cArr, int i, JsonReader jsonReader) throws IOException {
        BigDecimal ag$a2 = ag$a(cArr, i, jsonReader, false);
        if (ag$a2.scale() == 0 && ag$a2.precision() <= 19) {
            if (ag$a2.signum() == 1) {
                if (ag$a2.compareTo(extraCommand) <= 0) {
                    return Long.valueOf(ag$a2.longValue());
                }
            } else if (ag$a2.compareTo(getInterfaceDescriptor) >= 0) {
                return Long.valueOf(ag$a2.longValue());
            }
        }
        return valueOf(ag$a2, jsonReader.ah$b);
    }

    public static Number ah$b(JsonReader jsonReader) throws IOException {
        if (jsonReader.ah$b == JsonReader.UnknownNumberParsing.BIGDECIMAL) {
            return valueOf(jsonReader);
        }
        if (jsonReader.ah$b == JsonReader.UnknownNumberParsing.DOUBLE) {
            return Double.valueOf(ag$a(jsonReader));
        }
        int onXdkEvent2 = jsonReader.onXdkEvent();
        int valueOf2 = jsonReader.valueOf();
        if (valueOf2 == jsonReader.ah$b()) {
            getReceiveContentMimeTypes$ag$a ag$a2 = ag$a(jsonReader, onXdkEvent2);
            return ag$a(ag$a2.valueOf, ag$a2.ag$a, jsonReader);
        }
        int i = valueOf2 - onXdkEvent2;
        if (i > 18) {
            return ag$a(jsonReader.ah$a(onXdkEvent2, i), i, jsonReader);
        }
        byte[] bArr = jsonReader.values;
        if (bArr[onXdkEvent2] == 45) {
            return valueOf(bArr, jsonReader, onXdkEvent2, valueOf2);
        }
        return ag$a(bArr, jsonReader, onXdkEvent2, valueOf2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
        toString(r19, r20, r21, "Digit not found");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Number ag$a(byte[] r18, com.bugsnag.android.repackaged.dslplatform.json.JsonReader r19, int r20, int r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getReceiveContentMimeTypes.ag$a(byte[], com.bugsnag.android.repackaged.dslplatform.json.JsonReader, int, int):java.lang.Number");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0063, code lost:
        toString(r20, r21, r22, "Digit not found");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Number valueOf(byte[] r19, com.bugsnag.android.repackaged.dslplatform.json.JsonReader r20, int r21, int r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getReceiveContentMimeTypes.valueOf(byte[], com.bugsnag.android.repackaged.dslplatform.json.JsonReader, int, int):java.lang.Number");
    }
}
