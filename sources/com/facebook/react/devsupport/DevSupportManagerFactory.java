package com.facebook.react.devsupport;

import android.content.Context;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.devsupport.interfaces.RedBoxHandler;
import java.util.Map;
import o.restoreState;
import o.setReorderingAllowed;
/* loaded from: classes.dex */
public interface DevSupportManagerFactory {
    DevSupportManager create(Context context, ReactInstanceDevHelper reactInstanceDevHelper, String str, boolean z, RedBoxHandler redBoxHandler, DevBundleDownloadListener devBundleDownloadListener, int i, Map<String, setReorderingAllowed> map, restoreState restorestate);
}
