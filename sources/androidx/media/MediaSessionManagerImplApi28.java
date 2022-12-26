package androidx.media;

import android.content.Context;
import android.media.session.MediaSessionManager;
import androidx.media.MediaSessionManager;
import androidx.media.MediaSessionManagerImplBase;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class MediaSessionManagerImplApi28 extends MediaSessionManagerImplApi21 {
    android.media.session.MediaSessionManager mObject;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MediaSessionManagerImplApi28(Context context) {
        super(context);
        this.mObject = (android.media.session.MediaSessionManager) context.getSystemService("media_session");
    }

    @Override // androidx.media.MediaSessionManagerImplApi21, androidx.media.MediaSessionManagerImplBase, androidx.media.MediaSessionManager.MediaSessionManagerImpl
    public boolean isTrustedForMediaControl(MediaSessionManager.RemoteUserInfoImpl remoteUserInfoImpl) {
        return super.isTrustedForMediaControl(remoteUserInfoImpl);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class RemoteUserInfoImplApi28 extends MediaSessionManagerImplBase.RemoteUserInfoImplBase {
        final MediaSessionManager.RemoteUserInfo mObject;

        /* JADX INFO: Access modifiers changed from: package-private */
        public RemoteUserInfoImplApi28(String str, int i, int i2) {
            super(str, i, i2);
            this.mObject = new MediaSessionManager.RemoteUserInfo(str, i, i2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public RemoteUserInfoImplApi28(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
            this.mObject = remoteUserInfo;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static String getPackageName(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            return remoteUserInfo.getPackageName();
        }
    }
}
