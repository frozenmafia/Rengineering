package o;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Iterator;
import java.util.List;
import o.FragmentManager;
/* loaded from: classes4.dex */
public class cancelTransaction {
    public static Iterable<ModuleHolder> toString(FragmentManager.OpGenerator opGenerator, ReactApplicationContext reactApplicationContext, isAtLeast isatleast) {
        final List<NativeModule> createNativeModules;
        FragmentActivity.toString("ReactNative", opGenerator.getClass().getSimpleName() + " is not a LazyReactPackage, falling back to old version.");
        if (opGenerator instanceof FragmentManager.OnBackStackChangedListener) {
            createNativeModules = ((FragmentManager.OnBackStackChangedListener) opGenerator).ag$a(reactApplicationContext, isatleast);
        } else {
            createNativeModules = opGenerator.createNativeModules(reactApplicationContext);
        }
        return new Iterable<ModuleHolder>() { // from class: o.cancelTransaction.1
            @Override // java.lang.Iterable
            public Iterator<ModuleHolder> iterator() {
                return new Iterator<ModuleHolder>() { // from class: o.cancelTransaction.1.2
                    int valueOf = 0;

                    @Override // java.util.Iterator
                    /* renamed from: ah$a */
                    public ModuleHolder next() {
                        List list = createNativeModules;
                        int i = this.valueOf;
                        this.valueOf = i + 1;
                        return new ModuleHolder((NativeModule) list.get(i));
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return this.valueOf < createNativeModules.size();
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        throw new UnsupportedOperationException("Cannot remove methods ");
                    }
                };
            }
        };
    }
}
