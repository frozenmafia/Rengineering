package o;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.firebase.perf.util.StorageUnit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class dispatchMoveStarting {
    private static final shouldBeKeptAsChild ag$a = shouldBeKeptAsChild.ah$a();
    private final Context ah$a;
    private final Runtime invoke;
    private final ActivityManager.MemoryInfo toString;
    private final ActivityManager valueOf;
    private final String values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public dispatchMoveStarting(Context context) {
        this(Runtime.getRuntime(), context);
    }

    dispatchMoveStarting(Runtime runtime, Context context) {
        this.invoke = runtime;
        this.ah$a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService(com.apxor.androidsdk.core.ce.Constants.ACTIVITY);
        this.valueOf = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.toString = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
        this.values = invoke();
    }

    public String ag$a() {
        return this.values;
    }

    public int ah$a() {
        return addAllInternal.ag$a(StorageUnit.BYTES.toKilobytes(this.invoke.maxMemory()));
    }

    public int valueOf() {
        return addAllInternal.ag$a(StorageUnit.MEGABYTES.toKilobytes(this.valueOf.getMemoryClass()));
    }

    public int values() {
        if (Build.VERSION.SDK_INT >= 16) {
            return addAllInternal.ag$a(StorageUnit.BYTES.toKilobytes(this.toString.totalMem));
        }
        return ag$a("/proc/meminfo");
    }

    int ag$a(String str) {
        BufferedReader bufferedReader;
        String readLine;
        try {
            bufferedReader = new BufferedReader(new FileReader(str));
        } catch (IOException e) {
            shouldBeKeptAsChild shouldbekeptaschild = ag$a;
            shouldbekeptaschild.ah$a("Unable to read '" + str + "' file: " + e.getMessage());
        } catch (NumberFormatException e2) {
            shouldBeKeptAsChild shouldbekeptaschild2 = ag$a;
            shouldbekeptaschild2.ah$a("Unable to parse '" + str + "' file: " + e2.getMessage());
        }
        do {
            try {
                readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    return 0;
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } while (!readLine.startsWith("MemTotal"));
        Matcher matcher = Pattern.compile("\\d+").matcher(readLine);
        int parseInt = matcher.find() ? Integer.parseInt(matcher.group()) : 0;
        bufferedReader.close();
        return parseInt;
    }

    private String invoke() {
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = this.valueOf.getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        return this.ah$a.getPackageName();
    }
}
