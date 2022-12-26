package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import java.io.IOException;
/* loaded from: classes4.dex */
public class Space extends CloseableCoroutineScope {
    private Context ah$a;
    private int valueOf;
    private startWakefulService values;

    public Space(Context context, int i) {
        Context applicationContext = context.getApplicationContext();
        this.ah$a = applicationContext;
        if (applicationContext == null) {
            Log.w("SoLoader", "context.getApplicationContext returned null, holding reference to original context.ApplicationSoSource fallbacks to: " + context.getApplicationInfo().nativeLibraryDir);
            this.ah$a = context;
        }
        this.valueOf = i;
        this.values = new startWakefulService(new File(this.ah$a.getApplicationInfo().nativeLibraryDir), i);
    }

    public boolean ag$a() throws IOException {
        File file = this.values.ag$a;
        Context ah$a = ah$a();
        File ag$a = ag$a(ah$a);
        if (file.equals(ag$a)) {
            return false;
        }
        Log.d("SoLoader", "Native library directory updated from " + file + " to " + ag$a);
        int i = this.valueOf | 1;
        this.valueOf = i;
        startWakefulService startwakefulservice = new startWakefulService(ag$a, i);
        this.values = startwakefulservice;
        startwakefulservice.valueOf(this.valueOf);
        this.ah$a = ah$a;
        return true;
    }

    public Context ah$a() {
        try {
            Context context = this.ah$a;
            return context.createPackageContext(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static File ag$a(Context context) {
        return new File(context.getApplicationInfo().nativeLibraryDir);
    }

    @Override // o.CloseableCoroutineScope
    public int toString(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        return this.values.toString(str, i, threadPolicy);
    }

    @Override // o.CloseableCoroutineScope
    public File toString(String str) throws IOException {
        return this.values.toString(str);
    }

    @Override // o.CloseableCoroutineScope
    public File values(String str) throws IOException {
        return this.values.values(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.CloseableCoroutineScope
    public void valueOf(int i) throws IOException {
        this.values.valueOf(i);
    }

    @Override // o.CloseableCoroutineScope
    public String toString() {
        return this.values.toString();
    }
}
