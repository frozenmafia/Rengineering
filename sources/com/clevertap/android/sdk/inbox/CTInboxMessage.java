package com.clevertap.android.sdk.inbox;

import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.TypedValue;
import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.isBeforeFirst;
import o.setBoundsInScreen;
import org.apache.http.message.TokenParser;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class CTInboxMessage implements Parcelable {
    public static final Parcelable.Creator<CTInboxMessage> CREATOR;
    private static long a = 0;
    private static int aj$a = 0;
    private static int onXdkEvent = 1;
    private String HaptikSDK$a;
    private long HaptikSDK$b;
    private long HaptikSDK$c;
    private String HaptikSDK$d;
    private String HaptikSDK$e;
    private List<String> HaptikWebView;
    private String ag$a;
    private String ah$a;
    private JSONObject ah$b;
    private JSONObject ak;
    private String getInitSettings;
    private boolean getSignupData;
    private ArrayList<CTInboxMessageContent> invoke;
    private CTInboxMessageType isLogoutPending;
    private String toString;
    private String valueOf;
    private JSONObject values;

    static void HaptikWebView() {
        a = 732501587516225501L;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        try {
            int i = onXdkEvent + 123;
            try {
                aj$a = i % 128;
                if (i % 2 != 0) {
                }
                return 0;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    static {
        HaptikWebView();
        CREATOR = new Parcelable.Creator<CTInboxMessage>() { // from class: com.clevertap.android.sdk.inbox.CTInboxMessage.3
            @Override // android.os.Parcelable.Creator
            /* renamed from: ag$a */
            public CTInboxMessage createFromParcel(Parcel parcel) {
                return new CTInboxMessage(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: toString */
            public CTInboxMessage[] newArray(int i) {
                return new CTInboxMessage[i];
            }
        };
        int i = aj$a + 95;
        onXdkEvent = i % 128;
        int i2 = i % 2;
    }

    public CTInboxMessage(JSONObject jSONObject) {
        long currentTimeMillis;
        boolean z;
        boolean z2;
        CTInboxMessageType fromString;
        this.invoke = new ArrayList<>();
        this.HaptikWebView = new ArrayList();
        this.ah$b = jSONObject;
        try {
            this.getInitSettings = jSONObject.has(toString(new char[]{30644, 2184}, 32561 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern()) ? jSONObject.getString(toString(new char[]{30644, 2184}, 32561 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern()) : SessionDescription.SUPPORTED_SDP_VERSION;
            this.ah$a = jSONObject.has("wzrk_id") ? jSONObject.getString("wzrk_id") : "0_0";
            this.HaptikSDK$c = jSONObject.has("date") ? jSONObject.getLong("date") : System.currentTimeMillis() / 1000;
            if (!jSONObject.has("wzrk_ttl")) {
                currentTimeMillis = System.currentTimeMillis() + 86400000;
            } else {
                currentTimeMillis = jSONObject.getLong("wzrk_ttl");
            }
            this.HaptikSDK$b = currentTimeMillis;
            if (jSONObject.has("isRead")) {
                z = true;
                z2 = false;
            } else {
                z = true;
                z2 = true;
            }
            this.getSignupData = z2 != z && jSONObject.getBoolean("isRead");
            JSONArray jSONArray = jSONObject.has("tags") ? jSONObject.getJSONArray("tags") : null;
            if (jSONArray != null) {
                int i = onXdkEvent + 83;
                aj$a = i % 128;
                int i2 = i % 2;
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    int i4 = aj$a + 33;
                    onXdkEvent = i4 % 128;
                    int i5 = i4 % 2;
                    this.HaptikWebView.add(jSONArray.getString(i3));
                }
            }
            JSONObject jSONObject2 = jSONObject.has(NotificationCompat.CATEGORY_MESSAGE) ? jSONObject.getJSONObject(NotificationCompat.CATEGORY_MESSAGE) : null;
            if ((jSONObject2 != null ? '@' : '\t') == '@') {
                if ((jSONObject2.has("type") ? '>' : '\f') == '>') {
                    fromString = CTInboxMessageType.fromString(jSONObject2.getString("type"));
                } else {
                    fromString = CTInboxMessageType.fromString("");
                }
                this.isLogoutPending = fromString;
                this.toString = (jSONObject2.has("bg") ? TokenParser.ESCAPE : '(') != '(' ? jSONObject2.getString("bg") : "";
                JSONArray jSONArray2 = jSONObject2.has("content") ? jSONObject2.getJSONArray("content") : null;
                if (jSONArray2 != null) {
                    int i6 = onXdkEvent + 67;
                    aj$a = i6 % 128;
                    int i7 = i6 % 2;
                    for (int i8 = 0; i8 < jSONArray2.length(); i8++) {
                        this.invoke.add(new CTInboxMessageContent().HaptikSDK$a(jSONArray2.getJSONObject(i8)));
                    }
                }
                this.HaptikSDK$d = jSONObject2.has("orientation") ? jSONObject2.getString("orientation") : "";
            }
            this.ak = jSONObject.has("wzrkParams") ? jSONObject.getJSONObject("wzrkParams") : null;
        } catch (JSONException e) {
            setBoundsInScreen.values("Unable to init CTInboxMessage with JSON - " + e.getLocalizedMessage());
        }
    }

    private CTInboxMessage(Parcel parcel) {
        JSONObject jSONObject;
        this.invoke = new ArrayList<>();
        this.HaptikWebView = new ArrayList();
        try {
            this.HaptikSDK$e = parcel.readString();
            this.valueOf = parcel.readString();
            this.HaptikSDK$a = parcel.readString();
            this.ag$a = parcel.readString();
            this.HaptikSDK$c = parcel.readLong();
            this.HaptikSDK$b = parcel.readLong();
            this.getInitSettings = parcel.readString();
            JSONObject jSONObject2 = null;
            if (parcel.readByte() == 0) {
                int i = aj$a + 121;
                onXdkEvent = i % 128;
                int i2 = i % 2;
                jSONObject = null;
            } else {
                jSONObject = new JSONObject(parcel.readString());
            }
            this.ah$b = jSONObject;
            this.values = parcel.readByte() == 0 ? null : new JSONObject(parcel.readString());
            boolean z = false;
            if (!(parcel.readByte() == 0)) {
                int i3 = onXdkEvent + 67;
                aj$a = i3 % 128;
                int i4 = i3 % 2;
                try {
                    int i5 = aj$a + 31;
                    try {
                        onXdkEvent = i5 % 128;
                        int i6 = i5 % 2;
                        z = true;
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            }
            this.getSignupData = z;
            this.isLogoutPending = (CTInboxMessageType) parcel.readValue(CTInboxMessageType.class.getClassLoader());
            if (parcel.readByte() == 1) {
                List arrayList = new ArrayList();
                this.HaptikWebView = arrayList;
                parcel.readList(arrayList, String.class.getClassLoader());
                int i7 = onXdkEvent + 121;
                aj$a = i7 % 128;
                int i8 = i7 % 2;
            } else {
                this.HaptikWebView = null;
            }
            this.toString = parcel.readString();
            if (parcel.readByte() == 1) {
                ArrayList<CTInboxMessageContent> arrayList2 = new ArrayList<>();
                this.invoke = arrayList2;
                parcel.readList(arrayList2, CTInboxMessageContent.class.getClassLoader());
            } else {
                this.invoke = null;
            }
            this.HaptikSDK$d = parcel.readString();
            this.ah$a = parcel.readString();
            if ((parcel.readByte() == 0 ? ']' : 'Z') != ']') {
                jSONObject2 = new JSONObject(parcel.readString());
            } else {
                int i9 = aj$a + 99;
                onXdkEvent = i9 % 128;
                if ((i9 % 2 == 0 ? ';' : (char) 24) == ';') {
                    super.hashCode();
                }
            }
            this.ak = jSONObject2;
        } catch (JSONException e3) {
            setBoundsInScreen.values("Unable to parse CTInboxMessage from parcel - " + e3.getLocalizedMessage());
        }
    }

    public String ah$a() {
        String str;
        int i = onXdkEvent + 87;
        aj$a = i % 128;
        if ((i % 2 != 0 ? '7' : 'S') != '7') {
            try {
                str = this.toString;
            } catch (Exception e) {
                throw e;
            }
        } else {
            str = this.toString;
            Object obj = null;
            super.hashCode();
        }
        int i2 = onXdkEvent + 43;
        aj$a = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public ArrayList<String> values() {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<CTInboxMessageContent> it = invoke().iterator();
        while (true) {
            if (!(it.hasNext())) {
                int i = onXdkEvent + 63;
                aj$a = i % 128;
                int i2 = i % 2;
                return arrayList;
            }
            int i3 = onXdkEvent + 31;
            aj$a = i3 % 128;
            int i4 = i3 % 2;
            arrayList.add(it.next().HaptikSDK$c());
        }
    }

    public JSONObject ag$a() {
        try {
            int i = onXdkEvent + 41;
            aj$a = i % 128;
            int i2 = i % 2;
            JSONObject jSONObject = this.ah$b;
            int i3 = aj$a + 51;
            onXdkEvent = i3 % 128;
            int i4 = i3 % 2;
            return jSONObject;
        } catch (Exception e) {
            throw e;
        }
    }

    public long valueOf() {
        int i = aj$a + 69;
        onXdkEvent = i % 128;
        if ((i % 2 == 0 ? (char) 17 : '$') != 17) {
            return this.HaptikSDK$c;
        }
        long j = this.HaptikSDK$c;
        Object[] objArr = null;
        int length = objArr.length;
        return j;
    }

    public ArrayList<CTInboxMessageContent> invoke() {
        ArrayList<CTInboxMessageContent> arrayList;
        int i = onXdkEvent + 13;
        aj$a = i % 128;
        if ((i % 2 != 0 ? (char) 1 : (char) 22) != 1) {
            arrayList = this.invoke;
        } else {
            try {
                arrayList = this.invoke;
                Object[] objArr = null;
                int length = objArr.length;
            } catch (Exception e) {
                throw e;
            }
        }
        int i2 = onXdkEvent + 111;
        aj$a = i2 % 128;
        int i3 = i2 % 2;
        return arrayList;
    }

    public String HaptikSDK$c() {
        int i = onXdkEvent + 3;
        aj$a = i % 128;
        int i2 = i % 2;
        String str = this.getInitSettings;
        try {
            int i3 = aj$a + 121;
            try {
                onXdkEvent = i3 % 128;
                int i4 = i3 % 2;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public String HaptikSDK$b() {
        String str;
        int i = onXdkEvent + 75;
        aj$a = i % 128;
        if ((i % 2 != 0 ? (char) 15 : '6') != 15) {
            try {
                str = this.HaptikSDK$d;
            } catch (Exception e) {
                throw e;
            }
        } else {
            str = this.HaptikSDK$d;
            int i2 = 33 / 0;
        }
        int i3 = onXdkEvent + 121;
        aj$a = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public List<String> HaptikSDK$a() {
        int i = onXdkEvent + 17;
        aj$a = i % 128;
        if (!(i % 2 != 0)) {
            return this.HaptikWebView;
        }
        int i2 = 29 / 0;
        return this.HaptikWebView;
    }

    public CTInboxMessageType ah$b() {
        int i = aj$a + 23;
        onXdkEvent = i % 128;
        int i2 = i % 2;
        CTInboxMessageType cTInboxMessageType = this.isLogoutPending;
        int i3 = onXdkEvent + 89;
        aj$a = i3 % 128;
        int i4 = i3 % 2;
        return cTInboxMessageType;
    }

    public JSONObject getSignupData() {
        try {
            int i = onXdkEvent + 65;
            try {
                aj$a = i % 128;
                int i2 = i % 2;
                JSONObject jSONObject = this.ak;
                if (jSONObject == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    int i3 = onXdkEvent + 51;
                    aj$a = i3 % 128;
                    int i4 = i3 % 2;
                    return jSONObject2;
                }
                return jSONObject;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public boolean HaptikSDK$d() {
        int i = onXdkEvent + 45;
        aj$a = i % 128;
        if ((i % 2 != 0 ? '?' : (char) 1) != 1) {
            int i2 = 52 / 0;
            return this.getSignupData;
        }
        return this.getSignupData;
    }

    public void ag$a(boolean z) {
        try {
            int i = aj$a + 3;
            onXdkEvent = i % 128;
            if ((i % 2 == 0 ? 'D' : '.') != 'D') {
                try {
                    this.getSignupData = z;
                } catch (Exception e) {
                    throw e;
                }
            } else {
                this.getSignupData = z;
                int i2 = 54 / 0;
            }
            int i3 = aj$a + 7;
            onXdkEvent = i3 % 128;
            if (i3 % 2 == 0) {
                Object[] objArr = null;
                int length = objArr.length;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.HaptikSDK$e);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.HaptikSDK$a);
        parcel.writeString(this.ag$a);
        parcel.writeLong(this.HaptikSDK$c);
        parcel.writeLong(this.HaptikSDK$b);
        parcel.writeString(this.getInitSettings);
        if (this.ah$b != null) {
            parcel.writeByte((byte) 1);
            parcel.writeString(this.ah$b.toString());
        } else {
            int i2 = aj$a + 19;
            onXdkEvent = i2 % 128;
            int i3 = i2 % 2;
            parcel.writeByte((byte) 0);
        }
        if (!(this.values != null)) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeString(this.values.toString());
            try {
                int i4 = aj$a + 55;
                onXdkEvent = i4 % 128;
                int i5 = i4 % 2;
            } catch (Exception e) {
                throw e;
            }
        }
        parcel.writeByte(this.getSignupData ? (byte) 1 : (byte) 0);
        parcel.writeValue(this.isLogoutPending);
        if ((this.HaptikWebView == null ? (char) 24 : 'F') == 24) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeList(this.HaptikWebView);
        }
        parcel.writeString(this.toString);
        if (this.invoke == null) {
            int i6 = onXdkEvent + 53;
            aj$a = i6 % 128;
            int i7 = i6 % 2;
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeList(this.invoke);
        }
        parcel.writeString(this.HaptikSDK$d);
        parcel.writeString(this.ah$a);
        try {
            if (this.ak == null) {
                int i8 = aj$a + 29;
                onXdkEvent = i8 % 128;
                if (i8 % 2 == 0) {
                    parcel.writeByte((byte) 1);
                    return;
                } else {
                    parcel.writeByte((byte) 0);
                    return;
                }
            }
            parcel.writeByte((byte) 1);
            parcel.writeString(this.ak.toString());
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String toString(char[] cArr, int i) {
        String str;
        synchronized (isBeforeFirst.toString) {
            isBeforeFirst.ah$a = i;
            char[] cArr2 = new char[cArr.length];
            isBeforeFirst.valueOf = 0;
            while (isBeforeFirst.valueOf < cArr.length) {
                cArr2[isBeforeFirst.valueOf] = (char) ((cArr[isBeforeFirst.valueOf] ^ (isBeforeFirst.valueOf * isBeforeFirst.ah$a)) ^ a);
                isBeforeFirst.valueOf++;
            }
            str = new String(cArr2);
        }
        return str;
    }
}
