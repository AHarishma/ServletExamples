package servlet;

import javax.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int firstNumber = Integer.parseInt(request.getParameter("FirstNumber"));
		int secondNumber = Integer.parseInt(request.getParameter("SecondNumber"));
		response.setContentType("text/html");
		String op = request.getParameter("op");
		PrintWriter out = response.getWriter();

		if (op.equals("Addition")) {
			out.println("<h4>The result is  </h4>"+ (firstNumber + secondNumber));
		} else if (op.equals("Subtraction")) {
			out.println("<h4>The result is  </h4>"+ (firstNumber - secondNumber));
		} else if (op.equals("Multiplication")) {
			out.println("<h4>The result is  </h4>"+ (firstNumber * secondNumber));
		} else {
			out.println("<h4>The result is  </h4>"+ (firstNumber / secondNumber));
		}

	}
}


//$("#employeeDetails-results").empty().append(
//"<h1>EMPLOYEE DETAILS:</h1><br>").append(
//"<h2>" + JSON.stringify(str) + "</h2>");

//var myObj=$.parseJSON(str);
//console.log(myObj);
//$.each(myObj,function(key,value){
//$("#employeeDetails-results").append(String(key)+" "+String(value)+"<br>");
//});

//ObjectWriter objectWriter = new
		// ObjectMapper().writer().withDefaultPrettyPrinter();
		// try {
		// String employeeJsonString=
		// objectWriter.writeValueAsString(employeeDatabase.getEmployeeDetails(id));
		// }
		// catch(JsonGenerationException e) {
		// e.printStackTrace();
		// }
		// catch(JsonMappingException e) {
		// e.printStackTrace();
		// }