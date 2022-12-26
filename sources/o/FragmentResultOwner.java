package o;

import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.soloader.SoLoader;
import com.facebook.systrace.Systrace;
/* loaded from: classes4.dex */
public final class FragmentResultOwner {
    public static final FragmentResultOwner ah$a = new FragmentResultOwner();
    private static volatile boolean toString;

    private FragmentResultOwner() {
    }

    public static final void valueOf() {
        if (toString) {
            return;
        }
        toString = true;
        android.os.Trace.beginSection("ReadableMapBufferSoLoader.staticInit::load:mapbufferjni");
        ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_MAPBUFFER_SO_FILE_START);
        SoLoader.values("mapbufferjni");
        ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_MAPBUFFER_SO_FILE_END);
        Systrace.valueOf(0L);
    }
}
