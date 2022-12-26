package o;

import com.conviva.api.ConvivaException;
import com.conviva.api.SystemSettings;
import java.util.concurrent.Callable;
import o.CheckedTextViewCompat;
/* loaded from: classes4.dex */
public class getCheckMarkTintMode {
    private CheckedTextViewCompat.Api16Impl toString;
    private SystemSettings valueOf;
    private CompoundButtonCompat values;

    public getCheckMarkTintMode(CompoundButtonCompat compoundButtonCompat, CheckedTextViewCompat.Api16Impl api16Impl, SystemSettings systemSettings) {
        this.values = compoundButtonCompat;
        compoundButtonCompat.valueOf("ExceptionCatcher");
        this.toString = api16Impl;
        this.valueOf = systemSettings;
    }

    public <V> void valueOf(Callable<V> callable, String str) throws ConvivaException {
        try {
            callable.call();
        } catch (Exception e) {
            if (this.valueOf.valueOf) {
                throw new ConvivaException("Conviva Internal Failure " + str, e);
            }
            valueOf(str, e);
        }
    }

    private void valueOf(String str, Exception exc) {
        try {
            CheckedTextViewCompat.Api16Impl api16Impl = this.toString;
            api16Impl.toString("Uncaught exception: " + str + ": " + exc.toString());
        } catch (Exception e) {
            CompoundButtonCompat compoundButtonCompat = this.values;
            compoundButtonCompat.toString("Caught exception while sending ping: " + e.toString());
        }
    }
}
