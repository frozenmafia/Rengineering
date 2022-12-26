package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o.ChangeImageTransform;
import o.EditTextPreference;
/* JADX INFO: Access modifiers changed from: package-private */
@ChangeImageTransform.AnonymousClass1
/* loaded from: classes7.dex */
public class onBindDialogView implements onBindEditText {
    private final EditTextPreference.SavedState ag$a;
    private final Map<String, getEditTextPreference> ah$a;
    private final values toString;

    /* JADX INFO: Access modifiers changed from: package-private */
    @setTopLeft
    public onBindDialogView(Context context, EditTextPreference.SavedState savedState) {
        this(new values(context), savedState);
    }

    onBindDialogView(values valuesVar, EditTextPreference.SavedState savedState) {
        this.ah$a = new HashMap();
        this.toString = valuesVar;
        this.ag$a = savedState;
    }

    @Override // o.onBindEditText
    public getEditTextPreference values(String str) {
        synchronized (this) {
            if (this.ah$a.containsKey(str)) {
                return this.ah$a.get(str);
            }
            setOnBindEditTextListener ah$a = this.toString.ah$a(str);
            if (ah$a == null) {
                return null;
            }
            getEditTextPreference create = ah$a.create(this.ag$a.toString(str));
            this.ah$a.put(str, create);
            return create;
        }
    }

    /* loaded from: classes7.dex */
    static class values {
        private Map<String, String> ag$a = null;
        private final Context values;

        values(Context context) {
            this.values = context;
        }

        setOnBindEditTextListener ah$a(String str) {
            String str2 = valueOf().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (setOnBindEditTextListener) Class.forName(str2).asSubclass(setOnBindEditTextListener.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str2), e);
                return null;
            } catch (IllegalAccessException e2) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e2);
                return null;
            } catch (InstantiationException e3) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e3);
                return null;
            } catch (NoSuchMethodException e4) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e4);
                return null;
            } catch (InvocationTargetException e5) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e5);
                return null;
            }
        }

        private Map<String, String> valueOf() {
            if (this.ag$a == null) {
                this.ag$a = ag$a(this.values);
            }
            return this.ag$a;
        }

        private Map<String, String> ag$a(Context context) {
            Bundle values = values(context);
            if (values == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : values.keySet()) {
                Object obj = values.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String trim = str2.trim();
                        if (!trim.isEmpty()) {
                            hashMap.put(trim, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        private static Bundle values(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }
    }
}
