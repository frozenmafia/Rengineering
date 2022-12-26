package o;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import com.dream11.feature.downloader.FileType;
import com.sendbird.android.constant.StringSet;
import java.io.File;
import org.apache.http.cookie.ClientCookie;
/* loaded from: classes4.dex */
public final class dispatchOnDrawerOpened {
    public static final void values(Context context, String str, String str2, FileType fileType) {
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(str, "folderName");
        runAnimators.ag$a(str2, "fileName");
        runAnimators.ag$a(fileType, "fileType");
        File valueOf = valueOf(str, str2, context);
        Uri ah$a = ah$a(context, valueOf);
        if (fileType == FileType.INSTALL) {
            toString(context, ah$a, valueOf);
        } else {
            ag$a(context, ah$a);
        }
    }

    public static final void toString(Context context, Uri uri, File file) {
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(uri, "fileUri");
        runAnimators.ag$a(file, StringSet.file);
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                Intent intent = new Intent("android.intent.action.INSTALL_PACKAGE");
                intent.setData(uri);
                intent.setFlags(1);
                context.startActivity(intent);
            } else {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setDataAndType(Uri.fromFile(file), "application/vnd.android.package-archive");
                intent2.setFlags(268435456);
                context.startActivity(intent2);
            }
        } catch (ActivityNotFoundException unused) {
        }
    }

    public static final void ag$a(Context context, Uri uri) {
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(uri, "fileUri");
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uri, "application/pdf");
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
        }
    }

    public static final Uri ah$a(Context context, File file) {
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(file, StringSet.file);
        String packageName = context.getPackageName();
        Uri uriForFile = androidx.core.content.FileProvider.getUriForFile(context, packageName + ".provider", file);
        runAnimators.ah$a(uriForFile, "getUriForFile(\n        c…ider\",\n        file\n    )");
        return uriForFile;
    }

    public static final File valueOf(String str, String str2, Context context) {
        runAnimators.ag$a(str, ClientCookie.PATH_ATTR);
        runAnimators.ag$a(str2, "fileName");
        runAnimators.ag$a(context, "context");
        if (Build.VERSION.SDK_INT >= 30) {
            File externalFilesDir = context.getApplicationContext().getExternalFilesDir(null);
            String absolutePath = externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null;
            return new File(absolutePath + "/Dream11/" + str + "/" + str2);
        }
        String file = Environment.getExternalStorageDirectory().toString();
        return new File(file + "/Dream11/" + str + "/" + str2);
    }

    public static final File valueOf(String str, Context context) {
        runAnimators.ag$a(str, "filePath");
        runAnimators.ag$a(context, "context");
        if (Build.VERSION.SDK_INT >= 30) {
            File externalFilesDir = context.getApplicationContext().getExternalFilesDir(null);
            String absolutePath = externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null;
            return new File(absolutePath + "/Dream11/" + str);
        }
        String file = Environment.getExternalStorageDirectory().toString();
        return new File(file + "/Dream11/" + str);
    }

    public static final File toString(Context context) {
        runAnimators.ag$a(context, "context");
        if (Build.VERSION.SDK_INT >= 30) {
            File externalFilesDir = context.getApplicationContext().getExternalFilesDir(null);
            String absolutePath = externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null;
            return new File(absolutePath + "/Dream11");
        }
        String file = Environment.getExternalStorageDirectory().toString();
        return new File(file + "/Dream11");
    }
}
