package o;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.dispose;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class dispose$ah$a implements dispose.valueOf<Context> {
    private final Class<? extends Service> valueOf;

    private dispose$ah$a(Class<? extends Service> cls) {
        this.valueOf = cls;
    }

    @Override // o.dispose.valueOf
    /* renamed from: valueOf */
    public List<String> ag$a(Context context) {
        Bundle dispose_ah_a = toString(context);
        if (dispose_ah_a == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : dispose_ah_a.keySet()) {
            if ("com.google.firebase.components.ComponentRegistrar".equals(dispose_ah_a.get(str)) && str.startsWith("com.google.firebase.components:")) {
                arrayList.add(str.substring(31));
            }
        }
        return arrayList;
    }

    private Bundle toString(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
                return null;
            }
            ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.valueOf), 128);
            if (serviceInfo == null) {
                Log.w("ComponentDiscovery", this.valueOf + " has no service info.");
                return null;
            }
            return serviceInfo.metaData;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
            return null;
        }
    }
}
