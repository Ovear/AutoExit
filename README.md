# AutoExit
An android app will start when boot and exit after 1s. Develop for Redmi K40 to enable DC dimming automatically.

一款会在开机时自动启动，并在1秒后退出的Android应用。为实现红米K40开机自动开启DC调光而开发。

## 开发初衷/Purpose
由于OLED屏幕刷新低频频闪的特性，部分眼镜较敏感的用户（比如开发者）在使用过程中，会产生不适，且长期受到低频频闪很可能会伤害到眼睛，所以大部分厂商（不含三星）在意识到这个问题后，为OLED屏幕的手机开发了DC调光模式（低/防频闪模式）。

但是由于一些原因，红米K40默认没有装配该功能，在大量用户投诉后，MIUI开发团队为K40加上了这一功能。但是该功能默认隐藏，需要使用特殊方法开启，且重启后就会失效。在MIUI论坛中有大量用户对该问题进行反馈，但是官方一直没有正面回应并修复该BUG，这并不是一种对用户（健康）负责的态度。

综上所述，红米K40自动开启DC调光一直是非常困难的，利用MIUI“自动任务”本应该可以完成该任务，但是很可惜目前版本的“自动任务”并不能实现。所以便开发了本款APP配合MIUI“自动任务”使用，可以达到相对完美的自动开启DC调光。

## 前提条件/Prerequisite
* MIUI 13
* 带有新版“自动任务”的“MIUI安全中心”（如果没有可以[点击这里下载](https://github.com/ovear/AutoExit/raw/main/binary/%E6%89%8B%E6%9C%BA%E7%AE%A1%E5%AE%B6_MIUISecurityCenter(6.0.2-220117.0.1).apk)）
* AutoExit([点击这里下载](https://github.com/ovear/AutoExit/releases/download/v1.0/autoexit.v1.0.apk))

## 使用教程/Usage
通过AutoExit App，配合带有新版本“自动任务”的“MIUI手机管家”可以实现红米K40全自动开启DC调光。

1. 安装AutoExit
2. 打开AutoExit
3. 允许AutoExit自启动，并设置省电策略为“无限制”
![允许AutoExit自启动，并设置省电策略为“无限制”](https://github.com/ovear/AutoExit/raw/main/binary/step1.jpg)
4. 为AutoExit打开“后台弹出界面”和“显示悬浮窗”权限
![为AutoExit打开“后台弹出界面”和“显示悬浮窗”权限](https://github.com/ovear/AutoExit/raw/main/binary/step2.jpg)
5. 打开“MIUI安全中心”的“自动任务”
![打开“MIUI安全中心”的“自动任务”](https://github.com/ovear/AutoExit/raw/main/binary/step3.jpg)
5. 设置并开启如下两个自动任务
![设置并开启如下两个自动任务](https://github.com/ovear/AutoExit/raw/main/binary/step4.jpg)
![设置并开启如下两个自动任务](https://github.com/ovear/AutoExit/raw/main/binary/step5.jpg)
![设置并开启如下两个自动任务](https://github.com/ovear/AutoExit/raw/main/binary/step6.jpg)
6. 大功告成。

## 常见问题/FAQ
第一次开机后，等待AutoExit自动启动并退出，就会自动开启DC调光。

如果不小心提前关闭了屏幕，DC调光将不能自动开启。此时手动打开AutoExit App后，DC调光就会开启。