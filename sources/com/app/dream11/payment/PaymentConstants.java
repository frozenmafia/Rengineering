package com.app.dream11.payment;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import o.getWantsAllOnMoveCalls;
import o.isClosed;
import o.moveToFirst;
import o.moveToLast;
import org.apache.http.message.TokenParser;
/* loaded from: classes3.dex */
public class PaymentConstants {
    public static String AudioAttributesCompatParcelizer = null;
    public static String AudioAttributesImplApi21Parcelizer = null;
    public static String AudioAttributesImplApi26Parcelizer = null;
    public static String AudioAttributesImplBaseParcelizer = null;
    public static final String HaptikSDK$a;
    public static final String HaptikSDK$b;
    public static final String HaptikSDK$c;
    public static final String HaptikSDK$d;
    public static final String HaptikSDK$e;
    public static String HaptikWebView = null;
    public static final String ICustomTabsCallback;
    public static final String ICustomTabsCallback$Default;
    public static final String ICustomTabsCallback$Stub;
    public static final String ICustomTabsCallback$Stub$Proxy;
    public static final String ICustomTabsService;
    public static final String ICustomTabsService$Default;
    public static final String ICustomTabsService$Stub;
    public static final String ICustomTabsService$Stub$Proxy;
    public static final String INotificationSideChannel;
    public static String INotificationSideChannel$Default = null;
    public static final String INotificationSideChannel$Stub;
    public static final String INotificationSideChannel$Stub$Proxy;
    public static final String IPostMessageService;
    public static final String IPostMessageService$Default;
    public static final String IPostMessageService$Stub;
    public static final String IPostMessageService$Stub$Proxy;
    public static final String ITrustedWebActivityCallback;
    public static final String ITrustedWebActivityCallback$Default;
    public static final String ITrustedWebActivityCallback$Stub;
    public static final String ITrustedWebActivityCallback$Stub$Proxy;
    public static final String ITrustedWebActivityService;
    public static final String ITrustedWebActivityService$Default;
    public static final String ITrustedWebActivityService$Stub;
    public static final String ITrustedWebActivityService$Stub$Proxy;
    public static String IconCompatParcelizer = null;
    public static String MediaBrowserCompat = null;
    public static String RemoteActionCompatParcelizer = null;
    public static final String a;
    public static final String ag$a;
    public static final String ah$a;
    public static final String ah$b;
    public static final String aj$a;
    public static final String ak;
    public static final String ak$a;
    public static final String ak$b;
    public static final String areNotificationsEnabled;
    public static final String asBinder;
    public static final String asInterface;
    public static final String cancel;
    public static final String cancelAll;
    public static final String cancelNotification;
    public static String connect = null;
    public static String disconnect = null;
    public static final String extraCallback;
    public static final String extraCallbackWithResult;
    public static final String extraCommand;
    public static final String getActiveNotifications;
    public static final String getDefaultImpl;
    private static int getExtras = 0;
    public static final String getInitSettings;
    public static final String getInterfaceDescriptor;
    private static byte[] getItem = null;
    private static int getNotifyChildrenChangedOptions = 0;
    private static int getRoot = 0;
    private static short[] getServiceComponent = null;
    public static final String getSignupData;
    public static final String getSmallIconBitmap;
    public static final String getSmallIconId;
    public static final String invoke;
    private static int isConnected = 0;
    public static final String isLogoutPending;
    public static final String mayLaunchUrl;
    public static final String newSession;
    public static final String newSessionWithExtras;
    public static String[] notify = null;
    public static final String notifyNotificationWithChannel;
    public static final String onExtraCallback;
    public static final String onMessageChannelReady;
    public static final String onNavigationEvent;
    public static final String onPostMessage;
    public static final String onRelationshipValidationResult;
    public static final String onTransact;
    public static final String onXdkEvent;
    public static final String postMessage;
    public static final String read;
    public static final String receiveFile;
    public static final String requestPostMessageChannel;
    public static final String requestPostMessageChannelWithExtras;
    private static int search = 1;
    public static final String setDefaultImpl;
    private static long subscribe;
    public static final String toString;
    public static final String updateVisuals;
    public static final String validateRelationship;
    public static final String valueOf;
    public static final String values;
    public static final String warmup;
    public static String write;

