package o;

import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* loaded from: classes3.dex */
public final class updateLocalState implements getColorFilter {
    public static final updateLocalState ag$a = new updateLocalState(ImmutableList.of());
    public static final getColorFilter$ah$a<updateLocalState> values = WrappedDrawableApi21.ah$a;
    public final ImmutableList<isCompatTintEnabled> ah$a;

    public updateLocalState(List<isCompatTintEnabled> list) {
        this.ah$a = ImmutableList.copyOf((Collection) list);
    }

    @Override // o.getColorFilter
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(Integer.toString(0, 36), isHardwareDetected.valueOf(valueOf(this.ah$a)));
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final updateLocalState values(Bundle bundle) {
        ImmutableList ah$a;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        if (parcelableArrayList == null) {
            ah$a = ImmutableList.of();
        } else {
            ah$a = isHardwareDetected.ah$a(isCompatTintEnabled.ah$a, parcelableArrayList);
        }
        return new updateLocalState(ah$a);
    }

    private static ImmutableList<isCompatTintEnabled> valueOf(List<isCompatTintEnabled> list) {
        ImmutableList.valueOf builder = ImmutableList.builder();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).ag$a == null) {
                builder.toString((ImmutableList.valueOf) list.get(i));
            }
        }
        return builder.ah$a();
    }
}
