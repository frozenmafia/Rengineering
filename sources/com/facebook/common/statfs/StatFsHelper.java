package com.facebook.common.statfs;

import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import o.Fragment;
/* loaded from: classes4.dex */
public class StatFsHelper {
    private static final long toString = TimeUnit.MINUTES.toMillis(2);
    private static StatFsHelper valueOf;
    private long HaptikSDK$b;
    private volatile File HaptikSDK$c;
    private volatile File ah$a;
    private volatile StatFs ah$b = null;
    private volatile StatFs values = null;
    private volatile boolean HaptikSDK$a = false;
    private final Lock ag$a = new ReentrantLock();

    /* loaded from: classes4.dex */
    public enum StorageType {
        INTERNAL,
        EXTERNAL
    }

    public static StatFsHelper ah$a() {
        StatFsHelper statFsHelper;
        synchronized (StatFsHelper.class) {
            if (valueOf == null) {
                valueOf = new StatFsHelper();
            }
            statFsHelper = valueOf;
        }
        return statFsHelper;
    }

    protected StatFsHelper() {
    }

    private void ag$a() {
        if (this.HaptikSDK$a) {
            return;
        }
        this.ag$a.lock();
        try {
            if (!this.HaptikSDK$a) {
                this.HaptikSDK$c = Environment.getDataDirectory();
                this.ah$a = Environment.getExternalStorageDirectory();
                valueOf();
                this.HaptikSDK$a = true;
            }
        } finally {
            this.ag$a.unlock();
        }
    }

    public boolean toString(StorageType storageType, long j) {
        ag$a();
        long ag$a = ag$a(storageType);
        return ag$a <= 0 || ag$a < j;
    }

    public long ag$a(StorageType storageType) {
        long blockSize;
        long availableBlocks;
        ag$a();
        values();
        StatFs statFs = storageType == StorageType.INTERNAL ? this.ah$b : this.values;
        if (statFs != null) {
            if (Build.VERSION.SDK_INT >= 18) {
                blockSize = statFs.getBlockSizeLong();
                availableBlocks = statFs.getAvailableBlocksLong();
            } else {
                blockSize = statFs.getBlockSize();
                availableBlocks = statFs.getAvailableBlocks();
            }
            return blockSize * availableBlocks;
        }
        return 0L;
    }

    private void values() {
        if (this.ag$a.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.HaptikSDK$b > toString) {
                    valueOf();
                }
            } finally {
                this.ag$a.unlock();
            }
        }
    }

    private void valueOf() {
        this.ah$b = values(this.ah$b, this.HaptikSDK$c);
        this.values = values(this.values, this.ah$a);
        this.HaptikSDK$b = SystemClock.uptimeMillis();
    }

    private StatFs values(StatFs statFs, File file) {
        if (file != null && file.exists()) {
            try {
                if (statFs == null) {
                    statFs = ag$a(file.getAbsolutePath());
                } else {
                    statFs.restat(file.getAbsolutePath());
                }
                return statFs;
            } catch (IllegalArgumentException unused) {
            } catch (Throwable th) {
                throw Fragment.OnPreAttachedListener.ag$a(th);
            }
        }
        return null;
    }

    protected static StatFs ag$a(String str) {
        return new StatFs(str);
    }
}
