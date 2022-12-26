package o;

import android.text.TextUtils;
import easypay.utils.LogNotPrintedException;
import java.io.PrintWriter;
import java.io.StringWriter;
/* loaded from: classes5.dex */
public class getCoveredFadeColor {
    public static void ag$a(String str, Object obj) {
        if (easypay.manager.Constants.DEV_MODE) {
            obj.getClass().getSimpleName();
            getParallaxDistance.values(easypay.manager.Constants.ASSIST_LOG_CONSTANT, obj + ":" + str);
            try {
                if (TextUtils.isEmpty(str)) {
                    throw new LogNotPrintedException();
                }
            } catch (Exception e) {
                e.printStackTrace(new PrintWriter(new StringWriter()));
            }
        }
    }
}
