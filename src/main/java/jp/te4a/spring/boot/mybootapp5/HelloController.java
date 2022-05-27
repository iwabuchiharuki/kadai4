package jp.te4a.spring.boot.myapp4;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//view使うために@RestControllerを@Controller
@Controller
public class HelloController {
	
	@RequestMapping(value="/post", method=RequestMethod.POST)
	public ModelAndView postForm(@RequestParam("text1") String text1) {
	    ModelAndView mv = new ModelAndView("index");
	    mv.addObject("msg", "you write '" + text1 + "'!!!");
	    return mv;
	}

    @RequestMapping("/")
    public String index(Model model) {
    	model.addAttribute("msg", "this is  a setting message");
        return "index";
    }
}
