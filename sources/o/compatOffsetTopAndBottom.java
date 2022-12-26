package o;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.appsamurai.storyly.util.notification.StorylyNotificationReceiver;
/* loaded from: classes3.dex */
public final class compatOffsetTopAndBottom {
    public final Context values;

    public compatOffsetTopAndBottom(Context context) {
        runAnimators.ag$a(context, "context");
        this.values = context;
    }

    public final PendingIntent values(String str, int i) {
        Intent intent = new Intent(this.values, StorylyNotificationReceiver.class);
        intent.setPackage(this.values.getPackageName());
        intent.setAction("com.appsamurai.storyly.ACTION_COUNTDOWN_NOTIFICATION");
        return PendingIntent.getBroadcast(this.values, Integer.parseInt(str), intent, canScrollVertically.ag$a(i));
    }
}
