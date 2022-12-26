package com.bugsnag.android;

import com.facebook.react.devsupport.StackTraceHelper;
import com.sendbird.android.constant.StringSet;
import java.io.IOException;
import o.getTargetTypes;
import o.runAnimators;
import o.setBackgroundTintMode;
/* loaded from: classes6.dex */
public final class NativeStackframe implements setBackgroundTintMode.toString {
    private String codeIdentifier;
    private String file;
    private Long frameAddress;
    private Boolean isPC;
    private Number lineNumber;
    private Long loadAddress;
    private String method;
    private Long symbolAddress;
    private ErrorType type;

    public NativeStackframe(String str, String str2, Number number, Long l, Long l2, Long l3, Boolean bool, ErrorType errorType, String str3) {
        this.method = str;
        this.file = str2;
        this.lineNumber = number;
        this.frameAddress = l;
        this.symbolAddress = l2;
        this.loadAddress = l3;
        this.isPC = bool;
        this.type = errorType;
        this.codeIdentifier = str3;
    }

    public final String getMethod() {
        return this.method;
    }

    public final void setMethod(String str) {
        this.method = str;
    }

    public final String getFile() {
        return this.file;
    }

    public final void setFile(String str) {
        this.file = str;
    }

    public final Number getLineNumber() {
        return this.lineNumber;
    }

    public final void setLineNumber(Number number) {
        this.lineNumber = number;
    }

    public final Long getFrameAddress() {
        return this.frameAddress;
    }

    public final void setFrameAddress(Long l) {
        this.frameAddress = l;
    }

    public final Long getSymbolAddress() {
        return this.symbolAddress;
    }

    public final void setSymbolAddress(Long l) {
        this.symbolAddress = l;
    }

    public final Long getLoadAddress() {
        return this.loadAddress;
    }

    public final void setLoadAddress(Long l) {
        this.loadAddress = l;
    }

    public final Boolean isPC() {
        return this.isPC;
    }

    public final void setPC(Boolean bool) {
        this.isPC = bool;
    }

    public /* synthetic */ NativeStackframe(String str, String str2, Number number, Long l, Long l2, Long l3, Boolean bool, ErrorType errorType, String str3, int i, getTargetTypes gettargettypes) {
        this(str, str2, number, l, l2, l3, bool, (i & 128) != 0 ? null : errorType, (i & 256) != 0 ? null : str3);
    }

    public final ErrorType getType() {
        return this.type;
    }

    public final void setType(ErrorType errorType) {
        this.type = errorType;
    }

    public final String getCodeIdentifier() {
        return this.codeIdentifier;
    }

    public final void setCodeIdentifier(String str) {
        this.codeIdentifier = str;
    }

    @Override // o.setBackgroundTintMode.toString
    public void toStream(setBackgroundTintMode setbackgroundtintmode) throws IOException {
        runAnimators.valueOf(setbackgroundtintmode, "writer");
        setbackgroundtintmode.values();
        setbackgroundtintmode.ag$a("method").valueOf(this.method);
        setbackgroundtintmode.ag$a(StringSet.file).valueOf(this.file);
        setbackgroundtintmode.ag$a(StackTraceHelper.LINE_NUMBER_KEY).values(this.lineNumber);
        setbackgroundtintmode.ag$a("frameAddress").values(this.frameAddress);
        setbackgroundtintmode.ag$a("symbolAddress").values(this.symbolAddress);
        setbackgroundtintmode.ag$a("loadAddress").values(this.loadAddress);
        setbackgroundtintmode.ag$a("codeIdentifier").valueOf(this.codeIdentifier);
        setbackgroundtintmode.ag$a("isPC").valueOf(this.isPC);
        ErrorType errorType = this.type;
        if (errorType != null) {
            setbackgroundtintmode.ag$a("type").valueOf(errorType.getDesc$bugsnag_android_core_release());
        }
        setbackgroundtintmode.ag$a();
    }
}
