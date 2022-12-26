package o;

import java.util.Iterator;
import org.jsoup.nodes.Element;
/* loaded from: classes5.dex */
abstract class getWindowLayoutInfo extends SidecarCompat {
    SidecarCompat toString;

    /* loaded from: classes5.dex */
    static class values extends getWindowLayoutInfo {
        public values(SidecarCompat sidecarCompat) {
            this.toString = sidecarCompat;
        }

        @Override // o.SidecarCompat
        public boolean values(Element element, Element element2) {
            Iterator<Element> it = element2.extraCallback().iterator();
            while (it.hasNext()) {
                Element next = it.next();
                if (next != element2 && this.toString.values(element, next)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format(":has(%s)", this.toString);
        }
    }

    /* loaded from: classes5.dex */
    static class valueOf extends getWindowLayoutInfo {
        public valueOf(SidecarCompat sidecarCompat) {
            this.toString = sidecarCompat;
        }

        @Override // o.SidecarCompat
        public boolean values(Element element, Element element2) {
            if (element == element2) {
                return false;
            }
            for (Element onMessageChannelReady = element2.onMessageChannelReady(); !this.toString.values(element, onMessageChannelReady); onMessageChannelReady = onMessageChannelReady.onMessageChannelReady()) {
                if (onMessageChannelReady == element) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return String.format(":parent%s", this.toString);
        }
    }

    /* loaded from: classes5.dex */
    static class toString extends getWindowLayoutInfo {
        public toString(SidecarCompat sidecarCompat) {
            this.toString = sidecarCompat;
        }

        @Override // o.SidecarCompat
        public boolean values(Element element, Element element2) {
            Element onMessageChannelReady;
            return (element == element2 || (onMessageChannelReady = element2.onMessageChannelReady()) == null || !this.toString.values(element, onMessageChannelReady)) ? false : true;
        }

        public String toString() {
            return String.format(":ImmediateParent%s", this.toString);
        }
    }
}
