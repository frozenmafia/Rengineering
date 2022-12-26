package o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import o.Styleable;
/* loaded from: classes3.dex */
public final class addKeyboardNavigationClusters extends Handler {
    public final /* synthetic */ cancelDragAndDrop toString;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public addKeyboardNavigationClusters(cancelDragAndDrop canceldraganddrop, Looper looper) {
        super(looper);
        this.toString = canceldraganddrop;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        runAnimators.ag$a(message, androidx.core.app.NotificationCompat.CATEGORY_MESSAGE);
        cancelDragAndDrop canceldraganddrop = this.toString;
        synchronized (canceldraganddrop) {
            if (!canceldraganddrop.invoke) {
                long elapsedRealtime = canceldraganddrop.ah$b - SystemClock.elapsedRealtime();
                if (elapsedRealtime <= 0) {
                    Styleable.ArcMotion<setAnimationMatrix> arcMotion = canceldraganddrop.valueOf;
                    if (arcMotion != null) {
                        arcMotion.invoke();
                    }
                } else if (elapsedRealtime < canceldraganddrop.ah$a) {
                    sendMessageDelayed(obtainMessage(1), elapsedRealtime);
                } else {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    Styleable.ChangeBounds<? super Long, setAnimationMatrix> changeBounds = canceldraganddrop.ag$a;
                    if (changeBounds != null) {
                        changeBounds.invoke(Long.valueOf(canceldraganddrop.values - elapsedRealtime));
                    }
                    long elapsedRealtime3 = elapsedRealtime2 - SystemClock.elapsedRealtime();
                    long j = canceldraganddrop.ah$a;
                    while (true) {
                        elapsedRealtime3 += j;
                        if (elapsedRealtime3 >= 0) {
                            break;
                        }
                        j = canceldraganddrop.ah$a;
                    }
                    if (!canceldraganddrop.HaptikSDK$a) {
                        sendMessageDelayed(obtainMessage(1), elapsedRealtime3);
                    }
                }
            }
            setAnimationMatrix setanimationmatrix = setAnimationMatrix.ag$a;
        }
    }
}
