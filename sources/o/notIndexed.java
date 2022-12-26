package o;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import o.IMultiInstanceInvalidationService;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.json.JSONObject;
/* loaded from: classes5.dex */
class notIndexed {
    private final unique ag$a;
    private final ActivityManager ah$a;
    private final JSONObject valueOf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public notIndexed(Context context, unique uniqueVar, JSONObject jSONObject) {
        this.ag$a = uniqueVar;
        this.valueOf = jSONObject;
        this.ah$a = (ActivityManager) context.getSystemService(com.apxor.androidsdk.core.ce.Constants.ACTIVITY);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ah$a() {
        try {
            if (this.ah$a != null) {
                HaptikWebView();
                values();
                HaptikSDK$c();
            } else {
                this.ag$a.ag$a("j6", "ActivityManager is null");
                this.ag$a.ag$a("j7", "ActivityManager is null");
                this.ag$a.ag$a("j8", "ActivityManager is null");
            }
            HaptikSDK$a();
            ah$b();
            invoke();
            HaptikSDK$b();
            HaptikSDK$d();
            ag$a();
            boolean initSettings = getInitSettings();
            this.ag$a.valueOf("k7", Boolean.valueOf(initSettings));
            if (initSettings) {
                HaptikSDK$e();
                valueOf();
            }
        } catch (Exception e) {
            IMultiInstanceInvalidationService.Default.toString("Exception in collectDeviceCPUMemoryAttributes ", e);
            this.ag$a.ag$a("cpu_memory", e.toString());
        }
    }

    private void HaptikWebView() {
        JSONObject jSONObject = this.valueOf;
        if (jSONObject != null && jSONObject.has("j6")) {
            this.ag$a.ag$a("j6", Long.valueOf(this.valueOf.optLong("j6")), true);
            return;
        }
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            this.ah$a.getMemoryInfo(memoryInfo);
            this.ag$a.ag$a("j6", Long.valueOf(memoryInfo.totalMem), true);
        } catch (Exception e) {
            IMultiInstanceInvalidationService.Default.toString("Exception in collectTotalMemInfoFromRAM ", e);
            this.ag$a.ag$a("j6", e.toString());
        }
    }

