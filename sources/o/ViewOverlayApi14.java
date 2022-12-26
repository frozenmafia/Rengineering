package o;

import java.util.Iterator;
/* loaded from: classes5.dex */
public interface ViewOverlayApi14<T> extends invalidateChildInParent<T> {
    invalidateChildInParent<T> toString(int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public final class OverlayViewGroup implements ViewOverlayApi14 {
        public static final OverlayViewGroup valueOf = new OverlayViewGroup();

        private OverlayViewGroup() {
        }

        @Override // o.invalidateChildInParent
        public Iterator iterator() {
            return fetchAddGhostMethod.values;
        }

        @Override // o.ViewOverlayApi14
        /* renamed from: ag$a */
        public OverlayViewGroup toString(int i) {
            return valueOf;
        }
    }
}
