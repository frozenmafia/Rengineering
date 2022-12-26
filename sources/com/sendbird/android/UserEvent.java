package com.sendbird.android;

import com.sendbird.android.shadow.com.google.gson.JsonElement;
import com.sendbird.android.shadow.com.google.gson.JsonObject;
/* loaded from: classes5.dex */
class UserEvent {
    private UserEventCategory category;
    private JsonObject obj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public UserEvent(JsonElement jsonElement) {
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        this.obj = asJsonObject;
        this.category = UserEventCategory.from(asJsonObject.has("cat") ? this.obj.get("cat").getAsInt() : 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public UserEventCategory getCategory() {
        return this.category;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JsonElement getData() {
        if (this.obj.has("data")) {
            return this.obj.get("data").getAsJsonObject();
        }
        return null;
    }

    public boolean equals(Object obj) {
        return obj != null && obj.getClass() == getClass() && getCategory() == ((UserEvent) obj).getCategory();
    }

    public int hashCode() {
        return HashUtils.generateHashCode(getCategory());
    }

    public String toString() {
        return "UserEvent{obj=" + this.obj + ", category=" + this.category + '}';
    }
}
