package irjuc.irjuc.cqqlq.irjuc.qwsnv.gvumm;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.List;
import o.AutoTransition;
import o.beginAsyncSectionFallback;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class rmqfk extends irjuc.irjuc.cqqlq.irjuc.rmqfk.jmjou implements Parcelable {
    public static final Parcelable.Creator<rmqfk> CREATOR = new values();

    /* loaded from: classes5.dex */
    public static final class values implements Parcelable.Creator<rmqfk> {
        @Override // android.os.Parcelable.Creator
        public rmqfk createFromParcel(Parcel parcel) {
            return new rmqfk(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public rmqfk[] newArray(int i) {
            return new rmqfk[i];
        }
    }

    public rmqfk() {
    }

    public rmqfk(Parcel parcel) {
        super(parcel);
    }

    public String ah$a() {
        return (String) get("code");
    }

    @Override // irjuc.irjuc.cqqlq.irjuc.rmqfk.jmjou, android.os.Parcelable
    public int describeContents() {
        return super.describeContents();
    }

    public String valueOf() {
        return (String) AutoTransition.get(values(), "redirectURL");
    }

    public final JSONObject values() {
        return (JSONObject) get("data");
    }

    @Override // irjuc.irjuc.cqqlq.irjuc.rmqfk.jmjou, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    public List<irjuc.irjuc.cqqlq.irjuc.rmqfk.cqqlq> ag$a() {
        irjuc.irjuc.cqqlq.irjuc.rmqfk.cqqlq cqqlqVar;
        getObjectFactory().getClass();
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray = (JSONArray) AutoTransition.get(values(), "filteredUpiApps");
        } catch (Exception e) {
            beginAsyncSectionFallback.valueOf("RedirectResponse", e.getMessage(), e);
        }
        if (jSONArray != null && jSONArray.length() != 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = (JSONObject) AutoTransition.get(jSONArray, i);
                if (jSONObject != null && (cqqlqVar = (irjuc.irjuc.cqqlq.irjuc.rmqfk.cqqlq) AutoTransition.fromJsonString(jSONObject.toString(), getObjectFactory(), irjuc.irjuc.cqqlq.irjuc.rmqfk.cqqlq.class)) != null) {
                    Boolean bool = (Boolean) cqqlqVar.get(ViewProps.ENABLED);
                    if (bool == null ? true : bool.booleanValue()) {
                        arrayList.add(cqqlqVar);
                    }
                }
            }
        }
        return arrayList;
    }
}
