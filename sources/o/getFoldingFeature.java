package o;

import android.os.Bundle;
import droidninja.filepicker.models.PhotoDirectory;
import o.MasterKey;
/* loaded from: classes5.dex */
public class getFoldingFeature {
    public static void ag$a(androidx.fragment.app.FragmentActivity fragmentActivity, Bundle bundle, MasterKeys<PhotoDirectory> masterKeys) {
        if (fragmentActivity.getSupportLoaderManager().getLoader(1) != null) {
            fragmentActivity.getSupportLoaderManager().restartLoader(1, bundle, new MasterKey.KeyScheme(fragmentActivity, masterKeys));
        } else {
            fragmentActivity.getSupportLoaderManager().initLoader(1, bundle, new MasterKey.KeyScheme(fragmentActivity, masterKeys));
        }
    }

    public static void values(androidx.fragment.app.FragmentActivity fragmentActivity, Bundle bundle, MasterKeys<PhotoDirectory> masterKeys) {
        if (fragmentActivity.getSupportLoaderManager().getLoader(3) != null) {
            fragmentActivity.getSupportLoaderManager().restartLoader(3, bundle, new MasterKey.KeyScheme(fragmentActivity, masterKeys));
        } else {
            fragmentActivity.getSupportLoaderManager().initLoader(3, bundle, new MasterKey.KeyScheme(fragmentActivity, masterKeys));
        }
    }
}
