package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.facebook.soloader.MinElf;
import java.io.DataOutput;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;
/* loaded from: classes4.dex */
public final class invokeMethodsForEvent {
    public static int valueOf(String[] strArr, String str) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] != null && str.equals(strArr[i])) {
                return i;
            }
        }
        return -1;
    }

    public static void ah$a(File file) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.canWrite() && !parentFile.setWritable(true)) {
            Log.e("SysUtil", "Enable write permission failed: " + parentFile);
        }
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("Could not delete file " + file);
    }

    public static String[] values() {
        if (Build.VERSION.SDK_INT >= 23) {
            return valueOf.ah$a();
        }
        return Build.VERSION.SDK_INT >= 21 ? values.values() : new String[]{Build.CPU_ABI, Build.CPU_ABI2};
    }

    public static void toString(FileDescriptor fileDescriptor, long j) throws IOException {
        if (Build.VERSION.SDK_INT >= 21) {
            values.toString(fileDescriptor, j);
        }
    }

    public static void ag$a(File file) throws IOException {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            for (File file2 : listFiles) {
                ag$a(file2);
            }
        }
        ah$a(file);
    }

    /* loaded from: classes4.dex */
    public static final class values {
        public static String[] values() {
            String[] strArr = Build.SUPPORTED_ABIS;
            TreeSet treeSet = new TreeSet();
            try {
                if (ah$a()) {
                    treeSet.add(MinElf.ISA.AARCH64.toString());
                    treeSet.add(MinElf.ISA.X86_64.toString());
                } else {
                    treeSet.add(MinElf.ISA.ARM.toString());
                    treeSet.add(MinElf.ISA.X86.toString());
                }
                ArrayList arrayList = new ArrayList();
                for (String str : strArr) {
                    if (treeSet.contains(str)) {
                        arrayList.add(str);
                    }
                }
                return (String[]) arrayList.toArray(new String[arrayList.size()]);
            } catch (ErrnoException e) {
                Log.e("SysUtil", String.format("Could not read /proc/self/exe. Falling back to default ABI list: %s. errno: %d Err msg: %s", Arrays.toString(strArr), Integer.valueOf(e.errno), e.getMessage()));
                return Build.SUPPORTED_ABIS;
            }
        }

        public static void toString(FileDescriptor fileDescriptor, long j) throws IOException {
            try {
                Os.posix_fallocate(fileDescriptor, 0L, j);
            } catch (ErrnoException e) {
                if (e.errno != OsConstants.EOPNOTSUPP && e.errno != OsConstants.ENOSYS && e.errno != OsConstants.EINVAL) {
                    throw new IOException(e.toString(), e);
                }
            }
        }

        public static boolean ah$a() throws ErrnoException {
            return Os.readlink("/proc/self/exe").contains("64");
        }
    }

    /* loaded from: classes4.dex */
    public static final class valueOf {
        public static String[] ah$a() {
            String[] strArr = Build.SUPPORTED_ABIS;
            TreeSet treeSet = new TreeSet();
            if (valueOf()) {
                treeSet.add(MinElf.ISA.AARCH64.toString());
                treeSet.add(MinElf.ISA.X86_64.toString());
            } else {
                treeSet.add(MinElf.ISA.ARM.toString());
                treeSet.add(MinElf.ISA.X86.toString());
            }
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (treeSet.contains(str)) {
                    arrayList.add(str);
                }
            }
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }

        public static boolean valueOf() {
            return Process.is64Bit();
        }

        public static boolean values(Context context, int i) throws IOException {
            if (i == 2) {
                return ah$a(context);
            }
            return values(context);
        }

        public static boolean values(Context context) {
            return context != null && (context.getApplicationInfo().flags & 268435456) == 0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:50:0x003f, code lost:
            if (r1.getMethod() != 0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0041, code lost:
            r2 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0042, code lost:
            r5.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0045, code lost:
            return r2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static boolean ah$a(android.content.Context r5) throws java.io.IOException {
            /*
                java.io.File r0 = new java.io.File
                android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()
                java.lang.String r5 = r5.sourceDir
                r0.<init>(r5)
                java.util.zip.ZipFile r5 = new java.util.zip.ZipFile
                r5.<init>(r0)
                java.util.Enumeration r0 = r5.entries()     // Catch: java.lang.Throwable -> L4a
            L14:
                boolean r1 = r0.hasMoreElements()     // Catch: java.lang.Throwable -> L4a
                r2 = 0
                if (r1 == 0) goto L46
                java.lang.Object r1 = r0.nextElement()     // Catch: java.lang.Throwable -> L4a
                java.util.zip.ZipEntry r1 = (java.util.zip.ZipEntry) r1     // Catch: java.lang.Throwable -> L4a
                if (r1 == 0) goto L14
                java.lang.String r3 = r1.getName()     // Catch: java.lang.Throwable -> L4a
                java.lang.String r4 = ".so"
                boolean r3 = r3.endsWith(r4)     // Catch: java.lang.Throwable -> L4a
                if (r3 == 0) goto L14
                java.lang.String r3 = r1.getName()     // Catch: java.lang.Throwable -> L4a
                java.lang.String r4 = "/lib"
                boolean r3 = r3.contains(r4)     // Catch: java.lang.Throwable -> L4a
                if (r3 == 0) goto L14
                int r0 = r1.getMethod()     // Catch: java.lang.Throwable -> L4a
                if (r0 != 0) goto L42
                r2 = 1
            L42:
                r5.close()
                return r2
            L46:
                r5.close()
                return r2
            L4a:
                r0 = move-exception
                r5.close()     // Catch: java.lang.Throwable -> L4f
                goto L53
            L4f:
                r5 = move-exception
                r0.addSuppressed(r5)
            L53:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.invokeMethodsForEvent.valueOf.ah$a(android.content.Context):boolean");
        }
    }

    public static void values(File file) throws IOException {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        throw new IOException("cannot mkdir: " + file);
    }

    public static int ag$a(DataOutput dataOutput, InputStream inputStream, int i, byte[] bArr) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, 0, Math.min(bArr.length, i - i2));
            if (read == -1) {
                break;
            }
            dataOutput.write(bArr, 0, read);
            i2 += read;
        }
        return i2;
    }

    public static void toString(File file) throws IOException {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                throw new IOException("cannot list directory " + file);
            }
            for (File file2 : listFiles) {
                toString(file2);
            }
        } else if (!file.getPath().endsWith("_lock")) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            try {
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
            } catch (Throwable th) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static int toString(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                return packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            }
        }
        return 0;
    }

    public static boolean ah$a() {
        if (Build.VERSION.SDK_INT >= 23) {
            return valueOf.valueOf();
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return values.ah$a();
            } catch (Exception e) {
                Log.e("SysUtil", String.format("Could not read /proc/self/exe. Err msg: %s", e.getMessage()));
                return false;
            }
        }
        return false;
    }

    public static boolean ag$a(Context context, int i) throws IOException {
        if (Build.VERSION.SDK_INT >= 23) {
            return valueOf.values(context, i);
        }
        return false;
    }

    public static boolean ag$a(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return valueOf.values(context);
        }
        return false;
    }

    public static verifyAndPutHandler ag$a(File file, File file2, boolean z) throws IOException {
        boolean z2 = true;
        try {
            if (z) {
                return verifyAndPutHandler.ag$a(file2);
            }
            return verifyAndPutHandler.toString(file2);
        } catch (FileNotFoundException e) {
            try {
                if (file.setWritable(true)) {
                    if (z) {
                        verifyAndPutHandler ag$a = verifyAndPutHandler.ag$a(file2);
                        if (!file.setWritable(false)) {
                            Log.w("SysUtil", "error removing " + file.getCanonicalPath() + " write permission");
                        }
                        return ag$a;
                    }
                    verifyAndPutHandler verifyandputhandler = verifyAndPutHandler.toString(file2);
                    if (!file.setWritable(false)) {
                        Log.w("SysUtil", "error removing " + file.getCanonicalPath() + " write permission");
                    }
                    return verifyandputhandler;
                }
                throw e;
            } catch (Throwable th) {
                th = th;
                if (z2 && !file.setWritable(false)) {
                    Log.w("SysUtil", "error removing " + file.getCanonicalPath() + " write permission");
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            z2 = false;
            if (z2) {
                Log.w("SysUtil", "error removing " + file.getCanonicalPath() + " write permission");
            }
            throw th;
        }
    }

    public static String toString(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf > 0 ? str.substring(0, lastIndexOf) : str;
    }
}
