package o;

import com.bugsnag.android.BreadcrumbType;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import o.setBackgroundTintMode;
/* loaded from: classes3.dex */
public final class getParentForAccessibility implements setBackgroundTintMode.toString {
    public String ag$a;
    public BreadcrumbType ah$a;
    public final Date toString;
    public Map<String, Object> values;

    public getParentForAccessibility(String str, BreadcrumbType breadcrumbType, Map<String, Object> map, Date date) {
        runAnimators.valueOf(str, "message");
        runAnimators.valueOf(breadcrumbType, "type");
        runAnimators.valueOf(date, "timestamp");
        this.ag$a = str;
        this.ah$a = breadcrumbType;
        this.values = map;
        this.toString = date;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public getParentForAccessibility(String str) {
        this(str, BreadcrumbType.MANUAL, new LinkedHashMap(), new Date());
        runAnimators.valueOf(str, "message");
    }

    @Override // o.setBackgroundTintMode.toString
    public void toStream(setBackgroundTintMode setbackgroundtintmode) throws IOException {
        runAnimators.valueOf(setbackgroundtintmode, "writer");
        setbackgroundtintmode.values();
        setbackgroundtintmode.ag$a("timestamp").ag$a(this.toString);
        setbackgroundtintmode.ag$a("name").valueOf(this.ag$a);
        setbackgroundtintmode.ag$a("type").valueOf(this.ah$a.toString());
        setbackgroundtintmode.ag$a("metaData");
        setbackgroundtintmode.ah$a((Object) this.values, true);
        setbackgroundtintmode.ag$a();
    }
}
