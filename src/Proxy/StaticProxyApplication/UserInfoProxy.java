package Proxy.StaticProxyApplication;

/**
 * 信息查询代理
 * 访问权限控制
 */
public class UserInfoProxy implements IUserInfoService{

    private IUserInfoService iUserInfoService;
    private String role;

    public UserInfoProxy(IUserInfoService iUserInfoService, String role) {
        this.iUserInfoService = iUserInfoService;
        this.role = role;
    }

    @Override
    public String getBasicInfo() {
        return  iUserInfoService.getBasicInfo();
    }

    @Override
    public String getEducationalBackground() {
        return iUserInfoService.getEducationalBackground();
    }

    @Override
    public String getAccountInfo() {
        if("1".equals(role)){
            return iUserInfoService.getAccountInfo();
        }else{
            return "********";
        }

    }
}
