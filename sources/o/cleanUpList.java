package o;

import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.UIImplementation;
import com.facebook.react.uimanager.UIManagerModule;
/* loaded from: classes6.dex */
public final class cleanUpList {
    public static final cleanUpList valueOf = new cleanUpList();

    private cleanUpList() {
    }

    public final NativeViewHierarchyManager toString(UIManagerModule uIManagerModule) {
        runAnimators.ag$a(uIManagerModule, "uiManager");
        try {
            setDragger setdragger = setDragger.valueOf;
            UIImplementation uIImplementation = uIManagerModule.getUIImplementation();
            runAnimators.ah$a(uIImplementation, "uiManager.uiImplementation");
            Object ah$a = setdragger.ah$a(uIImplementation, "mOperationsQueue");
            if (ah$a == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
            }
            return (NativeViewHierarchyManager) setDragger.valueOf.ah$a(ah$a, "mNativeViewHierarchyManager");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
