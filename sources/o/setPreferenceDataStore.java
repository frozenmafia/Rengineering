package o;

import android.os.SystemClock;
/* loaded from: classes7.dex */
public class setPreferenceDataStore implements setOnPreferenceChangeInternalListener {
    @Override // o.setOnPreferenceChangeInternalListener
    public long valueOf() {
        return SystemClock.elapsedRealtime();
    }
}
