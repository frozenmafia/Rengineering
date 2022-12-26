package o;

import android.content.SharedPreferences;
import java.util.Date;
/* loaded from: classes5.dex */
public class updateRemainingSpans {
    private final SharedPreferences valueOf;
    static final Date ah$a = new Date(-1);
    static final Date ag$a = new Date(-1);
    private final Object values = new Object();
    private final Object toString = new Object();

    public updateRemainingSpans(SharedPreferences sharedPreferences) {
        this.valueOf = sharedPreferences;
    }

    public long ah$a() {
        return this.valueOf.getLong("fetch_timeout_in_seconds", 60L);
    }

    public long HaptikSDK$c() {
        return this.valueOf.getLong("minimum_fetch_interval_in_seconds", getMinStart.toString);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Date HaptikSDK$b() {
        return new Date(this.valueOf.getLong("last_fetch_time_in_millis", -1L));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String valueOf() {
        return this.valueOf.getString("last_fetch_etag", null);
    }

    public findFirstReferenceChildPosition ag$a() {
        updateSpecWithExtra ag$a2;
        synchronized (this.values) {
            long j = this.valueOf.getLong("last_fetch_time_in_millis", -1L);
            int i = this.valueOf.getInt("last_fetch_status", 0);
            ag$a2 = updateSpecWithExtra.values().toString(i).toString(j).ag$a(new createFullSpanItemFromStart$ah$a().ah$a(this.valueOf.getLong("fetch_timeout_in_seconds", 60L)).valueOf(this.valueOf.getLong("minimum_fetch_interval_in_seconds", getMinStart.toString)).ag$a()).ag$a();
        }
        return ag$a2;
    }

    public void valueOf(createFullSpanItemFromStart createfullspanitemfromstart) {
        synchronized (this.values) {
            this.valueOf.edit().putLong("fetch_timeout_in_seconds", createfullspanitemfromstart.values()).putLong("minimum_fetch_interval_in_seconds", createfullspanitemfromstart.ah$a()).commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void toString(Date date) {
        synchronized (this.values) {
            this.valueOf.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ah$b() {
        synchronized (this.values) {
            this.valueOf.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void HaptikSDK$a() {
        synchronized (this.values) {
            this.valueOf.edit().putInt("last_fetch_status", 2).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void valueOf(String str) {
        synchronized (this.values) {
            this.valueOf.edit().putString("last_fetch_etag", str).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public values values() {
        values valuesVar;
        synchronized (this.toString) {
            valuesVar = new values(this.valueOf.getInt("num_failed_fetches", 0), new Date(this.valueOf.getLong("backoff_end_time_in_millis", -1L)));
        }
        return valuesVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void values(int i, Date date) {
        synchronized (this.toString) {
            this.valueOf.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void invoke() {
        values(0, ag$a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class values {
        private int ag$a;
        private Date values;

        values(int i, Date date) {
            this.ag$a = i;
            this.values = date;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int valueOf() {
            return this.ag$a;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Date ah$a() {
            return this.values;
        }
    }
}
