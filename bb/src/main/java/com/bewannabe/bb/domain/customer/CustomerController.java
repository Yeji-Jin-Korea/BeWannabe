package com.bewannabe.bb.domain.customer;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @RequestMapping(value="/myPage")
    public ModelAndView myPage(HttpServletRequest request, @RequestParam String custNo) {
        ModelAndView mav = new ModelAndView("domain/customer/mypage");
        CustomerDto customer = customerService.getCustomerDtl(custNo);
        log.info(">>> myPage() customer:{}", customer);
        mav.addObject("customer", customer);
        return mav;
    }
}
