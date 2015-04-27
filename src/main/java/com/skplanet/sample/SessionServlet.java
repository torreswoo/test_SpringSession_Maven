package com.skplanet.sample;

/**
 * Created by 1002475 on 15. 4. 27..
 */
/*
 * Copyright 2002-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/session")
public class SessionServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("...SessionServlet...doPost()");
        String attributeName = req.getParameter("attributeName");
        String attributeValue = req.getParameter("attributeValue");

        req.getSession().setAttribute(attributeName, attributeValue);

        resp.sendRedirect(req.getContextPath() + "/test");
    }

    private static final long serialVersionUID = 2878267318695777395L;
}
// tag::end[]