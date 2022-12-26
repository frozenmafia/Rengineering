package com.sendbird.android;

import com.sendbird.android.constant.StringSet;
import com.sendbird.android.shadow.com.google.gson.JsonArray;
import com.sendbird.android.shadow.com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes5.dex */
public class MessageMetaArray {
    private String mKey;
    private List<String> mValue;

    public MessageMetaArray(String str) {
        this.mKey = str;
        this.mValue = new ArrayList();
    }

    public MessageMetaArray(String str, List<String> list) {
        this.mKey = str;
        this.mValue = new ArrayList(list);
    }

    public String getKey() {
        return this.mKey;
    }

    public List<String> getValue() {
        return new ArrayList(this.mValue);
    }

    public void addValue(String str) {
        synchronized (this) {
            this.mValue.add(str);
        }
    }

    public void addValue(List<String> list) {
        for (String str : list) {
            addValue(str);
        }
    }

    public void removeValue(String str) {
        synchronized (this) {
            this.mValue.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setValue(List<String> list) {
        synchronized (this) {
            this.mValue = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JsonObject toJson() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(StringSet.key, this.mKey);
        JsonArray jsonArray = new JsonArray();
        for (String str : this.mValue) {
            jsonArray.add(str);
        }
        jsonObject.add("value", jsonArray);
        return jsonObject;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        MessageMetaArray messageMetaArray = (MessageMetaArray) obj;
        String str = this.mKey;
        if (str == null) {
            return false;
        }
        return str.equals(messageMetaArray.mKey);
    }

    public int hashCode() {
        return HashUtils.generateHashCode(this.mKey);
    }

    public String toString() {
        return "MessageMetaArray{mKey='" + this.mKey + "', mValue=" + this.mValue + '}';
    }
}