    private void values() {
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            this.ah$a.getMemoryInfo(memoryInfo);
            this.ag$a.valueOf("j7", Long.valueOf(memoryInfo.availMem));
        } catch (Exception e) {
            IMultiInstanceInvalidationService.Default.toString("Exception in collectAvailMemInfoFromRAM ", e);
            this.ag$a.ag$a("j7", e.toString());
        }
    }

    private void HaptikSDK$c() {
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            this.ah$a.getMemoryInfo(memoryInfo);
            this.ag$a.valueOf("j8", Boolean.valueOf(memoryInfo.lowMemory));
        } catch (Exception e) {
            IMultiInstanceInvalidationService.Default.toString("Exception in collectLowMemInfoFromRAM ", e);
            this.ag$a.ag$a("j8", e.toString());
        }
    }

    private void HaptikSDK$a() {
        BufferedReader bufferedReader;
        String str;
        JSONObject jSONObject = this.valueOf;
        if (jSONObject != null && jSONObject.has("k1")) {
            this.ag$a.ag$a("k1", this.valueOf.optString("k1"), true);
            return;
        }
        BufferedReader bufferedReader2 = null;
        try {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("abi: ");
                sb.append(Build.CPU_ABI);
                sb.append("\n");
                if (new File("/proc/cpuinfo").exists()) {
                    bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"));
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb.append(readLine);
                            sb.append("\n");
                        } catch (Exception e) {
                            e = e;
                            bufferedReader2 = bufferedReader;
                            IMultiInstanceInvalidationService.Default.toString("Exception in getCPUInfo ", e);
                            this.ag$a.ag$a("k1", e.toString());
                            if (bufferedReader2 == null) {
                                return;
                            }
                            bufferedReader2.close();
                        } catch (Throwable th) {
                            th = th;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception e2) {
                                    IMultiInstanceInvalidationService.Default.toString("Exception in getCPUInfo - br.close() ", e2);
                                    this.ag$a.ag$a("k1", e2.toString());
                                }
                            }
                            throw th;
                        }
                    }
                    str = sb.toString();
                    bufferedReader2 = bufferedReader;
                } else {
                    str = "";
                }
                if (!Insert.valueOf(str)) {
                    this.ag$a.ag$a("k1", ag$a(str), true);
                }
                if (bufferedReader2 == null) {
                    return;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        } catch (Exception e3) {
            e = e3;
        }
        try {
            bufferedReader2.close();
        } catch (Exception e4) {
            IMultiInstanceInvalidationService.Default.toString("Exception in getCPUInfo - br.close() ", e4);
            this.ag$a.ag$a("k1", e4.toString());
        }
    }

    private String ag$a(String str) {
        if (str == null) {
            return null;
        }
        MessageDigest signupData = getSignupData();
        if (signupData != null) {
            signupData.update(str.getBytes());
            return valueOf(signupData.digest());
        }
        return String.valueOf(str.hashCode());
    }

    private MessageDigest getSignupData() {
        try {
            return MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
        } catch (NoSuchAlgorithmException e) {
            IMultiInstanceInvalidationService.Default.toString("Exception occurred in initMD5MessageDigest: ", e);
            return null;
        }
    }

    private String valueOf(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(String.format("%02x", Byte.valueOf(bArr[i])));
        }
        return sb.toString();
    }

    private void ah$b() {
        JSONObject jSONObject = this.valueOf;
        if (jSONObject != null && jSONObject.has("k2")) {
            this.ag$a.ag$a("k2", Integer.valueOf(this.valueOf.optInt("k2")), true);
            return;
        }
        try {
            this.ag$a.ag$a("k2", Integer.valueOf(Runtime.getRuntime().availableProcessors()), true);
        } catch (Exception e) {
            IMultiInstanceInvalidationService.Default.toString("Exception occurred in getNumCores: ", e);
            this.ag$a.ag$a("k2", e.toString());
        }
    }

    private void HaptikSDK$b() {
        JSONObject jSONObject = this.valueOf;
        if (jSONObject != null && jSONObject.has("k3")) {
            this.ag$a.ag$a("k3", Long.valueOf(this.valueOf.optLong("k3")), true);
            return;
        }
        try {
            this.ag$a.ag$a("k3", Long.valueOf(values("sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq")), true);
        } catch (Exception e) {
            IMultiInstanceInvalidationService.Default.toString("Exception occurred in getMaxCPUFrequency: ", e);
            this.ag$a.ag$a("k3", e.toString());
        }
    }

    private void invoke() {
        JSONObject jSONObject = this.valueOf;
        if (jSONObject != null && jSONObject.has("k4")) {
            this.ag$a.ag$a("k4", Long.valueOf(this.valueOf.optLong("k4")), true);
            return;
        }
        try {
            this.ag$a.ag$a("k4", Long.valueOf(values("sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq")), true);
        } catch (Exception e) {
            IMultiInstanceInvalidationService.Default.toString("Exception occurred in getMinCPUFrequency: ", e);
            this.ag$a.ag$a("k4", e.toString());
        }
    }

    private long values(String str) {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile(str, "r");
            } catch (Throwable th) {
                th = th;
                randomAccessFile = randomAccessFile2;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            long parseLong = Long.parseLong(randomAccessFile.readLine());
            try {
                randomAccessFile.close();
                return parseLong;
            } catch (Exception e2) {
                IMultiInstanceInvalidationService.Default.toString("Exception in readFreqFromFileToNumb - br.close() ", e2);
                return parseLong;
            }
        } catch (Exception e3) {
            e = e3;
            randomAccessFile2 = randomAccessFile;
            IMultiInstanceInvalidationService.Default.toString("Exception occurred in readFreqFromFileToNumb: ", e);
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (Exception e4) {
                    IMultiInstanceInvalidationService.Default.toString("Exception in readFreqFromFileToNumb - br.close() ", e4);
                }
            }
            return 0L;
        } catch (Throwable th2) {
            th = th2;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (Exception e5) {
                    IMultiInstanceInvalidationService.Default.toString("Exception in readFreqFromFileToNumb - br.close() ", e5);
                }
            }
            throw th;
        }
    }

    private void HaptikSDK$d() {
        JSONObject jSONObject = this.valueOf;
        if (jSONObject != null && jSONObject.has("k5")) {
            this.ag$a.ag$a("k5", Long.valueOf(this.valueOf.optLong("k5")), true);
            return;
        }
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            this.ag$a.ag$a("k5", Long.valueOf(toString(statFs.getBlockSizeLong() * statFs.getBlockCountLong())), true);
        } catch (Exception e) {
            IMultiInstanceInvalidationService.Default.toString("Exception in getTotalInternalStorage: ", e);
            this.ag$a.ag$a("k5", e.toString());
        }
    }

    private void ag$a() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            this.ag$a.valueOf("k6", Long.valueOf(toString(statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong())));
        } catch (Exception e) {
            IMultiInstanceInvalidationService.Default.toString("Exception in getAvailableInternalStorage: ", e);
            this.ag$a.ag$a("k6", e.toString());
        }
    }

    private boolean getInitSettings() {
        return Environment.getExternalStorageState().equals("mounted") && Environment.getExternalStorageState().equals("mounted_ro") && Environment.isExternalStorageRemovable();
    }

    private void HaptikSDK$e() {
        JSONObject jSONObject = this.valueOf;
        if (jSONObject != null && jSONObject.has("k8")) {
            this.ag$a.ag$a("k8", Long.valueOf(this.valueOf.optLong("k8")), true);
            return;
        }
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            this.ag$a.ag$a("k8", Long.valueOf(toString(statFs.getBlockSizeLong() * statFs.getBlockCountLong())), true);
        } catch (Exception e) {
            IMultiInstanceInvalidationService.Default.toString("Exception in getTotalExternalStorage: ", e);
            this.ag$a.ag$a("k8", e.toString());
        }
    }

    private void valueOf() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            this.ag$a.valueOf("k9", Long.valueOf(toString(statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong())));
        } catch (Exception e) {
            IMultiInstanceInvalidationService.Default.toString("Exception in getAvailableExternalStorage: ", e);
            this.ag$a.ag$a("k9", e.toString());
        }
    }

    private long toString(long j) {
        return j / android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }
}
