package o;

import android.os.Bundle;
/* loaded from: classes8.dex */
public abstract class access$windowExtensionsProviderClass<T> {
    public final access$windowLayoutComponentClass ah$a;

    protected abstract T valueOf(isFoldingFeatureValid isfoldingfeaturevalid, Bundle bundle);

    public T toString(isFoldingFeatureValid isfoldingfeaturevalid, boolean z, Bundle bundle) {
        Bundle bundle2;
        if (isfoldingfeaturevalid.ah$a()) {
            return null;
        }
        if (bundle != null) {
            bundle2 = (Bundle) bundle.clone();
        } else {
            bundle2 = new Bundle();
        }
        if (!bundle2.containsKey("de.greenrobot.eventbus.errordialog.title")) {
            bundle2.putString("de.greenrobot.eventbus.errordialog.title", ag$a(isfoldingfeaturevalid, bundle2));
        }
        if (!bundle2.containsKey("de.greenrobot.eventbus.errordialog.message")) {
            bundle2.putString("de.greenrobot.eventbus.errordialog.message", values(isfoldingfeaturevalid, bundle2));
        }
        if (!bundle2.containsKey("de.greenrobot.eventbus.errordialog.finish_after_dialog")) {
            bundle2.putBoolean("de.greenrobot.eventbus.errordialog.finish_after_dialog", z);
        }
        if (!bundle2.containsKey("de.greenrobot.eventbus.errordialog.event_type_on_close") && this.ah$a.ah$a != null) {
            bundle2.putSerializable("de.greenrobot.eventbus.errordialog.event_type_on_close", this.ah$a.ah$a);
        }
        if (!bundle2.containsKey("de.greenrobot.eventbus.errordialog.icon_id") && this.ah$a.ag$a != 0) {
            bundle2.putInt("de.greenrobot.eventbus.errordialog.icon_id", this.ah$a.ag$a);
        }
        return valueOf(isfoldingfeaturevalid, bundle2);
    }

    protected String ag$a(isFoldingFeatureValid isfoldingfeaturevalid, Bundle bundle) {
        return this.ah$a.HaptikSDK$a.getString(this.ah$a.values);
    }

    protected String values(isFoldingFeatureValid isfoldingfeaturevalid, Bundle bundle) {
        return this.ah$a.HaptikSDK$a.getString(this.ah$a.toString(isfoldingfeaturevalid.ag$a));
    }
}
