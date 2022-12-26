package com.giphy.sdk.analytics.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.apxor.androidsdk.core.ce.Constants;
import com.giphy.sdk.analytics.models.enums.ActionType;
import com.giphy.sdk.analytics.models.enums.EventType;
import com.sendbird.android.constant.StringSet;
import java.util.HashMap;
import java.util.Map;
import o.getTargetTypes;
import o.isFullSpan;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class AnalyticsEvent implements Parcelable {
    public static final Parcelable.Creator<AnalyticsEvent> CREATOR = new Creator();
    @isFullSpan(valueOf = "action_type")
    private final ActionType actionType;
    @isFullSpan(valueOf = "analytics_response_payload")
    private final String analyticsResponsePayload;
    private final HashMap<String, String> attributes;
    @isFullSpan(valueOf = Constants.EVENT_TYPE)
    private final EventType eventType;
    @isFullSpan(valueOf = "gif_id")
    private final String gifId;
    @isFullSpan(valueOf = "logged_in_user_id")
    private final String loggedInUserId;
    @isFullSpan(valueOf = "random_id")
    private String randomId;
    private final String tid;
    private final long ts;
    @isFullSpan(valueOf = StringSet.user_id)
    private final String userId;

    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<AnalyticsEvent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AnalyticsEvent createFromParcel(Parcel parcel) {
            runAnimators.ag$a(parcel, "in");
            String readString = parcel.readString();
            HashMap hashMap = null;
            EventType eventType = parcel.readInt() != 0 ? (EventType) Enum.valueOf(EventType.class, parcel.readString()) : null;
            ActionType actionType = parcel.readInt() != 0 ? (ActionType) Enum.valueOf(ActionType.class, parcel.readString()) : null;
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            long readLong = parcel.readLong();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                hashMap = new HashMap(readInt);
                while (readInt != 0) {
                    hashMap.put(parcel.readString(), parcel.readString());
                    readInt--;
                }
            }
            return new AnalyticsEvent(readString, eventType, actionType, readString2, readString3, readLong, hashMap, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AnalyticsEvent[] newArray(int i) {
            return new AnalyticsEvent[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        runAnimators.ag$a(parcel, "parcel");
        parcel.writeString(this.analyticsResponsePayload);
        EventType eventType = this.eventType;
        if (eventType != null) {
            parcel.writeInt(1);
            parcel.writeString(eventType.name());
        } else {
            parcel.writeInt(0);
        }
        ActionType actionType = this.actionType;
        if (actionType != null) {
            parcel.writeInt(1);
            parcel.writeString(actionType.name());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.gifId);
        parcel.writeString(this.tid);
        parcel.writeLong(this.ts);
        HashMap<String, String> hashMap = this.attributes;
        if (hashMap != null) {
            parcel.writeInt(1);
            parcel.writeInt(hashMap.size());
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.userId);
        parcel.writeString(this.loggedInUserId);
        parcel.writeString(this.randomId);
    }

    public AnalyticsEvent(String str, EventType eventType, ActionType actionType, String str2, String str3, long j, HashMap<String, String> hashMap, String str4, String str5, String str6) {
        runAnimators.ag$a(str, "analyticsResponsePayload");
        this.analyticsResponsePayload = str;
        this.eventType = eventType;
        this.actionType = actionType;
        this.gifId = str2;
        this.tid = str3;
        this.ts = j;
        this.attributes = hashMap;
        this.userId = str4;
        this.loggedInUserId = str5;
        this.randomId = str6;
    }

    public /* synthetic */ AnalyticsEvent(String str, EventType eventType, ActionType actionType, String str2, String str3, long j, HashMap hashMap, String str4, String str5, String str6, int i, getTargetTypes gettargettypes) {
        this(str, (i & 2) != 0 ? null : eventType, (i & 4) != 0 ? null : actionType, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? 0L : j, (i & 64) != 0 ? null : hashMap, str4, str5, str6);
    }

    public final EventType getEventType() {
        return this.eventType;
    }

    public final ActionType getActionType() {
        return this.actionType;
    }

    public final String getGifId() {
        return this.gifId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getRandomId() {
        return this.randomId;
    }

    public final void setRandomId(String str) {
        this.randomId = str;
    }
}
