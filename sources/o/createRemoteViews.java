package o;

import o.NotificationCompat;
/* loaded from: classes3.dex */
public final /* synthetic */ class createRemoteViews implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ createRemoteViews values = new createRemoteViews();

    private /* synthetic */ createRemoteViews() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        Boolean builder;
        builder = NotificationCompat.CarExtender.UnreadConversation.Builder.toString((Integer) obj);
        return builder;
    }
}
