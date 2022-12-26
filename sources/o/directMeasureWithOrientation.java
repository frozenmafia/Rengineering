package o;

import com.app.dream11.notificationcentre.NotificationOptionsBottomSheet;
import o.directMeasureSetup;
/* loaded from: classes3.dex */
public final class directMeasureWithOrientation extends getGroupId<directMeasureSetup> implements directMeasureSetup.valueOf {
    public static final values toString = new values(null);
    private directMeasureSetup ah$a = new directMeasureSetup(this);
    private NotificationOptionsBottomSheet.valueOf valueOf;

    public final void values(NotificationOptionsBottomSheet.valueOf valueof) {
        this.valueOf = valueof;
    }

    @Override // o.getGroupId
    /* renamed from: ah$a */
    public directMeasureSetup initializeVM() {
        return this.ah$a;
    }

    @Override // o.directMeasureSetup.valueOf
    public void values() {
        NotificationOptionsBottomSheet.valueOf valueof = this.valueOf;
        if (valueof != null) {
            valueof.ah$a();
        }
        postViewEvent(new Compatibility(1, null));
    }

    /* loaded from: classes3.dex */
    public static final class values {
        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }

        private values() {
        }
    }
}
