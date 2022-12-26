package o;

import android.os.AsyncTask;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
/* loaded from: classes4.dex */
public final class onDestroyOptionsMenu extends AsyncTask<String, Void, Boolean> {
    private final String ah$a;
    private final File valueOf;
    private final onDestroyOptionsMenu$ag$a values;

    @Override // android.os.AsyncTask
    public /* synthetic */ Boolean doInBackground(String[] strArr) {
        if (isStateAtLeast.values(this)) {
            return null;
        }
        try {
            if (isStateAtLeast.values(this)) {
                return null;
            }
            return toString(strArr);
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public /* synthetic */ void onPostExecute(Boolean bool) {
        if (isStateAtLeast.values(this)) {
            return;
        }
        try {
            if (isStateAtLeast.values(this)) {
                return;
            }
            ah$a(bool.booleanValue());
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
        }
    }

    public onDestroyOptionsMenu(String str, File file, onDestroyOptionsMenu$ag$a ondestroyoptionsmenu_ag_a) {
        runAnimators.ag$a(str, "uriStr");
        runAnimators.ag$a(file, "destFile");
        runAnimators.ag$a(ondestroyoptionsmenu_ag_a, "onSuccess");
        this.ah$a = str;
        this.valueOf = file;
        this.values = ondestroyoptionsmenu_ag_a;
    }

    public Boolean toString(String... strArr) {
        if (isStateAtLeast.values(this)) {
            return null;
        }
        try {
            if (isStateAtLeast.values(this)) {
                return null;
            }
            runAnimators.ag$a(strArr, "args");
            try {
                URL url = new URL(this.ah$a);
                int contentLength = url.openConnection().getContentLength();
                DataInputStream dataInputStream = new DataInputStream(url.openStream());
                byte[] bArr = new byte[contentLength];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.valueOf));
                dataOutputStream.write(bArr);
                dataOutputStream.flush();
                dataOutputStream.close();
                return true;
            } catch (Exception unused) {
                return false;
            }
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
            return null;
        }
    }

    protected void ah$a(boolean z) {
        if (isStateAtLeast.values(this)) {
            return;
        }
        try {
            if (!isStateAtLeast.values(this) && z) {
                this.values.valueOf(this.valueOf);
            }
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
        }
    }
}
