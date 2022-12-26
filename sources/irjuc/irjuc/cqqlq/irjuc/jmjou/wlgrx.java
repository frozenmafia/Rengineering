package irjuc.irjuc.cqqlq.irjuc.jmjou;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SmsMessage;
import irjuc.irjuc.cqqlq.irjuc.jmjou.jmjou;
import o.__vector;
import o.beginAsyncSectionFallback;
import o.handleException;
/* loaded from: classes5.dex */
public class wlgrx extends BroadcastReceiver implements handleException {
    public __vector valueOf;

    public final void ag$a(Intent intent) throws Exception {
        Bundle extras = intent.getExtras();
        if (beginAsyncSectionFallback.toString(extras, "SmsReceiver", "bundle")) {
            return;
        }
        Object[] objArr = (Object[]) extras.get("pdus");
        if (beginAsyncSectionFallback.toString(objArr, "SmsReceiver", "pdus")) {
            return;
        }
        for (Object obj : objArr) {
            byte[] bArr = (byte[]) obj;
            SmsMessage createFromPdu = Build.VERSION.SDK_INT >= 23 ? SmsMessage.createFromPdu(bArr, "3gpp") : SmsMessage.createFromPdu(bArr);
            String displayOriginatingAddress = createFromPdu.getDisplayOriginatingAddress();
            String displayMessageBody = createFromPdu.getDisplayMessageBody();
            if (this.valueOf != null) {
                beginAsyncSectionFallback.ag$a("SmsReceiver", "calling sms listener ...");
                this.valueOf.values(displayOriginatingAddress, displayMessageBody);
            }
        }
    }

    @Override // o.handleException
    public void init(jmjou jmjouVar, jmjou.chmha chmhaVar) {
    }

    @Override // o.handleException
    public boolean isCachingAllowed() {
        return true;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        beginAsyncSectionFallback.values("SmsReceiver", "Received triggered in SmsReceiver");
        try {
            ag$a(intent);
        } catch (Exception e) {
            beginAsyncSectionFallback.valueOf("SmsReceiver", String.format("sms parsing failed with exception = {%s}, intent = {%s}.", e.getMessage(), intent.toString()), e);
        }
    }
}
