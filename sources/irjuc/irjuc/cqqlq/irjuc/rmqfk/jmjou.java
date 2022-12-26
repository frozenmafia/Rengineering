package irjuc.irjuc.cqqlq.irjuc.rmqfk;

import android.os.Parcel;
import android.os.Parcelable;
import irjuc.irjuc.cqqlq.irjuc.jmjou.jmjou;
import o.AutoTransition;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class jmjou extends AutoTransition implements Parcelable {
    public static final Parcelable.Creator<jmjou> CREATOR = new valueOf();
    public irjuc.irjuc.cqqlq.irjuc.jmjou.jmjou cqqlq;

    /* renamed from: irjuc  reason: collision with root package name */
    public JSONObject f1423irjuc;

    /* loaded from: classes5.dex */
    public static final class valueOf implements Parcelable.Creator<jmjou> {
        @Override // android.os.Parcelable.Creator
        public jmjou createFromParcel(Parcel parcel) {
            return new jmjou(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public jmjou[] newArray(int i) {
            return new jmjou[i];
        }
    }

    public jmjou() {
    }

    public jmjou(Parcel parcel) {
        irjuc.irjuc.cqqlq.irjuc.jmjou.jmjou jmjouVar = (irjuc.irjuc.cqqlq.irjuc.jmjou.jmjou) parcel.readParcelable(jmjou.class.getClassLoader());
        this.cqqlq = jmjouVar;
        this.f1423irjuc = jmjouVar.ah$a(parcel.readString());
    }

    public int describeContents() {
        return 0;
    }

    @Override // o.AutoTransition
    public JSONObject getJsonObject() {
        return this.f1423irjuc;
    }

    @Override // o.AutoTransition
    public irjuc.irjuc.cqqlq.irjuc.jmjou.jmjou getObjectFactory() {
        return this.cqqlq;
    }

    public JSONObject toJsonObject() {
        return getJsonObject();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.cqqlq, i);
        parcel.writeString(getJsonObject().toString());
    }

    @Override // o.AutoTransition, o.handleException
    public void init(irjuc.irjuc.cqqlq.irjuc.jmjou.jmjou jmjouVar, jmjou.chmha chmhaVar) {
        super.init(jmjouVar, chmhaVar);
        this.cqqlq = jmjouVar;
        if (chmhaVar != null && chmhaVar.containsKey(AutoTransition.TAG)) {
            this.f1423irjuc = (JSONObject) chmhaVar.get(AutoTransition.TAG);
            return;
        }
        getObjectFactory().getClass();
        this.f1423irjuc = new JSONObject();
    }
}
