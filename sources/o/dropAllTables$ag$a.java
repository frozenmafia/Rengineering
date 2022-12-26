package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* loaded from: classes5.dex */
class dropAllTables$ag$a extends BroadcastReceiver {
    private boolean ag$a;
    final /* synthetic */ dropAllTables ah$a;

    private dropAllTables$ag$a(dropAllTables dropalltables) {
        this.ah$a = dropalltables;
        this.ag$a = false;
    }

    public void ag$a(boolean z) {
        this.ag$a = z;
    }

    public boolean valueOf() {
        return this.ag$a;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null || !action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            return;
        }
        dropAllTables.ag$a(this.ah$a);
    }
}
