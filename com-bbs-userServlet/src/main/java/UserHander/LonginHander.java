package UserHander;

import Bean.User;
import UserService.LongInService;

/**
 * @author zlj
 * @introduce 用户的注册控制器
 */
public class LonginHander {

    LongInService longinService ;

    private void longIn(User u ){
        int result = longinService.longIn();
        if(result>=0){
            System.out.println("登陆成功");
        }else {
            System.out.println("登陆失败");
        }
    }
}
