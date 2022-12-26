package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import com.google.logging.type.LogSeverity;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes3.dex */
public final class isFinished {
    private static volatile isFinished ag$a;
    private static volatile int ah$a;
    private static final File toString;
    public static final boolean valueOf;
    public static final boolean values;
    private final int HaptikSDK$a;
    private final int getInitSettings;
    private int invoke;
    private boolean HaptikSDK$c = true;
    private final AtomicBoolean HaptikSDK$b = new AtomicBoolean(false);
    private final boolean ah$b = invoke();

    static {
        values = Build.VERSION.SDK_INT < 29;
        valueOf = Build.VERSION.SDK_INT >= 26;
        toString = new File("/proc/self/fd");
        ah$a = -1;
    }

    public static isFinished ah$a() {
        if (ag$a == null) {
            synchronized (isFinished.class) {
                if (ag$a == null) {
                    ag$a = new isFinished();
                }
            }
        }
        return ag$a;
    }

    isFinished() {
        if (Build.VERSION.SDK_INT >= 28) {
            this.getInitSettings = 20000;
            this.HaptikSDK$a = 0;
            return;
        }
        this.getInitSettings = LogSeverity.ALERT_VALUE;
        this.HaptikSDK$a = 128;
    }

    public boolean valueOf(int i, int i2, boolean z, boolean z2) {
        if (!z) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        } else if (!this.ah$b) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by device model");
            }
            return false;
        } else if (!valueOf) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        } else if (values()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        } else if (z2) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        } else {
            int i3 = this.HaptikSDK$a;
            if (i < i3) {
                if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed because width is too small");
                }
                return false;
            } else if (i2 < i3) {
                if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed because height is too small");
                }
                return false;
            } else if (ag$a()) {
                return true;
            } else {
                if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
                }
                return false;
            }
        }
    }

    private boolean values() {
        return values && !this.HaptikSDK$b.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean ah$a(int i, int i2, BitmapFactory.Options options, boolean z, boolean z2) {
        boolean valueOf2 = valueOf(i, i2, z, z2);
        if (valueOf2) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return valueOf2;
    }

    private static boolean invoke() {
        return (HaptikSDK$a() || HaptikSDK$b()) ? false : true;
    }

    private static boolean HaptikSDK$b() {
        if (Build.VERSION.SDK_INT != 27) {
            return false;
        }
        return Arrays.asList("LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM").contains(Build.MODEL);
    }

    private static boolean HaptikSDK$a() {
        if (Build.VERSION.SDK_INT != 26) {
            return false;
        }
        for (String str : Arrays.asList("SC-04J", "SM-N935", "SM-J720", "SM-G570F", "SM-G570M", "SM-G960", "SM-G965", "SM-G935", "SM-G930", "SM-A520", "SM-A720F", "moto e5", "moto e5 play", "moto e5 plus", "moto e5 cruise", "moto g(6) forge", "moto g(6) play")) {
            if (Build.MODEL.startsWith(str)) {
                return true;
            }
        }
        return false;
    }

    private int valueOf() {
        if (ah$a != -1) {
            return ah$a;
        }
        return this.getInitSettings;
    }

    private boolean ag$a() {
        boolean z;
        synchronized (this) {
            boolean z2 = true;
            int i = this.invoke + 1;
            this.invoke = i;
            if (i >= 50) {
                this.invoke = 0;
                int length = toString.list().length;
                long valueOf2 = valueOf();
                if (length >= valueOf2) {
                    z2 = false;
                }
                this.HaptikSDK$c = z2;
                if (!z2 && Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + valueOf2);
                }
            }
            z = this.HaptikSDK$c;
        }
        return z;
    }
}