    static void values() {
        getExtras = 40;
        getRoot = -382589600;
        getNotifyChildrenChangedOptions = 1775819078;
        getItem = new byte[]{-38, -22, -33, -47, -42, 61, -42, -42, -59, -27, -126, 125, 111, -111, 125, 104, -105, 115, -123, 124, 119, -106, -36, -1, 27, -30, -37, -41, -43, -28, 3, -12, 12, -12, 10, 30, -41, 10, -20, 4, -6, -35, 31, -20, -22, -19, -28, -70, 76, 79, -73, -74, 94, 76, -77, -95, 95, -77, -30, 98, 109, -106, 106, -105, 70, -127, 99, -107, -25, 31, -32, 31, 27, 53, -61, -32, 28, -30, 28, 17, -19, 17, -22, -32, -119, -126, 102, -114, 114, -119, 100, -33, -69, 69, -71, -79, 73, -74, -24, -5, -13, 1, -7, 13, -6, 5, -31, 15, 2, 13, -4, -16, 28, -11, -31, 111, -67, 121, -106, 96, -103, -110, 115, -35, 29, -49, 25, 31, -34, -96, 84, 75, -122, 89, -33, -43, 7, -45, -47, 50, -35, -30, 24, -28, 31, 28, -20, -2, 47, -18, -10, -26, -114, 119, -124, 98, -117, -113, -126, 100, 98, -104, 112, -118, -121, -14, -69, -71, 65, 70, -72, -73, -73, 79, 79, -72, 64, -71, -87, 94, -70, -79, 85, -67, 65, -70, -73, -73, 67, 83, -80, -30, 51, -60, 60, -60, 58, 46, -6, 57, 18, -21, 10, -11, 10, 14, 32, -42, -11, 9, -9, 9, -10, 41, -23, -4, 2, 10, -16, -11, -34, 126, 119, -69, -104, 109, -24, -33, -38, -35, 37, -35, 45, -53, 47, -39, 32, 43, -54, 56, -52, 42, -28, 77, -79, -79, 70, -91, 70, -71, 64, -85, 104, -66, -29, 23, -28, -17, 24, 19, -21, 19, -29, 2, -28, -36, 26, 17, 20, -33, 91, -81, 118, -113, 87, 65, -22, -41, -36, 56, -48, 44, -41, -38, -38, 51, -40, 58, -41, -45, -44, -43, -46, 56, -25, 90, -86, 93, 80, -92, 88, 89, -74, 86, -85, 89, -94, 86, 92, -25, -112, -65, -100, 124, -111, 109, -120, 118, -97, 109, 98, -110, -99, 96, -32, -43, 60, -50, -63, 49, 62, -61, -38, 92, -33, -76, 75, -88, 71, -67, -67, -29, 38, 40, -46, 58, 48, -51, -60, 50, 57, -52, -24, -58, 63, -57, 21, -30, -51, 42, 38, -25, -57, -62, 48, -52, 59, 50, -34, 32, -33, 32, 36, 42, -31, 16, 25, -22, -9, -3, 17, -4, 36, -27, -26, 21, 25, -30, -8, 15, 17, -10, -6, 59, -28, -25, -29, -38, -47, -12, 12, 39, -64, -52, 13, -46, -47};
        subscribe = 9068455335186040023L;
    }

