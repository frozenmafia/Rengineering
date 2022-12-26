package com.phonepe.intent.sdk.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.dreampay.commons.constants.Constants;
import irjuc.irjuc.cqqlq.irjuc.rmqfk.jmjou;
import o.AutoTransition;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class AvailabilityCheckResponse extends jmjou implements Parcelable {
    @Override // irjuc.irjuc.cqqlq.irjuc.rmqfk.jmjou, android.os.Parcelable
    public int describeContents() {
        return super.describeContents();
    }

    public String getCode() {
        return (String) get("code");
    }

    public String getMessage() {
        return (String) get("message");
    }

    public String getResponseCode() {
        return (String) AutoTransition.get((JSONObject) get("data"), "responseCode");
    }

    public Boolean isAvailable() {
        return (Boolean) AutoTransition.get((JSONObject) get("data"), "available");
    }

    public boolean isSuccess() {
        return getCode() != null && getCode().matches(Constants.Upi.PHONEPE_SUCCESS);
    }

    @Override // irjuc.irjuc.cqqlq.irjuc.rmqfk.jmjou, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
