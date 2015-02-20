package za.ac.cput.chapter3Final.Config;

import org.springframework.context.annotation.Bean;
import za.ac.cput.chapter3Final.SumInterface;
import za.ac.cput.chapter3Final.SumP;

/**
 * Created by student on 2015/02/20.
 */
public class AppCongfig {

    @Bean(name = "calcu")
    public SumInterface getCon()
    {
        return new SumP();
    }


}
