package com.appsamurai.storyly.util;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public final class h extends Lambda implements Styleable.ChangeBounds<Integer, JSONObject> {
    public final /* synthetic */ JSONArray a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(JSONArray jSONArray) {
        super(1);
        this.a = jSONArray;
    }

    @Override // o.Styleable.ChangeBounds
    public JSONObject invoke(Integer num) {
        Object obj = this.a.get(num.intValue());
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        return null;
    }
}
