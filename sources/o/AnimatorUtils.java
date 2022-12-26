package o;

import android.os.AsyncTask;
import java.util.Map;
import o.TraceApi29Impl;
/* loaded from: classes5.dex */
public class AnimatorUtils implements TraceApi29Impl.values {
    public final /* synthetic */ TraceApi29Impl ah$a;
    public final /* synthetic */ getMinimumHorizontalAngle toString;
    public final /* synthetic */ String valueOf;
    public final /* synthetic */ String values;

    /* loaded from: classes5.dex */
    public class AnimatorPauseListenerCompat extends AsyncTask<Void, Void, setMinimumHorizontalAngle$ah$a> {
        public final /* synthetic */ setMinimumHorizontalAngle HaptikSDK$a;
        public final /* synthetic */ String ag$a;
        public final /* synthetic */ boolean ah$a;
        public final /* synthetic */ String invoke;
        public final /* synthetic */ Map toString;
        public final /* synthetic */ boolean valueOf;
        public final /* synthetic */ getMinimumHorizontalAngle values;

        public AnimatorPauseListenerCompat(setMinimumHorizontalAngle setminimumhorizontalangle, String str, boolean z, boolean z2, Map map, String str2, getMinimumHorizontalAngle getminimumhorizontalangle) {
            this.HaptikSDK$a = setminimumhorizontalangle;
            this.ag$a = str;
            this.valueOf = z;
            this.ah$a = z2;
            this.toString = map;
            this.invoke = str2;
            this.values = getminimumhorizontalangle;
        }

        @Override // android.os.AsyncTask
        public setMinimumHorizontalAngle$ah$a doInBackground(Void[] voidArr) {
            setMinimumHorizontalAngle setminimumhorizontalangle = this.HaptikSDK$a;
            return setminimumhorizontalangle.valueOf(this.ag$a, this.valueOf, this.ah$a, false, this.toString, this.invoke, setminimumhorizontalangle.ah$a).values();
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(setMinimumHorizontalAngle$ah$a setminimumhorizontalangle_ah_a) {
            setMinimumHorizontalAngle$ah$a setminimumhorizontalangle_ah_a2 = setminimumhorizontalangle_ah_a;
            getMinimumHorizontalAngle getminimumhorizontalangle = this.values;
            setminimumhorizontalangle_ah_a2.getClass();
            if (getminimumhorizontalangle != null) {
                if (setminimumhorizontalangle_ah_a2.ah$a) {
                    getminimumhorizontalangle.chmha(setminimumhorizontalangle_ah_a2.values);
                } else {
                    getminimumhorizontalangle.irjuc(setminimumhorizontalangle_ah_a2.valueOf, setminimumhorizontalangle_ah_a2.values);
                }
            }
        }
    }

    public AnimatorUtils(TraceApi29Impl traceApi29Impl, String str, String str2, getMinimumHorizontalAngle getminimumhorizontalangle) {
        this.ah$a = traceApi29Impl;
        this.values = str;
        this.valueOf = str2;
        this.toString = getminimumhorizontalangle;
    }

    @Override // o.TraceApi29Impl.values
    public void toString(Map<String, String> map) {
        this.ah$a.ah$a.ag$a(this.values, map, this.valueOf, this.toString, false);
    }
}