    static {
        values();
        read = valueOf((byte) (17 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 42, 382589705 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (short) Drawable.resolveOpacity(0, 0), (-1775819078) - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern();
        INotificationSideChannel$Stub$Proxy = valueOf((byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 43), (-41) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), Process.getGidForName("") + 382589720, (short) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (-1775819075) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern();
        INotificationSideChannel$Stub = ag$a(new char[]{39449, 62656, 14050, 39534, 47660, 28790, 16184, 13514, 35117, 27839, 11137, 7099, 48324, 24331, 1765, 3941, 41068}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1).intern();
        cancel = valueOf((byte) (MotionEvent.axisFromString("") + 125), (-41) - (Process.myPid() >> 22), Color.argb(0, 0, 0, 0) + 382589719, (short) View.MeasureSpec.getMode(0), (-1775819069) - TextUtils.indexOf("", "", 0)).intern();
        ITrustedWebActivityService$Stub$Proxy = ag$a(new char[]{20126, 20049, 56683, 20201, 21536, 51943, 54441, 56009, 23975, 54806, 49214, 62883, 26695, 58802, 60780, 57715, 29929, 61663}, Color.blue(0) + 1).intern();
        INotificationSideChannel = ag$a(new char[]{65167, 14264, 9064, 65272, 26366, 45838, 10922, 59415, 60854, 45055, 15904, 51070, 55387, 40022, 4960, 54176, 50430}, 1 - View.resolveSize(0, 0)).intern();
        ITrustedWebActivityService$Stub = ag$a(new char[]{20114, 5363, 7007, 20197, 47888, 36933, 4765, 13817, 23979, 36020}, '1' - AndroidCharacter.getMirror('0')).intern();
        cancelAll = valueOf((byte) (17 - Color.alpha(0)), Color.rgb(0, 0, 0) + 16777175, 382589718 - ((Process.getThreadPriority(0) + 20) >> 6), (short) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), KeyEvent.keyCodeFromString("") - 1775819056).intern();
        ITrustedWebActivityService$Default = ag$a(new char[]{30609, 50991, 19978, 30692, 42620, 17291, 18373, 10395, 25761, 24441, 21315, 2044, 20826, 27848, 32302, 4910, 19947, 31153, 3515}, 1 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern();
        notifyNotificationWithChannel = ag$a(new char[]{7784, 7682, 2381, 7709, 17979, 39589, 138, 51437, 3408, 34394, 5143, 59304, 14517, 46590, 14670, 62312, 9224}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 1).intern();
        getActiveNotifications = ag$a(new char[]{45147, 29812, 35814, 45102, 49042, 61651, 33313, 12611, 41855, 60457}, 1 - TextUtils.getOffsetBefore("", 0)).intern();
        getSmallIconBitmap = ag$a(new char[]{41900, 29943, 9187, 41977, 4346, 61552, 10756, 40480, 45236, 60566, 16044, 45402, 34137, 57128, 5060, 42398}, -Process.getGidForName("")).intern();
        getSmallIconId = valueOf((byte) (Color.green(0) + 46), TextUtils.indexOf((CharSequence) "", '0') - 40, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 382589685, (short) (ViewConfiguration.getWindowTouchSlop() >> 8), (-1775819051) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern();
        ITrustedWebActivityService = ag$a(new char[]{17984, 31907, 50505, 17972, 36938, 63500, 52361, 7824, 21877, 58612}, View.MeasureSpec.makeMeasureSpec(0, 0) + 1).intern();
        cancelNotification = ag$a(new char[]{24464, 64363, 3981, 24516, 27366, 32750, 1634, 58413, 19615, 25369, 4804, 52051, 31073, 20651, 16293, 57220, 26056, 17865, 19458, 41526, 4788, 10611, 22721, 45398, 16157, 7819, 26047, 34290, 11260}, KeyEvent.keyCodeFromString("") + 1).intern();
        ITrustedWebActivityCallback$Stub = valueOf((byte) (TextUtils.getTrimmedLength("") + 1), (-41) - KeyEvent.keyCodeFromString(""), 382589716 - KeyEvent.normalizeMetaState(0), (short) View.resolveSizeAndState(0, 0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 1775819048).intern();
        areNotificationsEnabled = valueOf((byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 22), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 42, TextUtils.lastIndexOf("", '0') + 382589717, (short) ExpandableListView.getPackedPositionType(0L), Color.green(0) - 1775819037).intern();
        ITrustedWebActivityCallback$Stub$Proxy = ag$a(new char[]{52965, 48679, 42677, 52881, 36850, 15001, 44911, 283, 56796}, -ExpandableListView.getPackedPositionChild(0L)).intern();
        ITrustedWebActivityCallback = ag$a(new char[]{22933, 33187, 10877, 23014, 57005, 1281, 9137, 20604, 19104, 6628, 14107, 32553}, -TextUtils.lastIndexOf("", '0')).intern();
        onExtraCallback = valueOf((byte) (View.getDefaultSize(0, 0) - 78), MotionEvent.axisFromString("") - 40, TextUtils.getCapsMode("", 0, 0) + 382589715, (short) (ViewConfiguration.getScrollBarFadeDuration() >> 16), KeyEvent.getDeadChar(0, 0) - 1775819032).intern();
        IPostMessageService$Stub = ag$a(new char[]{9726, 26459, 32236, 9613, 16654, 58339, 29751, 53241, 14017, 65293}, 1 - View.resolveSizeAndState(0, 0, 0)).intern();
        IPostMessageService$Stub$Proxy = valueOf((byte) (100 - Color.alpha(0)), (-41) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.indexOf("", "", 0) + 382589715, (short) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), ImageFormat.getBitsPerPixel(0) - 1775819019).intern();
        ITrustedWebActivityCallback$Default = ag$a(new char[]{59545, 28727, 62874, 59627, 34413, 62613, 64580, 2185, 64444, 59495, 59635}, Color.green(0) + 1).intern();
        ICustomTabsService$Stub = ag$a(new char[]{30373, 26259, 43321, 30423, 38072, 57905, 41191, 6748, 25984}, TextUtils.getOffsetAfter("", 0) + 1).intern();
        ICustomTabsService$Stub$Proxy = ag$a(new char[]{30344, 10408, 65495, 30458, 61207, 44048, 62988, 25062, 26033}, TextUtils.getOffsetBefore("", 0) + 1).intern();
        IPostMessageService$Default = valueOf((byte) (24 - ((byte) KeyEvent.getModifierMetaStateMask())), (-41) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 382589714, (short) TextUtils.indexOf("", "", 0, 0), (-1775819010) - View.MeasureSpec.makeMeasureSpec(0, 0)).intern();
        IPostMessageService = valueOf((byte) ((ViewConfiguration.getEdgeSlop() >> 16) + 119), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 42, 382589682 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (short) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (-1775818995) - ExpandableListView.getPackedPositionGroup(0L)).intern();
        ICustomTabsService$Default = ag$a(new char[]{64329, 63080, 1110, 64283, 15353, 29434, 3515, 46388, 59476, 28169, 6427, 39517, 56750, 23972, 13425, 36490, 49438, 18630, 18392, 62252, 46716, 9323}, (ViewConfiguration.getTapTimeout() >> 16) + 1).intern();
        requestPostMessageChannelWithExtras = ag$a(new char[]{16833, 40195, 46607, 16817, 19040, 6566, 49102, 50312, 21234, 1348, 43884, 60398, 26391, 14029, 34308, 65330, 31648, 9094, 62905}, -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern();
        warmup = ag$a(new char[]{58169, 44613, 25535, 58217, 12902, 10970, 27230, 48301, 61472, 13862, 32496, 37848, 50629, 1432, 21404, 34586, 55648, 4350, 8252, 64166}, 1 - (Process.myTid() >> 22)).intern();
        requestPostMessageChannel = valueOf((byte) (78 - (KeyEvent.getMaxKeyCode() >> 16)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 41, Color.argb(0, 0, 0, 0) + 382589712, (short) View.resolveSizeAndState(0, 0, 0), (-1775818987) - (KeyEvent.getMaxKeyCode() >> 16)).intern();
        updateVisuals = ag$a(new char[]{8594, 64538, 43613, 8642, 37414, 30892, 41866, 7383, 12963}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1).intern();
        validateRelationship = ag$a(new char[]{18780, 34480, 30633, 18732, 17969, 518, 32382, 51417, 23141, 7917, 27351, 59293, 28545, 11595, 18343, 62307, 29484}, View.resolveSize(0, 0) + 1).intern();
        mayLaunchUrl = valueOf((byte) (4 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (-41) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), View.MeasureSpec.getSize(0) + 382589680, (short) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 1775818980).intern();
        newSessionWithExtras = valueOf((byte) ((-103) - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), View.resolveSize(0, 0) - 41, (ViewConfiguration.getTapTimeout() >> 16) + 382589719, (short) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (-1775818964) - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern();
        postMessage = ag$a(new char[]{45147, 29812, 35814, 45102, 49042, 61651, 33313, 12611, 41855, 60457}, ((Process.getThreadPriority(0) + 20) >> 6) + 1).intern();
        receiveFile = valueOf((byte) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 21), (ViewConfiguration.getMinimumFlingVelocity() >> 16) - 41, 382589709 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (short) View.MeasureSpec.makeMeasureSpec(0, 0), (-1775818955) - ((Process.getThreadPriority(0) + 20) >> 6)).intern();
        newSession = valueOf((byte) (88 - Gravity.getAbsoluteGravity(0, 0)), TextUtils.lastIndexOf("", '0') - 40, 382589711 - TextUtils.indexOf("", "", 0, 0), (short) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), (ViewConfiguration.getTapTimeout() >> 16) - 1775818950).intern();
        extraCommand = valueOf((byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 35), AndroidCharacter.getMirror('0') - 'Y', TextUtils.getOffsetAfter("", 0) + 382589699, (short) View.combineMeasuredStates(0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1775818945).intern();
        ICustomTabsService = valueOf((byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 32), (-41) - (Process.myTid() >> 22), 382589678 - ((Process.getThreadPriority(0) + 20) >> 6), (short) Color.green(0), (-1775818937) - TextUtils.indexOf("", "", 0)).intern();
        onTransact = valueOf((byte) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 113), TextUtils.indexOf("", "", 0, 0) - 41, MotionEvent.axisFromString("") + 382589716, (short) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (-1775818927) - ExpandableListView.getPackedPositionGroup(0L)).intern();
        getInterfaceDescriptor = valueOf((byte) (68 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (-40) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), View.combineMeasuredStates(0, 0) + 382589677, (short) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (-1775818913) - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern();
        ICustomTabsCallback$Stub$Proxy = ag$a(new char[]{45825, 58180, 2110, 45932, 27881, 26610, 483, 57880, 41016, 31493, 5463, 52585, 38347, 18607}, -Process.getGidForName("")).intern();
        asBinder = valueOf((byte) (49 - (KeyEvent.getMaxKeyCode() >> 16)), (ViewConfiguration.getPressedStateDuration() >> 16) - 41, (ViewConfiguration.getTapTimeout() >> 16) + 382589676, (short) View.resolveSizeAndState(0, 0, 0), (-1775818886) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern();
        getDefaultImpl = valueOf((byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 13), (-41) - ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getFadingEdgeLength() >> 16) + 382589708, (short) (ViewConfiguration.getTapTimeout() >> 16), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 1775818877).intern();
        asInterface = valueOf((byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 102), (ViewConfiguration.getTouchSlop() >> 8) - 41, 382589705 - MotionEvent.axisFromString(""), (short) (Process.myPid() >> 22), (-1775818858) - TextUtils.getCapsMode("", 0, 0)).intern();
        ICustomTabsCallback$Stub = valueOf((byte) (33 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), Drawable.resolveOpacity(0, 0) - 41, 382589705 - View.MeasureSpec.getSize(0), (short) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (-1775818852) - (KeyEvent.getMaxKeyCode() >> 16)).intern();
        setDefaultImpl = valueOf((byte) (ExpandableListView.getPackedPositionGroup(0L) - 76), (ViewConfiguration.getDoubleTapTimeout() >> 16) - 41, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 382589705, (short) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (-1775818836) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern();
        ICustomTabsCallback$Default = valueOf((byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 19), (-41) - ExpandableListView.getPackedPositionGroup(0L), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 382589705, (short) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (-1775818824) - View.resolveSize(0, 0)).intern();
        onNavigationEvent = ag$a(new char[]{40491, 30525, 62743, 40556, 38020, 62373, 64758, 6726, 36155, 61259, 59469, 13604, 47306, 56557, 50485, 8683, 42106, 51607, 46744, 23629, 54042, 42275}, (KeyEvent.getMaxKeyCode() >> 16) + 1).intern();
        onPostMessage = valueOf((byte) (KeyEvent.normalizeMetaState(0) + 18), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 42, 382589702 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (short) (KeyEvent.getMaxKeyCode() >> 16), (-1775818814) - ((byte) KeyEvent.getModifierMetaStateMask())).intern();
        onMessageChannelReady = valueOf((byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 89), (ViewConfiguration.getScrollBarSize() >> 8) - 41, 382589670 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (short) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getKeyRepeatDelay() >> 16) - 1775818809).intern();
        onRelationshipValidationResult = valueOf((byte) (TextUtils.indexOf((CharSequence) "", '0') + 42), (Process.myTid() >> 22) - 41, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 382589668, (short) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (-1775818802) - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern();
        extraCallbackWithResult = ag$a(new char[]{22819, 59885, 38629, 22865, 57263, 27999, 40744, 20802, 18974, 29100, 35720, 32299, 32708, 16899, 42734, 27389, 25410, 22376, 54611}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern();
        ak$b = ag$a(new char[]{7506, 7233, 62711, 7478, 44835, 39140, 64828, 8647, 3683, 33794, 59804, 3771, 15285, 47009, 50423, 6776, 10019, 41688, 46945, 26587, 20549}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern();
        ICustomTabsCallback = ag$a(new char[]{59088, 46158, 32281, 59060, 60732, 12540, 30663, 25558, 62975, 11284, 25447, 19586, 49159, 8113, 19979, 22632, 56491, 2763, 15748, 9681, 43993, 26233, 10594}, Color.blue(0) + 1).intern();
        ak$a = valueOf((byte) (94 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (-41) - Color.green(0), (ViewConfiguration.getLongPressTimeout() >> 16) + 382589700, (short) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), Gravity.getAbsoluteGravity(0, 0) - 1775818784).intern();
        extraCallback = ag$a(new char[]{15463, 49615, 5227, 15363, 7444, 17770, 7584, 37872, 12118, 22924, 2304, 48268, 6784, 27171, 9317, 43084, 1552, 32591, 22490, 54776, 29050}, KeyEvent.getDeadChar(0, 0) + 1).intern();
        aj$a = ag$a(new char[]{14153, 56804, 38095, 14143, 57468, 22787}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1).intern();
        isLogoutPending = ag$a(new char[]{63386, 43119, 11775, 63454, 10742, 11498, 9236, 42802, 58507, 12300, 12468, 34894, 53629, 931, 7640, 40089, 52682}, Color.red(0) + 1).intern();
        ak = valueOf((byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 109), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 41, 382589700 - (ViewConfiguration.getTapTimeout() >> 16), (short) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (-1775818769) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern();
        onXdkEvent = valueOf((byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 52), KeyEvent.getDeadChar(0, 0) - 41, 382589668 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (short) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (-1775818753) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern();
        a = valueOf((byte) ((-32) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (-41) - (ViewConfiguration.getLongPressTimeout() >> 16), 382589717 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (short) TextUtils.getOffsetBefore("", 0), (-1775818746) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern();
        getSignupData = ag$a(new char[]{1396, 36121, 58453, 1282, 20854, 2559}, 1 - View.combineMeasuredStates(0, 0)).intern();
        getInitSettings = ag$a(new char[]{8765, 27747, 60807, 8793, 54661, 59601, 58457, 23407, 12562, 62521, 61689, 29755, 1257, 51077, 56722, 24780, 6208, 53990, 44578, 7491, 28477, 48709, 47870, 3605}, 1 - (KeyEvent.getMaxKeyCode() >> 16)).intern();
        HaptikSDK$d = valueOf((byte) ((-69) - TextUtils.indexOf((CharSequence) "", '0', 0)), (-42) - TextUtils.indexOf((CharSequence) "", '0', 0), 382589699 - ((byte) KeyEvent.getModifierMetaStateMask()), (short) Color.red(0), TextUtils.lastIndexOf("", '0', 0, 0) - 1775818743).intern();
        HaptikSDK$e = ag$a(new char[]{16612, 15034, 26925, 16519, 54639, 48652, 24816, 23426, 21498, 41702, 29769, 29947, 26159, 37217, 22830, 24618, 31364}, (ViewConfiguration.getPressedStateDuration() >> 16) + 1).intern();
        HaptikSDK$c = ag$a(new char[]{59297, 7644, 33901, 59360, 51907, 39247, 36231, 17433, 62654, 34222, 39220, 27498, 49478, 46592, 46174, 32701, 56822, 41842, 51196, 521, 43671, 53198, 54079}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1).intern();
        invoke = valueOf((byte) (50 - KeyEvent.normalizeMetaState(0)), (-40) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 382589698 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (short) (Process.myTid() >> 22), (-1775818738) - ImageFormat.getBitsPerPixel(0)).intern();
        ah$b = valueOf((byte) (56 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (ViewConfiguration.getJumpTapTimeout() >> 16) - 41, (ViewConfiguration.getTouchSlop() >> 8) + 382589698, (short) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (-1775818726) - TextUtils.getCapsMode("", 0, 0)).intern();
        HaptikSDK$a = ag$a(new char[]{32821, 13574, 58428, 32884, 19293, 45471, 60886, 50570, 37670, 44412, 63858, 60131, 42700, 40644, 54299, 65082, 47726, 35747, 42926, 33669, 52508, 59166, 45932, 37095, 57527, 53489, 36361, 42055, 62552, 52663, 39331, 18858, 2036, 14617}, 1 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))).intern();
        HaptikSDK$b = valueOf((byte) ((ViewConfiguration.getTouchSlop() >> 8) + 38), TextUtils.indexOf("", "") - 41, (ViewConfiguration.getLongPressTimeout() >> 16) + 382589697, (short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (-1792595926) - Color.rgb(0, 0, 0)).intern();
        ah$a = ag$a(new char[]{4187, 9520, 19837, 4122, 18685, 41386, 17554, 50722, 840, 48461, 20519, 59741, 14010, 36576, 32095, 64914, 10762, 39834, 3826, 32820, 23914, 63278}, 1 - View.MeasureSpec.getMode(0)).intern();
        valueOf = ag$a(new char[]{19987, 61451, 37453, 20050, 59564, 29841, 39842, 26227, 23808, 26742, 36631, 18700, 26866}, 1 - Color.red(0)).intern();
        toString = valueOf((byte) (8 - ExpandableListView.getPackedPositionGroup(0L)), (-40) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 382589665 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (short) View.resolveSizeAndState(0, 0, 0), (Process.myTid() >> 22) - 1775818704).intern();
        ag$a = valueOf((byte) ((-28) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (-41) - (ViewConfiguration.getTapTimeout() >> 16), 382589696 - ExpandableListView.getPackedPositionChild(0L), (short) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), (-1775818694) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))).intern();
        values = valueOf((byte) ((-46) - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (-40) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 382589696 - TextUtils.indexOf((CharSequence) "", '0'), (short) (ViewConfiguration.getTouchSlop() >> 8), ExpandableListView.getPackedPositionGroup(0L) - 1775818682).intern();
        notify = new String[]{".*transstatus.*"};
        AudioAttributesCompatParcelizer = "transstatus=";
        INotificationSideChannel$Default = "transstatus=";
        AudioAttributesImplApi21Parcelizer = "transstatus=1";
        IconCompatParcelizer = "transstatus=1";
        write = "transstatus=2";
        AudioAttributesImplBaseParcelizer = "walletrechargestatus";
        RemoteActionCompatParcelizer = "errortype";
        connect = "Wallet Link Successful";
        MediaBrowserCompat = "Wallet Link Failed";
        disconnect = "Wallet Unlink Successful";
        AudioAttributesImplApi26Parcelizer = "Wallet Unlink Failed";
        HaptikWebView = "deposit-flow";
        int i = isConnected + 95;
        search = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes6.dex */
    public static abstract class JuspayServiceType {
        private static final /* synthetic */ JuspayServiceType[] $VALUES;
        public static final JuspayServiceType AMAZONPAY;
        public static final JuspayServiceType OTHER;
        public static final JuspayServiceType UPI;
        private static int ah$a = 1;
        private static int valueOf;
        private static char[] values;

        static void ag$a() {
            values = new char[]{'o', 211, 206, 213, 212, 218, 211, 205, 205, '*', 'R', 'L'};
        }

        public abstract String getPaymentMethod();

        public abstract String getServiceName();

        public abstract String getopName();

        /* renamed from: com.app.dream11.payment.PaymentConstants$JuspayServiceType$1  reason: invalid class name */
        /* loaded from: classes6.dex */
        enum AnonymousClass1 extends JuspayServiceType {
            private static char[] ag$a = {',', 'M', 'H', 'O', 'N', 'T', 'M', 'G', 'G', 163, 195, 180, 187, 187, 176, 198, 189, 199};
            private static int toString = 0;
            private static int valueOf = 1;

            @Override // com.app.dream11.payment.PaymentConstants.JuspayServiceType
            public String getPaymentMethod() {
                int i = valueOf + 101;
                toString = i % 128;
                int i2 = i % 2;
                String intern = valueOf(true, new int[]{0, 9, 0, 0}, new byte[]{1, 0, 1, 0, 1, 1, 1, 0, 0}).intern();
                int i3 = toString + 91;
                valueOf = i3 % 128;
                if ((i3 % 2 == 0 ? 'R' : '`') != '`') {
                    Object[] objArr = null;
                    int length = objArr.length;
                    return intern;
                }
                return intern;
            }

            @Override // com.app.dream11.payment.PaymentConstants.JuspayServiceType
            public String getServiceName() {
                try {
                    int i = toString + 83;
                    valueOf = i % 128;
                    if ((i % 2 == 0 ? '1' : 'E') != 'E') {
                        Object[] objArr = null;
                        int length = objArr.length;
                    }
                    int i2 = toString + 9;
                    valueOf = i2 % 128;
                    int i3 = i2 % 2;
                    return "in.juspay.ec";
                } catch (Exception e) {
                    throw e;
                }
            }

            @Override // com.app.dream11.payment.PaymentConstants.JuspayServiceType
            public String getopName() {
                int i = valueOf + 77;
                toString = i % 128;
                int i2 = i % 2;
                String intern = valueOf(true, new int[]{9, 9, 79, 7}, null).intern();
                int i3 = valueOf + 77;
                toString = i3 % 128;
                int i4 = i3 % 2;
                return intern;
            }

            private AnonymousClass1(String str, int i) {
                super(str, i);
            }

            private static String valueOf(boolean z, int[] iArr, byte[] bArr) {
                String str;
                synchronized (isClosed.ah$a) {
                    int i = iArr[0];
                    int i2 = iArr[1];
                    int i3 = iArr[2];
                    int i4 = iArr[3];
                    char[] cArr = new char[i2];
                    System.arraycopy(ag$a, i, cArr, 0, i2);
                    if (bArr != null) {
                        char[] cArr2 = new char[i2];
                        isClosed.ag$a = 0;
                        char c = 0;
                        while (isClosed.ag$a < i2) {
                            if (bArr[isClosed.ag$a] == 1) {
                                cArr2[isClosed.ag$a] = (char) (((cArr[isClosed.ag$a] << 1) + 1) - c);
                            } else {
                                cArr2[isClosed.ag$a] = (char) ((cArr[isClosed.ag$a] << 1) - c);
                            }
                            c = cArr2[isClosed.ag$a];
                            isClosed.ag$a++;
                        }
                        cArr = cArr2;
                    }
                    if (i4 > 0) {
                        char[] cArr3 = new char[i2];
                        System.arraycopy(cArr, 0, cArr3, 0, i2);
                        int i5 = i2 - i4;
                        System.arraycopy(cArr3, 0, cArr, i5, i4);
                        System.arraycopy(cArr3, i4, cArr, 0, i5);
                    }
                    if (z) {
                        char[] cArr4 = new char[i2];
                        isClosed.ag$a = 0;
                        while (isClosed.ag$a < i2) {
                            cArr4[isClosed.ag$a] = cArr[(i2 - isClosed.ag$a) - 1];
                            isClosed.ag$a++;
                        }
                        cArr = cArr4;
                    }
                    if (i3 > 0) {
                        isClosed.ag$a = 0;
                        while (isClosed.ag$a < i2) {
                            cArr[isClosed.ag$a] = (char) (cArr[isClosed.ag$a] - iArr[2]);
                            isClosed.ag$a++;
                        }
                    }
                    str = new String(cArr);
                }
                return str;
            }
        }

        private JuspayServiceType(String str, int i) {
        }

        public static JuspayServiceType valueOf(String str) {
            try {
                int i = valueOf + 7;
                ah$a = i % 128;
                if (!(i % 2 != 0)) {
                    JuspayServiceType juspayServiceType = (JuspayServiceType) Enum.valueOf(JuspayServiceType.class, str);
                    Object obj = null;
                    super.hashCode();
                    return juspayServiceType;
                }
                try {
                    return (JuspayServiceType) Enum.valueOf(JuspayServiceType.class, str);
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }

        public static JuspayServiceType[] values() {
            int i = valueOf + 75;
            ah$a = i % 128;
            if (!(i % 2 == 0)) {
                return (JuspayServiceType[]) $VALUES.clone();
            }
            JuspayServiceType[] juspayServiceTypeArr = (JuspayServiceType[]) $VALUES.clone();
            Object[] objArr = null;
            int length = objArr.length;
            return juspayServiceTypeArr;
        }

        static {
            ag$a();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(ah$a(true, new int[]{0, 9, 134, 0}, new byte[]{1, 0, 1, 0, 1, 1, 1, 0, 0}).intern(), 0);
            AMAZONPAY = anonymousClass1;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(ah$a(false, new int[]{9, 3, 0, 0}, new byte[]{1, 1, 1}).intern(), 1);
            UPI = anonymousClass2;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3("OTHER", 2);
            OTHER = anonymousClass3;
            $VALUES = new JuspayServiceType[]{anonymousClass1, anonymousClass2, anonymousClass3};
            int i = ah$a + 107;
            valueOf = i % 128;
            int i2 = i % 2;
        }

        /* renamed from: com.app.dream11.payment.PaymentConstants$JuspayServiceType$2  reason: invalid class name */
        /* loaded from: classes6.dex */
        enum AnonymousClass2 extends JuspayServiceType {
            private static int ag$a = 0;
            private static char ah$a = 13232;
            private static int ah$b = 1;
            private static char toString = 35509;
            private static char valueOf = 17766;
            private static char values = 54536;

            @Override // com.app.dream11.payment.PaymentConstants.JuspayServiceType
            public String getPaymentMethod() {
                int i = ah$b + 99;
                ag$a = i % 128;
                int i2 = i % 2;
                String intern = toString(new char[]{54227, 19519, 51533, 40816}, ImageFormat.getBitsPerPixel(0) + 4).intern();
                int i3 = ah$b + 69;
                ag$a = i3 % 128;
                int i4 = i3 % 2;
                return intern;
            }

            @Override // com.app.dream11.payment.PaymentConstants.JuspayServiceType
            public String getServiceName() {
                int i = ag$a + 67;
                ah$b = i % 128;
                if ((i % 2 == 0 ? TokenParser.ESCAPE : '%') != '\\') {
                    return "in.juspay.ec";
                }
                Object obj = null;
                super.hashCode();
                return "in.juspay.ec";
            }

            @Override // com.app.dream11.payment.PaymentConstants.JuspayServiceType
            public String getopName() {
                int i = ag$a + 115;
                ah$b = i % 128;
                return ((i % 2 == 0 ? '0' : '\f') != '0' ? toString(new char[]{51877, 22369, 35549, 5120, 12472, 55102}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 5) : toString(new char[]{51877, 22369, 35549, 5120, 12472, 55102}, (SystemClock.uptimeMillis() > 1L ? 1 : (SystemClock.uptimeMillis() == 1L ? 0 : -1)) + 2)).intern();
            }

            private AnonymousClass2(String str, int i) {
                super(str, i);
            }

            private static String toString(char[] cArr, int i) {
                String str;
                synchronized (moveToFirst.ah$a) {
                    char[] cArr2 = new char[cArr.length];
                    moveToFirst.values = 0;
                    char[] cArr3 = new char[2];
                    while (moveToFirst.values < cArr.length) {
                        cArr3[0] = cArr[moveToFirst.values];
                        cArr3[1] = cArr[moveToFirst.values + 1];
                        int i2 = 58224;
                        for (int i3 = 0; i3 < 16; i3++) {
                            cArr3[1] = (char) (cArr3[1] - (((cArr3[0] + i2) ^ ((cArr3[0] << 4) + ah$a)) ^ ((cArr3[0] >>> 5) + values)));
                            cArr3[0] = (char) (cArr3[0] - (((cArr3[1] + i2) ^ ((cArr3[1] << 4) + valueOf)) ^ ((cArr3[1] >>> 5) + toString)));
                            i2 -= 40503;
                        }
                        cArr2[moveToFirst.values] = cArr3[0];
                        cArr2[moveToFirst.values + 1] = cArr3[1];
                        moveToFirst.values += 2;
                    }
                    str = new String(cArr2, 0, i);
                }
                return str;
            }
        }

        /* renamed from: com.app.dream11.payment.PaymentConstants$JuspayServiceType$3  reason: invalid class name */
        /* loaded from: classes6.dex */
        enum AnonymousClass3 extends JuspayServiceType {
            @Override // com.app.dream11.payment.PaymentConstants.JuspayServiceType
            public String getPaymentMethod() {
                return null;
            }

            @Override // com.app.dream11.payment.PaymentConstants.JuspayServiceType
            public String getServiceName() {
                return "in.juspay.godel";
            }

            @Override // com.app.dream11.payment.PaymentConstants.JuspayServiceType
            public String getopName() {
                return "";
            }

            private AnonymousClass3(String str, int i) {
                super(str, i);
            }
        }

        private static String ah$a(boolean z, int[] iArr, byte[] bArr) {
            String str;
            synchronized (isClosed.ah$a) {
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = iArr[2];
                int i4 = iArr[3];
                char[] cArr = new char[i2];
                System.arraycopy(values, i, cArr, 0, i2);
                if (bArr != null) {
                    char[] cArr2 = new char[i2];
                    isClosed.ag$a = 0;
                    char c = 0;
                    while (isClosed.ag$a < i2) {
                        if (bArr[isClosed.ag$a] == 1) {
                            cArr2[isClosed.ag$a] = (char) (((cArr[isClosed.ag$a] << 1) + 1) - c);
                        } else {
                            cArr2[isClosed.ag$a] = (char) ((cArr[isClosed.ag$a] << 1) - c);
                        }
                        c = cArr2[isClosed.ag$a];
                        isClosed.ag$a++;
                    }
                    cArr = cArr2;
                }
                if (i4 > 0) {
                    char[] cArr3 = new char[i2];
                    System.arraycopy(cArr, 0, cArr3, 0, i2);
                    int i5 = i2 - i4;
                    System.arraycopy(cArr3, 0, cArr, i5, i4);
                    System.arraycopy(cArr3, i4, cArr, 0, i5);
                }
                if (z) {
                    char[] cArr4 = new char[i2];
                    isClosed.ag$a = 0;
                    while (isClosed.ag$a < i2) {
                        cArr4[isClosed.ag$a] = cArr[(i2 - isClosed.ag$a) - 1];
                        isClosed.ag$a++;
                    }
                    cArr = cArr4;
                }
                if (i3 > 0) {
                    isClosed.ag$a = 0;
                    while (isClosed.ag$a < i2) {
                        cArr[isClosed.ag$a] = (char) (cArr[isClosed.ag$a] - iArr[2]);
                        isClosed.ag$a++;
                    }
                }
                str = new String(cArr);
            }
            return str;
        }
    }

    private static String valueOf(byte b2, int i, int i2, short s, int i3) {
        String obj;
        synchronized (moveToLast.ah$a) {
            StringBuilder sb = new StringBuilder();
            int i4 = i + getExtras;
            boolean z = i4 == -1;
            if (z) {
                if (getItem != null) {
                    i4 = (byte) (getItem[getNotifyChildrenChangedOptions + i3] + getExtras);
                } else {
                    i4 = (short) (getServiceComponent[getNotifyChildrenChangedOptions + i3] + getExtras);
                }
            }
            if (i4 > 0) {
                moveToLast.values = ((i3 + i4) - 2) + getNotifyChildrenChangedOptions + (z ? 1 : 0);
                moveToLast.ag$a = (char) (i2 + getRoot);
                sb.append(moveToLast.ag$a);
                moveToLast.toString = moveToLast.ag$a;
                moveToLast.valueOf = 1;
                while (moveToLast.valueOf < i4) {
                    if (getItem != null) {
                        byte[] bArr = getItem;
                        int i5 = moveToLast.values;
                        moveToLast.values = i5 - 1;
                        moveToLast.ag$a = (char) (moveToLast.toString + (((byte) (bArr[i5] + s)) ^ b2));
                    } else {
                        short[] sArr = getServiceComponent;
                        int i6 = moveToLast.values;
                        moveToLast.values = i6 - 1;
                        moveToLast.ag$a = (char) (moveToLast.toString + (((short) (sArr[i6] + s)) ^ b2));
                    }
                    sb.append(moveToLast.ag$a);
                    moveToLast.toString = moveToLast.ag$a;
                    moveToLast.valueOf++;
                }
            }
            obj = sb.toString();
        }
        return obj;
    }

    private static String ag$a(char[] cArr, int i) {
        String str;
        synchronized (getWantsAllOnMoveCalls.ag$a) {
            char[] getwantsallonmovecalls = getWantsAllOnMoveCalls.toString(subscribe, cArr, i);
            getWantsAllOnMoveCalls.values = 4;
            while (getWantsAllOnMoveCalls.values < getwantsallonmovecalls.length) {
                getWantsAllOnMoveCalls.toString = getWantsAllOnMoveCalls.values - 4;
                getwantsallonmovecalls[getWantsAllOnMoveCalls.values] = (char) ((getwantsallonmovecalls[getWantsAllOnMoveCalls.values] ^ getwantsallonmovecalls[getWantsAllOnMoveCalls.values % 4]) ^ (getWantsAllOnMoveCalls.toString * subscribe));
                getWantsAllOnMoveCalls.values++;
            }
            str = new String(getwantsallonmovecalls, 4, getwantsallonmovecalls.length - 4);
        }
        return str;
    }
}
