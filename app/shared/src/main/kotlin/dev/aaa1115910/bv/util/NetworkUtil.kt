package dev.aaa1115910.bv.util

object NetworkUtil {
    // 个人分支改动：移除对中国大陆用户的访问限制。
    // 原实现会请求 Cloudflare cdn-cgi/trace 检测 loc == "CN"，并在大陆地区显示 RegionBlockScreen。
    // 这里直接返回 false，跳过启动时的地区检测网络请求，使应用在任何地区均可正常使用。
    @Suppress("RedundantSuspendModifier")
    suspend fun isMainlandChina() = false
}
