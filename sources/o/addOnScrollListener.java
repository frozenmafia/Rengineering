package o;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class addOnScrollListener {
    private static final Charset valueOf = Charset.forName("UTF-8");
    private final getRecycledViewPool values;

    public addOnScrollListener(getRecycledViewPool getrecycledviewpool) {
        this.values = getrecycledviewpool;
    }

    public void valueOf(String str, String str2) {
        BufferedWriter bufferedWriter;
        createScroller createscroller;
        String HaptikSDK$b;
        File values = values(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                HaptikSDK$b = HaptikSDK$b(str2);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(values), valueOf));
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
            bufferedWriter = bufferedWriter2;
        }
        try {
            bufferedWriter.write(HaptikSDK$b);
            bufferedWriter.flush();
            CommonUtils.valueOf(bufferedWriter, "Failed to close user metadata file.");
        } catch (Exception e2) {
            e = e2;
            bufferedWriter2 = bufferedWriter;
            createscroller = createScroller.valueOf;
            createscroller.ah$a("Error serializing user metadata.", e);
            CommonUtils.valueOf(bufferedWriter2, "Failed to close user metadata file.");
        } catch (Throwable th2) {
            th = th2;
            CommonUtils.valueOf(bufferedWriter, "Failed to close user metadata file.");
            throw th;
        }
    }

    public String toString(String str) {
        createScroller createscroller;
        FileInputStream fileInputStream;
        createScroller createscroller2;
        createScroller createscroller3;
        File values = values(str);
        FileInputStream fileInputStream2 = null;
        if (!values.exists() || values.length() == 0) {
            createscroller = createScroller.valueOf;
            createscroller.ah$a("No userId set for session " + str);
            ah$a(values);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(values);
            try {
                try {
                    String invoke = invoke(CommonUtils.values(fileInputStream));
                    createscroller3 = createScroller.valueOf;
                    createscroller3.ah$a("Loaded userId " + invoke + " for session " + str);
                    CommonUtils.valueOf(fileInputStream, "Failed to close user metadata file.");
                    return invoke;
                } catch (Exception e) {
                    e = e;
                    createscroller2 = createScroller.valueOf;
                    createscroller2.ah$a("Error deserializing user metadata.", e);
                    ah$a(values);
                    CommonUtils.valueOf(fileInputStream, "Failed to close user metadata file.");
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                CommonUtils.valueOf(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            CommonUtils.valueOf(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public void ag$a(String str, Map<String, String> map, boolean z) {
        BufferedWriter bufferedWriter;
        createScroller createscroller;
        String ah$a;
        File ag$a = z ? ag$a(str) : ah$a(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                ah$a = ah$a(map);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ag$a), valueOf));
            } catch (Throwable th) {
                th = th;
                bufferedWriter = bufferedWriter2;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            bufferedWriter.write(ah$a);
            bufferedWriter.flush();
            CommonUtils.valueOf(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Exception e2) {
            e = e2;
            bufferedWriter2 = bufferedWriter;
            createscroller = createScroller.valueOf;
            createscroller.ah$a("Error serializing key/value metadata.", e);
            ah$a(ag$a);
            CommonUtils.valueOf(bufferedWriter2, "Failed to close key/value metadata file.");
        } catch (Throwable th2) {
            th = th2;
            CommonUtils.valueOf(bufferedWriter, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, String> ah$a(String str, boolean z) {
        createScroller createscroller;
        FileInputStream fileInputStream;
        File ag$a = z ? ag$a(str) : ah$a(str);
        if (!ag$a.exists() || ag$a.length() == 0) {
            ah$a(ag$a);
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(ag$a);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            Map<String, String> valueOf2 = valueOf(CommonUtils.values(fileInputStream));
            CommonUtils.valueOf(fileInputStream, "Failed to close user metadata file.");
            return valueOf2;
        } catch (Exception e2) {
            e = e2;
            fileInputStream2 = fileInputStream;
            createscroller = createScroller.valueOf;
            createscroller.ah$a("Error deserializing user metadata.", e);
            ah$a(ag$a);
            CommonUtils.valueOf(fileInputStream2, "Failed to close user metadata file.");
            return Collections.emptyMap();
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            CommonUtils.valueOf(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public File values(String str) {
        return this.values.ah$a(str, "user-data");
    }

    public File ah$a(String str) {
        return this.values.ah$a(str, "keys");
    }

    public File ag$a(String str) {
        return this.values.ah$a(str, "internal-keys");
    }

    private String invoke(String str) throws JSONException {
        return ah$a(new JSONObject(str), "userId");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [o.addOnScrollListener$5] */
    private static String HaptikSDK$b(String str) throws JSONException {
        return new JSONObject(str) { // from class: o.addOnScrollListener.5
            final /* synthetic */ String valueOf;

            {
                this.valueOf = str;
                put("userId", str);
            }
        }.toString();
    }

    private static Map<String, String> valueOf(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, ah$a(jSONObject, next));
        }
        return hashMap;
    }

    private static String ah$a(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    private static String ah$a(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    private static void ah$a(File file) {
        createScroller createscroller;
        if (file.exists() && file.delete()) {
            createscroller = createScroller.valueOf;
            createscroller.ag$a("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }
}
