package o;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o.updateBounds;
import org.apache.http.client.methods.HttpHead;
/* loaded from: classes3.dex */
public final class SplashScreen$Impl31$hierarchyListener$1 {
    public final String HaptikSDK$a;
    public final Uri HaptikSDK$b;
    public final long HaptikSDK$c;
    public final int ag$a;
    public final byte[] ah$a;
    public final long ah$b;
    public final long getSignupData;
    public final Map<String, String> invoke;
    public final int toString;
    @Deprecated
    public final long valueOf;
    public final Object values;

    static {
        updateBounds.Cdefault.valueOf("goog.exo.datasource");
    }

    /* loaded from: classes3.dex */
    public static final class toString {
        private String HaptikSDK$a;
        private Uri HaptikSDK$b;
        private long HaptikSDK$c;
        private Object ag$a;
        private byte[] ah$a;
        private long ah$b;
        private long invoke;
        private Map<String, String> toString;
        private int valueOf;
        private int values;

        public toString() {
            this.values = 1;
            this.toString = Collections.emptyMap();
            this.invoke = -1L;
        }

        private toString(SplashScreen$Impl31$hierarchyListener$1 splashScreen$Impl31$hierarchyListener$1) {
            this.HaptikSDK$b = splashScreen$Impl31$hierarchyListener$1.HaptikSDK$b;
            this.ah$b = splashScreen$Impl31$hierarchyListener$1.getSignupData;
            this.values = splashScreen$Impl31$hierarchyListener$1.ag$a;
            this.ah$a = splashScreen$Impl31$hierarchyListener$1.ah$a;
            this.toString = splashScreen$Impl31$hierarchyListener$1.invoke;
            this.HaptikSDK$c = splashScreen$Impl31$hierarchyListener$1.HaptikSDK$c;
            this.invoke = splashScreen$Impl31$hierarchyListener$1.ah$b;
            this.HaptikSDK$a = splashScreen$Impl31$hierarchyListener$1.HaptikSDK$a;
            this.valueOf = splashScreen$Impl31$hierarchyListener$1.toString;
            this.ag$a = splashScreen$Impl31$hierarchyListener$1.values;
        }

        public toString ah$a(String str) {
            this.HaptikSDK$b = Uri.parse(str);
            return this;
        }

        public toString ag$a(Uri uri) {
            this.HaptikSDK$b = uri;
            return this;
        }

        public toString values(int i) {
            this.values = i;
            return this;
        }

        public toString values(byte[] bArr) {
            this.ah$a = bArr;
            return this;
        }

        public toString ah$a(Map<String, String> map) {
            this.toString = map;
            return this;
        }

        public toString toString(long j) {
            this.HaptikSDK$c = j;
            return this;
        }

        public toString valueOf(long j) {
            this.invoke = j;
            return this;
        }

        public toString toString(String str) {
            this.HaptikSDK$a = str;
            return this;
        }

        public toString ag$a(int i) {
            this.valueOf = i;
            return this;
        }

        public SplashScreen$Impl31$hierarchyListener$1 values() {
            FingerprintManagerCompat.ah$a(this.HaptikSDK$b, "The uri must be set.");
            return new SplashScreen$Impl31$hierarchyListener$1(this.HaptikSDK$b, this.ah$b, this.values, this.ah$a, this.toString, this.HaptikSDK$c, this.invoke, this.HaptikSDK$a, this.valueOf, this.ag$a);
        }
    }

    public static String ah$a(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return HttpHead.METHOD_NAME;
                }
                throw new IllegalStateException();
            }
            return "POST";
        }
        return "GET";
    }

    public SplashScreen$Impl31$hierarchyListener$1(Uri uri) {
        this(uri, 0L, -1L);
    }

    public SplashScreen$Impl31$hierarchyListener$1(Uri uri, long j, long j2) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j, j2, null, 0, null);
    }

    private SplashScreen$Impl31$hierarchyListener$1(Uri uri, long j, int i, byte[] bArr, Map<String, String> map, long j2, long j3, String str, int i2, Object obj) {
        byte[] bArr2 = bArr;
        long j4 = j + j2;
        boolean z = false;
        FingerprintManagerCompat.toString(j4 >= 0);
        FingerprintManagerCompat.toString(j2 >= 0);
        FingerprintManagerCompat.toString((j3 > 0 || j3 == -1) ? true : true);
        this.HaptikSDK$b = uri;
        this.getSignupData = j;
        this.ag$a = i;
        this.ah$a = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.invoke = Collections.unmodifiableMap(new HashMap(map));
        this.HaptikSDK$c = j2;
        this.valueOf = j4;
        this.ah$b = j3;
        this.HaptikSDK$a = str;
        this.toString = i2;
        this.values = obj;
    }

    public boolean valueOf(int i) {
        return (this.toString & i) == i;
    }

    public final String ag$a() {
        return ah$a(this.ag$a);
    }

    public toString valueOf() {
        return new toString();
    }

    public SplashScreen$Impl31$hierarchyListener$1 valueOf(long j) {
        long j2 = this.ah$b;
        return ah$a(j, j2 != -1 ? j2 - j : -1L);
    }

    public SplashScreen$Impl31$hierarchyListener$1 ah$a(long j, long j2) {
        return (j == 0 && this.ah$b == j2) ? this : new SplashScreen$Impl31$hierarchyListener$1(this.HaptikSDK$b, this.getSignupData, this.ag$a, this.ah$a, this.invoke, this.HaptikSDK$c + j, j2, this.HaptikSDK$a, this.toString, this.values);
    }

    public String toString() {
        return "DataSpec[" + ag$a() + com.dreampay.commons.constants.Constants.WHITE_SPACE + this.HaptikSDK$b + ", " + this.HaptikSDK$c + ", " + this.ah$b + ", " + this.HaptikSDK$a + ", " + this.toString + "]";
    }
}
