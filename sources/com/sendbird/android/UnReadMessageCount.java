package com.sendbird.android;

import com.sendbird.android.constant.StringSet;
import com.sendbird.android.shadow.com.google.gson.JsonElement;
import com.sendbird.android.shadow.com.google.gson.JsonObject;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class UnReadMessageCount {
    private Map<String, Integer> customTypeMap;
    private long timestamp;
    private int totalCount;
    private int totalCountByCustomTypes;

    /* JADX INFO: Access modifiers changed from: package-private */
    public UnReadMessageCount() {
        init();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void init() {
        this.totalCount = 0;
        this.totalCountByCustomTypes = 0;
        Map<String, Integer> map = this.customTypeMap;
        if (map == null) {
            this.customTypeMap = new ConcurrentHashMap();
        } else {
            map.clear();
        }
        this.timestamp = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean update(JsonObject jsonObject) {
        boolean z;
        JsonObject asJsonObject = jsonObject.getAsJsonObject(StringSet.unread_cnt);
        int i = 0;
        if (asJsonObject != null) {
            long asLong = asJsonObject.has(StringSet.ts) ? asJsonObject.get(StringSet.ts).getAsLong() : 0L;
            if (asLong > this.timestamp) {
                this.timestamp = asLong;
                int asInt = asJsonObject.has("all") ? asJsonObject.get("all").getAsInt() : this.totalCount;
                if (asInt != this.totalCount) {
                    this.totalCount = asInt;
                    z = true;
                } else {
                    z = false;
                }
                if (asJsonObject.has(StringSet.custom_types)) {
                    for (Map.Entry<String, JsonElement> entry : asJsonObject.getAsJsonObject(StringSet.custom_types).entrySet()) {
                        if (entry.getValue().isJsonPrimitive()) {
                            String key = entry.getKey();
                            int asInt2 = entry.getValue().getAsInt();
                            if (!this.customTypeMap.containsKey(key) || this.customTypeMap.get(key).intValue() != asInt2) {
                                this.customTypeMap.put(key, Integer.valueOf(asInt2));
                                z = true;
                            }
                        }
                    }
                    for (Integer num : this.customTypeMap.values()) {
                        if (num != null) {
                            i += num.intValue();
                        }
                    }
                    if (i != this.totalCountByCustomTypes) {
                        this.totalCountByCustomTypes = i;
                        return true;
                    }
                }
                return z;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getTotalCount() {
        return this.totalCount;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getTotalCountByCustomTypes() {
        return this.totalCountByCustomTypes;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getCustomTypeUnreadMessageCount(String str) {
        Integer num;
        if (str == null || (num = this.customTypeMap.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    public Map<String, Integer> getCustomTypeMap() {
        return this.customTypeMap;
    }
}
