package com.apxor.androidsdk.core.ce.models;

import androidx.exifinterface.media.ExifInterface;
import com.apxor.androidsdk.core.SDKController;
import com.apxor.androidsdk.core.ce.Constants;
import com.apxor.androidsdk.core.utils.DateTimeUtils;
import com.apxor.androidsdk.core.utils.Logger;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class j {
    private boolean a;

    /* renamed from: b  reason: collision with root package name */
    private long f257b;
    private long c;
    private long d;
    private long e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        long time = new Date().getTime();
        boolean z = false;
        if (this.f257b > time || time > this.c) {
            return false;
        }
        if (this.a) {
            if (this.d <= time && time <= this.e) {
                z = true;
            }
            if (!z) {
                Logger.e("Apxor", "Time limits check failed", null);
            }
            return z;
        }
        return true;
    }

    public boolean a(JSONObject jSONObject) {
        String optString = jSONObject.getJSONObject(Constants.VALIDITY).optString("start_date");
        String optString2 = jSONObject.getJSONObject(Constants.VALIDITY).optString("end_date");
        DateTimeUtils dateTimeUtils = SDKController.getInstance().getDateTimeUtils();
        if (optString.isEmpty() || optString2.isEmpty()) {
            throw new JSONException("Invalid dates");
        }
        this.f257b = dateTimeUtils.getDateFromTimeStamp(optString.replace("Z", "+0000")).getTime();
        this.c = dateTimeUtils.getDateFromTimeStamp(optString2.replace("Z", "+0000")).getTime();
        boolean optBoolean = jSONObject.optBoolean(Constants.SHOW_AT_SPECIFIC_TIME, false);
        this.a = optBoolean;
        if (optBoolean) {
            String optString3 = jSONObject.getJSONObject(Constants.TIME_LIMITS).optString(Constants.START_TIME);
            String optString4 = jSONObject.getJSONObject(Constants.TIME_LIMITS).optString(Constants.END_TIME);
            if (optString3.isEmpty() || optString4.isEmpty()) {
                throw new JSONException("Invalid times");
            }
            String dateString = dateTimeUtils.getDateString(new Date());
            this.d = dateTimeUtils.getDateFromTimeStamp(dateString + ExifInterface.GPS_DIRECTION_TRUE + optString3 + ":00.000+0000").getTime();
            this.e = dateTimeUtils.getDateFromTimeStamp(dateString + ExifInterface.GPS_DIRECTION_TRUE + optString4 + ":00.000+0000").getTime();
        }
        long time = new Date().getTime();
        return this.f257b <= time && time <= this.c;
    }
}
