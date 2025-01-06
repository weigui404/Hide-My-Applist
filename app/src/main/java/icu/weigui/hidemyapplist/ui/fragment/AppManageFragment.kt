package icu.weigui.hidemyapplist.ui.fragment

import android.os.Bundle
import com.google.android.material.transition.MaterialSharedAxis
import com.weigui.hidemyapplist.R
import icu.weigui.hidemyapplist.service.ConfigManager
import icu.weigui.hidemyapplist.ui.adapter.AppManageAdapter
import icu.weigui.hidemyapplist.ui.util.navController

class AppManageFragment : AppSelectFragment() {

    override val firstComparator: Comparator<String> = Comparator.comparing(ConfigManager::isHideEnabled).reversed()

    override val adapter = AppManageAdapter {
        val args = AppSettingsFragmentArgs(it)
        navController.navigate(R.id.nav_app_settings, args.toBundle())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enterTransition = MaterialSharedAxis(MaterialSharedAxis.Z, true)
        returnTransition = MaterialSharedAxis(MaterialSharedAxis.Z, false)
    }
}
