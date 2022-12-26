package o;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
/* loaded from: classes5.dex */
public class unregisterLayoutStateChangeCallback {
    private Context ag$a;
    private String toString;

    public unregisterLayoutStateChangeCallback(Context context) {
        this.ag$a = context;
    }

    private File values() throws IOException {
        String str = "JPEG_" + System.currentTimeMillis() + ".jpg";
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        if (!externalStoragePublicDirectory.exists() && !externalStoragePublicDirectory.mkdir()) {
            Log.e("TAG", "Throwing Errors....");
            throw new IOException();
        }
        File file = new File(externalStoragePublicDirectory, str);
        this.toString = file.getAbsolutePath();
        return file;
    }

    public Intent valueOf(Context context) throws IOException {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (intent.resolveActivity(this.ag$a.getPackageManager()) != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                File values = values();
                intent.addFlags(1);
                intent.addFlags(2);
                intent.putExtra("output", androidx.core.content.FileProvider.getUriForFile(context, isStrongBoxBacked.valueOf().HaptikSDK$b(), values));
            } else {
                intent.putExtra("output", Uri.fromFile(values()));
            }
            return intent;
        }
        return null;
    }

    public String ag$a() {
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        if (TextUtils.isEmpty(this.toString)) {
            return null;
        }
        intent.setData(Uri.fromFile(new File(this.toString)));
        this.ag$a.sendBroadcast(intent);
        return this.toString;
    }
}
