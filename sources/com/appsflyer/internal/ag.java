package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ag {
    private static ag AFInAppEventType = new ag();

    private ag() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ag AFKeystoreWrapper() {
        return AFInAppEventType;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static File AFInAppEventType(Context context) {
        return new File(context.getFilesDir(), "AFRequestCache");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<j> values(Context context) {
        File[] listFiles;
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(context.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
            } else {
                for (File file2 : file.listFiles()) {
                    StringBuilder sb = new StringBuilder("Found cached request");
                    sb.append(file2.getName());
                    AFLogger.valueOf(sb.toString());
                    arrayList.add(values(file2));
                }
            }
        } catch (Exception e) {
            AFLogger.values("Could not cache request", e);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j values(File file) {
        FileReader fileReader;
        FileReader fileReader2 = null;
        try {
            fileReader = new FileReader(file);
            try {
                char[] cArr = new char[(int) file.length()];
                fileReader.read(cArr);
                j jVar = new j(cArr);
                jVar.AFInAppEventType = file.getName();
                try {
                    fileReader.close();
                } catch (IOException e) {
                    AFLogger.values(e);
                }
                return jVar;
            } catch (Exception unused) {
                if (fileReader != null) {
                    try {
                        fileReader.close();
                    } catch (IOException e2) {
                        AFLogger.values(e2);
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                fileReader2 = fileReader;
                if (fileReader2 != null) {
                    try {
                        fileReader2.close();
                    } catch (IOException e3) {
                        AFLogger.values(e3);
                    }
                }
                throw th;
            }
        } catch (Exception unused2) {
            fileReader = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void values(String str, Context context) {
        File file = new File(new File(context.getFilesDir(), "AFRequestCache"), str);
        StringBuilder sb = new StringBuilder("Deleting ");
        sb.append(str);
        sb.append(" from cache");
        AFLogger.valueOf(sb.toString());
        if (file.exists()) {
            try {
                file.delete();
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder("Could not delete ");
                sb2.append(str);
                sb2.append(" from cache");
                AFLogger.values(sb2.toString(), e);
            }
        }
    }
}
