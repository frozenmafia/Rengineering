package o;

import android.graphics.RectF;
import java.util.Arrays;
import o.PreferenceGroup;
/* loaded from: classes5.dex */
public final class flattenPreferenceGroup implements PreferenceGroup.SavedState.AnonymousClass1 {
    private final float values;

    public flattenPreferenceGroup(float f) {
        this.values = f;
    }

    @Override // o.PreferenceGroup.SavedState.AnonymousClass1
    public float ah$a(RectF rectF) {
        return this.values;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof flattenPreferenceGroup) && this.values == ((flattenPreferenceGroup) obj).values;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.values)});
    }
}
