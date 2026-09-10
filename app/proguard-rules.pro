# BOTRADE ProGuard rules

-keepattributes *Annotation*
-keepattributes Signature
-keepattributes SourceFile,LineNumberTable

# Retrofit 2
-keepattributes Signature, InnerClasses, EnclosingMethod
-keepattributes RuntimeVisibleAnnotations, RuntimeVisibleParameterAnnotations
-keepclassmembers,allowshrinking,allowobfuscation interface * {
    @retrofit2.http.* <methods>;
}
-dontwarn retrofit2.**
-dontwarn okhttp3.**
-dontwarn okio..
-keep class com.altomedia.botrade.model.** { *; }
-keep class com.altomedia.botrade.retrofit.** { *; }

# Gson
-keep class sun.misc.Unsafe { *; }
-keep class com.google.gson.** { *; }

# ButterKnife 10
-keep class butterknife.** { *; }
-dontwarn butterknife.compiler.**
-dontwarn butterknife.**

# QRCodeReaderView
-keep class com.dlazaro66.qrcodereaderview.** { *; }
-dontwarn com.dlazaro66.qrcodereaderview.**
