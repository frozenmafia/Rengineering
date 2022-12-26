package o;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class areAllEndsEqual {
    private static final Map<String, areAllEndsEqual> ah$a = new HashMap();
    private final Context valueOf;
    private final String values;

    private areAllEndsEqual(Context context, String str) {
        this.valueOf = context;
        this.values = str;
    }

    public Void ag$a(getNextSpan getnextspan) throws IOException {
        synchronized (this) {
            FileOutputStream openFileOutput = this.valueOf.openFileOutput(this.values, 0);
            openFileOutput.write(getnextspan.toString().getBytes("UTF-8"));
            openFileOutput.close();
        }
        return null;
    }

    public getNextSpan values() throws IOException {
        FileInputStream fileInputStream;
        synchronized (this) {
            FileInputStream fileInputStream2 = null;
            try {
                fileInputStream = this.valueOf.openFileInput(this.values);
            } catch (FileNotFoundException | JSONException unused) {
                fileInputStream = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                int available = fileInputStream.available();
                byte[] bArr = new byte[available];
                fileInputStream.read(bArr, 0, available);
                getNextSpan getnextspan = getNextSpan.toString(new JSONObject(new String(bArr, "UTF-8")));
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                return getnextspan;
            } catch (FileNotFoundException | JSONException unused2) {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                throw th;
            }
        }
    }

    public Void valueOf() {
        synchronized (this) {
            this.valueOf.deleteFile(this.values);
        }
        return null;
    }

    public static areAllEndsEqual valueOf(Context context, String str) {
        areAllEndsEqual areallendsequal;
        synchronized (areAllEndsEqual.class) {
            Map<String, areAllEndsEqual> map = ah$a;
            if (!map.containsKey(str)) {
                map.put(str, new areAllEndsEqual(context, str));
            }
            areallendsequal = map.get(str);
        }
        return areallendsequal;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String ah$a() {
        return this.values;
    }
}
