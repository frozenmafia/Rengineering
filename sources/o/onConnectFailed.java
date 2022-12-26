package o;

import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.Entry;
/* loaded from: classes4.dex */
public interface onConnectFailed<T extends Entry> extends sendMessageAtTime<T> {
    Drawable mayLaunchUrl();

    float newSessionWithExtras();

    int postMessage();

    int receiveFile();

    boolean requestPostMessageChannel();
}
