package com.google.protobuf;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import o.AutoCloser;
import o.popFromPreLayout;
/* loaded from: classes5.dex */
public interface Writer {

    /* loaded from: classes5.dex */
    public enum FieldOrder {
        ASCENDING,
        DESCENDING
    }

    void HaptikSDK$a(int i, int i2) throws IOException;

    void HaptikSDK$a(int i, List<Float> list, boolean z) throws IOException;

    void HaptikSDK$b(int i, List<Long> list, boolean z) throws IOException;

    void HaptikSDK$c(int i, List<Integer> list, boolean z) throws IOException;

    void HaptikSDK$e(int i, List<Integer> list, boolean z) throws IOException;

    void HaptikWebView(int i, List<Integer> list, boolean z) throws IOException;

    @Deprecated
    void ag$a(int i) throws IOException;

    void ag$a(int i, float f) throws IOException;

    void ag$a(int i, int i2) throws IOException;

    void ag$a(int i, long j) throws IOException;

    void ag$a(int i, List<String> list) throws IOException;

    void ag$a(int i, List<Long> list, boolean z) throws IOException;

    @Deprecated
    void ah$a(int i) throws IOException;

    void ah$a(int i, double d) throws IOException;

    void ah$a(int i, int i2) throws IOException;

    void ah$a(int i, long j) throws IOException;

    @Deprecated
    void ah$a(int i, Object obj, AutoCloser.AnonymousClass1 anonymousClass1) throws IOException;

    void ah$a(int i, List<Integer> list, boolean z) throws IOException;

    void ah$b(int i, List<Long> list, boolean z) throws IOException;

    void getInitSettings(int i, List<Long> list, boolean z) throws IOException;

    void getSignupData(int i, List<Long> list, boolean z) throws IOException;

    void invoke(int i, List<Integer> list, boolean z) throws IOException;

    void toString(int i, int i2) throws IOException;

    void toString(int i, long j) throws IOException;

    void toString(int i, ByteString byteString) throws IOException;

    void toString(int i, Object obj, AutoCloser.AnonymousClass1 anonymousClass1) throws IOException;

    void toString(int i, List<Integer> list, boolean z) throws IOException;

    void valueOf(int i, int i2) throws IOException;

    void valueOf(int i, long j) throws IOException;

    void valueOf(int i, Object obj) throws IOException;

    void valueOf(int i, String str) throws IOException;

    void valueOf(int i, List<ByteString> list) throws IOException;

    @Deprecated
    void valueOf(int i, List<?> list, AutoCloser.AnonymousClass1 anonymousClass1) throws IOException;

    void valueOf(int i, List<Double> list, boolean z) throws IOException;

    FieldOrder values();

    void values(int i, int i2) throws IOException;

    void values(int i, long j) throws IOException;

    void values(int i, List<?> list, AutoCloser.AnonymousClass1 anonymousClass1) throws IOException;

    void values(int i, List<Boolean> list, boolean z) throws IOException;

    <K, V> void values(int i, popFromPreLayout.toString<K, V> tostring, Map<K, V> map) throws IOException;

    void values(int i, boolean z) throws IOException;
}
