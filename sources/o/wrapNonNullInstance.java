package o;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.pushtemplates.TemplateRenderer;
/* loaded from: classes3.dex */
public abstract class wrapNonNullInstance {
    private TemplateRenderer values;

    protected abstract PendingIntent ah$a(Context context, Bundle bundle, int i);

    protected abstract PendingIntent valueOf(Context context, Bundle bundle, int i);

    protected abstract RemoteViews valueOf(Context context, TemplateRenderer templateRenderer);

    protected abstract RemoteViews values(Context context, TemplateRenderer templateRenderer);

    public wrapNonNullInstance(TemplateRenderer templateRenderer) {
        runAnimators.ag$a(templateRenderer, "renderer");
        this.values = templateRenderer;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public NotificationCompat.Builder ag$a(NotificationCompat.Builder builder, RemoteViews remoteViews, RemoteViews remoteViews2, String str, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        runAnimators.ag$a(builder, "notificationBuilder");
        if (pendingIntent2 != null) {
            builder.setDeleteIntent(pendingIntent2);
        }
        if (remoteViews != null) {
            builder.setCustomContentView(remoteViews);
        }
        if (remoteViews2 != null) {
            builder.setCustomBigContentView(remoteViews2);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            builder.setSubText(this.values.ICustomTabsCallback$Stub());
        }
        NotificationCompat.Builder when = builder.setSmallIcon(this.values.getInterfaceDescriptor()).setContentTitle(Html.fromHtml(str)).setContentIntent(pendingIntent).setVibrate(new long[]{0}).setWhen(System.currentTimeMillis());
        String defaultImpl = this.values.getDefaultImpl();
        if (defaultImpl == null) {
            defaultImpl = "#FFFFFF";
        }
        NotificationCompat.Builder onlyAlertOnce = when.setColor(Color.parseColor(defaultImpl)).setAutoCancel(true).setOnlyAlertOnce(true);
        runAnimators.ah$a(onlyAlertOnce, "notificationBuilder.setS…  .setOnlyAlertOnce(true)");
        return onlyAlertOnce;
    }

    public NotificationCompat.Builder ag$a(Context context, Bundle bundle, int i, NotificationCompat.Builder builder) {
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(bundle, "extras");
        runAnimators.ag$a(builder, "nb");
        return ag$a(builder, valueOf(context, this.values), values(context, this.values), this.values.ICustomTabsCallback$Stub$Proxy(), ah$a(context, bundle, i), valueOf(context, bundle, i));
    }
}
