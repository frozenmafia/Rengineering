package com.app.dream11.model;

import com.app.dream11.utils.NameValuePair;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class NewEvents {
    private final EventCategory category;
    Map<String, Serializable> map;
    String name;

    public NewEvents(String str, EventCategory eventCategory) {
        this.map = new HashMap();
        this.name = str;
        this.category = eventCategory;
    }

    public NewEvents(String str) {
        this(str, EventCategory.$UNKNOWN);
    }

    public NewEvents addProperty(String str, Serializable serializable) {
        this.map.put(str, serializable);
        return this;
    }

    public NewEvents addProperty(NameValuePair nameValuePair) {
        this.map.put(nameValuePair.getName(), nameValuePair.getValue());
        return this;
    }

    public NewEvents removeProperty(String str) {
        this.map.remove(str);
        return this;
    }

    public EventCategory getCategory() {
        return this.category;
    }

    public String getEventName() {
        return this.name;
    }

    public Map<String, Object> getPropertiesMap() {
        return new HashMap(this.map);
    }

    public Boolean containsKey(String str) {
        return Boolean.valueOf(this.map.containsKey(str));
    }
}
