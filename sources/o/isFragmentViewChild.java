package o;

import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.soloader.SoLoader;
import com.facebook.systrace.Systrace;
/* loaded from: classes6.dex */
public class isFragmentViewChild {
    private static volatile boolean valueOf = false;

    public static void ag$a() {
        if (valueOf) {
            return;
        }
        android.os.Trace.beginSection("FabricSoLoader.staticInit::load:fabricjni");
        ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_START);
        SoLoader.values("fabricjni");
        ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_END);
        Systrace.valueOf(0L);
        valueOf = true;
    }
}
