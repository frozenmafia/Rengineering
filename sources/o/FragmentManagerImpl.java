package o;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.turbomodule.core.TurboModuleManagerDelegate;
import java.util.ArrayList;
import java.util.List;
import o.FragmentLifecycleCallbacksDispatcher;
import o.FragmentManager;
/* loaded from: classes4.dex */
public abstract class FragmentManagerImpl extends TurboModuleManagerDelegate {

    /* loaded from: classes.dex */
    public static abstract class valueOf {
        private List<FragmentManager.OpGenerator> ah$a;
        private ReactApplicationContext values;

        protected abstract FragmentManagerImpl toString(ReactApplicationContext reactApplicationContext, List<FragmentManager.OpGenerator> list);

        public valueOf ah$a(List<FragmentManager.OpGenerator> list) {
            this.ah$a = new ArrayList(list);
            return this;
        }

        public valueOf values(ReactApplicationContext reactApplicationContext) {
            this.values = reactApplicationContext;
            return this;
        }

        public FragmentManagerImpl valueOf() {
            FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder.ag$a(this.values, "The ReactApplicationContext must be provided to create ReactPackageTurboModuleManagerDelegate");
            FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder.ag$a(this.ah$a, "A set of ReactPackages must be provided to create ReactPackageTurboModuleManagerDelegate");
            return toString(this.values, this.ah$a);
        }
    }
}
