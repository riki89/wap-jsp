package edu.miu.cs;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name="calculatorImproved", value="/calculatorImproved")
public class CalculatorImproved extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        String s1 = request.getParameter("number5");
        String s2 = request.getParameter("number6");
        if(s1 != null && s2 != null){
            String res = (Integer.parseInt(s1) + Integer.parseInt(s2)) + "";
            String res1 = "<div><input type=\"text\"  name=\"number1\" value = \""+ s1+ "\"> + <input type=\"text\"  name=\"number2\" value = \""+s2+"\"> = <input type=\"text\"  name=\"result3\" value = \""+res+"\"></div>";
            out.println(res1);
        }
        String s3 = request.getParameter("number7");
        String s4 = request.getParameter("number8");
        if(s3 != null && s4 != null){
            String res = " "+Integer.parseInt(s3) * Integer.parseInt(s4);
            String res1 = "<div><input type=\"text\"  name=\"number3\" value = \""+ s3+ "\"> + <input type=\"text\"  name=\"number4\" value = \""+s4+"\"> = <input type=\"text\"  name=\"result3\" value = \""+res+"\"></div>";
            out.println(res1);
        }
        out.println("</body></html>");
    }
}
