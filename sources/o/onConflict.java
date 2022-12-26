package o;

import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.microsoft.fraudprotection.androidsdk.ConfigData;
import java.util.Date;
import o.IMultiInstanceInvalidationService;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class onConflict {
    private final Gson ag$a;
    private final SharedPreferences.Editor ah$a;
    private final SharedPreferences values;

    public onConflict(SharedPreferences sharedPreferences, Gson gson) {
        this.values = sharedPreferences;
        this.ag$a = gson;
        this.ah$a = sharedPreferences.edit();
    }

    private String ah$a(String str) {
        return this.values.getString(str, null);
    }

    private long toString(String str) {
        return this.values.getLong(str, 0L);
    }

    private Object valueOf(String str, Class cls) {
        String ah$a = ah$a(str);
        if (Insert.valueOf(ah$a)) {
            return null;
        }
        return this.ag$a.ah$a(ah$a, cls);
    }

    private void toString(String str, Object obj) {
        ag$a(str, new Gson().ag$a(obj));
    }

    private void ag$a(String str, String str2) {
        this.ah$a.putString(str, str2);
        this.ah$a.commit();
    }

    private void ah$a(String str, long j) {
        this.ah$a.putLong(str, j);
        this.ah$a.commit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JSONObject valueOf(String str, long j) {
        String str2 = str + "_attributes_caching";
        try {
        } catch (Exception e) {
            IMultiInstanceInvalidationService.Default.toString("Exception occurred in readCachedFingerprints: ", e);
        }
        if (values(str + "_attributes_caching_time", j)) {
            return null;
        }
        String string = this.values.getString(str2, null);
        if (!Insert.valueOf(string)) {
            return new JSONObject(string);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ag$a(String str, long j, unique uniqueVar) {
        try {
            if (uniqueVar.valueOf() == 0) {
                IMultiInstanceInvalidationService.Default.valueOf("No fingerprints data, skipping putFingerprints.");
                return;
            }
            JSONObject values = uniqueVar.values(true);
            if (values.length() == 0) {
                return;
            }
            String str2 = str + "_attributes_caching_time";
            ag$a(str + "_attributes_caching", values.toString());
            if (values(str2, j)) {
                ah$a(str2, new Date().getTime());
                return;
            }
            IMultiInstanceInvalidationService.Default.valueOf(str + " cached attributes have not expired, not updating saving time.");
        } catch (Exception e) {
            IMultiInstanceInvalidationService.Default.toString("Exception occurred in putFingerprints: ", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String ag$a() {
        String ah$a = ah$a("device_id");
        if (Insert.valueOf(ah$a)) {
            ah$a = appendTriggerName.values();
            ag$a("device_id", ah$a);
        }
        IMultiInstanceInvalidationService.Default.valueOf("DeviceId: " + ah$a);
        return ah$a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConfigData ah$a() {
        try {
            long onconflict = toString("config_caching_time");
            ConfigData configData = (ConfigData) valueOf("config_data", ConfigData.class);
            if (configData != null) {
                if (!configData.isConfigExpired(onconflict)) {
                    return configData;
                }
            }
            return null;
        } catch (Exception e) {
            IMultiInstanceInvalidationService.Default.toString("Exception in getConfigData ", e);
            return null;
        }
    }

    public void toString(ConfigData configData) {
        ah$a("config_caching_time", new Date().getTime());
        toString("config_data", configData);
    }

    private boolean values(String str, long j) {
        return new Date().getTime() - toString(str) > j;
    }

    public void ag$a(String str) {
        ag$a("config_error", str);
    }

    public void values(String str) {
        ag$a("send_fpt_error", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String values() {
        return ah$a("config_error");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String valueOf() {
        return ah$a("send_fpt_error");
    }
}
