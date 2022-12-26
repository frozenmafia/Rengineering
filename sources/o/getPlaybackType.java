package o;

import com.airbnb.android.react.lottie.LottieAnimationViewManager;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Collections;
import java.util.List;
import o.FragmentManager;
/* loaded from: classes.dex */
public class getPlaybackType implements FragmentManager.OpGenerator {
    @Override // o.FragmentManager.OpGenerator
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }

    @Override // o.FragmentManager.OpGenerator
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.singletonList(new LottieAnimationViewManager());
    }
}
