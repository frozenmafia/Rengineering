package o;

import com.fancode.video.network.NetworkUtil;
/* loaded from: classes4.dex */
public final class withCreated {
    public static final values valueOf = new values(null);

    /* loaded from: classes4.dex */
    public static final class values {
        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }

        private values() {
        }

        public final String toString(int i) {
            if (i == 5001 || i == 5002) {
                return "PLAYER_ERROR";
            }
            switch (i) {
                case 1000:
                case 1001:
                case 1002:
                case 1003:
                case 1004:
                    break;
                default:
                    switch (i) {
                        case 2001:
                        case 2002:
                        case 2003:
                        case 2004:
                        case 2005:
                        case 2006:
                        case 2007:
                        case 2008:
                            break;
                        default:
                            switch (i) {
                                case 3001:
                                case 3002:
                                case 3003:
                                case 3004:
                                    return "PLAYER_ERROR";
                                default:
                                    switch (i) {
                                        case 4001:
                                        case 4002:
                                        case 4003:
                                        case 4004:
                                        case 4005:
                                            return "PLAYER_ERROR";
                                        default:
                                            switch (i) {
                                                case 6000:
                                                case 6001:
                                                case 6002:
                                                case 6003:
                                                case 6004:
                                                case 6005:
                                                case 6006:
                                                case 6007:
                                                case 6008:
                                                    break;
                                                default:
                                                    return "AUTO_RETRY";
                                            }
                                    }
                            }
                    }
            }
            return NetworkUtil.ag$a().valueOf() == 1 ? "SOURCE_ERROR" : "NO_INTERNET";
        }
    }
}
