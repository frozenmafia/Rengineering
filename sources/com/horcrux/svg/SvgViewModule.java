package com.horcrux.svg;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
/* loaded from: classes5.dex */
class SvgViewModule extends ReactContextBaseJavaModule {
    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSVGSvgViewManager";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SvgViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.horcrux.svg.SvgViewModule$4  reason: invalid class name */
    /* loaded from: classes7.dex */
    public class AnonymousClass4 implements Runnable {
        final /* synthetic */ int ag$a;
        final /* synthetic */ int ah$a;
        final /* synthetic */ ReadableMap toString;
        final /* synthetic */ Callback values;

        AnonymousClass4(int i, ReadableMap readableMap, Callback callback, int i2) {
            this.ag$a = i;
            this.toString = readableMap;
            this.values = callback;
            this.ah$a = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            SvgView svgViewByTag = SvgViewManager.getSvgViewByTag(this.ag$a);
            if (svgViewByTag == null) {
                SvgViewManager.runWhenViewIsAvailable(this.ag$a, new Runnable() { // from class: com.horcrux.svg.SvgViewModule.4.4
                    @Override // java.lang.Runnable
                    public void run() {
                        SvgView svgViewByTag2 = SvgViewManager.getSvgViewByTag(AnonymousClass4.this.ag$a);
                        if (svgViewByTag2 == null) {
                            return;
                        }
                        svgViewByTag2.setToDataUrlTask(new Runnable() { // from class: com.horcrux.svg.SvgViewModule.4.4.5
                            @Override // java.lang.Runnable
                            public void run() {
                                SvgViewModule.toDataURL(AnonymousClass4.this.ag$a, AnonymousClass4.this.toString, AnonymousClass4.this.values, AnonymousClass4.this.ah$a + 1);
                            }
                        });
                    }
                });
            } else if (svgViewByTag.notRendered()) {
                svgViewByTag.setToDataUrlTask(new Runnable() { // from class: com.horcrux.svg.SvgViewModule.4.5
                    @Override // java.lang.Runnable
                    public void run() {
                        SvgViewModule.toDataURL(AnonymousClass4.this.ag$a, AnonymousClass4.this.toString, AnonymousClass4.this.values, AnonymousClass4.this.ah$a + 1);
                    }
                });
            } else {
                ReadableMap readableMap = this.toString;
                if (readableMap != null) {
                    this.values.invoke(svgViewByTag.toDataURL(readableMap.getInt("width"), this.toString.getInt("height")));
                } else {
                    this.values.invoke(svgViewByTag.toDataURL());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void toDataURL(int i, ReadableMap readableMap, Callback callback, int i2) {
        UiThreadUtil.runOnUiThread(new AnonymousClass4(i, readableMap, callback, i2));
    }

    @ReactMethod
    public void toDataURL(int i, ReadableMap readableMap, Callback callback) {
        toDataURL(i, readableMap, callback, 0);
    }
}
