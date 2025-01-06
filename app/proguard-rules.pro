# Xposed
-keepclassmembers class icu.weigui.hidemyapplist.MyApp {
    boolean isHooked;
}

# Enum class
-keepclassmembers,allowoptimization enum * {
    public static **[] values();
    public static ** valueOf(java.lang.String);
}

-keep class icu.weigui.hidemyapplist.data.UpdateData { *; }
-keep class icu.weigui.hidemyapplist.data.UpdateData$* { *; }

-keep,allowoptimization class * extends androidx.preference.PreferenceFragmentCompat
-keepclassmembers class com.weigui.hidemyapplist.databinding.**  {
    public <methods>;
}
