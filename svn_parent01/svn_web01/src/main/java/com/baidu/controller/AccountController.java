package com.baidu.controller;

import com.baidu.domain.Account;
import com.baidu.entity.Result;
import com.baidu.exception.WeiZhiException;
import com.baidu.exception.WuXiaoException;
import com.baidu.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/saveAccount")
    public
    @ResponseBody Result saveAccount(Account account) {
        Result result = null;
        try {
            if ("".equals(account.getAccountName()) || account.getAccountMoney() == null) {
                throw new WuXiaoException("保存的数据无效");
            }
        } catch (WuXiaoException wx) {

            return result = new Result(false, wx.getStr());
        }
        try {
            accountService.saveAccount(account);
        } catch (WeiZhiException wz) {
            return result = new Result(false, wz.getStr());
        }
        return result = new Result(false, "成功");
    }

    @RequestMapping("/findAll_1")
    public String findAll_1(Model model) {
        List<Account> accounts = accountService.findAll();
        model.addAttribute("accounts", accounts);
        return "list";
    }

    @RequestMapping("/findAll_2")
    public ModelAndView findAll_2() {
        ModelAndView mv = new ModelAndView();
        List<Account> accounts = accountService.findAll();
        mv.addObject("accounts", accounts);
        mv.setViewName("list");
        return mv;
    }
}
