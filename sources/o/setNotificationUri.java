package o;

import com.facebook.react.bridge.ReadableMap;
import com.horcrux.svg.SVGLength;
import java.util.ArrayList;
/* loaded from: classes5.dex */
public class setNotificationUri {
    private double HaptikSDK$a;
    private final ArrayList<SVGLength[]> HaptikSDK$b;
    private final ArrayList<Integer> HaptikSDK$c;
    private final ArrayList<Integer> HaptikSDK$d;
    private final ArrayList<Integer> HaptikSDK$e;
    private final ArrayList<SVGLength[]> HaptikWebView;
    private final ArrayList<double[]> ICustomTabsCallback;
    private SVGLength[] ICustomTabsCallback$Default;
    private double ICustomTabsCallback$Stub;
    private SVGLength[] ICustomTabsCallback$Stub$Proxy;
    private final ArrayList<Integer> ICustomTabsService;
    private int a;
    private double ag$a;
    private SVGLength[] ah$a;
    private int ah$b;
    private final ArrayList<Integer> aj$a;
    private double ak;
    private int ak$a;
    private int ak$b;
    private final ArrayList<Integer> asBinder;
    private int asInterface;
    private final ArrayList<Integer> extraCallback;
    private final float extraCallbackWithResult;
    private final ArrayList<SVGLength[]> extraCommand;
    private int getDefaultImpl;
    private int getInitSettings;
    private final ArrayList<Integer> getInterfaceDescriptor;
    private SVGLength[] getSignupData;
    private int invoke;
    private final float isLogoutPending;
    private setNotificationUris newSessionWithExtras;
    private final float onMessageChannelReady;
    private final ArrayList<Integer> onNavigationEvent;
    private double onPostMessage;
    private int onRelationshipValidationResult;
    private int onTransact;
    private double[] onXdkEvent;
    private final ArrayList<SVGLength[]> setDefaultImpl;
    final ArrayList<setNotificationUris> toString;
    private int valueOf;
    private final ArrayList<Integer> values;

