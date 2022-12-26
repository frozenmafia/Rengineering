package o;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.reactnativecommunity.geolocation.RNCGeolocationModule;
import java.util.HashMap;
import java.util.Map;
import o.FragmentManager;
/* loaded from: classes5.dex */
public class updateIdentity extends FragmentManager.StartEnterTransitionListener {
    @Override // o.FragmentManager.StartEnterTransitionListener
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals("RNCGeolocation")) {
            return new RNCGeolocationModule(reactApplicationContext);
        }
        return null;
    }

    @Override // o.FragmentManager.StartEnterTransitionListener
    public FragmentStore getReactModuleInfoProvider() {
        return onConfigure.values;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Map values() {
        HashMap hashMap = new HashMap();
        hashMap.put("RNCGeolocation", new ReactModuleInfo("RNCGeolocation", "RNCGeolocation", false, false, true, false, false));
        return hashMap;
    }
}
