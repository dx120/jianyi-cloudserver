package com.example.cloudservice.controller;

import com.example.cloudservice.model.User;
import com.example.cloudservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    
    // 网站访问计数器
    private static int visitorCount = 0;

    // 登录页面
    @GetMapping("/")
    public String homePage(Model model, HttpSession session) {
        // 访问计数器增加
        visitorCount++;
        // 将计数器添加到模型
        model.addAttribute("visitorCount", visitorCount);
        
        // 获取session中的用户信息并添加到模型
        User loggedInUser = (User) session.getAttribute("loggedInUser");
        model.addAttribute("user", loggedInUser);
        
        return "index";
    }

    // 登录页面
    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    // 注册页面
    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }

    @GetMapping("/dashboard")
    public String dashboardPage(Model model, HttpSession session) {
        User loggedInUser = (User) session.getAttribute("loggedInUser");
        model.addAttribute("user", loggedInUser);
        return "dashboard";
    }

    // 活动中心主页
    @GetMapping("/activities")
    public String activitiesPage(Model model, HttpSession session) {
        User loggedInUser = (User) session.getAttribute("loggedInUser");
        model.addAttribute("user", loggedInUser);
        return "activities";
    }

    // 特惠活动页面
    @GetMapping("/activities/special-offers")
    public String specialOffersPage(Model model, HttpSession session) {
        User loggedInUser = (User) session.getAttribute("loggedInUser");
        model.addAttribute("user", loggedInUser);
        return "activities/special-offers";
    }

    // 企业专区页面
    @GetMapping("/enterprise")
    public String enterprisePage(Model model, HttpSession session) {
        User loggedInUser = (User) session.getAttribute("loggedInUser");
        model.addAttribute("user", loggedInUser);
        return "enterprise";
    }

    // 领券中心页面
    @GetMapping("/activities/coupons")
    public String couponsPage(Model model, HttpSession session) {
        User loggedInUser = (User) session.getAttribute("loggedInUser");
        model.addAttribute("user", loggedInUser);
        return "activities/coupons";
    }
    
    // 免费产品试用活动页面
    @GetMapping("/activities/free-trial")
    public String freeTrialPage(Model model, HttpSession session) {
        User loggedInUser = (User) session.getAttribute("loggedInUser");
        model.addAttribute("user", loggedInUser);
        return "activities/free-trial";
    }
    
    // 公司介绍页面
    @GetMapping("/about")
    public String aboutPage(Model model, HttpSession session) {
        User loggedInUser = (User) session.getAttribute("loggedInUser");
        model.addAttribute("user", loggedInUser);
        return "about";
    }
    
    // 服务条款页面
    @GetMapping("/terms")
    public String termsPage(Model model, HttpSession session) {
        User loggedInUser = (User) session.getAttribute("loggedInUser");
        model.addAttribute("user", loggedInUser);
        return "terms";
    }
    
    // 联系我们页面
    @GetMapping("/contact")
    public String contactPage(Model model, HttpSession session) {
        User loggedInUser = (User) session.getAttribute("loggedInUser");
        model.addAttribute("user", loggedInUser);
        return "contact";
    }
    
    // 合作伙伴页面
    @GetMapping("/partners")
    public String partnersPage(Model model, HttpSession session) {
        User loggedInUser = (User) session.getAttribute("loggedInUser");
        model.addAttribute("user", loggedInUser);
        return "partners";
    }

    // 产品总览页面
    @GetMapping("/products")
    public String productsPage(Model model, HttpSession session) {
        User loggedInUser = (User) session.getAttribute("loggedInUser");
        model.addAttribute("user", loggedInUser);
        return "products";
    }

    // 云服务器产品页面
    @GetMapping("/products/cvm")
    public String cvmPage(Model model, HttpSession session) {
        User loggedInUser = (User) session.getAttribute("loggedInUser");
        model.addAttribute("user", loggedInUser);
        return "products/cvm";
    }

    // 弹性公网IP产品页面
    @GetMapping("/products/eip")
    public String eipPage(Model model, HttpSession session) {
        User loggedInUser = (User) session.getAttribute("loggedInUser");
        model.addAttribute("user", loggedInUser);
        return "products/eip";
    }

    // 对象存储产品页面
    @GetMapping("/products/cos")
    public String cosPage(Model model, HttpSession session) {
        User loggedInUser = (User) session.getAttribute("loggedInUser");
        model.addAttribute("user", loggedInUser);
        return "products/cos";
    }

    // 网络安全产品页面
    @GetMapping("/products/security")
    public String securityPage(Model model, HttpSession session) {
        User loggedInUser = (User) session.getAttribute("loggedInUser");
        model.addAttribute("user", loggedInUser);
        return "products/security";
    }
    
    // 解决方案总览页面
    @GetMapping("/solutions")
    public String solutionsPage(Model model, HttpSession session) {
        User loggedInUser = (User) session.getAttribute("loggedInUser");
        model.addAttribute("user", loggedInUser);
        return "solutions";
    }
    
    // 金融解决方案页面
    @GetMapping("/solutions/finance")
    public String financeSolutionPage(Model model, HttpSession session) {
        User loggedInUser = (User) session.getAttribute("loggedInUser");
        model.addAttribute("user", loggedInUser);
        return "solutions/finance";
    }
    
    // 教育解决方案页面
    @GetMapping("/solutions/education")
    public String educationSolutionPage(Model model, HttpSession session) {
        User loggedInUser = (User) session.getAttribute("loggedInUser");
        model.addAttribute("user", loggedInUser);
        return "solutions/education";
    }
    
    // 游戏解决方案页面
    @GetMapping("/solutions/gaming")
    public String gamingSolutionPage(Model model, HttpSession session) {
        User loggedInUser = (User) session.getAttribute("loggedInUser");
        model.addAttribute("user", loggedInUser);
        return "solutions/gaming";
    }
    
    // 医疗解决方案页面
    @GetMapping("/solutions/healthcare")
    public String healthcareSolutionPage(Model model, HttpSession session) {
        User loggedInUser = (User) session.getAttribute("loggedInUser");
        model.addAttribute("user", loggedInUser);
        return "solutions/healthcare";
    }
    
    //开发者工具
    @GetMapping("/developer")
    public String developerPage(Model model, HttpSession session) {
        User loggedInUser = (User) session.getAttribute("loggedInUser");
        model.addAttribute("user", loggedInUser);
        return "developer";
    }
    //api工具
    @GetMapping("/developer/api")
    public String apiPage(Model model, HttpSession session) {
        User loggedInUser = (User) session.getAttribute("loggedInUser");
        model.addAttribute("user", loggedInUser);
        return "developer/api";
    }
    //sdk工具
    @GetMapping("/developer/sdk")
    public String sdkPage(Model model, HttpSession session) {
        User loggedInUser = (User) session.getAttribute("loggedInUser");
        model.addAttribute("user", loggedInUser);
        return "developer/sdk";
    }

    // 定价页面
    @GetMapping("/pricing")
    public String pricingPage(Model model, HttpSession session) {
        User loggedInUser = (User) session.getAttribute("loggedInUser");
        model.addAttribute("user", loggedInUser);
        return "pricing";
    }

    // 处理登录请求
    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model, HttpSession session) {
        try {
            User user = userService.loginUser(username, password);
            // 将用户信息存储到session
            session.setAttribute("loggedInUser", user);
            return "redirect:/"; // 登录成功后跳转到首页
        } catch (RuntimeException e) {
            model.addAttribute("error", e.getMessage());
            return "login";
        }
    }

    // 添加退出登录功能
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        // 清除session中的用户信息
        session.removeAttribute("loggedInUser");
        return "redirect:/";
    }

    // 处理注册请求
    @PostMapping("/register")
    public String register(@RequestParam String username, @RequestParam String password, @RequestParam String email) {
        try {
            User user = userService.registerUser(username, password, email);
            return "redirect:/login?success=true"; // 注册成功后跳转到登录页面并添加成功标志
        } catch (RuntimeException e) {
            return "register";
        }
    }
}