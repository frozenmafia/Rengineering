package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import com.google.android.gms.common.internal.Preconditions;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/* loaded from: classes5.dex */
public class ProcessUtils {
    private static String zza;
    private static int zzb;

    private ProcessUtils() {
    }

    public static String getMyProcessName() {
        String str;
        BufferedReader bufferedReader;
        if (zza == null) {
            int i = zzb;
            if (i == 0) {
                i = Process.myPid();
                zzb = i;
            }
            String str2 = null;
            String str3 = null;
            BufferedReader bufferedReader2 = null;
            BufferedReader bufferedReader3 = null;
            if (i > 0) {
                try {
                    String str4 = "/proc/" + i + "/cmdline";
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    bufferedReader = new BufferedReader(new FileReader(str4));
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                } catch (IOException unused) {
                    str = null;
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    String readLine = bufferedReader.readLine();
                    Preconditions.checkNotNull(readLine);
                    str3 = readLine.trim();
                } catch (IOException unused2) {
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader3 = bufferedReader;
                    IOUtils.closeQuietly(bufferedReader3);
                    throw th;
                }
                str = str3;
                bufferedReader2 = bufferedReader;
                IOUtils.closeQuietly(bufferedReader2);
                str2 = str;
            }
            zza = str2;
        }
        return zza;
    }
}
