package o;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.apache.http.message.TokenParser;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class getRegionAt {
    private static int HaptikSDK$a = 142194204;
    private static int HaptikSDK$d = 0;
    private static byte[] HaptikSDK$e = {-46, 0};
    private static int HaptikWebView = 93;
    private static int aj$a = 1;
    private static int getInitSettings = -119047474;
    private static short[] getSignupData;
    private JSONObject HaptikSDK$b;
    private String HaptikSDK$c;
    private long ag$a;
    private String ah$a;
    private List<String> ah$b;
    private boolean invoke;
    private String toString;
    private long valueOf;
    private JSONObject values;

    public getRegionAt() {
        this.ah$b = new ArrayList();
    }

    private getRegionAt(String str, JSONObject jSONObject, boolean z, long j, long j2, String str2, List<String> list, String str3, JSONObject jSONObject2) {
        try {
            this.ah$b = new ArrayList();
            this.toString = str;
            this.values = jSONObject;
            this.invoke = z;
            this.ag$a = j;
            this.valueOf = j2;
            this.HaptikSDK$c = str2;
            this.ah$b = list;
            this.ah$a = str3;
            this.HaptikSDK$b = jSONObject2;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
        if ((!r0.HaptikWebView()) != true) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean values() {
        /*
            r5 = this;
            java.lang.String r0 = "CTMessageDAO:containsVideoOrAudio() called"
            o.setBoundsInScreen.ag$a(r0)
            com.clevertap.android.sdk.inbox.CTInboxMessage r0 = new com.clevertap.android.sdk.inbox.CTInboxMessage
            org.json.JSONObject r1 = r5.getInitSettings()
            r0.<init>(r1)
            java.util.ArrayList r0 = r0.invoke()
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.clevertap.android.sdk.inbox.CTInboxMessageContent r0 = (com.clevertap.android.sdk.inbox.CTInboxMessageContent) r0
            boolean r2 = r0.HaptikSDK$d()
            r3 = 1
            if (r2 != 0) goto L22
            r2 = 1
            goto L23
        L22:
            r2 = 0
        L23:
            if (r2 == 0) goto L3a
            int r2 = o.getRegionAt.HaptikSDK$d
            int r2 = r2 + 55
            int r4 = r2 % 128
            o.getRegionAt.aj$a = r4
            int r2 = r2 % 2
            boolean r0 = r0.HaptikWebView()     // Catch: java.lang.Exception -> L4d
            if (r0 == 0) goto L37
            r0 = 0
            goto L38
        L37:
            r0 = 1
        L38:
            if (r0 == r3) goto L3b
        L3a:
            r1 = 1
        L3b:
            int r0 = o.getRegionAt.HaptikSDK$d     // Catch: java.lang.Exception -> L4d
            int r0 = r0 + 79
            int r2 = r0 % 128
            o.getRegionAt.aj$a = r2     // Catch: java.lang.Exception -> L4d
            int r0 = r0 % 2
            if (r0 != 0) goto L4c
            r0 = 0
            int r0 = r0.length     // Catch: java.lang.Throwable -> L4a
            return r1
        L4a:
            r0 = move-exception
            throw r0
        L4c:
            return r1
        L4d:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getRegionAt.values():boolean");
    }

    public String valueOf() {
        int i = HaptikSDK$d + 5;
        aj$a = i % 128;
        if ((i % 2 == 0 ? (char) 20 : 'U') != 20) {
            return this.ah$a;
        }
        try {
            String str = this.ah$a;
            Object obj = null;
            super.hashCode();
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public void toString(String str) {
        try {
            int i = aj$a + 13;
            try {
                HaptikSDK$d = i % 128;
                if ((i % 2 != 0 ? '%' : '&') != '&') {
                    this.ah$a = str;
                    Object obj = null;
                    super.hashCode();
                    return;
                }
                this.ah$a = str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public long ag$a() {
        int i = HaptikSDK$d + 41;
        aj$a = i % 128;
        int i2 = i % 2;
        long j = this.ag$a;
        try {
            int i3 = HaptikSDK$d + 79;
            aj$a = i3 % 128;
            int i4 = i3 % 2;
            return j;
        } catch (Exception e) {
            throw e;
        }
    }

    public void toString(long j) {
        int i = HaptikSDK$d + 3;
        aj$a = i % 128;
        int i2 = i % 2;
        this.ag$a = j;
        int i3 = HaptikSDK$d + 15;
        aj$a = i3 % 128;
        if ((i3 % 2 == 0 ? '(' : 'c') != 'c') {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    public long ah$a() {
        int i = aj$a + 73;
        HaptikSDK$d = i % 128;
        int i2 = i % 2;
        long j = this.valueOf;
        int i3 = HaptikSDK$d + 83;
        aj$a = i3 % 128;
        int i4 = i3 % 2;
        return j;
    }

    public void ah$a(long j) {
        int i = aj$a + 61;
        HaptikSDK$d = i % 128;
        int i2 = i % 2;
        try {
            this.valueOf = j;
            int i3 = aj$a + 69;
            HaptikSDK$d = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                super.hashCode();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public String HaptikSDK$c() {
        String str;
        try {
            int i = HaptikSDK$d + 27;
            aj$a = i % 128;
            if (!(i % 2 != 0)) {
                str = this.toString;
                int i2 = 4 / 0;
            } else {
                str = this.toString;
            }
            int i3 = HaptikSDK$d + 93;
            aj$a = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public void ag$a(String str) {
        try {
            int i = HaptikSDK$d + 9;
            aj$a = i % 128;
            if ((i % 2 == 0 ? TokenParser.CR : (char) 1) != 1) {
                try {
                    this.toString = str;
                    Object[] objArr = null;
                    int length = objArr.length;
                } catch (Exception e) {
                    throw e;
                }
            } else {
                this.toString = str;
            }
            int i2 = aj$a + 43;
            HaptikSDK$d = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            int i3 = 64 / 0;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public JSONObject ah$b() {
        try {
            int i = aj$a + 13;
            try {
                HaptikSDK$d = i % 128;
                int i2 = i % 2;
                JSONObject jSONObject = this.values;
                int i3 = aj$a + 85;
                HaptikSDK$d = i3 % 128;
                int i4 = i3 % 2;
                return jSONObject;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public void toString(JSONObject jSONObject) {
        int i = HaptikSDK$d + 121;
        aj$a = i % 128;
        int i2 = i % 2;
        this.values = jSONObject;
        int i3 = aj$a + 61;
        HaptikSDK$d = i3 % 128;
        if ((i3 % 2 != 0 ? '+' : 'A') != 'A') {
            Object obj = null;
            super.hashCode();
        }
    }

    public String HaptikSDK$a() {
        int i = aj$a + 17;
        HaptikSDK$d = i % 128;
        int i2 = i % 2;
        try {
            String join = TextUtils.join(",", this.ah$b);
            try {
                int i3 = HaptikSDK$d + 1;
                aj$a = i3 % 128;
                if ((i3 % 2 == 0 ? 'T' : (char) 7) != 'T') {
                    return join;
                }
                Object obj = null;
                super.hashCode();
                return join;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public void values(String str) {
        int i = aj$a + 77;
        HaptikSDK$d = i % 128;
        if ((i % 2 == 0 ? 'L' : 'M') != 'L') {
            this.ah$b.addAll(Arrays.asList(str.split(",")));
            int i2 = 51 / 0;
        } else {
            try {
                this.ah$b.addAll(Arrays.asList(str.split(",")));
            } catch (Exception e) {
                throw e;
            }
        }
        int i3 = HaptikSDK$d + 59;
        aj$a = i3 % 128;
        if ((i3 % 2 == 0 ? 'Q' : TokenParser.ESCAPE) != '\\') {
            Object obj = null;
            super.hashCode();
        }
    }

    public String invoke() {
        int i = aj$a + 45;
        HaptikSDK$d = i % 128;
        if ((i % 2 != 0 ? 'E' : 'b') != 'b') {
            String str = this.HaptikSDK$c;
            Object[] objArr = null;
            int length = objArr.length;
            return str;
        }
        return this.HaptikSDK$c;
    }

    public void valueOf(String str) {
        int i = aj$a + 125;
        HaptikSDK$d = i % 128;
        int i2 = i % 2;
        this.HaptikSDK$c = str;
        int i3 = HaptikSDK$d + 77;
        aj$a = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
    }

    public JSONObject HaptikSDK$b() {
        int i = HaptikSDK$d + 55;
        aj$a = i % 128;
        int i2 = i % 2;
        try {
            JSONObject jSONObject = this.HaptikSDK$b;
            int i3 = HaptikSDK$d + 83;
            aj$a = i3 % 128;
            int i4 = i3 % 2;
            return jSONObject;
        } catch (Exception e) {
            throw e;
        }
    }

    public void valueOf(JSONObject jSONObject) {
        try {
            int i = HaptikSDK$d + 121;
            aj$a = i % 128;
            boolean z = i % 2 == 0;
            this.HaptikSDK$b = jSONObject;
            if (!z) {
                return;
            }
            Object[] objArr = null;
            int length = objArr.length;
        } catch (Exception e) {
            throw e;
        }
    }

    public int HaptikSDK$d() {
        try {
            int i = aj$a + 43;
            HaptikSDK$d = i % 128;
            Object[] objArr = null;
            if ((i % 2 != 0 ? (char) 21 : TokenParser.SP) != 21) {
                try {
                    if ((this.invoke ? '!' : (char) 19) != 19) {
                        return 1;
                    }
                } catch (Exception e) {
                    throw e;
                }
            } else {
                boolean z = this.invoke;
                super.hashCode();
                if (z) {
                    return 1;
                }
            }
            int i2 = aj$a + 33;
            HaptikSDK$d = i2 % 128;
            if ((i2 % 2 != 0 ? '9' : '`') != '`') {
                int length = objArr.length;
                return 0;
            }
            return 0;
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
        if (r5 == 1) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void toString(int r5) {
        /*
            r4 = this;
            int r0 = o.getRegionAt.aj$a
            int r0 = r0 + 31
            int r1 = r0 % 128
            o.getRegionAt.HaptikSDK$d = r1
            int r0 = r0 % 2
            r1 = 65
            if (r0 == 0) goto L11
            r0 = 65
            goto L13
        L11:
            r0 = 76
        L13:
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L1a
            if (r5 != r2) goto L28
            goto L1d
        L1a:
            if (r5 != 0) goto L28
            r2 = 0
        L1d:
            int r5 = o.getRegionAt.aj$a
            int r5 = r5 + 51
            int r0 = r5 % 128
            o.getRegionAt.HaptikSDK$d = r0
            int r5 = r5 % 2
            r3 = r2
        L28:
            r4.invoke = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getRegionAt.toString(int):void");
    }

    public JSONObject getInitSettings() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ag$a((byte) (41 - (ViewConfiguration.getPressedStateDuration() >> 16)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 91, 34251 - AndroidCharacter.getMirror('0'), (short) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), ExpandableListView.getPackedPositionChild(0L) - 142194203).intern(), this.toString);
            jSONObject.put(androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, this.values);
            jSONObject.put("isRead", this.invoke);
            jSONObject.put("date", this.ag$a);
            jSONObject.put("wzrk_ttl", this.valueOf);
            JSONArray jSONArray = new JSONArray();
            int i = 0;
            while (true) {
                if ((i < this.ah$b.size() ? 'B' : (char) 26) != 'B') {
                    break;
                }
                int i2 = aj$a + 101;
                HaptikSDK$d = i2 % 128;
                if (i2 % 2 != 0) {
                    jSONArray.put(this.ah$b.get(i));
                    i += 90;
                } else {
                    jSONArray.put(this.ah$b.get(i));
                    i++;
                }
            }
            jSONObject.put("tags", jSONArray);
            jSONObject.put("wzrk_id", this.ah$a);
            jSONObject.put("wzrkParams", this.HaptikSDK$b);
            int i3 = HaptikSDK$d + 99;
            aj$a = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 91 / 0;
                return jSONObject;
            }
            return jSONObject;
        } catch (JSONException e) {
            setBoundsInScreen.values("Unable to convert CTMessageDao to JSON - " + e.getLocalizedMessage());
            return jSONObject;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static getRegionAt toString(JSONObject jSONObject, String str) {
        long currentTimeMillis;
        JSONObject jSONObject2;
        try {
            int i = 0;
            String string = !jSONObject.has("_id") ? null : jSONObject.getString("_id");
            long j = jSONObject.has("date") ? jSONObject.getInt("date") : System.currentTimeMillis() / 1000;
            if ((jSONObject.has("wzrk_ttl") ? '9' : 'J') == 'J') {
                currentTimeMillis = (System.currentTimeMillis() + 86400000) / 1000;
            } else {
                int i2 = aj$a + 49;
                HaptikSDK$d = i2 % 128;
                if (i2 % 2 != 0) {
                    currentTimeMillis = jSONObject.getInt("wzrk_ttl");
                    int i3 = 52 / 0;
                } else {
                    currentTimeMillis = jSONObject.getInt("wzrk_ttl");
                }
            }
            long j2 = currentTimeMillis;
            if (jSONObject.has(androidx.core.app.NotificationCompat.CATEGORY_MESSAGE)) {
                JSONObject jSONObject3 = jSONObject.getJSONObject(androidx.core.app.NotificationCompat.CATEGORY_MESSAGE);
                int i4 = aj$a + 115;
                HaptikSDK$d = i4 % 128;
                int i5 = i4 % 2;
                jSONObject2 = jSONObject3;
            } else {
                jSONObject2 = null;
            }
            ArrayList arrayList = new ArrayList();
            if (jSONObject2 != null) {
                JSONArray jSONArray = jSONObject2.has("tags") ? jSONObject2.getJSONArray("tags") : null;
                if (jSONArray != null) {
                    try {
                        int i6 = HaptikSDK$d + 13;
                        aj$a = i6 % 128;
                        int i7 = i6 % 2;
                        while (true) {
                            if ((i < jSONArray.length() ? '/' : TokenParser.CR) != '/') {
                                break;
                            }
                            int i8 = aj$a + 27;
                            HaptikSDK$d = i8 % 128;
                            if (i8 % 2 != 0) {
                                arrayList.add(jSONArray.getString(i));
                                i += 24;
                            } else {
                                arrayList.add(jSONArray.getString(i));
                                i++;
                            }
                        }
                    } catch (Exception e) {
                        throw e;
                    }
                }
            }
            String string2 = (jSONObject.has("wzrk_id") ? (char) 1 : '!') != '!' ? jSONObject.getString("wzrk_id") : "0_0";
            if (string2.equalsIgnoreCase("0_0")) {
                jSONObject.put("wzrk_id", string2);
            }
            JSONObject values = values(jSONObject);
            if (string == null) {
                return null;
            }
            return new getRegionAt(string, jSONObject2, false, j, j2, str, arrayList, string2, values);
        } catch (JSONException e2) {
            setBoundsInScreen.ag$a("Unable to parse Notification inbox message to CTMessageDao - " + e2.getLocalizedMessage());
            return null;
        }
    }

    private static JSONObject values(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        int i = HaptikSDK$d + 99;
        aj$a = i % 128;
        int i2 = i % 2;
        while (true) {
            try {
                if (!(keys.hasNext())) {
                    try {
                        int i3 = HaptikSDK$d + 53;
                        aj$a = i3 % 128;
                        int i4 = i3 % 2;
                        return jSONObject2;
                    } catch (Exception e) {
                        throw e;
                    }
                }
                String next = keys.next();
                if ((next.startsWith("wzrk_") ? 'M' : '*') != '*') {
                    int i5 = aj$a + 101;
                    HaptikSDK$d = i5 % 128;
                    int i6 = i5 % 2;
                    jSONObject2.put(next, jSONObject.get(next));
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    private static String ag$a(byte b2, int i, int i2, short s, int i3) {
        String obj;
        synchronized (moveToLast.ah$a) {
            StringBuilder sb = new StringBuilder();
            int i4 = i + HaptikWebView;
            boolean z = i4 == -1;
            if (z) {
                if (HaptikSDK$e != null) {
                    i4 = (byte) (HaptikSDK$e[HaptikSDK$a + i3] + HaptikWebView);
                } else {
                    i4 = (short) (getSignupData[HaptikSDK$a + i3] + HaptikWebView);
                }
            }
            if (i4 > 0) {
                moveToLast.values = ((i3 + i4) - 2) + HaptikSDK$a + (z ? 1 : 0);
                moveToLast.ag$a = (char) (i2 + getInitSettings);
                sb.append(moveToLast.ag$a);
                moveToLast.toString = moveToLast.ag$a;
                moveToLast.valueOf = 1;
                while (moveToLast.valueOf < i4) {
                    if (HaptikSDK$e != null) {
                        byte[] bArr = HaptikSDK$e;
                        int i5 = moveToLast.values;
                        moveToLast.values = i5 - 1;
                        moveToLast.ag$a = (char) (moveToLast.toString + (((byte) (bArr[i5] + s)) ^ b2));
                    } else {
                        short[] sArr = getSignupData;
                        int i6 = moveToLast.values;
                        moveToLast.values = i6 - 1;
                        moveToLast.ag$a = (char) (moveToLast.toString + (((short) (sArr[i6] + s)) ^ b2));
                    }
                    sb.append(moveToLast.ag$a);
                    moveToLast.toString = moveToLast.ag$a;
                    moveToLast.valueOf++;
                }
            }
            obj = sb.toString();
        }
        return obj;
    }
}
