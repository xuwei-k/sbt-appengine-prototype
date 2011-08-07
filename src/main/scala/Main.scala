package com.xuwei_k
import javax.servlet.http._

class Main extends HttpServlet{

  override def doGet(req:HttpServletRequest ,resp: HttpServletResponse ){
    resp.setContentType("text/plain");
    resp.getWriter().println("Hello, world");
  }


}

