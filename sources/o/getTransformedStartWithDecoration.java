package o;

import android.os.Bundle;
import java.util.Locale;
import o.collectAdjacentPrefetchPositions;
/* loaded from: classes7.dex */
class getTransformedStartWithDecoration implements collectAdjacentPrefetchPositions.values {
    private getOrientationHelper toString;
    private getOrientationHelper values;

    public void toString(getOrientationHelper getorientationhelper) {
        this.toString = getorientationhelper;
    }

    public void valueOf(getOrientationHelper getorientationhelper) {
        this.values = getorientationhelper;
    }

    @Override // o.collectAdjacentPrefetchPositions.values
    public void ah$a(int i, Bundle bundle) {
        createScroller createscroller;
        String string;
        createscroller = createScroller.valueOf;
        createscroller.valueOf(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i), bundle));
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        values(string, bundle2);
    }

    private void values(String str, Bundle bundle) {
        getOrientationHelper getorientationhelper;
        if ("clx".equals(bundle.getString("_o"))) {
            getorientationhelper = this.toString;
        } else {
            getorientationhelper = this.values;
        }
        values(getorientationhelper, str, bundle);
    }

    private static void values(getOrientationHelper getorientationhelper, String str, Bundle bundle) {
        if (getorientationhelper == null) {
            return;
        }
        getorientationhelper.valueOf(str, bundle);
    }
}
