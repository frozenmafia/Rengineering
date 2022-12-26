package o;

import android.util.Log;
import com.conviva.api.SystemSettings;
/* loaded from: classes4.dex */
public class setActivationDelay implements getEdgeValue {
    protected final String values = "CONVIVA";

    @Override // o.getEdgeValue
    public void valueOf() {
    }

    @Override // o.getEdgeValue
    public void valueOf(String str, SystemSettings.LogLevel logLevel) {
        if (logLevel == SystemSettings.LogLevel.DEBUG) {
            Log.d("CONVIVA", str);
        } else if (logLevel == SystemSettings.LogLevel.ERROR) {
            Log.e("CONVIVA", str);
        } else if (logLevel == SystemSettings.LogLevel.INFO) {
            Log.i("CONVIVA", str);
        } else if (logLevel == SystemSettings.LogLevel.WARNING) {
            Log.w("CONVIVA", str);
        }
    }
}
