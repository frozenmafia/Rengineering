package com.clevertap.android.sdk.inbox;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import o.getDouble;
import o.setBoundsInScreen;
import org.apache.commons.codec.language.Soundex;
import org.apache.http.message.TokenParser;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class CTInboxMessageContent implements Parcelable {
    public static final Parcelable.Creator<CTInboxMessageContent> CREATOR;
    private static int HaptikSDK$d = 1;
    private static int[] HaptikSDK$e;
    private static int HaptikWebView;
    private JSONArray HaptikSDK$a;
    private String HaptikSDK$b;
    private String HaptikSDK$c;
    private String ag$a;
    private Boolean ah$a;
    private String ah$b;
    private String getInitSettings;
    private String getSignupData;
    private String invoke;
    private String toString;
    private String valueOf;
    private Boolean values;

    static void aj$a() {
        HaptikSDK$e = new int[]{-1366544808, 1602039115, -1071032440, 1700631215, -399283393, 980536520, -969133533, 1337651509, -1057263624, -2103927265, -1808608985, 906812689, -306495221, -1709034129, 156333627, 2106190000, 53470317, -1751590058};
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        int i = HaptikSDK$d + 21;
        HaptikWebView = i % 128;
        if (i % 2 != 0) {
        }
        try {
            int i2 = HaptikWebView + 103;
            HaptikSDK$d = i2 % 128;
            if ((i2 % 2 == 0 ? '%' : TokenParser.SP) != ' ') {
                Object[] objArr = null;
                int length = objArr.length;
                return 0;
            }
            return 0;
        } catch (Exception e) {
            throw e;
        }
    }

    static {
        aj$a();
        CREATOR = new Parcelable.Creator<CTInboxMessageContent>() { // from class: com.clevertap.android.sdk.inbox.CTInboxMessageContent.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: values */
            public CTInboxMessageContent createFromParcel(Parcel parcel) {
                return new CTInboxMessageContent(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: toString */
            public CTInboxMessageContent[] newArray(int i) {
                return new CTInboxMessageContent[i];
            }
        };
        int i = HaptikSDK$d + 59;
        HaptikWebView = i % 128;
        if (!(i % 2 != 0)) {
            return;
        }
        int i2 = 86 / 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CTInboxMessageContent() {
    }

    protected CTInboxMessageContent(Parcel parcel) {
        boolean z;
        try {
            this.getInitSettings = parcel.readString();
            this.getSignupData = parcel.readString();
            this.invoke = parcel.readString();
            this.HaptikSDK$b = parcel.readString();
            this.HaptikSDK$c = parcel.readString();
            this.ah$a = Boolean.valueOf(parcel.readByte() != 0);
            if ((parcel.readByte() != 0 ? (char) 14 : 'T') != 'T') {
                int i = HaptikSDK$d + 89;
                HaptikWebView = i % 128;
                int i2 = i % 2;
                z = true;
            } else {
                z = false;
            }
            this.values = Boolean.valueOf(z);
            this.valueOf = parcel.readString();
            this.toString = parcel.readString();
            try {
                JSONArray jSONArray = null;
                if (parcel.readByte() == 0) {
                    int i3 = HaptikWebView + 29;
                    HaptikSDK$d = i3 % 128;
                    if (!(i3 % 2 != 0)) {
                        super.hashCode();
                    }
                } else {
                    jSONArray = new JSONArray(parcel.readString());
                }
                this.HaptikSDK$a = jSONArray;
            } catch (JSONException e) {
                setBoundsInScreen.values("Unable to init CTInboxMessageContent with Parcel - " + e.getLocalizedMessage());
            }
            this.ag$a = parcel.readString();
            this.ah$b = parcel.readString();
        } catch (Exception e2) {
            throw e2;
        }
    }

    public String ag$a() {
        String str;
        int i = HaptikSDK$d + 49;
        HaptikWebView = i % 128;
        if ((i % 2 != 0 ? (char) 22 : 'M') != 22) {
            str = this.valueOf;
        } else {
            str = this.valueOf;
            Object obj = null;
            super.hashCode();
        }
        int i2 = HaptikSDK$d + 47;
        HaptikWebView = i2 % 128;
        if ((i2 % 2 != 0 ? (char) 7 : '$') != '$') {
            int i3 = 10 / 0;
            return str;
        }
        return str;
    }

    public String values() {
        try {
            int i = HaptikSDK$d + 63;
            try {
                HaptikWebView = i % 128;
                if ((i % 2 != 0 ? '$' : ')') != ')') {
                    int i2 = 40 / 0;
                    return this.ag$a;
                }
                return this.ag$a;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public String ah$a() {
        int i = HaptikWebView + 93;
        HaptikSDK$d = i % 128;
        if (i % 2 != 0) {
            try {
                return this.toString;
            } catch (Exception e) {
                throw e;
            }
        }
        String str = this.toString;
        Object[] objArr = null;
        int length = objArr.length;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
        if ((r6 == null) != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0021, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
        if (r6.has("bg") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
        r6 = com.clevertap.android.sdk.inbox.CTInboxMessageContent.HaptikSDK$d + 53;
        com.clevertap.android.sdk.inbox.CTInboxMessageContent.HaptikWebView = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
        o.setBoundsInScreen.values("Unable to get Link Text Color with JSON - " + r6.getLocalizedMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
        return r6.getString("bg");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
        if (r6 == null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString(org.json.JSONObject r6) {
        /*
            r5 = this;
            java.lang.String r0 = "bg"
            int r1 = com.clevertap.android.sdk.inbox.CTInboxMessageContent.HaptikWebView
            int r1 = r1 + 81
            int r2 = r1 % 128
            com.clevertap.android.sdk.inbox.CTInboxMessageContent.HaptikSDK$d = r2
            int r1 = r1 % 2
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L12
            r1 = 0
            goto L13
        L12:
            r1 = 1
        L13:
            r4 = 0
            if (r1 == 0) goto L19
            if (r6 != 0) goto L22
            goto L21
        L19:
            super.hashCode()     // Catch: java.lang.Throwable -> L54
            if (r6 != 0) goto L1f
            r2 = 1
        L1f:
            if (r2 == 0) goto L22
        L21:
            return r4
        L22:
            boolean r1 = r6.has(r0)     // Catch: org.json.JSONException -> L3a
            if (r1 == 0) goto L2d
            java.lang.String r6 = r6.getString(r0)     // Catch: org.json.JSONException -> L3a
            goto L39
        L2d:
            int r6 = com.clevertap.android.sdk.inbox.CTInboxMessageContent.HaptikSDK$d
            int r6 = r6 + 53
            int r0 = r6 % 128
            com.clevertap.android.sdk.inbox.CTInboxMessageContent.HaptikWebView = r0
            int r6 = r6 % 2
            java.lang.String r6 = ""
        L39:
            return r6
        L3a:
            r6 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unable to get Link Text Color with JSON - "
            r0.append(r1)
            java.lang.String r6 = r6.getLocalizedMessage()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            o.setBoundsInScreen.values(r6)
            return r4
        L54:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.inbox.CTInboxMessageContent.toString(org.json.JSONObject):java.lang.String");
    }

    public String valueOf(JSONObject jSONObject) {
        Object[] objArr = null;
        if (jSONObject == null) {
            try {
                int i = HaptikWebView + 85;
                HaptikSDK$d = i % 128;
                if ((i % 2 == 0 ? '$' : 'A') != 'A') {
                    int i2 = 93 / 0;
                    return null;
                }
                return null;
            } catch (Exception e) {
                throw e;
            }
        }
        try {
            if (jSONObject.has("color")) {
                int i3 = HaptikWebView + 3;
                HaptikSDK$d = i3 % 128;
                if (!(i3 % 2 != 0)) {
                    String string = jSONObject.getString("color");
                    int length = objArr.length;
                    return string;
                }
                return jSONObject.getString("color");
            }
            return "";
        } catch (JSONException e2) {
            setBoundsInScreen.values("Unable to get Link Text Color with JSON - " + e2.getLocalizedMessage());
            return null;
        }
    }

    public String values(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject == null) {
            int i = HaptikWebView + 3;
            HaptikSDK$d = i % 128;
            if (i % 2 == 0) {
                int i2 = 58 / 0;
                return "";
            }
            return "";
        }
        try {
            Object[] objArr = null;
            if (jSONObject.has("copyText")) {
                int i3 = HaptikWebView + 83;
                HaptikSDK$d = i3 % 128;
                int i4 = i3 % 2;
                jSONObject2 = jSONObject.getJSONObject("copyText");
                try {
                    int i5 = HaptikSDK$d + 41;
                    try {
                        HaptikWebView = i5 % 128;
                        int i6 = i5 % 2;
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            } else {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                int i7 = HaptikWebView + 81;
                HaptikSDK$d = i7 % 128;
                if ((i7 % 2 == 0 ? '$' : '.') != '$') {
                    if ((jSONObject2.has("text") ? '(' : 'I') != '(') {
                        return "";
                    }
                } else {
                    boolean has = jSONObject2.has("text");
                    int length = objArr.length;
                    if ((has ? (char) 15 : '(') == '(') {
                        return "";
                    }
                }
                return jSONObject2.getString("text");
            }
            return "";
        } catch (JSONException e3) {
            setBoundsInScreen.values("Unable to get Link Text with JSON - " + e3.getLocalizedMessage());
            return "";
        }
    }

    public HashMap<String, String> ag$a(JSONObject jSONObject) {
        int i = HaptikWebView + 87;
        HaptikSDK$d = i % 128;
        int i2 = i % 2;
        if ((jSONObject != null ? 'S' : Soundex.SILENT_MARKER) != '-' && jSONObject.has("kv")) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("kv");
                Iterator<String> keys = jSONObject2.keys();
                HashMap<String, String> hashMap = new HashMap<>();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String string = jSONObject2.getString(next);
                    if (!TextUtils.isEmpty(next)) {
                        hashMap.put(next, string);
                    }
                }
                if ((!hashMap.isEmpty() ? '+' : 'Q') != '+') {
                    return null;
                }
                int i3 = HaptikSDK$d + 79;
                HaptikWebView = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 10 / 0;
                }
                return hashMap;
            } catch (JSONException e) {
                setBoundsInScreen.values("Unable to get Link Key Value with JSON - " + e.getLocalizedMessage());
            }
        }
        int i5 = HaptikWebView + 65;
        HaptikSDK$d = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public String ah$a(JSONObject jSONObject) {
        String str;
        Object obj = null;
        if (!(jSONObject == null)) {
            try {
                if (!(jSONObject.has("text") ? false : true)) {
                    int i = HaptikSDK$d + 81;
                    HaptikWebView = i % 128;
                    int i2 = i % 2;
                    str = jSONObject.getString("text");
                } else {
                    str = "";
                }
                int i3 = HaptikSDK$d + 89;
                HaptikWebView = i3 % 128;
                int i4 = i3 % 2;
                return str;
            } catch (JSONException e) {
                setBoundsInScreen.values("Unable to get Link Text with JSON - " + e.getLocalizedMessage());
                return null;
            }
        }
        try {
            int i5 = HaptikWebView + 123;
            HaptikSDK$d = i5 % 128;
            int i6 = i5 % 2;
            int i7 = HaptikWebView + 65;
            HaptikSDK$d = i7 % 128;
            if (i7 % 2 == 0) {
                super.hashCode();
                return null;
            }
            return null;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public String invoke(JSONObject jSONObject) {
        JSONObject jSONObject2;
        int i = HaptikSDK$d + 45;
        HaptikWebView = i % 128;
        int i2 = i % 2;
        Object[] objArr = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject3 = !(!jSONObject.has("url")) ? jSONObject.getJSONObject("url") : null;
            if (jSONObject3 == null) {
                return null;
            }
            if (jSONObject3.has("android")) {
                try {
                    int i3 = HaptikSDK$d + 21;
                    try {
                        HaptikWebView = i3 % 128;
                        if ((i3 % 2 != 0 ? 'Y' : (char) 11) != 'Y') {
                            jSONObject2 = jSONObject3.getJSONObject("android");
                        } else {
                            jSONObject2 = jSONObject3.getJSONObject("android");
                            int length = objArr.length;
                        }
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            } else {
                jSONObject2 = null;
            }
            return (!(jSONObject2 == null) && jSONObject2.has("text")) ? jSONObject2.getString("text") : "";
        } catch (JSONException e3) {
            setBoundsInScreen.values("Unable to get Link URL with JSON - " + e3.getLocalizedMessage());
            return null;
        }
    }

    public JSONArray valueOf() {
        try {
            int i = HaptikSDK$d + 55;
            HaptikWebView = i % 128;
            int i2 = i % 2;
            JSONArray jSONArray = this.HaptikSDK$a;
            int i3 = HaptikSDK$d + 27;
            HaptikWebView = i3 % 128;
            int i4 = i3 % 2;
            return jSONArray;
        } catch (Exception e) {
            throw e;
        }
    }

    public String ah$b(JSONObject jSONObject) {
        try {
            int i = HaptikSDK$d + 83;
            HaptikWebView = i % 128;
            int i2 = i % 2;
            Object obj = null;
            if ((jSONObject == null ? 'A' : '0') != '0') {
                return null;
            }
            try {
                if (!(!jSONObject.has("type"))) {
                    int i3 = HaptikSDK$d + 51;
                    HaptikWebView = i3 % 128;
                    if (i3 % 2 != 0) {
                        String string = jSONObject.getString("type");
                        super.hashCode();
                        return string;
                    }
                    return jSONObject.getString("type");
                }
                return "";
            } catch (JSONException e) {
                setBoundsInScreen.values("Unable to get Link Type with JSON - " + e.getLocalizedMessage());
                return null;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public boolean HaptikSDK$b(JSONObject jSONObject) {
        boolean z = false;
        if (jSONObject != null) {
            try {
                if ((jSONObject.has("fbSettings") ? (char) 4 : 'Y') != 'Y') {
                    z = jSONObject.getBoolean("fbSettings");
                    int i = HaptikSDK$d + 87;
                    HaptikWebView = i % 128;
                    int i2 = i % 2;
                }
                return z;
            } catch (JSONException e) {
                setBoundsInScreen.values("Unable to get fallback settings key with JSON - " + e.getLocalizedMessage());
                return false;
            }
        }
        try {
            int i3 = HaptikWebView + 59;
            HaptikSDK$d = i3 % 128;
            int i4 = i3 % 2;
            return false;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public String HaptikSDK$c() {
        String str;
        int i = HaptikWebView + 65;
        HaptikSDK$d = i % 128;
        if (i % 2 != 0) {
            str = this.HaptikSDK$c;
        } else {
            str = this.HaptikSDK$c;
            int i2 = 17 / 0;
        }
        int i3 = HaptikSDK$d + 103;
        HaptikWebView = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public String ah$b() {
        int i = HaptikSDK$d + 1;
        HaptikWebView = i % 128;
        int i2 = i % 2;
        String str = this.invoke;
        try {
            int i3 = HaptikSDK$d + 81;
            HaptikWebView = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public String HaptikSDK$b() {
        int i = HaptikWebView + 5;
        HaptikSDK$d = i % 128;
        int i2 = i % 2;
        String str = this.HaptikSDK$b;
        int i3 = HaptikSDK$d + 105;
        HaptikWebView = i3 % 128;
        if ((i3 % 2 != 0 ? ':' : '?') != '?') {
            int i4 = 65 / 0;
            return str;
        }
        return str;
    }

    public String HaptikSDK$a() {
        try {
            int i = HaptikSDK$d + 51;
            HaptikWebView = i % 128;
            if ((i % 2 != 0 ? (char) 22 : 'L') != 'L') {
                try {
                    String str = this.ah$b;
                    Object[] objArr = null;
                    int length = objArr.length;
                    return str;
                } catch (Exception e) {
                    throw e;
                }
            }
            return this.ah$b;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public String invoke() {
        String str;
        int i = HaptikSDK$d + 65;
        HaptikWebView = i % 128;
        if (i % 2 != 0) {
            str = this.getInitSettings;
            Object obj = null;
            super.hashCode();
        } else {
            str = this.getInitSettings;
        }
        int i2 = HaptikSDK$d + 89;
        HaptikWebView = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public String getSignupData() {
        int i = HaptikWebView + 113;
        HaptikSDK$d = i % 128;
        int i2 = i % 2;
        try {
            String str = this.getSignupData;
            int i3 = HaptikSDK$d + 63;
            HaptikWebView = i3 % 128;
            if (!(i3 % 2 != 0)) {
                return str;
            }
            Object[] objArr = null;
            int length = objArr.length;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
        if (r0.startsWith("audio") != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0047, code lost:
        if ((r0 ? '!' : org.apache.http.message.TokenParser.SP) != '!') goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004a, code lost:
        r0 = com.clevertap.android.sdk.inbox.CTInboxMessageContent.HaptikSDK$d + 23;
        com.clevertap.android.sdk.inbox.CTInboxMessageContent.HaptikWebView = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean HaptikWebView() {
        /*
            r5 = this;
            java.lang.String r0 = r5.values()
            r1 = 92
            if (r0 == 0) goto La
            r2 = 5
            goto Lc
        La:
            r2 = 92
        Lc:
            r3 = 1
            r4 = 0
            if (r2 == r1) goto L5b
            int r1 = com.clevertap.android.sdk.inbox.CTInboxMessageContent.HaptikWebView     // Catch: java.lang.Exception -> L59
            int r1 = r1 + 79
            int r2 = r1 % 128
            com.clevertap.android.sdk.inbox.CTInboxMessageContent.HaptikSDK$d = r2     // Catch: java.lang.Exception -> L59
            int r1 = r1 % 2
            java.lang.String r1 = r5.HaptikSDK$c
            if (r1 == 0) goto L5b
            int r1 = com.clevertap.android.sdk.inbox.CTInboxMessageContent.HaptikSDK$d     // Catch: java.lang.Exception -> L57
            int r1 = r1 + 13
            int r2 = r1 % 128
            com.clevertap.android.sdk.inbox.CTInboxMessageContent.HaptikWebView = r2     // Catch: java.lang.Exception -> L57
            int r1 = r1 % 2
            if (r1 == 0) goto L2c
            r1 = 0
            goto L2d
        L2c:
            r1 = 1
        L2d:
            java.lang.String r2 = "audio"
            if (r1 == 0) goto L38
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L5b
            goto L4a
        L38:
            boolean r0 = r0.startsWith(r2)
            r1 = 0
            int r1 = r1.length     // Catch: java.lang.Throwable -> L55
            r1 = 33
            if (r0 == 0) goto L45
            r0 = 33
            goto L47
        L45:
            r0 = 32
        L47:
            if (r0 == r1) goto L4a
            goto L5b
        L4a:
            int r0 = com.clevertap.android.sdk.inbox.CTInboxMessageContent.HaptikSDK$d
            int r0 = r0 + 23
            int r1 = r0 % 128
            com.clevertap.android.sdk.inbox.CTInboxMessageContent.HaptikWebView = r1
            int r0 = r0 % 2
            goto L5c
        L55:
            r0 = move-exception
            throw r0
        L57:
            r0 = move-exception
            throw r0
        L59:
            r0 = move-exception
            throw r0
        L5b:
            r3 = 0
        L5c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.inbox.CTInboxMessageContent.HaptikWebView():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
        if (r5.HaptikSDK$c != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
        if (r5.HaptikSDK$c != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
        r1 = com.clevertap.android.sdk.inbox.CTInboxMessageContent.HaptikWebView + 81;
        com.clevertap.android.sdk.inbox.CTInboxMessageContent.HaptikSDK$d = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
        if (r0.equals("image/gif") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
        if (r0 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean HaptikSDK$e() {
        /*
            r5 = this;
            java.lang.String r0 = r5.values()     // Catch: java.lang.Exception -> L4f
            r1 = 43
            if (r0 == 0) goto La
            r2 = 3
            goto Lc
        La:
            r2 = 43
        Lc:
            r3 = 1
            r4 = 0
            if (r2 == r1) goto L4d
            int r1 = com.clevertap.android.sdk.inbox.CTInboxMessageContent.HaptikWebView     // Catch: java.lang.Exception -> L4b
            int r1 = r1 + 5
            int r2 = r1 % 128
            com.clevertap.android.sdk.inbox.CTInboxMessageContent.HaptikSDK$d = r2     // Catch: java.lang.Exception -> L4b
            int r1 = r1 % 2
            r2 = 13
            if (r1 != 0) goto L21
            r1 = 13
            goto L23
        L21:
            r1 = 78
        L23:
            if (r1 == r2) goto L2a
            java.lang.String r1 = r5.HaptikSDK$c     // Catch: java.lang.Exception -> L4b
            if (r1 == 0) goto L4d
            goto L31
        L2a:
            java.lang.String r1 = r5.HaptikSDK$c
            r2 = 42
            int r2 = r2 / r4
            if (r1 == 0) goto L4d
        L31:
            int r1 = com.clevertap.android.sdk.inbox.CTInboxMessageContent.HaptikWebView
            int r1 = r1 + 81
            int r2 = r1 % 128
            com.clevertap.android.sdk.inbox.CTInboxMessageContent.HaptikSDK$d = r2
            int r1 = r1 % 2
            java.lang.String r1 = "image/gif"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L45
            r0 = 0
            goto L46
        L45:
            r0 = 1
        L46:
            if (r0 == 0) goto L4e
            goto L4d
        L49:
            r0 = move-exception
            throw r0
        L4b:
            r0 = move-exception
            throw r0
        L4d:
            r3 = 0
        L4e:
            return r3
        L4f:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.inbox.CTInboxMessageContent.HaptikSDK$e():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
        if ((r3 ? '_' : 'V') != '_') goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
        if ((!r0.startsWith("image")) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
        if (r0.equals("image/gif") != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004e, code lost:
        r0 = 'W';
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0051, code lost:
        r0 = 25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
        if (r0 == 'W') goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0057, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean getInitSettings() {
        /*
            r5 = this;
            java.lang.String r0 = r5.values()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L58
            int r3 = com.clevertap.android.sdk.inbox.CTInboxMessageContent.HaptikWebView
            int r3 = r3 + 101
            int r4 = r3 % 128
            com.clevertap.android.sdk.inbox.CTInboxMessageContent.HaptikSDK$d = r4
            int r3 = r3 % 2
            java.lang.String r3 = r5.HaptikSDK$c
            if (r3 == 0) goto L58
            int r3 = com.clevertap.android.sdk.inbox.CTInboxMessageContent.HaptikWebView
            int r3 = r3 + 111
            int r4 = r3 % 128
            com.clevertap.android.sdk.inbox.CTInboxMessageContent.HaptikSDK$d = r4
            int r3 = r3 % 2
            java.lang.String r4 = "image"
            if (r3 != 0) goto L38
            boolean r3 = r0.startsWith(r4)
            r4 = 0
            int r4 = r4.length     // Catch: java.lang.Throwable -> L36
            r4 = 95
            if (r3 == 0) goto L31
            r3 = 95
            goto L33
        L31:
            r3 = 86
        L33:
            if (r3 == r4) goto L44
            goto L58
        L36:
            r0 = move-exception
            throw r0
        L38:
            boolean r3 = r0.startsWith(r4)
            if (r3 == 0) goto L40
            r3 = 0
            goto L41
        L40:
            r3 = 1
        L41:
            if (r3 == 0) goto L44
            goto L58
        L44:
            java.lang.String r3 = "image/gif"
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Exception -> L56
            r3 = 87
            if (r0 != 0) goto L51
            r0 = 87
            goto L53
        L51:
            r0 = 25
        L53:
            if (r0 == r3) goto L59
            goto L58
        L56:
            r0 = move-exception
            throw r0
        L58:
            r1 = 0
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.inbox.CTInboxMessageContent.getInitSettings():boolean");
    }

    public boolean HaptikSDK$d() {
        int i = HaptikSDK$d + 27;
        HaptikWebView = i % 128;
        int i2 = i % 2;
        String values = values();
        boolean z = false;
        if (!(values == null)) {
            try {
                if (this.HaptikSDK$c != null) {
                    if (values.startsWith("video")) {
                        z = true;
                    }
                }
            } catch (Exception e) {
                throw e;
            }
        }
        int i3 = HaptikSDK$d + 13;
        HaptikWebView = i3 % 128;
        int i4 = i3 % 2;
        return z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = HaptikSDK$d + 51;
        HaptikWebView = i2 % 128;
        int i3 = i2 % 2;
        try {
            parcel.writeString(this.getInitSettings);
            parcel.writeString(this.getSignupData);
            parcel.writeString(this.invoke);
            parcel.writeString(this.HaptikSDK$b);
            parcel.writeString(this.HaptikSDK$c);
            parcel.writeByte(this.ah$a.booleanValue() ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.values.booleanValue() ? (byte) 1 : (byte) 0);
            parcel.writeString(this.valueOf);
            parcel.writeString(this.toString);
            if (this.HaptikSDK$a == null) {
                parcel.writeByte((byte) 0);
            } else {
                parcel.writeByte((byte) 1);
                parcel.writeString(this.HaptikSDK$a.toString());
            }
            parcel.writeString(this.ag$a);
            parcel.writeString(this.ah$b);
            int i4 = HaptikWebView + 15;
            HaptikSDK$d = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006e, code lost:
        if ((r18.has(ah$a(new int[]{755738546, -219698426, -471949251, 1718000273}, 5 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)).intern()) ? 'N' : org.apache.http.message.TokenParser.CR) != 'N') goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01d2, code lost:
        if ((r0 ? 'R' : 'O') != 'O') goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01dd, code lost:
        if (r10.getBoolean("hasUrl") != false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01df, code lost:
        r0 = true;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0258, code lost:
        if (r0.has("android") != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010c, code lost:
        if (r7 != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0116, code lost:
        if (r2.has("url") != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0118, code lost:
        r2 = r2.getString("url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011d, code lost:
        r2 = "";
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x021f A[Catch: JSONException -> 0x029c, TRY_LEAVE, TryCatch #2 {JSONException -> 0x029c, blocks: (B:4:0x0026, B:13:0x0072, B:16:0x0098, B:18:0x009e, B:20:0x00a4, B:22:0x00ac, B:24:0x00b2, B:25:0x00b4, B:33:0x00cb, B:35:0x00d1, B:37:0x00d7, B:39:0x00df, B:41:0x00e5, B:42:0x00e7, B:44:0x00ef, B:51:0x0106, B:53:0x010b, B:63:0x011e, B:61:0x0118, B:59:0x0112, B:64:0x0120, B:66:0x0128, B:69:0x0132, B:72:0x0141, B:74:0x0147, B:81:0x015e, B:89:0x017a, B:98:0x018c, B:90:0x017f, B:92:0x0184, B:80:0x0158, B:99:0x018e, B:102:0x019f, B:105:0x01a9, B:113:0x01c3, B:115:0x01c8, B:131:0x01e3, B:133:0x01f1, B:148:0x0213, B:150:0x021f, B:155:0x0230, B:163:0x024a, B:170:0x025a, B:173:0x0262, B:175:0x0268, B:176:0x026c, B:166:0x0251, B:168:0x0257, B:186:0x027d, B:188:0x0285, B:193:0x0291, B:195:0x0299, B:126:0x01d9, B:31:0x00c5, B:7:0x0047), top: B:204:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0291 A[Catch: JSONException -> 0x029c, TryCatch #2 {JSONException -> 0x029c, blocks: (B:4:0x0026, B:13:0x0072, B:16:0x0098, B:18:0x009e, B:20:0x00a4, B:22:0x00ac, B:24:0x00b2, B:25:0x00b4, B:33:0x00cb, B:35:0x00d1, B:37:0x00d7, B:39:0x00df, B:41:0x00e5, B:42:0x00e7, B:44:0x00ef, B:51:0x0106, B:53:0x010b, B:63:0x011e, B:61:0x0118, B:59:0x0112, B:64:0x0120, B:66:0x0128, B:69:0x0132, B:72:0x0141, B:74:0x0147, B:81:0x015e, B:89:0x017a, B:98:0x018c, B:90:0x017f, B:92:0x0184, B:80:0x0158, B:99:0x018e, B:102:0x019f, B:105:0x01a9, B:113:0x01c3, B:115:0x01c8, B:131:0x01e3, B:133:0x01f1, B:148:0x0213, B:150:0x021f, B:155:0x0230, B:163:0x024a, B:170:0x025a, B:173:0x0262, B:175:0x0268, B:176:0x026c, B:166:0x0251, B:168:0x0257, B:186:0x027d, B:188:0x0285, B:193:0x0291, B:195:0x0299, B:126:0x01d9, B:31:0x00c5, B:7:0x0047), top: B:204:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0298  */
    /* JADX WARN: Type inference failed for: r2v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.clevertap.android.sdk.inbox.CTInboxMessageContent HaptikSDK$a(org.json.JSONObject r18) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.inbox.CTInboxMessageContent.HaptikSDK$a(org.json.JSONObject):com.clevertap.android.sdk.inbox.CTInboxMessageContent");
    }

    private static String ah$a(int[] iArr, int i) {
        String str;
        synchronized (getDouble.ag$a) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) HaptikSDK$e.clone();
            getDouble.toString = 0;
            while (getDouble.toString < iArr.length) {
                cArr[0] = (char) (iArr[getDouble.toString] >> 16);
                cArr[1] = (char) iArr[getDouble.toString];
                cArr[2] = (char) (iArr[getDouble.toString + 1] >> 16);
                cArr[3] = (char) iArr[getDouble.toString + 1];
                getDouble.valueOf = (cArr[0] << 16) + cArr[1];
                getDouble.values = (cArr[2] << 16) + cArr[3];
                getDouble.values(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = getDouble.valueOf ^ iArr2[i2];
                    getDouble.valueOf = i3;
                    getDouble.values = getDouble.toString(i3) ^ getDouble.values;
                    int i4 = getDouble.valueOf;
                    getDouble.valueOf = getDouble.values;
                    getDouble.values = i4;
                }
                int i5 = getDouble.valueOf;
                getDouble.valueOf = getDouble.values;
                getDouble.values = i5;
                getDouble.values = i5 ^ iArr2[16];
                getDouble.valueOf ^= iArr2[17];
                int i6 = getDouble.valueOf;
                int i7 = getDouble.values;
                cArr[0] = (char) (getDouble.valueOf >>> 16);
                cArr[1] = (char) getDouble.valueOf;
                cArr[2] = (char) (getDouble.values >>> 16);
                cArr[3] = (char) getDouble.values;
                getDouble.values(iArr2);
                cArr2[getDouble.toString << 1] = cArr[0];
                cArr2[(getDouble.toString << 1) + 1] = cArr[1];
                cArr2[(getDouble.toString << 1) + 2] = cArr[2];
                cArr2[(getDouble.toString << 1) + 3] = cArr[3];
                getDouble.toString += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
