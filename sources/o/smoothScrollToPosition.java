package o;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.FirebaseNetworkException;
/* loaded from: classes5.dex */
final class smoothScrollToPosition implements OnFailureListener {
    final /* synthetic */ setSmoothScrollbarEnabled values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public smoothScrollToPosition(setSmoothScrollbarEnabled setsmoothscrollbarenabled) {
        this.values = setsmoothscrollbarenabled;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        com.google.android.gms.common.logging.Logger logger;
        if (exc instanceof FirebaseNetworkException) {
            logger = assignFromViewAndKeepVisibleRect.ah$b;
            logger.v("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            this.values.toString.valueOf();
        }
    }
}
