package com.phonepe.intent.sdk.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.dreampay.commons.constants.Constants;
import irjuc.irjuc.cqqlq.irjuc.rmqfk.jmjou;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class SDKConfigResponse extends jmjou implements Parcelable {
    @Override // irjuc.irjuc.cqqlq.irjuc.rmqfk.jmjou, android.os.Parcelable
    public int describeContents() {
        return super.describeContents();
    }

    public String getCode() {
        return (String) get("code");
    }

    public JSONObject getData() {
        return (JSONObject) get("data");
    }

    public String getMessage() {
        return (String) get("message");
    }

    public boolean isSuccess() {
        return getCode() != null && getCode().matches(Constants.Upi.PHONEPE_SUCCESS);
    }

    @Override // irjuc.irjuc.cqqlq.irjuc.rmqfk.jmjou, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
