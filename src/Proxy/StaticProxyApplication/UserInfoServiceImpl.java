package Proxy.StaticProxyApplication;
/**
 * 查询接口实现
 */
public class UserInfoServiceImpl implements IUserInfoService {
    @Override
    public String getBasicInfo() {
        return "Basic info...";
    }

    @Override
    public String getEducationalBackground() {
        return "Educational Background...";
    }

    @Override
    public String getAccountInfo() {
        return "AccountInfo ...";
    }
}
