package com.sendbird.android;

import com.sendbird.android.log.Logger;
/* loaded from: classes5.dex */
public class ConnectionManager {

    /* loaded from: classes7.dex */
    public interface AuthInfoRequestHandler {
        void onAuthInfoRequest(AuthInfoRequester authInfoRequester);
    }

    /* loaded from: classes7.dex */
    public interface AuthInfoRequester {
        void setAuthInfo(String str, String str2);

        void setAuthInfoWithHostInfo(String str, String str2, String str3, String str4);
    }

    /* loaded from: classes5.dex */
    public interface AuthenticateHandler {
        void onAuthenticated(User user, SendBirdException sendBirdException);
    }

    /* loaded from: classes5.dex */
    public static abstract class NetworkHandler {
        public abstract void onReconnected();
    }

    public static void authenticate(AuthInfoRequestHandler authInfoRequestHandler, AuthenticateHandler authenticateHandler) {
        Logger.d("[ConnectionManager] authenticate()");
        SocketManager.getInstance().connectFromAuthenticate(authInfoRequestHandler, authenticateHandler);
    }

    public static void addNetworkHandler(String str, NetworkHandler networkHandler) {
        SocketManager.getInstance().addNetworkHandler(str, networkHandler);
    }

    public static void removeNetworkHandler(String str) {
        SocketManager.getInstance().removeNetworkHandler(str);
    }

    public static void removeAllNetworkHandlers() {
        SocketManager.getInstance().removeAllNetworkHandlers();
    }
}
