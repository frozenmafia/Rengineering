package com.dreampay.vsc.core;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKey;
import com.dreampay.vsc.core.models.IDexguardSecure;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getRealOwner;
/* loaded from: classes6.dex */
public final class SecureStorage$sharedPreferences$2 extends Lambda implements Styleable.ArcMotion<SharedPreferences> {
    final /* synthetic */ IDexguardSecure this$0$59a3fdde;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SecureStorage$sharedPreferences$2(IDexguardSecure iDexguardSecure) {
        super(0);
        this.this$0$59a3fdde = iDexguardSecure;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final SharedPreferences invoke() {
        try {
            Context context = (Context) ((Class) getRealOwner.ag$a((char) View.resolveSize(0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 110, ((byte) KeyEvent.getModifierMetaStateMask()) + 28)).getMethod("ah$a", (Class) getRealOwner.ag$a((char) (AndroidCharacter.getMirror('0') - '0'), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 111, 27 - TextUtils.getOffsetBefore("", 0))).invoke(null, this.this$0$59a3fdde);
            IDexguardSecure iDexguardSecure = this.this$0$59a3fdde;
            try {
                try {
                    try {
                        String str = (String) ((Class) getRealOwner.ag$a((char) (TextUtils.lastIndexOf("", '0') + 1), 111 - (ViewConfiguration.getEdgeSlop() >> 16), Color.blue(0) + 27)).getMethod("values", (Class) getRealOwner.ag$a((char) ((-1) - TextUtils.lastIndexOf("", '0')), 111 - TextUtils.indexOf("", "", 0), 26 - TextUtils.lastIndexOf("", '0')), String.class, String.class).invoke(null, iDexguardSecure, ((Class) getRealOwner.ag$a((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 111 - (ViewConfiguration.getTouchSlop() >> 8), 27 - (ViewConfiguration.getScrollBarSize() >> 8))).getMethod("toString", (Class) getRealOwner.ag$a((char) ((-1) - ImageFormat.getBitsPerPixel(0)), View.MeasureSpec.getMode(0) + 111, 28 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).invoke(null, iDexguardSecure), ((Class) getRealOwner.ag$a((char) KeyEvent.getDeadChar(0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 110, 26 - ((byte) KeyEvent.getModifierMetaStateMask()))).getMethod("ag$a", (Class) getRealOwner.ag$a((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 111 - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 27)).invoke(null, this.this$0$59a3fdde));
                        IDexguardSecure iDexguardSecure2 = this.this$0$59a3fdde;
                        try {
                            try {
                                return EncryptedSharedPreferences.create(context, str, (MasterKey) ((Class) getRealOwner.ag$a((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 111, (ViewConfiguration.getScrollBarSize() >> 8) + 27)).getMethod("values", (Class) getRealOwner.ag$a((char) TextUtils.getCapsMode("", 0, 0), 111 - TextUtils.indexOf("", "", 0, 0), 26 - TextUtils.lastIndexOf("", '0', 0, 0)), Context.class).invoke(null, iDexguardSecure2, ((Class) getRealOwner.ag$a((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (-16777105) - Color.rgb(0, 0, 0), 27 - Color.argb(0, 0, 0, 0))).getMethod("ah$a", (Class) getRealOwner.ag$a((char) KeyEvent.getDeadChar(0, 0), TextUtils.indexOf((CharSequence) "", '0') + 112, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 28)).invoke(null, iDexguardSecure2)), EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 != null) {
                                throw cause2;
                            }
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 != null) {
                            throw cause3;
                        }
                        throw th3;
                    }
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 != null) {
                        throw cause4;
                    }
                    throw th4;
                }
            } catch (Throwable th5) {
                Throwable cause5 = th5.getCause();
                if (cause5 != null) {
                    throw cause5;
                }
                throw th5;
            }
        } catch (Throwable th6) {
            Throwable cause6 = th6.getCause();
            if (cause6 != null) {
                throw cause6;
            }
            throw th6;
        }
    }
}
