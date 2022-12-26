package com.facebook.appevents.codeless.internal;

import com.apxor.androidsdk.core.ce.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import o.getReturnTransition;
import o.getTargetTypes;
import o.runAnimators;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public final class EventBinding {
    public static final toString values = new toString(null);
    private final String HaptikSDK$a;
    private final List<getReturnTransition> HaptikSDK$b;
    private final ActionType HaptikSDK$c;
    private final String ag$a;
    private final String ah$a;
    private final MappingMethod ah$b;
    private final List<PathComponent> invoke;
    private final String toString;
    private final String valueOf;

    public EventBinding(String str, MappingMethod mappingMethod, ActionType actionType, String str2, List<PathComponent> list, List<getReturnTransition> list2, String str3, String str4, String str5) {
        runAnimators.ag$a(str, "eventName");
        runAnimators.ag$a(mappingMethod, "method");
        runAnimators.ag$a(actionType, "type");
        runAnimators.ag$a(str2, "appVersion");
        runAnimators.ag$a(list, ClientCookie.PATH_ATTR);
        runAnimators.ag$a(list2, "parameters");
        runAnimators.ag$a(str3, "componentId");
        runAnimators.ag$a(str4, "pathType");
        runAnimators.ag$a(str5, "activityName");
        this.valueOf = str;
        this.ah$b = mappingMethod;
        this.HaptikSDK$c = actionType;
        this.ah$a = str2;
        this.invoke = list;
        this.HaptikSDK$b = list2;
        this.toString = str3;
        this.HaptikSDK$a = str4;
        this.ag$a = str5;
    }

    public final String ag$a() {
        return this.valueOf;
    }

    public final String valueOf() {
        return this.ag$a;
    }

    public final List<PathComponent> values() {
        List<PathComponent> unmodifiableList = Collections.unmodifiableList(this.invoke);
        runAnimators.ah$a(unmodifiableList, "unmodifiableList(path)");
        return unmodifiableList;
    }

    public final List<getReturnTransition> ah$a() {
        List<getReturnTransition> unmodifiableList = Collections.unmodifiableList(this.HaptikSDK$b);
        runAnimators.ah$a(unmodifiableList, "unmodifiableList(parameters)");
        return unmodifiableList;
    }

    /* loaded from: classes4.dex */
    public enum MappingMethod {
        MANUAL,
        INFERENCE;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static MappingMethod[] valuesCustom() {
            MappingMethod[] valuesCustom = values();
            return (MappingMethod[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* loaded from: classes4.dex */
    public enum ActionType {
        CLICK,
        SELECTED,
        TEXT_CHANGED;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static ActionType[] valuesCustom() {
            ActionType[] valuesCustom = values();
            return (ActionType[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* loaded from: classes4.dex */
    public static final class toString {
        public /* synthetic */ toString(getTargetTypes gettargettypes) {
            this();
        }

        private toString() {
        }

        public final List<EventBinding> valueOf(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                int i = 0;
                try {
                    int length = jSONArray.length();
                    if (length > 0) {
                        while (true) {
                            int i2 = i + 1;
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            runAnimators.ah$a(jSONObject, "array.getJSONObject(i)");
                            arrayList.add(toString(jSONObject));
                            if (i2 >= length) {
                                break;
                            }
                            i = i2;
                        }
                    }
                } catch (IllegalArgumentException | JSONException unused) {
                }
            }
            return arrayList;
        }

        public final EventBinding toString(JSONObject jSONObject) throws JSONException, IllegalArgumentException {
            int length;
            runAnimators.ag$a(jSONObject, "mapping");
            String string = jSONObject.getString("event_name");
            String string2 = jSONObject.getString("method");
            runAnimators.ah$a(string2, "mapping.getString(\"method\")");
            Locale locale = Locale.ENGLISH;
            runAnimators.ah$a(locale, "ENGLISH");
            String upperCase = string2.toUpperCase(locale);
            runAnimators.ah$a(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            MappingMethod valueOf = MappingMethod.valueOf(upperCase);
            String string3 = jSONObject.getString(Constants.EVENT_TYPE);
            runAnimators.ah$a(string3, "mapping.getString(\"event_type\")");
            Locale locale2 = Locale.ENGLISH;
            runAnimators.ah$a(locale2, "ENGLISH");
            String upperCase2 = string3.toUpperCase(locale2);
            runAnimators.ah$a(upperCase2, "(this as java.lang.String).toUpperCase(locale)");
            ActionType valueOf2 = ActionType.valueOf(upperCase2);
            String string4 = jSONObject.getString(com.apxor.androidsdk.core.Constants.VERSION);
            JSONArray jSONArray = jSONObject.getJSONArray(ClientCookie.PATH_ATTR);
            ArrayList arrayList = new ArrayList();
            int length2 = jSONArray.length();
            int i = 0;
            if (length2 > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    runAnimators.ah$a(jSONObject2, "jsonPath");
                    arrayList.add(new PathComponent(jSONObject2));
                    if (i3 >= length2) {
                        break;
                    }
                    i2 = i3;
                }
            }
            String optString = jSONObject.optString("path_type", "absolute");
            JSONArray optJSONArray = jSONObject.optJSONArray("parameters");
            ArrayList arrayList2 = new ArrayList();
            if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
                while (true) {
                    int i4 = i + 1;
                    JSONObject jSONObject3 = optJSONArray.getJSONObject(i);
                    runAnimators.ah$a(jSONObject3, "jsonParameter");
                    arrayList2.add(new getReturnTransition(jSONObject3));
                    if (i4 >= length) {
                        break;
                    }
                    i = i4;
                }
            }
            String optString2 = jSONObject.optString("component_id");
            String optString3 = jSONObject.optString("activity_name");
            runAnimators.ah$a(string, "eventName");
            runAnimators.ah$a(string4, "appVersion");
            runAnimators.ah$a(optString2, "componentId");
            runAnimators.ah$a(optString, "pathType");
            runAnimators.ah$a(optString3, "activityName");
            return new EventBinding(string, valueOf, valueOf2, string4, arrayList, arrayList2, optString2, optString, optString3);
        }
    }
}
