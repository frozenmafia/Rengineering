package com.sendbird.android;

import com.sendbird.android.BaseChannel;
import com.sendbird.android.constant.StringSet;
import com.sendbird.android.shadow.com.google.gson.JsonElement;
import com.sendbird.android.shadow.com.google.gson.JsonObject;
/* loaded from: classes5.dex */
public final class ReadStatus {
    private String mChannelType;
    private String mChannelUrl;
    private User mReader;
    private long mTimestamp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReadStatus(JsonElement jsonElement) {
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        this.mReader = new User(asJsonObject.get("user"));
        this.mTimestamp = asJsonObject.get(StringSet.ts).getAsLong();
        this.mChannelUrl = asJsonObject.has(StringSet.channel_url) ? asJsonObject.get(StringSet.channel_url).getAsString() : "";
        this.mChannelType = asJsonObject.has(StringSet.channel_type) ? asJsonObject.get(StringSet.channel_type).getAsString() : BaseChannel.ChannelType.GROUP.value();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReadStatus(User user, long j) {
        this.mReader = user;
        this.mTimestamp = j;
    }

    public long getTimestamp() {
        return this.mTimestamp;
    }

    public User getReader() {
        return this.mReader;
    }

    String getChannelUrl() {
        return this.mChannelUrl;
    }

    String getChannelType() {
        return this.mChannelType;
    }

    public int hashCode() {
        return HashUtils.generateHashCode(getChannelUrl(), Long.valueOf(getTimestamp()), getReader());
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            ReadStatus readStatus = (ReadStatus) obj;
            if (getChannelUrl().equals(readStatus.getChannelUrl()) && getTimestamp() == readStatus.getTimestamp() && getReader().equals(readStatus.getReader())) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "ReadStatus{mReader=" + this.mReader + ", mTimestamp=" + this.mTimestamp + ", mChannelUrl='" + this.mChannelUrl + "', mChannelType='" + this.mChannelType + "'}";
    }
}
