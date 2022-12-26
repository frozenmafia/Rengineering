package com.theartofdev.edmodo.cropper;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.theartofdev.edmodo.cropper.CropImageView;
/* loaded from: classes7.dex */
public class CropImageOptions implements Parcelable {
    public static final Parcelable.Creator<CropImageOptions> CREATOR = new Parcelable.Creator<CropImageOptions>() { // from class: com.theartofdev.edmodo.cropper.CropImageOptions.2
        @Override // android.os.Parcelable.Creator
        /* renamed from: toString */
        public CropImageOptions createFromParcel(Parcel parcel) {
            return new CropImageOptions(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ah$a */
        public CropImageOptions[] newArray(int i) {
            return new CropImageOptions[i];
        }
    };
    public int HaptikSDK$a;
    public int HaptikSDK$b;
    public int HaptikSDK$c;
    public int HaptikSDK$d;
    public float HaptikSDK$e;
    public float HaptikWebView;
    public CropImageView.Guidelines ICustomTabsCallback;
    public int ICustomTabsCallback$Default;
    public int ICustomTabsCallback$Stub;
    public Bitmap.CompressFormat ICustomTabsCallback$Stub$Proxy;
    public CropImageView.RequestSizeOptions ICustomTabsService;
    public boolean a;
    public CharSequence ag$a;
    public boolean ah$a;
    public int ah$b;
    public boolean aj$a;
    public CharSequence ak;
    public float ak$a;
    public int ak$b;
    public int asBinder;
    public int asInterface;
    public float extraCallback;
    public boolean extraCallbackWithResult;
    public int extraCommand;
    public boolean getDefaultImpl;
    public float getInitSettings;
    public int getInterfaceDescriptor;
    public float getSignupData;
    public boolean invoke;
    public CropImageView.CropShape isLogoutPending;
    public int mayLaunchUrl;
    public int newSession;
    public CropImageView.ScaleType newSessionWithExtras;
    public int onMessageChannelReady;
    public int onNavigationEvent;
    public Rect onPostMessage;
    public int onRelationshipValidationResult;
    public boolean onTransact;
    public int onXdkEvent;
    public boolean postMessage;
    public Uri receiveFile;
    public boolean requestPostMessageChannel;
    public int setDefaultImpl;
    public boolean toString;
    public float updateVisuals;
    public int valueOf;
    public boolean values;
    public float warmup;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CropImageOptions() {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        this.isLogoutPending = CropImageView.CropShape.RECTANGLE;
        this.updateVisuals = TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.warmup = TypedValue.applyDimension(1, 24.0f, displayMetrics);
        this.ICustomTabsCallback = CropImageView.Guidelines.ON_TOUCH;
        this.newSessionWithExtras = CropImageView.ScaleType.FIT_CENTER;
        this.postMessage = true;
        this.requestPostMessageChannel = true;
        this.invoke = true;
        this.getDefaultImpl = false;
        this.ICustomTabsCallback$Default = 4;
        this.extraCallback = 0.1f;
        this.aj$a = false;
        this.ah$b = 1;
        this.HaptikSDK$b = 1;
        this.getSignupData = TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.HaptikSDK$d = Color.argb(170, 255, 255, 255);
        this.HaptikSDK$e = TypedValue.applyDimension(1, 2.0f, displayMetrics);
        this.HaptikWebView = TypedValue.applyDimension(1, 5.0f, displayMetrics);
        this.getInitSettings = TypedValue.applyDimension(1, 14.0f, displayMetrics);
        this.HaptikSDK$c = -1;
        this.ak$a = TypedValue.applyDimension(1, 1.0f, displayMetrics);
        this.ak$b = Color.argb(170, 255, 255, 255);
        this.HaptikSDK$a = Color.argb(119, 0, 0, 0);
        this.asInterface = (int) TypedValue.applyDimension(1, 42.0f, displayMetrics);
        this.ICustomTabsCallback$Stub = (int) TypedValue.applyDimension(1, 42.0f, displayMetrics);
        this.setDefaultImpl = 40;
        this.asBinder = 40;
        this.onNavigationEvent = 99999;
        this.onRelationshipValidationResult = 99999;
        this.ag$a = "";
        this.valueOf = 0;
        this.receiveFile = Uri.EMPTY;
        this.ICustomTabsCallback$Stub$Proxy = Bitmap.CompressFormat.JPEG;
        this.getInterfaceDescriptor = 90;
        this.newSession = 0;
        this.extraCommand = 0;
        this.ICustomTabsService = CropImageView.RequestSizeOptions.NONE;
        this.onTransact = false;
        this.onPostMessage = null;
        this.onMessageChannelReady = -1;
        this.ah$a = true;
        this.toString = true;
        this.values = false;
        this.mayLaunchUrl = 90;
        this.a = false;
        this.extraCallbackWithResult = false;
        this.ak = null;
        this.onXdkEvent = 0;
    }

    protected CropImageOptions(Parcel parcel) {
        this.isLogoutPending = CropImageView.CropShape.values()[parcel.readInt()];
        this.updateVisuals = parcel.readFloat();
        this.warmup = parcel.readFloat();
        this.ICustomTabsCallback = CropImageView.Guidelines.values()[parcel.readInt()];
        this.newSessionWithExtras = CropImageView.ScaleType.values()[parcel.readInt()];
        this.postMessage = parcel.readByte() != 0;
        this.requestPostMessageChannel = parcel.readByte() != 0;
        this.invoke = parcel.readByte() != 0;
        this.getDefaultImpl = parcel.readByte() != 0;
        this.ICustomTabsCallback$Default = parcel.readInt();
        this.extraCallback = parcel.readFloat();
        this.aj$a = parcel.readByte() != 0;
        this.ah$b = parcel.readInt();
        this.HaptikSDK$b = parcel.readInt();
        this.getSignupData = parcel.readFloat();
        this.HaptikSDK$d = parcel.readInt();
        this.HaptikSDK$e = parcel.readFloat();
        this.HaptikWebView = parcel.readFloat();
        this.getInitSettings = parcel.readFloat();
        this.HaptikSDK$c = parcel.readInt();
        this.ak$a = parcel.readFloat();
        this.ak$b = parcel.readInt();
        this.HaptikSDK$a = parcel.readInt();
        this.asInterface = parcel.readInt();
        this.ICustomTabsCallback$Stub = parcel.readInt();
        this.setDefaultImpl = parcel.readInt();
        this.asBinder = parcel.readInt();
        this.onNavigationEvent = parcel.readInt();
        this.onRelationshipValidationResult = parcel.readInt();
        this.ag$a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.valueOf = parcel.readInt();
        this.receiveFile = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.ICustomTabsCallback$Stub$Proxy = Bitmap.CompressFormat.valueOf(parcel.readString());
        this.getInterfaceDescriptor = parcel.readInt();
        this.newSession = parcel.readInt();
        this.extraCommand = parcel.readInt();
        this.ICustomTabsService = CropImageView.RequestSizeOptions.values()[parcel.readInt()];
        this.onTransact = parcel.readByte() != 0;
        this.onPostMessage = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
        this.onMessageChannelReady = parcel.readInt();
        this.ah$a = parcel.readByte() != 0;
        this.toString = parcel.readByte() != 0;
        this.values = parcel.readByte() != 0;
        this.mayLaunchUrl = parcel.readInt();
        this.a = parcel.readByte() != 0;
        this.extraCallbackWithResult = parcel.readByte() != 0;
        this.ak = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.onXdkEvent = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isLogoutPending.ordinal());
        parcel.writeFloat(this.updateVisuals);
        parcel.writeFloat(this.warmup);
        parcel.writeInt(this.ICustomTabsCallback.ordinal());
        parcel.writeInt(this.newSessionWithExtras.ordinal());
        parcel.writeByte(this.postMessage ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.requestPostMessageChannel ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.invoke ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.getDefaultImpl ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.ICustomTabsCallback$Default);
        parcel.writeFloat(this.extraCallback);
        parcel.writeByte(this.aj$a ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.ah$b);
        parcel.writeInt(this.HaptikSDK$b);
        parcel.writeFloat(this.getSignupData);
        parcel.writeInt(this.HaptikSDK$d);
        parcel.writeFloat(this.HaptikSDK$e);
        parcel.writeFloat(this.HaptikWebView);
        parcel.writeFloat(this.getInitSettings);
        parcel.writeInt(this.HaptikSDK$c);
        parcel.writeFloat(this.ak$a);
        parcel.writeInt(this.ak$b);
        parcel.writeInt(this.HaptikSDK$a);
        parcel.writeInt(this.asInterface);
        parcel.writeInt(this.ICustomTabsCallback$Stub);
        parcel.writeInt(this.setDefaultImpl);
        parcel.writeInt(this.asBinder);
        parcel.writeInt(this.onNavigationEvent);
        parcel.writeInt(this.onRelationshipValidationResult);
        TextUtils.writeToParcel(this.ag$a, parcel, i);
        parcel.writeInt(this.valueOf);
        parcel.writeParcelable(this.receiveFile, i);
        parcel.writeString(this.ICustomTabsCallback$Stub$Proxy.name());
        parcel.writeInt(this.getInterfaceDescriptor);
        parcel.writeInt(this.newSession);
        parcel.writeInt(this.extraCommand);
        parcel.writeInt(this.ICustomTabsService.ordinal());
        parcel.writeInt(this.onTransact ? 1 : 0);
        parcel.writeParcelable(this.onPostMessage, i);
        parcel.writeInt(this.onMessageChannelReady);
        parcel.writeByte(this.ah$a ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.toString ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.values ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.mayLaunchUrl);
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.extraCallbackWithResult ? (byte) 1 : (byte) 0);
        TextUtils.writeToParcel(this.ak, parcel, i);
        parcel.writeInt(this.onXdkEvent);
    }

