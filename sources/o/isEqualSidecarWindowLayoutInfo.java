package o;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseErrorList;
/* loaded from: classes5.dex */
public class isEqualSidecarWindowLayoutInfo {
    private setSidecarDisplayFeatures ah$a;
    private int toString = 0;
    private ParseErrorList valueOf;
    private getSidecarDevicePosture$window_release values;

    public isEqualSidecarWindowLayoutInfo(setSidecarDisplayFeatures setsidecardisplayfeatures) {
        this.ah$a = setsidecardisplayfeatures;
        this.values = setsidecardisplayfeatures.HaptikSDK$c();
    }

    public Document valueOf(String str, String str2) {
        this.valueOf = ag$a() ? ParseErrorList.tracking(this.toString) : ParseErrorList.noTracking();
        return this.ah$a.toString(new StringReader(str), str2, this.valueOf, this.values);
    }

    public Document values(Reader reader, String str) {
        ParseErrorList tracking = ag$a() ? ParseErrorList.tracking(this.toString) : ParseErrorList.noTracking();
        this.valueOf = tracking;
        return this.ah$a.toString(reader, str, tracking, this.values);
    }

    public boolean ag$a() {
        return this.toString > 0;
    }

    public static List<SidecarAdapter> ag$a(String str, Element element, String str2) {
        isEqualSidecarDeviceState isequalsidecardevicestate = new isEqualSidecarDeviceState();
        return isequalsidecardevicestate.toString(str, element, str2, ParseErrorList.noTracking(), isequalsidecardevicestate.HaptikSDK$c());
    }

    public static isEqualSidecarWindowLayoutInfo values() {
        return new isEqualSidecarWindowLayoutInfo(new isEqualSidecarDeviceState());
    }

    public static isEqualSidecarWindowLayoutInfo ah$a() {
        return new isEqualSidecarWindowLayoutInfo(new getSidecarDisplayFeatures());
    }
}
