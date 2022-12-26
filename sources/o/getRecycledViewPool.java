package o;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes5.dex */
public class getRecycledViewPool {
    private final File ag$a;
    private final File ah$a;
    private final File ah$b;
    private final File toString;
    private final File valueOf;
    private final File values;

    public getRecycledViewPool(Context context) {
        String str;
        File filesDir = context.getFilesDir();
        this.toString = filesDir;
        if (HaptikSDK$a()) {
            str = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator + valueOf(Application.getProcessName());
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File ag$a = ag$a(new File(filesDir, str));
        this.ah$a = ag$a;
        this.ah$b = ag$a(new File(ag$a, "open-sessions"));
        this.ag$a = ag$a(new File(ag$a, "reports"));
        this.valueOf = ag$a(new File(ag$a, "priority-reports"));
        this.values = ag$a(new File(ag$a, "native-reports"));
    }

    public void values() {
        toString(new File(this.toString, ".com.google.firebase.crashlytics"));
        toString(new File(this.toString, ".com.google.firebase.crashlytics-ndk"));
        if (HaptikSDK$a()) {
            toString(new File(this.toString, ".com.google.firebase.crashlytics.files.v1"));
        }
    }

    private void toString(File file) {
        createScroller createscroller;
        if (file.exists() && ah$a(file)) {
            createscroller = createScroller.valueOf;
            createscroller.ah$a("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    public static boolean ah$a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                ah$a(file2);
            }
        }
        return file.delete();
    }

    public File ag$a(String str) {
        return new File(this.ah$a, str);
    }

    public List<File> toString(FilenameFilter filenameFilter) {
        return values(this.ah$a.listFiles(filenameFilter));
    }

    private File HaptikSDK$c(String str) {
        return values(new File(this.ah$b, str));
    }

    public File ah$a(String str, String str2) {
        return new File(HaptikSDK$c(str), str2);
    }

    public List<File> values(String str, FilenameFilter filenameFilter) {
        return values(HaptikSDK$c(str).listFiles(filenameFilter));
    }

    public File toString(String str) {
        return values(new File(HaptikSDK$c(str), "native"));
    }

    public boolean values(String str) {
        return ah$a(new File(this.ah$b, str));
    }

    public List<String> ag$a() {
        return values(this.ah$b.list());
    }

    public File HaptikSDK$a(String str) {
        return new File(this.ag$a, str);
    }

    public List<File> invoke() {
        return values(this.ag$a.listFiles());
    }

    public File invoke(String str) {
        return new File(this.valueOf, str);
    }

    public List<File> ah$a() {
        return values(this.valueOf.listFiles());
    }

    public File ah$a(String str) {
        return new File(this.values, str);
    }

    public List<File> valueOf() {
        return values(this.values.listFiles());
    }

    private static File values(File file) {
        file.mkdirs();
        return file;
    }

    private static File ag$a(File file) {
        createScroller createscroller;
        createScroller createscroller2;
        synchronized (getRecycledViewPool.class) {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                createscroller2 = createScroller.valueOf;
                createscroller2.ah$a("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                file.delete();
            }
            if (!file.mkdirs()) {
                createscroller = createScroller.valueOf;
                createscroller.toString("Could not create Crashlytics-specific directory: " + file);
            }
            return file;
        }
    }

    private static <T> List<T> values(T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    private static boolean HaptikSDK$a() {
        return Build.VERSION.SDK_INT >= 28;
    }

    static String valueOf(String str) {
        return str.replaceAll("[^a-zA-Z0-9.]", "_");
    }
}
