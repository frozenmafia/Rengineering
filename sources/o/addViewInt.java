package o;

import com.google.firebase.database.core.view.QueryParams;
import java.util.Map;
/* loaded from: classes5.dex */
public final class addViewInt {
    private final bindViewHolder toString;
    private final QueryParams values;

    public static addViewInt ah$a(bindViewHolder bindviewholder) {
        return new addViewInt(bindviewholder, QueryParams.valueOf);
    }

    public addViewInt(bindViewHolder bindviewholder, QueryParams queryParams) {
        this.toString = bindviewholder;
        this.values = queryParams;
    }

    public bindViewHolder ag$a() {
        return this.toString;
    }

    public QueryParams values() {
        return this.values;
    }

    public static addViewInt toString(bindViewHolder bindviewholder, Map<String, Object> map) {
        return new addViewInt(bindviewholder, QueryParams.valueOf(map));
    }

    public getDecoratedRight valueOf() {
        return this.values.ah$a();
    }

    public boolean ah$a() {
        return this.values.getInitSettings();
    }

    public boolean HaptikSDK$c() {
        return this.values.HaptikWebView();
    }

    public String toString() {
        return this.toString + ":" + this.values;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        addViewInt addviewint = (addViewInt) obj;
        return this.toString.equals(addviewint.toString) && this.values.equals(addviewint.values);
    }

    public int hashCode() {
        return (this.toString.hashCode() * 31) + this.values.hashCode();
    }
}