    private void getInitSettings() {
        this.asBinder.add(Integer.valueOf(this.getDefaultImpl));
        this.ICustomTabsService.add(Integer.valueOf(this.onTransact));
        this.HaptikSDK$c.add(Integer.valueOf(this.invoke));
        this.HaptikSDK$d.add(Integer.valueOf(this.getInitSettings));
        this.extraCallback.add(Integer.valueOf(this.ak$b));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setNotificationUri(float f, float f2, float f3) {
        ArrayList<setNotificationUris> arrayList = new ArrayList<>();
        this.toString = arrayList;
        ArrayList<SVGLength[]> arrayList2 = new ArrayList<>();
        this.setDefaultImpl = arrayList2;
        ArrayList<SVGLength[]> arrayList3 = new ArrayList<>();
        this.extraCommand = arrayList3;
        ArrayList<SVGLength[]> arrayList4 = new ArrayList<>();
        this.HaptikSDK$b = arrayList4;
        ArrayList<SVGLength[]> arrayList5 = new ArrayList<>();
        this.HaptikWebView = arrayList5;
        ArrayList<double[]> arrayList6 = new ArrayList<>();
        this.ICustomTabsCallback = arrayList6;
        ArrayList<Integer> arrayList7 = new ArrayList<>();
        this.onNavigationEvent = arrayList7;
        ArrayList<Integer> arrayList8 = new ArrayList<>();
        this.getInterfaceDescriptor = arrayList8;
        ArrayList<Integer> arrayList9 = new ArrayList<>();
        this.values = arrayList9;
        ArrayList<Integer> arrayList10 = new ArrayList<>();
        this.HaptikSDK$e = arrayList10;
        ArrayList<Integer> arrayList11 = new ArrayList<>();
        this.aj$a = arrayList11;
        this.asBinder = new ArrayList<>();
        this.ICustomTabsService = new ArrayList<>();
        this.HaptikSDK$c = new ArrayList<>();
        this.HaptikSDK$d = new ArrayList<>();
        this.extraCallback = new ArrayList<>();
        this.ak = 12.0d;
        this.newSessionWithExtras = setNotificationUris.valueOf;
        SVGLength[] sVGLengthArr = new SVGLength[0];
        this.ICustomTabsCallback$Default = sVGLengthArr;
        this.ICustomTabsCallback$Stub$Proxy = new SVGLength[0];
        this.ah$a = new SVGLength[0];
        this.getSignupData = new SVGLength[0];
        this.onXdkEvent = new double[]{0.0d};
        this.onRelationshipValidationResult = -1;
        this.asInterface = -1;
        this.valueOf = -1;
        this.ah$b = -1;
        this.a = -1;
        this.extraCallbackWithResult = f;
        this.onMessageChannelReady = f2;
        this.isLogoutPending = f3;
        arrayList2.add(sVGLengthArr);
        arrayList3.add(this.ICustomTabsCallback$Stub$Proxy);
        arrayList4.add(this.ah$a);
        arrayList5.add(this.getSignupData);
        arrayList6.add(this.onXdkEvent);
        arrayList7.add(Integer.valueOf(this.onRelationshipValidationResult));
        arrayList8.add(Integer.valueOf(this.asInterface));
        arrayList9.add(Integer.valueOf(this.valueOf));
        arrayList10.add(Integer.valueOf(this.ah$b));
        arrayList11.add(Integer.valueOf(this.a));
        arrayList.add(this.newSessionWithExtras);
        getInitSettings();
    }

    private void HaptikSDK$e() {
        this.ak$b = 0;
        this.getInitSettings = 0;
        this.invoke = 0;
        this.onTransact = 0;
        this.getDefaultImpl = 0;
        this.a = -1;
        this.ah$b = -1;
        this.valueOf = -1;
        this.asInterface = -1;
        this.onRelationshipValidationResult = -1;
        this.HaptikSDK$a = 0.0d;
        this.ag$a = 0.0d;
        this.ICustomTabsCallback$Stub = 0.0d;
        this.onPostMessage = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setNotificationUris values() {
        return this.newSessionWithExtras;
    }

    private setNotificationUris valueOf(AutoClosingRoomOpenHelperFactory autoClosingRoomOpenHelperFactory) {
        if (this.ak$a > 0) {
            return this.newSessionWithExtras;
        }
        for (AutoClosingRoomOpenHelperFactory parentTextRoot = autoClosingRoomOpenHelperFactory.getParentTextRoot(); parentTextRoot != null; parentTextRoot = parentTextRoot.getParentTextRoot()) {
            setNotificationUris values = parentTextRoot.valueOf().values();
            if (values != setNotificationUris.valueOf) {
                return values;
            }
        }
        return setNotificationUris.valueOf;
    }

    private void values(AutoClosingRoomOpenHelperFactory autoClosingRoomOpenHelperFactory, ReadableMap readableMap) {
        setNotificationUris valueOf = valueOf(autoClosingRoomOpenHelperFactory);
        this.ak$a++;
        if (readableMap == null) {
            this.toString.add(valueOf);
            return;
        }
        setNotificationUris setnotificationuris = new setNotificationUris(readableMap, valueOf, this.extraCallbackWithResult);
        this.ak = setnotificationuris.HaptikSDK$a;
        this.toString.add(setnotificationuris);
        this.newSessionWithExtras = setnotificationuris;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void valueOf(AutoClosingRoomOpenHelperFactory autoClosingRoomOpenHelperFactory, ReadableMap readableMap) {
        values(autoClosingRoomOpenHelperFactory, readableMap);
        getInitSettings();
    }

    private SVGLength[] toString(ArrayList<SVGLength> arrayList) {
        int size = arrayList.size();
        SVGLength[] sVGLengthArr = new SVGLength[size];
        for (int i = 0; i < size; i++) {
            sVGLengthArr[i] = arrayList.get(i);
        }
        return sVGLengthArr;
    }

    private double[] ag$a(ArrayList<SVGLength> arrayList) {
        int size = arrayList.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = arrayList.get(i).values;
        }
        return dArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void values(boolean z, viewName viewname, ReadableMap readableMap, ArrayList<SVGLength> arrayList, ArrayList<SVGLength> arrayList2, ArrayList<SVGLength> arrayList3, ArrayList<SVGLength> arrayList4, ArrayList<SVGLength> arrayList5) {
        if (z) {
            HaptikSDK$e();
        }
        values(viewname, readableMap);
        if (arrayList != null && arrayList.size() != 0) {
            this.getDefaultImpl++;
            this.onRelationshipValidationResult = -1;
            this.onNavigationEvent.add(-1);
            SVGLength[] setnotificationuri = toString(arrayList);
            this.ICustomTabsCallback$Default = setnotificationuri;
            this.setDefaultImpl.add(setnotificationuri);
        }
        if (arrayList2 != null && arrayList2.size() != 0) {
            this.onTransact++;
            this.asInterface = -1;
            this.getInterfaceDescriptor.add(-1);
            SVGLength[] setnotificationuri2 = toString(arrayList2);
            this.ICustomTabsCallback$Stub$Proxy = setnotificationuri2;
            this.extraCommand.add(setnotificationuri2);
        }
        if (arrayList3 != null && arrayList3.size() != 0) {
            this.invoke++;
            this.valueOf = -1;
            this.values.add(-1);
            SVGLength[] setnotificationuri3 = toString(arrayList3);
            this.ah$a = setnotificationuri3;
            this.HaptikSDK$b.add(setnotificationuri3);
        }
        if (arrayList4 != null && arrayList4.size() != 0) {
            this.getInitSettings++;
            this.ah$b = -1;
            this.HaptikSDK$e.add(-1);
            SVGLength[] setnotificationuri4 = toString(arrayList4);
            this.getSignupData = setnotificationuri4;
            this.HaptikWebView.add(setnotificationuri4);
        }
        if (arrayList5 != null && arrayList5.size() != 0) {
            this.ak$b++;
            this.a = -1;
            this.aj$a.add(-1);
            double[] ag$a = ag$a(arrayList5);
            this.onXdkEvent = ag$a;
            this.ICustomTabsCallback.add(ag$a);
        }
        getInitSettings();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void HaptikSDK$b() {
        this.toString.remove(this.ak$a);
        this.asBinder.remove(this.ak$a);
        this.ICustomTabsService.remove(this.ak$a);
        this.HaptikSDK$c.remove(this.ak$a);
        this.HaptikSDK$d.remove(this.ak$a);
        this.extraCallback.remove(this.ak$a);
        int i = this.ak$a - 1;
        this.ak$a = i;
        int i2 = this.getDefaultImpl;
        int i3 = this.onTransact;
        int i4 = this.invoke;
        int i5 = this.getInitSettings;
        int i6 = this.ak$b;
        this.newSessionWithExtras = this.toString.get(i);
        this.getDefaultImpl = this.asBinder.get(this.ak$a).intValue();
        this.onTransact = this.ICustomTabsService.get(this.ak$a).intValue();
        this.invoke = this.HaptikSDK$c.get(this.ak$a).intValue();
        this.getInitSettings = this.HaptikSDK$d.get(this.ak$a).intValue();
        this.ak$b = this.extraCallback.get(this.ak$a).intValue();
        if (i2 != this.getDefaultImpl) {
            this.setDefaultImpl.remove(i2);
            this.ICustomTabsCallback$Default = this.setDefaultImpl.get(this.getDefaultImpl);
            this.onRelationshipValidationResult = this.onNavigationEvent.get(this.getDefaultImpl).intValue();
        }
        if (i3 != this.onTransact) {
            this.extraCommand.remove(i3);
            this.ICustomTabsCallback$Stub$Proxy = this.extraCommand.get(this.onTransact);
            this.asInterface = this.getInterfaceDescriptor.get(this.onTransact).intValue();
        }
        if (i4 != this.invoke) {
            this.HaptikSDK$b.remove(i4);
            this.ah$a = this.HaptikSDK$b.get(this.invoke);
            this.valueOf = this.values.get(this.invoke).intValue();
        }
        if (i5 != this.getInitSettings) {
            this.HaptikWebView.remove(i5);
            this.getSignupData = this.HaptikWebView.get(this.getInitSettings);
            this.ah$b = this.HaptikSDK$e.get(this.getInitSettings).intValue();
        }
        if (i6 != this.ak$b) {
            this.ICustomTabsCallback.remove(i6);
            this.onXdkEvent = this.ICustomTabsCallback.get(this.ak$b);
            this.a = this.aj$a.get(this.ak$b).intValue();
        }
    }

    private static void toString(ArrayList<Integer> arrayList, int i) {
        while (i >= 0) {
            arrayList.set(i, Integer.valueOf(arrayList.get(i).intValue() + 1));
            i--;
        }
    }

    public double valueOf() {
        return this.ak;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double values(double d) {
        toString(this.onNavigationEvent, this.getDefaultImpl);
        int i = this.onRelationshipValidationResult + 1;
        SVGLength[] sVGLengthArr = this.ICustomTabsCallback$Default;
        if (i < sVGLengthArr.length) {
            this.ag$a = 0.0d;
            this.onRelationshipValidationResult = i;
            this.onPostMessage = C0396version.valueOf(sVGLengthArr[i], this.onMessageChannelReady, 0.0d, this.extraCallbackWithResult, this.ak);
        }
        double d2 = this.onPostMessage + d;
        this.onPostMessage = d2;
        return d2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double HaptikSDK$a() {
        toString(this.getInterfaceDescriptor, this.onTransact);
        int i = this.asInterface + 1;
        SVGLength[] sVGLengthArr = this.ICustomTabsCallback$Stub$Proxy;
        if (i < sVGLengthArr.length) {
            this.HaptikSDK$a = 0.0d;
            this.asInterface = i;
            this.ICustomTabsCallback$Stub = C0396version.valueOf(sVGLengthArr[i], this.isLogoutPending, 0.0d, this.extraCallbackWithResult, this.ak);
        }
        return this.ICustomTabsCallback$Stub;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double invoke() {
        toString(this.values, this.invoke);
        int i = this.valueOf + 1;
        SVGLength[] sVGLengthArr = this.ah$a;
        if (i < sVGLengthArr.length) {
            this.valueOf = i;
            this.ag$a += C0396version.valueOf(sVGLengthArr[i], this.onMessageChannelReady, 0.0d, this.extraCallbackWithResult, this.ak);
        }
        return this.ag$a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double HaptikSDK$c() {
        toString(this.HaptikSDK$e, this.getInitSettings);
        int i = this.ah$b + 1;
        SVGLength[] sVGLengthArr = this.getSignupData;
        if (i < sVGLengthArr.length) {
            this.ah$b = i;
            this.HaptikSDK$a += C0396version.valueOf(sVGLengthArr[i], this.isLogoutPending, 0.0d, this.extraCallbackWithResult, this.ak);
        }
        return this.HaptikSDK$a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double ah$b() {
        toString(this.aj$a, this.ak$b);
        int min = Math.min(this.a + 1, this.onXdkEvent.length - 1);
        this.a = min;
        return this.onXdkEvent[min];
    }

    public float ag$a() {
        return this.onMessageChannelReady;
    }

    public float ah$a() {
        return this.isLogoutPending;
    }
}
