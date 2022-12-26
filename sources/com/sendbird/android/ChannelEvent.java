package com.sendbird.android;

import com.sendbird.android.BaseChannel;
import com.sendbird.android.constant.StringSet;
import com.sendbird.android.shadow.com.google.gson.JsonElement;
import com.sendbird.android.shadow.com.google.gson.JsonObject;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class ChannelEvent {
    private final ChannelEventCategory category;
    private final String channelType;
    private final String channelUrl;
    private final Map<String, JsonElement> data = new ConcurrentHashMap();
    private final JsonObject obj;
    private final long ts;

    public ChannelEvent(JsonElement jsonElement) {
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        this.obj = asJsonObject;
        this.category = ChannelEventCategory.from(asJsonObject.has("cat") ? asJsonObject.get("cat").getAsInt() : 0);
        JsonObject asJsonObject2 = asJsonObject.has("data") ? asJsonObject.get("data").getAsJsonObject() : null;
        if (asJsonObject2 != null) {
            for (Map.Entry<String, JsonElement> entry : asJsonObject2.entrySet()) {
                this.data.put(entry.getKey(), entry.getValue());
            }
        }
        this.channelUrl = this.obj.has(StringSet.channel_url) ? this.obj.get(StringSet.channel_url).getAsString() : "";
        this.channelType = this.obj.has(StringSet.channel_type) ? this.obj.get(StringSet.channel_type).getAsString() : BaseChannel.ChannelType.GROUP.value();
        this.ts = this.obj.has(StringSet.ts) ? this.obj.get(StringSet.ts).getAsLong() : 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JsonElement getData() {
        if (this.obj.has("data")) {
            return this.obj.get("data").getAsJsonObject();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChannelEventCategory getCategory() {
        return this.category;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getChannelUrl() {
        return this.channelUrl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getTs() {
        return this.ts;
    }

    public JsonObject toJsonObject() {
        return this.obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isGroupChannel() {
        return this.channelType.equals(BaseChannel.ChannelType.GROUP.value());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isOpenChannel() {
        return this.channelType.equals(BaseChannel.ChannelType.OPEN.value());
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            ChannelEvent channelEvent = (ChannelEvent) obj;
            if (getCategory() == channelEvent.getCategory() && getChannelUrl().equals(channelEvent.getChannelUrl()) && getTs() == channelEvent.getTs()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return HashUtils.generateHashCode(getCategory(), getChannelUrl(), Long.valueOf(getTs()));
    }

    public String toString() {
        return "ChannelEvent{obj=" + this.obj + ", category=" + this.category + ", data=" + this.data + ", channelUrl='" + this.channelUrl + "', channelType='" + this.channelType + "', ts=" + this.ts + '}';
    }
}