    public void values() {
        if (this.ICustomTabsCallback$Default < 0) {
            throw new IllegalArgumentException("Cannot set max zoom to a number < 1");
        }
        if (this.warmup < 0.0f) {
            throw new IllegalArgumentException("Cannot set touch radius value to a number <= 0 ");
        }
        float f = this.extraCallback;
        if (f < 0.0f || f >= 0.5d) {
            throw new IllegalArgumentException("Cannot set initial crop window padding value to a number < 0 or >= 0.5");
        }
        if (this.ah$b <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.HaptikSDK$b <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.getSignupData < 0.0f) {
            throw new IllegalArgumentException("Cannot set line thickness value to a number less than 0.");
        }
        if (this.HaptikSDK$e < 0.0f) {
            throw new IllegalArgumentException("Cannot set corner thickness value to a number less than 0.");
        }
        if (this.ak$a < 0.0f) {
            throw new IllegalArgumentException("Cannot set guidelines thickness value to a number less than 0.");
        }
        if (this.ICustomTabsCallback$Stub < 0) {
            throw new IllegalArgumentException("Cannot set min crop window height value to a number < 0 ");
        }
        int i = this.setDefaultImpl;
        if (i < 0) {
            throw new IllegalArgumentException("Cannot set min crop result width value to a number < 0 ");
        }
        int i2 = this.asBinder;
        if (i2 < 0) {
            throw new IllegalArgumentException("Cannot set min crop result height value to a number < 0 ");
        }
        if (this.onNavigationEvent < i) {
            throw new IllegalArgumentException("Cannot set max crop result width to smaller value than min crop result width");
        }
        if (this.onRelationshipValidationResult < i2) {
            throw new IllegalArgumentException("Cannot set max crop result height to smaller value than min crop result height");
        }
        if (this.newSession < 0) {
            throw new IllegalArgumentException("Cannot set request width value to a number < 0 ");
        }
        if (this.extraCommand < 0) {
            throw new IllegalArgumentException("Cannot set request height value to a number < 0 ");
        }
        int i3 = this.mayLaunchUrl;
        if (i3 < 0 || i3 > 360) {
            throw new IllegalArgumentException("Cannot set rotation degrees value to a number < 0 or > 360");
        }
    }
}
