package o;

import java.util.Map;
import o.TraceApi29Impl;
/* loaded from: classes5.dex */
public class ArcMotion implements TraceApi29Impl.values {
    public final /* synthetic */ String ag$a;
    public final /* synthetic */ TraceApi29Impl ah$a;
    public final /* synthetic */ getMinimumHorizontalAngle toString;
    public final /* synthetic */ String values;

    public ArcMotion(TraceApi29Impl traceApi29Impl, String str, String str2, getMinimumHorizontalAngle getminimumhorizontalangle) {
        this.ah$a = traceApi29Impl;
        this.values = str;
        this.ag$a = str2;
        this.toString = getminimumhorizontalangle;
    }

    @Override // o.TraceApi29Impl.values
    public void toString(Map<String, String> map) {
        this.ah$a.ah$a.ag$a(this.values, map, this.ag$a, this.toString, false);
    }
}
