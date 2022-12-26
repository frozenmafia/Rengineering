package o;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.mvcpscrollviewmanager.MvcpScrollViewManagerModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.FragmentManager;
/* loaded from: classes5.dex */
public class validateAndResolveTableNames implements FragmentManager.OpGenerator {
    @Override // o.FragmentManager.OpGenerator
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }

    @Override // o.FragmentManager.OpGenerator
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new MvcpScrollViewManagerModule(reactApplicationContext));
        return arrayList;
    }
}
