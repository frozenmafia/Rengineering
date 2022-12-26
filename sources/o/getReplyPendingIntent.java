package o;

import o.NotificationCompat;
/* loaded from: classes3.dex */
public final /* synthetic */ class getReplyPendingIntent implements FrameworkSQLiteOpenHelper {
    public static final /* synthetic */ getReplyPendingIntent valueOf = new getReplyPendingIntent();

    private /* synthetic */ getReplyPendingIntent() {
    }

    @Override // o.FrameworkSQLiteOpenHelper
    public final Object apply(Object obj, Object obj2) {
        Boolean ag$a;
        ag$a = NotificationCompat.CarExtender.UnreadConversation.Builder.ag$a((Integer) obj, (Boolean) obj2);
        return ag$a;
    }
}
