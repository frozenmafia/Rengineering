package o;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.List;
/* loaded from: classes6.dex */
public final /* synthetic */ class Person implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ Person ag$a = new Person();

    private /* synthetic */ Person() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        try {
            return ((Class) getRealOwner.ag$a((char) (42856 - TextUtils.getCapsMode("", 0, 0)), 31 - ExpandableListView.getPackedPositionGroup(0L), 22 - (ViewConfiguration.getPressedStateDuration() >> 16))).getDeclaredMethod("valueOf", saveState.class).invoke(null, (saveState) obj);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* loaded from: classes3.dex */
    public final class Builder {
        private static final List<String> ag$a = reserveEndViewTransition.valueOf("CAPTAIN_SELECTION_PERCENT", "VICE_CAPTAIN_SELECTION_PERCENT", "TIMES_IN_DREAM_TEAM_PERCENT");

        public static final List<String> values() {
            return ag$a;
        }
    }
}
