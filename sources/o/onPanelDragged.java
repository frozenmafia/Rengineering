package o;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import fr.greweb.reactnativeviewshot.RNViewShotModule;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o.FragmentManager;
/* loaded from: classes5.dex */
public class onPanelDragged implements FragmentManager.OpGenerator {
    @Override // o.FragmentManager.OpGenerator
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new RNViewShotModule(reactApplicationContext));
    }

    @Override // o.FragmentManager.OpGenerator
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
