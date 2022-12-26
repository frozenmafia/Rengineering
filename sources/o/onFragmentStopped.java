package o;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.HashMap;
import java.util.Map;
import o.FragmentManager;
/* loaded from: classes.dex */
public class onFragmentStopped {
    private final Map<String, ModuleHolder> ag$a = new HashMap();
    private final isAtLeast ah$a;
    private final ReactApplicationContext toString;

    public onFragmentStopped(ReactApplicationContext reactApplicationContext, isAtLeast isatleast) {
        this.toString = reactApplicationContext;
        this.ah$a = isatleast;
    }

    public void values(FragmentManager.OpGenerator opGenerator) {
        Iterable<ModuleHolder> canceltransaction;
        if (opGenerator instanceof onFragmentDetached) {
            canceltransaction = ((onFragmentDetached) opGenerator).valueOf(this.toString);
        } else if (opGenerator instanceof FragmentManager.StartEnterTransitionListener) {
            canceltransaction = ((FragmentManager.StartEnterTransitionListener) opGenerator).getNativeModuleIterator(this.toString);
        } else {
            canceltransaction = cancelTransaction.toString(opGenerator, this.toString, this.ah$a);
        }
        for (ModuleHolder moduleHolder : canceltransaction) {
            String name = moduleHolder.getName();
            if (this.ag$a.containsKey(name)) {
                ModuleHolder moduleHolder2 = this.ag$a.get(name);
                if (!moduleHolder.getCanOverrideExistingModule()) {
                    throw new IllegalStateException("Native module " + name + " tried to override " + moduleHolder2.getClassName() + ". Check the getPackages() method in MainApplication.java, it might be that module is being created twice. If this was your intention, set canOverrideExistingModule=true. This error may also be present if the package is present only once in getPackages() but is also automatically added later during build time by autolinking. Try removing the existing entry and rebuild.");
                }
                this.ag$a.remove(moduleHolder2);
            }
            this.ag$a.put(name, moduleHolder);
        }
    }

    public NativeModuleRegistry ah$a() {
        return new NativeModuleRegistry(this.toString, this.ag$a);
    }
}
