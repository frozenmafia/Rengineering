package o;

import kotlinx.serialization.json.internal.JsonElementMarker$origin$1;
import o.FragmentStateAdapter;
/* loaded from: classes8.dex */
public abstract class FailedSpecification extends setUserInputEnabled {
    public abstract void ah$a(String str, updatePageAccessibilityActions updatepageaccessibilityactions);

    /* loaded from: classes5.dex */
    public final class WhenMappings {
        private final ScrollEventAdapter ah$a;
        private boolean values;

        public WhenMappings(FragmentStateAdapter.DataSetChangeObserver dataSetChangeObserver) {
            runAnimators.ag$a(dataSetChangeObserver, "descriptor");
            this.ah$a = new ScrollEventAdapter(dataSetChangeObserver, new JsonElementMarker$origin$1(this));
        }

        public final boolean ag$a() {
            return this.values;
        }

        public final void values(int i) {
            this.ah$a.values(i);
        }

        public final int valueOf() {
            return this.ah$a.values();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean valueOf(FragmentStateAdapter.DataSetChangeObserver dataSetChangeObserver, int i) {
            boolean z = !dataSetChangeObserver.toString(i) && dataSetChangeObserver.valueOf(i).ah$b();
            this.values = z;
            return z;
        }
    }
}
