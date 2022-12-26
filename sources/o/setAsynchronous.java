package o;

import com.google.android.exoplayer2.util.MimeTypes;
/* loaded from: classes3.dex */
public interface setAsynchronous {
    public static final setAsynchronous values = new setAsynchronous() { // from class: o.setAsynchronous.1
        @Override // o.setAsynchronous
        public boolean values(createFromIcon createfromicon) {
            String str = createfromicon.onNavigationEvent;
            return MimeTypes.APPLICATION_ID3.equals(str) || MimeTypes.APPLICATION_EMSG.equals(str) || MimeTypes.APPLICATION_SCTE35.equals(str) || MimeTypes.APPLICATION_ICY.equals(str) || MimeTypes.APPLICATION_AIT.equals(str);
        }

        @Override // o.setAsynchronous
        public TransitionKt$doOnPause$$inlined$addListener$default$1 valueOf(createFromIcon createfromicon) {
            String str = createfromicon.onNavigationEvent;
            if (str != null) {
                str.hashCode();
                char c = 65535;
                switch (str.hashCode()) {
                    case -1354451219:
                        if (str.equals(MimeTypes.APPLICATION_AIT)) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1348231605:
                        if (str.equals(MimeTypes.APPLICATION_ICY)) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1248341703:
                        if (str.equals(MimeTypes.APPLICATION_ID3)) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1154383568:
                        if (str.equals(MimeTypes.APPLICATION_EMSG)) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1652648887:
                        if (str.equals(MimeTypes.APPLICATION_SCTE35)) {
                            c = 4;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    return new rename();
                }
                if (c == 1) {
                    return new readFully();
                }
                if (c == 2) {
                    return new finishWrite();
                }
                if (c == 3) {
                    return new TransitionKt$doOnStart$$inlined$addListener$default$1();
                }
                if (c == 4) {
                    return new openRead();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    };

    TransitionKt$doOnPause$$inlined$addListener$default$1 valueOf(createFromIcon createfromicon);

    boolean values(createFromIcon createfromicon);
}
