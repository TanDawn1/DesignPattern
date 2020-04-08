package Proxy.StaticProxyApplication;

/**
 * 假设公司有一个用户信息检索系统，管理员可以检索用户的基本信息，教育背景，和账户信息。
 * 由于业务发展的需要，此系统要跟公司实现信息共享，需要向别的公司提供我们的接口，
 * 但是信息共享并不是全部共享，只允许别的公司查询基本信息和教育背景，
 * 而有些敏感信息账户信息不允许别的公司调用的，在这里可以设置一个代理，
 * 用于控制访问查询信息接口的权限控制,
 * 当是外部想要查询账户信息时，给你返回 "********"掩码展示。
 */
public class Client {

    public static void main(String[] args) {
        String role = "1";      //权限标识
        UserInfoServiceImpl userInfoService = new UserInfoServiceImpl();
        UserInfoProxy userInfoProxy = new UserInfoProxy(userInfoService,role);

        System.out.println(userInfoProxy.getAccountInfo()+"\n"
                +userInfoProxy.getBasicInfo()+"\n"
                +userInfoProxy.getEducationalBackground());

    }

}
