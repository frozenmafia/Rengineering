package o;

import android.os.Bundle;
import java.util.Calendar;
import java.util.TimeZone;
/* loaded from: classes7.dex */
public class createFromFile {
    private Calendar toString = Calendar.getInstance();

    public createFromFile(Bundle bundle) {
        if (bundle != null && bundle.containsKey("value")) {
            values(bundle.getLong("value"));
        }
        if (bundle == null || !bundle.containsKey("timeZoneOffsetInMinutes")) {
            return;
        }
        this.toString.setTimeZone(TimeZone.getTimeZone("GMT"));
        this.toString.add(14, Integer.valueOf(bundle.getInt("timeZoneOffsetInMinutes", Long.valueOf(bundle.getLong("timeZoneOffsetInMinutes")).intValue())).intValue() * 60000);
    }

    public void values(long j) {
        this.toString.setTimeInMillis(j);
    }

    public int HaptikSDK$b() {
        return this.toString.get(1);
    }

    public int ag$a() {
        return this.toString.get(2);
    }

    public int valueOf() {
        return this.toString.get(5);
    }

    public int ah$a() {
        return this.toString.get(11);
    }

    public int values() {
        return this.toString.get(12);
    }
}
