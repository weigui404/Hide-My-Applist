package icu.weigui.hidemyapplist.xposed.hook

interface IFrameworkHook {

    fun load()
    fun unload()
    fun onConfigChanged() {}
}
