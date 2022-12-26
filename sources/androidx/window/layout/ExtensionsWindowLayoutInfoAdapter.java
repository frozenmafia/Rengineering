package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.window.core.Bounds;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.HardwareFoldingFeature;
import com.apxor.androidsdk.core.ce.Constants;
import java.util.ArrayList;
import java.util.List;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class ExtensionsWindowLayoutInfoAdapter {
    public static final ExtensionsWindowLayoutInfoAdapter INSTANCE = new ExtensionsWindowLayoutInfoAdapter();

    private ExtensionsWindowLayoutInfoAdapter() {
    }

    public final FoldingFeature translate$window_release(Activity activity, androidx.window.extensions.layout.FoldingFeature foldingFeature) {
        HardwareFoldingFeature.Type fold;
        FoldingFeature.State state;
        runAnimators.ag$a(activity, Constants.ACTIVITY);
        runAnimators.ag$a(foldingFeature, "oemFeature");
        int type = foldingFeature.getType();
        if (type == 1) {
            fold = HardwareFoldingFeature.Type.Companion.getFOLD();
        } else if (type != 2) {
            return null;
        } else {
            fold = HardwareFoldingFeature.Type.Companion.getHINGE();
        }
        int state2 = foldingFeature.getState();
        if (state2 == 1) {
            state = FoldingFeature.State.FLAT;
        } else if (state2 != 2) {
            return null;
        } else {
            state = FoldingFeature.State.HALF_OPENED;
        }
        Rect bounds = foldingFeature.getBounds();
        runAnimators.ah$a(bounds, "oemFeature.bounds");
        if (validBounds(activity, new Bounds(bounds))) {
            Rect bounds2 = foldingFeature.getBounds();
            runAnimators.ah$a(bounds2, "oemFeature.bounds");
            return new HardwareFoldingFeature(new Bounds(bounds2), fold, state);
        }
        return null;
    }

    public final WindowLayoutInfo translate$window_release(Activity activity, androidx.window.extensions.layout.WindowLayoutInfo windowLayoutInfo) {
        FoldingFeature foldingFeature;
        runAnimators.ag$a(activity, Constants.ACTIVITY);
        runAnimators.ag$a(windowLayoutInfo, "info");
        List<androidx.window.extensions.layout.FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        runAnimators.ah$a(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (androidx.window.extensions.layout.FoldingFeature foldingFeature2 : displayFeatures) {
            if (foldingFeature2 instanceof androidx.window.extensions.layout.FoldingFeature) {
                ExtensionsWindowLayoutInfoAdapter extensionsWindowLayoutInfoAdapter = INSTANCE;
                runAnimators.ah$a(foldingFeature2, "feature");
                foldingFeature = extensionsWindowLayoutInfoAdapter.translate$window_release(activity, foldingFeature2);
            } else {
                foldingFeature = null;
            }
            if (foldingFeature != null) {
                arrayList.add(foldingFeature);
            }
        }
        return new WindowLayoutInfo(arrayList);
    }

    private final boolean validBounds(Activity activity, Bounds bounds) {
        Rect bounds2 = WindowMetricsCalculatorCompat.INSTANCE.computeCurrentWindowMetrics(activity).getBounds();
        if (bounds.isZero()) {
            return false;
        }
        if (bounds.getWidth() == bounds2.width() || bounds.getHeight() == bounds2.height()) {
            if (bounds.getWidth() >= bounds2.width() || bounds.getHeight() >= bounds2.height()) {
                return (bounds.getWidth() == bounds2.width() && bounds.getHeight() == bounds2.height()) ? false : true;
            }
            return false;
        }
        return false;
    }
}
