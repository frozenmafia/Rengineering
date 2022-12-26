package org.jsoup.parser;

import o.getRawSidecarDevicePosture;
import o.setSidecarDevicePosture;
import org.apache.commons.codec.language.Soundex;
import org.apache.http.message.TokenParser;
import org.jsoup.parser.Token;
/* loaded from: classes5.dex */
public enum TokeniserState {
    Data { // from class: org.jsoup.parser.TokeniserState.1
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            char HaptikWebView = getrawsidecardeviceposture.HaptikWebView();
            if (HaptikWebView == 0) {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.valueOf(getrawsidecardeviceposture.ah$a());
            } else if (HaptikWebView == '&') {
                setsidecardeviceposture.ah$a(CharacterReferenceInData);
            } else if (HaptikWebView == '<') {
                setsidecardeviceposture.ah$a(TagOpen);
            } else if (HaptikWebView == 65535) {
                setsidecardeviceposture.ah$a(new Token.valueOf());
            } else {
                setsidecardeviceposture.valueOf(getrawsidecardeviceposture.values());
            }
        }
    },
    CharacterReferenceInData { // from class: org.jsoup.parser.TokeniserState.2
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            TokeniserState.readCharRef(setsidecardeviceposture, Data);
        }
    },
    Rcdata { // from class: org.jsoup.parser.TokeniserState.3
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            char HaptikWebView = getrawsidecardeviceposture.HaptikWebView();
            if (HaptikWebView == 0) {
                setsidecardeviceposture.values(this);
                getrawsidecardeviceposture.ag$a();
                setsidecardeviceposture.valueOf(TokeniserState.replacementChar);
            } else if (HaptikWebView == '&') {
                setsidecardeviceposture.ah$a(CharacterReferenceInRcdata);
            } else if (HaptikWebView == '<') {
                setsidecardeviceposture.ah$a(RcdataLessthanSign);
            } else if (HaptikWebView == 65535) {
                setsidecardeviceposture.ah$a(new Token.valueOf());
            } else {
                setsidecardeviceposture.valueOf(getrawsidecardeviceposture.ah$a('&', '<', TokeniserState.nullChar));
            }
        }
    },
    CharacterReferenceInRcdata { // from class: org.jsoup.parser.TokeniserState.4
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            TokeniserState.readCharRef(setsidecardeviceposture, Rcdata);
        }
    },
    Rawtext { // from class: org.jsoup.parser.TokeniserState.5
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            TokeniserState.readData(setsidecardeviceposture, getrawsidecardeviceposture, this, RawtextLessthanSign);
        }
    },
    ScriptData { // from class: org.jsoup.parser.TokeniserState.6
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            TokeniserState.readData(setsidecardeviceposture, getrawsidecardeviceposture, this, ScriptDataLessthanSign);
        }
    },
    PLAINTEXT { // from class: org.jsoup.parser.TokeniserState.7
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            char HaptikWebView = getrawsidecardeviceposture.HaptikWebView();
            if (HaptikWebView == 0) {
                setsidecardeviceposture.values(this);
                getrawsidecardeviceposture.ag$a();
                setsidecardeviceposture.valueOf(TokeniserState.replacementChar);
            } else if (HaptikWebView == 65535) {
                setsidecardeviceposture.ah$a(new Token.valueOf());
            } else {
                setsidecardeviceposture.valueOf(getrawsidecardeviceposture.values(TokeniserState.nullChar));
            }
        }
    },
    TagOpen { // from class: org.jsoup.parser.TokeniserState.8
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            char HaptikWebView = getrawsidecardeviceposture.HaptikWebView();
            if (HaptikWebView == '!') {
                setsidecardeviceposture.ah$a(MarkupDeclarationOpen);
            } else if (HaptikWebView == '/') {
                setsidecardeviceposture.ah$a(EndTagOpen);
            } else if (HaptikWebView == '?') {
                setsidecardeviceposture.ah$a(BogusComment);
            } else if (getrawsidecardeviceposture.HaptikSDK$d()) {
                setsidecardeviceposture.toString(true);
                setsidecardeviceposture.ag$a(TagName);
            } else {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.valueOf('<');
                setsidecardeviceposture.ag$a(Data);
            }
        }
    },
    EndTagOpen { // from class: org.jsoup.parser.TokeniserState.9
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            if (getrawsidecardeviceposture.getSignupData()) {
                setsidecardeviceposture.valueOf(this);
                setsidecardeviceposture.valueOf("</");
                setsidecardeviceposture.ag$a(Data);
            } else if (getrawsidecardeviceposture.HaptikSDK$d()) {
                setsidecardeviceposture.toString(false);
                setsidecardeviceposture.ag$a(TagName);
            } else if (getrawsidecardeviceposture.valueOf('>')) {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.ah$a(Data);
            } else {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.ah$a(BogusComment);
            }
        }
    },
    TagName { // from class: org.jsoup.parser.TokeniserState.10
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            setsidecardeviceposture.invoke.ah$a(getrawsidecardeviceposture.HaptikSDK$b());
            char ah$a = getrawsidecardeviceposture.ah$a();
            if (ah$a == 0) {
                setsidecardeviceposture.invoke.ah$a(TokeniserState.replacementStr);
                return;
            }
            if (ah$a != ' ') {
                if (ah$a == '/') {
                    setsidecardeviceposture.ag$a(SelfClosingStartTag);
                    return;
                } else if (ah$a == '>') {
                    setsidecardeviceposture.invoke();
                    setsidecardeviceposture.ag$a(Data);
                    return;
                } else if (ah$a == 65535) {
                    setsidecardeviceposture.valueOf(this);
                    setsidecardeviceposture.ag$a(Data);
                    return;
                } else if (ah$a != '\t' && ah$a != '\n' && ah$a != '\f' && ah$a != '\r') {
                    setsidecardeviceposture.invoke.valueOf(ah$a);
                    return;
                }
            }
            setsidecardeviceposture.ag$a(BeforeAttributeName);
        }
    },
    RcdataLessthanSign { // from class: org.jsoup.parser.TokeniserState.11
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            if (getrawsidecardeviceposture.valueOf('/')) {
                setsidecardeviceposture.valueOf();
                setsidecardeviceposture.ah$a(RCDATAEndTagOpen);
                return;
            }
            if (getrawsidecardeviceposture.HaptikSDK$d() && setsidecardeviceposture.ah$a() != null) {
                if (!getrawsidecardeviceposture.ag$a("</" + setsidecardeviceposture.ah$a())) {
                    setsidecardeviceposture.invoke = setsidecardeviceposture.toString(false).valueOf(setsidecardeviceposture.ah$a());
                    setsidecardeviceposture.invoke();
                    getrawsidecardeviceposture.onXdkEvent();
                    setsidecardeviceposture.ag$a(Data);
                    return;
                }
            }
            setsidecardeviceposture.valueOf("<");
            setsidecardeviceposture.ag$a(Rcdata);
        }
    },
    RCDATAEndTagOpen { // from class: org.jsoup.parser.TokeniserState.12
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            if (getrawsidecardeviceposture.HaptikSDK$d()) {
                setsidecardeviceposture.toString(false);
                setsidecardeviceposture.invoke.valueOf(getrawsidecardeviceposture.HaptikWebView());
                setsidecardeviceposture.valueOf.append(getrawsidecardeviceposture.HaptikWebView());
                setsidecardeviceposture.ah$a(RCDATAEndTagName);
                return;
            }
            setsidecardeviceposture.valueOf("</");
            setsidecardeviceposture.ag$a(Rcdata);
        }
    },
    RCDATAEndTagName { // from class: org.jsoup.parser.TokeniserState.13
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            if (getrawsidecardeviceposture.HaptikSDK$d()) {
                String HaptikSDK$c = getrawsidecardeviceposture.HaptikSDK$c();
                setsidecardeviceposture.invoke.ah$a(HaptikSDK$c);
                setsidecardeviceposture.valueOf.append(HaptikSDK$c);
                return;
            }
            char ah$a = getrawsidecardeviceposture.ah$a();
            if (ah$a == '\t' || ah$a == '\n' || ah$a == '\f' || ah$a == '\r' || ah$a == ' ') {
                if (setsidecardeviceposture.HaptikSDK$a()) {
                    setsidecardeviceposture.ag$a(BeforeAttributeName);
                } else {
                    anythingElse(setsidecardeviceposture, getrawsidecardeviceposture);
                }
            } else if (ah$a == '/') {
                if (setsidecardeviceposture.HaptikSDK$a()) {
                    setsidecardeviceposture.ag$a(SelfClosingStartTag);
                } else {
                    anythingElse(setsidecardeviceposture, getrawsidecardeviceposture);
                }
            } else if (ah$a == '>') {
                if (setsidecardeviceposture.HaptikSDK$a()) {
                    setsidecardeviceposture.invoke();
                    setsidecardeviceposture.ag$a(Data);
                    return;
                }
                anythingElse(setsidecardeviceposture, getrawsidecardeviceposture);
            } else {
                anythingElse(setsidecardeviceposture, getrawsidecardeviceposture);
            }
        }

        private void anythingElse(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            setsidecardeviceposture.valueOf("</" + setsidecardeviceposture.valueOf.toString());
            getrawsidecardeviceposture.onXdkEvent();
            setsidecardeviceposture.ag$a(Rcdata);
        }
    },
    RawtextLessthanSign { // from class: org.jsoup.parser.TokeniserState.14
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            if (getrawsidecardeviceposture.valueOf('/')) {
                setsidecardeviceposture.valueOf();
                setsidecardeviceposture.ah$a(RawtextEndTagOpen);
                return;
            }
            setsidecardeviceposture.valueOf('<');
            setsidecardeviceposture.ag$a(Rawtext);
        }
    },
    RawtextEndTagOpen { // from class: org.jsoup.parser.TokeniserState.15
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            TokeniserState.readEndTag(setsidecardeviceposture, getrawsidecardeviceposture, RawtextEndTagName, Rawtext);
        }
    },
    RawtextEndTagName { // from class: org.jsoup.parser.TokeniserState.16
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            TokeniserState.handleDataEndTag(setsidecardeviceposture, getrawsidecardeviceposture, Rawtext);
        }
    },
    ScriptDataLessthanSign { // from class: org.jsoup.parser.TokeniserState.17
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            char ah$a = getrawsidecardeviceposture.ah$a();
            if (ah$a == '!') {
                setsidecardeviceposture.valueOf("<!");
                setsidecardeviceposture.ag$a(ScriptDataEscapeStart);
            } else if (ah$a == '/') {
                setsidecardeviceposture.valueOf();
                setsidecardeviceposture.ag$a(ScriptDataEndTagOpen);
            } else {
                setsidecardeviceposture.valueOf("<");
                getrawsidecardeviceposture.onXdkEvent();
                setsidecardeviceposture.ag$a(ScriptData);
            }
        }
    },
    ScriptDataEndTagOpen { // from class: org.jsoup.parser.TokeniserState.18
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            TokeniserState.readEndTag(setsidecardeviceposture, getrawsidecardeviceposture, ScriptDataEndTagName, ScriptData);
        }
    },
    ScriptDataEndTagName { // from class: org.jsoup.parser.TokeniserState.19
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            TokeniserState.handleDataEndTag(setsidecardeviceposture, getrawsidecardeviceposture, ScriptData);
        }
    },
    ScriptDataEscapeStart { // from class: org.jsoup.parser.TokeniserState.20
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            if (getrawsidecardeviceposture.valueOf(Soundex.SILENT_MARKER)) {
                setsidecardeviceposture.valueOf(Soundex.SILENT_MARKER);
                setsidecardeviceposture.ah$a(ScriptDataEscapeStartDash);
                return;
            }
            setsidecardeviceposture.ag$a(ScriptData);
        }
    },
    ScriptDataEscapeStartDash { // from class: org.jsoup.parser.TokeniserState.21
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            if (getrawsidecardeviceposture.valueOf(Soundex.SILENT_MARKER)) {
                setsidecardeviceposture.valueOf(Soundex.SILENT_MARKER);
                setsidecardeviceposture.ah$a(ScriptDataEscapedDashDash);
                return;
            }
            setsidecardeviceposture.ag$a(ScriptData);
        }
    },
    ScriptDataEscaped { // from class: org.jsoup.parser.TokeniserState.22
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            if (getrawsidecardeviceposture.getSignupData()) {
                setsidecardeviceposture.valueOf(this);
                setsidecardeviceposture.ag$a(Data);
                return;
            }
            char HaptikWebView = getrawsidecardeviceposture.HaptikWebView();
            if (HaptikWebView == 0) {
                setsidecardeviceposture.values(this);
                getrawsidecardeviceposture.ag$a();
                setsidecardeviceposture.valueOf(TokeniserState.replacementChar);
            } else if (HaptikWebView == '-') {
                setsidecardeviceposture.valueOf(Soundex.SILENT_MARKER);
                setsidecardeviceposture.ah$a(ScriptDataEscapedDash);
            } else if (HaptikWebView == '<') {
                setsidecardeviceposture.ah$a(ScriptDataEscapedLessthanSign);
            } else {
                setsidecardeviceposture.valueOf(getrawsidecardeviceposture.ah$a(Soundex.SILENT_MARKER, '<', TokeniserState.nullChar));
            }
        }
    },
    ScriptDataEscapedDash { // from class: org.jsoup.parser.TokeniserState.23
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            if (getrawsidecardeviceposture.getSignupData()) {
                setsidecardeviceposture.valueOf(this);
                setsidecardeviceposture.ag$a(Data);
                return;
            }
            char ah$a = getrawsidecardeviceposture.ah$a();
            if (ah$a == 0) {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.valueOf(TokeniserState.replacementChar);
                setsidecardeviceposture.ag$a(ScriptDataEscaped);
            } else if (ah$a == '-') {
                setsidecardeviceposture.valueOf(ah$a);
                setsidecardeviceposture.ag$a(ScriptDataEscapedDashDash);
            } else if (ah$a == '<') {
                setsidecardeviceposture.ag$a(ScriptDataEscapedLessthanSign);
            } else {
                setsidecardeviceposture.valueOf(ah$a);
                setsidecardeviceposture.ag$a(ScriptDataEscaped);
            }
        }
    },
    ScriptDataEscapedDashDash { // from class: org.jsoup.parser.TokeniserState.24
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            if (getrawsidecardeviceposture.getSignupData()) {
                setsidecardeviceposture.valueOf(this);
                setsidecardeviceposture.ag$a(Data);
                return;
            }
            char ah$a = getrawsidecardeviceposture.ah$a();
            if (ah$a == 0) {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.valueOf(TokeniserState.replacementChar);
                setsidecardeviceposture.ag$a(ScriptDataEscaped);
            } else if (ah$a == '-') {
                setsidecardeviceposture.valueOf(ah$a);
            } else if (ah$a == '<') {
                setsidecardeviceposture.ag$a(ScriptDataEscapedLessthanSign);
            } else if (ah$a == '>') {
                setsidecardeviceposture.valueOf(ah$a);
                setsidecardeviceposture.ag$a(ScriptData);
            } else {
                setsidecardeviceposture.valueOf(ah$a);
                setsidecardeviceposture.ag$a(ScriptDataEscaped);
            }
        }
    },
    ScriptDataEscapedLessthanSign { // from class: org.jsoup.parser.TokeniserState.25
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            if (getrawsidecardeviceposture.HaptikSDK$d()) {
                setsidecardeviceposture.valueOf();
                setsidecardeviceposture.valueOf.append(getrawsidecardeviceposture.HaptikWebView());
                setsidecardeviceposture.valueOf("<" + getrawsidecardeviceposture.HaptikWebView());
                setsidecardeviceposture.ah$a(ScriptDataDoubleEscapeStart);
            } else if (getrawsidecardeviceposture.valueOf('/')) {
                setsidecardeviceposture.valueOf();
                setsidecardeviceposture.ah$a(ScriptDataEscapedEndTagOpen);
            } else {
                setsidecardeviceposture.valueOf('<');
                setsidecardeviceposture.ag$a(ScriptDataEscaped);
            }
        }
    },
    ScriptDataEscapedEndTagOpen { // from class: org.jsoup.parser.TokeniserState.26
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            if (getrawsidecardeviceposture.HaptikSDK$d()) {
                setsidecardeviceposture.toString(false);
                setsidecardeviceposture.invoke.valueOf(getrawsidecardeviceposture.HaptikWebView());
                setsidecardeviceposture.valueOf.append(getrawsidecardeviceposture.HaptikWebView());
                setsidecardeviceposture.ah$a(ScriptDataEscapedEndTagName);
                return;
            }
            setsidecardeviceposture.valueOf("</");
            setsidecardeviceposture.ag$a(ScriptDataEscaped);
        }
    },
    ScriptDataEscapedEndTagName { // from class: org.jsoup.parser.TokeniserState.27
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            TokeniserState.handleDataEndTag(setsidecardeviceposture, getrawsidecardeviceposture, ScriptDataEscaped);
        }
    },
    ScriptDataDoubleEscapeStart { // from class: org.jsoup.parser.TokeniserState.28
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            TokeniserState.handleDataDoubleEscapeTag(setsidecardeviceposture, getrawsidecardeviceposture, ScriptDataDoubleEscaped, ScriptDataEscaped);
        }
    },
    ScriptDataDoubleEscaped { // from class: org.jsoup.parser.TokeniserState.29
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            char HaptikWebView = getrawsidecardeviceposture.HaptikWebView();
            if (HaptikWebView == 0) {
                setsidecardeviceposture.values(this);
                getrawsidecardeviceposture.ag$a();
                setsidecardeviceposture.valueOf(TokeniserState.replacementChar);
            } else if (HaptikWebView == '-') {
                setsidecardeviceposture.valueOf(HaptikWebView);
                setsidecardeviceposture.ah$a(ScriptDataDoubleEscapedDash);
            } else if (HaptikWebView == '<') {
                setsidecardeviceposture.valueOf(HaptikWebView);
                setsidecardeviceposture.ah$a(ScriptDataDoubleEscapedLessthanSign);
            } else if (HaptikWebView == 65535) {
                setsidecardeviceposture.valueOf(this);
                setsidecardeviceposture.ag$a(Data);
            } else {
                setsidecardeviceposture.valueOf(getrawsidecardeviceposture.ah$a(Soundex.SILENT_MARKER, '<', TokeniserState.nullChar));
            }
        }
    },
    ScriptDataDoubleEscapedDash { // from class: org.jsoup.parser.TokeniserState.30
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            char ah$a = getrawsidecardeviceposture.ah$a();
            if (ah$a == 0) {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.valueOf(TokeniserState.replacementChar);
                setsidecardeviceposture.ag$a(ScriptDataDoubleEscaped);
            } else if (ah$a == '-') {
                setsidecardeviceposture.valueOf(ah$a);
                setsidecardeviceposture.ag$a(ScriptDataDoubleEscapedDashDash);
            } else if (ah$a == '<') {
                setsidecardeviceposture.valueOf(ah$a);
                setsidecardeviceposture.ag$a(ScriptDataDoubleEscapedLessthanSign);
            } else if (ah$a == 65535) {
                setsidecardeviceposture.valueOf(this);
                setsidecardeviceposture.ag$a(Data);
            } else {
                setsidecardeviceposture.valueOf(ah$a);
                setsidecardeviceposture.ag$a(ScriptDataDoubleEscaped);
            }
        }
    },
    ScriptDataDoubleEscapedDashDash { // from class: org.jsoup.parser.TokeniserState.31
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            char ah$a = getrawsidecardeviceposture.ah$a();
            if (ah$a == 0) {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.valueOf(TokeniserState.replacementChar);
                setsidecardeviceposture.ag$a(ScriptDataDoubleEscaped);
            } else if (ah$a == '-') {
                setsidecardeviceposture.valueOf(ah$a);
            } else if (ah$a == '<') {
                setsidecardeviceposture.valueOf(ah$a);
                setsidecardeviceposture.ag$a(ScriptDataDoubleEscapedLessthanSign);
            } else if (ah$a == '>') {
                setsidecardeviceposture.valueOf(ah$a);
                setsidecardeviceposture.ag$a(ScriptData);
            } else if (ah$a == 65535) {
                setsidecardeviceposture.valueOf(this);
                setsidecardeviceposture.ag$a(Data);
            } else {
                setsidecardeviceposture.valueOf(ah$a);
                setsidecardeviceposture.ag$a(ScriptDataDoubleEscaped);
            }
        }
    },
    ScriptDataDoubleEscapedLessthanSign { // from class: org.jsoup.parser.TokeniserState.32
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            if (getrawsidecardeviceposture.valueOf('/')) {
                setsidecardeviceposture.valueOf('/');
                setsidecardeviceposture.valueOf();
                setsidecardeviceposture.ah$a(ScriptDataDoubleEscapeEnd);
                return;
            }
            setsidecardeviceposture.ag$a(ScriptDataDoubleEscaped);
        }
    },
    ScriptDataDoubleEscapeEnd { // from class: org.jsoup.parser.TokeniserState.33
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            TokeniserState.handleDataDoubleEscapeTag(setsidecardeviceposture, getrawsidecardeviceposture, ScriptDataEscaped, ScriptDataDoubleEscaped);
        }
    },
    BeforeAttributeName { // from class: org.jsoup.parser.TokeniserState.34
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            char ah$a = getrawsidecardeviceposture.ah$a();
            if (ah$a == 0) {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.invoke.ak();
                getrawsidecardeviceposture.onXdkEvent();
                setsidecardeviceposture.ag$a(AttributeName);
            } else if (ah$a != ' ') {
                if (ah$a != '\"' && ah$a != '\'') {
                    if (ah$a == '/') {
                        setsidecardeviceposture.ag$a(SelfClosingStartTag);
                        return;
                    } else if (ah$a == 65535) {
                        setsidecardeviceposture.valueOf(this);
                        setsidecardeviceposture.ag$a(Data);
                        return;
                    } else if (ah$a == '\t' || ah$a == '\n' || ah$a == '\f' || ah$a == '\r') {
                        return;
                    } else {
                        switch (ah$a) {
                            case '<':
                            case '=':
                                break;
                            case '>':
                                setsidecardeviceposture.invoke();
                                setsidecardeviceposture.ag$a(Data);
                                return;
                            default:
                                setsidecardeviceposture.invoke.ak();
                                getrawsidecardeviceposture.onXdkEvent();
                                setsidecardeviceposture.ag$a(AttributeName);
                                return;
                        }
                    }
                }
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.invoke.ak();
                setsidecardeviceposture.invoke.values(ah$a);
                setsidecardeviceposture.ag$a(AttributeName);
            }
        }
    },
    AttributeName { // from class: org.jsoup.parser.TokeniserState.35
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            setsidecardeviceposture.invoke.ag$a(getrawsidecardeviceposture.ag$a(attributeNameCharsSorted));
            char ah$a = getrawsidecardeviceposture.ah$a();
            if (ah$a != 0) {
                if (ah$a != ' ') {
                    if (ah$a != '\"' && ah$a != '\'') {
                        if (ah$a == '/') {
                            setsidecardeviceposture.ag$a(SelfClosingStartTag);
                            return;
                        } else if (ah$a == 65535) {
                            setsidecardeviceposture.valueOf(this);
                            setsidecardeviceposture.ag$a(Data);
                            return;
                        } else if (ah$a != '\t' && ah$a != '\n' && ah$a != '\f' && ah$a != '\r') {
                            switch (ah$a) {
                                case '<':
                                    break;
                                case '=':
                                    setsidecardeviceposture.ag$a(BeforeAttributeValue);
                                    return;
                                case '>':
                                    setsidecardeviceposture.invoke();
                                    setsidecardeviceposture.ag$a(Data);
                                    return;
                                default:
                                    setsidecardeviceposture.invoke.values(ah$a);
                                    return;
                            }
                        }
                    }
                    setsidecardeviceposture.values(this);
                    setsidecardeviceposture.invoke.values(ah$a);
                    return;
                }
                setsidecardeviceposture.ag$a(AfterAttributeName);
                return;
            }
            setsidecardeviceposture.values(this);
            setsidecardeviceposture.invoke.values(TokeniserState.replacementChar);
        }
    },
    AfterAttributeName { // from class: org.jsoup.parser.TokeniserState.36
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            char ah$a = getrawsidecardeviceposture.ah$a();
            if (ah$a == 0) {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.invoke.values(TokeniserState.replacementChar);
                setsidecardeviceposture.ag$a(AttributeName);
            } else if (ah$a != ' ') {
                if (ah$a != '\"' && ah$a != '\'') {
                    if (ah$a == '/') {
                        setsidecardeviceposture.ag$a(SelfClosingStartTag);
                        return;
                    } else if (ah$a == 65535) {
                        setsidecardeviceposture.valueOf(this);
                        setsidecardeviceposture.ag$a(Data);
                        return;
                    } else if (ah$a == '\t' || ah$a == '\n' || ah$a == '\f' || ah$a == '\r') {
                        return;
                    } else {
                        switch (ah$a) {
                            case '<':
                                break;
                            case '=':
                                setsidecardeviceposture.ag$a(BeforeAttributeValue);
                                return;
                            case '>':
                                setsidecardeviceposture.invoke();
                                setsidecardeviceposture.ag$a(Data);
                                return;
                            default:
                                setsidecardeviceposture.invoke.ak();
                                getrawsidecardeviceposture.onXdkEvent();
                                setsidecardeviceposture.ag$a(AttributeName);
                                return;
                        }
                    }
                }
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.invoke.ak();
                setsidecardeviceposture.invoke.values(ah$a);
                setsidecardeviceposture.ag$a(AttributeName);
            }
        }
    },
    BeforeAttributeValue { // from class: org.jsoup.parser.TokeniserState.37
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            char ah$a = getrawsidecardeviceposture.ah$a();
            if (ah$a == 0) {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.invoke.ah$a(TokeniserState.replacementChar);
                setsidecardeviceposture.ag$a(AttributeValue_unquoted);
            } else if (ah$a != ' ') {
                if (ah$a == '\"') {
                    setsidecardeviceposture.ag$a(AttributeValue_doubleQuoted);
                    return;
                }
                if (ah$a != '`') {
                    if (ah$a == 65535) {
                        setsidecardeviceposture.valueOf(this);
                        setsidecardeviceposture.invoke();
                        setsidecardeviceposture.ag$a(Data);
                        return;
                    } else if (ah$a == '\t' || ah$a == '\n' || ah$a == '\f' || ah$a == '\r') {
                        return;
                    } else {
                        if (ah$a == '&') {
                            getrawsidecardeviceposture.onXdkEvent();
                            setsidecardeviceposture.ag$a(AttributeValue_unquoted);
                            return;
                        } else if (ah$a == '\'') {
                            setsidecardeviceposture.ag$a(AttributeValue_singleQuoted);
                            return;
                        } else {
                            switch (ah$a) {
                                case '<':
                                case '=':
                                    break;
                                case '>':
                                    setsidecardeviceposture.values(this);
                                    setsidecardeviceposture.invoke();
                                    setsidecardeviceposture.ag$a(Data);
                                    return;
                                default:
                                    getrawsidecardeviceposture.onXdkEvent();
                                    setsidecardeviceposture.ag$a(AttributeValue_unquoted);
                                    return;
                            }
                        }
                    }
                }
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.invoke.ah$a(ah$a);
                setsidecardeviceposture.ag$a(AttributeValue_unquoted);
            }
        }
    },
    AttributeValue_doubleQuoted { // from class: org.jsoup.parser.TokeniserState.38
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            String ah$a = getrawsidecardeviceposture.ah$a(attributeDoubleValueCharsSorted);
            if (ah$a.length() > 0) {
                setsidecardeviceposture.invoke.values(ah$a);
            } else {
                setsidecardeviceposture.invoke.ICustomTabsCallback();
            }
            char ah$a2 = getrawsidecardeviceposture.ah$a();
            if (ah$a2 == 0) {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.invoke.ah$a(TokeniserState.replacementChar);
            } else if (ah$a2 == '\"') {
                setsidecardeviceposture.ag$a(AfterAttributeValue_quoted);
            } else if (ah$a2 != '&') {
                if (ah$a2 == 65535) {
                    setsidecardeviceposture.valueOf(this);
                    setsidecardeviceposture.ag$a(Data);
                    return;
                }
                setsidecardeviceposture.invoke.ah$a(ah$a2);
            } else {
                int[] ag$a = setsidecardeviceposture.ag$a('\"', true);
                if (ag$a != null) {
                    setsidecardeviceposture.invoke.toString(ag$a);
                } else {
                    setsidecardeviceposture.invoke.ah$a('&');
                }
            }
        }
    },
    AttributeValue_singleQuoted { // from class: org.jsoup.parser.TokeniserState.39
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            String ah$a = getrawsidecardeviceposture.ah$a(attributeSingleValueCharsSorted);
            if (ah$a.length() > 0) {
                setsidecardeviceposture.invoke.values(ah$a);
            } else {
                setsidecardeviceposture.invoke.ICustomTabsCallback();
            }
            char ah$a2 = getrawsidecardeviceposture.ah$a();
            if (ah$a2 == 0) {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.invoke.ah$a(TokeniserState.replacementChar);
            } else if (ah$a2 == 65535) {
                setsidecardeviceposture.valueOf(this);
                setsidecardeviceposture.ag$a(Data);
            } else if (ah$a2 != '&') {
                if (ah$a2 == '\'') {
                    setsidecardeviceposture.ag$a(AfterAttributeValue_quoted);
                } else {
                    setsidecardeviceposture.invoke.ah$a(ah$a2);
                }
            } else {
                int[] ag$a = setsidecardeviceposture.ag$a('\'', true);
                if (ag$a != null) {
                    setsidecardeviceposture.invoke.toString(ag$a);
                } else {
                    setsidecardeviceposture.invoke.ah$a('&');
                }
            }
        }
    },
    AttributeValue_unquoted { // from class: org.jsoup.parser.TokeniserState.40
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            String ag$a = getrawsidecardeviceposture.ag$a(attributeValueUnquoted);
            if (ag$a.length() > 0) {
                setsidecardeviceposture.invoke.values(ag$a);
            }
            char ah$a = getrawsidecardeviceposture.ah$a();
            if (ah$a != 0) {
                if (ah$a != ' ') {
                    if (ah$a != '\"' && ah$a != '`') {
                        if (ah$a == 65535) {
                            setsidecardeviceposture.valueOf(this);
                            setsidecardeviceposture.ag$a(Data);
                            return;
                        } else if (ah$a != '\t' && ah$a != '\n' && ah$a != '\f' && ah$a != '\r') {
                            if (ah$a == '&') {
                                int[] ag$a2 = setsidecardeviceposture.ag$a('>', true);
                                if (ag$a2 != null) {
                                    setsidecardeviceposture.invoke.toString(ag$a2);
                                    return;
                                } else {
                                    setsidecardeviceposture.invoke.ah$a('&');
                                    return;
                                }
                            } else if (ah$a != '\'') {
                                switch (ah$a) {
                                    case '<':
                                    case '=':
                                        break;
                                    case '>':
                                        setsidecardeviceposture.invoke();
                                        setsidecardeviceposture.ag$a(Data);
                                        return;
                                    default:
                                        setsidecardeviceposture.invoke.ah$a(ah$a);
                                        return;
                                }
                            }
                        }
                    }
                    setsidecardeviceposture.values(this);
                    setsidecardeviceposture.invoke.ah$a(ah$a);
                    return;
                }
                setsidecardeviceposture.ag$a(BeforeAttributeName);
                return;
            }
            setsidecardeviceposture.values(this);
            setsidecardeviceposture.invoke.ah$a(TokeniserState.replacementChar);
        }
    },
    AfterAttributeValue_quoted { // from class: org.jsoup.parser.TokeniserState.41
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            char ah$a = getrawsidecardeviceposture.ah$a();
            if (ah$a == '\t' || ah$a == '\n' || ah$a == '\f' || ah$a == '\r' || ah$a == ' ') {
                setsidecardeviceposture.ag$a(BeforeAttributeName);
            } else if (ah$a == '/') {
                setsidecardeviceposture.ag$a(SelfClosingStartTag);
            } else if (ah$a == '>') {
                setsidecardeviceposture.invoke();
                setsidecardeviceposture.ag$a(Data);
            } else if (ah$a == 65535) {
                setsidecardeviceposture.valueOf(this);
                setsidecardeviceposture.ag$a(Data);
            } else {
                setsidecardeviceposture.values(this);
                getrawsidecardeviceposture.onXdkEvent();
                setsidecardeviceposture.ag$a(BeforeAttributeName);
            }
        }
    },
    SelfClosingStartTag { // from class: org.jsoup.parser.TokeniserState.42
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            char ah$a = getrawsidecardeviceposture.ah$a();
            if (ah$a == '>') {
                setsidecardeviceposture.invoke.valueOf = true;
                setsidecardeviceposture.invoke();
                setsidecardeviceposture.ag$a(Data);
            } else if (ah$a == 65535) {
                setsidecardeviceposture.valueOf(this);
                setsidecardeviceposture.ag$a(Data);
            } else {
                setsidecardeviceposture.values(this);
                getrawsidecardeviceposture.onXdkEvent();
                setsidecardeviceposture.ag$a(BeforeAttributeName);
            }
        }
    },
    BogusComment { // from class: org.jsoup.parser.TokeniserState.43
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            getrawsidecardeviceposture.onXdkEvent();
            Token$ag$a token$ag$a = new Token$ag$a();
            token$ag$a.ah$a = true;
            token$ag$a.valueOf.append(getrawsidecardeviceposture.values('>'));
            setsidecardeviceposture.ah$a(token$ag$a);
            setsidecardeviceposture.ah$a(Data);
        }
    },
    MarkupDeclarationOpen { // from class: org.jsoup.parser.TokeniserState.44
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            if (getrawsidecardeviceposture.valueOf("--")) {
                setsidecardeviceposture.values();
                setsidecardeviceposture.ag$a(CommentStart);
            } else if (getrawsidecardeviceposture.ah$a("DOCTYPE")) {
                setsidecardeviceposture.ag$a(Doctype);
            } else if (getrawsidecardeviceposture.valueOf("[CDATA[")) {
                setsidecardeviceposture.ag$a(CdataSection);
            } else {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.ah$a(BogusComment);
            }
        }
    },
    CommentStart { // from class: org.jsoup.parser.TokeniserState.45
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            char ah$a = getrawsidecardeviceposture.ah$a();
            if (ah$a == 0) {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.values.valueOf.append(TokeniserState.replacementChar);
                setsidecardeviceposture.ag$a(Comment);
            } else if (ah$a == '-') {
                setsidecardeviceposture.ag$a(CommentStartDash);
            } else if (ah$a == '>') {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.ah$b();
                setsidecardeviceposture.ag$a(Data);
            } else if (ah$a == 65535) {
                setsidecardeviceposture.valueOf(this);
                setsidecardeviceposture.ah$b();
                setsidecardeviceposture.ag$a(Data);
            } else {
                setsidecardeviceposture.values.valueOf.append(ah$a);
                setsidecardeviceposture.ag$a(Comment);
            }
        }
    },
    CommentStartDash { // from class: org.jsoup.parser.TokeniserState.46
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            char ah$a = getrawsidecardeviceposture.ah$a();
            if (ah$a == 0) {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.values.valueOf.append(TokeniserState.replacementChar);
                setsidecardeviceposture.ag$a(Comment);
            } else if (ah$a == '-') {
                setsidecardeviceposture.ag$a(CommentStartDash);
            } else if (ah$a == '>') {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.ah$b();
                setsidecardeviceposture.ag$a(Data);
            } else if (ah$a == 65535) {
                setsidecardeviceposture.valueOf(this);
                setsidecardeviceposture.ah$b();
                setsidecardeviceposture.ag$a(Data);
            } else {
                setsidecardeviceposture.values.valueOf.append(ah$a);
                setsidecardeviceposture.ag$a(Comment);
            }
        }
    },
    Comment { // from class: org.jsoup.parser.TokeniserState.47
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            char HaptikWebView = getrawsidecardeviceposture.HaptikWebView();
            if (HaptikWebView == 0) {
                setsidecardeviceposture.values(this);
                getrawsidecardeviceposture.ag$a();
                setsidecardeviceposture.values.valueOf.append(TokeniserState.replacementChar);
            } else if (HaptikWebView == '-') {
                setsidecardeviceposture.ah$a(CommentEndDash);
            } else if (HaptikWebView == 65535) {
                setsidecardeviceposture.valueOf(this);
                setsidecardeviceposture.ah$b();
                setsidecardeviceposture.ag$a(Data);
            } else {
                setsidecardeviceposture.values.valueOf.append(getrawsidecardeviceposture.ah$a(Soundex.SILENT_MARKER, TokeniserState.nullChar));
            }
        }
    },
    CommentEndDash { // from class: org.jsoup.parser.TokeniserState.48
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            char ah$a = getrawsidecardeviceposture.ah$a();
            if (ah$a == 0) {
                setsidecardeviceposture.values(this);
                StringBuilder sb = setsidecardeviceposture.values.valueOf;
                sb.append(Soundex.SILENT_MARKER);
                sb.append(TokeniserState.replacementChar);
                setsidecardeviceposture.ag$a(Comment);
            } else if (ah$a == '-') {
                setsidecardeviceposture.ag$a(CommentEnd);
            } else if (ah$a == 65535) {
                setsidecardeviceposture.valueOf(this);
                setsidecardeviceposture.ah$b();
                setsidecardeviceposture.ag$a(Data);
            } else {
                StringBuilder sb2 = setsidecardeviceposture.values.valueOf;
                sb2.append(Soundex.SILENT_MARKER);
                sb2.append(ah$a);
                setsidecardeviceposture.ag$a(Comment);
            }
        }
    },
    CommentEnd { // from class: org.jsoup.parser.TokeniserState.49
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            char ah$a = getrawsidecardeviceposture.ah$a();
            if (ah$a == 0) {
                setsidecardeviceposture.values(this);
                StringBuilder sb = setsidecardeviceposture.values.valueOf;
                sb.append("--");
                sb.append(TokeniserState.replacementChar);
                setsidecardeviceposture.ag$a(Comment);
            } else if (ah$a == '!') {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.ag$a(CommentEndBang);
            } else if (ah$a == '-') {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.values.valueOf.append(Soundex.SILENT_MARKER);
            } else if (ah$a == '>') {
                setsidecardeviceposture.ah$b();
                setsidecardeviceposture.ag$a(Data);
            } else if (ah$a == 65535) {
                setsidecardeviceposture.valueOf(this);
                setsidecardeviceposture.ah$b();
                setsidecardeviceposture.ag$a(Data);
            } else {
                setsidecardeviceposture.values(this);
                StringBuilder sb2 = setsidecardeviceposture.values.valueOf;
                sb2.append("--");
                sb2.append(ah$a);
                setsidecardeviceposture.ag$a(Comment);
            }
        }
    },
    CommentEndBang { // from class: org.jsoup.parser.TokeniserState.50
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            char ah$a = getrawsidecardeviceposture.ah$a();
            if (ah$a == 0) {
                setsidecardeviceposture.values(this);
                StringBuilder sb = setsidecardeviceposture.values.valueOf;
                sb.append("--!");
                sb.append(TokeniserState.replacementChar);
                setsidecardeviceposture.ag$a(Comment);
            } else if (ah$a == '-') {
                setsidecardeviceposture.values.valueOf.append("--!");
                setsidecardeviceposture.ag$a(CommentEndDash);
            } else if (ah$a == '>') {
                setsidecardeviceposture.ah$b();
                setsidecardeviceposture.ag$a(Data);
            } else if (ah$a == 65535) {
                setsidecardeviceposture.valueOf(this);
                setsidecardeviceposture.ah$b();
                setsidecardeviceposture.ag$a(Data);
            } else {
                StringBuilder sb2 = setsidecardeviceposture.values.valueOf;
                sb2.append("--!");
                sb2.append(ah$a);
                setsidecardeviceposture.ag$a(Comment);
            }
        }
    },
    Doctype { // from class: org.jsoup.parser.TokeniserState.51
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            char ah$a = getrawsidecardeviceposture.ah$a();
            if (ah$a == '\t' || ah$a == '\n' || ah$a == '\f' || ah$a == '\r' || ah$a == ' ') {
                setsidecardeviceposture.ag$a(BeforeDoctypeName);
                return;
            }
            if (ah$a != '>') {
                if (ah$a == 65535) {
                    setsidecardeviceposture.valueOf(this);
                } else {
                    setsidecardeviceposture.values(this);
                    setsidecardeviceposture.ag$a(BeforeDoctypeName);
                    return;
                }
            }
            setsidecardeviceposture.values(this);
            setsidecardeviceposture.ag$a();
            setsidecardeviceposture.ag$a.ah$a = true;
            setsidecardeviceposture.HaptikSDK$b();
            setsidecardeviceposture.ag$a(Data);
        }
    },
    BeforeDoctypeName { // from class: org.jsoup.parser.TokeniserState.52
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            if (getrawsidecardeviceposture.HaptikSDK$d()) {
                setsidecardeviceposture.ag$a();
                setsidecardeviceposture.ag$a(DoctypeName);
                return;
            }
            char ah$a = getrawsidecardeviceposture.ah$a();
            if (ah$a == 0) {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.ag$a();
                setsidecardeviceposture.ag$a.values.append(TokeniserState.replacementChar);
                setsidecardeviceposture.ag$a(DoctypeName);
            } else if (ah$a != ' ') {
                if (ah$a == 65535) {
                    setsidecardeviceposture.valueOf(this);
                    setsidecardeviceposture.ag$a();
                    setsidecardeviceposture.ag$a.ah$a = true;
                    setsidecardeviceposture.HaptikSDK$b();
                    setsidecardeviceposture.ag$a(Data);
                } else if (ah$a == '\t' || ah$a == '\n' || ah$a == '\f' || ah$a == '\r') {
                } else {
                    setsidecardeviceposture.ag$a();
                    setsidecardeviceposture.ag$a.values.append(ah$a);
                    setsidecardeviceposture.ag$a(DoctypeName);
                }
            }
        }
    },
    DoctypeName { // from class: org.jsoup.parser.TokeniserState.53
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            if (getrawsidecardeviceposture.HaptikSDK$d()) {
                setsidecardeviceposture.ag$a.values.append(getrawsidecardeviceposture.HaptikSDK$c());
                return;
            }
            char ah$a = getrawsidecardeviceposture.ah$a();
            if (ah$a != 0) {
                if (ah$a != ' ') {
                    if (ah$a == '>') {
                        setsidecardeviceposture.HaptikSDK$b();
                        setsidecardeviceposture.ag$a(Data);
                        return;
                    } else if (ah$a == 65535) {
                        setsidecardeviceposture.valueOf(this);
                        setsidecardeviceposture.ag$a.ah$a = true;
                        setsidecardeviceposture.HaptikSDK$b();
                        setsidecardeviceposture.ag$a(Data);
                        return;
                    } else if (ah$a != '\t' && ah$a != '\n' && ah$a != '\f' && ah$a != '\r') {
                        setsidecardeviceposture.ag$a.values.append(ah$a);
                        return;
                    }
                }
                setsidecardeviceposture.ag$a(AfterDoctypeName);
                return;
            }
            setsidecardeviceposture.values(this);
            setsidecardeviceposture.ag$a.values.append(TokeniserState.replacementChar);
        }
    },
    AfterDoctypeName { // from class: org.jsoup.parser.TokeniserState.54
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            if (getrawsidecardeviceposture.getSignupData()) {
                setsidecardeviceposture.valueOf(this);
                setsidecardeviceposture.ag$a.ah$a = true;
                setsidecardeviceposture.HaptikSDK$b();
                setsidecardeviceposture.ag$a(Data);
            } else if (getrawsidecardeviceposture.values('\t', '\n', TokenParser.CR, '\f', TokenParser.SP)) {
                getrawsidecardeviceposture.ag$a();
            } else if (getrawsidecardeviceposture.valueOf('>')) {
                setsidecardeviceposture.HaptikSDK$b();
                setsidecardeviceposture.ah$a(Data);
            } else if (getrawsidecardeviceposture.ah$a("PUBLIC")) {
                setsidecardeviceposture.ag$a.toString = "PUBLIC";
                setsidecardeviceposture.ag$a(AfterDoctypePublicKeyword);
            } else if (getrawsidecardeviceposture.ah$a("SYSTEM")) {
                setsidecardeviceposture.ag$a.toString = "SYSTEM";
                setsidecardeviceposture.ag$a(AfterDoctypeSystemKeyword);
            } else {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.ag$a.ah$a = true;
                setsidecardeviceposture.ah$a(BogusDoctype);
            }
        }
    },
    AfterDoctypePublicKeyword { // from class: org.jsoup.parser.TokeniserState.55
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            char ah$a = getrawsidecardeviceposture.ah$a();
            if (ah$a == '\t' || ah$a == '\n' || ah$a == '\f' || ah$a == '\r' || ah$a == ' ') {
                setsidecardeviceposture.ag$a(BeforeDoctypePublicIdentifier);
            } else if (ah$a == '\"') {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.ag$a(DoctypePublicIdentifier_doubleQuoted);
            } else if (ah$a == '\'') {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.ag$a(DoctypePublicIdentifier_singleQuoted);
            } else if (ah$a == '>') {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.ag$a.ah$a = true;
                setsidecardeviceposture.HaptikSDK$b();
                setsidecardeviceposture.ag$a(Data);
            } else if (ah$a == 65535) {
                setsidecardeviceposture.valueOf(this);
                setsidecardeviceposture.ag$a.ah$a = true;
                setsidecardeviceposture.HaptikSDK$b();
                setsidecardeviceposture.ag$a(Data);
            } else {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.ag$a.ah$a = true;
                setsidecardeviceposture.ag$a(BogusDoctype);
            }
        }
    },
    BeforeDoctypePublicIdentifier { // from class: org.jsoup.parser.TokeniserState.56
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            char ah$a = getrawsidecardeviceposture.ah$a();
            if (ah$a == '\t' || ah$a == '\n' || ah$a == '\f' || ah$a == '\r' || ah$a == ' ') {
                return;
            }
            if (ah$a == '\"') {
                setsidecardeviceposture.ag$a(DoctypePublicIdentifier_doubleQuoted);
            } else if (ah$a == '\'') {
                setsidecardeviceposture.ag$a(DoctypePublicIdentifier_singleQuoted);
            } else if (ah$a == '>') {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.ag$a.ah$a = true;
                setsidecardeviceposture.HaptikSDK$b();
                setsidecardeviceposture.ag$a(Data);
            } else if (ah$a == 65535) {
                setsidecardeviceposture.valueOf(this);
                setsidecardeviceposture.ag$a.ah$a = true;
                setsidecardeviceposture.HaptikSDK$b();
                setsidecardeviceposture.ag$a(Data);
            } else {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.ag$a.ah$a = true;
                setsidecardeviceposture.ag$a(BogusDoctype);
            }
        }
    },
    DoctypePublicIdentifier_doubleQuoted { // from class: org.jsoup.parser.TokeniserState.57
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            char ah$a = getrawsidecardeviceposture.ah$a();
            if (ah$a == 0) {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.ag$a.valueOf.append(TokeniserState.replacementChar);
            } else if (ah$a == '\"') {
                setsidecardeviceposture.ag$a(AfterDoctypePublicIdentifier);
            } else if (ah$a == '>') {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.ag$a.ah$a = true;
                setsidecardeviceposture.HaptikSDK$b();
                setsidecardeviceposture.ag$a(Data);
            } else if (ah$a == 65535) {
                setsidecardeviceposture.valueOf(this);
                setsidecardeviceposture.ag$a.ah$a = true;
                setsidecardeviceposture.HaptikSDK$b();
                setsidecardeviceposture.ag$a(Data);
            } else {
                setsidecardeviceposture.ag$a.valueOf.append(ah$a);
            }
        }
    },
    DoctypePublicIdentifier_singleQuoted { // from class: org.jsoup.parser.TokeniserState.58
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            char ah$a = getrawsidecardeviceposture.ah$a();
            if (ah$a == 0) {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.ag$a.valueOf.append(TokeniserState.replacementChar);
            } else if (ah$a == '\'') {
                setsidecardeviceposture.ag$a(AfterDoctypePublicIdentifier);
            } else if (ah$a == '>') {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.ag$a.ah$a = true;
                setsidecardeviceposture.HaptikSDK$b();
                setsidecardeviceposture.ag$a(Data);
            } else if (ah$a == 65535) {
                setsidecardeviceposture.valueOf(this);
                setsidecardeviceposture.ag$a.ah$a = true;
                setsidecardeviceposture.HaptikSDK$b();
                setsidecardeviceposture.ag$a(Data);
            } else {
                setsidecardeviceposture.ag$a.valueOf.append(ah$a);
            }
        }
    },
    AfterDoctypePublicIdentifier { // from class: org.jsoup.parser.TokeniserState.59
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            char ah$a = getrawsidecardeviceposture.ah$a();
            if (ah$a == '\t' || ah$a == '\n' || ah$a == '\f' || ah$a == '\r' || ah$a == ' ') {
                setsidecardeviceposture.ag$a(BetweenDoctypePublicAndSystemIdentifiers);
            } else if (ah$a == '\"') {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.ag$a(DoctypeSystemIdentifier_doubleQuoted);
            } else if (ah$a == '\'') {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.ag$a(DoctypeSystemIdentifier_singleQuoted);
            } else if (ah$a == '>') {
                setsidecardeviceposture.HaptikSDK$b();
                setsidecardeviceposture.ag$a(Data);
            } else if (ah$a == 65535) {
                setsidecardeviceposture.valueOf(this);
                setsidecardeviceposture.ag$a.ah$a = true;
                setsidecardeviceposture.HaptikSDK$b();
                setsidecardeviceposture.ag$a(Data);
            } else {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.ag$a.ah$a = true;
                setsidecardeviceposture.ag$a(BogusDoctype);
            }
        }
    },
    BetweenDoctypePublicAndSystemIdentifiers { // from class: org.jsoup.parser.TokeniserState.60
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            char ah$a = getrawsidecardeviceposture.ah$a();
            if (ah$a == '\t' || ah$a == '\n' || ah$a == '\f' || ah$a == '\r' || ah$a == ' ') {
                return;
            }
            if (ah$a == '\"') {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.ag$a(DoctypeSystemIdentifier_doubleQuoted);
            } else if (ah$a == '\'') {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.ag$a(DoctypeSystemIdentifier_singleQuoted);
            } else if (ah$a == '>') {
                setsidecardeviceposture.HaptikSDK$b();
                setsidecardeviceposture.ag$a(Data);
            } else if (ah$a == 65535) {
                setsidecardeviceposture.valueOf(this);
                setsidecardeviceposture.ag$a.ah$a = true;
                setsidecardeviceposture.HaptikSDK$b();
                setsidecardeviceposture.ag$a(Data);
            } else {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.ag$a.ah$a = true;
                setsidecardeviceposture.ag$a(BogusDoctype);
            }
        }
    },
    AfterDoctypeSystemKeyword { // from class: org.jsoup.parser.TokeniserState.61
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            char ah$a = getrawsidecardeviceposture.ah$a();
            if (ah$a == '\t' || ah$a == '\n' || ah$a == '\f' || ah$a == '\r' || ah$a == ' ') {
                setsidecardeviceposture.ag$a(BeforeDoctypeSystemIdentifier);
            } else if (ah$a == '\"') {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.ag$a(DoctypeSystemIdentifier_doubleQuoted);
            } else if (ah$a == '\'') {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.ag$a(DoctypeSystemIdentifier_singleQuoted);
            } else if (ah$a == '>') {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.ag$a.ah$a = true;
                setsidecardeviceposture.HaptikSDK$b();
                setsidecardeviceposture.ag$a(Data);
            } else if (ah$a == 65535) {
                setsidecardeviceposture.valueOf(this);
                setsidecardeviceposture.ag$a.ah$a = true;
                setsidecardeviceposture.HaptikSDK$b();
                setsidecardeviceposture.ag$a(Data);
            } else {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.ag$a.ah$a = true;
                setsidecardeviceposture.HaptikSDK$b();
            }
        }
    },
    BeforeDoctypeSystemIdentifier { // from class: org.jsoup.parser.TokeniserState.62
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            char ah$a = getrawsidecardeviceposture.ah$a();
            if (ah$a == '\t' || ah$a == '\n' || ah$a == '\f' || ah$a == '\r' || ah$a == ' ') {
                return;
            }
            if (ah$a == '\"') {
                setsidecardeviceposture.ag$a(DoctypeSystemIdentifier_doubleQuoted);
            } else if (ah$a == '\'') {
                setsidecardeviceposture.ag$a(DoctypeSystemIdentifier_singleQuoted);
            } else if (ah$a == '>') {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.ag$a.ah$a = true;
                setsidecardeviceposture.HaptikSDK$b();
                setsidecardeviceposture.ag$a(Data);
            } else if (ah$a == 65535) {
                setsidecardeviceposture.valueOf(this);
                setsidecardeviceposture.ag$a.ah$a = true;
                setsidecardeviceposture.HaptikSDK$b();
                setsidecardeviceposture.ag$a(Data);
            } else {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.ag$a.ah$a = true;
                setsidecardeviceposture.ag$a(BogusDoctype);
            }
        }
    },
    DoctypeSystemIdentifier_doubleQuoted { // from class: org.jsoup.parser.TokeniserState.63
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            char ah$a = getrawsidecardeviceposture.ah$a();
            if (ah$a == 0) {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.ag$a.ah$b.append(TokeniserState.replacementChar);
            } else if (ah$a == '\"') {
                setsidecardeviceposture.ag$a(AfterDoctypeSystemIdentifier);
            } else if (ah$a == '>') {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.ag$a.ah$a = true;
                setsidecardeviceposture.HaptikSDK$b();
                setsidecardeviceposture.ag$a(Data);
            } else if (ah$a == 65535) {
                setsidecardeviceposture.valueOf(this);
                setsidecardeviceposture.ag$a.ah$a = true;
                setsidecardeviceposture.HaptikSDK$b();
                setsidecardeviceposture.ag$a(Data);
            } else {
                setsidecardeviceposture.ag$a.ah$b.append(ah$a);
            }
        }
    },
    DoctypeSystemIdentifier_singleQuoted { // from class: org.jsoup.parser.TokeniserState.64
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            char ah$a = getrawsidecardeviceposture.ah$a();
            if (ah$a == 0) {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.ag$a.ah$b.append(TokeniserState.replacementChar);
            } else if (ah$a == '\'') {
                setsidecardeviceposture.ag$a(AfterDoctypeSystemIdentifier);
            } else if (ah$a == '>') {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.ag$a.ah$a = true;
                setsidecardeviceposture.HaptikSDK$b();
                setsidecardeviceposture.ag$a(Data);
            } else if (ah$a == 65535) {
                setsidecardeviceposture.valueOf(this);
                setsidecardeviceposture.ag$a.ah$a = true;
                setsidecardeviceposture.HaptikSDK$b();
                setsidecardeviceposture.ag$a(Data);
            } else {
                setsidecardeviceposture.ag$a.ah$b.append(ah$a);
            }
        }
    },
    AfterDoctypeSystemIdentifier { // from class: org.jsoup.parser.TokeniserState.65
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            char ah$a = getrawsidecardeviceposture.ah$a();
            if (ah$a == '\t' || ah$a == '\n' || ah$a == '\f' || ah$a == '\r' || ah$a == ' ') {
                return;
            }
            if (ah$a == '>') {
                setsidecardeviceposture.HaptikSDK$b();
                setsidecardeviceposture.ag$a(Data);
            } else if (ah$a == 65535) {
                setsidecardeviceposture.valueOf(this);
                setsidecardeviceposture.ag$a.ah$a = true;
                setsidecardeviceposture.HaptikSDK$b();
                setsidecardeviceposture.ag$a(Data);
            } else {
                setsidecardeviceposture.values(this);
                setsidecardeviceposture.ag$a(BogusDoctype);
            }
        }
    },
    BogusDoctype { // from class: org.jsoup.parser.TokeniserState.66
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            char ah$a = getrawsidecardeviceposture.ah$a();
            if (ah$a == '>') {
                setsidecardeviceposture.HaptikSDK$b();
                setsidecardeviceposture.ag$a(Data);
            } else if (ah$a != 65535) {
            } else {
                setsidecardeviceposture.HaptikSDK$b();
                setsidecardeviceposture.ag$a(Data);
            }
        }
    },
    CdataSection { // from class: org.jsoup.parser.TokeniserState.67
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.TokeniserState
        public void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture) {
            setsidecardeviceposture.valueOf(getrawsidecardeviceposture.toString("]]>"));
            if (getrawsidecardeviceposture.valueOf("]]>") || getrawsidecardeviceposture.getSignupData()) {
                setsidecardeviceposture.ag$a(Data);
            }
        }
    };
    
    private static final char eof = 65535;
    static final char nullChar = 0;
    static final char[] attributeSingleValueCharsSorted = {nullChar, '&', '\''};
    static final char[] attributeDoubleValueCharsSorted = {nullChar, '\"', '&'};
    static final char[] attributeNameCharsSorted = {nullChar, '\t', '\n', '\f', TokenParser.CR, TokenParser.SP, '\"', '\'', '/', '<', '=', '>'};
    static final char[] attributeValueUnquoted = {nullChar, '\t', '\n', '\f', TokenParser.CR, TokenParser.SP, '\"', '&', '\'', '<', '=', '>', '`'};
    private static final char replacementChar = 65533;
    private static final String replacementStr = String.valueOf((char) replacementChar);

    public abstract void read(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void handleDataEndTag(o.setSidecarDevicePosture r3, o.getRawSidecarDevicePosture r4, org.jsoup.parser.TokeniserState r5) {
        /*
            boolean r0 = r4.HaptikSDK$d()
            if (r0 == 0) goto L15
            java.lang.String r4 = r4.HaptikSDK$c()
            org.jsoup.parser.Token$HaptikSDK$a r5 = r3.invoke
            r5.ah$a(r4)
            java.lang.StringBuilder r3 = r3.valueOf
            r3.append(r4)
            return
        L15:
            r0 = 0
            boolean r1 = r3.HaptikSDK$a()
            r2 = 1
            if (r1 == 0) goto L5e
            boolean r1 = r4.getSignupData()
            if (r1 != 0) goto L5e
            char r4 = r4.ah$a()
            r1 = 9
            if (r4 == r1) goto L58
            r1 = 10
            if (r4 == r1) goto L58
            r1 = 12
            if (r4 == r1) goto L58
            r1 = 13
            if (r4 == r1) goto L58
            r1 = 32
            if (r4 == r1) goto L58
            r1 = 47
            if (r4 == r1) goto L52
            r1 = 62
            if (r4 == r1) goto L49
            java.lang.StringBuilder r0 = r3.valueOf
            r0.append(r4)
            goto L5e
        L49:
            r3.invoke()
            org.jsoup.parser.TokeniserState r4 = org.jsoup.parser.TokeniserState.Data
            r3.ag$a(r4)
            goto L5f
        L52:
            org.jsoup.parser.TokeniserState r4 = org.jsoup.parser.TokeniserState.SelfClosingStartTag
            r3.ag$a(r4)
            goto L5f
        L58:
            org.jsoup.parser.TokeniserState r4 = org.jsoup.parser.TokeniserState.BeforeAttributeName
            r3.ag$a(r4)
            goto L5f
        L5e:
            r0 = 1
        L5f:
            if (r0 == 0) goto L7e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "</"
            r4.append(r0)
            java.lang.StringBuilder r0 = r3.valueOf
            java.lang.String r0 = r0.toString()
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.valueOf(r4)
            r3.ag$a(r5)
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.TokeniserState.handleDataEndTag(o.setSidecarDevicePosture, o.getRawSidecarDevicePosture, org.jsoup.parser.TokeniserState):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void readData(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        char HaptikWebView = getrawsidecardeviceposture.HaptikWebView();
        if (HaptikWebView == 0) {
            setsidecardeviceposture.values(tokeniserState);
            getrawsidecardeviceposture.ag$a();
            setsidecardeviceposture.valueOf(replacementChar);
        } else if (HaptikWebView == '<') {
            setsidecardeviceposture.ah$a(tokeniserState2);
        } else if (HaptikWebView == 65535) {
            setsidecardeviceposture.ah$a(new Token.valueOf());
        } else {
            setsidecardeviceposture.valueOf(getrawsidecardeviceposture.ah$a('<', nullChar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void readCharRef(setSidecarDevicePosture setsidecardeviceposture, TokeniserState tokeniserState) {
        int[] ag$a = setsidecardeviceposture.ag$a(null, false);
        if (ag$a == null) {
            setsidecardeviceposture.valueOf('&');
        } else {
            setsidecardeviceposture.ag$a(ag$a);
        }
        setsidecardeviceposture.ag$a(tokeniserState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void readEndTag(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        if (getrawsidecardeviceposture.HaptikSDK$d()) {
            setsidecardeviceposture.toString(false);
            setsidecardeviceposture.ag$a(tokeniserState);
            return;
        }
        setsidecardeviceposture.valueOf("</");
        setsidecardeviceposture.ag$a(tokeniserState2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleDataDoubleEscapeTag(setSidecarDevicePosture setsidecardeviceposture, getRawSidecarDevicePosture getrawsidecardeviceposture, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        if (getrawsidecardeviceposture.HaptikSDK$d()) {
            String HaptikSDK$c = getrawsidecardeviceposture.HaptikSDK$c();
            setsidecardeviceposture.valueOf.append(HaptikSDK$c);
            setsidecardeviceposture.valueOf(HaptikSDK$c);
            return;
        }
        char ah$a = getrawsidecardeviceposture.ah$a();
        if (ah$a == '\t' || ah$a == '\n' || ah$a == '\f' || ah$a == '\r' || ah$a == ' ' || ah$a == '/' || ah$a == '>') {
            if (setsidecardeviceposture.valueOf.toString().equals("script")) {
                setsidecardeviceposture.ag$a(tokeniserState);
            } else {
                setsidecardeviceposture.ag$a(tokeniserState2);
            }
            setsidecardeviceposture.valueOf(ah$a);
            return;
        }
        getrawsidecardeviceposture.onXdkEvent();
        setsidecardeviceposture.ag$a(tokeniserState2);
    }
}
