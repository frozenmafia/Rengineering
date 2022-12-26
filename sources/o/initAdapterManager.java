package o;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;
/* loaded from: classes7.dex */
public class initAdapterManager {
    private final File ag$a;

    public initAdapterManager(getRecycledViewPool getrecycledviewpool) {
        this.ag$a = getrecycledviewpool.ag$a("com.crashlytics.settings.json");
    }

    private File valueOf() {
        return this.ag$a;
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x004a: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:21:0x0049 */
    public JSONObject values() {
        createScroller createscroller;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        createScroller createscroller2;
        createScroller createscroller3;
        JSONObject jSONObject;
        createscroller = createScroller.valueOf;
        createscroller.ah$a("Checking for cached settings...");
        FileInputStream fileInputStream3 = null;
        try {
            try {
                File valueOf = valueOf();
                if (!valueOf.exists()) {
                    createscroller3 = createScroller.valueOf;
                    createscroller3.valueOf("Settings file does not exist.");
                    jSONObject = null;
                } else {
                    fileInputStream = new FileInputStream(valueOf);
                    try {
                        jSONObject = new JSONObject(CommonUtils.values(fileInputStream));
                        fileInputStream3 = fileInputStream;
                    } catch (Exception e) {
                        e = e;
                        createscroller2 = createScroller.valueOf;
                        createscroller2.ag$a("Failed to fetch cached settings", e);
                        CommonUtils.valueOf(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                }
                CommonUtils.valueOf(fileInputStream3, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Throwable th) {
                th = th;
                fileInputStream3 = fileInputStream2;
                CommonUtils.valueOf(fileInputStream3, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            CommonUtils.valueOf(fileInputStream3, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void valueOf(long j, JSONObject jSONObject) {
        createScroller createscroller;
        Throwable th;
        FileWriter fileWriter;
        Exception e;
        createScroller createscroller2;
        createscroller = createScroller.valueOf;
        createscroller.valueOf("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter2 = null;
            try {
                try {
                    jSONObject.put("expires_at", j);
                    fileWriter = new FileWriter(valueOf());
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
                fileWriter = fileWriter2;
            }
            try {
                fileWriter.write(jSONObject.toString());
                fileWriter.flush();
                CommonUtils.valueOf(fileWriter, "Failed to close settings writer.");
            } catch (Exception e3) {
                e = e3;
                fileWriter2 = fileWriter;
                createscroller2 = createScroller.valueOf;
                createscroller2.ag$a("Failed to cache settings", e);
                CommonUtils.valueOf(fileWriter2, "Failed to close settings writer.");
            } catch (Throwable th3) {
                th = th3;
                CommonUtils.valueOf(fileWriter, "Failed to close settings writer.");
                throw th;
            }
        }
    }
}
