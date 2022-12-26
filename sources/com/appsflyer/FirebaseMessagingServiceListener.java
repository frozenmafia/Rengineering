package com.appsflyer;

import com.appsflyer.internal.ba;
import com.google.firebase.messaging.FirebaseMessagingService;
/* loaded from: classes3.dex */
public class FirebaseMessagingServiceListener extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        new ba(getApplicationContext()).AFInAppEventType(str);
    }
}
