package o;

import android.util.Log;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.sendbird.android.constant.StringSet;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public interface IResultReceiver<V> {
    V ag$a(JsonReader jsonReader, float f) throws IOException;

    /* loaded from: classes.dex */
    public final class Stub {

        /* loaded from: classes.dex */
        public class Proxy implements setQueue {
            private static final Set<String> valueOf = new HashSet();

            @Override // o.setQueue
            public void valueOf(String str) {
                ah$a(str, null);
            }

            public void ah$a(String str, Throwable th) {
                if (skipToNext.valueOf) {
                    Log.d("LOTTIE", str, th);
                }
            }

            @Override // o.setQueue
            public void toString(String str) {
                ag$a(str, null);
            }

            @Override // o.setQueue
            public void ag$a(String str, Throwable th) {
                Set<String> set = valueOf;
                if (set.contains(str)) {
                    return;
                }
                Log.w("LOTTIE", str, th);
                set.add(str);
            }

            @Override // o.setQueue
            public void toString(String str, Throwable th) {
                if (skipToNext.valueOf) {
                    Log.d("LOTTIE", str, th);
                }
            }
        }

        public static String ah$a(int i, int[] iArr, String[] strArr, int[] iArr2) {
            StringBuilder sb = new StringBuilder();
            sb.append('$');
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = iArr[i2];
                if (i3 == 1 || i3 == 2) {
                    sb.append('[');
                    sb.append(iArr2[i2]);
                    sb.append(']');
                } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                    sb.append('.');
                    if (strArr[i2] != null) {
                        sb.append(strArr[i2]);
                    }
                }
            }
            return sb.toString();
        }
    }

    /* loaded from: classes.dex */
    public class Default {
        private static final JsonReader.values values = JsonReader.values.toString(StringSet.s, "e", "o", "nm", "m", "hd");

        public static ShapeTrimPath ah$a(JsonReader jsonReader, ensureClassLoader ensureclassloader) throws IOException {
            String str = null;
            ShapeTrimPath.Type type = null;
            sendExtras sendextras = null;
            sendExtras sendextras2 = null;
            sendExtras sendextras3 = null;
            boolean z = false;
            while (jsonReader.HaptikSDK$a()) {
                int valueOf = jsonReader.valueOf(values);
                if (valueOf == 0) {
                    sendextras = getCurrentPosition.valueOf(jsonReader, ensureclassloader, false);
                } else if (valueOf == 1) {
                    sendextras2 = getCurrentPosition.valueOf(jsonReader, ensureclassloader, false);
                } else if (valueOf == 2) {
                    sendextras3 = getCurrentPosition.valueOf(jsonReader, ensureclassloader, false);
                } else if (valueOf == 3) {
                    str = jsonReader.getInitSettings();
                } else if (valueOf == 4) {
                    type = ShapeTrimPath.Type.forId(jsonReader.HaptikSDK$c());
                } else if (valueOf == 5) {
                    z = jsonReader.HaptikSDK$b();
                } else {
                    jsonReader.getSignupData();
                }
            }
            return new ShapeTrimPath(str, type, sendextras, sendextras2, sendextras3, z);
        }
    }
}
