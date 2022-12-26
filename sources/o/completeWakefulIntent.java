package o;

import android.content.Context;
import android.os.Parcel;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipEntry;
import o.ClassesInfoCache;
/* loaded from: classes4.dex */
public class completeWakefulIntent extends ClassesInfoCache.CallbackInfo {
    private final int HaptikSDK$b;

    public completeWakefulIntent(Context context, File file, String str, int i) {
        super(context, str, file, "^lib/([^/]+)/([^/]+\\.so)$");
        this.HaptikSDK$b = i;
    }

    @Override // o.ClassesInfoCache.CallbackInfo, o.ClassesInfoCache.MethodReference
    protected ClassesInfoCache$MethodReference$HaptikSDK$a valueOf(byte b2) throws IOException {
        return new values(this);
    }

    /* loaded from: classes4.dex */
    protected class values extends ClassesInfoCache.CallbackInfo.toString {
        private File toString;
        private final int values;

        values(ClassesInfoCache.CallbackInfo callbackInfo) throws IOException {
            super(callbackInfo);
            this.toString = new File(completeWakefulIntent.this.ah$b.getApplicationInfo().nativeLibraryDir);
            this.values = completeWakefulIntent.this.HaptikSDK$b;
        }

        @Override // o.ClassesInfoCache.CallbackInfo.toString
        protected boolean ag$a(ZipEntry zipEntry, String str) {
            String str2;
            String name = zipEntry.getName();
            boolean z = false;
            if (str.equals(completeWakefulIntent.this.HaptikSDK$c)) {
                completeWakefulIntent.this.HaptikSDK$c = null;
                str2 = String.format("allowing consideration of corrupted lib %s", str);
            } else if ((this.values & 1) == 0) {
                str2 = "allowing consideration of " + name + ": self-extraction preferred";
            } else {
                File file = new File(this.toString, str);
                if (!file.isFile()) {
                    str2 = String.format("allowing considering of %s: %s not in system lib dir", name, str);
                } else {
                    long length = file.length();
                    long size = zipEntry.getSize();
                    if (length != size) {
                        str2 = String.format("allowing consideration of %s: sysdir file length is %s, but the file is %s bytes long in the APK", file, Long.valueOf(length), Long.valueOf(size));
                    } else {
                        str2 = "not allowing consideration of " + name + ": deferring to libdir";
                        Log.d("ApkSoSource", str2);
                        return z;
                    }
                }
            }
            z = true;
            Log.d("ApkSoSource", str2);
            return z;
        }
    }

    @Override // o.ClassesInfoCache.MethodReference
    protected byte[] valueOf() throws IOException {
        File canonicalFile = this.values.getCanonicalFile();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeByte((byte) 2);
            obtain.writeString(canonicalFile.getPath());
            obtain.writeLong(canonicalFile.lastModified());
            obtain.writeInt(invokeMethodsForEvent.toString(this.ah$b));
            if ((this.HaptikSDK$b & 1) == 0) {
                obtain.writeByte((byte) 0);
                return obtain.marshall();
            }
            String str = this.ah$b.getApplicationInfo().nativeLibraryDir;
            if (str == null) {
                obtain.writeByte((byte) 1);
                return obtain.marshall();
            }
            File canonicalFile2 = new File(str).getCanonicalFile();
            if (!canonicalFile2.exists()) {
                obtain.writeByte((byte) 1);
                return obtain.marshall();
            }
            obtain.writeByte((byte) 2);
            obtain.writeString(canonicalFile2.getPath());
            obtain.writeLong(canonicalFile2.lastModified());
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }
}
