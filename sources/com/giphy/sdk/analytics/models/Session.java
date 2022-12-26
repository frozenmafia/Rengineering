package com.giphy.sdk.analytics.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.apxor.androidsdk.core.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.getTargetTypes;
import o.isFullSpan;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class Session implements Parcelable {
    public static final Parcelable.Creator<Session> CREATOR = new Creator();
    private List<AnalyticsEvent> events;
    @isFullSpan(valueOf = Constants.SESSION_ID)
    private String sessionId;

    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<Session> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Session createFromParcel(Parcel parcel) {
            runAnimators.ag$a(parcel, "in");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add(AnalyticsEvent.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            return new Session(readString, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Session[] newArray(int i) {
            return new Session[i];
        }
    }

    public Session() {
        this(null, null, 3, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        runAnimators.ag$a(parcel, "parcel");
        parcel.writeString(this.sessionId);
        List<AnalyticsEvent> list = this.events;
        parcel.writeInt(list.size());
        for (AnalyticsEvent analyticsEvent : list) {
            analyticsEvent.writeToParcel(parcel, 0);
        }
    }

    public Session(String str, List<AnalyticsEvent> list) {
        runAnimators.ag$a(list, Constants.EVENTS_TABLE);
        this.sessionId = str;
        this.events = list;
    }

    public /* synthetic */ Session(String str, ArrayList arrayList, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new ArrayList() : arrayList);
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final void setSessionId(String str) {
        this.sessionId = str;
    }

    public final List<AnalyticsEvent> getEvents() {
        return this.events;
    }

    public final void setEvents(List<AnalyticsEvent> list) {
        runAnimators.ag$a(list, "<set-?>");
        this.events = list;
    }

    public final String getUserId() {
        Object obj;
        Iterator<T> it = this.events.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String userId = ((AnalyticsEvent) obj).getUserId();
            if (!(userId == null || userId.length() == 0)) {
                break;
            }
        }
        AnalyticsEvent analyticsEvent = (AnalyticsEvent) obj;
        if (analyticsEvent != null) {
            return analyticsEvent.getUserId();
        }
        return null;
    }
}
