package com.reactnativecommunity.clipboard;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Base64;
import com.facebook.react.bridge.ContextBaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import o.FragmentStateManager;
import org.apache.http.protocol.HTTP;
@FragmentStateManager.AnonymousClass1(values = ClipboardModule.NAME)
/* loaded from: classes5.dex */
public class ClipboardModule extends ContextBaseJavaModule {
    public static final String CLIPBOARD_TEXT_CHANGED = "RNCClipboard_TEXT_CHANGED";
    public static final String NAME = "RNCClipboard";
    private ClipboardManager.OnPrimaryClipChangedListener listener;
    private ReactApplicationContext reactContext;

    @ReactMethod
    public void addListener(String str) {
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    public ClipboardModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.listener = null;
        this.reactContext = reactApplicationContext;
    }

    private ClipboardManager getClipboardService() {
        Context context = getContext();
        getContext();
        return (ClipboardManager) context.getSystemService("clipboard");
    }

    @ReactMethod
    public void getString(Promise promise) {
        try {
            ClipboardManager clipboardService = getClipboardService();
            ClipData primaryClip = clipboardService.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() >= 1) {
                ClipData.Item itemAt = clipboardService.getPrimaryClip().getItemAt(0);
                promise.resolve("" + ((Object) itemAt.getText()));
            } else {
                promise.resolve("");
            }
        } catch (Exception e) {
            promise.reject(e);
        }
    }

    @ReactMethod
    public void setString(String str) {
        try {
            getClipboardService().setPrimaryClip(ClipData.newPlainText(null, str));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @ReactMethod
    public void hasString(Promise promise) {
        try {
            ClipData primaryClip = getClipboardService().getPrimaryClip();
            boolean z = true;
            if (primaryClip == null || primaryClip.getItemCount() < 1) {
                z = false;
            }
            promise.resolve(Boolean.valueOf(z));
        } catch (Exception e) {
            promise.reject(e);
        }
    }

    @ReactMethod
    public void getImage(Promise promise) {
        Uri uri;
        ContentResolver contentResolver;
        String type;
        ClipboardManager clipboardService = getClipboardService();
        if (!clipboardService.hasPrimaryClip()) {
            promise.resolve("");
        } else if (clipboardService.getPrimaryClipDescription().hasMimeType(HTTP.PLAIN_TEXT_TYPE)) {
            promise.resolve("");
        } else {
            ClipData primaryClip = clipboardService.getPrimaryClip();
            if (primaryClip != null && (uri = primaryClip.getItemAt(0).getUri()) != null && (type = (contentResolver = this.reactContext.getContentResolver()).getType(uri)) != null && (type.equals(MimeTypes.IMAGE_JPEG) || type.equals("image/png") || type.equals("image/jpg"))) {
                uri.getPath();
                try {
                    Bitmap bitmap = MediaStore.Images.Media.getBitmap(contentResolver, uri);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    if (type.equals(MimeTypes.IMAGE_JPEG) || type.equals("image/jpg")) {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                    }
                    if (type.equals("image/png")) {
                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                    }
                    String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                    StringBuilder sb = new StringBuilder("data:" + type + ";base64,");
                    sb.append(encodeToString);
                    promise.resolve(sb.toString());
                } catch (IOException e) {
                    promise.reject(e);
                    e.printStackTrace();
                }
            }
            promise.resolve("");
        }
    }

    @ReactMethod
    public void setListener() {
        try {
            ClipboardManager clipboardService = getClipboardService();
            ClipboardManager.OnPrimaryClipChangedListener onPrimaryClipChangedListener = new ClipboardManager.OnPrimaryClipChangedListener() { // from class: com.reactnativecommunity.clipboard.ClipboardModule.3
                @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
                public void onPrimaryClipChanged() {
                    ((DeviceEventManagerModule.RCTDeviceEventEmitter) ClipboardModule.this.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(ClipboardModule.CLIPBOARD_TEXT_CHANGED, null);
                }
            };
            this.listener = onPrimaryClipChangedListener;
            clipboardService.addPrimaryClipChangedListener(onPrimaryClipChangedListener);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @ReactMethod
    public void removeListener() {
        if (this.listener != null) {
            try {
                getClipboardService().removePrimaryClipChangedListener(this.listener);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
