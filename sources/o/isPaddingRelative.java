package o;

import java.util.Date;
import java.util.Map;
/* loaded from: classes3.dex */
public final class isPaddingRelative extends isLaidOut {
    private Date ag$a;
    private String ah$a;
    private Long valueOf;
    private Long values;

    public final Long HaptikWebView() {
        return this.valueOf;
    }

    public final Long HaptikSDK$e() {
        return this.values;
    }

    public final String getSignupData() {
        return this.ah$a;
    }

    public final Date getInitSettings() {
        return this.ag$a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isPaddingRelative(isInLayout isinlayout, Boolean bool, String str, String str2, Long l, Map<String, Object> map, Long l2, Long l3, String str3, Date date) {
        super(isinlayout, isinlayout.valueOf(), bool, str, str2, l, map);
        runAnimators.valueOf(isinlayout, "buildInfo");
        runAnimators.valueOf(map, "runtimeVersions");
        this.valueOf = l2;
        this.values = l3;
        this.ah$a = str3;
        this.ag$a = date;
    }

    @Override // o.isLaidOut
    public void valueOf(setBackgroundTintMode setbackgroundtintmode) {
        runAnimators.valueOf(setbackgroundtintmode, "writer");
        super.valueOf(setbackgroundtintmode);
        setbackgroundtintmode.ag$a("freeDisk").values(this.valueOf);
        setbackgroundtintmode.ag$a("freeMemory").values(this.values);
        setbackgroundtintmode.ag$a("orientation").valueOf(this.ah$a);
        if (this.ag$a != null) {
            setbackgroundtintmode.ag$a("time").ag$a(this.ag$a);
        }
    }
}
