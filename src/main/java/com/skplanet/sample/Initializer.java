package com.skplanet.sample;

/**
 * Created by 1002475 on 15. 4. 27..
 */

import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;

// tag::class[]
public class Initializer
        extends AbstractHttpSessionApplicationInitializer { // <1>

    public Initializer() {

        super(Config.class); // <2>
        System.out.println("...Initializer...Initializer()");
    }
}
// end::class[]