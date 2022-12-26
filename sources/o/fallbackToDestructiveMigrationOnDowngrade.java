package o;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.reactcommunity.rndatetimepicker.RNDatePickerDialogModule;
import com.reactcommunity.rndatetimepicker.RNTimePickerDialogModule;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o.FragmentManager;
/* loaded from: classes5.dex */
public class fallbackToDestructiveMigrationOnDowngrade implements FragmentManager.OpGenerator {
    @Override // o.FragmentManager.OpGenerator
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new RNDatePickerDialogModule(reactApplicationContext), new RNTimePickerDialogModule(reactApplicationContext));
    }

    @Override // o.FragmentManager.OpGenerator
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
