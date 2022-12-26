package com.bugsnag.android;

import java.io.IOException;
import java.util.Date;
import java.util.Map;
import o.getParentForAccessibility;
import o.requestFitSystemWindows;
import o.setBackgroundTintMode;
import o.setImportantForAccessibility;
/* loaded from: classes3.dex */
public class Breadcrumb implements setBackgroundTintMode.toString {
    final getParentForAccessibility impl;
    private final setImportantForAccessibility logger;

    public Breadcrumb(getParentForAccessibility getparentforaccessibility, setImportantForAccessibility setimportantforaccessibility) {
        this.impl = getparentforaccessibility;
        this.logger = setimportantforaccessibility;
    }

    public Breadcrumb(String str, setImportantForAccessibility setimportantforaccessibility) {
        this.impl = new getParentForAccessibility(str);
        this.logger = setimportantforaccessibility;
    }

    public Breadcrumb(String str, BreadcrumbType breadcrumbType, Map<String, Object> map, Date date, setImportantForAccessibility setimportantforaccessibility) {
        this.impl = new getParentForAccessibility(str, breadcrumbType, map, date);
        this.logger = setimportantforaccessibility;
    }

    private void logNull(String str) {
        setImportantForAccessibility setimportantforaccessibility = this.logger;
        setimportantforaccessibility.ag$a("Invalid null value supplied to breadcrumb." + str + ", ignoring");
    }

    public void setMessage(String str) {
        if (str != null) {
            this.impl.ag$a = str;
        } else {
            logNull("message");
        }
    }

    public String getMessage() {
        return this.impl.ag$a;
    }

    public void setType(BreadcrumbType breadcrumbType) {
        if (breadcrumbType != null) {
            this.impl.ah$a = breadcrumbType;
        } else {
            logNull("type");
        }
    }

    public BreadcrumbType getType() {
        return this.impl.ah$a;
    }

    public void setMetadata(Map<String, Object> map) {
        this.impl.values = map;
    }

    public Map<String, Object> getMetadata() {
        return this.impl.values;
    }

    public Date getTimestamp() {
        return this.impl.toString;
    }

    String getStringTimestamp() {
        return requestFitSystemWindows.toString(this.impl.toString);
    }

    @Override // o.setBackgroundTintMode.toString
    public void toStream(setBackgroundTintMode setbackgroundtintmode) throws IOException {
        this.impl.toStream(setbackgroundtintmode);
    }
}
