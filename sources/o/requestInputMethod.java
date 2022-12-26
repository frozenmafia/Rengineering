package o;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.ParcelableSparseArray;
/* loaded from: classes5.dex */
public class requestInputMethod {
    public static final boolean valueOf;

    static {
        valueOf = Build.VERSION.SDK_INT < 18;
    }

    public static void values(Rect rect, float f, float f2, float f3, float f4) {
        rect.set((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }

    public static void toString(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
        values(badgeDrawable, view, frameLayout);
        if (badgeDrawable.values() != null) {
            badgeDrawable.values().setForeground(badgeDrawable);
        } else if (valueOf) {
            throw new IllegalArgumentException("Trying to reference null customBadgeParent");
        } else {
            view.getOverlay().add(badgeDrawable);
        }
    }

    public static void values(BadgeDrawable badgeDrawable, View view) {
        if (badgeDrawable == null) {
            return;
        }
        if (valueOf || badgeDrawable.values() != null) {
            badgeDrawable.values().setForeground(null);
        } else {
            view.getOverlay().remove(badgeDrawable);
        }
    }

    public static void values(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        badgeDrawable.setBounds(rect);
        badgeDrawable.ag$a(view, frameLayout);
    }

    public static ParcelableSparseArray ag$a(SparseArray<BadgeDrawable> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            BadgeDrawable valueAt = sparseArray.valueAt(i);
            if (valueAt == null) {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
            parcelableSparseArray.put(keyAt, valueAt.HaptikSDK$b());
        }
        return parcelableSparseArray;
    }

    public static SparseArray<BadgeDrawable> values(Context context, ParcelableSparseArray parcelableSparseArray) {
        SparseArray<BadgeDrawable> sparseArray = new SparseArray<>(parcelableSparseArray.size());
        for (int i = 0; i < parcelableSparseArray.size(); i++) {
            int keyAt = parcelableSparseArray.keyAt(i);
            BadgeDrawable.SavedState savedState = (BadgeDrawable.SavedState) parcelableSparseArray.valueAt(i);
            if (savedState == null) {
                throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
            }
            sparseArray.put(keyAt, BadgeDrawable.values(context, savedState));
        }
        return sparseArray;
    }
}
