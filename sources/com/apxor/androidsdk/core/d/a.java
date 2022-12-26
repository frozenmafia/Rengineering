package com.apxor.androidsdk.core.d;

import android.content.ContentValues;
import com.apxor.androidsdk.core.EventListener;
import com.apxor.androidsdk.core.SDKController;
import com.apxor.androidsdk.core.Utilities;
import com.apxor.androidsdk.core.ce.Constants;
import com.apxor.androidsdk.core.models.BaseApxorEvent;
import com.apxor.androidsdk.core.utils.DateTimeUtils;
import java.util.ArrayList;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class a implements EventListener {
    private boolean a;

    /* renamed from: b  reason: collision with root package name */
    private long f258b;

    public void a(long j) {
        if (this.a) {
            return;
        }
        SDKController sDKController = SDKController.getInstance();
        sDKController.registerToEvent("agg_events", this);
        if (j <= 0) {
            j = new Date().getTime();
        }
        DateTimeUtils dateTimeUtils = sDKController.getDateTimeUtils();
        this.f258b = dateTimeUtils.getTimeFromDate(dateTimeUtils.getDateString(new Date(j)));
        this.a = true;
    }

    @Override // com.apxor.androidsdk.core.EventListener
    public void onEvent(BaseApxorEvent baseApxorEvent) {
        JSONArray names;
        SDKController sDKController;
        String str;
        JSONObject jSONObject;
        JSONArray jSONArray;
        int i;
        String str2;
        String string;
        Object obj;
        SDKController sDKController2;
        String str3;
        if (this.a && baseApxorEvent.getEventType().equals("agg_events")) {
            SDKController sDKController3 = SDKController.getInstance();
            String sessionId = sDKController3.getSessionId();
            String eventName = baseApxorEvent.getEventName();
            ArrayList<ContentValues> arrayList = new ArrayList<>();
            ContentValues contentValues = new ContentValues();
            contentValues.put("s_id", sessionId);
            contentValues.put("name", eventName);
            contentValues.put("date", Long.valueOf(this.f258b));
            contentValues.put(Constants.META_ATTRIBUTES, "");
            contentValues.put("o_value", "");
            contentValues.put("value", "");
            arrayList.add(contentValues);
            JSONObject optJSONObject = baseApxorEvent.getJSONData().optJSONObject(com.apxor.androidsdk.core.Constants.ADDITIONAL_INFO);
            if (optJSONObject != null && (names = optJSONObject.names()) != null && names.length() > 0) {
                int length = names.length();
                int i2 = 0;
                while (i2 < length) {
                    try {
                        string = names.getString(i2);
                        jSONArray = names;
                        try {
                            obj = optJSONObject.get(string);
                            jSONObject = optJSONObject;
                            try {
                            } catch (JSONException unused) {
                                sDKController = sDKController3;
                                str = sessionId;
                                str2 = eventName;
                                i = length;
                            }
                        } catch (JSONException unused2) {
                            sDKController = sDKController3;
                            str = sessionId;
                            jSONObject = optJSONObject;
                        }
                    } catch (JSONException unused3) {
                        sDKController = sDKController3;
                        str = sessionId;
                        jSONObject = optJSONObject;
                        jSONArray = names;
                    }
                    if (obj instanceof JSONArray) {
                        try {
                            JSONArray jSONArray2 = (JSONArray) obj;
                            if (jSONArray2.length() > 0) {
                                int length2 = jSONArray2.length();
                                i = length;
                                int i3 = 0;
                                while (i3 < length2) {
                                    int i4 = length2;
                                    try {
                                        ContentValues contentValues2 = new ContentValues();
                                        contentValues2.put("s_id", sessionId);
                                        contentValues2.put("name", eventName);
                                        sDKController2 = sDKController3;
                                        str3 = sessionId;
                                        try {
                                            contentValues2.put("date", Long.valueOf(this.f258b));
                                            contentValues2.put(Constants.META_ATTRIBUTES, string);
                                            Object obj2 = jSONArray2.get(i3);
                                            contentValues2.put("o_value", String.valueOf(obj2));
                                            contentValues2.put("value", Utilities.getJSONBlob(obj2));
                                            arrayList.add(contentValues2);
                                        } catch (JSONException unused4) {
                                        }
                                    } catch (JSONException unused5) {
                                        sDKController2 = sDKController3;
                                        str3 = sessionId;
                                    }
                                    i3++;
                                    length2 = i4;
                                    sDKController3 = sDKController2;
                                    sessionId = str3;
                                }
                                sDKController = sDKController3;
                            } else {
                                sDKController = sDKController3;
                                i = length;
                            }
                        } catch (JSONException unused6) {
                            sDKController = sDKController3;
                            str = sessionId;
                            i = length;
                            str2 = eventName;
                            i2++;
                            eventName = str2;
                            names = jSONArray;
                            optJSONObject = jSONObject;
                            length = i;
                            sDKController3 = sDKController;
                            sessionId = str;
                        }
                    } else {
                        sDKController = sDKController3;
                        str = sessionId;
                        i = length;
                        try {
                            ContentValues contentValues3 = new ContentValues();
                            sessionId = str;
                            try {
                                contentValues3.put("s_id", sessionId);
                                contentValues3.put("name", eventName);
                                str = sessionId;
                                str2 = eventName;
                                try {
                                    contentValues3.put("date", Long.valueOf(this.f258b));
                                    contentValues3.put(Constants.META_ATTRIBUTES, string);
                                    contentValues3.put("o_value", String.valueOf(obj));
                                    contentValues3.put("value", Utilities.getJSONBlob(obj));
                                    arrayList.add(contentValues3);
                                } catch (JSONException unused7) {
                                }
                            } catch (JSONException unused8) {
                            }
                        } catch (JSONException unused9) {
                        }
                        i2++;
                        eventName = str2;
                        names = jSONArray;
                        optJSONObject = jSONObject;
                        length = i;
                        sDKController3 = sDKController;
                        sessionId = str;
                    }
                    str = sessionId;
                    str2 = eventName;
                    i2++;
                    eventName = str2;
                    names = jSONArray;
                    optJSONObject = jSONObject;
                    length = i;
                    sDKController3 = sDKController;
                    sessionId = str;
                }
            }
            sDKController3.getDataHandler().a(arrayList);
        }
    }
}
