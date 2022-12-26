package o;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.th3rdwave.safeareacontext.SafeAreaProviderManager;
import com.th3rdwave.safeareacontext.SafeAreaViewManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o.FragmentManager;
/* loaded from: classes5.dex */
public class getKeyTemplate implements FragmentManager.OpGenerator {
    @Override // o.FragmentManager.OpGenerator
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }

    @Override // o.FragmentManager.OpGenerator
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new SafeAreaProviderManager(reactApplicationContext), new SafeAreaViewManager());
    }
}
