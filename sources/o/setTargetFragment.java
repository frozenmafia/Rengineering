package o;

import java.io.File;
import o.Fragment;
/* loaded from: classes4.dex */
public class setTargetFragment {
    public static void ag$a(File file, Fragment.AnonymousClass3 anonymousClass3) {
        anonymousClass3.valueOf(file);
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    ag$a(file2, anonymousClass3);
                } else {
                    anonymousClass3.ah$a(file2);
                }
            }
        }
        anonymousClass3.values(file);
    }

    public static boolean values(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                z &= toString(file2);
            }
        }
        return z;
    }

    public static boolean toString(File file) {
        if (file.isDirectory()) {
            values(file);
        }
        return file.delete();
    }
}
