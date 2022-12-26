package o;

import com.dylanvann.fastimage.FastImageViewManager;
import com.dylanvann.fastimage.FastImageViewModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Collections;
import java.util.List;
import o.FragmentManager;
/* loaded from: classes4.dex */
public class applyContainerChanges implements FragmentManager.OpGenerator {
    @Override // o.FragmentManager.OpGenerator
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Collections.singletonList(new FastImageViewModule(reactApplicationContext));
    }

    @Override // o.FragmentManager.OpGenerator
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.singletonList(new FastImageViewManager());
    }
}
