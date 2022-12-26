package o;

import o.MediaButtonReceiver;
/* loaded from: classes4.dex */
public class handleIntent extends getMediaButtonReceiverComponent {
    public handleIntent(MediaButtonReceiver.MediaButtonConnectionCallback mediaButtonConnectionCallback) {
        super(mediaButtonConnectionCallback);
    }

    @Override // o.getMediaButtonReceiverComponent
    public void values(boolean z) {
        this.ag$a.reset();
        if (!z) {
            this.ag$a.postTranslate(this.toString.onPostMessage(), this.toString.HaptikSDK$e() - this.toString.extraCallback());
            return;
        }
        this.ag$a.setTranslate(-(this.toString.getSignupData() - this.toString.ICustomTabsCallback$Default()), this.toString.HaptikSDK$e() - this.toString.extraCallback());
        this.ag$a.postScale(-1.0f, 1.0f);
    }
}
