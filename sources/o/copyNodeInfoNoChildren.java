package o;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.RCTNativeAppEventEmitter;
import java.util.HashMap;
import o.DrawerLayout;
/* loaded from: classes.dex */
public final class copyNodeInfoNoChildren {
    public static final copyNodeInfoNoChildren ag$a = new copyNodeInfoNoChildren();
    private static final HashMap<DrawerLayout.ChildAccessibilityDelegate, ReactContext> values = new HashMap<>();

    private copyNodeInfoNoChildren() {
    }

    public static /* synthetic */ void valueOf(DrawerLayout.ChildAccessibilityDelegate childAccessibilityDelegate, DrawerLayout.SavedState.AnonymousClass1.toString tostring, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        toString(childAccessibilityDelegate, tostring, z);
    }

    public static final void toString(DrawerLayout.ChildAccessibilityDelegate childAccessibilityDelegate, DrawerLayout.SavedState.AnonymousClass1.toString tostring, boolean z) {
        runAnimators.ag$a(childAccessibilityDelegate, "name");
        runAnimators.ag$a(tostring, com.dreampay.commons.constants.Constants.RESULT);
        ag$a(values.get(childAccessibilityDelegate), childAccessibilityDelegate.valueOf(), tostring, z);
    }

    public static /* synthetic */ void ah$a(ReactContext reactContext, String str, DrawerLayout.SavedState.AnonymousClass1.toString tostring, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        ag$a(reactContext, str, tostring, z);
    }

    public static final void ag$a(ReactContext reactContext, String str, DrawerLayout.SavedState.AnonymousClass1.toString tostring, boolean z) {
        RCTNativeAppEventEmitter rCTNativeAppEventEmitter;
        runAnimators.ag$a(str, "eventName");
        runAnimators.ag$a(tostring, com.dreampay.commons.constants.Constants.RESULT);
        if (reactContext == null || !reactContext.hasActiveCatalystInstance()) {
            return;
        }
        if (tostring instanceof DrawerLayout$SavedState$1$toString$ah$a) {
            RCTNativeAppEventEmitter rCTNativeAppEventEmitter2 = (RCTNativeAppEventEmitter) reactContext.getJSModule(RCTNativeAppEventEmitter.class);
            if (rCTNativeAppEventEmitter2 != null) {
                rCTNativeAppEventEmitter2.emit(str, ((DrawerLayout$SavedState$1$toString$ah$a) tostring).ag$a());
            }
        } else if ((tostring instanceof DrawerLayout.SavedState.AnonymousClass1.toString.values) && (rCTNativeAppEventEmitter = (RCTNativeAppEventEmitter) reactContext.getJSModule(RCTNativeAppEventEmitter.class)) != null) {
            rCTNativeAppEventEmitter.emit(str, ((DrawerLayout.SavedState.AnonymousClass1.toString.values) tostring).ah$a());
        }
        if (z) {
            ag$a.ah$a(new DrawerLayout.ChildAccessibilityDelegate(str));
        }
    }

    public final void ah$a(DrawerLayout.ChildAccessibilityDelegate childAccessibilityDelegate) {
        runAnimators.ag$a(childAccessibilityDelegate, "name");
        values.remove(childAccessibilityDelegate);
    }

    public final void valueOf(DrawerLayout.ChildAccessibilityDelegate childAccessibilityDelegate, ReactContext reactContext) {
        runAnimators.ag$a(childAccessibilityDelegate, "name");
        runAnimators.ag$a(reactContext, "context");
        values.put(childAccessibilityDelegate, reactContext);
    }
}
