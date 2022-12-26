package o;

import android.content.Context;
import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.net.URLDecoder;
import java.util.Iterator;
import o.AccessibilityViewCommand;
import org.apache.http.message.TokenParser;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class EditorInfoCompat extends AccessibilityViewCommand.SetProgressArguments {
    private final AccessibilityViewCommand.ScrollToPositionArguments ag$a;
    private final isLongClickable ah$a;
    private final setBoundsInScreen toString;
    private final isShowingHintText valueOf;
    private final CleverTapInstanceConfig values;

    /* loaded from: classes4.dex */
    public final class Api30Impl {
        private static int ag$a = 0;
        private static char ah$a = 0;
        private static long toString = -5199020364986485437L;
        private static int valueOf = 0;
        private static int values = 1;

        public static Bundle valueOf(String str, boolean z) {
            if (str == null) {
                return new Bundle();
            }
            Bundle bundle = new Bundle();
            try {
                UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
                urlQuerySanitizer.setAllowUnregisteredParamaters(true);
                urlQuerySanitizer.setUnregisteredParameterValueSanitizer(UrlQuerySanitizer.getAllButNulLegal());
                urlQuerySanitizer.parseUrl(str);
                Iterator<String> it = urlQuerySanitizer.getParameterSet().iterator();
                while (true) {
                    if (!(it.hasNext())) {
                        break;
                    }
                    String next = it.next();
                    String ag$a2 = ag$a(next, urlQuerySanitizer, false);
                    if ((ag$a2 != null ? '9' : (char) 28) != 28) {
                        int i = values + 79;
                        ag$a = i % 128;
                        int i2 = i % 2;
                        if (!(z)) {
                            if (next.equals("wzrk_c2a")) {
                                int i3 = values + 103;
                                ag$a = i3 % 128;
                                int i4 = i3 % 2;
                            } else {
                                bundle.putString(next, URLDecoder.decode(ag$a2, "UTF-8"));
                            }
                        }
                        bundle.putString(next, ag$a2);
                        int i5 = ag$a + 41;
                        values = i5 % 128;
                        int i6 = i5 % 2;
                    }
                }
            } catch (Throwable unused) {
            }
            return bundle;
        }

        public static JSONObject values(Uri uri) {
            JSONObject jSONObject = new JSONObject();
            try {
                UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
                urlQuerySanitizer.setAllowUnregisteredParamaters(true);
                urlQuerySanitizer.parseUrl(uri.toString());
                String ag$a2 = ag$a(valueOf(ViewConfiguration.getKeyRepeatTimeout() >> 16, new char[]{3113, 24717, 11453, 63223}, new char[]{30019, 3317, 24198, 47065}, (char) (TextUtils.lastIndexOf("", '0') + 63277), new char[]{8686, 15066, 9096, 45575, 54549, 4534}).intern(), urlQuerySanitizer);
                String ag$a3 = ag$a("medium", urlQuerySanitizer);
                String ag$a4 = ag$a("campaign", urlQuerySanitizer);
                jSONObject.put("us", ag$a2);
                jSONObject.put("um", ag$a3);
                jSONObject.put("uc", ag$a4);
                String ah$a2 = ah$a("medium", urlQuerySanitizer);
                if (ah$a2 != null) {
                    if (ah$a2.matches("^email$|^social$|^search$")) {
                        int i = ag$a + 75;
                        values = i % 128;
                        int i2 = i % 2;
                        jSONObject.put("wm", ah$a2);
                        int i3 = ag$a + 13;
                        values = i3 % 128;
                        int i4 = i3 % 2;
                    }
                }
                setBoundsInScreen.ag$a("Referrer data: " + jSONObject.toString(4));
            } catch (Throwable unused) {
            }
            int i5 = ag$a + 89;
            values = i5 % 128;
            if (!(i5 % 2 == 0)) {
                return jSONObject;
            }
            Object[] objArr = null;
            int length = objArr.length;
            return jSONObject;
        }

        private static String ag$a(String str, UrlQuerySanitizer urlQuerySanitizer) {
            String valueOf2 = valueOf(str, urlQuerySanitizer);
            if ((valueOf2 == null ? '`' : 'W') == '`') {
                int i = values + 79;
                ag$a = i % 128;
                int i2 = i % 2;
                valueOf2 = ah$a(str, urlQuerySanitizer);
                if (valueOf2 == null) {
                    int i3 = values + 13;
                    ag$a = i3 % 128;
                    if ((i3 % 2 != 0 ? 'R' : TokenParser.CR) != '\r') {
                        int i4 = 81 / 0;
                        return null;
                    }
                    return null;
                }
            }
            return valueOf2;
        }

        private static String valueOf(String str, UrlQuerySanitizer urlQuerySanitizer) {
            String ag$a2 = ag$a("utm_" + str, urlQuerySanitizer, true);
            int i = ag$a + 45;
            values = i % 128;
            if ((i % 2 == 0 ? 'K' : (char) 24) != 'K') {
                return ag$a2;
            }
            Object[] objArr = null;
            int length = objArr.length;
            return ag$a2;
        }

        private static String ag$a(String str, UrlQuerySanitizer urlQuerySanitizer, boolean z) {
            int i = ag$a + 103;
            values = i % 128;
            int i2 = i % 2;
            if (str != null) {
                int i3 = ag$a + 69;
                values = i3 % 128;
                int i4 = i3 % 2;
                if (urlQuerySanitizer != null) {
                    try {
                        String value = urlQuerySanitizer.getValue(str);
                        if (!(value == null)) {
                            return ((!z) || value.length() <= 120) ? value : value.substring(0, 120);
                        }
                        int i5 = ag$a + 105;
                        values = i5 % 128;
                        int i6 = i5 % 2;
                        return null;
                    } catch (Throwable th) {
                        setBoundsInScreen.valueOf("Couldn't parse the URI", th);
                    }
                }
            }
            return null;
        }

        private static String ah$a(String str, UrlQuerySanitizer urlQuerySanitizer) {
            StringBuilder sb = new StringBuilder();
            try {
                sb.append("wzrk_");
                sb.append(str);
                String ag$a2 = ag$a(sb.toString(), urlQuerySanitizer, true);
                int i = values + 69;
                ag$a = i % 128;
                if (i % 2 == 0) {
                    return ag$a2;
                }
                Object[] objArr = null;
                int length = objArr.length;
                return ag$a2;
            } catch (Exception e) {
                throw e;
            }
        }

        private static String valueOf(int i, char[] cArr, char[] cArr2, char c, char[] cArr3) {
            String str;
            synchronized (getShort.toString) {
                char[] cArr4 = (char[]) cArr.clone();
                char[] cArr5 = (char[]) cArr2.clone();
                cArr4[0] = (char) (c ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i));
                int length = cArr3.length;
                char[] cArr6 = new char[length];
                getShort.valueOf = 0;
                while (getShort.valueOf < length) {
                    int i2 = (getShort.valueOf + 2) % 4;
                    int i3 = (getShort.valueOf + 3) % 4;
                    getShort.values = (char) (((cArr4[getShort.valueOf % 4] * 32718) + cArr5[i2]) % 65535);
                    cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / 65535);
                    cArr4[i3] = getShort.values;
                    cArr6[getShort.valueOf] = (char) ((((cArr4[i3] ^ cArr3[getShort.valueOf]) ^ toString) ^ valueOf) ^ ah$a);
                    getShort.valueOf++;
                }
                str = new String(cArr6);
            }
            return str;
        }
    }

    public EditorInfoCompat(AccessibilityViewCommand.ScrollToPositionArguments scrollToPositionArguments, CleverTapInstanceConfig cleverTapInstanceConfig, isShowingHintText isshowinghinttext, isLongClickable islongclickable) {
        this.ag$a = scrollToPositionArguments;
        this.values = cleverTapInstanceConfig;
        this.toString = cleverTapInstanceConfig.HaptikSDK$c();
        this.valueOf = isshowinghinttext;
        this.ah$a = islongclickable;
    }

    @Override // o.AccessibilityViewCommand.ScrollToPositionArguments
    public void values(JSONObject jSONObject, String str, Context context) {
        this.toString.ah$a(this.values.valueOf(), "Processing Product Config response...");
        if (this.values.HaptikSDK$d()) {
            this.toString.ah$a(this.values.valueOf(), "CleverTap instance is configured to analytics only, not processing Product Config response");
            this.ag$a.values(jSONObject, str, context);
        } else if (jSONObject == null) {
            this.toString.ah$a(this.values.valueOf(), "Product Config : Can't parse Product Config Response, JSON response object is null");
            ah$a();
        } else if (!jSONObject.has("pc_notifs")) {
            this.toString.ah$a(this.values.valueOf(), "Product Config : JSON object doesn't contain the Product Config key");
            ah$a();
            this.ag$a.values(jSONObject, str, context);
        } else {
            try {
                this.toString.ah$a(this.values.valueOf(), "Product Config : Processing Product Config response");
                valueOf(jSONObject.getJSONObject("pc_notifs"));
            } catch (Throwable th) {
                ah$a();
                this.toString.values(this.values.valueOf(), "Product Config : Failed to parse Product Config response", th);
            }
            this.ag$a.values(jSONObject, str, context);
        }
    }

    private void ah$a() {
        if (this.valueOf.getDefaultImpl()) {
            if (this.ah$a.values() != null) {
                this.ah$a.values().getSignupData();
            }
            this.valueOf.HaptikSDK$a(false);
        }
    }

    private void valueOf(JSONObject jSONObject) throws JSONException {
        if (jSONObject.getJSONArray("kv") != null && this.ah$a.values() != null) {
            this.ah$a.values().ag$a(jSONObject);
        } else {
            ah$a();
        }
    }
}
