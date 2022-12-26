package o;

import java.io.IOException;
import o.SidecarCompat;
import o.SidecarWindowBackend;
import okhttp3.Request;
/* loaded from: classes.dex */
public interface SidecarCompat$registerConfigurationChangeListener$configChangeObserver$1<T> extends Cloneable {
    void ag$a();

    SidecarWindowBackend.WindowLayoutChangeCallbackWrapper<T> ah$a() throws IOException;

    Request invoke();

    void toString(SidecarCompat.FirstAttachAdapter<T> firstAttachAdapter);

    boolean valueOf();

    SidecarCompat$registerConfigurationChangeListener$configChangeObserver$1<T> values();
}
