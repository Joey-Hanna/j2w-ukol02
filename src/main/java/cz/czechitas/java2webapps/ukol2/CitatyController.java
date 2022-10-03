package cz.czechitas.java2webapps.ukol2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Random;





@Controller
public class CitatyController {

    private static final List<String> citaty = List.of(
            "Debugging /de·bugh·ing/ (verb): The Classic Mystery Game where you are the detective, the victim, and the murderer.",
            "A user interface is like a joke. If you have to explain it, it's not that good.",
            "To replace programmers with robots, clients will have to accurately describe what they want. We're safe.",
            "I have a joke on programming, but it only works on my computer.",
            "99 little bugs in the code, 99 bugs in the code. Take one down, patch it around. 127 little bugs in the code…",
            "When I wrote this code, only God & I understood what it did. Now… Only God knows.",
            "Programmer (noun.): A machine that turns coffee into code.",
            "Real programmers count from 0.");

    /*private static final List<String> obrazky = List.of(
            "https://source.unsplash.com/Lc2R_w0zvtA/1600x900",
            "https://source.unsplash.com/oTcaW8Pqv3U/1600x900"
    );*/


    int rozmerSeznamuCitaty = citaty.size();
  /*  int rozmerSeznamuObrazky = obrazky.size();*/

    private final Random random = new Random();

    @GetMapping("/")
    public ModelAndView citatyObrazky() {
        String nahodnyCitat = citaty.get(random.nextInt(rozmerSeznamuCitaty));
        int nahodnyObrazek = random.nextInt(7) + 1;

        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("citaty", nahodnyCitat);
        modelAndView.addObject("obrazky", nahodnyObrazek);

        return modelAndView;
    }

   /* public ModelAndView obrazky() {
        String nahodnyObrazek = obrazky.get(random.nextInt(rozmerSeznamuObrazky) +1);

        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("obrazky", nahodnyObrazek);
        return modelAndView;
    }*/


    /*private ModelAndView obrazky() {
        int nahodnyObrazek = random.nextInt(7) + 1;

        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("obrazek", nahodnyObrazek);
        return modelAndView;

    }*/





}
