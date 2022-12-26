package com.clevertap.android.sdk.displayunits.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.clevertap.android.sdk.displayunits.CTDisplayUnitType;
import com.dreampay.commons.constants.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import o.setBoundsInScreen;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class CleverTapDisplayUnit implements Parcelable {
    public static final Parcelable.Creator<CleverTapDisplayUnit> CREATOR = new Parcelable.Creator<CleverTapDisplayUnit>() { // from class: com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnit.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: values */
        public CleverTapDisplayUnit createFromParcel(Parcel parcel) {
            return new CleverTapDisplayUnit(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: toString */
        public CleverTapDisplayUnit[] newArray(int i) {
            return new CleverTapDisplayUnit[i];
        }
    };
    private String HaptikSDK$a;
    private CTDisplayUnitType HaptikSDK$b;
    private ArrayList<CleverTapDisplayUnitContent> ag$a;
    private String ah$a;
    private JSONObject toString;
    private String valueOf;
    private HashMap<String, String> values;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static CleverTapDisplayUnit valueOf(JSONObject jSONObject) {
        try {
            String string = jSONObject.has("wzrk_id") ? jSONObject.getString("wzrk_id") : "0_0";
            CTDisplayUnitType type = jSONObject.has("type") ? CTDisplayUnitType.type(jSONObject.getString("type")) : null;
            String string2 = jSONObject.has("bg") ? jSONObject.getString("bg") : "";
            JSONArray jSONArray = jSONObject.has("content") ? jSONObject.getJSONArray("content") : null;
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    CleverTapDisplayUnitContent ag$a = CleverTapDisplayUnitContent.ag$a(jSONArray.getJSONObject(i));
                    if (TextUtils.isEmpty(ag$a.valueOf())) {
                        arrayList.add(ag$a);
                    }
                }
            }
            return new CleverTapDisplayUnit(jSONObject, string, type, string2, arrayList, jSONObject.has("custom_kv") ? jSONObject.getJSONObject("custom_kv") : null, null);
        } catch (Exception e) {
            setBoundsInScreen.values("DisplayUnit : ", "Unable to init CleverTapDisplayUnit with JSON - " + e.getLocalizedMessage());
            return new CleverTapDisplayUnit(null, "", null, null, null, null, "Error Creating Display Unit from JSON : " + e.getLocalizedMessage());
        }
    }

    private CleverTapDisplayUnit(JSONObject jSONObject, String str, CTDisplayUnitType cTDisplayUnitType, String str2, ArrayList<CleverTapDisplayUnitContent> arrayList, JSONObject jSONObject2, String str3) {
        this.toString = jSONObject;
        this.HaptikSDK$a = str;
        this.HaptikSDK$b = cTDisplayUnitType;
        this.ah$a = str2;
        this.ag$a = arrayList;
        this.values = ah$a(jSONObject2);
        this.valueOf = str3;
    }

    private CleverTapDisplayUnit(Parcel parcel) {
        try {
            this.HaptikSDK$a = parcel.readString();
            this.HaptikSDK$b = (CTDisplayUnitType) parcel.readValue(CTDisplayUnitType.class.getClassLoader());
            this.ah$a = parcel.readString();
            JSONObject jSONObject = null;
            if (parcel.readByte() == 1) {
                ArrayList<CleverTapDisplayUnitContent> arrayList = new ArrayList<>();
                this.ag$a = arrayList;
                parcel.readList(arrayList, CleverTapDisplayUnitContent.class.getClassLoader());
            } else {
                this.ag$a = null;
            }
            this.values = parcel.readHashMap(null);
            if (parcel.readByte() != 0) {
                jSONObject = new JSONObject(parcel.readString());
            }
            this.toString = jSONObject;
            this.valueOf = parcel.readString();
        } catch (Exception e) {
            String str = "Error Creating Display Unit from parcel : " + e.getLocalizedMessage();
            this.valueOf = str;
            setBoundsInScreen.values("DisplayUnit : ", str);
        }
    }

    public String ag$a() {
        return this.valueOf;
    }

    public JSONObject ah$a() {
        return this.toString;
    }

    public String values() {
        return this.HaptikSDK$a;
    }

    public JSONObject valueOf() {
        try {
            JSONObject jSONObject = this.toString;
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                JSONObject jSONObject2 = new JSONObject();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (next.startsWith("wzrk_")) {
                        jSONObject2.put(next, this.toString.get(next));
                    }
                }
                return jSONObject2;
            }
            return null;
        } catch (Exception e) {
            setBoundsInScreen.values("DisplayUnit : ", "Error in getting WiZRK fields " + e.getLocalizedMessage());
            return null;
        }
    }

    public String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(" Unit id- ");
            sb.append(this.HaptikSDK$a);
            sb.append(", Type- ");
            CTDisplayUnitType cTDisplayUnitType = this.HaptikSDK$b;
            sb.append(cTDisplayUnitType != null ? cTDisplayUnitType.toString() : null);
            sb.append(", bgColor- ");
            sb.append(this.ah$a);
            ArrayList<CleverTapDisplayUnitContent> arrayList = this.ag$a;
            if (arrayList != null && !arrayList.isEmpty()) {
                for (int i = 0; i < this.ag$a.size(); i++) {
                    CleverTapDisplayUnitContent cleverTapDisplayUnitContent = this.ag$a.get(i);
                    if (cleverTapDisplayUnitContent != null) {
                        sb.append(", Content Item:");
                        sb.append(i);
                        sb.append(Constants.WHITE_SPACE);
                        sb.append(cleverTapDisplayUnitContent.toString());
                        sb.append("\n");
                    }
                }
            }
            if (this.values != null) {
                sb.append(", Custom KV:");
                sb.append(this.values);
            }
            sb.append(", JSON -");
            sb.append(this.toString);
            sb.append(", Error-");
            sb.append(this.valueOf);
            sb.append(" ]");
            return sb.toString();
        } catch (Exception e) {
            setBoundsInScreen.values("DisplayUnit : ", "Exception in toString:" + e);
            return super.toString();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.HaptikSDK$a);
        parcel.writeValue(this.HaptikSDK$b);
        parcel.writeString(this.ah$a);
        if (this.ag$a == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeList(this.ag$a);
        }
        parcel.writeMap(this.values);
        if (this.toString == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeString(this.toString.toString());
        }
        parcel.writeString(this.valueOf);
    }

    HashMap<String, String> ah$a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                Iterator<String> keys = jSONObject.keys();
                if (keys != null) {
                    HashMap<String, String> hashMap = null;
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String string = jSONObject.getString(next);
                        if (!TextUtils.isEmpty(next)) {
                            if (hashMap == null) {
                                hashMap = new HashMap<>();
                            }
                            hashMap.put(next, string);
                        }
                    }
                    return hashMap;
                }
            } catch (Exception e) {
                setBoundsInScreen.values("DisplayUnit : ", "Error in getting Key Value Pairs " + e.getLocalizedMessage());
            }
        }
        return null;
    }
}
