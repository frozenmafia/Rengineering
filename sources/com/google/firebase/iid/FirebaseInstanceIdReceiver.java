package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import o.isViewInvalid;
/* loaded from: classes7.dex */
public final class FirebaseInstanceIdReceiver extends CloudMessagingReceiver {
    private static Intent ah$a(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    public final int onMessageReceive(Context context, CloudMessage cloudMessage) {
        try {
            return ((Integer) Tasks.await(new isViewInvalid(context).ag$a(cloudMessage.getIntent()))).intValue();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseInstanceId", "Failed to send message to service.", e);
            return 500;
        }
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    public final void onNotificationOpen(Context context, Bundle bundle) {
        try {
            Tasks.await(new isViewInvalid(context).ag$a(ah$a(context, CloudMessagingReceiver.IntentActionKeys.NOTIFICATION_OPEN, bundle)));
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseInstanceId", "Failed to send notification open event to service.", e);
        }
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    public final void onNotificationDismissed(Context context, Bundle bundle) {
        try {
            Tasks.await(new isViewInvalid(context).ag$a(ah$a(context, CloudMessagingReceiver.IntentActionKeys.NOTIFICATION_DISMISS, bundle)));
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseInstanceId", "Failed to send notification dismissed event to service.", e);
        }
    }
}
