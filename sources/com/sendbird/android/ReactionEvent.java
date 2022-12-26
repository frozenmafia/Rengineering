package com.sendbird.android;

import com.sendbird.android.constant.StringSet;
import com.sendbird.android.shadow.com.google.gson.JsonElement;
import com.sendbird.android.shadow.com.google.gson.JsonObject;
import org.apache.http.client.methods.HttpDelete;
/* loaded from: classes5.dex */
public class ReactionEvent {
    private final String key;
    private long messageId;
    private final ReactionEventAction operation;
    private final long updatedAt;
    private final String userId;

    /* loaded from: classes5.dex */
    public enum ReactionEventAction {
        ADD,
        DELETE
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReactionEvent(JsonElement jsonElement) {
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        if (asJsonObject.has(StringSet.msg_id)) {
            this.messageId = asJsonObject.get(StringSet.msg_id).getAsLong();
        }
        this.key = asJsonObject.get("reaction").getAsString();
        this.userId = asJsonObject.get(StringSet.user_id).getAsString();
        if (asJsonObject.get("operation").getAsString().equals("ADD")) {
            this.operation = ReactionEventAction.ADD;
        } else {
            this.operation = ReactionEventAction.DELETE;
        }
        this.updatedAt = asJsonObject.has(StringSet.updated_at) ? asJsonObject.get(StringSet.updated_at).getAsLong() : 0L;
    }

    JsonElement toJson() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(StringSet.msg_id, Long.valueOf(this.messageId));
        String str = this.key;
        if (str != null) {
            jsonObject.addProperty("reaction", str);
        }
        String str2 = this.userId;
        if (str2 != null) {
            jsonObject.addProperty(StringSet.user_id, str2);
        }
        if (this.operation == ReactionEventAction.ADD) {
            jsonObject.addProperty("operation", "ADD");
        } else if (this.operation == ReactionEventAction.DELETE) {
            jsonObject.addProperty("operation", HttpDelete.METHOD_NAME);
        }
        jsonObject.addProperty(StringSet.updated_at, Long.valueOf(this.updatedAt));
        return jsonObject;
    }

    public long getMessageId() {
        return this.messageId;
    }

    public String getKey() {
        return this.key;
    }

    public String getUserId() {
        return this.userId;
    }

    public ReactionEventAction getOperation() {
        return this.operation;
    }

    public long getUpdatedAt() {
        return this.updatedAt;
    }

    public String toString() {
        return "ReactionEvent{messageId=" + this.messageId + ", key='" + this.key + "', userId='" + this.userId + "', operation=" + this.operation + ", updatedAt=" + this.updatedAt + '}';
    }
}
