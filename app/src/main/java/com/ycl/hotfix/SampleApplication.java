package com.ycl.hotfix;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * Created by yanchenling on 2017/11/8.
 *
 参数1：tinkerFlags 表示Tinker支持的类型 dex only、library only or all suuport，default: TINKER_ENABLE_ALL
 参数2：delegateClassName Application代理类 这里填写你自定义的ApplicationLike
 参数3：loaderClassName Tinker的加载器，使用默认即可
 参数4：tinkerLoadVerifyFlag 加载dex或者lib是否验证md5，默认为false
 *
 */

public class SampleApplication extends TinkerApplication {

    public SampleApplication() {
        super(ShareConstants.TINKER_ENABLE_ALL, "com.ycl.hotfix.SampleApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }


}
