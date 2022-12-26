package o;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.wheelpicker.WheelPickerManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.FragmentManager;
/* loaded from: classes5.dex */
public class fromId implements FragmentManager.OpGenerator {
    @Override // o.FragmentManager.OpGenerator
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        return new ArrayList();
    }

    @Override // o.FragmentManager.OpGenerator
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new WheelPickerManager());
    }
}
