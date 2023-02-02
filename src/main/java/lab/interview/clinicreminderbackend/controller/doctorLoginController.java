package lab.interview.clinicreminderbackend.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import lab.interview.clinicreminderbackend.mapper.doctorMapper;
import lab.interview.clinicreminderbackend.service.doctorLoginService;

import java.util.function.Supplier;
import java.util.logging.Logger;


@RestController
public class  doctorLoginController {
    @Autowired
    private doctorMapper doctorMapper;
    @Autowired
    private doctorLoginService loginService;
    // HelloWorld.class 就是你要打印的指定类的日志，
    // 如果你想在其它类中打印，那就把 HelloWorld.class 替换成目标类名.class 即可。
    //  Logger logger = (Logger) LoggerFactory.getLogger(LoginController.class);
    //logger.info("Hello World");
    /**
     * 登录
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/login" , consumes = "application/json")
    public Object doctorlogin(@RequestParam("id") int id, @RequestParam("password") String password) {

        //logger.info((Supplier<String>) user);
        return loginService.login(id, password);
    }
}
