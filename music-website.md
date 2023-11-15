# [声明](https://github.com/Yin-Hongwei/music-website#声明)

**这项目我一直作为技术分享，不做收费（版权归我个人独有，大家拿来学习交流随时欢迎，拒绝商用）。希望大家可以尊重下我的劳动成果，谢谢。**

## [项目说明](https://github.com/Yin-Hongwei/music-website#项目说明)

本音乐网站的客户端和管理端使用 **Vue** 框架来实现，服务端使用 **Spring Boot + MyBatis** 来实现，数据库使用了 **MySQL**。实现思路可以看 **[这里](https://yin-hongwei.github.io/2019/03/04/music/#more)**；项目启动方法看文章末尾。

## [项目预览](https://github.com/Yin-Hongwei/music-website#项目预览)

> 前台截图预览

[![img](https://typora-1309454696.cos.ap-nanjing.myqcloud.com/Hlmove/68747470733a2f2f747661312e73696e61696d672e636e2f6c617267652f65366339643234656c79316831676a646d3878336a6a323163303075303075692e6a7067.jpeg)](https://camo.githubusercontent.com/79c077c00e2ab36ef4389dbf0cfe332b952a46bd299e892661f32132f43ba137/68747470733a2f2f747661312e73696e61696d672e636e2f6c617267652f65366339643234656c79316831676a646d3878336a6a323163303075303075692e6a7067)

[![img](https://typora-1309454696.cos.ap-nanjing.myqcloud.com/Hlmove/68747470733a2f2f747661312e73696e61696d672e636e2f6c617267652f65366339643234656c79316831676a6535356867786a323163303075306e33762e6a7067.jpeg)](https://camo.githubusercontent.com/9df87ab0ba95b218cc5724e37a7e1cd7e102340585e56164eed441362b874793/68747470733a2f2f747661312e73696e61696d672e636e2f6c617267652f65366339643234656c79316831676a6535356867786a323163303075306e33762e6a7067)

[![img](https://typora-1309454696.cos.ap-nanjing.myqcloud.com/Hlmove/68747470733a2f2f747661312e73696e61696d672e636e2f6c617267652f65366339643234656c79316831676b3566786d77786a32316330307530776d322e6a7067.jpeg)](https://camo.githubusercontent.com/e1cb7421b5b2ffb9125fdf7200d36f70d1cbeb6ba5b612ae8f1a42dfbc8b1af5/68747470733a2f2f747661312e73696e61696d672e636e2f6c617267652f65366339643234656c79316831676b3566786d77786a32316330307530776d322e6a7067)

[![img](https://typora-1309454696.cos.ap-nanjing.myqcloud.com/Hlmove/68747470733a2f2f747661312e73696e61696d672e636e2f6c617267652f65366339643234656c79316831676b357274656c676a323163303075303077372e6a7067.jpeg)](https://camo.githubusercontent.com/d0b5efe95a7d646164a2880b8f07a58ffb21e0b4a264d086e625478ca2ec927e/68747470733a2f2f747661312e73696e61696d672e636e2f6c617267652f65366339643234656c79316831676b357274656c676a323163303075303077372e6a7067)

[![img](https://typora-1309454696.cos.ap-nanjing.myqcloud.com/Hlmove/68747470733a2f2f747661312e73696e61696d672e636e2f6c617267652f65366339643234656c79316831676b3661316238776a323163303075307466322e6a7067.jpeg)](https://camo.githubusercontent.com/b8d31a1896b8dceb17ab049195c449328434d2f3d08e00294148902454218c7f/68747470733a2f2f747661312e73696e61696d672e636e2f6c617267652f65366339643234656c79316831676b3661316238776a323163303075307466322e6a7067)

[![img](https://typora-1309454696.cos.ap-nanjing.myqcloud.com/Hlmove/68747470733a2f2f747661312e73696e61696d672e636e2f6c617267652f65366339643234656c79316831676b6c36627533356a323163303075303077622e6a7067.jpeg)](https://camo.githubusercontent.com/08a633983881f4b8c0dcfc8fb02417059bb6df05d998a41a1fb04b3c55d1ac65/68747470733a2f2f747661312e73696e61696d672e636e2f6c617267652f65366339643234656c79316831676b6c36627533356a323163303075303077622e6a7067)

[![img](https://typora-1309454696.cos.ap-nanjing.myqcloud.com/Hlmove/68747470733a2f2f747661312e73696e61696d672e636e2f6c617267652f65366339643234656c79316831676b6c6e747737376a3231633030753037376a2e6a7067.jpeg)](https://camo.githubusercontent.com/7dc6e8c4b2f16247781d038961cf5695207eecd1cb95af396f7d90946ac67781/68747470733a2f2f747661312e73696e61696d672e636e2f6c617267652f65366339643234656c79316831676b6c6e747737376a3231633030753037376a2e6a7067)

[![img](https://typora-1309454696.cos.ap-nanjing.myqcloud.com/Hlmove/68747470733a2f2f747661312e73696e61696d672e636e2f6c617267652f65366339643234656c79316831676b6f6b657374626a323163303075306a75382e6a7067.jpeg)](https://camo.githubusercontent.com/b16a9623abc7071b1906380f13cf8fc6a8926fa96f2fe9a9e213e45b8d79b2f7/68747470733a2f2f747661312e73696e61696d672e636e2f6c617267652f65366339643234656c79316831676b6f6b657374626a323163303075306a75382e6a7067)

[![img](https://typora-1309454696.cos.ap-nanjing.myqcloud.com/Hlmove/68747470733a2f2f747661312e73696e61696d672e636e2f6c617267652f65366339643234656c79316831676b6e68673132736a323163303075303076342e6a7067.jpeg)](https://camo.githubusercontent.com/700fd9c7c9c9f89d8b44f1c66999345e6777bcff5b12fe474156271dad39457c/68747470733a2f2f747661312e73696e61696d672e636e2f6c617267652f65366339643234656c79316831676b6e68673132736a323163303075303076342e6a7067)

[![img](https://typora-1309454696.cos.ap-nanjing.myqcloud.com/Hlmove/68747470733a2f2f747661312e73696e61696d672e636e2f6c617267652f65366339643234656c79316831676b6e753072737a6a323163303075306a746f2e6a7067.jpeg)](https://camo.githubusercontent.com/a816f2fb3a8d40c3989bf25c33271b632652246097240d9ade7fbeac5884b195/68747470733a2f2f747661312e73696e61696d672e636e2f6c617267652f65366339643234656c79316831676b6e753072737a6a323163303075306a746f2e6a7067)

[![img](https://typora-1309454696.cos.ap-nanjing.myqcloud.com/Hlmove/68747470733a2f2f747661312e73696e61696d672e636e2f6c617267652f65366339643234656c79316831676b6f786f65686e6a3231633030753071356a2e6a7067.jpeg)](https://camo.githubusercontent.com/67c54380316d3c63106f34190201632260137b1cad7cdd3d52670526363dbae4/68747470733a2f2f747661312e73696e61696d672e636e2f6c617267652f65366339643234656c79316831676b6f786f65686e6a3231633030753071356a2e6a7067)

> 后台截图预览

[![img](https://typora-1309454696.cos.ap-nanjing.myqcloud.com/Hlmove/68747470733a2f2f747661312e73696e61696d672e636e2f6c617267652f65366339643234656c7931683135387876736476696a323163303075307769382e6a7067.jpeg)](https://camo.githubusercontent.com/9690a72eb2839515129805c1f61eefb111e3d19869ac166d4b07aff7e215f39d/68747470733a2f2f747661312e73696e61696d672e636e2f6c617267652f65366339643234656c7931683135387876736476696a323163303075307769382e6a7067)

[![img](https://typora-1309454696.cos.ap-nanjing.myqcloud.com/Hlmove/68747470733a2f2f747661312e73696e61696d672e636e2f6c617267652f65366339643234656c7931683135397830726535366a323163303075303737612e6a7067.jpeg)](https://camo.githubusercontent.com/6ae543cad2bc6331bb6926ce288e8c46bdfce13b21256e264d9dff9fdb34d191/68747470733a2f2f747661312e73696e61696d672e636e2f6c617267652f65366339643234656c7931683135397830726535366a323163303075303737612e6a7067)

[![img](https://typora-1309454696.cos.ap-nanjing.myqcloud.com/Hlmove/68747470733a2f2f747661312e73696e61696d672e636e2f6c617267652f65366339643234656c793168313539787a626938356a3231633030753077686e2e6a7067.jpeg)](https://camo.githubusercontent.com/ea00baeae951465a8aacbb91bf4cb27c807f01d6b0c98fc53f9da5726e4dad70/68747470733a2f2f747661312e73696e61696d672e636e2f6c617267652f65366339643234656c793168313539787a626938356a3231633030753077686e2e6a7067)

[![img](https://typora-1309454696.cos.ap-nanjing.myqcloud.com/Hlmove/68747470733a2f2f747661312e73696e61696d672e636e2f6c617267652f65366339643234656c7931683135397a65777368346a323163303075303739662e6a7067.jpeg)](https://camo.githubusercontent.com/ef00a1c2d5c97e679c4c690f3594e57726c67d5755d28d1b4afac8999b3bf9c2/68747470733a2f2f747661312e73696e61696d672e636e2f6c617267652f65366339643234656c7931683135397a65777368346a323163303075303739662e6a7067)

[![img](https://typora-1309454696.cos.ap-nanjing.myqcloud.com/Hlmove/68747470733a2f2f747661312e73696e61696d672e636e2f6c617267652f65366339643234656c793168313539797a357838686a3231633030753077696e2e6a7067.jpeg)](https://camo.githubusercontent.com/a899aa5c0759b2651213ce37af771379edccb35cafd073ed03a1bae1ef7b1b01/68747470733a2f2f747661312e73696e61696d672e636e2f6c617267652f65366339643234656c793168313539797a357838686a3231633030753077696e2e6a7067)

[![img](https://typora-1309454696.cos.ap-nanjing.myqcloud.com/Hlmove/68747470733a2f2f747661312e73696e61696d672e636e2f6c617267652f65366339643234656c793168313539796f326e7a6d6a32316330307530646a702e6a7067.jpeg)](https://camo.githubusercontent.com/9d803135c16ce1a2f278a49d49bc1efd7a83b71bf70de23bf34221498baeb20e/68747470733a2f2f747661312e73696e61696d672e636e2f6c617267652f65366339643234656c793168313539796f326e7a6d6a32316330307530646a702e6a7067)

## [项目功能](https://github.com/Yin-Hongwei/music-website#项目功能)

- 音乐播放
- 用户登录注册
- 用户信息编辑、头像修改
- 歌曲、歌单搜索
- 歌单打分
- 歌单、歌曲评论
- 歌单列表、歌手列表分页显示
- 歌词同步显示
- 音乐收藏、下载、拖动控制、音量控制
- 后台对用户、歌曲、歌手、歌单信息的管理

## [技术栈](https://github.com/Yin-Hongwei/music-website#技术栈)

### [后端](https://github.com/Yin-Hongwei/music-website#后端)

**SpringBoot + MyBatis + Redis**

### [前端](https://github.com/Yin-Hongwei/music-website#前端)

**Vue3.0 + TypeScript + Vue-Router + Vuex + Axios + ElementPlus + Echarts**

## [开发环境](https://github.com/Yin-Hongwei/music-website#开发环境)

JDK： jdk-8u141

mysql：mysql-5.7.21-1-macos10.13-x86_64（或者更高版本）

redis：5.0.8

node：14.17.3

IDE：IntelliJ IDEA 2018、VSCode

## [下载运行](https://github.com/Yin-Hongwei/music-website#下载运行)

### [1、下载项目到本地](https://github.com/Yin-Hongwei/music-website#1下载项目到本地)

```
git clone git@github.com:Yin-Hongwei/music-website.git

# 上面下载慢可以用下面这个
git clone git@gitee.com:Yin-hongwei/music-website.git
```



> **如果你想使用 vue2.0 的版本，在下载代码后，可以切到 vue@2.0 的分支，默认是使用的vue3.0。**

### [2、下载数据库中记录的资源](https://github.com/Yin-Hongwei/music-website#2下载数据库中记录的资源)

去【链接: https://pan.baidu.com/s/1Qv0ohAIPeTthPK_CDwpfWg 提取码: gwa4 】下载网站依赖的歌曲及图片，将 data 夹里的文件放到 music-server 文件夹下。

> **注意：资源整理了一下，按照下面的截图存放。**

[![img](https://typora-1309454696.cos.ap-nanjing.myqcloud.com/Hlmove/68747470733a2f2f747661312e73696e61696d672e636e2f6c617267652f65366339643234656c79316836677a316c653977786a3230666f306767676d682e6a7067.jpeg)](https://camo.githubusercontent.com/cb20ce2fdb9f0fd3d228c03b4d3774f6fd010bf68c4df86d63bee9592d198dad/68747470733a2f2f747661312e73696e61696d672e636e2f6c617267652f65366339643234656c79316836677a316c653977786a3230666f306767676d682e6a7067)

### [3、修改配置文件](https://github.com/Yin-Hongwei/music-website#3修改配置文件)

1）创建数据库 将 `music-website/music-server/sql` 文件夹中的 `tp_music.sql` 文件导入数据库。

2）修改用户名密码 修改 `music-website/music-server/src/main/resources/application.properties` 文件里的 `spring.datasource.username` 和 `spring.datasource.password`；

### [4、启动项目](https://github.com/Yin-Hongwei/music-website#4启动项目)

- **启动管理端**：进入 music-server 文件夹，运行下面命令启动服务器

```
// 方法一
./mvnw spring-boot:run

// 方法二
mvn spring-boot:run // 前提装了 maven
```



- **启动 redis**：直接在终端输入下面命令

```
redis-server
```



> 下载地址：https://redis.io/
>
> Mac 安装使用示例：https://www.jianshu.com/p/ce27d9ab4f8c

- **启动客户端**：进入 music-client 目录，运行下面命令

```
npm install // 安装依赖

npm run serve // 启动前台项目
```



- **启动管理端**：进入 music-manage 目录，运行下面命令

```
npm install // 安装依赖

npm run serve // 启动后台管理项目
```



### [5、常见问题](https://github.com/Yin-Hongwei/music-website#5常见问题)

常见启动问题整理如下

[#182](https://github.com/Yin-Hongwei/music-website/discussions/182)

## [赞助](https://github.com/Yin-Hongwei/music-website#赞助)

如果此项目对你确实有帮助，欢迎给我打赏一杯咖啡～😄

[![img](https://typora-1309454696.cos.ap-nanjing.myqcloud.com/Hlmove/68747470733a2f2f702e697069632e7669702f766f307866792e6a7067.jpeg)](https://camo.githubusercontent.com/c4f199d1adae24009497c36ac9cfc0b55775ea4819b4adc427630b7012fa2d15/68747470733a2f2f702e697069632e7669702f766f307866792e6a7067)

## [联系方式](https://github.com/Yin-Hongwei/music-website#联系方式)

**1、邮箱📮：[yinhongwei96@126.com](mailto:yinhongwei96@126.com)**

**2、微信公众号**

> **目前公众号的定位主要是临时帮大家解决问题，不发表其他东西，有疑问可以临时联系。**

[![img](https://camo.githubusercontent.com/4b04c1c4a563bf8a832a18e7afea6201d086db8514ac08c08fb630c984d68894/68747470733a2f2f702e697069632e7669702f317878396d642e706e67)](https://camo.githubusercontent.com/4b04c1c4a563bf8a832a18e7afea6201d086db8514ac08c08fb630c984d68894/68747470733a2f2f702e697069632e7669702f317878396d642e706e67)

## [License](https://github.com/Yin-Hongwei/music-website#license)

Copyright (c) 2018 Yin-Hongwei
