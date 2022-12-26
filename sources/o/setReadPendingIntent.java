package o;

import o.NotificationCompat;
/* loaded from: classes3.dex */
public final /* synthetic */ class setReadPendingIntent implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ setReadPendingIntent values = new setReadPendingIntent();

    private /* synthetic */ setReadPendingIntent() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        Boolean ah$a;
        ah$a = NotificationCompat.CarExtender.UnreadConversation.Builder.ah$a((Integer) obj);
        return ah$a;
    }
}
