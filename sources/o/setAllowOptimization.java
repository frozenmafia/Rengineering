package o;

import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import com.sendbird.android.constant.StringSet;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o.add;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class setAllowOptimization implements Runnable {
    private static final String toString = "JSPackagerClient";
    private final Map<String, setReorderingAllowed> valueOf;
    private int ag$a = 1;
    private final Handler values = new Handler(Looper.getMainLooper());
    private final Map<Integer, values> ah$a = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class values {
        private long ag$a = System.currentTimeMillis() + 30000;
        private final FileInputStream toString;

        public values(String str) throws FileNotFoundException {
            this.toString = new FileInputStream(str);
        }

        private void values() {
            this.ag$a = System.currentTimeMillis() + 30000;
        }

        public boolean valueOf() {
            return System.currentTimeMillis() >= this.ag$a;
        }

        public String values(int i) throws IOException {
            values();
            byte[] bArr = new byte[i];
            return Base64.encodeToString(bArr, 0, this.toString.read(bArr), 0);
        }

        public void ah$a() throws IOException {
            this.toString.close();
        }
    }

    public setAllowOptimization() {
        HashMap hashMap = new HashMap();
        this.valueOf = hashMap;
        hashMap.put("fopen", new setTransitionStyle() { // from class: o.setAllowOptimization.4
            @Override // o.setTransitionStyle, o.setReorderingAllowed
            public void onRequest(Object obj, add.Cdefault cdefault) {
                JSONObject jSONObject;
                synchronized (setAllowOptimization.this.ah$a) {
                    try {
                        jSONObject = (JSONObject) obj;
                    } catch (Exception e) {
                        cdefault.ah$a(e.toString());
                    }
                    if (jSONObject == null) {
                        throw new Exception("params must be an object { mode: string, filename: string }");
                    }
                    String optString = jSONObject.optString("mode");
                    if (optString == null) {
                        throw new Exception("missing params.mode");
                    }
                    String optString2 = jSONObject.optString("filename");
                    if (optString2 == null) {
                        throw new Exception("missing params.filename");
                    }
                    if (optString.equals("r")) {
                        cdefault.toString(Integer.valueOf(setAllowOptimization.this.ah$a(optString2)));
                    } else {
                        throw new IllegalArgumentException("unsupported mode: " + optString);
                    }
                }
            }
        });
        hashMap.put("fclose", new setTransitionStyle() { // from class: o.setAllowOptimization.3
            @Override // o.setTransitionStyle, o.setReorderingAllowed
            public void onRequest(Object obj, add.Cdefault cdefault) {
                synchronized (setAllowOptimization.this.ah$a) {
                    try {
                    } catch (Exception e) {
                        cdefault.ah$a(e.toString());
                    }
                    if (obj instanceof Number) {
                        values valuesVar = (values) setAllowOptimization.this.ah$a.get(Integer.valueOf(((Integer) obj).intValue()));
                        if (valuesVar != null) {
                            setAllowOptimization.this.ah$a.remove(Integer.valueOf(((Integer) obj).intValue()));
                            valuesVar.ah$a();
                            cdefault.toString("");
                        } else {
                            throw new Exception("invalid file handle, it might have timed out");
                        }
                    } else {
                        throw new Exception("params must be a file handle");
                    }
                }
            }
        });
        hashMap.put("fread", new setTransitionStyle() { // from class: o.setAllowOptimization.2
            @Override // o.setTransitionStyle, o.setReorderingAllowed
            public void onRequest(Object obj, add.Cdefault cdefault) {
                JSONObject jSONObject;
                synchronized (setAllowOptimization.this.ah$a) {
                    try {
                        jSONObject = (JSONObject) obj;
                    } catch (Exception e) {
                        cdefault.ah$a(e.toString());
                    }
                    if (jSONObject == null) {
                        throw new Exception("params must be an object { file: handle, size: number }");
                    }
                    int optInt = jSONObject.optInt(StringSet.file);
                    if (optInt == 0) {
                        throw new Exception("invalid or missing file handle");
                    }
                    int optInt2 = jSONObject.optInt(StringSet.size);
                    if (optInt2 != 0) {
                        values valuesVar = (values) setAllowOptimization.this.ah$a.get(Integer.valueOf(optInt));
                        if (valuesVar == null) {
                            throw new Exception("invalid file handle, it might have timed out");
                        }
                        cdefault.toString(valuesVar.values(optInt2));
                    } else {
                        throw new Exception("invalid or missing read size");
                    }
                }
            }
        });
    }

    public Map<String, setReorderingAllowed> valueOf() {
        return this.valueOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int ah$a(String str) throws FileNotFoundException {
        int i = this.ag$a;
        this.ag$a = i + 1;
        this.ah$a.put(Integer.valueOf(i), new values(str));
        if (this.ah$a.size() == 1) {
            this.values.postDelayed(this, 30000L);
        }
        return i;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.ah$a) {
            Iterator<values> it = this.ah$a.values().iterator();
            while (it.hasNext()) {
                values next = it.next();
                if (next.valueOf()) {
                    it.remove();
                    try {
                        next.ah$a();
                    } catch (IOException e) {
                        String str = toString;
                        FragmentActivity.values(str, "closing expired file failed: " + e.toString());
                    }
                }
            }
            if (!this.ah$a.isEmpty()) {
                this.values.postDelayed(this, 30000L);
            }
        }
    }
}
