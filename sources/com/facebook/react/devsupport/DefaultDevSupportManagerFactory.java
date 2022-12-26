package com.facebook.react.devsupport;

import android.content.Context;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.devsupport.interfaces.RedBoxHandler;
import java.util.Map;
import o.restoreState;
import o.setReorderingAllowed;
/* loaded from: classes4.dex */
public class DefaultDevSupportManagerFactory implements DevSupportManagerFactory {
    private static final String DEVSUPPORT_IMPL_CLASS = "BridgeDevSupportManager";
    private static final String DEVSUPPORT_IMPL_PACKAGE = "com.facebook.react.devsupport";

    public DevSupportManager create(Context context, ReactInstanceDevHelper reactInstanceDevHelper, String str, boolean z, int i) {
        return create(context, reactInstanceDevHelper, str, z, null, null, i, null, null);
    }

    @Override // com.facebook.react.devsupport.DevSupportManagerFactory
    public DevSupportManager create(Context context, ReactInstanceDevHelper reactInstanceDevHelper, String str, boolean z, RedBoxHandler redBoxHandler, DevBundleDownloadListener devBundleDownloadListener, int i, Map<String, setReorderingAllowed> map, restoreState restorestate) {
        if (!z) {
            return new DisabledDevSupportManager();
        }
        try {
            return (DevSupportManager) Class.forName(DEVSUPPORT_IMPL_PACKAGE + "." + DEVSUPPORT_IMPL_CLASS).getConstructor(Context.class, ReactInstanceDevHelper.class, String.class, Boolean.TYPE, RedBoxHandler.class, DevBundleDownloadListener.class, Integer.TYPE, Map.class, restoreState.class).newInstance(context, reactInstanceDevHelper, str, true, redBoxHandler, devBundleDownloadListener, Integer.valueOf(i), map, restorestate);
        } catch (Exception e) {
            throw new RuntimeException("Requested enabled DevSupportManager, but BridgeDevSupportManager class was not found or could not be created", e);
        }
    }
}
